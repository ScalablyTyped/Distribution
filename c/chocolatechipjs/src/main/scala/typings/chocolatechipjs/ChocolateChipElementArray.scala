package typings.chocolatechipjs

import typings.std.Array
import typings.std.Event
import typings.std.HTMLElement
import typings.std.Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for ChocolateChipJS Element Collections.
  */
@js.native
trait ChocolateChipElementArray extends Array[HTMLElement] {
  /**
    * Adds the specified class(es) to each of the set of matched elements.
    *
    * @param className One or more space-separated classes to be added to the class attribute of each matched element.
    */
  def addClass(className: String): ChocolateChipElementArray = js.native
  def after(content: String): ChocolateChipElementArray = js.native
  /**
    * Insert content, specified by the parameter, after each element in the set of matched elements.
    *
    * @param content HTML string, DOM element, array of elements to insert after each element in the set of matched elements.
    */
  def after(content: ChocolateChipElementArray): ChocolateChipElementArray = js.native
  def after(content: HTMLElement): ChocolateChipElementArray = js.native
  /**
    * For each element in the set, get the first element that matches the selector by testing the element
    * itself and traversing up through its ancestors in the DOM tree, or, if a number is provided,
    * retrieving that ancestor based on its distance from the element.
    *
    * @param selector A string containing a selector expression to match elements against.
    */
  def ancestor(selector: String): ChocolateChipElementArray = js.native
  def ancestor(selector: Double): ChocolateChipElementArray = js.native
  /**
    * A method to animate DOM nodes using CSS. This uses CSS transitions.
    *
    * @param options And object of key value pairs define the CSS properties and values to animate.
    * @param duration A string representing the time. Should have a time identifier: "200s", "200ms", etc.
    * @param easing A string indicating the easing for the animation, such as "ease-out", "ease-in", "ease-in-out".
    */
  def animate(options: js.Object): Unit = js.native
  def animate(options: js.Object, duration: String): Unit = js.native
  def animate(options: js.Object, duration: String, easing: String): Unit = js.native
  def append(content: String): ChocolateChipElementArray = js.native
  /**
    * Insert content, specified by the parameter, to the end of each element in the set of matched elements.
    *
    * @param content DOM element, array of elements, or HTML string to insert at the end of each element in the set
    * of matched elements.
    */
  def append(content: ChocolateChipElementArray): ChocolateChipElementArray = js.native
  def append(content: HTMLElement): ChocolateChipElementArray = js.native
  def append(content: Text): ChocolateChipElementArray = js.native
  def appendTo(target: String): ChocolateChipElementArray = js.native
  /**
    * Insert every element in the set of matched elements to the end of the target.
    *
    * @param target A selector, element, or HTML string. The matched set of elements will be inserted at the end of the element specified by this parameter.
    * If no position value is provided it will simply append the content to the target.
    */
  def appendTo(target: js.Array[_]): ChocolateChipElementArray = js.native
  def appendTo(target: HTMLElement): ChocolateChipElementArray = js.native
  /**
    * Get the value of an attribute for the first element in the set of matched elements.
    *
    * @param attributeName The name of the attribute to get.
    * @return string
    */
  def attr(attributeName: String): String = js.native
  /**
    * Set an attribute for the set of matched elements.
    *
    * @param attributeName A string indicating the attribute to set.
    * @param value A string indicating the value to set the attribute to.
    */
  def attr(attributeName: String, value: String): ChocolateChipElementArray = js.native
  def before(content: String): ChocolateChipElementArray = js.native
  /**
    * Insert content, specified by the parameter, before each element in the set of matched elements.
    *
    * @param content HTML string, DOM element, array of elements to insert before each element in the set of matched elements.
    */
  def before(content: ChocolateChipElementArray): ChocolateChipElementArray = js.native
  def before(content: HTMLElement): ChocolateChipElementArray = js.native
  /**
    * Attach a handler to an event for the elements.
    *
    * @param eventType A string containing one or more DOM event types, such as "click" or "submit," or custom event names.
    * @param handler A function to execute each time the event is triggered.
    * @param useCapture Setting the third argument to true will trigger event bubbling. The default is false.
    */
  def bind(eventType: String, handler: js.Function1[/* eventObject */ Event, _]): ChocolateChipStatic = js.native
  def bind(eventType: String, handler: js.Function1[/* eventObject */ Event, _], useCapture: Boolean): ChocolateChipStatic = js.native
  /**
    * Get the children of each element in the set of matched elements, optionally filtered by a selector.
    *
    * @param selector A string containing a selector expression to match elements against.
    */
  def children(): ChocolateChipElementArray = js.native
  def children(selector: String): ChocolateChipElementArray = js.native
  def clone(value: Boolean): ChocolateChipElementArray = js.native
  /**
    * For each element in the set, get the first element that matches the selector by testing the element
    * itself and traversing up through its ancestors in the DOM tree.
    *
    * @param selector A string containing a selector expression to match elements against.
    */
  def closest(selector: String): ChocolateChipElementArray = js.native
  def closest(selector: Double): ChocolateChipElementArray = js.native
  /**
    * Set one or more CSS properties for the set of matched elements.
    *
    * @param properties An object of property-value pairs to set.
    */
  def css(properties: js.Object): ChocolateChipElementArray = js.native
  /**
    * Get the value of style properties for the first element in the set of matched elements.
    *
    * @param propertyName A CSS property.
    */
  def css(propertyName: String): String = js.native
  /**
    * Set one or more CSS properties for the set of matched elements using a quoted string.
    *
    * @param propertyName A CSS property name.
    * @param value A value to set for the property.
    */
  def css(propertyName: String, value: String): ChocolateChipElementArray = js.native
  /**
    * Store arbitrary data associated with the matched element.
    *
    * @param key A string naming the piece of data to set.
    * @param value The new data value; it can be any Javascript type including Array or Object.
    */
  def data(key: String): ChocolateChipElementArray = js.native
  /**
    * Store arbitrary data associated with the matched elements.
    *
    * @param key A string naming the piece of data to set.
    * @param value The new data value; it can be any Javascript type including Array or Object.
    */
  def data(key: String, value: js.Any): ChocolateChipElementArray = js.native
  /**
    * Return the value at the named data store for the first element in the element collection, as set by
    * data(name).
    *
    * @param key Name of the data stored.
    */
  @JSName("data")
  def data_Any(key: String): js.Any = js.native
  /**
    * Retrieve a dataset key's value for the first element in the element collection.
    *
    * @param key A string naming the piece of data to set.
    */
  def dataset(key: String): ChocolateChipElementArray = js.native
  /**
    * Store string data associated with the matched elements.
    *
    * @param key A string naming the piece of data to set.
    * @param value The new data value; it must be a string. You can convert JSON into a string to use with this.
    */
  def dataset(key: String, value: js.Any): ChocolateChipElementArray = js.native
  /**
    * Add a delegated event to listen for the provided event on the descendant elements.
    *
    * @param selector A string defining the descendant elements to listen on for the designated event.
    * @param eventType A string containing one or more DOM event types, such as "click" or "submit," or custom event names.
    * @param handler A function to execute each time the event is triggered. The keyword "this" will refer
    * to the element receiving the event.
    * @param useCapture Setting the third argument to true will trigger event bubbling. The default is false.
    */
  def delegate(selector: js.Any, eventType: String, handler: js.Function1[/* eventObject */ Event, _]): ChocolateChipStatic = js.native
  def delegate(
    selector: js.Any,
    eventType: String,
    handler: js.Function1[/* eventObject */ Event, _],
    useCapture: Boolean
  ): ChocolateChipStatic = js.native
  /**
    * Set the property of an element to "disabled".
    */
  def disable(): ChocolateChipElementArray = js.native
  /**
    * Iterate over an Array object, executing a function for each matched element.
    */
  def each(func: js.Function2[/* ctx */ js.Any, /* idx */ Double, Unit]): Unit = js.native
  /**
    * Remove all child nodes of the set of matched elements from the DOM.
    */
  def empty(): ChocolateChipElementArray = js.native
  /**
    * Set the property of an element to enabled by removing the "disabled" attribute.
    */
  def enable(): ChocolateChipElementArray = js.native
  /**
    * This method returns the element at the position in the array indicated by the argument. This is a zero-based number.
    * When dealing with document nodes, this allows you to cherry pick a node from its collection based on its
    * position amongst its siblings.
    *
    * @param index Value indicating the node you wish to access from a collection. This is zero-based.
    */
  def eq(index: Double): ChocolateChipElementArray = js.native
  /**
    * Get the descendants of each element in the current set of matched elements, filtered by a selector or element.
    *
    * @param element An element to match elements against.
    */
  def find(element: HTMLElement): ChocolateChipElementArray = js.native
  /**
    * Get the descendants of each element in the current set of matched elements, filtered by a selector or element.
    *
    * @param selector A string containing a selector expression to match elements against.
    */
  def find(selector: String): ChocolateChipElementArray = js.native
  /**
    * Reduce the set of matched elements to the first in the set.
    */
  def first(): ChocolateChipElementArray = js.native
  /**
    * Reduce the set of matched elements to those that have a descendant that matches the selector or DOM element.
    *
    * @param contained A DOM element to match elements against.
    */
  def has(contained: HTMLElement): ChocolateChipElementArray = js.native
  /**
    * Reduce the set of matched elements to those that have a descendant that matches the selector or DOM element.
    *
    * @param selector A string containing a selector expression to match elements against.
    */
  def has(selector: String): ChocolateChipElementArray = js.native
  /**
    * Return any of the matched elements that have the given attribute.
    *
    * @param className The class name to search for.
    */
  def hasAttr(attributeName: String): ChocolateChipElementArray = js.native
  /**
    * Return any of the matched elements that have the given class.
    *
    * @param className The class name to search for.
    */
  def hasClass(className: String): ChocolateChipElementArray = js.native
  /**
    * Reduce the set of matched elements to those that have a descendant that does not match the selector or DOM element.
    *
    * @param contained A DOM element to match elements against.
    */
  def hasnt(contained: HTMLElement): ChocolateChipElementArray = js.native
  /**
    * Reduce the set of matched elements to those that have a descendant that does not match the selector or DOM element.
    *
    * @param selector A string containing a selector expression to match elements against.
    * @ return HTMLElement[]
    */
  def hasnt(selector: String): ChocolateChipElementArray = js.native
  /**
    * Get the current computed height for the first element in the set of matched elements,
    * including padding but excluding borders.
    */
  def height(): Double = js.native
  /**
    * Hide the matched elements.
    *
    * @param duration A string or number determining how long the animation will run.
    * @param callback A function to call once the animation is complete.
    */
  def hide(): ChocolateChipElementArray = js.native
  def hide(duration: String): ChocolateChipElementArray = js.native
  def hide(duration: String, callback: js.Function): ChocolateChipElementArray = js.native
  def hide(duration: Double): ChocolateChipElementArray = js.native
  def hide(duration: Double, callback: js.Function): ChocolateChipElementArray = js.native
  /**
    * Get the HTML contents of the first element in the set of matched elements.
    */
  def html(): ChocolateChipElementArray = js.native
  /**
    * Set the HTML contents of each element in the set of matched elements.
    *
    * @param htmlString A string of HTML to set as the content of each matched element.
    */
  def html(htmlString: String): ChocolateChipElementArray = js.native
  /**
    * Search for a given element from among the matched elements on a collection.
    * This method returns the index value as an integer.
    */
  def index(): Double = js.native
  /**
    * Search for a given element from among the matched elements on a collection.
    * This method returns the index value as an integer.
    *
    * @param selector A selector representing an element to look for in a collection of elements.
    */
  def index(selector: String): Double = js.native
  def index(selector: js.Array[HTMLElement]): Double = js.native
  /**
    * Insert element(s) into the target element.
    */
  def insert(content: String): ChocolateChipElementArray = js.native
  def insert(content: String, position: String): ChocolateChipElementArray = js.native
  def insert(content: String, position: Double): ChocolateChipElementArray = js.native
  /**
    * Check the current matched set of elements against a selector or element and return it
    * if it matches the given arguments.
    *
    * @param elements One or more elements to match the current set of elements against.
    */
  def is(element: js.Any): ChocolateChipElementArray = js.native
  /**
    * Check the current matched set of elements against a selector or element and return it
    * if it matches the given arguments.
    *
    * @param selector A string containing a selector expression to match elements against.
    */
  def is(selector: String): ChocolateChipElementArray = js.native
  /**
    * Check the current matched set of elements against a selector or element and return it
    * if it does not match the given arguments.
    *
    * @param elements One or more elements to match the current set of elements against.
    */
  def isnt(element: js.Any): ChocolateChipElementArray = js.native
  /**
    * Check the current matched set of elements against a selector or element and return it
    * if it does not match the given arguments.
    *
    * @param selector A string containing a selector expression to match elements against.
    */
  def isnt(selector: String): ChocolateChipElementArray = js.native
  /**
    * Reduce the set of matched elements to the last in the set.
    */
  def last(): ChocolateChipElementArray = js.native
  /**
    * Get the immediately following sibling of each element in the set of matched elements.
    */
  def next(): ChocolateChipElementArray = js.native
  /**
    * Remove a handler for an event from the elements. If the second argument is a selector, it tries to undelegate the event.
    * If no arugments are provided, it removes all events from the element(s).
    *
    * @param eventType A string containing one or more DOM event types, such as "click" or "submit," or custom event names.
    * @param selector A string defining the descendant elements are listening for the event.
    * @param handler A function handler assigned to this event.
    * @param useCapture Setting the third argument to true will trigger event bubbling. The default is false.
    */
  def off(): ChocolateChipStatic = js.native
  def off(eventType: String): ChocolateChipStatic = js.native
  def off(eventType: String, selector: js.Any): ChocolateChipStatic = js.native
  def off(eventType: String, selector: js.Any, handler: js.Function1[/* eventObject */ Event, _]): ChocolateChipStatic = js.native
  def off(
    eventType: String,
    selector: js.Any,
    handler: js.Function1[/* eventObject */ Event, _],
    capturePhase: Boolean
  ): ChocolateChipStatic = js.native
  /**
    * Get an object of the current coordinates of the first element in the set of matched elements, relative to the document.
    * These are: top, left, bottom and right. The values are numbers representing pixel values.
    */
  def offset(): Anon_Bottom = js.native
  /**
    * Add a handler to an event for elements. If a selector is provided as the second argument, this implements a delegated event.
    *
    * @param eventType A string containing one or more DOM event types, such as "click" or "submit," or custom event names.
    * @param selector A string defining the descendant elements are listening for the event.
    * @param handler A function handler assigned to this event.
    * @param useCapture Setting the third argument to true will trigger event bubbling. The default is false.
    */
  def on(eventType: String, selector: js.Any): ChocolateChipStatic = js.native
  def on(eventType: String, selector: js.Any, handler: js.Function1[/* eventObject */ Event, _]): ChocolateChipStatic = js.native
  def on(
    eventType: String,
    selector: js.Any,
    handler: js.Function1[/* eventObject */ Event, _],
    capturePhase: Boolean
  ): ChocolateChipStatic = js.native
  /**
    * Get the parent of each element in the current set of matched elements, optionally filtered by a selector.
    * If multiple elements have the same parent, only one instance of the parent is returned.
    *
    * @param selector A string containing a selector expression to match elements against.
    */
  def parent(): ChocolateChipElementArray = js.native
  def parent(selector: String): ChocolateChipElementArray = js.native
  def prepend(content: String): ChocolateChipElementArray = js.native
  /**
    * Insert content, specified by the parameter, at the beginning of each element in the set of matched elements.
    *
    * @param content DOM element, array of elements, or HTML string to insert at the beginning of each element in the set of matched elements.
    */
  def prepend(content: ChocolateChipElementArray): ChocolateChipElementArray = js.native
  def prepend(content: HTMLElement): ChocolateChipElementArray = js.native
  def prepend(content: Text): ChocolateChipElementArray = js.native
  def prependTo(target: String): ChocolateChipElementArray = js.native
  /**
    * Insert every element in the set of matched elements to the beginning of the target.
    *
    * @param target A selector, element, or HTML string. The matched set of elements will be inserted at the beginning of the element specified by this parameter.
    */
  def prependTo(target: js.Array[_]): ChocolateChipElementArray = js.native
  def prependTo(target: HTMLElement): ChocolateChipElementArray = js.native
  /**
    * Get the immediately preceding sibling of each element in the set of matched elements.
    */
  def prev(): ChocolateChipElementArray = js.native
  /**
    * Test whether an attribute exists on the first element in the set of matched elements. The value returned is a boolean.
    *
    * @param attributeName The name of the attribute to get.
    */
  def prop(propertyName: String): Boolean = js.native
  /**
    * Set an property for the set of matched elements.
    *
    * @param propertyName A string indicating the property to set.
    * @param value A string indicating the value to set the property to.
    */
  def prop(propertyName: String, value: js.Any): ChocolateChipElementArray = js.native
  def prop(propertyName: String, value: Boolean): ChocolateChipElementArray = js.native
  /**
    * Remove the set of matched elements from the DOM. If there are any attached events, this will remove them to prevent memory leaks.
    *
    * @param selector A selector expression that filters the set of matched elements to be removed.
    */
  def remove(): ChocolateChipElementArray = js.native
  def remove(selector: String): ChocolateChipElementArray = js.native
  /**
    * Remove an attribute from a node.
    *
    * @param attributeName A string indicating the attribute to remove.
    */
  def removeAttr(attributeName: String): ChocolateChipElementArray = js.native
  /**
    * Remove a single class or multiple classes from each element in the set of matched elements.
    *
    * @param className One or more space-separated classes to be removed from the class attribute of each matched element.
    */
  def removeClass(): ChocolateChipElementArray = js.native
  def removeClass(className: String): ChocolateChipElementArray = js.native
  /**
    * Remove the value at the named data store for the first element in the element collection, as set by data(name, value).
    *
    * @param key Name of the data stored.
    */
  def removeData(): js.Any = js.native
  def removeData(key: String): js.Any = js.native
  /**
    * Remove an element property.
    *
    * @param property The property to remove.
    */
  def removeProp(property: String): ChocolateChipElementArray = js.native
  /**
    * Display the matched elements.
    *
    * @param speed A string or number determining how long the animation will run.
    * @param callback A function to call once the animation is complete.
    */
  def show(): ChocolateChipElementArray = js.native
  def show(duration: String): ChocolateChipElementArray = js.native
  def show(duration: String, callback: js.Function): ChocolateChipElementArray = js.native
  def show(duration: Double): ChocolateChipElementArray = js.native
  def show(duration: Double, callback: js.Function): ChocolateChipElementArray = js.native
  /**
    * Get the siblings of each element in the set of matched elements, optionally filtered by a selector.
    *
    * @param selector A string containing a selector expression to match elements against.
    */
  def siblings(): ChocolateChipElementArray = js.native
  def siblings(selector: String): ChocolateChipElementArray = js.native
  /**
    * Get the combined text contents of each element in the set of matched elements, including their descendants
    */
  def text(): String = js.native
  /**
    * Set the content of each element in the set of matched elements to the specified text.
    *
    * @param text
    *        The text to set as the content of each matched element.
    *        When Number is supplied, it will be converted to a String representation.
    *        To delete text, use ChocolateChipElementArray.empty() or ChocolateChipElementArray.remove().
    */
  def text(text: String): HTMLElement = js.native
  def text(text: Double): HTMLElement = js.native
  /**
    * Add or remove a classe from each element in the set of matched elements, depending on whether the class is present or not.
    *
    * @param className One or more class names (separated by spaces) to be toggled for each element in the matched set.
    */
  def toggleClass(className: String): ChocolateChipElementArray = js.native
  def toggleClass(className: String, swtch: Boolean): ChocolateChipElementArray = js.native
  /**
    * Trigger an event on an element.
    *
    * @param eventType The event to trigger.
    */
  def trigger(eventType: String): Unit = js.native
  /**
    * Remove a handler for an event from the elements.
    *
    * @param eventType A string containing one or more DOM event types, such as "click" or "submit," or custom event names.
    * @param handler A function to execute each time the event is triggered.
    * @param useCapture Setting the third argument to true will trigger event bubbling. The default is false.
    */
  def unbind(): ChocolateChipStatic = js.native
  def unbind(eventType: String): ChocolateChipStatic = js.native
  def unbind(eventType: String, handler: js.Function1[/* eventObject */ Event, _]): ChocolateChipStatic = js.native
  def unbind(eventType: String, handler: js.Function1[/* eventObject */ Event, _], useCapture: Boolean): ChocolateChipStatic = js.native
  /**
    * Add a delegated event to listen for the provided event on the descendant elements.
    *
    * @param selector A string defining the descendant elements are listening for the event.
    * @param eventType A string containing one or more DOM event types, such as "click" or "submit," or custom event names.
    * @param handler A function handler assigned to this event.
    * @param useCapture Setting the third argument to true will trigger event bubbling. The default is false.
    */
  def undelegate(): ChocolateChipStatic = js.native
  def undelegate(selector: js.Any): ChocolateChipStatic = js.native
  def undelegate(selector: js.Any, eventType: String): ChocolateChipStatic = js.native
  def undelegate(selector: js.Any, eventType: String, handler: js.Function1[/* eventObject */ Event, _]): ChocolateChipStatic = js.native
  def undelegate(
    selector: js.Any,
    eventType: String,
    handler: js.Function1[/* eventObject */ Event, _],
    useCapture: Boolean
  ): ChocolateChipStatic = js.native
  /**
    * Sorts an array and removes duplicates before returning it.
    */
  def unique(): ChocolateChipElementArray = js.native
  /**
    * Remove the parents of the set of matched elements from the DOM, leaving the matched elements in their place.
    */
  def unwrap(): ChocolateChipElementArray = js.native
  /**
    * Get the current value of the first element in the set of matched elements.
    */
  def `val`(): js.Any = js.native
  /**
    * Set the value of each element in the set of matched elements.
    *
    * @param value A string of text or an array of strings corresponding to the value of each matched element
    * to set as selected/checked.
    */
  def `val`(value: String): ChocolateChipElementArray = js.native
  /**
    * Get the current computed width for the first element in the set of matched elements,
    * including padding but excluding borders.
    */
  def width(): Double = js.native
  /**
    * Wrap an HTML structure around each element in the set of matched elements.
    *
    * @param wrappingElement A selector or HTML string specifying the structure to wrap around the matched elements.
    */
  def wrap(wrappingElement: String): ChocolateChipElementArray = js.native
}

