package ua.edu.ua.demo.items;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public abstract class Item {
    protected String description;

    public abstract double price();
}
