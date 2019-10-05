package typings.cypress

import org.scalablytyped.runtime.NumberDictionary
import typings.cypress.JQuery.Ajax.TextStatus
import typings.cypress.JQuery.AjaxSettings
import typings.cypress.JQuery.Coordinates
import typings.cypress.JQuery.CoordinatesPartial
import typings.cypress.JQuery.Duration
import typings.cypress.JQuery.EffectsOptions
import typings.cypress.JQuery.Event
import typings.cypress.JQuery.EventHandler
import typings.cypress.JQuery.EventHandlerBase
import typings.cypress.JQuery.NameValuePair
import typings.cypress.JQuery.Node
import typings.cypress.JQuery.PlainObject
import typings.cypress.JQuery.Promise
import typings.cypress.JQuery.Queue
import typings.cypress.JQuery.QueueFunction
import typings.cypress.JQuery.Selector
import typings.cypress.JQuery.TypeOrArray
import typings.cypress.JQuery.htmlString
import typings.cypress.JQuery.jqXHR
import typings.cypress.cypressNumbers.`false`
import typings.std.ArrayLike
import typings.std.Comment
import typings.std.Document
import typings.std.Element
import typings.std.HTMLElement
import typings.std.Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSName("JQuery")
@js.native
trait JQuery_[TElement]
  extends Iterable[TElement]
     with /* n */ NumberDictionary[TElement] {
  /**
    * A string containing the jQuery version number.
    *
    * @see \`{@link https://api.jquery.com/jquery/ }\`
    * @since 1.0
    */
  var jquery: String = js.native
  /**
    * The number of elements in the jQuery object.
    *
    * @see \`{@link https://api.jquery.com/length/ }\`
    * @since 1.0
    */
  var length: Double = js.native
  /**
    * Create a new jQuery object with elements added to the set of matched elements.
    *
    * @param selector A string representing a selector expression to find additional elements to add to the set of matched elements.
    *                 One or more elements to add to the set of matched elements.
    *                 An HTML fragment to add to the set of matched elements.
    *                 An existing jQuery object to add to the set of matched elements.
    * @see \`{@link https://api.jquery.com/add/ }\`
    * @since 1.0
    * @since 1.3.2
    */
  def add(selector: Selector | TypeOrArray[Element] | htmlString): this.type = js.native
  def add(selector: JQuery[HTMLElement]): this.type = js.native
  /**
    * Create a new jQuery object with elements added to the set of matched elements.
    *
    * @param selector A string representing a selector expression to find additional elements to add to the set of matched elements.
    * @param context The point in the document at which the selector should begin matching; similar to the context
    *                argument of the $(selector, context) method.
    * @see \`{@link https://api.jquery.com/add/ }\`
    * @since 1.4
    */
  def add(selector: Selector, context: Element): this.type = js.native
  /**
    * Add the previous set of elements on the stack to the current set, optionally filtered by a selector.
    *
    * @param selector A string containing a selector expression to match the current set of elements against.
    * @see \`{@link https://api.jquery.com/addBack/ }\`
    * @since 1.8
    */
  def addBack(): this.type = js.native
  def addBack(selector: Selector): this.type = js.native
  def addClass(
    className: js.ThisFunction2[/* this */ TElement, /* index */ Double, /* currentClassName */ String, String]
  ): this.type = js.native
  /**
    * Adds the specified class(es) to each element in the set of matched elements.
    *
    * @param className One or more space-separated classes to be added to the class attribute of each matched element.
    *                  An array of classes to be added to the class attribute of each matched element.
    *                  A function returning one or more space-separated class names to be added to the existing class
    *                  name(s). Receives the index position of the element in the set and the existing class name(s) as
    *                  arguments. Within the function, this refers to the current element in the set.
    * @see \`{@link https://api.jquery.com/addClass/ }\`
    * @since 1.0
    * @since 1.4
    * @since 3.3
    */
  def addClass(className: TypeOrArray[String]): this.type = js.native
  /**
    * Insert content, specified by the parameter, after each element in the set of matched elements.
    *
    * @param contents One or more additional DOM elements, text nodes, arrays of elements and text nodes, HTML strings, or
    *                 jQuery objects to insert after each element in the set of matched elements.
    * @see \`{@link https://api.jquery.com/after/ }\`
    * @since 1.0
    */
  def after(contents: (htmlString | (TypeOrArray[Node | JQuery[Node]]))*): this.type = js.native
  /**
    * Insert content, specified by the parameter, after each element in the set of matched elements.
    *
    * @param fn A function that returns an HTML string, DOM element(s), text node(s), or jQuery object to insert
    *           after each element in the set of matched elements. Receives the index position of the element in the
    *           set and the old HTML value of the element as arguments. Within the function, this refers to the
    *           current element in the set.
    * @see \`{@link https://api.jquery.com/after/ }\`
    * @since 1.4
    * @since 1.10
    */
  def after(
    fn: js.ThisFunction2[
      /* this */ TElement, 
      /* index */ Double, 
      /* html */ String, 
      htmlString | (TypeOrArray[Node | JQuery[Node]])
    ]
  ): this.type = js.native
  /**
    * Register a handler to be called when Ajax requests complete. This is an AjaxEvent.
    *
    * @param handler The function to be invoked.
    * @see \`{@link https://api.jquery.com/ajaxComplete/ }\`
    * @since 1.0
    */
  @JSName("ajaxComplete")
  def ajaxComplete_false(
    handler: js.ThisFunction3[
      /* this */ Document, 
      /* event */ Event[Document, Null], 
      /* jqXHR */ jqXHR[_], 
      /* ajaxOptions */ AjaxSettings[_], 
      Unit | `false`
    ]
  ): this.type = js.native
  /**
    * Register a handler to be called when Ajax requests complete with an error. This is an Ajax Event.
    *
    * @param handler The function to be invoked.
    * @see \`{@link https://api.jquery.com/ajaxError/ }\`
    * @since 1.0
    */
  @JSName("ajaxError")
  def ajaxError_false(
    handler: js.ThisFunction4[
      /* this */ Document, 
      /* event */ Event[Document, Null], 
      /* jqXHR */ jqXHR[_], 
      /* ajaxSettings */ AjaxSettings[_], 
      /* thrownError */ String, 
      Unit | `false`
    ]
  ): this.type = js.native
  /**
    * Attach a function to be executed before an Ajax request is sent. This is an Ajax Event.
    *
    * @param handler The function to be invoked.
    * @see \`{@link https://api.jquery.com/ajaxSend/ }\`
    * @since 1.0
    */
  @JSName("ajaxSend")
  def ajaxSend_false(
    handler: js.ThisFunction3[
      /* this */ Document, 
      /* event */ Event[Document, Null], 
      /* jqXHR */ jqXHR[_], 
      /* ajaxOptions */ AjaxSettings[_], 
      Unit | `false`
    ]
  ): this.type = js.native
  /**
    * Register a handler to be called when the first Ajax request begins. This is an Ajax Event.
    *
    * @param handler The function to be invoked.
    * @see \`{@link https://api.jquery.com/ajaxStart/ }\`
    * @since 1.0
    */
  @JSName("ajaxStart")
  def ajaxStart_false(handler: js.ThisFunction0[/* this */ Document, Unit | `false`]): this.type = js.native
  /**
    * Register a handler to be called when all Ajax requests have completed. This is an Ajax Event.
    *
    * @param handler The function to be invoked.
    * @see \`{@link https://api.jquery.com/ajaxStop/ }\`
    * @since 1.0
    */
  @JSName("ajaxStop")
  def ajaxStop_false(handler: js.ThisFunction0[/* this */ Document, Unit | `false`]): this.type = js.native
  /**
    * Attach a function to be executed whenever an Ajax request completes successfully. This is an Ajax Event.
    *
    * @param handler The function to be invoked.
    * @see \`{@link https://api.jquery.com/ajaxSuccess/ }\`
    * @since 1.0
    */
  @JSName("ajaxSuccess")
  def ajaxSuccess_false(
    handler: js.ThisFunction4[
      /* this */ Document, 
      /* event */ Event[Document, Null], 
      /* jqXHR */ jqXHR[_], 
      /* ajaxOptions */ AjaxSettings[_], 
      /* data */ PlainObject[_], 
      Unit | `false`
    ]
  ): this.type = js.native
  /**
    * Perform a custom animation of a set of CSS properties.
    *
    * @param properties An object of CSS properties and values that the animation will move toward.
    * @param complete A function to call once the animation is complete, called once per matched element.
    * @see \`{@link https://api.jquery.com/animate/ }\`
    * @since 1.0
    */
  def animate(properties: PlainObject[_]): this.type = js.native
  def animate(properties: PlainObject[_], complete: js.ThisFunction0[/* this */ TElement, Unit]): this.type = js.native
  def animate(properties: PlainObject[_], duration_easing: String): this.type = js.native
  def animate(
    properties: PlainObject[_],
    duration_easing: String,
    complete: js.ThisFunction0[/* this */ TElement, Unit]
  ): this.type = js.native
  /**
    * Perform a custom animation of a set of CSS properties.
    *
    * @param properties An object of CSS properties and values that the animation will move toward.
    * @param duration_easing A string or number determining how long the animation will run.
    *                        A string indicating which easing function to use for the transition.
    * @param complete A function to call once the animation is complete, called once per matched element.
    * @see \`{@link https://api.jquery.com/animate/ }\`
    * @since 1.0
    */
  def animate(properties: PlainObject[_], duration_easing: Duration): this.type = js.native
  def animate(
    properties: PlainObject[_],
    duration_easing: Duration,
    complete: js.ThisFunction0[/* this */ TElement, Unit]
  ): this.type = js.native
  /**
    * Perform a custom animation of a set of CSS properties.
    *
    * @param properties An object of CSS properties and values that the animation will move toward.
    * @param duration A string or number determining how long the animation will run.
    * @param easing A string indicating which easing function to use for the transition.
    * @param complete A function to call once the animation is complete, called once per matched element.
    * @see \`{@link https://api.jquery.com/animate/ }\`
    * @since 1.0
    */
  def animate(properties: PlainObject[_], duration: Duration, easing: String): this.type = js.native
  def animate(
    properties: PlainObject[_],
    duration: Duration,
    easing: String,
    complete: js.ThisFunction0[/* this */ TElement, Unit]
  ): this.type = js.native
  /**
    * Perform a custom animation of a set of CSS properties.
    *
    * @param properties An object of CSS properties and values that the animation will move toward.
    * @param options A map of additional options to pass to the method.
    * @see \`{@link https://api.jquery.com/animate/ }\`
    * @since 1.0
    */
  def animate(properties: PlainObject[_], options: EffectsOptions[TElement]): this.type = js.native
  /**
    * Insert content, specified by the parameter, to the end of each element in the set of matched elements.
    *
    * @param contents One or more additional DOM elements, text nodes, arrays of elements and text nodes, HTML strings, or
    *                 jQuery objects to insert at the end of each element in the set of matched elements.
    * @see \`{@link https://api.jquery.com/append/ }\`
    * @since 1.0
    */
  def append(contents: (htmlString | (TypeOrArray[Node | JQuery[Node]]))*): this.type = js.native
  /**
    * Insert content, specified by the parameter, to the end of each element in the set of matched elements.
    *
    * @param fn A function that returns an HTML string, DOM element(s), text node(s), or jQuery object to insert at
    *           the end of each element in the set of matched elements. Receives the index position of the element
    *           in the set and the old HTML value of the element as arguments. Within the function, this refers to
    *           the current element in the set.
    * @see \`{@link https://api.jquery.com/append/ }\`
    * @since 1.4
    */
  def append(
    fn: js.ThisFunction2[
      /* this */ TElement, 
      /* index */ Double, 
      /* html */ String, 
      htmlString | (TypeOrArray[Node | JQuery[Node]])
    ]
  ): this.type = js.native
  /**
    * Insert every element in the set of matched elements to the end of the target.
    *
    * @param target A selector, element, HTML string, array of elements, or jQuery object; the matched set of elements
    *               will be inserted at the end of the element(s) specified by this parameter.
    * @see \`{@link https://api.jquery.com/appendTo/ }\`
    * @since 1.0
    */
  def appendTo(target: Selector | TypeOrArray[Element] | htmlString): this.type = js.native
  def appendTo(target: JQuery[HTMLElement]): this.type = js.native
  /**
    * Get the value of an attribute for the first element in the set of matched elements.
    *
    * @param attributeName The name of the attribute to get.
    * @see \`{@link https://api.jquery.com/attr/ }\`
    * @since 1.0
    */
  def attr(attributeName: String): js.UndefOr[String] = js.native
  /**
    * Set one or more attributes for the set of matched elements.
    *
    * @param attributeName The name of the attribute to set.
    * @param value A value to set for the attribute. If null, the specified attribute will be removed (as in .removeAttr()).
    *              A function returning the value to set. this is the current element. Receives the index position of
    *              the element in the set and the old attribute value as arguments.
    * @see \`{@link https://api.jquery.com/attr/ }\`
    * @since 1.0
    * @since 1.1
    */
  def attr(attributeName: String, value: String): this.type = js.native
  def attr(
    attributeName: String,
    value: js.ThisFunction2[
      /* this */ TElement, 
      /* index */ Double, 
      /* attr */ String, 
      js.UndefOr[String | Double | Unit]
    ]
  ): this.type = js.native
  def attr(attributeName: String, value: Double): this.type = js.native
  /**
    * Set one or more attributes for the set of matched elements.
    *
    * @param attributes An object of attribute-value pairs to set.
    * @see \`{@link https://api.jquery.com/attr/ }\`
    * @since 1.0
    */
  def attr(attributes: PlainObject[_]): this.type = js.native
  @JSName("attr")
  def attr_This(attributeName: String): this.type = js.native
  /**
    * Insert content, specified by the parameter, before each element in the set of matched elements.
    *
    * @param contents One or more additional DOM elements, text nodes, arrays of elements and text nodes, HTML strings, or
    *                 jQuery objects to insert before each element in the set of matched elements.
    * @see \`{@link https://api.jquery.com/before/ }\`
    * @since 1.0
    */
  def before(contents: (htmlString | (TypeOrArray[Node | JQuery[Node]]))*): this.type = js.native
  /**
    * Insert content, specified by the parameter, before each element in the set of matched elements.
    *
    * @param fn A function that returns an HTML string, DOM element(s), text node(s), or jQuery object to insert
    *           before each element in the set of matched elements. Receives the index position of the element in
    *           the set and the old HTML value of the element as arguments. Within the function, this refers to the
    *           current element in the set.
    * @see \`{@link https://api.jquery.com/before/ }\`
    * @since 1.4
    * @since 1.10
    */
  def before(
    fn: js.ThisFunction2[
      /* this */ TElement, 
      /* index */ Double, 
      /* html */ String, 
      htmlString | (TypeOrArray[Node | JQuery[Node]])
    ]
  ): this.type = js.native
  def bind(eventType: String): this.type = js.native
  /**
    * Attach a handler to an event for the elements.
    *
    * @param eventType A string containing one or more DOM event types, such as "click" or "submit," or custom event names.
    * @param handler A function to execute each time the event is triggered.
    *                Setting the second argument to false will attach a function that prevents the default action from
    *                occurring and stops the event from bubbling.
    * @see \`{@link https://api.jquery.com/bind/ }\`
    * @since 1.0
    * @since 1.4.3
    *
    * @deprecated Deprecated since 3.0. Use \`{@link JQuery.on }\`.
    */
  def bind(
    eventType: String,
    handler: (EventHandler[TElement, Null]) | (EventHandlerBase[_, Event[TElement, Null]])
  ): this.type = js.native
  // [bind() overloads] https://github.com/jquery/api.jquery.com/issues/1048
  /**
    * Attach a handler to an event for the elements.
    *
    * @param eventType A string containing one or more DOM event types, such as "click" or "submit," or custom event names.
    * @param eventData An object containing data that will be passed to the event handler.
    * @param handler A function to execute each time the event is triggered.
    * @see \`{@link https://api.jquery.com/bind/ }\`
    * @since 1.0
    * @since 1.4.3
    *
    * @deprecated Deprecated since 3.0. Use \`{@link JQuery.on }\`.
    */
  def bind[TData](
    eventType: String,
    eventData: TData,
    handler: (EventHandler[TElement, TData]) | (EventHandlerBase[_, Event[TElement, TData]])
  ): this.type = js.native
  @JSName("bind")
  def bind_false(eventType: String, handler: `false`): this.type = js.native
  /**
    * Attach a handler to an event for the elements.
    *
    * @param events An object containing one or more DOM event types and functions to execute for them.
    * @see \`{@link https://api.jquery.com/bind/ }\`
    * @since 1.4
    *
    * @deprecated Deprecated since 3.0. Use \`{@link JQuery.on }\`.
    */
  @JSName("bind")
  def bind_false(
    events: PlainObject[
      (EventHandler[TElement, Null]) | (EventHandlerBase[_, Event[TElement, Null]]) | `false`
    ]
  ): this.type = js.native
  /**
    * Bind an event handler to the "blur" JavaScript event, or trigger that event on an element.
    *
    * @param handler A function to execute each time the event is triggered.
    * @see \`{@link https://api.jquery.com/blur/ }\`
    * @since 1.0
    *
    * @deprecated Deprecated since 3.3. Use \`{@link JQuery.on }\` or \`{@link JQuery.trigger }\`.
    */
  def blur(): this.type = js.native
  def blur(handler: (EventHandler[TElement, Null]) | (EventHandlerBase[_, Event[TElement, Null]])): this.type = js.native
  /**
    * Bind an event handler to the "blur" JavaScript event, or trigger that event on an element.
    *
    * @param eventData An object containing data that will be passed to the event handler.
    * @param handler A function to execute each time the event is triggered.
    * @see \`{@link https://api.jquery.com/blur/ }\`
    * @since 1.4.3
    *
    * @deprecated Deprecated since 3.3. Use \`{@link JQuery.on }\` or \`{@link JQuery.trigger }\`.
    */
  def blur[TData](
    eventData: TData,
    handler: (EventHandler[TElement, TData]) | (EventHandlerBase[_, Event[TElement, TData]])
  ): this.type = js.native
  @JSName("blur")
  def blur_false(handler: `false`): this.type = js.native
  /**
    * Bind an event handler to the "change" JavaScript event, or trigger that event on an element.
    *
    * @param handler A function to execute each time the event is triggered.
    * @see \`{@link https://api.jquery.com/change/ }\`
    * @since 1.0
    *
    * @deprecated Deprecated since 3.3. Use \`{@link JQuery.on }\` or \`{@link JQuery.trigger }\`.
    */
  def change(): this.type = js.native
  def change(handler: (EventHandler[TElement, Null]) | (EventHandlerBase[_, Event[TElement, Null]])): this.type = js.native
  /**
    * Bind an event handler to the "change" JavaScript event, or trigger that event on an element.
    *
    * @param eventData An object containing data that will be passed to the event handler.
    * @param handler A function to execute each time the event is triggered.
    * @see \`{@link https://api.jquery.com/change/ }\`
    * @since 1.4.3
    *
    * @deprecated Deprecated since 3.3. Use \`{@link JQuery.on }\` or \`{@link JQuery.trigger }\`.
    */
  def change[TData](
    eventData: TData,
    handler: (EventHandler[TElement, TData]) | (EventHandlerBase[_, Event[TElement, TData]])
  ): this.type = js.native
  @JSName("change")
  def change_false(handler: `false`): this.type = js.native
  /**
    * Get the children of each element in the set of matched elements, optionally filtered by a selector.
    *
    * @param selector A string containing a selector expression to match elements against.
    * @see \`{@link https://api.jquery.com/children/ }\`
    * @since 1.0
    */
  def children(): this.type = js.native
  def children(selector: Selector): this.type = js.native
  /**
    * Remove from the queue all items that have not yet been run.
    *
    * @param queueName A string containing the name of the queue. Defaults to fx, the standard effects queue.
    * @see \`{@link https://api.jquery.com/clearQueue/ }\`
    * @since 1.4
    */
  def clearQueue(): this.type = js.native
  def clearQueue(queueName: String): this.type = js.native
  /**
    * Bind an event handler to the "click" JavaScript event, or trigger that event on an element.
    *
    * @param handler A function to execute each time the event is triggered.
    * @see \`{@link https://api.jquery.com/click/ }\`
    * @since 1.0
    *
    * @deprecated Deprecated since 3.3. Use \`{@link JQuery.on }\` or \`{@link JQuery.trigger }\`.
    */
  def click(): this.type = js.native
  def click(handler: (EventHandler[TElement, Null]) | (EventHandlerBase[_, Event[TElement, Null]])): this.type = js.native
  /**
    * Bind an event handler to the "click" JavaScript event, or trigger that event on an element.
    *
    * @param eventData An object containing data that will be passed to the event handler.
    * @param handler A function to execute each time the event is triggered.
    * @see \`{@link https://api.jquery.com/click/ }\`
    * @since 1.4.3
    *
    * @deprecated Deprecated since 3.3. Use \`{@link JQuery.on }\` or \`{@link JQuery.trigger }\`.
    */
  def click[TData](
    eventData: TData,
    handler: (EventHandler[TElement, TData]) | (EventHandlerBase[_, Event[TElement, TData]])
  ): this.type = js.native
  @JSName("click")
  def click_false(handler: `false`): this.type = js.native
  def clone(withDataAndEvents: Boolean): this.type = js.native
  def clone(withDataAndEvents: Boolean, deepWithDataAndEvents: Boolean): this.type = js.native
  def closest(selector: JQuery[HTMLElement]): this.type = js.native
  /**
    * For each element in the set, get the first element that matches the selector by testing the element
    * itself and traversing up through its ancestors in the DOM tree.
    *
    * @param selector A string containing a selector expression to match elements against.
    *                 A jQuery object to match elements against.
    *                 An element to match elements against.
    * @see \`{@link https://api.jquery.com/closest/ }\`
    * @since 1.3
    * @since 1.6
    */
  def closest(selector: Selector): this.type = js.native
  /**
    * For each element in the set, get the first element that matches the selector by testing the element
    * itself and traversing up through its ancestors in the DOM tree.
    *
    * @param selector A string containing a selector expression to match elements against.
    * @param context A DOM element within which a matching element may be found.
    * @see \`{@link https://api.jquery.com/closest/ }\`
    * @since 1.4
    */
  def closest(selector: Selector, context: Element): this.type = js.native
  def closest(selector: Element): this.type = js.native
  /**
    * Get the children of each element in the set of matched elements, including text and comment nodes.
    *
    * @see \`{@link https://api.jquery.com/contents/ }\`
    * @since 1.2
    */
  def contents(): JQuery[TElement | Text | Comment] = js.native
  /**
    * Bind an event handler to the "contextmenu" JavaScript event, or trigger that event on an element.
    *
    * @param handler A function to execute each time the event is triggered.
    * @see \`{@link https://api.jquery.com/contextmenu/ }\`
    * @since 1.0
    *
    * @deprecated Deprecated since 3.3. Use \`{@link JQuery.on }\` or \`{@link JQuery.trigger }\`.
    */
  def contextmenu(): this.type = js.native
  def contextmenu(handler: (EventHandler[TElement, Null]) | (EventHandlerBase[_, Event[TElement, Null]])): this.type = js.native
  /**
    * Bind an event handler to the "contextmenu" JavaScript event, or trigger that event on an element.
    *
    * @param eventData An object containing data that will be passed to the event handler.
    * @param handler A function to execute each time the event is triggered.
    * @see \`{@link https://api.jquery.com/contextmenu/ }\`
    * @since 1.4.3
    *
    * @deprecated Deprecated since 3.3. Use \`{@link JQuery.on }\` or \`{@link JQuery.trigger }\`.
    */
  def contextmenu[TData](
    eventData: TData,
    handler: (EventHandler[TElement, TData]) | (EventHandlerBase[_, Event[TElement, TData]])
  ): this.type = js.native
  @JSName("contextmenu")
  def contextmenu_false(handler: `false`): this.type = js.native
  /**
    * Set one or more CSS properties for the set of matched elements.
    *
    * @param properties An object of property-value pairs to set.
    * @see \`{@link https://api.jquery.com/css/ }\`
    * @since 1.0
    */
  def css(
    properties: PlainObject[
      String | Double | (js.ThisFunction2[
        /* this */ TElement, 
        /* index */ Double, 
        /* value */ String, 
        js.UndefOr[String | Double | Unit]
      ])
    ]
  ): this.type = js.native
  /**
    * Get the computed style properties for the first element in the set of matched elements.
    *
    * @param propertyName A CSS property.
    *                     An array of one or more CSS properties.
    * @see \`{@link https://api.jquery.com/css/ }\`
    * @since 1.0
    */
  def css(propertyName: String): String = js.native
  /**
    * Set one or more CSS properties for the set of matched elements.
    *
    * @param propertyName A CSS property name.
    * @param value A value to set for the property.
    *              A function returning the value to set. this is the current element. Receives the index position of
    *              the element in the set and the old value as arguments.
    * @see \`{@link https://api.jquery.com/css/ }\`
    * @since 1.0
    * @since 1.4
    */
  def css(propertyName: String, value: String): this.type = js.native
  def css(
    propertyName: String,
    value: js.ThisFunction2[
      /* this */ TElement, 
      /* index */ Double, 
      /* value */ String, 
      js.UndefOr[String | Double | Unit]
    ]
  ): this.type = js.native
  def css(propertyName: String, value: Double): this.type = js.native
  /**
    * Get the computed style properties for the first element in the set of matched elements.
    *
    * @param propertyNames An array of one or more CSS properties.
    * @see \`{@link https://api.jquery.com/css/ }\`
    * @since 1.9
    */
  def css(propertyNames: js.Array[String]): PlainObject[String] = js.native
  /**
    * Return the value at the named data store for the first element in the jQuery collection, as set by
    * data(name, value) or by an HTML5 data-* attribute.
    *
    * @see \`{@link https://api.jquery.com/data/ }\`
    * @since 1.4
    */
  def data(): PlainObject[_] = js.native
  /**
    * Return the value at the named data store for the first element in the jQuery collection, as set by
    * data(name, value) or by an HTML5 data-* attribute.
    *
    * @param key Name of the data stored.
    * @see \`{@link https://api.jquery.com/data/ }\`
    * @since 1.2.3
    */
  def data(key: String): js.Any = js.native
   // tslint:disable-line:unified-signatures
  /**
    * Store arbitrary data associated with the matched elements.
    *
    * @param key A string naming the piece of data to set.
    * @param value The new data value; this can be any Javascript type except undefined.
    * @see \`{@link https://api.jquery.com/data/ }\`
    * @since 1.2.3
    */
  def data(key: String, value: js.Any): this.type = js.native
  /**
    * Store arbitrary data associated with the matched elements.
    *
    * @param obj An object of key-value pairs of data to update.
    * @see \`{@link https://api.jquery.com/data/ }\`
    * @since 1.4.3
    */
  def data(obj: PlainObject[_]): this.type = js.native
  /**
    * Bind an event handler to the "dblclick" JavaScript event, or trigger that event on an element.
    *
    * @param handler A function to execute each time the event is triggered.
    * @see \`{@link https://api.jquery.com/dblclick/ }\`
    * @since 1.0
    *
    * @deprecated Deprecated since 3.3. Use \`{@link JQuery.on }\` or \`{@link JQuery.trigger }\`.
    */
  def dblclick(): this.type = js.native
  def dblclick(handler: (EventHandler[TElement, Null]) | (EventHandlerBase[_, Event[TElement, Null]])): this.type = js.native
  /**
    * Bind an event handler to the "dblclick" JavaScript event, or trigger that event on an element.
    *
    * @param eventData An object containing data that will be passed to the event handler.
    * @param handler A function to execute each time the event is triggered.
    * @see \`{@link https://api.jquery.com/dblclick/ }\`
    * @since 1.4.3
    *
    * @deprecated Deprecated since 3.3. Use \`{@link JQuery.on }\` or \`{@link JQuery.trigger }\`.
    */
  def dblclick[TData](
    eventData: TData,
    handler: (EventHandler[TElement, TData]) | (EventHandlerBase[_, Event[TElement, TData]])
  ): this.type = js.native
  @JSName("dblclick")
  def dblclick_false(handler: `false`): this.type = js.native
  /**
    * Set a timer to delay execution of subsequent items in the queue.
    *
    * @param duration An integer indicating the number of milliseconds to delay execution of the next item in the queue.
    * @param queueName A string containing the name of the queue. Defaults to fx, the standard effects queue.
    * @see \`{@link https://api.jquery.com/delay/ }\`
    * @since 1.4
    */
  def delay(duration: Duration): this.type = js.native
  def delay(duration: Duration, queueName: String): this.type = js.native
  /**
    * Attach a handler to one or more events for all elements that match the selector, now or in the
    * future, based on a specific set of root elements.
    *
    * @param selector A selector to filter the elements that trigger the event.
    * @param eventType A string containing one or more space-separated JavaScript event types, such as "click" or
    *                  "keydown," or custom event names.
    * @param handler A function to execute each time the event is triggered.
    * @see \`{@link https://api.jquery.com/delegate/ }\`
    * @since 1.4.2
    *
    * @deprecated Deprecated since 3.0. Use \`{@link JQuery.on }\`.
    */
  def delegate(
    selector: Selector,
    eventType: String,
    handler: (EventHandler[TElement, Null]) | (EventHandlerBase[_, Event[TElement, Null]])
  ): this.type = js.native
  /**
    * Attach a handler to one or more events for all elements that match the selector, now or in the
    * future, based on a specific set of root elements.
    *
    * @param selector A selector to filter the elements that trigger the event.
    * @param eventType A string containing one or more space-separated JavaScript event types, such as "click" or
    *                  "keydown," or custom event names.
    * @param eventData An object containing data that will be passed to the event handler.
    * @param handler A function to execute each time the event is triggered.
    * @see \`{@link https://api.jquery.com/delegate/ }\`
    * @since 1.4.2
    *
    * @deprecated Deprecated since 3.0. Use \`{@link JQuery.on }\`.
    */
  def delegate[TData](
    selector: Selector,
    eventType: String,
    eventData: TData,
    handler: (EventHandler[TElement, TData]) | (EventHandlerBase[_, Event[TElement, TData]])
  ): this.type = js.native
  @JSName("delegate")
  def delegate_false(selector: Selector, eventType: String, handler: `false`): this.type = js.native
  /**
    * Attach a handler to one or more events for all elements that match the selector, now or in the
    * future, based on a specific set of root elements.
    *
    * @param selector A selector to filter the elements that trigger the event.
    * @param events A plain object of one or more event types and functions to execute for them.
    * @see \`{@link https://api.jquery.com/delegate/ }\`
    * @since 1.4.3
    *
    * @deprecated Deprecated since 3.0. Use \`{@link JQuery.on }\`.
    */
  @JSName("delegate")
  def delegate_false(
    selector: Selector,
    events: PlainObject[
      (EventHandler[TElement, Null]) | (EventHandlerBase[_, Event[TElement, Null]]) | `false`
    ]
  ): this.type = js.native
  /**
    * Execute the next function on the queue for the matched elements.
    *
    * @param queueName A string containing the name of the queue. Defaults to fx, the standard effects queue.
    * @see \`{@link https://api.jquery.com/dequeue/ }\`
    * @since 1.2
    */
  def dequeue(): this.type = js.native
  def dequeue(queueName: String): this.type = js.native
  /**
    * Remove the set of matched elements from the DOM.
    *
    * @param selector A selector expression that filters the set of matched elements to be removed.
    * @see \`{@link https://api.jquery.com/detach/ }\`
    * @since 1.4
    */
  def detach(): this.type = js.native
  def detach(selector: Selector): this.type = js.native
  /**
    * Iterate over a jQuery object, executing a function for each matched element.
    *
    * @param fn A function to execute for each matched element.
    * @see \`{@link https://api.jquery.com/each/ }\`
    * @since 1.0
    */
  @JSName("each")
  def each_false(
    fn: js.ThisFunction2[/* this */ TElement, /* index */ Double, /* element */ TElement, Unit | `false`]
  ): this.type = js.native
  /**
    * Remove all child nodes of the set of matched elements from the DOM.
    *
    * @see \`{@link https://api.jquery.com/empty/ }\`
    * @since 1.0
    */
  def empty(): this.type = js.native
  /**
    * End the most recent filtering operation in the current chain and return the set of matched elements
    * to its previous state.
    *
    * @see \`{@link https://api.jquery.com/end/ }\`
    * @since 1.0
    */
  def end(): this.type = js.native
  /**
    * Reduce the set of matched elements to the one at the specified index.
    *
    * @param index An integer indicating the 0-based position of the element.
    *              An integer indicating the position of the element, counting backwards from the last element in the set.
    * @see \`{@link https://api.jquery.com/eq/ }\`
    * @since 1.1.2
    * @since 1.4
    */
  def eq(index: Double): this.type = js.native
  /**
    * Merge the contents of an object onto the jQuery prototype to provide new jQuery instance methods.
    *
    * @param obj An object to merge onto the jQuery prototype.
    * @see \`{@link https://api.jquery.com/jQuery.fn.extend/ }\`
    * @since 1.0
    */
  def extend(obj: js.Object): this.type = js.native
  /**
    * Display the matched elements by fading them to opaque.
    *
    * @param duration_easing_complete_options A string or number determining how long the animation will run.
    *                                         A string indicating which easing function to use for the transition.
    *                                         A function to call once the animation is complete, called once per matched element.
    *                                         A map of additional options to pass to the method.
    * @see \`{@link https://api.jquery.com/fadeIn/ }\`
    * @since 1.0
    * @since 1.4.3
    */
  def fadeIn(): this.type = js.native
  def fadeIn(duration_easing_complete_options: String): this.type = js.native
  def fadeIn(duration_easing_complete_options: js.ThisFunction0[/* this */ TElement, Unit]): this.type = js.native
  def fadeIn(duration_easing_complete_options: Duration): this.type = js.native
  def fadeIn(duration_easing_complete_options: EffectsOptions[TElement]): this.type = js.native
  def fadeIn(duration_easing: String, complete: js.ThisFunction0[/* this */ TElement, Unit]): this.type = js.native
  /**
    * Display the matched elements by fading them to opaque.
    *
    * @param duration_easing A string or number determining how long the animation will run.
    *                        A string indicating which easing function to use for the transition.
    * @param complete A function to call once the animation is complete, called once per matched element.
    * @see \`{@link https://api.jquery.com/fadeIn/ }\`
    * @since 1.0
    * @since 1.4.3
    */
  def fadeIn(duration_easing: Duration, complete: js.ThisFunction0[/* this */ TElement, Unit]): this.type = js.native
  /**
    * Display the matched elements by fading them to opaque.
    *
    * @param duration A string or number determining how long the animation will run.
    * @param easing A string indicating which easing function to use for the transition.
    * @param complete A function to call once the animation is complete, called once per matched element.
    * @see \`{@link https://api.jquery.com/fadeIn/ }\`
    * @since 1.4.3
    */
  def fadeIn(duration: Duration, easing: String): this.type = js.native
  def fadeIn(duration: Duration, easing: String, complete: js.ThisFunction0[/* this */ TElement, Unit]): this.type = js.native
  /**
    * Hide the matched elements by fading them to transparent.
    *
    * @param duration_easing_complete_options A string or number determining how long the animation will run.
    *                                         A string indicating which easing function to use for the transition.
    *                                         A function to call once the animation is complete, called once per matched element.
    *                                         A map of additional options to pass to the method.
    * @see \`{@link https://api.jquery.com/fadeOut/ }\`
    * @since 1.0
    * @since 1.4.3
    */
  def fadeOut(): this.type = js.native
  def fadeOut(duration_easing_complete_options: String): this.type = js.native
  def fadeOut(duration_easing_complete_options: js.ThisFunction0[/* this */ TElement, Unit]): this.type = js.native
  def fadeOut(duration_easing_complete_options: Duration): this.type = js.native
  def fadeOut(duration_easing_complete_options: EffectsOptions[TElement]): this.type = js.native
  def fadeOut(duration_easing: String, complete: js.ThisFunction0[/* this */ TElement, Unit]): this.type = js.native
  /**
    * Hide the matched elements by fading them to transparent.
    *
    * @param duration_easing A string or number determining how long the animation will run.
    *                        A string indicating which easing function to use for the transition.
    * @param complete A function to call once the animation is complete, called once per matched element.
    * @see \`{@link https://api.jquery.com/fadeOut/ }\`
    * @since 1.0
    * @since 1.4.3
    */
  def fadeOut(duration_easing: Duration, complete: js.ThisFunction0[/* this */ TElement, Unit]): this.type = js.native
  /**
    * Hide the matched elements by fading them to transparent.
    *
    * @param duration A string or number determining how long the animation will run.
    * @param easing A string indicating which easing function to use for the transition.
    * @param complete A function to call once the animation is complete, called once per matched element.
    * @see \`{@link https://api.jquery.com/fadeOut/ }\`
    * @since 1.4.3
    */
  def fadeOut(duration: Duration, easing: String): this.type = js.native
  def fadeOut(duration: Duration, easing: String, complete: js.ThisFunction0[/* this */ TElement, Unit]): this.type = js.native
  /**
    * Adjust the opacity of the matched elements.
    *
    * @param duration A string or number determining how long the animation will run.
    * @param opacity A number between 0 and 1 denoting the target opacity.
    * @param complete A function to call once the animation is complete, called once per matched element.
    * @see \`{@link https://api.jquery.com/fadeTo/ }\`
    * @since 1.0
    */
  def fadeTo(duration: Duration, opacity: Double): this.type = js.native
  def fadeTo(duration: Duration, opacity: Double, complete: js.ThisFunction0[/* this */ TElement, Unit]): this.type = js.native
  /**
    * Adjust the opacity of the matched elements.
    *
    * @param duration A string or number determining how long the animation will run.
    * @param opacity A number between 0 and 1 denoting the target opacity.
    * @param easing A string indicating which easing function to use for the transition.
    * @param complete A function to call once the animation is complete, called once per matched element.
    * @see \`{@link https://api.jquery.com/fadeTo/ }\`
    * @since 1.4.3
    */
  def fadeTo(duration: Duration, opacity: Double, easing: String): this.type = js.native
  def fadeTo(
    duration: Duration,
    opacity: Double,
    easing: String,
    complete: js.ThisFunction0[/* this */ TElement, Unit]
  ): this.type = js.native
  /**
    * Display or hide the matched elements by animating their opacity.
    *
    * @param duration_easing_complete_options A string or number determining how long the animation will run.
    *                                         A string indicating which easing function to use for the transition.
    *                                         A function to call once the animation is complete, called once per matched element.
    *                                         A map of additional options to pass to the method.
    * @see \`{@link https://api.jquery.com/fadeToggle/ }\`
    * @since 1.0
    * @since 1.4.3
    */
  def fadeToggle(): this.type = js.native
  def fadeToggle(duration_easing_complete_options: String): this.type = js.native
  def fadeToggle(duration_easing_complete_options: js.ThisFunction0[/* this */ TElement, Unit]): this.type = js.native
  def fadeToggle(duration_easing_complete_options: Duration): this.type = js.native
  def fadeToggle(duration_easing_complete_options: EffectsOptions[TElement]): this.type = js.native
  def fadeToggle(duration_easing: String, complete: js.ThisFunction0[/* this */ TElement, Unit]): this.type = js.native
  /**
    * Display or hide the matched elements by animating their opacity.
    *
    * @param duration_easing A string or number determining how long the animation will run.
    *                        A string indicating which easing function to use for the transition.
    * @param complete A function to call once the animation is complete, called once per matched element.
    * @see \`{@link https://api.jquery.com/fadeToggle/ }\`
    * @since 1.0
    * @since 1.4.3
    */
  def fadeToggle(duration_easing: Duration, complete: js.ThisFunction0[/* this */ TElement, Unit]): this.type = js.native
  /**
    * Display or hide the matched elements by animating their opacity.
    *
    * @param duration A string or number determining how long the animation will run.
    * @param easing A string indicating which easing function to use for the transition.
    * @param complete A function to call once the animation is complete, called once per matched element.
    * @see \`{@link https://api.jquery.com/fadeToggle/ }\`
    * @since 1.4.4
    */
  def fadeToggle(duration: Duration, easing: String): this.type = js.native
  def fadeToggle(duration: Duration, easing: String, complete: js.ThisFunction0[/* this */ TElement, Unit]): this.type = js.native
  def filter(
    selector: js.ThisFunction2[/* this */ TElement, /* index */ Double, /* element */ TElement, Boolean]
  ): this.type = js.native
  def filter(selector: JQuery[HTMLElement]): this.type = js.native
  /**
    * Reduce the set of matched elements to those that match the selector or pass the function's test.
    *
    * @param selector A string containing a selector expression to match the current set of elements against.
    *                 One or more DOM elements to match the current set of elements against.
    *                 An existing jQuery object to match the current set of elements against.
    *                 A function used as a test for each element in the set. this is the current DOM element.
    * @see \`{@link https://api.jquery.com/filter/ }\`
    * @since 1.0
    * @since 1.4
    */
  def filter(selector: Selector): this.type = js.native
  def filter(selector: TypeOrArray[Element]): this.type = js.native
  def find(selector: JQuery[HTMLElement]): this.type = js.native
  /**
    * Get the descendants of each element in the current set of matched elements, filtered by a selector,
    * jQuery object, or element.
    *
    * @param selector A string containing a selector expression to match elements against.
    *                 An element or a jQuery object to match elements against.
    * @see \`{@link https://api.jquery.com/find/ }\`
    * @since 1.0
    * @since 1.6
    */
  def find(selector: Selector): this.type = js.native
  def find(selector: Element): this.type = js.native
  /**
    * Stop the currently-running animation, remove all queued animations, and complete all animations for
    * the matched elements.
    *
    * @param queue The name of the queue in which to stop animations.
    * @see \`{@link https://api.jquery.com/finish/ }\`
    * @since 1.9
    */
  def finish(): this.type = js.native
  def finish(queue: String): this.type = js.native
  /**
    * Reduce the set of matched elements to the first in the set.
    *
    * @see \`{@link https://api.jquery.com/first/ }\`
    * @since 1.4
    */
  def first(): this.type = js.native
  /**
    * Bind an event handler to the "focus" JavaScript event, or trigger that event on an element.
    *
    * @param handler A function to execute each time the event is triggered.
    * @see \`{@link https://api.jquery.com/focus/ }\`
    * @since 1.0
    *
    * @deprecated Deprecated since 3.3. Use \`{@link JQuery.on }\` or \`{@link JQuery.trigger }\`.
    */
  def focus(): this.type = js.native
  def focus(handler: (EventHandler[TElement, Null]) | (EventHandlerBase[_, Event[TElement, Null]])): this.type = js.native
  /**
    * Bind an event handler to the "focus" JavaScript event, or trigger that event on an element.
    *
    * @param eventData An object containing data that will be passed to the event handler.
    * @param handler A function to execute each time the event is triggered.
    * @see \`{@link https://api.jquery.com/focus/ }\`
    * @since 1.4.3
    *
    * @deprecated Deprecated since 3.3. Use \`{@link JQuery.on }\` or \`{@link JQuery.trigger }\`.
    */
  def focus[TData](
    eventData: TData,
    handler: (EventHandler[TElement, TData]) | (EventHandlerBase[_, Event[TElement, TData]])
  ): this.type = js.native
  @JSName("focus")
  def focus_false(handler: `false`): this.type = js.native
  /**
    * Bind an event handler to the "focusin" event.
    *
    * @param handler A function to execute each time the event is triggered.
    * @see \`{@link https://api.jquery.com/focusin/ }\`
    * @since 1.4
    *
    * @deprecated Deprecated since 3.3. Use \`{@link JQuery.on }\` or \`{@link JQuery.trigger }\`.
    */
  def focusin(): this.type = js.native
  def focusin(handler: (EventHandler[TElement, Null]) | (EventHandlerBase[_, Event[TElement, Null]])): this.type = js.native
  /**
    * Bind an event handler to the "focusin" event.
    *
    * @param eventData An object containing data that will be passed to the event handler.
    * @param handler A function to execute each time the event is triggered.
    * @see \`{@link https://api.jquery.com/focusin/ }\`
    * @since 1.4.3
    *
    * @deprecated Deprecated since 3.3. Use \`{@link JQuery.on }\` or \`{@link JQuery.trigger }\`.
    */
  def focusin[TData](
    eventData: TData,
    handler: (EventHandler[TElement, TData]) | (EventHandlerBase[_, Event[TElement, TData]])
  ): this.type = js.native
  @JSName("focusin")
  def focusin_false(handler: `false`): this.type = js.native
  /**
    * Bind an event handler to the "focusout" JavaScript event.
    *
    * @param handler A function to execute each time the event is triggered.
    * @see \`{@link https://api.jquery.com/focusout/ }\`
    * @since 1.4
    *
    * @deprecated Deprecated since 3.3. Use \`{@link JQuery.on }\` or \`{@link JQuery.trigger }\`.
    */
  def focusout(): this.type = js.native
  def focusout(handler: (EventHandler[TElement, Null]) | (EventHandlerBase[_, Event[TElement, Null]])): this.type = js.native
  /**
    * Bind an event handler to the "focusout" JavaScript event.
    *
    * @param eventData An object containing data that will be passed to the event handler.
    * @param handler A function to execute each time the event is triggered.
    * @see \`{@link https://api.jquery.com/focusout/ }\`
    * @since 1.4.3
    *
    * @deprecated Deprecated since 3.3. Use \`{@link JQuery.on }\` or \`{@link JQuery.trigger }\`.
    */
  def focusout[TData](
    eventData: TData,
    handler: (EventHandler[TElement, TData]) | (EventHandlerBase[_, Event[TElement, TData]])
  ): this.type = js.native
  @JSName("focusout")
  def focusout_false(handler: `false`): this.type = js.native
  /**
    * Retrieve the elements matched by the jQuery object.
    *
    * @see \`{@link https://api.jquery.com/get/ }\`
    * @since 1.0
    */
  def get(): js.Array[TElement] = js.native
  /**
    * Retrieve one of the elements matched by the jQuery object.
    *
    * @param index A zero-based integer indicating which element to retrieve.
    * @see \`{@link https://api.jquery.com/get/ }\`
    * @since 1.0
    */
  def get(index: Double): TElement = js.native
  /**
    * Reduce the set of matched elements to those that have a descendant that matches the selector or DOM element.
    *
    * @param selector A string containing a selector expression to match elements against.
    *                 A DOM element to match elements against.
    * @see \`{@link https://api.jquery.com/has/ }\`
    * @since 1.4
    */
  def has(selector: String): this.type = js.native
  def has(selector: Element): this.type = js.native
  /**
    * Determine whether any of the matched elements are assigned the given class.
    *
    * @param className The class name to search for.
    * @see \`{@link https://api.jquery.com/hasClass/ }\`
    * @since 1.2
    */
  def hasClass(className: String): Boolean = js.native
  /**
    * Get the current computed height for the first element in the set of matched elements.
    *
    * @see \`{@link https://api.jquery.com/height/ }\`
    * @since 1.0
    */
  def height(): js.UndefOr[Double] = js.native
  /**
    * Set the CSS height of every matched element.
    *
    * @param value An integer representing the number of pixels, or an integer with an optional unit of measure
    *              appended (as a string).
    *              A function returning the height to set. Receives the index position of the element in the set and
    *              the old height as arguments. Within the function, this refers to the current element in the set.
    * @see \`{@link https://api.jquery.com/height/ }\`
    * @since 1.0
    * @since 1.4.1
    */
  def height(value: String): this.type = js.native
  def height(
    value: js.ThisFunction2[/* this */ TElement, /* index */ Double, /* height */ Double, String | Double]
  ): this.type = js.native
  def height(value: Double): this.type = js.native
  /**
    * Hide the matched elements.
    *
    * @param duration_complete_options A string or number determining how long the animation will run.
    *                                  A function to call once the animation is complete, called once per matched element.
    *                                  A map of additional options to pass to the method.
    * @see \`{@link https://api.jquery.com/hide/ }\`
    * @since 1.0
    */
  def hide(): this.type = js.native
  def hide(duration_complete_options: js.ThisFunction0[/* this */ TElement, Unit]): this.type = js.native
  def hide(duration_complete_options: Duration): this.type = js.native
  def hide(duration_complete_options: EffectsOptions[TElement]): this.type = js.native
  /**
    * Hide the matched elements.
    *
    * @param duration A string or number determining how long the animation will run.
    * @param easing_complete A string indicating which easing function to use for the transition.
    *                        A function to call once the animation is complete, called once per matched element.
    * @see \`{@link https://api.jquery.com/hide/ }\`
    * @since 1.0
    * @since 1.4.3
    */
  def hide(duration: Duration, easing_complete: String): this.type = js.native
  def hide(duration: Duration, easing_complete: js.ThisFunction0[/* this */ TElement, Unit]): this.type = js.native
  /**
    * Hide the matched elements.
    *
    * @param duration A string or number determining how long the animation will run.
    * @param easing A string indicating which easing function to use for the transition.
    * @param complete A function to call once the animation is complete, called once per matched element.
    * @see \`{@link https://api.jquery.com/hide/ }\`
    * @since 1.4.3
    */
  def hide(duration: Duration, easing: String, complete: js.ThisFunction0[/* this */ TElement, Unit]): this.type = js.native
  /**
    * Bind one or two handlers to the matched elements, to be executed when the mouse pointer enters and
    * leaves the elements.
    *
    * @param handlerInOut A function to execute when the mouse pointer enters or leaves the element.
    * @param handlerOut A function to execute when the mouse pointer leaves the element.
    * @see \`{@link https://api.jquery.com/hover/ }\`
    * @since 1.0
    * @since 1.4
    */
  // HACK: The type parameter T is not used but ensures the 'event' callback parameter is typed correctly.
  // tslint:disable-next-line:no-unnecessary-generics
  def hover[T](handlerInOut: (EventHandler[TElement, Null]) | (EventHandlerBase[_, Event[TElement, Null]])): this.type = js.native
  def hover[T](
    handlerInOut: (EventHandler[TElement, Null]) | (EventHandlerBase[_, Event[TElement, Null]]),
    handlerOut: (EventHandler[TElement, Null]) | (EventHandlerBase[_, Event[TElement, Null]])
  ): this.type = js.native
  @JSName("hover")
  def hover_false[T](
    handlerInOut: (EventHandler[TElement, Null]) | (EventHandlerBase[_, Event[TElement, Null]]),
    handlerOut: `false`
  ): this.type = js.native
  @JSName("hover")
  def hover_false[T](handlerInOut: `false`): this.type = js.native
  @JSName("hover")
  def hover_false[T](
    handlerInOut: `false`,
    handlerOut: (EventHandler[TElement, Null]) | (EventHandlerBase[_, Event[TElement, Null]])
  ): this.type = js.native
  @JSName("hover")
  def hover_false[T](handlerInOut: `false`, handlerOut: `false`): this.type = js.native
  /**
    * Get the HTML contents of the first element in the set of matched elements.
    *
    * @see \`{@link https://api.jquery.com/html/ }\`
    * @since 1.0
    */
  def html(): String = js.native
  def html(
    htmlString: js.ThisFunction2[/* this */ TElement, /* index */ Double, /* oldhtml */ htmlString, htmlString]
  ): this.type = js.native
  /**
    * Set the HTML contents of each element in the set of matched elements.
    *
    * @param htmlString A string of HTML to set as the content of each matched element.
    *                   A function returning the HTML content to set. Receives the index position of the element in the set
    *                   and the old HTML value as arguments. jQuery empties the element before calling the function; use the
    *                   oldhtml argument to reference the previous content. Within the function, this refers to the current element in the set.
    * @see \`{@link https://api.jquery.com/html/ }\`
    * @since 1.0
    * @since 1.4
    */
  def html(htmlString: htmlString): this.type = js.native
  /**
    * Search for a given element from among the matched elements.
    *
    * @param element The DOM element or first element within the jQuery object to look for.
    *                A selector representing a jQuery collection in which to look for an element.
    * @see \`{@link https://api.jquery.com/index/ }\`
    * @since 1.0
    * @since 1.4
    */
  def index(): Double = js.native
  def index(element: JQuery[HTMLElement]): Double = js.native
  def index(element: Selector): Double = js.native
  def index(element: Element): Double = js.native
  /**
    * Get the current computed height for the first element in the set of matched elements, including
    * padding but not border.
    *
    * @see \`{@link https://api.jquery.com/innerHeight/ }\`
    * @since 1.2.6
    */
  def innerHeight(): js.UndefOr[Double] = js.native
  /**
    * Set the CSS inner height of each element in the set of matched elements.
    *
    * @param value A number representing the number of pixels, or a number along with an optional unit of measure
    *              appended (as a string).
    *              A function returning the inner height (including padding but not border) to set. Receives the index
    *              position of the element in the set and the old inner height as arguments. Within the function, this
    *              refers to the current element in the set.
    * @see \`{@link https://api.jquery.com/innerHeight/ }\`
    * @since 1.8.0
    */
  def innerHeight(value: String): this.type = js.native
  def innerHeight(
    value: js.ThisFunction2[/* this */ TElement, /* index */ Double, /* height */ Double, String | Double]
  ): this.type = js.native
  def innerHeight(value: Double): this.type = js.native
  /**
    * Get the current computed inner width for the first element in the set of matched elements, including
    * padding but not border.
    *
    * @see \`{@link https://api.jquery.com/innerWidth/ }\`
    * @since 1.2.6
    */
  def innerWidth(): js.UndefOr[Double] = js.native
  /**
    * Set the CSS inner width of each element in the set of matched elements.
    *
    * @param value A number representing the number of pixels, or a number along with an optional unit of measure
    *              appended (as a string).
    *              A function returning the inner width (including padding but not border) to set. Receives the index
    *              position of the element in the set and the old inner width as arguments. Within the function, this
    *              refers to the current element in the set.
    * @see \`{@link https://api.jquery.com/innerWidth/ }\`
    * @since 1.8.0
    */
  def innerWidth(value: String): this.type = js.native
  def innerWidth(
    value: js.ThisFunction2[/* this */ TElement, /* index */ Double, /* width */ Double, String | Double]
  ): this.type = js.native
  def innerWidth(value: Double): this.type = js.native
  /**
    * Insert every element in the set of matched elements after the target.
    *
    * @param target A selector, element, array of elements, HTML string, or jQuery object; the matched set of elements
    *               will be inserted after the element(s) specified by this parameter.
    * @see \`{@link https://api.jquery.com/insertAfter/ }\`
    * @since 1.0
    */
  def insertAfter(target: Selector | TypeOrArray[typings.std.Node] | htmlString): this.type = js.native
  def insertAfter(target: JQuery[typings.std.Node]): this.type = js.native
  /**
    * Insert every element in the set of matched elements before the target.
    *
    * @param target A selector, element, array of elements, HTML string, or jQuery object; the matched set of elements
    *               will be inserted before the element(s) specified by this parameter.
    * @see \`{@link https://api.jquery.com/insertBefore/ }\`
    * @since 1.0
    */
  def insertBefore(target: Selector | TypeOrArray[typings.std.Node] | htmlString): this.type = js.native
  def insertBefore(target: JQuery[typings.std.Node]): this.type = js.native
  def is(
    selector: js.ThisFunction2[/* this */ TElement, /* index */ Double, /* element */ TElement, Boolean]
  ): Boolean = js.native
  def is(selector: JQuery[HTMLElement]): Boolean = js.native
  /**
    * Check the current matched set of elements against a selector, element, or jQuery object and return
    * true if at least one of these elements matches the given arguments.
    *
    * @param selector A string containing a selector expression to match elements against.
    *                 A function used as a test for every element in the set. It accepts two arguments, index, which is
    *                 the element's index in the jQuery collection, and element, which is the DOM element. Within the
    *                 function, this refers to the current DOM element.
    *                 An existing jQuery object to match the current set of elements against.
    *                 One or more elements to match the current set of elements against.
    * @see \`{@link https://api.jquery.com/is/ }\`
    * @since 1.0
    * @since 1.6
    */
  def is(selector: Selector): Boolean = js.native
  def is(selector: TypeOrArray[Element]): Boolean = js.native
  /**
    * Bind an event handler to the "keydown" JavaScript event, or trigger that event on an element.
    *
    * @param handler A function to execute each time the event is triggered.
    * @see \`{@link https://api.jquery.com/keydown/ }\`
    * @since 1.0
    *
    * @deprecated Deprecated since 3.3. Use \`{@link JQuery.on }\` or \`{@link JQuery.trigger }\`.
    */
  def keydown(): this.type = js.native
  def keydown(handler: (EventHandler[TElement, Null]) | (EventHandlerBase[_, Event[TElement, Null]])): this.type = js.native
  /**
    * Bind an event handler to the "keydown" JavaScript event, or trigger that event on an element.
    *
    * @param eventData An object containing data that will be passed to the event handler.
    * @param handler A function to execute each time the event is triggered.
    * @see \`{@link https://api.jquery.com/keydown/ }\`
    * @since 1.4.3
    *
    * @deprecated Deprecated since 3.3. Use \`{@link JQuery.on }\` or \`{@link JQuery.trigger }\`.
    */
  def keydown[TData](
    eventData: TData,
    handler: (EventHandler[TElement, TData]) | (EventHandlerBase[_, Event[TElement, TData]])
  ): this.type = js.native
  @JSName("keydown")
  def keydown_false(handler: `false`): this.type = js.native
  /**
    * Bind an event handler to the "keypress" JavaScript event, or trigger that event on an element.
    *
    * @param handler A function to execute each time the event is triggered.
    * @see \`{@link https://api.jquery.com/keypress/ }\`
    * @since 1.0
    *
    * @deprecated Deprecated since 3.3. Use \`{@link JQuery.on }\` or \`{@link JQuery.trigger }\`.
    */
  def keypress(): this.type = js.native
  def keypress(handler: (EventHandler[TElement, Null]) | (EventHandlerBase[_, Event[TElement, Null]])): this.type = js.native
  /**
    * Bind an event handler to the "keypress" JavaScript event, or trigger that event on an element.
    *
    * @param eventData An object containing data that will be passed to the event handler.
    * @param handler A function to execute each time the event is triggered.
    * @see \`{@link https://api.jquery.com/keypress/ }\`
    * @since 1.4.3
    *
    * @deprecated Deprecated since 3.3. Use \`{@link JQuery.on }\` or \`{@link JQuery.trigger }\`.
    */
  def keypress[TData](
    eventData: TData,
    handler: (EventHandler[TElement, TData]) | (EventHandlerBase[_, Event[TElement, TData]])
  ): this.type = js.native
  @JSName("keypress")
  def keypress_false(handler: `false`): this.type = js.native
  /**
    * Bind an event handler to the "keyup" JavaScript event, or trigger that event on an element.
    *
    * @param handler A function to execute each time the event is triggered.
    * @see \`{@link https://api.jquery.com/keyup/ }\`
    * @since 1.0
    *
    * @deprecated Deprecated since 3.3. Use \`{@link JQuery.on }\` or \`{@link JQuery.trigger }\`.
    */
  def keyup(): this.type = js.native
  def keyup(handler: (EventHandler[TElement, Null]) | (EventHandlerBase[_, Event[TElement, Null]])): this.type = js.native
  /**
    * Bind an event handler to the "keyup" JavaScript event, or trigger that event on an element.
    *
    * @param eventData An object containing data that will be passed to the event handler.
    * @param handler A function to execute each time the event is triggered.
    * @see \`{@link https://api.jquery.com/keyup/ }\`
    * @since 1.4.3
    *
    * @deprecated Deprecated since 3.3. Use \`{@link JQuery.on }\` or \`{@link JQuery.trigger }\`.
    */
  def keyup[TData](
    eventData: TData,
    handler: (EventHandler[TElement, TData]) | (EventHandlerBase[_, Event[TElement, TData]])
  ): this.type = js.native
  @JSName("keyup")
  def keyup_false(handler: `false`): this.type = js.native
  /**
    * Reduce the set of matched elements to the final one in the set.
    *
    * @see \`{@link https://api.jquery.com/last/ }\`
    * @since 1.4
    */
  def last(): this.type = js.native
  /**
    * Load data from the server and place the returned HTML into the matched element.
    *
    * @param url A string containing the URL to which the request is sent.
    * @param complete_data A callback function that is executed when the request completes.
    *                      A plain object or string that is sent to the server with the request.
    * @see \`{@link https://api.jquery.com/load/ }\`
    * @since 1.0
    */
  def load(url: String): this.type = js.native
  def load(url: String, complete_data: String): this.type = js.native
  def load(
    url: String,
    complete_data: js.ThisFunction3[
      /* this */ TElement, 
      /* responseText */ String, 
      /* textStatus */ TextStatus, 
      /* jqXHR */ jqXHR[_], 
      Unit
    ]
  ): this.type = js.native
  def load(url: String, complete_data: PlainObject[_]): this.type = js.native
  /**
    * Load data from the server and place the returned HTML into the matched element.
    *
    * @param url A string containing the URL to which the request is sent.
    * @param data A plain object or string that is sent to the server with the request.
    * @param complete A callback function that is executed when the request completes.
    * @see \`{@link https://api.jquery.com/load/ }\`
    * @since 1.0
    */
  def load(
    url: String,
    data: String,
    complete: js.ThisFunction3[
      /* this */ TElement, 
      /* responseText */ String, 
      /* textStatus */ TextStatus, 
      /* jqXHR */ jqXHR[_], 
      Unit
    ]
  ): this.type = js.native
  def load(
    url: String,
    data: PlainObject[_],
    complete: js.ThisFunction3[
      /* this */ TElement, 
      /* responseText */ String, 
      /* textStatus */ TextStatus, 
      /* jqXHR */ jqXHR[_], 
      Unit
    ]
  ): this.type = js.native
  /**
    * Pass each element in the current matched set through a function, producing a new jQuery object
    * containing the return values.
    *
    * @param callback A function object that will be invoked for each element in the current set.
    * @see \`{@link https://api.jquery.com/map/ }\`
    * @since 1.2
    */
  def map[TReturn](
    callback: js.ThisFunction2[
      /* this */ TElement, 
      /* index */ Double, 
      /* domElement */ TElement, 
      js.UndefOr[TypeOrArray[TReturn] | Null]
    ]
  ): JQuery[TReturn] = js.native
  /**
    * Bind an event handler to the "mousedown" JavaScript event, or trigger that event on an element.
    *
    * @param handler A function to execute each time the event is triggered.
    * @see \`{@link https://api.jquery.com/mousedown/ }\`
    * @since 1.0
    *
    * @deprecated Deprecated since 3.3. Use \`{@link JQuery.on }\` or \`{@link JQuery.trigger }\`.
    */
  def mousedown(): this.type = js.native
  def mousedown(handler: (EventHandler[TElement, Null]) | (EventHandlerBase[_, Event[TElement, Null]])): this.type = js.native
  /**
    * Bind an event handler to the "mousedown" JavaScript event, or trigger that event on an element.
    *
    * @param eventData An object containing data that will be passed to the event handler.
    * @param handler A function to execute each time the event is triggered.
    * @see \`{@link https://api.jquery.com/mousedown/ }\`
    * @since 1.4.3
    *
    * @deprecated Deprecated since 3.3. Use \`{@link JQuery.on }\` or \`{@link JQuery.trigger }\`.
    */
  def mousedown[TData](
    eventData: TData,
    handler: (EventHandler[TElement, TData]) | (EventHandlerBase[_, Event[TElement, TData]])
  ): this.type = js.native
  @JSName("mousedown")
  def mousedown_false(handler: `false`): this.type = js.native
  /**
    * Bind an event handler to be fired when the mouse enters an element, or trigger that handler on an element.
    *
    * @param handler A function to execute each time the event is triggered.
    * @see \`{@link https://api.jquery.com/mouseenter/ }\`
    * @since 1.0
    *
    * @deprecated Deprecated since 3.3. Use \`{@link JQuery.on }\` or \`{@link JQuery.trigger }\`.
    */
  def mouseenter(): this.type = js.native
  def mouseenter(handler: (EventHandler[TElement, Null]) | (EventHandlerBase[_, Event[TElement, Null]])): this.type = js.native
  /**
    * Bind an event handler to be fired when the mouse enters an element, or trigger that handler on an element.
    *
    * @param eventData An object containing data that will be passed to the event handler.
    * @param handler A function to execute each time the event is triggered.
    * @see \`{@link https://api.jquery.com/mouseenter/ }\`
    * @since 1.4.3
    *
    * @deprecated Deprecated since 3.3. Use \`{@link JQuery.on }\` or \`{@link JQuery.trigger }\`.
    */
  def mouseenter[TData](
    eventData: TData,
    handler: (EventHandler[TElement, TData]) | (EventHandlerBase[_, Event[TElement, TData]])
  ): this.type = js.native
  @JSName("mouseenter")
  def mouseenter_false(handler: `false`): this.type = js.native
  /**
    * Bind an event handler to be fired when the mouse leaves an element, or trigger that handler on an element.
    *
    * @param handler A function to execute each time the event is triggered.
    * @see \`{@link https://api.jquery.com/mouseleave/ }\`
    * @since 1.0
    *
    * @deprecated Deprecated since 3.3. Use \`{@link JQuery.on }\` or \`{@link JQuery.trigger }\`.
    */
  def mouseleave(): this.type = js.native
  def mouseleave(handler: (EventHandler[TElement, Null]) | (EventHandlerBase[_, Event[TElement, Null]])): this.type = js.native
  /**
    * Bind an event handler to be fired when the mouse leaves an element, or trigger that handler on an element.
    *
    * @param eventData An object containing data that will be passed to the event handler.
    * @param handler A function to execute each time the event is triggered.
    * @see \`{@link https://api.jquery.com/mouseleave/ }\`
    * @since 1.4.3
    *
    * @deprecated Deprecated since 3.3. Use \`{@link JQuery.on }\` or \`{@link JQuery.trigger }\`.
    */
  def mouseleave[TData](
    eventData: TData,
    handler: (EventHandler[TElement, TData]) | (EventHandlerBase[_, Event[TElement, TData]])
  ): this.type = js.native
  @JSName("mouseleave")
  def mouseleave_false(handler: `false`): this.type = js.native
  /**
    * Bind an event handler to the "mousemove" JavaScript event, or trigger that event on an element.
    *
    * @param handler A function to execute each time the event is triggered.
    * @see \`{@link https://api.jquery.com/mousemove/ }\`
    * @since 1.0
    *
    * @deprecated Deprecated since 3.3. Use \`{@link JQuery.on }\` or \`{@link JQuery.trigger }\`.
    */
  def mousemove(): this.type = js.native
  def mousemove(handler: (EventHandler[TElement, Null]) | (EventHandlerBase[_, Event[TElement, Null]])): this.type = js.native
  /**
    * Bind an event handler to the "mousemove" JavaScript event, or trigger that event on an element.
    *
    * @param eventData An object containing data that will be passed to the event handler.
    * @param handler A function to execute each time the event is triggered.
    * @see \`{@link https://api.jquery.com/mousemove/ }\`
    * @since 1.4.3
    *
    * @deprecated Deprecated since 3.3. Use \`{@link JQuery.on }\` or \`{@link JQuery.trigger }\`.
    */
  def mousemove[TData](
    eventData: TData,
    handler: (EventHandler[TElement, TData]) | (EventHandlerBase[_, Event[TElement, TData]])
  ): this.type = js.native
  @JSName("mousemove")
  def mousemove_false(handler: `false`): this.type = js.native
  /**
    * Bind an event handler to the "mouseout" JavaScript event, or trigger that event on an element.
    *
    * @param handler A function to execute each time the event is triggered.
    * @see \`{@link https://api.jquery.com/mouseout/ }\`
    * @since 1.0
    *
    * @deprecated Deprecated since 3.3. Use \`{@link JQuery.on }\` or \`{@link JQuery.trigger }\`.
    */
  def mouseout(): this.type = js.native
  def mouseout(handler: (EventHandler[TElement, Null]) | (EventHandlerBase[_, Event[TElement, Null]])): this.type = js.native
  /**
    * Bind an event handler to the "mouseout" JavaScript event, or trigger that event on an element.
    *
    * @param eventData An object containing data that will be passed to the event handler.
    * @param handler A function to execute each time the event is triggered.
    * @see \`{@link https://api.jquery.com/mouseout/ }\`
    * @since 1.4.3
    *
    * @deprecated Deprecated since 3.3. Use \`{@link JQuery.on }\` or \`{@link JQuery.trigger }\`.
    */
  def mouseout[TData](
    eventData: TData,
    handler: (EventHandler[TElement, TData]) | (EventHandlerBase[_, Event[TElement, TData]])
  ): this.type = js.native
  @JSName("mouseout")
  def mouseout_false(handler: `false`): this.type = js.native
  /**
    * Bind an event handler to the "mouseover" JavaScript event, or trigger that event on an element.
    *
    * @param handler A function to execute each time the event is triggered.
    * @see \`{@link https://api.jquery.com/mouseover/ }\`
    * @since 1.0
    *
    * @deprecated Deprecated since 3.3. Use \`{@link JQuery.on }\` or \`{@link JQuery.trigger }\`.
    */
  def mouseover(): this.type = js.native
  def mouseover(handler: (EventHandler[TElement, Null]) | (EventHandlerBase[_, Event[TElement, Null]])): this.type = js.native
  /**
    * Bind an event handler to the "mouseover" JavaScript event, or trigger that event on an element.
    *
    * @param eventData An object containing data that will be passed to the event handler.
    * @param handler A function to execute each time the event is triggered.
    * @see \`{@link https://api.jquery.com/mouseover/ }\`
    * @since 1.4.3
    *
    * @deprecated Deprecated since 3.3. Use \`{@link JQuery.on }\` or \`{@link JQuery.trigger }\`.
    */
  def mouseover[TData](
    eventData: TData,
    handler: (EventHandler[TElement, TData]) | (EventHandlerBase[_, Event[TElement, TData]])
  ): this.type = js.native
  @JSName("mouseover")
  def mouseover_false(handler: `false`): this.type = js.native
  /**
    * Bind an event handler to the "mouseup" JavaScript event, or trigger that event on an element.
    *
    * @param handler A function to execute each time the event is triggered.
    * @see \`{@link https://api.jquery.com/mouseup/ }\`
    * @since 1.0
    *
    * @deprecated Deprecated since 3.3. Use \`{@link JQuery.on }\` or \`{@link JQuery.trigger }\`.
    */
  def mouseup(): this.type = js.native
  def mouseup(handler: (EventHandler[TElement, Null]) | (EventHandlerBase[_, Event[TElement, Null]])): this.type = js.native
  /**
    * Bind an event handler to the "mouseup" JavaScript event, or trigger that event on an element.
    *
    * @param eventData An object containing data that will be passed to the event handler.
    * @param handler A function to execute each time the event is triggered.
    * @see \`{@link https://api.jquery.com/mouseup/ }\`
    * @since 1.4.3
    *
    * @deprecated Deprecated since 3.3. Use \`{@link JQuery.on }\` or \`{@link JQuery.trigger }\`.
    */
  def mouseup[TData](
    eventData: TData,
    handler: (EventHandler[TElement, TData]) | (EventHandlerBase[_, Event[TElement, TData]])
  ): this.type = js.native
  @JSName("mouseup")
  def mouseup_false(handler: `false`): this.type = js.native
  /**
    * Get the immediately following sibling of each element in the set of matched elements. If a selector
    * is provided, it retrieves the next sibling only if it matches that selector.
    *
    * @param selector A string containing a selector expression to match elements against.
    * @see \`{@link https://api.jquery.com/next/ }\`
    * @since 1.0
    */
  def next(): this.type = js.native
  def next(selector: Selector): this.type = js.native
  /**
    * Get all following siblings of each element in the set of matched elements, optionally filtered by a selector.
    *
    * @param selector A string containing a selector expression to match elements against.
    * @see \`{@link https://api.jquery.com/nextAll/ }\`
    * @since 1.2
    */
  def nextAll(): this.type = js.native
  def nextAll(selector: String): this.type = js.native
  /**
    * Get all following siblings of each element up to but not including the element matched by the
    * selector, DOM node, or jQuery object passed.
    *
    * @param selector A string containing a selector expression to indicate where to stop matching following sibling elements.
    *                 A DOM node or jQuery object indicating where to stop matching following sibling elements.
    * @param filter A string containing a selector expression to match elements against.
    * @see \`{@link https://api.jquery.com/nextUntil/ }\`
    * @since 1.4
    * @since 1.6
    */
  def nextUntil(): this.type = js.native
  def nextUntil(selector: JQuery[HTMLElement]): this.type = js.native
  def nextUntil(selector: Selector): this.type = js.native
  def nextUntil(selector: Selector, filter: Selector): this.type = js.native
  def nextUntil(selector: JQuery[HTMLElement], filter: Selector): this.type = js.native
  def nextUntil(selector: Element): this.type = js.native
  def nextUntil(selector: Element, filter: Selector): this.type = js.native
  def not(
    selector: js.ThisFunction2[/* this */ TElement, /* index */ Double, /* element */ TElement, Boolean]
  ): this.type = js.native
  def not(selector: JQuery[HTMLElement]): this.type = js.native
  /**
    * Remove elements from the set of matched elements.
    *
    * @param selector A string containing a selector expression, a DOM element, or an array of elements to match against the set.
    *                 A function used as a test for each element in the set. It accepts two arguments, index, which is the
    *                 element's index in the jQuery collection, and element, which is the DOM element. Within the
    *                 function, this refers to the current DOM element.
    *                 An existing jQuery object to match the current set of elements against.
    * @see \`{@link https://api.jquery.com/not/ }\`
    * @since 1.0
    * @since 1.4
    */
  def not(selector: Selector): this.type = js.native
  def not(selector: TypeOrArray[Element]): this.type = js.native
  /**
    * Remove an event handler.
    *
    * @param event A jQuery.Event object.
    * @see \`{@link https://api.jquery.com/off/ }\`
    * @since 1.7
    */
  def off(): this.type = js.native
  /**
    * Remove an event handler.
    *
    * @param events One or more space-separated event types and optional namespaces, or just namespaces, such as
    *               "click", "keydown.myPlugin", or ".myPlugin".
    * @param selector_handler A selector which should match the one originally passed to .on() when attaching event handlers.
    *                         A function to execute each time the event is triggered.
    * @see \`{@link https://api.jquery.com/off/ }\`
    * @since 1.7
    */
  def off(events: String): this.type = js.native
  def off(events: String, selector_handler: EventHandlerBase[_, Event[TElement, _]]): this.type = js.native
  def off(events: String, selector_handler: Selector): this.type = js.native
  /**
    * Remove an event handler.
    *
    * @param events One or more space-separated event types and optional namespaces, or just namespaces, such as
    *               "click", "keydown.myPlugin", or ".myPlugin".
    * @param selector A selector which should match the one originally passed to .on() when attaching event handlers.
    * @param handler A function to execute each time the event is triggered.
    * @see \`{@link https://api.jquery.com/off/ }\`
    * @since 1.7
    */
  def off(events: String, selector: Selector, handler: EventHandlerBase[_, Event[TElement, _]]): this.type = js.native
  def off(event: Event[TElement, Null]): this.type = js.native
  @JSName("off")
  def off_false(events: String, selector_handler: `false`): this.type = js.native
  @JSName("off")
  def off_false(events: String, selector: Selector, handler: `false`): this.type = js.native
  /**
    * Remove an event handler.
    *
    * @param events An object where the string keys represent one or more space-separated event types and optional
    *               namespaces, and the values represent handler functions previously attached for the event(s).
    * @param selector A selector which should match the one originally passed to .on() when attaching event handlers.
    * @see \`{@link https://api.jquery.com/off/ }\`
    * @since 1.7
    */
  @JSName("off")
  def off_false(events: PlainObject[(EventHandlerBase[_, Event[TElement, _]]) | `false`]): this.type = js.native
  @JSName("off")
  def off_false(events: PlainObject[(EventHandlerBase[_, Event[TElement, _]]) | `false`], selector: Selector): this.type = js.native
  /**
    * Get the current coordinates of the first element in the set of matched elements, relative to the document.
    *
    * @see \`{@link https://api.jquery.com/offset/ }\`
    * @since 1.2
    */
  def offset(): js.UndefOr[Coordinates] = js.native
  def offset(
    coordinates: js.ThisFunction2[/* this */ TElement, /* index */ Double, /* coords */ Coordinates, CoordinatesPartial]
  ): this.type = js.native
  /**
    * Set the current coordinates of every element in the set of matched elements, relative to the document.
    *
    * @param coordinates An object containing the properties top and left, which are numbers indicating the new top and left
    *                    coordinates for the elements.
    *                    A function to return the coordinates to set. Receives the index of the element in the collection as
    *                    the first argument and the current coordinates as the second argument. The function should return an
    *                    object with the new top and left properties.
    * @see \`{@link https://api.jquery.com/offset/ }\`
    * @since 1.4
    */
  def offset(coordinates: CoordinatesPartial): this.type = js.native
  /**
    * Get the closest ancestor element that is positioned.
    *
    * @see \`{@link https://api.jquery.com/offsetParent/ }\`
    * @since 1.2.6
    */
  def offsetParent(): this.type = js.native
  /**
    * Attach an event handler function for one or more events to the selected elements.
    *
    * @param events One or more space-separated event types and optional namespaces, such as "click" or "keydown.myPlugin".
    * @param data Data to be passed to the handler in event.data when an event is triggered.
    * @param handler A function to execute when the event is triggered.
    * @see \`{@link https://api.jquery.com/on/ }\`
    * @since 1.7
    */
  def on(
    events: String,
     // tslint:disable-line:unified-signatures
  data: js.Any,
    handler: js.Function1[/* event */ JQueryEventObject, Unit]
  ): this.type = js.native
  /**
    * Attach an event handler function for one or more events to the selected elements.
    *
    * @param events One or more space-separated event types and optional namespaces, such as "click" or "keydown.myPlugin".
    * @param handler A function to execute when the event is triggered. The value false is also allowed as a shorthand
    *                for a function that simply does return false.
    * @see \`{@link https://api.jquery.com/on/ }\`
    * @since 1.7
    */
  def on(
    events: String,
    handler: (EventHandler[TElement, Null]) | (EventHandlerBase[_, Event[TElement, Null]])
  ): this.type = js.native
  /**
    * Attach an event handler function for one or more events to the selected elements.
    *
    * @param events One or more space-separated event types and optional namespaces, such as "click" or "keydown.myPlugin".
    * @param handler A function to execute when the event is triggered.
    * @see \`{@link https://api.jquery.com/on/ }\`
    * @since 1.7
    */
  def on(events: String, handler: js.Function1[/* event */ JQueryEventObject, Unit]): this.type = js.native
  def on(
    events: String,
    selector: Null,
    data: js.Any,
    handler: js.Function1[/* event */ JQueryEventObject, Unit]
  ): this.type = js.native
  /**
    * Attach an event handler function for one or more events to the selected elements.
    *
    * @param events One or more space-separated event types and optional namespaces, such as "click" or "keydown.myPlugin".
    * @param selector A selector string to filter the descendants of the selected elements that trigger the event. If the
    *                 selector is null or omitted, the event is always triggered when it reaches the selected element.
    * @param data Data to be passed to the handler in event.data when an event is triggered.
    * @param handler A function to execute when the event is triggered.
    * @see \`{@link https://api.jquery.com/on/ }\`
    * @since 1.7
    */
  def on(
    events: String,
    selector: Selector,
    data: js.Any,
    handler: js.Function1[/* event */ JQueryEventObject, Unit]
  ): this.type = js.native
   // tslint:disable-line:unified-signatures
  /**
    * Attach an event handler function for one or more events to the selected elements.
    *
    * @param events One or more space-separated event types and optional namespaces, such as "click" or "keydown.myPlugin".
    * @param selector A selector string to filter the descendants of the selected elements that trigger the event. If the
    *                 selector is null or omitted, the event is always triggered when it reaches the selected element.
    * @param handler A function to execute when the event is triggered. The value false is also allowed as a shorthand
    *                for a function that simply does return false.
    * @see \`{@link https://api.jquery.com/on/ }\`
    * @since 1.7
    */
  def on(
    events: String,
    selector: Selector,
    handler: (EventHandler[TElement, Null]) | (EventHandlerBase[_, Event[TElement, Null]])
  ): this.type = js.native
  /**
    * Attach an event handler function for one or more events to the selected elements.
    *
    * @param events One or more space-separated event types and optional namespaces, such as "click" or "keydown.myPlugin".
    * @param selector A selector string to filter the descendants of the selected elements that trigger the event. If the
    *                 selector is null or omitted, the event is always triggered when it reaches the selected element.
    * @param handler A function to execute when the event is triggered.
    * @see \`{@link https://api.jquery.com/on/ }\`
    * @since 1.7
    */
  def on(events: String, selector: Selector, handler: js.Function1[/* event */ JQueryEventObject, Unit]): this.type = js.native
   // tslint:disable-line:unified-signatures
  /**
    * Attach an event handler function for one or more events to the selected elements.
    *
    * @param events One or more space-separated event types and optional namespaces, such as "click" or "keydown.myPlugin".
    * @param data Data to be passed to the handler in event.data when an event is triggered.
    * @param handler A function to execute when the event is triggered.
    * @see \`{@link https://api.jquery.com/on/ }\`
    * @since 1.7
    */
  def on[TData](
    events: String,
    data: TData,
    handler: (EventHandler[TElement, TData]) | (EventHandlerBase[_, Event[TElement, TData]])
  ): this.type = js.native
  def on[TData](
    events: String,
    selector: Null,
    data: TData,
    handler: (EventHandler[TElement, TData]) | (EventHandlerBase[_, Event[TElement, TData]])
  ): this.type = js.native
  /**
    * Attach an event handler function for one or more events to the selected elements.
    *
    * @param events One or more space-separated event types and optional namespaces, such as "click" or "keydown.myPlugin".
    * @param selector A selector string to filter the descendants of the selected elements that trigger the event. If the
    *                 selector is null or omitted, the event is always triggered when it reaches the selected element.
    * @param data Data to be passed to the handler in event.data when an event is triggered.
    * @param handler A function to execute when the event is triggered.
    * @see \`{@link https://api.jquery.com/on/ }\`
    * @since 1.7
    */
  def on[TData](
    events: String,
    selector: Selector,
    data: TData,
    handler: (EventHandler[TElement, TData]) | (EventHandlerBase[_, Event[TElement, TData]])
  ): this.type = js.native
  @JSName("on")
  def on_false(events: String, handler: `false`): this.type = js.native
  @JSName("on")
  def on_false(events: String, selector: Selector, handler: `false`): this.type = js.native
  /**
    * Attach an event handler function for one or more events to the selected elements.
    *
    * @param events An object in which the string keys represent one or more space-separated event types and optional
    *               namespaces, and the values represent a handler function to be called for the event(s).
    * @see \`{@link https://api.jquery.com/on/ }\`
    * @since 1.7
    */
  @JSName("on")
  def on_false(
    events: PlainObject[
      (EventHandler[TElement, Null]) | (EventHandlerBase[_, Event[TElement, Null]]) | `false`
    ]
  ): this.type = js.native
  /**
    * Attach an event handler function for one or more events to the selected elements.
    *
    * @param events An object in which the string keys represent one or more space-separated event types and optional
    *               namespaces, and the values represent a handler function to be called for the event(s).
    * @param selector A selector string to filter the descendants of the selected elements that will call the handler. If
    *                 the selector is null or omitted, the handler is always called when it reaches the selected element.
    * @see \`{@link https://api.jquery.com/on/ }\`
    * @since 1.7
    */
  @JSName("on")
  def on_false(
    events: PlainObject[
      (EventHandler[TElement, Null]) | (EventHandlerBase[_, Event[TElement, Null]]) | `false`
    ],
    selector: Selector
  ): this.type = js.native
   // tslint:disable-line:unified-signatures
  /**
    * Attach an event handler function for one or more events to the selected elements.
    *
    * @param events An object in which the string keys represent one or more space-separated event types and optional
    *               namespaces, and the values represent a handler function to be called for the event(s).
    * @param data Data to be passed to the handler in event.data when an event occurs.
    * @see \`{@link https://api.jquery.com/on/ }\`
    * @since 1.7
    */
  @JSName("on")
  def on_false[TData](
    events: PlainObject[
      (EventHandler[TElement, TData]) | (EventHandlerBase[_, Event[TElement, TData]]) | `false`
    ],
    data: TData
  ): this.type = js.native
  @JSName("on")
  def on_false[TData](
    events: PlainObject[
      (EventHandler[TElement, TData]) | (EventHandlerBase[_, Event[TElement, TData]]) | `false`
    ],
    selector: Null,
    data: TData
  ): this.type = js.native
   // tslint:disable-line:unified-signatures
  /**
    * Attach an event handler function for one or more events to the selected elements.
    *
    * @param events An object in which the string keys represent one or more space-separated event types and optional
    *               namespaces, and the values represent a handler function to be called for the event(s).
    * @param selector A selector string to filter the descendants of the selected elements that will call the handler. If
    *                 the selector is null or omitted, the handler is always called when it reaches the selected element.
    * @param data Data to be passed to the handler in event.data when an event occurs.
    * @see \`{@link https://api.jquery.com/on/ }\`
    * @since 1.7
    */
  @JSName("on")
  def on_false[TData](
    events: PlainObject[
      (EventHandler[TElement, TData]) | (EventHandlerBase[_, Event[TElement, TData]]) | `false`
    ],
    selector: Selector,
    data: TData
  ): this.type = js.native
  /**
    * Attach a handler to an event for the elements. The handler is executed at most once per element per event type.
    *
    * @param events One or more space-separated event types and optional namespaces, such as "click" or "keydown.myPlugin".
    * @param handler A function to execute when the event is triggered. The value false is also allowed as a shorthand
    *                for a function that simply does return false.
    * @see \`{@link https://api.jquery.com/one/ }\`
    * @since 1.7
    */
  def one(
    events: String,
    handler: (EventHandler[TElement, Null]) | (EventHandlerBase[_, Event[TElement, Null]])
  ): this.type = js.native
  /**
    * Attach a handler to an event for the elements. The handler is executed at most once per element per event type.
    *
    * @param events One or more space-separated event types and optional namespaces, such as "click" or "keydown.myPlugin".
    * @param selector A selector string to filter the descendants of the selected elements that trigger the event. If the
    *                 selector is null or omitted, the event is always triggered when it reaches the selected element.
    * @param handler A function to execute when the event is triggered. The value false is also allowed as a shorthand
    *                for a function that simply does return false.
    * @see \`{@link https://api.jquery.com/one/ }\`
    * @since 1.7
    */
  def one(
    events: String,
    selector: Selector,
    handler: (EventHandler[TElement, Null]) | (EventHandlerBase[_, Event[TElement, Null]])
  ): this.type = js.native
  /**
    * Attach a handler to an event for the elements. The handler is executed at most once per element per event type.
    *
    * @param events One or more space-separated event types and optional namespaces, such as "click" or "keydown.myPlugin".
    * @param data Data to be passed to the handler in event.data when an event is triggered.
    * @param handler A function to execute when the event is triggered.
    * @see \`{@link https://api.jquery.com/one/ }\`
    * @since 1.7
    */
  def one[TData](
    events: String,
    data: TData,
    handler: (EventHandler[TElement, TData]) | (EventHandlerBase[_, Event[TElement, TData]])
  ): this.type = js.native
  def one[TData](
    events: String,
    selector: Null,
    data: TData,
    handler: (EventHandler[TElement, TData]) | (EventHandlerBase[_, Event[TElement, TData]])
  ): this.type = js.native
  /**
    * Attach a handler to an event for the elements. The handler is executed at most once per element per event type.
    *
    * @param events One or more space-separated event types and optional namespaces, such as "click" or "keydown.myPlugin".
    * @param selector A selector string to filter the descendants of the selected elements that trigger the event. If the
    *                 selector is null or omitted, the event is always triggered when it reaches the selected element.
    * @param data Data to be passed to the handler in event.data when an event is triggered.
    * @param handler A function to execute when the event is triggered.
    * @see \`{@link https://api.jquery.com/one/ }\`
    * @since 1.7
    */
  def one[TData](
    events: String,
    selector: Selector,
    data: TData,
    handler: (EventHandler[TElement, TData]) | (EventHandlerBase[_, Event[TElement, TData]])
  ): this.type = js.native
  @JSName("one")
  def one_false(events: String, handler: `false`): this.type = js.native
  @JSName("one")
  def one_false(events: String, selector: Selector, handler: `false`): this.type = js.native
  /**
    * Attach a handler to an event for the elements. The handler is executed at most once per element per event type.
    *
    * @param events An object in which the string keys represent one or more space-separated event types and optional
    *               namespaces, and the values represent a handler function to be called for the event(s).
    * @see \`{@link https://api.jquery.com/one/ }\`
    * @since 1.7
    */
  @JSName("one")
  def one_false(
    events: PlainObject[
      (EventHandler[TElement, Null]) | (EventHandlerBase[_, Event[TElement, Null]]) | `false`
    ]
  ): this.type = js.native
  /**
    * Attach a handler to an event for the elements. The handler is executed at most once per element per event type.
    *
    * @param events An object in which the string keys represent one or more space-separated event types and optional
    *               namespaces, and the values represent a handler function to be called for the event(s).
    * @param selector A selector string to filter the descendants of the selected elements that will call the handler. If
    *                 the selector is null or omitted, the handler is always called when it reaches the selected element.
    * @see \`{@link https://api.jquery.com/one/ }\`
    * @since 1.7
    */
  @JSName("one")
  def one_false(
    events: PlainObject[
      (EventHandler[TElement, Null]) | (EventHandlerBase[_, Event[TElement, Null]]) | `false`
    ],
    selector: Selector
  ): this.type = js.native
   // tslint:disable-line:unified-signatures
  /**
    * Attach a handler to an event for the elements. The handler is executed at most once per element per event type.
    *
    * @param events An object in which the string keys represent one or more space-separated event types and optional
    *               namespaces, and the values represent a handler function to be called for the event(s).
    * @param data Data to be passed to the handler in event.data when an event occurs.
    * @see \`{@link https://api.jquery.com/one/ }\`
    * @since 1.7
    */
  @JSName("one")
  def one_false[TData](
    events: PlainObject[
      (EventHandler[TElement, TData]) | (EventHandlerBase[_, Event[TElement, TData]]) | `false`
    ],
    data: TData
  ): this.type = js.native
  @JSName("one")
  def one_false[TData](
    events: PlainObject[
      (EventHandler[TElement, TData]) | (EventHandlerBase[_, Event[TElement, TData]]) | `false`
    ],
    selector: Null,
    data: TData
  ): this.type = js.native
  /**
    * Attach a handler to an event for the elements. The handler is executed at most once per element per event type.
    *
    * @param events An object in which the string keys represent one or more space-separated event types and optional
    *               namespaces, and the values represent a handler function to be called for the event(s).
    * @param selector A selector string to filter the descendants of the selected elements that will call the handler. If
    *                 the selector is null or omitted, the handler is always called when it reaches the selected element.
    * @param data Data to be passed to the handler in event.data when an event occurs.
    * @see \`{@link https://api.jquery.com/one/ }\`
    * @since 1.7
    */
  @JSName("one")
  def one_false[TData](
    events: PlainObject[
      (EventHandler[TElement, TData]) | (EventHandlerBase[_, Event[TElement, TData]]) | `false`
    ],
    selector: Selector,
    data: TData
  ): this.type = js.native
  /**
    * Get the current computed outer height (including padding, border, and optionally margin) for the
    * first element in the set of matched elements.
    *
    * @param includeMargin A Boolean indicating whether to include the element's margin in the calculation.
    * @see \`{@link https://api.jquery.com/outerHeight/ }\`
    * @since 1.2.6
    */
  def outerHeight(): js.UndefOr[Double] = js.native
  def outerHeight(includeMargin: Boolean): js.UndefOr[Double] = js.native
  /**
    * Set the CSS outer height of each element in the set of matched elements.
    *
    * @param value A number representing the number of pixels, or a number along with an optional unit of measure
    *              appended (as a string).
    * @see \`{@link https://api.jquery.com/outerHeight/ }\`
    * @since 1.8.0
    */
  def outerHeight(value: String): this.type = js.native
  def outerHeight(
    value: js.ThisFunction2[/* this */ TElement, /* index */ Double, /* height */ Double, String | Double]
  ): this.type = js.native
  def outerHeight(value: Double): this.type = js.native
  /**
    * Get the current computed outer width (including padding, border, and optionally margin) for the
    * first element in the set of matched elements.
    *
    * @param includeMargin A Boolean indicating whether to include the element's margin in the calculation.
    * @see \`{@link https://api.jquery.com/outerWidth/ }\`
    * @since 1.2.6
    */
  def outerWidth(): js.UndefOr[Double] = js.native
  def outerWidth(includeMargin: Boolean): js.UndefOr[Double] = js.native
  /**
    * Set the CSS outer width of each element in the set of matched elements.
    *
    * @param value A number representing the number of pixels, or a number along with an optional unit of measure
    *              appended (as a string).
    *              A function returning the outer width to set. Receives the index position of the element in the set
    *              and the old outer width as arguments. Within the function, this refers to the current element in the set.
    * @see \`{@link https://api.jquery.com/outerWidth/ }\`
    * @since 1.8.0
    */
  def outerWidth(value: String): this.type = js.native
  def outerWidth(
    value: js.ThisFunction2[/* this */ TElement, /* index */ Double, /* width */ Double, String | Double]
  ): this.type = js.native
  def outerWidth(value: Double): this.type = js.native
  /**
    * Get the parent of each element in the current set of matched elements, optionally filtered by a selector.
    *
    * @param selector A string containing a selector expression to match elements against.
    * @see \`{@link https://api.jquery.com/parent/ }\`
    * @since 1.0
    */
  def parent(): this.type = js.native
  def parent(selector: Selector): this.type = js.native
  /**
    * Get the ancestors of each element in the current set of matched elements, optionally filtered by a selector.
    *
    * @param selector A string containing a selector expression to match elements against.
    * @see \`{@link https://api.jquery.com/parents/ }\`
    * @since 1.0
    */
  def parents(): this.type = js.native
  def parents(selector: Selector): this.type = js.native
  /**
    * Get the ancestors of each element in the current set of matched elements, up to but not including
    * the element matched by the selector, DOM node, or jQuery object.
    *
    * @param selector A string containing a selector expression to indicate where to stop matching ancestor elements.
    *                 A DOM node or jQuery object indicating where to stop matching ancestor elements.
    * @param filter A string containing a selector expression to match elements against.
    * @see \`{@link https://api.jquery.com/parentsUntil/ }\`
    * @since 1.4
    * @since 1.6
    */
  def parentsUntil(): this.type = js.native
  def parentsUntil(selector: JQuery[HTMLElement]): this.type = js.native
  def parentsUntil(selector: Selector): this.type = js.native
  def parentsUntil(selector: Selector, filter: Selector): this.type = js.native
  def parentsUntil(selector: JQuery[HTMLElement], filter: Selector): this.type = js.native
  def parentsUntil(selector: Element): this.type = js.native
  def parentsUntil(selector: Element, filter: Selector): this.type = js.native
  /**
    * Get the current coordinates of the first element in the set of matched elements, relative to the offset parent.
    *
    * @see \`{@link https://api.jquery.com/position/ }\`
    * @since 1.2
    */
  def position(): Coordinates = js.native
  /**
    * Insert content, specified by the parameter, to the beginning of each element in the set of matched elements.
    *
    * @param contents One or more additional DOM elements, text nodes, arrays of elements and text nodes, HTML strings, or
    *                 jQuery objects to insert at the beginning of each element in the set of matched elements.
    * @see \`{@link https://api.jquery.com/prepend/ }\`
    * @since 1.0
    */
  def prepend(contents: (htmlString | (TypeOrArray[Node | JQuery[Node]]))*): this.type = js.native
  /**
    * Insert content, specified by the parameter, to the beginning of each element in the set of matched elements.
    *
    * @param fn A function that returns an HTML string, DOM element(s), text node(s), or jQuery object to insert at
    *           the beginning of each element in the set of matched elements. Receives the index position of the
    *           element in the set and the old HTML value of the element as arguments. Within the function, this
    *           refers to the current element in the set.
    * @see \`{@link https://api.jquery.com/prepend/ }\`
    * @since 1.4
    */
  def prepend(
    fn: js.ThisFunction2[
      /* this */ TElement, 
      /* index */ Double, 
      /* html */ String, 
      htmlString | (TypeOrArray[Node | JQuery[Node]])
    ]
  ): this.type = js.native
  /**
    * Insert every element in the set of matched elements to the beginning of the target.
    *
    * @param target A selector, element, HTML string, array of elements, or jQuery object; the matched set of elements
    *               will be inserted at the beginning of the element(s) specified by this parameter.
    * @see \`{@link https://api.jquery.com/prependTo/ }\`
    * @since 1.0
    */
  def prependTo(target: Selector | TypeOrArray[Element] | htmlString): this.type = js.native
  def prependTo(target: JQuery[HTMLElement]): this.type = js.native
  /**
    * Get the immediately preceding sibling of each element in the set of matched elements. If a selector
    * is provided, it retrieves the previous sibling only if it matches that selector.
    *
    * @param selector A string containing a selector expression to match elements against.
    * @see \`{@link https://api.jquery.com/prev/ }\`
    * @since 1.0
    */
  def prev(): this.type = js.native
  def prev(selector: Selector): this.type = js.native
  /**
    * Get all preceding siblings of each element in the set of matched elements, optionally filtered by a selector.
    *
    * @param selector A string containing a selector expression to match elements against.
    * @see \`{@link https://api.jquery.com/prevAll/ }\`
    * @since 1.2
    */
  def prevAll(): this.type = js.native
  def prevAll(selector: Selector): this.type = js.native
  /**
    * Get all preceding siblings of each element up to but not including the element matched by the
    * selector, DOM node, or jQuery object.
    *
    * @param selector A string containing a selector expression to indicate where to stop matching preceding sibling elements.
    *                 A DOM node or jQuery object indicating where to stop matching preceding sibling elements.
    * @param filter A string containing a selector expression to match elements against.
    * @see \`{@link https://api.jquery.com/prevUntil/ }\`
    * @since 1.4
    * @since 1.6
    */
  def prevUntil(): this.type = js.native
  def prevUntil(selector: JQuery[HTMLElement]): this.type = js.native
  def prevUntil(selector: Selector): this.type = js.native
  def prevUntil(selector: Selector, filter: Selector): this.type = js.native
  def prevUntil(selector: JQuery[HTMLElement], filter: Selector): this.type = js.native
  def prevUntil(selector: Element): this.type = js.native
  def prevUntil(selector: Element, filter: Selector): this.type = js.native
  /**
    * Return a Promise object to observe when all actions of a certain type bound to the collection,
    * queued or not, have finished.
    *
    * @param type The type of queue that needs to be observed.
    * @see \`{@link https://api.jquery.com/promise/ }\`
    * @since 1.6
    */
  def promise(): Promise[this.type, _, _] = js.native
  def promise(`type`: String): Promise[this.type, _, _] = js.native
  /**
    * Return a Promise object to observe when all actions of a certain type bound to the collection,
    * queued or not, have finished.
    *
    * @param target Object onto which the promise methods have to be attached
    * @see \`{@link https://api.jquery.com/promise/ }\`
    * @since 1.6
    */
  def promise[T /* <: js.Object */](target: T): T with (Promise[this.type, _, _]) = js.native
  /**
    * Return a Promise object to observe when all actions of a certain type bound to the collection,
    * queued or not, have finished.
    *
    * @param type The type of queue that needs to be observed.
    * @param target Object onto which the promise methods have to be attached
    * @see \`{@link https://api.jquery.com/promise/ }\`
    * @since 1.6
    */
  def promise[T /* <: js.Object */](`type`: String, target: T): T with (Promise[this.type, _, _]) = js.native
   // tslint:disable-line:unified-signatures
  /**
    * Set one or more properties for the set of matched elements.
    *
    * @param properties An object of property-value pairs to set.
    * @see \`{@link https://api.jquery.com/prop/ }\`
    * @since 1.6
    */
  def prop(properties: PlainObject[_]): this.type = js.native
  /**
    * Get the value of a property for the first element in the set of matched elements.
    *
    * @param propertyName The name of the property to get.
    * @see \`{@link https://api.jquery.com/prop/ }\`
    * @since 1.6
    */
  def prop(propertyName: String): js.UndefOr[js.Any] = js.native
  /**
    * Set one or more properties for the set of matched elements.
    *
    * @param propertyName The name of the property to set.
    * @param value A value to set for the property.
    * @see \`{@link https://api.jquery.com/prop/ }\`
    * @since 1.6
    */
  def prop(propertyName: String, value: js.Any): this.type = js.native
  /**
    * Set one or more properties for the set of matched elements.
    *
    * @param propertyName The name of the property to set.
    * @param value A function returning the value to set. Receives the index position of the element in the set and the
    *              old property value as arguments. Within the function, the keyword this refers to the current element.
    * @see \`{@link https://api.jquery.com/prop/ }\`
    * @since 1.6
    */
  def prop(
    propertyName: String,
    value: js.ThisFunction2[/* this */ TElement, /* index */ Double, /* oldPropertyValue */ js.Any, _]
  ): this.type = js.native
  /**
    * Add a collection of DOM elements onto the jQuery stack.
    *
    * @param elements An array of elements to push onto the stack and make into a new jQuery object.
    * @see \`{@link https://api.jquery.com/pushStack/ }\`
    * @since 1.0
    */
  def pushStack(elements: ArrayLike[Element]): this.type = js.native
  /**
    * Add a collection of DOM elements onto the jQuery stack.
    *
    * @param elements An array of elements to push onto the stack and make into a new jQuery object.
    * @param name The name of a jQuery method that generated the array of elements.
    * @param args The arguments that were passed in to the jQuery method (for serialization).
    * @see \`{@link https://api.jquery.com/pushStack/ }\`
    * @since 1.3
    */
  def pushStack(elements: ArrayLike[Element], name: String, args: js.Array[_]): this.type = js.native
  /**
    * Show the queue of functions to be executed on the matched elements.
    *
    * @param queueName A string containing the name of the queue. Defaults to fx, the standard effects queue.
    * @see \`{@link https://api.jquery.com/queue/ }\`
    * @since 1.2
    */
  def queue(): Queue[typings.std.Node] = js.native
  /**
    * Manipulate the queue of functions to be executed, once for each matched element.
    *
    * @param newQueue The new function to add to the queue, with a function to call that will dequeue the next item.
    *                 An array of functions to replace the current queue contents.
    * @see \`{@link https://api.jquery.com/queue/ }\`
    * @since 1.2
    */
  def queue(newQueue: TypeOrArray[QueueFunction[TElement]]): this.type = js.native
  def queue(queueName: String): Queue[typings.std.Node] = js.native
  /**
    * Manipulate the queue of functions to be executed, once for each matched element.
    *
    * @param queueName A string containing the name of the queue. Defaults to fx, the standard effects queue.
    * @param newQueue The new function to add to the queue, with a function to call that will dequeue the next item.
    *                 An array of functions to replace the current queue contents.
    * @see \`{@link https://api.jquery.com/queue/ }\`
    * @since 1.2
    */
  def queue(queueName: String, newQueue: TypeOrArray[QueueFunction[TElement]]): this.type = js.native
  /**
    * Specify a function to execute when the DOM is fully loaded.
    *
    * @param handler A function to execute after the DOM is ready.
    * @see \`{@link https://api.jquery.com/ready/ }\`
    * @since 1.0
    *
    * @deprecated Deprecated since 3.0. Use `jQuery(function() { })`.
    */
  def ready(handler: js.Function1[/* $ */ JQueryStatic, Unit]): this.type = js.native
  /**
    * Remove the set of matched elements from the DOM.
    *
    * @param selector A selector expression that filters the set of matched elements to be removed.
    * @see \`{@link https://api.jquery.com/remove/ }\`
    * @since 1.0
    */
  def remove(): this.type = js.native
  def remove(selector: String): this.type = js.native
  /**
    * Remove an attribute from each element in the set of matched elements.
    *
    * @param attributeName An attribute to remove; as of version 1.7, it can be a space-separated list of attributes.
    * @see \`{@link https://api.jquery.com/removeAttr/ }\`
    * @since 1.0
    */
  def removeAttr(attributeName: String): this.type = js.native
  /**
    * Remove a single class, multiple classes, or all classes from each element in the set of matched elements.
    *
    * @param className One or more space-separated classes to be removed from the class attribute of each matched element.
    *                  An array of classes to be removed from the class attribute of each matched element.
    *                  A function returning one or more space-separated class names to be removed. Receives the index
    *                  position of the element in the set and the old class value as arguments.
    * @see \`{@link https://api.jquery.com/removeClass/ }\`
    * @since 1.0
    * @since 1.4
    * @since 3.3
    */
  def removeClass(): this.type = js.native
  def removeClass(
    className: js.ThisFunction2[/* this */ TElement, /* index */ Double, /* className */ String, String]
  ): this.type = js.native
  def removeClass(className: TypeOrArray[String]): this.type = js.native
  /**
    * Remove a previously-stored piece of data.
    *
    * @param name A string naming the piece of data to delete.
    *             An array or space-separated string naming the pieces of data to delete.
    * @see \`{@link https://api.jquery.com/removeData/ }\`
    * @since 1.2.3
    * @since 1.7
    */
  def removeData(): this.type = js.native
  def removeData(name: TypeOrArray[String]): this.type = js.native
  /**
    * Remove a property for the set of matched elements.
    *
    * @param propertyName The name of the property to remove.
    * @see \`{@link https://api.jquery.com/removeProp/ }\`
    * @since 1.6
    */
  def removeProp(propertyName: String): this.type = js.native
  def replaceAll(target: JQuery[HTMLElement]): this.type = js.native
  /**
    * Replace each target element with the set of matched elements.
    *
    * @param target A selector string, jQuery object, DOM element, or array of elements indicating which element(s) to replace.
    * @see \`{@link https://api.jquery.com/replaceAll/ }\`
    * @since 1.2
    */
  def replaceAll(target: Selector): this.type = js.native
  def replaceAll(target: TypeOrArray[Element]): this.type = js.native
  def replaceWith(newContent: js.ThisFunction0[/* this */ TElement, _]): this.type = js.native
  def replaceWith(newContent: JQuery[HTMLElement]): this.type = js.native
  def replaceWith(newContent: TypeOrArray[Element]): this.type = js.native
  /**
    * Replace each element in the set of matched elements with the provided new content and return the set
    * of elements that was removed.
    *
    * @param newContent The content to insert. May be an HTML string, DOM element, array of DOM elements, or jQuery object.
    *                   A function that returns content with which to replace the set of matched elements.
    * @see \`{@link https://api.jquery.com/replaceWith/ }\`
    * @since 1.2
    * @since 1.4
    */
  def replaceWith(newContent: htmlString): this.type = js.native
  /**
    * Bind an event handler to the "resize" JavaScript event, or trigger that event on an element.
    *
    * @param handler A function to execute each time the event is triggered.
    * @see \`{@link https://api.jquery.com/resize/ }\`
    * @since 1.0
    *
    * @deprecated Deprecated since 3.3. Use \`{@link JQuery.on }\` or \`{@link JQuery.trigger }\`.
    */
  def resize(): this.type = js.native
  def resize(handler: (EventHandler[TElement, Null]) | (EventHandlerBase[_, Event[TElement, Null]])): this.type = js.native
  /**
    * Bind an event handler to the "resize" JavaScript event, or trigger that event on an element.
    *
    * @param eventData An object containing data that will be passed to the event handler.
    * @param handler A function to execute each time the event is triggered.
    * @see \`{@link https://api.jquery.com/resize/ }\`
    * @since 1.4.3
    *
    * @deprecated Deprecated since 3.3. Use \`{@link JQuery.on }\` or \`{@link JQuery.trigger }\`.
    */
  def resize[TData](
    eventData: TData,
    handler: (EventHandler[TElement, TData]) | (EventHandlerBase[_, Event[TElement, TData]])
  ): this.type = js.native
  @JSName("resize")
  def resize_false(handler: `false`): this.type = js.native
  /**
    * Bind an event handler to the "scroll" JavaScript event, or trigger that event on an element.
    *
    * @param handler A function to execute each time the event is triggered.
    * @see \`{@link https://api.jquery.com/scroll/ }\`
    * @since 1.0
    *
    * @deprecated Deprecated since 3.3. Use \`{@link JQuery.on }\` or \`{@link JQuery.trigger }\`.
    */
  def scroll(): this.type = js.native
  def scroll(handler: (EventHandler[TElement, Null]) | (EventHandlerBase[_, Event[TElement, Null]])): this.type = js.native
  /**
    * Bind an event handler to the "scroll" JavaScript event, or trigger that event on an element.
    *
    * @param eventData An object containing data that will be passed to the event handler.
    * @param handler A function to execute each time the event is triggered.
    * @see \`{@link https://api.jquery.com/scroll/ }\`
    * @since 1.4.3
    *
    * @deprecated Deprecated since 3.3. Use \`{@link JQuery.on }\` or \`{@link JQuery.trigger }\`.
    */
  def scroll[TData](
    eventData: TData,
    handler: (EventHandler[TElement, TData]) | (EventHandlerBase[_, Event[TElement, TData]])
  ): this.type = js.native
  /**
    * Get the current horizontal position of the scroll bar for the first element in the set of matched elements.
    *
    * @see \`{@link https://api.jquery.com/scrollLeft/ }\`
    * @since 1.2.6
    */
  def scrollLeft(): js.UndefOr[Double] = js.native
  /**
    * Set the current horizontal position of the scroll bar for each of the set of matched elements.
    *
    * @param value An integer indicating the new position to set the scroll bar to.
    * @see \`{@link https://api.jquery.com/scrollLeft/ }\`
    * @since 1.2.6
    */
  def scrollLeft(value: Double): this.type = js.native
  /**
    * Get the current vertical position of the scroll bar for the first element in the set of matched
    * elements or set the vertical position of the scroll bar for every matched element.
    *
    * @see \`{@link https://api.jquery.com/scrollTop/ }\`
    * @since 1.2.6
    */
  def scrollTop(): js.UndefOr[Double] = js.native
  /**
    * Set the current vertical position of the scroll bar for each of the set of matched elements.
    *
    * @param value A number indicating the new position to set the scroll bar to.
    * @see \`{@link https://api.jquery.com/scrollTop/ }\`
    * @since 1.2.6
    */
  def scrollTop(value: Double): this.type = js.native
  @JSName("scroll")
  def scroll_false(handler: `false`): this.type = js.native
  /**
    * Bind an event handler to the "select" JavaScript event, or trigger that event on an element.
    *
    * @param handler A function to execute each time the event is triggered.
    * @see \`{@link https://api.jquery.com/select/ }\`
    * @since 1.0
    *
    * @deprecated Deprecated since 3.3. Use \`{@link JQuery.on }\` or \`{@link JQuery.trigger }\`.
    */
  def select(): this.type = js.native
  def select(handler: (EventHandler[TElement, Null]) | (EventHandlerBase[_, Event[TElement, Null]])): this.type = js.native
  /**
    * Bind an event handler to the "select" JavaScript event, or trigger that event on an element.
    *
    * @param eventData An object containing data that will be passed to the event handler.
    * @param handler A function to execute each time the event is triggered.
    * @see \`{@link https://api.jquery.com/select/ }\`
    * @since 1.4.3
    *
    * @deprecated Deprecated since 3.3. Use \`{@link JQuery.on }\` or \`{@link JQuery.trigger }\`.
    */
  def select[TData](
    eventData: TData,
    handler: (EventHandler[TElement, TData]) | (EventHandlerBase[_, Event[TElement, TData]])
  ): this.type = js.native
  @JSName("select")
  def select_false(handler: `false`): this.type = js.native
  /**
    * Encode a set of form elements as a string for submission.
    *
    * @see \`{@link https://api.jquery.com/serialize/ }\`
    * @since 1.0
    */
  def serialize(): String = js.native
  /**
    * Encode a set of form elements as an array of names and values.
    *
    * @see \`{@link https://api.jquery.com/serializeArray/ }\`
    * @since 1.2
    */
  def serializeArray(): js.Array[NameValuePair] = js.native
  /**
    * Display the matched elements.
    *
    * @param duration_complete_options A string or number determining how long the animation will run.
    *                                  A function to call once the animation is complete, called once per matched element.
    *                                  A map of additional options to pass to the method.
    * @see \`{@link https://api.jquery.com/show/ }\`
    * @since 1.0
    */
  def show(): this.type = js.native
  def show(duration_complete_options: js.ThisFunction0[/* this */ TElement, Unit]): this.type = js.native
  def show(duration_complete_options: Duration): this.type = js.native
  def show(duration_complete_options: EffectsOptions[TElement]): this.type = js.native
  /**
    * Display the matched elements.
    *
    * @param duration A string or number determining how long the animation will run.
    * @param easing_complete A string indicating which easing function to use for the transition.
    *                        A function to call once the animation is complete, called once per matched element.
    * @see \`{@link https://api.jquery.com/show/ }\`
    * @since 1.0
    * @since 1.4.3
    */
  def show(duration: Duration, easing_complete: String): this.type = js.native
  def show(duration: Duration, easing_complete: js.ThisFunction0[/* this */ TElement, Unit]): this.type = js.native
  /**
    * Display the matched elements.
    *
    * @param duration A string or number determining how long the animation will run.
    * @param easing A string indicating which easing function to use for the transition.
    * @param complete A function to call once the animation is complete, called once per matched element.
    * @see \`{@link https://api.jquery.com/show/ }\`
    * @since 1.4.3
    */
  def show(duration: Duration, easing: String, complete: js.ThisFunction0[/* this */ TElement, Unit]): this.type = js.native
  /**
    * Get the siblings of each element in the set of matched elements, optionally filtered by a selector.
    *
    * @param selector A string containing a selector expression to match elements against.
    * @see \`{@link https://api.jquery.com/siblings/ }\`
    * @since 1.0
    */
  def siblings(): this.type = js.native
  def siblings(selector: Selector): this.type = js.native
  /**
    * Reduce the set of matched elements to a subset specified by a range of indices.
    *
    * @param start An integer indicating the 0-based position at which the elements begin to be selected. If negative,
    *              it indicates an offset from the end of the set.
    * @param end An integer indicating the 0-based position at which the elements stop being selected. If negative,
    *            it indicates an offset from the end of the set. If omitted, the range continues until the end of the set.
    * @see \`{@link https://api.jquery.com/slice/ }\`
    * @since 1.1.4
    */
  def slice(start: Double): this.type = js.native
  def slice(start: Double, end: Double): this.type = js.native
  /**
    * Display the matched elements with a sliding motion.
    *
    * @param duration_easing_complete_options A string or number determining how long the animation will run.
    *                                         A string indicating which easing function to use for the transition.
    *                                         A function to call once the animation is complete, called once per matched element.
    *                                         A map of additional options to pass to the method.
    * @see \`{@link https://api.jquery.com/slideDown/ }\`
    * @since 1.0
    * @since 1.4.3
    */
  def slideDown(): this.type = js.native
  def slideDown(duration_easing_complete_options: String): this.type = js.native
  def slideDown(duration_easing_complete_options: js.ThisFunction0[/* this */ TElement, Unit]): this.type = js.native
  def slideDown(duration_easing_complete_options: Duration): this.type = js.native
  def slideDown(duration_easing_complete_options: EffectsOptions[TElement]): this.type = js.native
  def slideDown(duration_easing: String, complete: js.ThisFunction0[/* this */ TElement, Unit]): this.type = js.native
  /**
    * Display the matched elements with a sliding motion.
    *
    * @param duration_easing A string or number determining how long the animation will run.
    *                        A string indicating which easing function to use for the transition.
    * @param complete A function to call once the animation is complete, called once per matched element.
    * @see \`{@link https://api.jquery.com/slideDown/ }\`
    * @since 1.0
    * @since 1.4.3
    */
  def slideDown(duration_easing: Duration, complete: js.ThisFunction0[/* this */ TElement, Unit]): this.type = js.native
  /**
    * Display the matched elements with a sliding motion.
    *
    * @param duration A string or number determining how long the animation will run.
    * @param easing A string indicating which easing function to use for the transition.
    * @param complete A function to call once the animation is complete, called once per matched element.
    * @see \`{@link https://api.jquery.com/slideDown/ }\`
    * @since 1.4.3
    */
  def slideDown(duration: Duration, easing: String): this.type = js.native
  def slideDown(duration: Duration, easing: String, complete: js.ThisFunction0[/* this */ TElement, Unit]): this.type = js.native
  /**
    * Display or hide the matched elements with a sliding motion.
    *
    * @param duration_easing_complete_options A string or number determining how long the animation will run.
    *                                         A string indicating which easing function to use for the transition.
    *                                         A function to call once the animation is complete, called once per matched element.
    *                                         A map of additional options to pass to the method.
    * @see \`{@link https://api.jquery.com/slideToggle/ }\`
    * @since 1.0
    * @since 1.4.3
    */
  def slideToggle(): this.type = js.native
  def slideToggle(duration_easing_complete_options: String): this.type = js.native
  def slideToggle(duration_easing_complete_options: js.ThisFunction0[/* this */ TElement, Unit]): this.type = js.native
  def slideToggle(duration_easing_complete_options: Duration): this.type = js.native
  def slideToggle(duration_easing_complete_options: EffectsOptions[TElement]): this.type = js.native
  def slideToggle(duration_easing: String, complete: js.ThisFunction0[/* this */ TElement, Unit]): this.type = js.native
  /**
    * Display or hide the matched elements with a sliding motion.
    *
    * @param duration_easing A string or number determining how long the animation will run.
    *                        A string indicating which easing function to use for the transition.
    * @param complete A function to call once the animation is complete, called once per matched element.
    * @see \`{@link https://api.jquery.com/slideToggle/ }\`
    * @since 1.0
    * @since 1.4.3
    */
  def slideToggle(duration_easing: Duration, complete: js.ThisFunction0[/* this */ TElement, Unit]): this.type = js.native
  /**
    * Display or hide the matched elements with a sliding motion.
    *
    * @param duration A string or number determining how long the animation will run.
    * @param easing A string indicating which easing function to use for the transition.
    * @param complete A function to call once the animation is complete, called once per matched element.
    * @see \`{@link https://api.jquery.com/slideToggle/ }\`
    * @since 1.4.3
    */
  def slideToggle(duration: Duration, easing: String): this.type = js.native
  def slideToggle(duration: Duration, easing: String, complete: js.ThisFunction0[/* this */ TElement, Unit]): this.type = js.native
  /**
    * Hide the matched elements with a sliding motion.
    *
    * @param duration_easing_complete_options A string or number determining how long the animation will run.
    *                                         A string indicating which easing function to use for the transition.
    *                                         A function to call once the animation is complete, called once per matched element.
    *                                         A map of additional options to pass to the method.
    * @see \`{@link https://api.jquery.com/slideUp/ }\`
    * @since 1.0
    * @since 1.4.3
    */
  def slideUp(): this.type = js.native
  def slideUp(duration_easing_complete_options: String): this.type = js.native
  def slideUp(duration_easing_complete_options: js.ThisFunction0[/* this */ TElement, Unit]): this.type = js.native
  def slideUp(duration_easing_complete_options: Duration): this.type = js.native
  def slideUp(duration_easing_complete_options: EffectsOptions[TElement]): this.type = js.native
  def slideUp(duration_easing: String, complete: js.ThisFunction0[/* this */ TElement, Unit]): this.type = js.native
  /**
    * Hide the matched elements with a sliding motion.
    *
    * @param duration_easing A string or number determining how long the animation will run.
    *                        A string indicating which easing function to use for the transition.
    * @param complete A function to call once the animation is complete, called once per matched element.
    * @see \`{@link https://api.jquery.com/slideUp/ }\`
    * @since 1.0
    * @since 1.4.3
    */
  def slideUp(duration_easing: Duration, complete: js.ThisFunction0[/* this */ TElement, Unit]): this.type = js.native
  /**
    * Hide the matched elements with a sliding motion.
    *
    * @param duration A string or number determining how long the animation will run.
    * @param easing A string indicating which easing function to use for the transition.
    * @param complete A function to call once the animation is complete, called once per matched element.
    * @see \`{@link https://api.jquery.com/slideUp/ }\`
    * @since 1.4.3
    */
  def slideUp(duration: Duration, easing: String): this.type = js.native
  def slideUp(duration: Duration, easing: String, complete: js.ThisFunction0[/* this */ TElement, Unit]): this.type = js.native
  /**
    * Stop the currently-running animation on the matched elements.
    *
    * @param clearQueue A Boolean indicating whether to remove queued animation as well. Defaults to false.
    * @param jumpToEnd A Boolean indicating whether to complete the current animation immediately. Defaults to false.
    * @see \`{@link https://api.jquery.com/stop/ }\`
    * @since 1.2
    */
  def stop(): this.type = js.native
  def stop(clearQueue: Boolean): this.type = js.native
  def stop(clearQueue: Boolean, jumpToEnd: Boolean): this.type = js.native
  /**
    * Stop the currently-running animation on the matched elements.
    *
    * @param queue The name of the queue in which to stop animations.
    * @param clearQueue A Boolean indicating whether to remove queued animation as well. Defaults to false.
    * @param jumpToEnd A Boolean indicating whether to complete the current animation immediately. Defaults to false.
    * @see \`{@link https://api.jquery.com/stop/ }\`
    * @since 1.7
    */
  def stop(queue: String): this.type = js.native
  def stop(queue: String, clearQueue: Boolean): this.type = js.native
  def stop(queue: String, clearQueue: Boolean, jumpToEnd: Boolean): this.type = js.native
  /**
    * Bind an event handler to the "submit" JavaScript event, or trigger that event on an element.
    *
    * @param handler A function to execute each time the event is triggered.
    * @see \`{@link https://api.jquery.com/submit/ }\`
    * @since 1.0
    *
    * @deprecated Deprecated since 3.3. Use \`{@link JQuery.on }\` or \`{@link JQuery.trigger }\`.
    */
  def submit(): this.type = js.native
  def submit(handler: (EventHandler[TElement, Null]) | (EventHandlerBase[_, Event[TElement, Null]])): this.type = js.native
  /**
    * Bind an event handler to the "submit" JavaScript event, or trigger that event on an element.
    *
    * @param eventData An object containing data that will be passed to the event handler.
    * @param handler A function to execute each time the event is triggered.
    * @see \`{@link https://api.jquery.com/submit/ }\`
    * @since 1.4.3
    *
    * @deprecated Deprecated since 3.3. Use \`{@link JQuery.on }\` or \`{@link JQuery.trigger }\`.
    */
  def submit[TData](
    eventData: TData,
    handler: (EventHandler[TElement, TData]) | (EventHandlerBase[_, Event[TElement, TData]])
  ): this.type = js.native
  @JSName("submit")
  def submit_false(handler: `false`): this.type = js.native
  /**
    * Get the combined text contents of each element in the set of matched elements, including their descendants.
    *
    * @see \`{@link https://api.jquery.com/text/ }\`
    * @since 1.0
    */
  def text(): String = js.native
  /**
    * Set the content of each element in the set of matched elements to the specified text.
    *
    * @param text The text to set as the content of each matched element. When Number or Boolean is supplied, it will
    *             be converted to a String representation.
    *             A function returning the text content to set. Receives the index position of the element in the set
    *             and the old text value as arguments.
    * @see \`{@link https://api.jquery.com/text/ }\`
    * @since 1.0
    * @since 1.4
    */
  def text(text: String): this.type = js.native
  def text(
    text: js.ThisFunction2[/* this */ TElement, /* index */ Double, /* text */ String, String | Double | Boolean]
  ): this.type = js.native
  def text(text: Boolean): this.type = js.native
  def text(text: Double): this.type = js.native
  /**
    * Retrieve all the elements contained in the jQuery set, as an array.
    *
    * @see \`{@link https://api.jquery.com/toArray/ }\`
    * @since 1.4
    */
  def toArray(): js.Array[TElement] = js.native
  /**
    * Display or hide the matched elements.
    *
    * @param duration_complete_options_display A string or number determining how long the animation will run.
    *                                          A function to call once the animation is complete, called once per matched element.
    *                                          A map of additional options to pass to the method.
    *                                          Use true to show the element or false to hide it.
    * @see \`{@link https://api.jquery.com/toggle/ }\`
    * @since 1.0
    * @since 1.3
    */
  def toggle(): this.type = js.native
  def toggle(duration_complete_options_display: js.ThisFunction0[/* this */ TElement, Unit]): this.type = js.native
  def toggle(duration_complete_options_display: Boolean): this.type = js.native
  def toggle(duration_complete_options_display: Duration): this.type = js.native
  def toggle(duration_complete_options_display: EffectsOptions[TElement]): this.type = js.native
  /**
    * Display or hide the matched elements.
    *
    * @param duration A string or number determining how long the animation will run.
    * @param complete A function to call once the animation is complete, called once per matched element.
    * @see \`{@link https://api.jquery.com/toggle/ }\`
    * @since 1.0
    */
  def toggle(duration: Duration, complete: js.ThisFunction0[/* this */ TElement, Unit]): this.type = js.native
  /**
    * Display or hide the matched elements.
    *
    * @param duration A string or number determining how long the animation will run.
    * @param easing A string indicating which easing function to use for the transition.
    * @param complete A function to call once the animation is complete, called once per matched element.
    * @see \`{@link https://api.jquery.com/toggle/ }\`
    * @since 1.4.3
    */
  def toggle(duration: Duration, easing: String): this.type = js.native
  def toggle(duration: Duration, easing: String, complete: js.ThisFunction0[/* this */ TElement, Unit]): this.type = js.native
  /**
    * Add or remove one or more classes from each element in the set of matched elements, depending on
    * either the class's presence or the value of the state argument.
    *
    * @param state A boolean value to determine whether the class should be added or removed.
    * @see \`{@link https://api.jquery.com/toggleClass/ }\`
    * @since 1.4
    *
    * @deprecated Deprecated since 3.0. See \`{@link https://github.com/jquery/jquery/pull/2618 }\`.
    */
  def toggleClass(): this.type = js.native
  def toggleClass(state: Boolean): this.type = js.native
  def toggleClass[TState /* <: Boolean */](
    className: js.ThisFunction3[
      /* this */ TElement, 
      /* index */ Double, 
      /* className */ String, 
      /* state */ TState, 
      String
    ]
  ): this.type = js.native
  def toggleClass[TState /* <: Boolean */](
    className: js.ThisFunction3[
      /* this */ TElement, 
      /* index */ Double, 
      /* className */ String, 
      /* state */ TState, 
      String
    ],
    state: TState
  ): this.type = js.native
  /**
    * Add or remove one or more classes from each element in the set of matched elements, depending on
    * either the class's presence or the value of the state argument.
    *
    * @param className One or more class names (separated by spaces) to be toggled for each element in the matched set.
    *                  An array of classes to be toggled for each element in the matched set.
    *                  A function that returns class names to be toggled in the class attribute of each element in the
    *                  matched set. Receives the index position of the element in the set, the old class value, and the state as arguments.
    * @param state A Boolean (not just truthy/falsy) value to determine whether the class should be added or removed.
    * @see \`{@link https://api.jquery.com/toggleClass/ }\`
    * @since 1.0
    * @since 1.3
    * @since 1.4
    * @since 3.3
    */
  def toggleClass[TState /* <: Boolean */](className: TypeOrArray[String]): this.type = js.native
  def toggleClass[TState /* <: Boolean */](className: TypeOrArray[String], state: TState): this.type = js.native
  /**
    * Execute all handlers and behaviors attached to the matched elements for the given event type.
    *
    * @param eventType A string containing a JavaScript event type, such as click or submit.
    *                  A jQuery.Event object.
    * @param extraParameters Additional parameters to pass along to the event handler.
    * @see \`{@link https://api.jquery.com/trigger/ }\`
    * @since 1.0
    * @since 1.3
    */
  def trigger(eventType: String): this.type = js.native
  def trigger(eventType: String, extraParameters: String): this.type = js.native
  def trigger(eventType: String, extraParameters: js.Array[_]): this.type = js.native
  def trigger(eventType: String, extraParameters: Double): this.type = js.native
  def trigger(eventType: String, extraParameters: PlainObject[_]): this.type = js.native
  def trigger(eventType: Event[TElement, Null]): this.type = js.native
  def trigger(eventType: Event[TElement, Null], extraParameters: String): this.type = js.native
  def trigger(eventType: Event[TElement, Null], extraParameters: js.Array[_]): this.type = js.native
  def trigger(eventType: Event[TElement, Null], extraParameters: Double): this.type = js.native
  def trigger(eventType: Event[TElement, Null], extraParameters: PlainObject[_]): this.type = js.native
  /**
    * Execute all handlers attached to an element for an event.
    *
    * @param eventType A string containing a JavaScript event type, such as click or submit.
    *                  A jQuery.Event object.
    * @param extraParameters Additional parameters to pass along to the event handler.
    * @see \`{@link https://api.jquery.com/triggerHandler/ }\`
    * @since 1.2
    * @since 1.3
    */
  def triggerHandler(eventType: String): js.UndefOr[js.Any] = js.native
  def triggerHandler(eventType: String, extraParameters: String): js.UndefOr[js.Any] = js.native
  def triggerHandler(eventType: String, extraParameters: js.Array[_]): js.UndefOr[js.Any] = js.native
  def triggerHandler(eventType: String, extraParameters: Double): js.UndefOr[js.Any] = js.native
  def triggerHandler(eventType: String, extraParameters: PlainObject[_]): js.UndefOr[js.Any] = js.native
  def triggerHandler(eventType: Event[TElement, Null]): js.UndefOr[js.Any] = js.native
  def triggerHandler(eventType: Event[TElement, Null], extraParameters: String): js.UndefOr[js.Any] = js.native
  def triggerHandler(eventType: Event[TElement, Null], extraParameters: js.Array[_]): js.UndefOr[js.Any] = js.native
  def triggerHandler(eventType: Event[TElement, Null], extraParameters: Double): js.UndefOr[js.Any] = js.native
  def triggerHandler(eventType: Event[TElement, Null], extraParameters: PlainObject[_]): js.UndefOr[js.Any] = js.native
  /**
    * Remove a previously-attached event handler from the elements.
    *
    * @param event A string containing one or more DOM event types, such as "click" or "submit," or custom event names.
    *              A jQuery.Event object.
    * @see \`{@link https://api.jquery.com/unbind/ }\`
    * @since 1.0
    *
    * @deprecated Deprecated since 3.0. Use \`{@link JQuery.off }\`.
    */
  def unbind(): this.type = js.native
  def unbind(event: String): this.type = js.native
  /**
    * Remove a previously-attached event handler from the elements.
    *
    * @param event A string containing one or more DOM event types, such as "click" or "submit," or custom event names.
    * @param handler A function to execute each time the event is triggered.
    * @see \`{@link https://api.jquery.com/unbind/ }\`
    * @since 1.0
    * @since 1.4.3
    *
    * @deprecated Deprecated since 3.0. Use \`{@link JQuery.off }\`.
    */
  def unbind(event: String, handler: EventHandlerBase[_, Event[TElement, _]]): this.type = js.native
  def unbind(event: Event[TElement, Null]): this.type = js.native
  @JSName("unbind")
  def unbind_false(event: String, handler: `false`): this.type = js.native
  /**
    * Remove a handler from the event for all elements which match the current selector, based upon a
    * specific set of root elements.
    *
    * @param namespace A selector which will be used to filter the event results.
    * @see \`{@link https://api.jquery.com/undelegate/ }\`
    * @since 1.4.2
    * @since 1.6
    *
    * @deprecated Deprecated since 3.0. Use \`{@link JQuery.off }\`.
    */
  def undelegate(): this.type = js.native
  def undelegate(namespace: String): this.type = js.native
  /**
    * Remove a handler from the event for all elements which match the current selector, based upon a
    * specific set of root elements.
    *
    * @param selector A selector which will be used to filter the event results.
    * @param eventType A string containing a JavaScript event type, such as "click" or "keydown"
    * @param handler A function to execute each time the event is triggered.
    * @see \`{@link https://api.jquery.com/undelegate/ }\`
    * @since 1.4.2
    *
    * @deprecated Deprecated since 3.0. Use \`{@link JQuery.off }\`.
    */
  def undelegate(selector: Selector, eventType: String, handler: EventHandlerBase[_, Event[TElement, _]]): this.type = js.native
  /**
    * Remove a handler from the event for all elements which match the current selector, based upon a
    * specific set of root elements.
    *
    * @param selector A selector which will be used to filter the event results.
    * @param eventTypes A string containing a JavaScript event type, such as "click" or "keydown"
    *                   An object of one or more event types and previously bound functions to unbind from them.
    * @see \`{@link https://api.jquery.com/undelegate/ }\`
    * @since 1.4.2
    * @since 1.4.3
    *
    * @deprecated Deprecated since 3.0. Use \`{@link JQuery.off }\`.
    */
  def undelegate(selector: Selector, eventTypes: String): this.type = js.native
  @JSName("undelegate")
  def undelegate_false(selector: Selector, eventType: String, handler: `false`): this.type = js.native
  @JSName("undelegate")
  def undelegate_false(selector: Selector, eventTypes: PlainObject[(EventHandlerBase[_, Event[TElement, _]]) | `false`]): this.type = js.native
  /**
    * Remove the parents of the set of matched elements from the DOM, leaving the matched elements in their place.
    *
    * @param selector A selector to check the parent element against. If an element's parent does not match the selector,
    *                 the element won't be unwrapped.
    * @see \`{@link https://api.jquery.com/unwrap/ }\`
    * @since 1.4
    * @since 3.0
    */
  def unwrap(): this.type = js.native
  def unwrap(selector: String): this.type = js.native
  /**
    * Get the current value of the first element in the set of matched elements.
    *
    * @see \`{@link https://api.jquery.com/val/ }\`
    * @since 1.0
    */
  def `val`(): js.UndefOr[String | Double | js.Array[String]] = js.native
  /**
    * Set the value of each element in the set of matched elements.
    *
    * @param value A string of text, a number, or an array of strings corresponding to the value of each matched
    *              element to set as selected/checked.
    *              A function returning the value to set. this is the current element. Receives the index position of
    *              the element in the set and the old value as arguments.
    * @see \`{@link https://api.jquery.com/val/ }\`
    * @since 1.0
    * @since 1.4
    */
  def `val`(value: String): this.type = js.native
  def `val`(value: js.Array[String]): this.type = js.native
  def `val`(value: js.ThisFunction2[/* this */ TElement, /* index */ Double, /* value */ String, String]): this.type = js.native
  def `val`(value: Double): this.type = js.native
  /**
    * Get the current computed width for the first element in the set of matched elements.
    *
    * @see \`{@link https://api.jquery.com/width/ }\`
    * @since 1.0
    */
  def width(): js.UndefOr[Double] = js.native
  /**
    * Set the CSS width of each element in the set of matched elements.
    *
    * @param value An integer representing the number of pixels, or an integer along with an optional unit of measure
    *              appended (as a string).
    *              A function returning the width to set. Receives the index position of the element in the set and the
    *              old width as arguments. Within the function, this refers to the current element in the set.
    * @see \`{@link https://api.jquery.com/width/ }\`
    * @since 1.0
    * @since 1.4.1
    */
  def width(value: String): this.type = js.native
  def width(
    value: js.ThisFunction2[/* this */ TElement, /* index */ Double, /* value */ Double, String | Double]
  ): this.type = js.native
  def width(value: Double): this.type = js.native
  /**
    * Wrap an HTML structure around each element in the set of matched elements.
    *
    * @param wrappingElement A selector, element, HTML string, or jQuery object specifying the structure to wrap around the
    *                        matched elements. When you pass a jQuery collection containing more than one element, or a selector
    *                        matching more than one element, the first element will be used.
    *                        A callback function returning the HTML content or jQuery object to wrap around the matched elements.
    *                        Receives the index position of the element in the set as an argument. Within the function, this
    *                        refers to the current element in the set.
    * @see \`{@link https://api.jquery.com/wrap/ }\`
    * @since 1.0
    * @since 1.4
    */
  def wrap(wrappingElement: Selector | htmlString): this.type = js.native
  def wrap(
    wrappingElement: js.ThisFunction1[/* this */ TElement, /* index */ Double, String | JQuery[HTMLElement]]
  ): this.type = js.native
  def wrap(wrappingElement: JQuery[HTMLElement]): this.type = js.native
  def wrap(wrappingElement: Element): this.type = js.native
  /**
    * Wrap an HTML structure around all elements in the set of matched elements.
    *
    * @param wrappingElement A selector, element, HTML string, or jQuery object specifying the structure to wrap around the matched elements.
    *                        A callback function returning the HTML content or jQuery object to wrap around all the matched
    *                        elements. Within the function, this refers to the first element in the set. Prior to jQuery 3.0, the
    *                        callback was incorrectly called for every element in the set and received the index position of the
    *                        element in the set as an argument.
    * @see \`{@link https://api.jquery.com/wrapAll/ }\`
    * @since 1.2
    * @since 1.4
    */
  def wrapAll(wrappingElement: Selector | htmlString): this.type = js.native
  def wrapAll(wrappingElement: js.ThisFunction0[/* this */ TElement, String | JQuery[HTMLElement]]): this.type = js.native
  def wrapAll(wrappingElement: JQuery[HTMLElement]): this.type = js.native
  def wrapAll(wrappingElement: Element): this.type = js.native
  /**
    * Wrap an HTML structure around the content of each element in the set of matched elements.
    *
    * @param wrappingElement An HTML snippet, selector expression, jQuery object, or DOM element specifying the structure to wrap
    *                        around the content of the matched elements.
    *                        A callback function which generates a structure to wrap around the content of the matched elements.
    *                        Receives the index position of the element in the set as an argument. Within the function, this
    *                        refers to the current element in the set.
    * @see \`{@link https://api.jquery.com/wrapInner/ }\`
    * @since 1.2
    * @since 1.4
    */
  def wrapInner(wrappingElement: Selector | htmlString): this.type = js.native
  def wrapInner(
    wrappingElement: js.ThisFunction1[/* this */ TElement, /* index */ Double, String | JQuery[HTMLElement] | Element]
  ): this.type = js.native
  def wrapInner(wrappingElement: JQuery[HTMLElement]): this.type = js.native
  def wrapInner(wrappingElement: Element): this.type = js.native
}

