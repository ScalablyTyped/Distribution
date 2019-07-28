package typings.cypress

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.cypress.ChaiNs.Assertion
import typings.std.Element
import typings.std.HTMLElement
import typings.std.Text
import typings.std.XMLHttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The chai-jquery instance members
  */
@js.native
trait ChaiJQuery
  extends /* index */ StringDictionary[js.Any]
     with /* index */ NumberDictionary[HTMLElement] {
  /**
    * The DOM node context originally passed to jQuery(); if none was passed then context will likely be the document. (DEPRECATED from v1.10)
    */
  var context: Element = js.native
  var jquery: String = js.native
  /**
    * The number of elements in the jQuery object.
    */
  var length: Double = js.native
  /**
    * A selector representing selector passed to jQuery(), if any, when creating the original set.
    * version deprecated: 1.7, removed: 1.9
    */
  var selector: String = js.native
  @JSName("should")
  var should_Original: Assertion = js.native
  /**
    * Add elements to the set of matched elements.
    *
    * @param elements One or more elements to add to the set of matched elements.
    */
  def add(elements: Element*): ChaiJQuery = js.native
  /**
    * Add elements to the set of matched elements.
    *
    * @param obj An existing jQuery object to add to the set of matched elements.
    */
  def add(obj: JQuery[HTMLElement]): ChaiJQuery = js.native
  /**
    * Add elements to the set of matched elements.
    *
    * @param selector A string representing a selector expression to find additional elements to add to the set of matched elements.
    * @param context The point in the document at which the selector should begin matching; similar to the context argument of the $(selector, context) method.
    */
  /**
    * Add elements to the set of matched elements.
    *
    * @param html An HTML fragment to add to the set of matched elements.
    */
  def add(selector: String): ChaiJQuery = js.native
  def add(selector: String, context: Element): ChaiJQuery = js.native
  /**
    * Add the previous set of elements on the stack to the current set, optionally filtered by a selector.
    */
  def addBack(): ChaiJQuery = js.native
  def addBack(selector: String): ChaiJQuery = js.native
  /**
    * Adds the specified class(es) to each of the set of matched elements.
    *
    * @param className One or more space-separated classes to be added to the class attribute of each matched element.
    */
  def addClass(className: String): ChaiJQuery = js.native
  /**
    * Adds the specified class(es) to each of the set of matched elements.
    *
    * @param function A function returning one or more space-separated class names to be added to the existing class name(s). Receives the index position of the element in the set and the existing class name(s) as arguments. Within the function, this refers to the current element in the set.
    */
  def addClass(func: js.Function2[/* index */ Double, /* className */ String, String]): ChaiJQuery = js.native
  def after(content1: String, content2: js.Any*): ChaiJQuery = js.native
  def after(content1: js.Array[_], content2: js.Any*): ChaiJQuery = js.native
  /**
    * Insert content, specified by the parameter, after each element in the set of matched elements.
    *
    * param content1 HTML string, DOM element, array of elements, or jQuery object to insert after each element in the set of matched elements.
    * param content2 One or more additional DOM elements, arrays of elements, HTML strings, or jQuery objects to insert after each element in the set of matched elements.
    */
  def after(content1: JQuery[HTMLElement], content2: js.Any*): ChaiJQuery = js.native
  def after(content1: Element, content2: js.Any*): ChaiJQuery = js.native
  def after(content1: Text, content2: js.Any*): ChaiJQuery = js.native
  /**
    * Insert content, specified by the parameter, after each element in the set of matched elements.
    *
    * param func A function that returns an HTML string, DOM element(s), or jQuery object to insert after each element in the set of matched elements. Receives the index position of the element in the set as an argument. Within the function, this refers to the current element in the set.
    */
  def after(func: js.Function2[/* index */ Double, /* html */ String, String | Element | JQuery[HTMLElement]]): ChaiJQuery = js.native
  /**
    * Register a handler to be called when Ajax requests complete. This is an AjaxEvent.
    *
    * @param handler The function to be invoked.
    */
  def ajaxComplete(
    handler: js.Function3[
      /* event */ JQueryEventObject, 
      /* XMLHttpRequest */ XMLHttpRequest, 
      /* ajaxOptions */ js.Any, 
      _
    ]
  ): ChaiJQuery = js.native
  /**
    * Register a handler to be called when Ajax requests complete with an error. This is an Ajax Event.
    *
    * @param handler The function to be invoked.
    */
  def ajaxError(
    handler: js.Function4[
      /* event */ JQueryEventObject, 
      /* jqXHR */ JQueryXHR, 
      /* ajaxSettings */ JQueryAjaxSettings, 
      /* thrownError */ js.Any, 
      _
    ]
  ): ChaiJQuery = js.native
  /**
    * Attach a function to be executed before an Ajax request is sent. This is an Ajax Event.
    *
    * @param handler The function to be invoked.
    */
  def ajaxSend(
    handler: js.Function3[
      /* event */ JQueryEventObject, 
      /* jqXHR */ JQueryXHR, 
      /* ajaxOptions */ JQueryAjaxSettings, 
      _
    ]
  ): ChaiJQuery = js.native
  /**
    * Register a handler to be called when the first Ajax request begins. This is an Ajax Event.
    *
    * @param handler The function to be invoked.
    */
  def ajaxStart(handler: js.Function0[_]): ChaiJQuery = js.native
  /**
    * Register a handler to be called when all Ajax requests have completed. This is an Ajax Event.
    *
    * @param handler The function to be invoked.
    */
  def ajaxStop(handler: js.Function0[_]): ChaiJQuery = js.native
  /**
    * Attach a function to be executed whenever an Ajax request completes successfully. This is an Ajax Event.
    *
    * @param handler The function to be invoked.
    */
  def ajaxSuccess(
    handler: js.Function3[
      /* event */ JQueryEventObject, 
      /* XMLHttpRequest */ XMLHttpRequest, 
      /* ajaxOptions */ JQueryAjaxSettings, 
      _
    ]
  ): ChaiJQuery = js.native
  /**
    * Perform a custom animation of a set of CSS properties.
    *
    * @param properties An object of CSS properties and values that the animation will move toward.
    * @param duration A string or number determining how long the animation will run.
    * @param complete A function to call once the animation is complete.
    */
  def animate(properties: Object): ChaiJQuery = js.native
  def animate(properties: Object, duration: String): ChaiJQuery = js.native
  def animate(properties: Object, duration: String, complete: js.Function): ChaiJQuery = js.native
  def animate(properties: Object, duration: String, easing: String): ChaiJQuery = js.native
  def animate(properties: Object, duration: String, easing: String, complete: js.Function): ChaiJQuery = js.native
  def animate(properties: Object, duration: Double): ChaiJQuery = js.native
  def animate(properties: Object, duration: Double, complete: js.Function): ChaiJQuery = js.native
  def animate(properties: Object, duration: Double, easing: String): ChaiJQuery = js.native
  def animate(properties: Object, duration: Double, easing: String, complete: js.Function): ChaiJQuery = js.native
  /**
    * Perform a custom animation of a set of CSS properties.
    *
    * @param properties An object of CSS properties and values that the animation will move toward.
    * @param options A map of additional options to pass to the method.
    */
  def animate(properties: Object, options: JQueryAnimationOptions): ChaiJQuery = js.native
  def append(content1: String, content2: js.Any*): ChaiJQuery = js.native
  def append(content1: js.Array[_], content2: js.Any*): ChaiJQuery = js.native
  /**
    * Insert content, specified by the parameter, to the end of each element in the set of matched elements.
    *
    * param content1 DOM element, array of elements, HTML string, or jQuery object to insert at the end of each element in the set of matched elements.
    * param content2 One or more additional DOM elements, arrays of elements, HTML strings, or jQuery objects to insert at the end of each element in the set of matched elements.
    */
  def append(content1: JQuery[HTMLElement], content2: js.Any*): ChaiJQuery = js.native
  def append(content1: Element, content2: js.Any*): ChaiJQuery = js.native
  def append(content1: Text, content2: js.Any*): ChaiJQuery = js.native
  /**
    * Insert content, specified by the parameter, to the end of each element in the set of matched elements.
    *
    * param func A function that returns an HTML string, DOM element(s), or jQuery object to insert at the end of each element in the set of matched elements. Receives the index position of the element in the set and the old HTML value of the element as arguments. Within the function, this refers to the current element in the set.
    */
  def append(func: js.Function2[/* index */ Double, /* html */ String, String | Element | JQuery[HTMLElement]]): ChaiJQuery = js.native
  def appendTo(target: String): ChaiJQuery = js.native
  def appendTo(target: js.Array[_]): ChaiJQuery = js.native
  /**
    * Insert every element in the set of matched elements to the end of the target.
    *
    * @param target A selector, element, HTML string, array of elements, or jQuery object; the matched set of elements will be inserted at the end of the element(s) specified by this parameter.
    */
  def appendTo(target: JQuery[HTMLElement]): ChaiJQuery = js.native
  def appendTo(target: Element): ChaiJQuery = js.native
  /**
    * Get the value of an attribute for the first element in the set of matched elements.
    *
    * @param attributeName The name of the attribute to get.
    */
  def attr(attributeName: String): String = js.native
  /**
    * Set one or more attributes for the set of matched elements.
    *
    * @param attributeName The name of the attribute to set.
    * @param func A function returning the value to set. this is the current element. Receives the index position of the element in the set and the old attribute value as arguments.
    */
  def attr(attributeName: String, func: js.Function2[/* index */ Double, /* attr */ String, String | Double]): ChaiJQuery = js.native
  /**
    * Set one or more attributes for the set of matched elements.
    *
    * @param attributeName The name of the attribute to set.
    * @param value A value to set for the attribute.
    */
  def attr(attributeName: String, value: String): ChaiJQuery = js.native
  def attr(attributeName: String, value: Double): ChaiJQuery = js.native
  /**
    * Set one or more attributes for the set of matched elements.
    *
    * @param attributes An object of attribute-value pairs to set.
    */
  def attr(attributes: Object): ChaiJQuery = js.native
  def before(content1: String, content2: js.Any*): ChaiJQuery = js.native
  def before(content1: js.Array[_], content2: js.Any*): ChaiJQuery = js.native
  /**
    * Insert content, specified by the parameter, before each element in the set of matched elements.
    *
    * param content1 HTML string, DOM element, array of elements, or jQuery object to insert before each element in the set of matched elements.
    * param content2 One or more additional DOM elements, arrays of elements, HTML strings, or jQuery objects to insert before each element in the set of matched elements.
    */
  def before(content1: JQuery[HTMLElement], content2: js.Any*): ChaiJQuery = js.native
  def before(content1: Element, content2: js.Any*): ChaiJQuery = js.native
  def before(content1: Text, content2: js.Any*): ChaiJQuery = js.native
  /**
    * Insert content, specified by the parameter, before each element in the set of matched elements.
    *
    * param func A function that returns an HTML string, DOM element(s), or jQuery object to insert before each element in the set of matched elements. Receives the index position of the element in the set as an argument. Within the function, this refers to the current element in the set.
    */
  def before(func: js.Function2[/* index */ Double, /* html */ String, String | Element | JQuery[HTMLElement]]): ChaiJQuery = js.native
  /**
    * Attach a handler to an event for the elements.
    *
    * @param eventType A string containing one or more DOM event types, such as "click" or "submit," or custom event names.
    * @param eventData An object containing data that will be passed to the event handler.
    * @param handler A function to execute each time the event is triggered.
    */
  def bind(
    eventType: String,
    eventData: js.Any,
    handler: js.Function1[/* eventObject */ JQueryEventObject, _]
  ): ChaiJQuery = js.native
  /**
    * Attach a handler to an event for the elements.
    *
    * @param eventType A string containing one or more DOM event types, such as "click" or "submit," or custom event names.
    * @param eventData An object containing data that will be passed to the event handler.
    * @param preventBubble Setting the third argument to false will attach a function that prevents the default action from occurring and stops the event from bubbling. The default is true.
    */
  def bind(eventType: String, eventData: js.Any, preventBubble: Boolean): ChaiJQuery = js.native
  /**
    * Attach a handler to an event for the elements.
    *
    * @param eventType A string containing one or more DOM event types, such as "click" or "submit," or custom event names.
    * @param handler A function to execute each time the event is triggered.
    */
  def bind(eventType: String, handler: js.Function1[/* eventObject */ JQueryEventObject, _]): ChaiJQuery = js.native
  /**
    * Attach a handler to an event for the elements.
    *
    * @param eventType A string containing one or more DOM event types, such as "click" or "submit," or custom event names.
    * @param preventBubble Setting the third argument to false will attach a function that prevents the default action from occurring and stops the event from bubbling. The default is true.
    */
  def bind(eventType: String, preventBubble: Boolean): ChaiJQuery = js.native
  /**
    * Attach a handler to an event for the elements.
    *
    * @param events An object containing one or more DOM event types and functions to execute for them.
    */
  def bind(events: js.Any): ChaiJQuery = js.native
  /**
    * Trigger the "blur" event on an element
    */
  def blur(): ChaiJQuery = js.native
  def blur(eventData: js.Any): ChaiJQuery = js.native
  def blur(eventData: js.Any, handler: js.Function1[/* eventObject */ JQueryEventObject, _]): ChaiJQuery = js.native
  /**
    * Bind an event handler to the "blur" JavaScript event
    *
    * @param handler A function to execute each time the event is triggered.
    */
  def blur(handler: js.Function1[/* eventObject */ JQueryEventObject, _]): ChaiJQuery = js.native
  /**
    * Trigger the "change" event on an element.
    */
  def change(): ChaiJQuery = js.native
  def change(eventData: js.Any): ChaiJQuery = js.native
  def change(eventData: js.Any, handler: js.Function1[/* eventObject */ JQueryEventObject, _]): ChaiJQuery = js.native
  /**
    * Bind an event handler to the "change" JavaScript event
    *
    * @param handler A function to execute each time the event is triggered.
    */
  def change(handler: js.Function1[/* eventObject */ JQueryEventObject, _]): ChaiJQuery = js.native
  /**
    * Get the children of each element in the set of matched elements, optionally filtered by a selector.
    *
    * @param selector A string containing a selector expression to match elements against.
    */
  def children(): ChaiJQuery = js.native
  def children(selector: String): ChaiJQuery = js.native
  /**
    * Remove from the queue all items that have not yet been run.
    *
    * @param queueName A string containing the name of the queue. Defaults to fx, the standard effects queue.
    */
  def clearQueue(): ChaiJQuery = js.native
  def clearQueue(queueName: String): ChaiJQuery = js.native
  /**
    * Trigger the "click" event on an element.
    */
  def click(): ChaiJQuery = js.native
  def click(eventData: js.Any): ChaiJQuery = js.native
  def click(eventData: js.Any, handler: js.Function1[/* eventObject */ JQueryEventObject, _]): ChaiJQuery = js.native
  /**
    * Bind an event handler to the "click" JavaScript event
    *
    * @param eventData An object containing data that will be passed to the event handler.
    */
  def click(handler: js.Function1[/* eventObject */ JQueryEventObject, _]): ChaiJQuery = js.native
  def clone(withDataAndEvents: Boolean): ChaiJQuery = js.native
  def clone(withDataAndEvents: Boolean, deepWithDataAndEvents: Boolean): ChaiJQuery = js.native
  /**
    * For each element in the set, get the first element that matches the selector by testing the element itself and traversing up through its ancestors in the DOM tree.
    *
    * @param element An element to match elements against.
    */
  def closest(element: Element): ChaiJQuery = js.native
  /**
    * For each element in the set, get the first element that matches the selector by testing the element itself and traversing up through its ancestors in the DOM tree.
    *
    * @param obj A jQuery object to match elements against.
    */
  def closest(obj: JQuery[HTMLElement]): ChaiJQuery = js.native
  /**
    * For each element in the set, get the first element that matches the selector by testing the element itself and traversing up through its ancestors in the DOM tree.
    *
    * @param selector A string containing a selector expression to match elements against.
    */
  def closest(selector: String): ChaiJQuery = js.native
  def closest(selector: String, context: Element): ChaiJQuery = js.native
  /**
    * Get an array of all the elements and selectors matched against the current element up through the DOM tree.
    *
    * @param selectors An array or string containing a selector expression to match elements against (can also be a jQuery object).
    * @param context A DOM element within which a matching element may be found. If no context is passed in then the context of the jQuery set will be used instead.
    */
  def closest(selectors: js.Any): js.Array[_] = js.native
  def closest(selectors: js.Any, context: Element): js.Array[_] = js.native
  /**
    * Get the children of each element in the set of matched elements, including text and comment nodes.
    */
  def contents(): ChaiJQuery = js.native
  /**
    * Set one or more CSS properties for the set of matched elements.
    *
    * @param properties An object of property-value pairs to set.
    */
  def css(properties: Object): ChaiJQuery = js.native
  /**
    * Get the value of style properties for the first element in the set of matched elements.
    *
    * @param propertyName A CSS property.
    */
  def css(propertyName: String): String = js.native
  /**
    * Set one or more CSS properties for the set of matched elements.
    *
    * @param propertyName A CSS property name.
    * @param value A value to set for the property.
    */
  def css(propertyName: String, value: String): ChaiJQuery = js.native
  /**
    * Set one or more CSS properties for the set of matched elements.
    *
    * @param propertyName A CSS property name.
    * @param value A function returning the value to set. this is the current element. Receives the index position of the element in the set and the old value as arguments.
    */
  def css(propertyName: String, value: js.Function2[/* index */ Double, /* value */ String, String | Double]): ChaiJQuery = js.native
  def css(propertyName: String, value: Double): ChaiJQuery = js.native
  /**
    * Return the value at the named data store for the first element in the jQuery collection, as set by data(name, value) or by an HTML5 data-* attribute.
    */
  def data(): js.Any = js.native
  /**
    * Return the value at the named data store for the first element in the jQuery collection, as set by data(name, value) or by an HTML5 data-* attribute.
    *
    * @param key Name of the data stored.
    */
  def data(key: String): js.Any = js.native
  /**
    * Store arbitrary data associated with the matched elements.
    *
    * @param key A string naming the piece of data to set.
    * @param value The new data value; it can be any Javascript type including Array or Object.
    */
  def data(key: String, value: js.Any): ChaiJQuery = js.native
  /**
    * Store arbitrary data associated with the matched elements.
    *
    * @param obj An object of key-value pairs of data to update.
    */
  def data(obj: StringDictionary[js.Any]): ChaiJQuery = js.native
  /**
    * Trigger the "dblclick" event on an element.
    */
  def dblclick(): ChaiJQuery = js.native
  def dblclick(eventData: js.Any): ChaiJQuery = js.native
  def dblclick(eventData: js.Any, handler: js.Function1[/* eventObject */ JQueryEventObject, _]): ChaiJQuery = js.native
  /**
    * Bind an event handler to the "dblclick" JavaScript event
    *
    * @param handler A function to execute each time the event is triggered.
    */
  def dblclick(handler: js.Function1[/* eventObject */ JQueryEventObject, _]): ChaiJQuery = js.native
  /**
    * Set a timer to delay execution of subsequent items in the queue.
    *
    * @param duration An integer indicating the number of milliseconds to delay execution of the next item in the queue.
    * @param queueName A string containing the name of the queue. Defaults to fx, the standard effects queue.
    */
  def delay(duration: Double): ChaiJQuery = js.native
  def delay(duration: Double, queueName: String): ChaiJQuery = js.native
  def delegate(
    selector: js.Any,
    eventType: String,
    eventData: js.Any,
    handler: js.Function1[/* eventObject */ JQueryEventObject, _]
  ): ChaiJQuery = js.native
  def delegate(selector: js.Any, eventType: String, handler: js.Function1[/* eventObject */ JQueryEventObject, _]): ChaiJQuery = js.native
  /**
    * Execute the next function on the queue for the matched elements.
    *
    * @param queueName A string containing the name of the queue. Defaults to fx, the standard effects queue.
    */
  def dequeue(): ChaiJQuery = js.native
  def dequeue(queueName: String): ChaiJQuery = js.native
  /**
    * Remove the set of matched elements from the DOM.
    *
    * param selector A selector expression that filters the set of matched elements to be removed.
    */
  def detach(): ChaiJQuery = js.native
  def detach(selector: String): ChaiJQuery = js.native
  /**
    * Iterate over a jQuery object, executing a function for each matched element.
    *
    * @param func A function to execute for each matched element.
    */
  def each(func: js.Function2[/* index */ Double, /* elem */ Element, _]): ChaiJQuery = js.native
  /**
    * Remove all child nodes of the set of matched elements from the DOM.
    */
  def empty(): ChaiJQuery = js.native
  /**
    * End the most recent filtering operation in the current chain and return the set of matched elements to its previous state.
    */
  def end(): ChaiJQuery = js.native
  /**
    * Reduce the set of matched elements to the one at the specified index.
    *
    * @param index An integer indicating the 0-based position of the element. OR An integer indicating the position of the element, counting backwards from the last element in the set.
    *
    */
  def eq(index: Double): ChaiJQuery = js.native
  /**
    * Bind an event handler to the "error" JavaScript event. (DEPRECATED from v1.8)
    *
    * @param eventData A plain object of data that will be passed to the event handler.
    * @param handler A function to execute when the event is triggered.
    */
  def error(eventData: js.Any, handler: js.Function1[/* eventObject */ JQueryEventObject, _]): ChaiJQuery = js.native
  /**
    * Bind an event handler to the "error" JavaScript event. (DEPRECATED from v1.8)
    *
    * @param handler A function to execute when the event is triggered.
    */
  def error(handler: js.Function1[/* eventObject */ JQueryEventObject, _]): ChaiJQuery = js.native
  /**
    * Display the matched elements by fading them to opaque.
    *
    * @param duration A string or number determining how long the animation will run.
    * @param complete A function to call once the animation is complete.
    */
  def fadeIn(): ChaiJQuery = js.native
  def fadeIn(duration: String): ChaiJQuery = js.native
  def fadeIn(duration: String, complete: js.Function): ChaiJQuery = js.native
  def fadeIn(duration: String, easing: String): ChaiJQuery = js.native
  def fadeIn(duration: String, easing: String, complete: js.Function): ChaiJQuery = js.native
  def fadeIn(duration: Double): ChaiJQuery = js.native
  def fadeIn(duration: Double, complete: js.Function): ChaiJQuery = js.native
  def fadeIn(duration: Double, easing: String): ChaiJQuery = js.native
  def fadeIn(duration: Double, easing: String, complete: js.Function): ChaiJQuery = js.native
  /**
    * Display the matched elements by fading them to opaque.
    *
    * @param options A map of additional options to pass to the method.
    */
  def fadeIn(options: JQueryAnimationOptions): ChaiJQuery = js.native
  /**
    * Hide the matched elements by fading them to transparent.
    *
    * @param duration A string or number determining how long the animation will run.
    * @param complete A function to call once the animation is complete.
    */
  def fadeOut(): ChaiJQuery = js.native
  def fadeOut(duration: String): ChaiJQuery = js.native
  def fadeOut(duration: String, complete: js.Function): ChaiJQuery = js.native
  def fadeOut(duration: String, easing: String): ChaiJQuery = js.native
  def fadeOut(duration: String, easing: String, complete: js.Function): ChaiJQuery = js.native
  def fadeOut(duration: Double): ChaiJQuery = js.native
  def fadeOut(duration: Double, complete: js.Function): ChaiJQuery = js.native
  def fadeOut(duration: Double, easing: String): ChaiJQuery = js.native
  def fadeOut(duration: Double, easing: String, complete: js.Function): ChaiJQuery = js.native
  /**
    * Hide the matched elements by fading them to transparent.
    *
    * @param options A map of additional options to pass to the method.
    */
  def fadeOut(options: JQueryAnimationOptions): ChaiJQuery = js.native
  /**
    * Adjust the opacity of the matched elements.
    *
    * @param duration A string or number determining how long the animation will run.
    * @param opacity A number between 0 and 1 denoting the target opacity.
    * @param complete A function to call once the animation is complete.
    */
  def fadeTo(duration: String, opacity: Double): ChaiJQuery = js.native
  def fadeTo(duration: String, opacity: Double, complete: js.Function): ChaiJQuery = js.native
  def fadeTo(duration: String, opacity: Double, easing: String): ChaiJQuery = js.native
  def fadeTo(duration: String, opacity: Double, easing: String, complete: js.Function): ChaiJQuery = js.native
  def fadeTo(duration: Double, opacity: Double): ChaiJQuery = js.native
  def fadeTo(duration: Double, opacity: Double, complete: js.Function): ChaiJQuery = js.native
  def fadeTo(duration: Double, opacity: Double, easing: String): ChaiJQuery = js.native
  def fadeTo(duration: Double, opacity: Double, easing: String, complete: js.Function): ChaiJQuery = js.native
  /**
    * Display or hide the matched elements by animating their opacity.
    *
    * @param duration A string or number determining how long the animation will run.
    * @param complete A function to call once the animation is complete.
    */
  def fadeToggle(): ChaiJQuery = js.native
  def fadeToggle(duration: String): ChaiJQuery = js.native
  def fadeToggle(duration: String, complete: js.Function): ChaiJQuery = js.native
  def fadeToggle(duration: String, easing: String): ChaiJQuery = js.native
  def fadeToggle(duration: String, easing: String, complete: js.Function): ChaiJQuery = js.native
  def fadeToggle(duration: Double): ChaiJQuery = js.native
  def fadeToggle(duration: Double, complete: js.Function): ChaiJQuery = js.native
  def fadeToggle(duration: Double, easing: String): ChaiJQuery = js.native
  def fadeToggle(duration: Double, easing: String, complete: js.Function): ChaiJQuery = js.native
  /**
    * Display or hide the matched elements by animating their opacity.
    *
    * @param options A map of additional options to pass to the method.
    */
  def fadeToggle(options: JQueryAnimationOptions): ChaiJQuery = js.native
  /**
    * Reduce the set of matched elements to those that match the selector or pass the function's test.
    *
    * @param element An element to match the current set of elements against.
    */
  def filter(element: Element): ChaiJQuery = js.native
  /**
    * Reduce the set of matched elements to those that match the selector or pass the function's test.
    *
    * @param func A function used as a test for each element in the set. this is the current DOM element.
    */
  def filter(func: js.Function2[/* index */ Double, /* element */ Element, _]): ChaiJQuery = js.native
  /**
    * Reduce the set of matched elements to those that match the selector or pass the function's test.
    *
    * @param obj An existing jQuery object to match the current set of elements against.
    */
  def filter(obj: JQuery[HTMLElement]): ChaiJQuery = js.native
  /**
    * Reduce the set of matched elements to those that match the selector or pass the function's test.
    *
    * @param selector A string containing a selector expression to match the current set of elements against.
    */
  def filter(selector: String): ChaiJQuery = js.native
  /**
    * Get the descendants of each element in the current set of matched elements, filtered by a selector, jQuery object, or element.
    *
    * @param element An element to match elements against.
    */
  def find(element: Element): ChaiJQuery = js.native
  /**
    * Get the descendants of each element in the current set of matched elements, filtered by a selector, jQuery object, or element.
    *
    * @param obj A jQuery object to match elements against.
    */
  def find(obj: JQuery[HTMLElement]): ChaiJQuery = js.native
  /**
    * Get the descendants of each element in the current set of matched elements, filtered by a selector, jQuery object, or element.
    *
    * @param selector A string containing a selector expression to match elements against.
    */
  def find(selector: String): ChaiJQuery = js.native
  /**
    * Stop the currently-running animation, remove all queued animations, and complete all animations for the matched elements.
    *
    * @param queue The name of the queue in which to stop animations.
    */
  def finish(): ChaiJQuery = js.native
  def finish(queue: String): ChaiJQuery = js.native
  /**
    * Reduce the set of matched elements to the first in the set.
    */
  def first(): ChaiJQuery = js.native
  /**
    * Trigger the "focus" event on an element.
    */
  def focus(): ChaiJQuery = js.native
  def focus(eventData: js.Any): ChaiJQuery = js.native
  def focus(eventData: js.Any, handler: js.Function1[/* eventObject */ JQueryEventObject, _]): ChaiJQuery = js.native
  /**
    * Bind an event handler to the "focus" JavaScript event
    *
    * @param handler A function to execute each time the event is triggered.
    */
  def focus(handler: js.Function1[/* eventObject */ JQueryEventObject, _]): ChaiJQuery = js.native
  /**
    * Bind an event handler to the "focusin" JavaScript event
    *
    * @param eventData An object containing data that will be passed to the event handler.
    * @param handler A function to execute each time the event is triggered.
    */
  def focusin(eventData: Object, handler: js.Function1[/* eventObject */ JQueryEventObject, _]): ChaiJQuery = js.native
  /**
    * Bind an event handler to the "focusin" JavaScript event
    *
    * @param handler A function to execute each time the event is triggered.
    */
  def focusin(handler: js.Function1[/* eventObject */ JQueryEventObject, _]): ChaiJQuery = js.native
  /**
    * Bind an event handler to the "focusout" JavaScript event
    *
    * @param eventData An object containing data that will be passed to the event handler.
    * @param handler A function to execute each time the event is triggered.
    */
  def focusout(eventData: Object, handler: js.Function1[/* eventObject */ JQueryEventObject, _]): ChaiJQuery = js.native
  /**
    * Bind an event handler to the "focusout" JavaScript event
    *
    * @param handler A function to execute each time the event is triggered.
    */
  def focusout(handler: js.Function1[/* eventObject */ JQueryEventObject, _]): ChaiJQuery = js.native
  /**
    * Retrieve the elements matched by the jQuery object.
    */
  def get(): js.Array[_] = js.native
  /**
    * Retrieve one of the elements matched by the jQuery object.
    *
    * @param index A zero-based integer indicating which element to retrieve.
    */
  def get(index: Double): HTMLElement = js.native
  /**
    * Reduce the set of matched elements to those that have a descendant that matches the selector or DOM element.
    *
    * @param contained A DOM element to match elements against.
    */
  def has(contained: Element): ChaiJQuery = js.native
  /**
    * Reduce the set of matched elements to those that have a descendant that matches the selector or DOM element.
    *
    * @param selector A string containing a selector expression to match elements against.
    */
  def has(selector: String): ChaiJQuery = js.native
  /**
    * Determine whether any of the matched elements are assigned the given class.
    *
    * @param className The class name to search for.
    */
  def hasClass(className: String): Boolean = js.native
  /**
    * Get the current computed height for the first element in the set of matched elements.
    */
  def height(): Double = js.native
  /**
    * Set the CSS height of every matched element.
    *
    * @param func A function returning the height to set. Receives the index position of the element in the set and the old height as arguments. Within the function, this refers to the current element in the set.
    */
  def height(func: js.Function2[/* index */ Double, /* height */ Double, Double | String]): ChaiJQuery = js.native
  def height(value: String): ChaiJQuery = js.native
  /**
    * Set the CSS height of every matched element.
    *
    * @param value An integer representing the number of pixels, or an integer with an optional unit of measure appended (as a string).
    */
  def height(value: Double): ChaiJQuery = js.native
  /**
    * Hide the matched elements.
    *
    * @param duration A string or number determining how long the animation will run.
    * @param complete A function to call once the animation is complete.
    */
  def hide(): ChaiJQuery = js.native
  def hide(duration: String): ChaiJQuery = js.native
  def hide(duration: String, complete: js.Function): ChaiJQuery = js.native
  def hide(duration: String, easing: String): ChaiJQuery = js.native
  def hide(duration: String, easing: String, complete: js.Function): ChaiJQuery = js.native
  def hide(duration: Double): ChaiJQuery = js.native
  def hide(duration: Double, complete: js.Function): ChaiJQuery = js.native
  def hide(duration: Double, easing: String): ChaiJQuery = js.native
  def hide(duration: Double, easing: String, complete: js.Function): ChaiJQuery = js.native
  /**
    * Hide the matched elements.
    *
    * @param options A map of additional options to pass to the method.
    */
  def hide(options: JQueryAnimationOptions): ChaiJQuery = js.native
  /**
    * Bind a single handler to the matched elements, to be executed when the mouse pointer enters or leaves the elements.
    *
    * @param handlerInOut A function to execute when the mouse pointer enters or leaves the element.
    */
  def hover(handlerInOut: js.Function1[/* eventObject */ JQueryEventObject, _]): ChaiJQuery = js.native
  /**
    * Bind two handlers to the matched elements, to be executed when the mouse pointer enters and leaves the elements.
    *
    * @param handlerIn A function to execute when the mouse pointer enters the element.
    * @param handlerOut A function to execute when the mouse pointer leaves the element.
    */
  def hover(
    handlerIn: js.Function1[/* eventObject */ JQueryEventObject, _],
    handlerOut: js.Function1[/* eventObject */ JQueryEventObject, _]
  ): ChaiJQuery = js.native
  /**
    * Get the HTML contents of the first element in the set of matched elements.
    */
  def html(): String = js.native
  /**
    * Set the HTML contents of each element in the set of matched elements.
    *
    * @param func A function returning the HTML content to set. Receives the index position of the element in the set and the old HTML value as arguments. jQuery empties the element before calling the function; use the oldhtml argument to reference the previous content. Within the function, this refers to the current element in the set.
    */
  def html(func: js.Function2[/* index */ Double, /* oldhtml */ String, String]): ChaiJQuery = js.native
  /**
    * Set the HTML contents of each element in the set of matched elements.
    *
    * @param htmlString A string of HTML to set as the content of each matched element.
    */
  def html(htmlString: String): ChaiJQuery = js.native
  /**
    * Search for a given element from among the matched elements.
    */
  def index(): Double = js.native
  /**
    * Search for a given element from among the matched elements.
    *
    * @param selector A selector representing a jQuery collection in which to look for an element.
    */
  def index(selector: String): Double = js.native
  def index(selector: JQuery[HTMLElement]): Double = js.native
  def index(selector: Element): Double = js.native
  /**
    * Get the current computed height for the first element in the set of matched elements, including padding but not border.
    */
  def innerHeight(): Double = js.native
  def innerHeight(height: String): ChaiJQuery = js.native
  /**
    * Sets the inner height on elements in the set of matched elements, including padding but not border.
    *
    * @param value An integer representing the number of pixels, or an integer along with an optional unit of measure appended (as a string).
    */
  def innerHeight(height: Double): ChaiJQuery = js.native
  /**
    * Get the current computed width for the first element in the set of matched elements, including padding but not border.
    */
  def innerWidth(): Double = js.native
  def innerWidth(width: String): ChaiJQuery = js.native
  /**
    * Sets the inner width on elements in the set of matched elements, including padding but not border.
    *
    * @param value An integer representing the number of pixels, or an integer along with an optional unit of measure appended (as a string).
    */
  def innerWidth(width: Double): ChaiJQuery = js.native
  def insertAfter(target: String): ChaiJQuery = js.native
  def insertAfter(target: js.Array[_]): ChaiJQuery = js.native
  /**
    * Insert every element in the set of matched elements after the target.
    *
    * param target A selector, element, array of elements, HTML string, or jQuery object; the matched set of elements will be inserted after the element(s) specified by this parameter.
    */
  def insertAfter(target: JQuery[HTMLElement]): ChaiJQuery = js.native
  def insertAfter(target: Element): ChaiJQuery = js.native
  def insertAfter(target: Text): ChaiJQuery = js.native
  def insertBefore(target: String): ChaiJQuery = js.native
  def insertBefore(target: js.Array[_]): ChaiJQuery = js.native
  /**
    * Insert every element in the set of matched elements before the target.
    *
    * param target A selector, element, array of elements, HTML string, or jQuery object; the matched set of elements will be inserted before the element(s) specified by this parameter.
    */
  def insertBefore(target: JQuery[HTMLElement]): ChaiJQuery = js.native
  def insertBefore(target: Element): ChaiJQuery = js.native
  def insertBefore(target: Text): ChaiJQuery = js.native
  /**
    * Check the current matched set of elements against a selector, element, or jQuery object and return true if at least one of these elements matches the given arguments.
    *
    * @param elements One or more elements to match the current set of elements against.
    */
  def is(elements: js.Any): Boolean = js.native
  /**
    * Check the current matched set of elements against a selector, element, or jQuery object and return true if at least one of these elements matches the given arguments.
    *
    * @param func A function used as a test for the set of elements. It accepts one argument, index, which is the element's index in the jQuery collection.Within the function, this refers to the current DOM element.
    */
  def is(func: js.Function2[/* index */ Double, /* element */ Element, Boolean]): Boolean = js.native
  /**
    * Check the current matched set of elements against a selector, element, or jQuery object and return true if at least one of these elements matches the given arguments.
    *
    * @param obj An existing jQuery object to match the current set of elements against.
    */
  def is(obj: JQuery[HTMLElement]): Boolean = js.native
  /**
    * Check the current matched set of elements against a selector, element, or jQuery object and return true if at least one of these elements matches the given arguments.
    *
    * @param selector A string containing a selector expression to match elements against.
    */
  def is(selector: String): Boolean = js.native
  /**
    * Trigger the "keydown" event on an element.
    */
  def keydown(): ChaiJQuery = js.native
  def keydown(eventData: js.Any): ChaiJQuery = js.native
  def keydown(eventData: js.Any, handler: js.Function1[/* eventObject */ JQueryKeyEventObject, _]): ChaiJQuery = js.native
  /**
    * Bind an event handler to the "keydown" JavaScript event
    *
    * @param handler A function to execute each time the event is triggered.
    */
  def keydown(handler: js.Function1[/* eventObject */ JQueryKeyEventObject, _]): ChaiJQuery = js.native
  /**
    * Trigger the "keypress" event on an element.
    */
  def keypress(): ChaiJQuery = js.native
  def keypress(eventData: js.Any): ChaiJQuery = js.native
  def keypress(eventData: js.Any, handler: js.Function1[/* eventObject */ JQueryKeyEventObject, _]): ChaiJQuery = js.native
  /**
    * Bind an event handler to the "keypress" JavaScript event
    *
    * @param handler A function to execute each time the event is triggered.
    */
  def keypress(handler: js.Function1[/* eventObject */ JQueryKeyEventObject, _]): ChaiJQuery = js.native
  /**
    * Trigger the "keyup" event on an element.
    */
  def keyup(): ChaiJQuery = js.native
  def keyup(eventData: js.Any): ChaiJQuery = js.native
  def keyup(eventData: js.Any, handler: js.Function1[/* eventObject */ JQueryKeyEventObject, _]): ChaiJQuery = js.native
  /**
    * Bind an event handler to the "keyup" JavaScript event
    *
    * @param handler A function to execute each time the event is triggered.
    */
  def keyup(handler: js.Function1[/* eventObject */ JQueryKeyEventObject, _]): ChaiJQuery = js.native
  /**
    * Reduce the set of matched elements to the final one in the set.
    */
  def last(): ChaiJQuery = js.native
  /**
    * Bind an event handler to the "load" JavaScript event.
    *
    * @param eventData An object containing data that will be passed to the event handler.
    * @param handler A function to execute when the event is triggered.
    */
  def load(): ChaiJQuery = js.native
  def load(eventData: js.Any): ChaiJQuery = js.native
  def load(eventData: js.Any, handler: js.Function1[/* eventObject */ JQueryEventObject, _]): ChaiJQuery = js.native
  /**
    * Bind an event handler to the "load" JavaScript event.
    *
    * @param handler A function to execute when the event is triggered.
    */
  def load(handler: js.Function1[/* eventObject */ JQueryEventObject, _]): ChaiJQuery = js.native
  /**
    * Load data from the server and place the returned HTML into the matched element.
    *
    * @param url A string containing the URL to which the request is sent.
    * @param data A plain object or string that is sent to the server with the request.
    * @param complete A callback function that is executed when the request completes.
    */
  def load(url: String): ChaiJQuery = js.native
  def load(url: String, data: String): ChaiJQuery = js.native
  def load(
    url: String,
    data: String,
    complete: js.Function3[
      /* responseText */ String, 
      /* textStatus */ String, 
      /* XMLHttpRequest */ XMLHttpRequest, 
      _
    ]
  ): ChaiJQuery = js.native
  def load(url: String, data: Object): ChaiJQuery = js.native
  def load(
    url: String,
    data: Object,
    complete: js.Function3[
      /* responseText */ String, 
      /* textStatus */ String, 
      /* XMLHttpRequest */ XMLHttpRequest, 
      _
    ]
  ): ChaiJQuery = js.native
  /**
    * Pass each element in the current matched set through a function, producing a new jQuery object containing the return values.
    *
    * @param callback A function object that will be invoked for each element in the current set.
    */
  def map(callback: js.Function2[/* index */ Double, /* domElement */ Element, _]): ChaiJQuery = js.native
  /**
    * Trigger the "mousedown" event on an element.
    */
  def mousedown(): ChaiJQuery = js.native
  /**
    * Bind an event handler to the "mousedown" JavaScript event.
    *
    * @param eventData An object containing data that will be passed to the event handler.
    * @param handler A function to execute when the event is triggered.
    */
  def mousedown(eventData: Object, handler: js.Function1[/* eventObject */ JQueryMouseEventObject, _]): ChaiJQuery = js.native
  /**
    * Bind an event handler to the "mousedown" JavaScript event.
    *
    * @param handler A function to execute when the event is triggered.
    */
  def mousedown(handler: js.Function1[/* eventObject */ JQueryMouseEventObject, _]): ChaiJQuery = js.native
  /**
    * Trigger the "mouseenter" event on an element.
    */
  def mouseenter(): ChaiJQuery = js.native
  /**
    * Bind an event handler to be fired when the mouse enters an element.
    *
    * @param eventData An object containing data that will be passed to the event handler.
    * @param handler A function to execute when the event is triggered.
    */
  def mouseenter(eventData: Object, handler: js.Function1[/* eventObject */ JQueryMouseEventObject, _]): ChaiJQuery = js.native
  /**
    * Bind an event handler to be fired when the mouse enters an element.
    *
    * @param handler A function to execute when the event is triggered.
    */
  def mouseenter(handler: js.Function1[/* eventObject */ JQueryMouseEventObject, _]): ChaiJQuery = js.native
  /**
    * Trigger the "mouseleave" event on an element.
    */
  def mouseleave(): ChaiJQuery = js.native
  /**
    * Bind an event handler to be fired when the mouse leaves an element.
    *
    * @param eventData An object containing data that will be passed to the event handler.
    * @param handler A function to execute when the event is triggered.
    */
  def mouseleave(eventData: Object, handler: js.Function1[/* eventObject */ JQueryMouseEventObject, _]): ChaiJQuery = js.native
  /**
    * Bind an event handler to be fired when the mouse leaves an element.
    *
    * @param handler A function to execute when the event is triggered.
    */
  def mouseleave(handler: js.Function1[/* eventObject */ JQueryMouseEventObject, _]): ChaiJQuery = js.native
  /**
    * Trigger the "mousemove" event on an element.
    */
  def mousemove(): ChaiJQuery = js.native
  /**
    * Bind an event handler to the "mousemove" JavaScript event.
    *
    * @param eventData An object containing data that will be passed to the event handler.
    * @param handler A function to execute when the event is triggered.
    */
  def mousemove(eventData: Object, handler: js.Function1[/* eventObject */ JQueryMouseEventObject, _]): ChaiJQuery = js.native
  /**
    * Bind an event handler to the "mousemove" JavaScript event.
    *
    * @param handler A function to execute when the event is triggered.
    */
  def mousemove(handler: js.Function1[/* eventObject */ JQueryMouseEventObject, _]): ChaiJQuery = js.native
  /**
    * Trigger the "mouseout" event on an element.
    */
  def mouseout(): ChaiJQuery = js.native
  /**
    * Bind an event handler to the "mouseout" JavaScript event.
    *
    * @param eventData An object containing data that will be passed to the event handler.
    * @param handler A function to execute when the event is triggered.
    */
  def mouseout(eventData: Object, handler: js.Function1[/* eventObject */ JQueryMouseEventObject, _]): ChaiJQuery = js.native
  /**
    * Bind an event handler to the "mouseout" JavaScript event.
    *
    * @param handler A function to execute when the event is triggered.
    */
  def mouseout(handler: js.Function1[/* eventObject */ JQueryMouseEventObject, _]): ChaiJQuery = js.native
  /**
    * Trigger the "mouseover" event on an element.
    */
  def mouseover(): ChaiJQuery = js.native
  /**
    * Bind an event handler to the "mouseover" JavaScript event.
    *
    * @param eventData An object containing data that will be passed to the event handler.
    * @param handler A function to execute when the event is triggered.
    */
  def mouseover(eventData: Object, handler: js.Function1[/* eventObject */ JQueryMouseEventObject, _]): ChaiJQuery = js.native
  /**
    * Bind an event handler to the "mouseover" JavaScript event.
    *
    * @param handler A function to execute when the event is triggered.
    */
  def mouseover(handler: js.Function1[/* eventObject */ JQueryMouseEventObject, _]): ChaiJQuery = js.native
  /**
    * Trigger the "mouseup" event on an element.
    */
  def mouseup(): ChaiJQuery = js.native
  /**
    * Bind an event handler to the "mouseup" JavaScript event.
    *
    * @param eventData An object containing data that will be passed to the event handler.
    * @param handler A function to execute when the event is triggered.
    */
  def mouseup(eventData: Object, handler: js.Function1[/* eventObject */ JQueryMouseEventObject, _]): ChaiJQuery = js.native
  /**
    * Bind an event handler to the "mouseup" JavaScript event.
    *
    * @param handler A function to execute when the event is triggered.
    */
  def mouseup(handler: js.Function1[/* eventObject */ JQueryMouseEventObject, _]): ChaiJQuery = js.native
  /**
    * Get the immediately following sibling of each element in the set of matched elements. If a selector is provided, it retrieves the next sibling only if it matches that selector.
    *
    * @param selector A string containing a selector expression to match elements against.
    */
  def next(): ChaiJQuery = js.native
  def next(selector: String): ChaiJQuery = js.native
  /**
    * Get all following siblings of each element in the set of matched elements, optionally filtered by a selector.
    *
    * @param selector A string containing a selector expression to match elements against.
    */
  def nextAll(): ChaiJQuery = js.native
  def nextAll(selector: String): ChaiJQuery = js.native
  /**
    * Get all following siblings of each element up to but not including the element matched by the selector, DOM node, or jQuery object passed.
    *
    * @param selector A string containing a selector expression to indicate where to stop matching following sibling elements.
    * @param filter A string containing a selector expression to match elements against.
    */
  def nextUntil(): ChaiJQuery = js.native
  def nextUntil(element: Element): ChaiJQuery = js.native
  def nextUntil(element: Element, filter: String): ChaiJQuery = js.native
  def nextUntil(obj: JQuery[HTMLElement]): ChaiJQuery = js.native
  def nextUntil(obj: JQuery[HTMLElement], filter: String): ChaiJQuery = js.native
  def nextUntil(selector: String): ChaiJQuery = js.native
  def nextUntil(selector: String, filter: String): ChaiJQuery = js.native
  /**
    * Remove elements from the set of matched elements.
    *
    * @param elements One or more DOM elements to remove from the matched set.
    */
  def not(elements: Element*): ChaiJQuery = js.native
  /**
    * Remove elements from the set of matched elements.
    *
    * @param func A function used as a test for each element in the set. this is the current DOM element.
    */
  def not(func: js.Function2[/* index */ Double, /* element */ Element, Boolean]): ChaiJQuery = js.native
  /**
    * Remove elements from the set of matched elements.
    *
    * @param obj An existing jQuery object to match the current set of elements against.
    */
  def not(obj: JQuery[HTMLElement]): ChaiJQuery = js.native
  /**
    * Remove elements from the set of matched elements.
    *
    * @param selector A string containing a selector expression to match elements against.
    */
  def not(selector: String): ChaiJQuery = js.native
  /**
    * Remove an event handler.
    */
  def off(): ChaiJQuery = js.native
  /**
    * Remove an event handler.
    *
    * @param events One or more space-separated event types and optional namespaces, or just namespaces, such as "click", "keydown.myPlugin", or ".myPlugin".
    * @param selector A selector which should match the one originally passed to .on() when attaching event handlers.
    * @param handler A handler function previously attached for the event(s), or the special value false.
    */
  def off(events: String): ChaiJQuery = js.native
  /**
    * Remove an event handler.
    *
    * @param events One or more space-separated event types and optional namespaces, or just namespaces, such as "click", "keydown.myPlugin", or ".myPlugin".
    * @param handler A handler function previously attached for the event(s), or the special value false.
    */
  def off(events: String, handler: js.Function1[/* eventObject */ JQueryEventObject, _]): ChaiJQuery = js.native
  def off(events: String, selector: String): ChaiJQuery = js.native
  def off(events: String, selector: String, handler: js.Function1[/* eventObject */ JQueryEventObject, _]): ChaiJQuery = js.native
  /**
    * Remove an event handler.
    *
    * @param events An object where the string keys represent one or more space-separated event types and optional namespaces, and the values represent handler functions previously attached for the event(s).
    * @param selector A selector which should match the one originally passed to .on() when attaching event handlers.
    */
  def off(events: StringDictionary[js.Any]): ChaiJQuery = js.native
  def off(events: StringDictionary[js.Any], selector: String): ChaiJQuery = js.native
  /**
    * Get the current coordinates of the first element in the set of matched elements, relative to the document.
    */
  def offset(): JQueryCoordinates = js.native
  /**
    * An object containing the properties top and left, which are integers indicating the new top and left coordinates for the elements.
    *
    * @param coordinates An object containing the properties top and left, which are integers indicating the new top and left coordinates for the elements.
    */
  def offset(coordinates: JQueryCoordinates): ChaiJQuery = js.native
  /**
    * An object containing the properties top and left, which are integers indicating the new top and left coordinates for the elements.
    *
    * @param func A function to return the coordinates to set. Receives the index of the element in the collection as the first argument and the current coordinates as the second argument. The function should return an object with the new top and left properties.
    */
  def offset(func: js.Function2[/* index */ Double, /* coords */ JQueryCoordinates, JQueryCoordinates]): ChaiJQuery = js.native
  /**
    * Get the closest ancestor element that is positioned.
    */
  def offsetParent(): ChaiJQuery = js.native
  /**
    * Attach an event handler function for one or more events to the selected elements.
    *
    * @param events One or more space-separated event types and optional namespaces, such as "click" or "keydown.myPlugin".
    * @param data Data to be passed to the handler in event.data when an event is triggered.
    * @param handler A function to execute when the event is triggered. The value false is also allowed as a shorthand for a function that simply does return false.
    */
  def on(
    events: String,
    data: js.Any,
    handler: js.Function2[/* eventObject */ JQueryEventObject, /* repeated */ js.Any, _]
  ): ChaiJQuery = js.native
  /**
    * Attach an event handler function for one or more events to the selected elements.
    *
    * @param events One or more space-separated event types and optional namespaces, such as "click" or "keydown.myPlugin".
    * @param handler A function to execute when the event is triggered. The value false is also allowed as a shorthand for a function that simply does return false. Rest parameter args is for optional parameters passed to jQuery.trigger(). Note that the actual parameters on the event handler function must be marked as optional (? syntax).
    */
  def on(
    events: String,
    handler: js.Function2[/* eventObject */ JQueryEventObject, /* repeated */ js.Any, _]
  ): ChaiJQuery = js.native
  /**
    * Attach an event handler function for one or more events to the selected elements.
    *
    * @param events One or more space-separated event types and optional namespaces, such as "click" or "keydown.myPlugin".
    * @param selector A selector string to filter the descendants of the selected elements that trigger the event. If the selector is null or omitted, the event is always triggered when it reaches the selected element.
    * @param data Data to be passed to the handler in event.data when an event is triggered.
    * @param handler A function to execute when the event is triggered. The value false is also allowed as a shorthand for a function that simply does return false.
    */
  def on(
    events: String,
    selector: String,
    data: js.Any,
    handler: js.Function2[/* eventObject */ JQueryEventObject, /* repeated */ js.Any, _]
  ): ChaiJQuery = js.native
  /**
    * Attach an event handler function for one or more events to the selected elements.
    *
    * @param events One or more space-separated event types and optional namespaces, such as "click" or "keydown.myPlugin".
    * @param selector A selector string to filter the descendants of the selected elements that trigger the event. If the selector is null or omitted, the event is always triggered when it reaches the selected element.
    * @param handler A function to execute when the event is triggered. The value false is also allowed as a shorthand for a function that simply does return false.
    */
  def on(
    events: String,
    selector: String,
    handler: js.Function2[/* eventObject */ JQueryEventObject, /* repeated */ js.Any, _]
  ): ChaiJQuery = js.native
  /**
    * Attach an event handler function for one or more events to the selected elements.
    *
    * @param events An object in which the string keys represent one or more space-separated event types and optional namespaces, and the values represent a handler function to be called for the event(s).
    * @param selector A selector string to filter the descendants of the selected elements that will call the handler. If the selector is null or omitted, the handler is always called when it reaches the selected element.
    * @param data Data to be passed to the handler in event.data when an event occurs.
    */
  def on(events: StringDictionary[js.Any]): ChaiJQuery = js.native
  def on(events: StringDictionary[js.Any], data: js.Any): ChaiJQuery = js.native
  def on(events: StringDictionary[js.Any], selector: String): ChaiJQuery = js.native
  def on(events: StringDictionary[js.Any], selector: String, data: js.Any): ChaiJQuery = js.native
  /**
    * Attach a handler to an event for the elements. The handler is executed at most once per element per event type.
    *
    * @param events A string containing one or more JavaScript event types, such as "click" or "submit," or custom event names.
    * @param data An object containing data that will be passed to the event handler.
    * @param handler A function to execute at the time the event is triggered.
    */
  def one(events: String, data: Object, handler: js.Function1[/* eventObject */ JQueryEventObject, _]): ChaiJQuery = js.native
  /**
    * Attach a handler to an event for the elements. The handler is executed at most once per element per event type.
    *
    * @param events A string containing one or more JavaScript event types, such as "click" or "submit," or custom event names.
    * @param handler A function to execute at the time the event is triggered.
    */
  def one(events: String, handler: js.Function1[/* eventObject */ JQueryEventObject, _]): ChaiJQuery = js.native
  /**
    * Attach a handler to an event for the elements. The handler is executed at most once per element per event type.
    *
    * @param events One or more space-separated event types and optional namespaces, such as "click" or "keydown.myPlugin".
    * @param selector A selector string to filter the descendants of the selected elements that trigger the event. If the selector is null or omitted, the event is always triggered when it reaches the selected element.
    * @param data Data to be passed to the handler in event.data when an event is triggered.
    * @param handler A function to execute when the event is triggered. The value false is also allowed as a shorthand for a function that simply does return false.
    */
  def one(
    events: String,
    selector: String,
    data: js.Any,
    handler: js.Function1[/* eventObject */ JQueryEventObject, _]
  ): ChaiJQuery = js.native
  /**
    * Attach a handler to an event for the elements. The handler is executed at most once per element per event type.
    *
    * @param events One or more space-separated event types and optional namespaces, such as "click" or "keydown.myPlugin".
    * @param selector A selector string to filter the descendants of the selected elements that trigger the event. If the selector is null or omitted, the event is always triggered when it reaches the selected element.
    * @param handler A function to execute when the event is triggered. The value false is also allowed as a shorthand for a function that simply does return false.
    */
  def one(events: String, selector: String, handler: js.Function1[/* eventObject */ JQueryEventObject, _]): ChaiJQuery = js.native
  /**
    * Attach a handler to an event for the elements. The handler is executed at most once per element per event type.
    *
    * @param events An object in which the string keys represent one or more space-separated event types and optional namespaces, and the values represent a handler function to be called for the event(s).
    * @param selector A selector string to filter the descendants of the selected elements that will call the handler. If the selector is null or omitted, the handler is always called when it reaches the selected element.
    * @param data Data to be passed to the handler in event.data when an event occurs.
    */
  def one(events: StringDictionary[js.Any]): ChaiJQuery = js.native
  def one(events: StringDictionary[js.Any], data: js.Any): ChaiJQuery = js.native
  def one(events: StringDictionary[js.Any], selector: String): ChaiJQuery = js.native
  def one(events: StringDictionary[js.Any], selector: String, data: js.Any): ChaiJQuery = js.native
  /**
    * Get the current computed height for the first element in the set of matched elements, including padding, border, and optionally margin. Returns an integer (without "px") representation of the value or null if called on an empty set of elements.
    *
    * @param includeMargin A Boolean indicating whether to include the element's margin in the calculation.
    */
  def outerHeight(): Double = js.native
  def outerHeight(height: String): ChaiJQuery = js.native
  /**
    * Sets the outer height on elements in the set of matched elements, including padding and border.
    *
    * @param value An integer representing the number of pixels, or an integer along with an optional unit of measure appended (as a string).
    */
  def outerHeight(height: Double): ChaiJQuery = js.native
  def outerHeight(includeMargin: Boolean): Double = js.native
  /**
    * Get the current computed width for the first element in the set of matched elements, including padding and border.
    *
    * @param includeMargin A Boolean indicating whether to include the element's margin in the calculation.
    */
  def outerWidth(): Double = js.native
  def outerWidth(includeMargin: Boolean): Double = js.native
  def outerWidth(width: String): ChaiJQuery = js.native
  /**
    * Sets the outer width on elements in the set of matched elements, including padding and border.
    *
    * @param value An integer representing the number of pixels, or an integer along with an optional unit of measure appended (as a string).
    */
  def outerWidth(width: Double): ChaiJQuery = js.native
  /**
    * Get the parent of each element in the current set of matched elements, optionally filtered by a selector.
    *
    * @param selector A string containing a selector expression to match elements against.
    */
  def parent(): ChaiJQuery = js.native
  def parent(selector: String): ChaiJQuery = js.native
  /**
    * Get the ancestors of each element in the current set of matched elements, optionally filtered by a selector.
    *
    * @param selector A string containing a selector expression to match elements against.
    */
  def parents(): ChaiJQuery = js.native
  def parents(selector: String): ChaiJQuery = js.native
  /**
    * Get the ancestors of each element in the current set of matched elements, up to but not including the element matched by the selector, DOM node, or jQuery object.
    *
    * @param selector A string containing a selector expression to indicate where to stop matching ancestor elements.
    * @param filter A string containing a selector expression to match elements against.
    */
  def parentsUntil(): ChaiJQuery = js.native
  def parentsUntil(element: Element): ChaiJQuery = js.native
  def parentsUntil(element: Element, filter: String): ChaiJQuery = js.native
  def parentsUntil(obj: JQuery[HTMLElement]): ChaiJQuery = js.native
  def parentsUntil(obj: JQuery[HTMLElement], filter: String): ChaiJQuery = js.native
  def parentsUntil(selector: String): ChaiJQuery = js.native
  def parentsUntil(selector: String, filter: String): ChaiJQuery = js.native
  /**
    * Get the current coordinates of the first element in the set of matched elements, relative to the offset parent.
    */
  def position(): JQueryCoordinates = js.native
  def prepend(content1: String, content2: js.Any*): ChaiJQuery = js.native
  def prepend(content1: js.Array[_], content2: js.Any*): ChaiJQuery = js.native
  /**
    * Insert content, specified by the parameter, to the beginning of each element in the set of matched elements.
    *
    * param content1 DOM element, array of elements, HTML string, or jQuery object to insert at the beginning of each element in the set of matched elements.
    * param content2 One or more additional DOM elements, arrays of elements, HTML strings, or jQuery objects to insert at the beginning of each element in the set of matched elements.
    */
  def prepend(content1: JQuery[HTMLElement], content2: js.Any*): ChaiJQuery = js.native
  def prepend(content1: Element, content2: js.Any*): ChaiJQuery = js.native
  def prepend(content1: Text, content2: js.Any*): ChaiJQuery = js.native
  /**
    * Insert content, specified by the parameter, to the beginning of each element in the set of matched elements.
    *
    * param func A function that returns an HTML string, DOM element(s), or jQuery object to insert at the beginning of each element in the set of matched elements. Receives the index position of the element in the set and the old HTML value of the element as arguments. Within the function, this refers to the current element in the set.
    */
  def prepend(func: js.Function2[/* index */ Double, /* html */ String, String | Element | JQuery[HTMLElement]]): ChaiJQuery = js.native
  def prependTo(target: String): ChaiJQuery = js.native
  def prependTo(target: js.Array[_]): ChaiJQuery = js.native
  /**
    * Insert every element in the set of matched elements to the beginning of the target.
    *
    * @param target A selector, element, HTML string, array of elements, or jQuery object; the matched set of elements will be inserted at the beginning of the element(s) specified by this parameter.
    */
  def prependTo(target: JQuery[HTMLElement]): ChaiJQuery = js.native
  def prependTo(target: Element): ChaiJQuery = js.native
  /**
    * Get the immediately preceding sibling of each element in the set of matched elements, optionally filtered by a selector.
    *
    * @param selector A string containing a selector expression to match elements against.
    */
  def prev(): ChaiJQuery = js.native
  def prev(selector: String): ChaiJQuery = js.native
  /**
    * Get all preceding siblings of each element in the set of matched elements, optionally filtered by a selector.
    *
    * @param selector A string containing a selector expression to match elements against.
    */
  def prevAll(): ChaiJQuery = js.native
  def prevAll(selector: String): ChaiJQuery = js.native
  /**
    * Get all preceding siblings of each element up to but not including the element matched by the selector, DOM node, or jQuery object.
    *
    * @param selector A string containing a selector expression to indicate where to stop matching preceding sibling elements.
    * @param filter A string containing a selector expression to match elements against.
    */
  def prevUntil(): ChaiJQuery = js.native
  def prevUntil(element: Element): ChaiJQuery = js.native
  def prevUntil(element: Element, filter: String): ChaiJQuery = js.native
  def prevUntil(obj: JQuery[HTMLElement]): ChaiJQuery = js.native
  def prevUntil(obj: JQuery[HTMLElement], filter: String): ChaiJQuery = js.native
  def prevUntil(selector: String): ChaiJQuery = js.native
  def prevUntil(selector: String, filter: String): ChaiJQuery = js.native
  /**
    * Return a Promise object to observe when all actions of a certain type bound to the collection, queued or not, have finished.
    *
    * @param type The type of queue that needs to be observed. (default: fx)
    * @param target Object onto which the promise methods have to be attached
    */
  def promise(): JQueryPromise[_] = js.native
  def promise(`type`: String): JQueryPromise[_] = js.native
  def promise(`type`: String, target: Object): JQueryPromise[_] = js.native
  /**
    * Set one or more properties for the set of matched elements.
    *
    * @param properties An object of property-value pairs to set.
    */
  def prop(properties: Object): ChaiJQuery = js.native
  /**
    * Set the HTML contents of each element in the set of matched elements.
    *
    * @param func A function returning the HTML content to set. Receives the index position of the element in the set and the old HTML value as arguments. jQuery empties the element before calling the function; use the oldhtml argument to reference the previous content. Within the function, this refers to the current element in the set.
    */
  /**
    * Get the value of a property for the first element in the set of matched elements.
    *
    * @param propertyName The name of the property to get.
    */
  def prop(propertyName: String): js.Any = js.native
  /**
    * Set one or more properties for the set of matched elements.
    *
    * @param propertyName The name of the property to set.
    * @param func A function returning the value to set. Receives the index position of the element in the set and the old property value as arguments. Within the function, the keyword this refers to the current element.
    */
  def prop(propertyName: String, func: js.Function2[/* index */ Double, /* oldPropertyValue */ js.Any, _]): ChaiJQuery = js.native
  /**
    * Set one or more properties for the set of matched elements.
    *
    * @param propertyName The name of the property to set.
    * @param value A value to set for the property.
    */
  def prop(propertyName: String, value: String): ChaiJQuery = js.native
  def prop(propertyName: String, value: Boolean): ChaiJQuery = js.native
  def prop(propertyName: String, value: Double): ChaiJQuery = js.native
  /**
    * Add a collection of DOM elements onto the jQuery stack.
    *
    * @param elements An array of elements to push onto the stack and make into a new jQuery object.
    */
  def pushStack(elements: js.Array[_]): ChaiJQuery = js.native
  /**
    * Add a collection of DOM elements onto the jQuery stack.
    *
    * @param elements An array of elements to push onto the stack and make into a new jQuery object.
    * @param name The name of a jQuery method that generated the array of elements.
    * @param arguments The arguments that were passed in to the jQuery method (for serialization).
    */
  def pushStack(elements: js.Array[_], name: String, arguments: js.Array[_]): ChaiJQuery = js.native
  /**
    * Show the queue of functions to be executed on the matched elements.
    *
    * @param queueName A string containing the name of the queue. Defaults to fx, the standard effects queue.
    */
  def queue(): js.Array[_] = js.native
  /**
    * Manipulate the queue of functions to be executed, once for each matched element.
    *
    * @param callback The new function to add to the queue, with a function to call that will dequeue the next item.
    */
  def queue(callback: js.Function): ChaiJQuery = js.native
  /**
    * Manipulate the queue of functions to be executed, once for each matched element.
    *
    * @param newQueue An array of functions to replace the current queue contents.
    */
  def queue(newQueue: js.Array[js.Function]): ChaiJQuery = js.native
  def queue(queueName: String): js.Array[_] = js.native
  /**
    * Manipulate the queue of functions to be executed, once for each matched element.
    *
    * @param queueName A string containing the name of the queue. Defaults to fx, the standard effects queue.
    * @param callback The new function to add to the queue, with a function to call that will dequeue the next item.
    */
  def queue(queueName: String, callback: js.Function): ChaiJQuery = js.native
  /**
    * Manipulate the queue of functions to be executed, once for each matched element.
    *
    * @param queueName A string containing the name of the queue. Defaults to fx, the standard effects queue.
    * @param newQueue An array of functions to replace the current queue contents.
    */
  def queue(queueName: String, newQueue: js.Array[js.Function]): ChaiJQuery = js.native
  /**
    * Specify a function to execute when the DOM is fully loaded.
    *
    * @param handler A function to execute after the DOM is ready.
    */
  def ready(handler: js.Function): ChaiJQuery = js.native
  /**
    * Remove the set of matched elements from the DOM.
    *
    * @param selector A selector expression that filters the set of matched elements to be removed.
    */
  def remove(): ChaiJQuery = js.native
  def remove(selector: String): ChaiJQuery = js.native
  /**
    * Remove an attribute from each element in the set of matched elements.
    *
    * @param attributeName An attribute to remove; as of version 1.7, it can be a space-separated list of attributes.
    */
  def removeAttr(attributeName: String): ChaiJQuery = js.native
  /**
    * Remove a single class, multiple classes, or all classes from each element in the set of matched elements.
    *
    * @param className One or more space-separated classes to be removed from the class attribute of each matched element.
    */
  def removeClass(): ChaiJQuery = js.native
  def removeClass(className: String): ChaiJQuery = js.native
  /**
    * Remove a single class, multiple classes, or all classes from each element in the set of matched elements.
    *
    * @param function A function returning one or more space-separated class names to be removed. Receives the index position of the element in the set and the old class value as arguments.
    */
  def removeClass(func: js.Function2[/* index */ Double, /* className */ String, String]): ChaiJQuery = js.native
  /**
    * Remove a previously-stored piece of data.
    *
    * @param list An array of strings naming the pieces of data to delete.
    */
  def removeData(list: js.Array[String]): ChaiJQuery = js.native
  /**
    * Remove a previously-stored piece of data.
    *
    * @param name A string naming the piece of data to delete or space-separated string naming the pieces of data to delete.
    */
  def removeData(name: String): ChaiJQuery = js.native
  /**
    * Remove a property for the set of matched elements.
    *
    * @param propertyName The name of the property to remove.
    */
  def removeProp(propertyName: String): ChaiJQuery = js.native
  def replaceAll(target: String): ChaiJQuery = js.native
  def replaceAll(target: js.Array[_]): ChaiJQuery = js.native
  /**
    * Replace each target element with the set of matched elements.
    *
    * @param target A selector string, jQuery object, DOM element, or array of elements indicating which element(s) to replace.
    */
  def replaceAll(target: JQuery[HTMLElement]): ChaiJQuery = js.native
  def replaceAll(target: Element): ChaiJQuery = js.native
  /**
    * Replace each element in the set of matched elements with the provided new content and return the set of elements that was removed.
    *
    * param func A function that returns content with which to replace the set of matched elements.
    */
  def replaceWith(func: js.Function0[Element | JQuery[HTMLElement]]): ChaiJQuery = js.native
  def replaceWith(newContent: String): ChaiJQuery = js.native
  def replaceWith(newContent: js.Array[_]): ChaiJQuery = js.native
  /**
    * Replace each element in the set of matched elements with the provided new content and return the set of elements that was removed.
    *
    * param newContent The content to insert. May be an HTML string, DOM element, array of DOM elements, or jQuery object.
    */
  def replaceWith(newContent: JQuery[HTMLElement]): ChaiJQuery = js.native
  def replaceWith(newContent: Element): ChaiJQuery = js.native
  def replaceWith(newContent: Text): ChaiJQuery = js.native
  /**
    * Trigger the "resize" event on an element.
    */
  def resize(): ChaiJQuery = js.native
  /**
    * Bind an event handler to the "resize" JavaScript event.
    *
    * @param eventData An object containing data that will be passed to the event handler.
    * @param handler A function to execute each time the event is triggered.
    */
  def resize(eventData: Object, handler: js.Function1[/* eventObject */ JQueryEventObject, _]): ChaiJQuery = js.native
  /**
    * Bind an event handler to the "resize" JavaScript event.
    *
    * @param handler A function to execute each time the event is triggered.
    */
  def resize(handler: js.Function1[/* eventObject */ JQueryEventObject, _]): ChaiJQuery = js.native
  /**
    * Trigger the "scroll" event on an element.
    */
  def scroll(): ChaiJQuery = js.native
  /**
    * Bind an event handler to the "scroll" JavaScript event.
    *
    * @param eventData An object containing data that will be passed to the event handler.
    * @param handler A function to execute each time the event is triggered.
    */
  def scroll(eventData: Object, handler: js.Function1[/* eventObject */ JQueryEventObject, _]): ChaiJQuery = js.native
  /**
    * Bind an event handler to the "scroll" JavaScript event.
    *
    * @param handler A function to execute each time the event is triggered.
    */
  def scroll(handler: js.Function1[/* eventObject */ JQueryEventObject, _]): ChaiJQuery = js.native
  /**
    * Get the current horizontal position of the scroll bar for the first element in the set of matched elements or set the horizontal position of the scroll bar for every matched element.
    */
  def scrollLeft(): Double = js.native
  /**
    * Set the current horizontal position of the scroll bar for each of the set of matched elements.
    *
    * @param value An integer indicating the new position to set the scroll bar to.
    */
  def scrollLeft(value: Double): ChaiJQuery = js.native
  /**
    * Get the current vertical position of the scroll bar for the first element in the set of matched elements or set the vertical position of the scroll bar for every matched element.
    */
  def scrollTop(): Double = js.native
  /**
    * Set the current vertical position of the scroll bar for each of the set of matched elements.
    *
    * @param value An integer indicating the new position to set the scroll bar to.
    */
  def scrollTop(value: Double): ChaiJQuery = js.native
  /**
    * Trigger the "select" event on an element.
    */
  def select(): ChaiJQuery = js.native
  /**
    * Bind an event handler to the "select" JavaScript event.
    *
    * @param eventData An object containing data that will be passed to the event handler.
    * @param handler A function to execute each time the event is triggered.
    */
  def select(eventData: Object, handler: js.Function1[/* eventObject */ JQueryEventObject, _]): ChaiJQuery = js.native
  /**
    * Bind an event handler to the "select" JavaScript event.
    *
    * @param handler A function to execute each time the event is triggered.
    */
  def select(handler: js.Function1[/* eventObject */ JQueryEventObject, _]): ChaiJQuery = js.native
  /**
    * Encode a set of form elements as a string for submission.
    */
  def serialize(): String = js.native
  /**
    * Encode a set of form elements as an array of names and values.
    */
  def serializeArray(): js.Array[JQuerySerializeArrayElement] = js.native
  def should(selector: String): Assertion = js.native
  def should(`type`: String, message: String): Assertion = js.native
  /**
    * Display the matched elements.
    *
    * @param duration A string or number determining how long the animation will run.
    * @param complete A function to call once the animation is complete.
    */
  def show(): ChaiJQuery = js.native
  def show(duration: String): ChaiJQuery = js.native
  def show(duration: String, complete: js.Function): ChaiJQuery = js.native
  def show(duration: String, easing: String): ChaiJQuery = js.native
  def show(duration: String, easing: String, complete: js.Function): ChaiJQuery = js.native
  def show(duration: Double): ChaiJQuery = js.native
  def show(duration: Double, complete: js.Function): ChaiJQuery = js.native
  def show(duration: Double, easing: String): ChaiJQuery = js.native
  def show(duration: Double, easing: String, complete: js.Function): ChaiJQuery = js.native
  /**
    * Display the matched elements.
    *
    * @param options A map of additional options to pass to the method.
    */
  def show(options: JQueryAnimationOptions): ChaiJQuery = js.native
  /**
    * Get the siblings of each element in the set of matched elements, optionally filtered by a selector.
    *
    * @param selector A string containing a selector expression to match elements against.
    */
  def siblings(): ChaiJQuery = js.native
  def siblings(selector: String): ChaiJQuery = js.native
  /**
    * Reduce the set of matched elements to a subset specified by a range of indices.
    *
    * @param start An integer indicating the 0-based position at which the elements begin to be selected. If negative, it indicates an offset from the end of the set.
    * @param end An integer indicating the 0-based position at which the elements stop being selected. If negative, it indicates an offset from the end of the set. If omitted, the range continues until the end of the set.
    */
  def slice(start: Double): ChaiJQuery = js.native
  def slice(start: Double, end: Double): ChaiJQuery = js.native
  /**
    * Display the matched elements with a sliding motion.
    *
    * @param duration A string or number determining how long the animation will run.
    * @param complete A function to call once the animation is complete.
    */
  def slideDown(): ChaiJQuery = js.native
  def slideDown(duration: String): ChaiJQuery = js.native
  def slideDown(duration: String, complete: js.Function): ChaiJQuery = js.native
  def slideDown(duration: String, easing: String): ChaiJQuery = js.native
  def slideDown(duration: String, easing: String, complete: js.Function): ChaiJQuery = js.native
  def slideDown(duration: Double): ChaiJQuery = js.native
  def slideDown(duration: Double, complete: js.Function): ChaiJQuery = js.native
  def slideDown(duration: Double, easing: String): ChaiJQuery = js.native
  def slideDown(duration: Double, easing: String, complete: js.Function): ChaiJQuery = js.native
  /**
    * Display the matched elements with a sliding motion.
    *
    * @param options A map of additional options to pass to the method.
    */
  def slideDown(options: JQueryAnimationOptions): ChaiJQuery = js.native
  /**
    * Display or hide the matched elements with a sliding motion.
    *
    * @param duration A string or number determining how long the animation will run.
    * @param complete A function to call once the animation is complete.
    */
  def slideToggle(): ChaiJQuery = js.native
  def slideToggle(duration: String): ChaiJQuery = js.native
  def slideToggle(duration: String, complete: js.Function): ChaiJQuery = js.native
  def slideToggle(duration: String, easing: String): ChaiJQuery = js.native
  def slideToggle(duration: String, easing: String, complete: js.Function): ChaiJQuery = js.native
  def slideToggle(duration: Double): ChaiJQuery = js.native
  def slideToggle(duration: Double, complete: js.Function): ChaiJQuery = js.native
  def slideToggle(duration: Double, easing: String): ChaiJQuery = js.native
  def slideToggle(duration: Double, easing: String, complete: js.Function): ChaiJQuery = js.native
  /**
    * Display or hide the matched elements with a sliding motion.
    *
    * @param options A map of additional options to pass to the method.
    */
  def slideToggle(options: JQueryAnimationOptions): ChaiJQuery = js.native
  /**
    * Hide the matched elements with a sliding motion.
    *
    * @param duration A string or number determining how long the animation will run.
    * @param complete A function to call once the animation is complete.
    */
  def slideUp(): ChaiJQuery = js.native
  def slideUp(duration: String): ChaiJQuery = js.native
  def slideUp(duration: String, complete: js.Function): ChaiJQuery = js.native
  def slideUp(duration: String, easing: String): ChaiJQuery = js.native
  def slideUp(duration: String, easing: String, complete: js.Function): ChaiJQuery = js.native
  def slideUp(duration: Double): ChaiJQuery = js.native
  def slideUp(duration: Double, complete: js.Function): ChaiJQuery = js.native
  def slideUp(duration: Double, easing: String): ChaiJQuery = js.native
  def slideUp(duration: Double, easing: String, complete: js.Function): ChaiJQuery = js.native
  /**
    * Hide the matched elements with a sliding motion.
    *
    * @param options A map of additional options to pass to the method.
    */
  def slideUp(options: JQueryAnimationOptions): ChaiJQuery = js.native
  /**
    * Stop the currently-running animation on the matched elements.
    *
    * @param clearQueue A Boolean indicating whether to remove queued animation as well. Defaults to false.
    * @param jumpToEnd A Boolean indicating whether to complete the current animation immediately. Defaults to false.
    */
  def stop(): ChaiJQuery = js.native
  def stop(clearQueue: Boolean): ChaiJQuery = js.native
  def stop(clearQueue: Boolean, jumpToEnd: Boolean): ChaiJQuery = js.native
  def stop(queue: String): ChaiJQuery = js.native
  def stop(queue: String, clearQueue: Boolean): ChaiJQuery = js.native
  def stop(queue: String, clearQueue: Boolean, jumpToEnd: Boolean): ChaiJQuery = js.native
  /**
    * Trigger the "submit" event on an element.
    */
  def submit(): ChaiJQuery = js.native
  def submit(eventData: js.Any): ChaiJQuery = js.native
  def submit(eventData: js.Any, handler: js.Function1[/* eventObject */ JQueryEventObject, _]): ChaiJQuery = js.native
  /**
    * Bind an event handler to the "submit" JavaScript event
    *
    * @param handler A function to execute each time the event is triggered.
    */
  def submit(handler: js.Function1[/* eventObject */ JQueryEventObject, _]): ChaiJQuery = js.native
  /**
    * Get the combined text contents of each element in the set of matched elements, including their descendants.
    */
  def text(): String = js.native
  /**
    * Set the content of each element in the set of matched elements to the specified text.
    *
    * @param func A function returning the text content to set. Receives the index position of the element in the set and the old text value as arguments.
    */
  def text(func: js.Function2[/* index */ Double, /* text */ String, String]): ChaiJQuery = js.native
  /**
    * Set the content of each element in the set of matched elements to the specified text.
    *
    * @param text The text to set as the content of each matched element. When Number or Boolean is supplied, it will be converted to a String representation.
    */
  def text(text: String): ChaiJQuery = js.native
  def text(text: Boolean): ChaiJQuery = js.native
  def text(text: Double): ChaiJQuery = js.native
  /**
    * Retrieve all the elements contained in the jQuery set, as an array.
    */
  def toArray(): js.Array[_] = js.native
  /**
    * Display or hide the matched elements.
    *
    * @param duration A string or number determining how long the animation will run.
    * @param complete A function to call once the animation is complete.
    */
  def toggle(): ChaiJQuery = js.native
  def toggle(duration: String): ChaiJQuery = js.native
  def toggle(duration: String, complete: js.Function): ChaiJQuery = js.native
  def toggle(duration: String, easing: String): ChaiJQuery = js.native
  def toggle(duration: String, easing: String, complete: js.Function): ChaiJQuery = js.native
  def toggle(duration: Double): ChaiJQuery = js.native
  def toggle(duration: Double, complete: js.Function): ChaiJQuery = js.native
  def toggle(duration: Double, easing: String): ChaiJQuery = js.native
  def toggle(duration: Double, easing: String, complete: js.Function): ChaiJQuery = js.native
  /**
    * Display or hide the matched elements.
    *
    * @param options A map of additional options to pass to the method.
    */
  def toggle(options: JQueryAnimationOptions): ChaiJQuery = js.native
  /**
    * Display or hide the matched elements.
    *
    * @param showOrHide A Boolean indicating whether to show or hide the elements.
    */
  def toggle(showOrHide: Boolean): ChaiJQuery = js.native
  /**
    * Add or remove one or more classes from each element in the set of matched elements, depending on either the class's presence or the value of the switch argument.
    *
    * @param swtch A boolean value to determine whether the class should be added or removed.
    */
  def toggleClass(): ChaiJQuery = js.native
  /**
    * Add or remove one or more classes from each element in the set of matched elements, depending on either the class's presence or the value of the switch argument.
    *
    * @param className One or more class names (separated by spaces) to be toggled for each element in the matched set.
    * @param swtch A Boolean (not just truthy/falsy) value to determine whether the class should be added or removed.
    */
  def toggleClass(className: String): ChaiJQuery = js.native
  def toggleClass(className: String, swtch: Boolean): ChaiJQuery = js.native
  /**
    * Add or remove one or more classes from each element in the set of matched elements, depending on either the class's presence or the value of the switch argument.
    *
    * @param func A function that returns class names to be toggled in the class attribute of each element in the matched set. Receives the index position of the element in the set, the old class value, and the switch as arguments.
    * @param swtch A boolean value to determine whether the class should be added or removed.
    */
  def toggleClass(func: js.Function3[/* index */ Double, /* className */ String, /* swtch */ Boolean, String]): ChaiJQuery = js.native
  def toggleClass(
    func: js.Function3[/* index */ Double, /* className */ String, /* swtch */ Boolean, String],
    swtch: Boolean
  ): ChaiJQuery = js.native
  def toggleClass(swtch: Boolean): ChaiJQuery = js.native
  /**
    * Execute all handlers and behaviors attached to the matched elements for the given event type.
    *
    * @param eventType A string containing a JavaScript event type, such as click or submit.
    * @param extraParameters Additional parameters to pass along to the event handler.
    */
  def trigger(eventType: String): ChaiJQuery = js.native
  def trigger(eventType: String, extraParameters: js.Array[_]): ChaiJQuery = js.native
  def trigger(eventType: String, extraParameters: Object): ChaiJQuery = js.native
  /**
    * Execute all handlers and behaviors attached to the matched elements for the given event type.
    *
    * @param event A jQuery.Event object.
    * @param extraParameters Additional parameters to pass along to the event handler.
    */
  def trigger(event: JQueryEventObject): ChaiJQuery = js.native
  def trigger(event: JQueryEventObject, extraParameters: js.Array[_]): ChaiJQuery = js.native
  def trigger(event: JQueryEventObject, extraParameters: Object): ChaiJQuery = js.native
  /**
    * Execute all handlers attached to an element for an event.
    *
    * @param eventType A string containing a JavaScript event type, such as click or submit.
    * @param extraParameters An array of additional parameters to pass along to the event handler.
    */
  def triggerHandler(eventType: String, extraParameters: js.Any*): Object = js.native
  /**
    * Remove a previously-attached event handler from the elements.
    *
    * @param eventType A string containing a JavaScript event type, such as click or submit.
    * @param handler The function that is to be no longer executed.
    */
  def unbind(): ChaiJQuery = js.native
  def unbind(eventType: String): ChaiJQuery = js.native
  /**
    * Remove a previously-attached event handler from the elements.
    *
    * @param eventType A string containing a JavaScript event type, such as click or submit.
    * @param fls Unbinds the corresponding 'return false' function that was bound using .bind( eventType, false ).
    */
  def unbind(eventType: String, fls: Boolean): ChaiJQuery = js.native
  def unbind(eventType: String, handler: js.Function1[/* eventObject */ JQueryEventObject, _]): ChaiJQuery = js.native
  /**
    * Remove a previously-attached event handler from the elements.
    *
    * @param evt A JavaScript event object as passed to an event handler.
    */
  def unbind(evt: js.Any): ChaiJQuery = js.native
  /**
    * Remove a handler from the event for all elements which match the current selector, based upon a specific set of root elements.
    */
  def undelegate(): ChaiJQuery = js.native
  /**
    * Remove a handler from the event for all elements which match the current selector, based upon a specific set of root elements.
    *
    * @param namespace A string containing a namespace to unbind all events from.
    */
  def undelegate(namespace: String): ChaiJQuery = js.native
  /**
    * Remove a handler from the event for all elements which match the current selector, based upon a specific set of root elements.
    *
    * @param selector A selector which will be used to filter the event results.
    * @param eventType A string containing a JavaScript event type, such as "click" or "keydown"
    * @param handler A function to execute at the time the event is triggered.
    */
  def undelegate(selector: String, eventType: String): ChaiJQuery = js.native
  def undelegate(selector: String, eventType: String, handler: js.Function1[/* eventObject */ JQueryEventObject, _]): ChaiJQuery = js.native
  /**
    * Remove a handler from the event for all elements which match the current selector, based upon a specific set of root elements.
    *
    * @param selector A selector which will be used to filter the event results.
    * @param events An object of one or more event types and previously bound functions to unbind from them.
    */
  def undelegate(selector: String, events: Object): ChaiJQuery = js.native
  /**
    * Bind an event handler to the "unload" JavaScript event. (DEPRECATED from v1.8)
    *
    * @param eventData A plain object of data that will be passed to the event handler.
    * @param handler A function to execute when the event is triggered.
    */
  def unload(): ChaiJQuery = js.native
  def unload(eventData: js.Any): ChaiJQuery = js.native
  def unload(eventData: js.Any, handler: js.Function1[/* eventObject */ JQueryEventObject, _]): ChaiJQuery = js.native
  /**
    * Bind an event handler to the "unload" JavaScript event. (DEPRECATED from v1.8)
    *
    * @param handler A function to execute when the event is triggered.
    */
  def unload(handler: js.Function1[/* eventObject */ JQueryEventObject, _]): ChaiJQuery = js.native
  /**
    * Remove the parents of the set of matched elements from the DOM, leaving the matched elements in their place.
    */
  def unwrap(): ChaiJQuery = js.native
  /**
    * Get the current value of the first element in the set of matched elements.
    */
  def `val`(): js.Any = js.native
  /**
    * Set the value of each element in the set of matched elements.
    *
    * @param func A function returning the value to set. this is the current element. Receives the index position of the element in the set and the old value as arguments.
    */
  def `val`(func: js.Function2[/* index */ Double, /* value */ String, String]): ChaiJQuery = js.native
  /**
    * Set the value of each element in the set of matched elements.
    *
    * @param value A string of text or an array of strings corresponding to the value of each matched element to set as selected/checked.
    */
  def `val`(value: String): ChaiJQuery = js.native
  def `val`(value: js.Array[String]): ChaiJQuery = js.native
  /**
    * Get the current computed width for the first element in the set of matched elements.
    */
  def width(): Double = js.native
  /**
    * Set the CSS width of each element in the set of matched elements.
    *
    * @param func A function returning the width to set. Receives the index position of the element in the set and the old width as arguments. Within the function, this refers to the current element in the set.
    */
  def width(func: js.Function2[/* index */ Double, /* width */ Double, Double | String]): ChaiJQuery = js.native
  def width(value: String): ChaiJQuery = js.native
  /**
    * Set the CSS width of each element in the set of matched elements.
    *
    * @param value An integer representing the number of pixels, or an integer along with an optional unit of measure appended (as a string).
    */
  def width(value: Double): ChaiJQuery = js.native
  /**
    * Wrap an HTML structure around each element in the set of matched elements.
    *
    * @param func A callback function returning the HTML content or jQuery object to wrap around the matched elements. Receives the index position of the element in the set as an argument. Within the function, this refers to the current element in the set.
    */
  def wrap(func: js.Function1[/* index */ Double, String | JQuery[HTMLElement]]): ChaiJQuery = js.native
  def wrap(wrappingElement: String): ChaiJQuery = js.native
  /**
    * Wrap an HTML structure around each element in the set of matched elements.
    *
    * @param wrappingElement A selector, element, HTML string, or jQuery object specifying the structure to wrap around the matched elements.
    */
  def wrap(wrappingElement: JQuery[HTMLElement]): ChaiJQuery = js.native
  def wrap(wrappingElement: Element): ChaiJQuery = js.native
  def wrapAll(func: js.Function1[/* index */ Double, String]): ChaiJQuery = js.native
  def wrapAll(wrappingElement: String): ChaiJQuery = js.native
  /**
    * Wrap an HTML structure around all elements in the set of matched elements.
    *
    * @param wrappingElement A selector, element, HTML string, or jQuery object specifying the structure to wrap around the matched elements.
    */
  def wrapAll(wrappingElement: JQuery[HTMLElement]): ChaiJQuery = js.native
  def wrapAll(wrappingElement: Element): ChaiJQuery = js.native
  /**
    * Wrap an HTML structure around the content of each element in the set of matched elements.
    *
    * @param func A callback function which generates a structure to wrap around the content of the matched elements. Receives the index position of the element in the set as an argument. Within the function, this refers to the current element in the set.
    */
  def wrapInner(func: js.Function1[/* index */ Double, String]): ChaiJQuery = js.native
  def wrapInner(wrappingElement: String): ChaiJQuery = js.native
  /**
    * Wrap an HTML structure around the content of each element in the set of matched elements.
    *
    * @param wrappingElement An HTML snippet, selector expression, jQuery object, or DOM element specifying the structure to wrap around the content of the matched elements.
    */
  def wrapInner(wrappingElement: JQuery[HTMLElement]): ChaiJQuery = js.native
  def wrapInner(wrappingElement: Element): ChaiJQuery = js.native
}

