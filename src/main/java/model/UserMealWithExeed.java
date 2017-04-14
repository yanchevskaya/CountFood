package model;

import java.time.LocalDateTime;

public class UserMealWithExeed {

    protected final LocalDateTime dateTime;
    protected final String description;
    protected final int calories;
    protected final boolean exceed;

    public UserMealWithExeed (LocalDateTime dateTime, String description, int calories, boolean exceed){
        this.dateTime = dateTime;
        this.description = description;
        this.calories = calories;
        this.exceed = exceed;
    }

    public LocalDateTime getDateTime(){
        return dateTime;
    }

    public String getDescription(){
        return description;
    }

    public int getCalories(){
        return calories;
    }
}
}
