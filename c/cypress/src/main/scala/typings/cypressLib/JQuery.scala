package typings
package cypressLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery[TElement]
  extends Iterable[TElement]
     with /* n */ org.scalablytyped.runtime.NumberDictionary[TElement] {
  /**
    * A string containing the jQuery version number.
    *
    * @see \`{@link https://api.jquery.com/jquery/ }\`
    * @since 1.0
    */
  var jquery: java.lang.String = js.native
  /**
    * The number of elements in the jQuery object.
    *
    * @see \`{@link https://api.jquery.com/length/ }\`
    * @since 1.0
    */
  var length: scala.Double = js.native
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
  def add(
    selector: cypressLib.JQueryNs.Selector | cypressLib.JQueryNs.TypeOrArray[stdLib.Element] | cypressLib.JQueryNs.htmlString
  ): this.type = js.native
  def add(selector: JQuery[stdLib.HTMLElement]): this.type = js.native
  /**
    * Create a new jQuery object with elements added to the set of matched elements.
    *
    * @param selector A string representing a selector expression to find additional elements to add to the set of matched elements.
    * @param context The point in the document at which the selector should begin matching; similar to the context
    *                argument of the $(selector, context) method.
    * @see \`{@link https://api.jquery.com/add/ }\`
    * @since 1.4
    */
  def add(selector: cypressLib.JQueryNs.Selector, context: stdLib.Element): this.type = js.native
  /**
    * Add the previous set of elements on the stack to the current set, optionally filtered by a selector.
    *
    * @param selector A string containing a selector expression to match the current set of elements against.
    * @see \`{@link https://api.jquery.com/addBack/ }\`
    * @since 1.8
    */
  def addBack(): this.type = js.native
  def addBack(selector: cypressLib.JQueryNs.Selector): this.type = js.native
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
  def addClass(className: cypressLib.JQueryNs.TypeOrArray[java.lang.String]): this.type = js.native
  def addClass(
    className: js.ThisFunction2[
      /* this */ TElement, 
      /* index */ scala.Double, 
      /* currentClassName */ java.lang.String, 
      java.lang.String
    ]
  ): this.type = js.native
  /**
    * Insert content, specified by the parameter, after each element in the set of matched elements.
    *
    * @param contents One or more additional DOM elements, text nodes, arrays of elements and text nodes, HTML strings, or
    *                 jQuery objects to insert after each element in the set of matched elements.
    * @see \`{@link https://api.jquery.com/after/ }\`
    * @since 1.0
    */
  def after(
    contents: (cypressLib.JQueryNs.htmlString | (cypressLib.JQueryNs.TypeOrArray[cypressLib.JQueryNs.Node | JQuery[cypressLib.JQueryNs.Node]]))*
  ): this.type = js.native
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
      /* index */ scala.Double, 
      /* html */ java.lang.String, 
      cypressLib.JQueryNs.htmlString | (cypressLib.JQueryNs.TypeOrArray[cypressLib.JQueryNs.Node | JQuery[cypressLib.JQueryNs.Node]])
    ]
  ): this.type = js.native
  /**
    * Register a handler to be called when Ajax requests complete. This is an AjaxEvent.
    *
    * @param handler The function to be invoked.
    * @see \`{@link https://api.jquery.com/ajaxComplete/ }\`
    * @since 1.0
    */
  def ajaxComplete(
    handler: js.ThisFunction3[
      /* this */ stdLib.Document, 
      /* event */ cypressLib.JQueryNs.Event[stdLib.Document, scala.Null], 
      /* jqXHR */ cypressLib.JQueryNs.jqXHR[_], 
      /* ajaxOptions */ cypressLib.JQueryNs.AjaxSettings[_], 
      scala.Unit | cypressLib.cypressLibNumbers.`false`
    ]
  ): this.type = js.native
  /**
    * Register a handler to be called when Ajax requests complete with an error. This is an Ajax Event.
    *
    * @param handler The function to be invoked.
    * @see \`{@link https://api.jquery.com/ajaxError/ }\`
    * @since 1.0
    */
  def ajaxError(
    handler: js.ThisFunction4[
      /* this */ stdLib.Document, 
      /* event */ cypressLib.JQueryNs.Event[stdLib.Document, scala.Null], 
      /* jqXHR */ cypressLib.JQueryNs.jqXHR[_], 
      /* ajaxSettings */ cypressLib.JQueryNs.AjaxSettings[_], 
      /* thrownError */ java.lang.String, 
      scala.Unit | cypressLib.cypressLibNumbers.`false`
    ]
  ): this.type = js.native
  /**
    * Attach a function to be executed before an Ajax request is sent. This is an Ajax Event.
    *
    * @param handler The function to be invoked.
    * @see \`{@link https://api.jquery.com/ajaxSend/ }\`
    * @since 1.0
    */
  def ajaxSend(
    handler: js.ThisFunction3[
      /* this */ stdLib.Document, 
      /* event */ cypressLib.JQueryNs.Event[stdLib.Document, scala.Null], 
      /* jqXHR */ cypressLib.JQueryNs.jqXHR[_], 
      /* ajaxOptions */ cypressLib.JQueryNs.AjaxSettings[_], 
      scala.Unit | cypressLib.cypressLibNumbers.`false`
    ]
  ): this.type = js.native
  /**
    * Register a handler to be called when the first Ajax request begins. This is an Ajax Event.
    *
    * @param handler The function to be invoked.
    * @see \`{@link https://api.jquery.com/ajaxStart/ }\`
    * @since 1.0
    */
  def ajaxStart(
    handler: js.ThisFunction0[/* this */ stdLib.Document, scala.Unit | cypressLib.cypressLibNumbers.`false`]
  ): this.type = js.native
  /**
    * Register a handler to be called when all Ajax requests have completed. This is an Ajax Event.
    *
    * @param handler The function to be invoked.
    * @see \`{@link https://api.jquery.com/ajaxStop/ }\`
    * @since 1.0
    */
  def ajaxStop(
    handler: js.ThisFunction0[/* this */ stdLib.Document, scala.Unit | cypressLib.cypressLibNumbers.`false`]
  ): this.type = js.native
  /**
    * Attach a function to be executed whenever an Ajax request completes successfully. This is an Ajax Event.
    *
    * @param handler The function to be invoked.
    * @see \`{@link https://api.jquery.com/ajaxSuccess/ }\`
    * @since 1.0
    */
  def ajaxSuccess(
    handler: js.ThisFunction4[
      /* this */ stdLib.Document, 
      /* event */ cypressLib.JQueryNs.Event[stdLib.Document, scala.Null], 
      /* jqXHR */ cypressLib.JQueryNs.jqXHR[_], 
      /* ajaxOptions */ cypressLib.JQueryNs.AjaxSettings[_], 
      /* data */ cypressLib.JQueryNs.PlainObject[_], 
      scala.Unit | cypressLib.cypressLibNumbers.`false`
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
  def animate(properties: cypressLib.JQueryNs.PlainObject[_]): this.type = js.native
  def animate(
    properties: cypressLib.JQueryNs.PlainObject[_],
    complete: js.ThisFunction0[/* this */ TElement, scala.Unit]
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
  def animate(properties: cypressLib.JQueryNs.PlainObject[_], duration_easing: cypressLib.JQueryNs.Duration): this.type = js.native
  def animate(
    properties: cypressLib.JQueryNs.PlainObject[_],
    duration_easing: cypressLib.JQueryNs.Duration,
    complete: js.ThisFunction0[/* this */ TElement, scala.Unit]
  ): this.type = js.native
  def animate(properties: cypressLib.JQueryNs.PlainObject[_], duration_easing: java.lang.String): this.type = js.native
  def animate(
    properties: cypressLib.JQueryNs.PlainObject[_],
    duration_easing: java.lang.String,
    complete: js.ThisFunction0[/* this */ TElement, scala.Unit]
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
  def animate(
    properties: cypressLib.JQueryNs.PlainObject[_],
    duration: cypressLib.JQueryNs.Duration,
    easing: java.lang.String
  ): this.type = js.native
  def animate(
    properties: cypressLib.JQueryNs.PlainObject[_],
    duration: cypressLib.JQueryNs.Duration,
    easing: java.lang.String,
    complete: js.ThisFunction0[/* this */ TElement, scala.Unit]
  ): this.type = js.native
  /**
    * Perform a custom animation of a set of CSS properties.
    *
    * @param properties An object of CSS properties and values that the animation will move toward.
    * @param options A map of additional options to pass to the method.
    * @see \`{@link https://api.jquery.com/animate/ }\`
    * @since 1.0
    */
  def animate(
    properties: cypressLib.JQueryNs.PlainObject[_],
    options: cypressLib.JQueryNs.EffectsOptions[TElement]
  ): this.type = js.native
  /**
    * Insert content, specified by the parameter, to the end of each element in the set of matched elements.
    *
    * @param contents One or more additional DOM elements, text nodes, arrays of elements and text nodes, HTML strings, or
    *                 jQuery objects to insert at the end of each element in the set of matched elements.
    * @see \`{@link https://api.jquery.com/append/ }\`
    * @since 1.0
    */
  def append(
    contents: (cypressLib.JQueryNs.htmlString | (cypressLib.JQueryNs.TypeOrArray[cypressLib.JQueryNs.Node | JQuery[cypressLib.JQueryNs.Node]]))*
  ): this.type = js.native
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
      /* index */ scala.Double, 
      /* html */ java.lang.String, 
      cypressLib.JQueryNs.htmlString | (cypressLib.JQueryNs.TypeOrArray[cypressLib.JQueryNs.Node | JQuery[cypressLib.JQueryNs.Node]])
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
  def appendTo(
    target: cypressLib.JQueryNs.Selector | cypressLib.JQueryNs.TypeOrArray[stdLib.Element] | cypressLib.JQueryNs.htmlString
  ): this.type = js.native
  def appendTo(target: JQuery[stdLib.HTMLElement]): this.type = js.native
  /**
    * Get the value of an attribute for the first element in the set of matched elements.
    *
    * @param attributeName The name of the attribute to get.
    * @see \`{@link https://api.jquery.com/attr/ }\`
    * @since 1.0
    */
  def attr(attributeName: java.lang.String): js.UndefOr[java.lang.String] = js.native
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
  def attr(attributeName: java.lang.String, value: java.lang.String): this.type = js.native
  def attr(
    attributeName: java.lang.String,
    value: js.ThisFunction2[
      /* this */ TElement, 
      /* index */ scala.Double, 
      /* attr */ java.lang.String, 
      js.UndefOr[java.lang.String | scala.Double | scala.Unit]
    ]
  ): this.type = js.native
  def attr(attributeName: java.lang.String, value: scala.Double): this.type = js.native
  /**
    * Set one or more attributes for the set of matched elements.
    *
    * @param attributes An object of attribute-value pairs to set.
    * @see \`{@link https://api.jquery.com/attr/ }\`
    * @since 1.0
    */
  def attr(attributes: cypressLib.JQueryNs.PlainObject[_]): this.type = js.native
  @JSName("attr")
  def `attr_<this>`(attributeName: java.lang.String): this.type = js.native
  /**
    * Insert content, specified by the parameter, before each element in the set of matched elements.
    *
    * @param contents One or more additional DOM elements, text nodes, arrays of elements and text nodes, HTML strings, or
    *                 jQuery objects to insert before each element in the set of matched elements.
    * @see \`{@link https://api.jquery.com/before/ }\`
    * @since 1.0
    */
  def before(
    contents: (cypressLib.JQueryNs.htmlString | (cypressLib.JQueryNs.TypeOrArray[cypressLib.JQueryNs.Node | JQuery[cypressLib.JQueryNs.Node]]))*
  ): this.type = js.native
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
      /* index */ scala.Double, 
      /* html */ java.lang.String, 
      cypressLib.JQueryNs.htmlString | (cypressLib.JQueryNs.TypeOrArray[cypressLib.JQueryNs.Node | JQuery[cypressLib.JQueryNs.Node]])
    ]
  ): this.type = js.native
  def bind(eventType: java.lang.String): this.type = js.native
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
    eventType: java.lang.String,
    handler: (cypressLib.JQueryNs.EventHandler[TElement, scala.Null]) | (cypressLib.JQueryNs.EventHandlerBase[_, cypressLib.JQueryNs.Event[TElement, scala.Null]])
  ): this.type = js.native
  def bind(eventType: java.lang.String, handler: cypressLib.cypressLibNumbers.`false`): this.type = js.native
  /**
    * Attach a handler to an event for the elements.
    *
    * @param events An object containing one or more DOM event types and functions to execute for them.
    * @see \`{@link https://api.jquery.com/bind/ }\`
    * @since 1.4
    *
    * @deprecated Deprecated since 3.0. Use \`{@link JQuery.on }\`.
    */
  def bind(
    events: cypressLib.JQueryNs.PlainObject[
      (cypressLib.JQueryNs.EventHandler[TElement, scala.Null]) | (cypressLib.JQueryNs.EventHandlerBase[_, cypressLib.JQueryNs.Event[TElement, scala.Null]]) | cypressLib.cypressLibNumbers.`false`
    ]
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
    eventType: java.lang.String,
    eventData: TData,
    handler: (cypressLib.JQueryNs.EventHandler[TElement, TData]) | (cypressLib.JQueryNs.EventHandlerBase[_, cypressLib.JQueryNs.Event[TElement, TData]])
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
  def blur(
    handler: (cypressLib.JQueryNs.EventHandler[TElement, scala.Null]) | (cypressLib.JQueryNs.EventHandlerBase[_, cypressLib.JQueryNs.Event[TElement, scala.Null]])
  ): this.type = js.native
  def blur(handler: cypressLib.cypressLibNumbers.`false`): this.type = js.native
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
    handler: (cypressLib.JQueryNs.EventHandler[TElement, TData]) | (cypressLib.JQueryNs.EventHandlerBase[_, cypressLib.JQueryNs.Event[TElement, TData]])
  ): this.type = js.native
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
  def change(
    handler: (cypressLib.JQueryNs.EventHandler[TElement, scala.Null]) | (cypressLib.JQueryNs.EventHandlerBase[_, cypressLib.JQueryNs.Event[TElement, scala.Null]])
  ): this.type = js.native
  def change(handler: cypressLib.cypressLibNumbers.`false`): this.type = js.native
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
    handler: (cypressLib.JQueryNs.EventHandler[TElement, TData]) | (cypressLib.JQueryNs.EventHandlerBase[_, cypressLib.JQueryNs.Event[TElement, TData]])
  ): this.type = js.native
  /**
    * Get the children of each element in the set of matched elements, optionally filtered by a selector.
    *
    * @param selector A string containing a selector expression to match elements against.
    * @see \`{@link https://api.jquery.com/children/ }\`
    * @since 1.0
    */
  def children(): this.type = js.native
  def children(selector: cypressLib.JQueryNs.Selector): this.type = js.native
  /**
    * Remove from the queue all items that have not yet been run.
    *
    * @param queueName A string containing the name of the queue. Defaults to fx, the standard effects queue.
    * @see \`{@link https://api.jquery.com/clearQueue/ }\`
    * @since 1.4
    */
  def clearQueue(): this.type = js.native
  def clearQueue(queueName: java.lang.String): this.type = js.native
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
  def click(
    handler: (cypressLib.JQueryNs.EventHandler[TElement, scala.Null]) | (cypressLib.JQueryNs.EventHandlerBase[_, cypressLib.JQueryNs.Event[TElement, scala.Null]])
  ): this.type = js.native
  def click(handler: cypressLib.cypressLibNumbers.`false`): this.type = js.native
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
    handler: (cypressLib.JQueryNs.EventHandler[TElement, TData]) | (cypressLib.JQueryNs.EventHandlerBase[_, cypressLib.JQueryNs.Event[TElement, TData]])
  ): this.type = js.native
  def clone(withDataAndEvents: scala.Boolean): this.type = js.native
  def clone(withDataAndEvents: scala.Boolean, deepWithDataAndEvents: scala.Boolean): this.type = js.native
  def closest(selector: JQuery[stdLib.HTMLElement]): this.type = js.native
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
  def closest(selector: cypressLib.JQueryNs.Selector): this.type = js.native
  /**
    * For each element in the set, get the first element that matches the selector by testing the element
    * itself and traversing up through its ancestors in the DOM tree.
    *
    * @param selector A string containing a selector expression to match elements against.
    * @param context A DOM element within which a matching element may be found.
    * @see \`{@link https://api.jquery.com/closest/ }\`
    * @since 1.4
    */
  def closest(selector: cypressLib.JQueryNs.Selector, context: stdLib.Element): this.type = js.native
  def closest(selector: stdLib.Element): this.type = js.native
  /**
    * Get the children of each element in the set of matched elements, including text and comment nodes.
    *
    * @see \`{@link https://api.jquery.com/contents/ }\`
    * @since 1.2
    */
  def contents(): JQuery[TElement | stdLib.Text | stdLib.Comment] = js.native
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
  def contextmenu(
    handler: (cypressLib.JQueryNs.EventHandler[TElement, scala.Null]) | (cypressLib.JQueryNs.EventHandlerBase[_, cypressLib.JQueryNs.Event[TElement, scala.Null]])
  ): this.type = js.native
  def contextmenu(handler: cypressLib.cypressLibNumbers.`false`): this.type = js.native
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
    handler: (cypressLib.JQueryNs.EventHandler[TElement, TData]) | (cypressLib.JQueryNs.EventHandlerBase[_, cypressLib.JQueryNs.Event[TElement, TData]])
  ): this.type = js.native
  /**
    * Set one or more CSS properties for the set of matched elements.
    *
    * @param properties An object of property-value pairs to set.
    * @see \`{@link https://api.jquery.com/css/ }\`
    * @since 1.0
    */
  def css(
    properties: cypressLib.JQueryNs.PlainObject[
      java.lang.String | scala.Double | (js.ThisFunction2[
        /* this */ TElement, 
        /* index */ scala.Double, 
        /* value */ java.lang.String, 
        js.UndefOr[java.lang.String | scala.Double | scala.Unit]
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
  def css(propertyName: java.lang.String): java.lang.String = js.native
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
  def css(propertyName: java.lang.String, value: java.lang.String): this.type = js.native
  def css(
    propertyName: java.lang.String,
    value: js.ThisFunction2[
      /* this */ TElement, 
      /* index */ scala.Double, 
      /* value */ java.lang.String, 
      js.UndefOr[java.lang.String | scala.Double | scala.Unit]
    ]
  ): this.type = js.native
  def css(propertyName: java.lang.String, value: scala.Double): this.type = js.native
  /**
    * Get the computed style properties for the first element in the set of matched elements.
    *
    * @param propertyNames An array of one or more CSS properties.
    * @see \`{@link https://api.jquery.com/css/ }\`
    * @since 1.9
    */
  def css(propertyNames: js.Array[java.lang.String]): cypressLib.JQueryNs.PlainObject[java.lang.String] = js.native
  /**
    * Return the value at the named data store for the first element in the jQuery collection, as set by
    * data(name, value) or by an HTML5 data-* attribute.
    *
    * @see \`{@link https://api.jquery.com/data/ }\`
    * @since 1.4
    */
  def data(): cypressLib.JQueryNs.PlainObject[_] = js.native
  /**
    * Return the value at the named data store for the first element in the jQuery collection, as set by
    * data(name, value) or by an HTML5 data-* attribute.
    *
    * @param key Name of the data stored.
    * @see \`{@link https://api.jquery.com/data/ }\`
    * @since 1.2.3
    */
  def data(key: java.lang.String): js.Any = js.native
   // tslint:disable-line:unified-signatures
  /**
    * Store arbitrary data associated with the matched elements.
    *
    * @param key A string naming the piece of data to set.
    * @param value The new data value; this can be any Javascript type except undefined.
    * @see \`{@link https://api.jquery.com/data/ }\`
    * @since 1.2.3
    */
  def data(key: java.lang.String, value: js.Any): this.type = js.native
  /**
    * Store arbitrary data associated with the matched elements.
    *
    * @param obj An object of key-value pairs of data to update.
    * @see \`{@link https://api.jquery.com/data/ }\`
    * @since 1.4.3
    */
  def data(obj: cypressLib.JQueryNs.PlainObject[_]): this.type = js.native
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
  def dblclick(
    handler: (cypressLib.JQueryNs.EventHandler[TElement, scala.Null]) | (cypressLib.JQueryNs.EventHandlerBase[_, cypressLib.JQueryNs.Event[TElement, scala.Null]])
  ): this.type = js.native
  def dblclick(handler: cypressLib.cypressLibNumbers.`false`): this.type = js.native
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
    handler: (cypressLib.JQueryNs.EventHandler[TElement, TData]) | (cypressLib.JQueryNs.EventHandlerBase[_, cypressLib.JQueryNs.Event[TElement, TData]])
  ): this.type = js.native
  /**
    * Set a timer to delay execution of subsequent items in the queue.
    *
    * @param duration An integer indicating the number of milliseconds to delay execution of the next item in the queue.
    * @param queueName A string containing the name of the queue. Defaults to fx, the standard effects queue.
    * @see \`{@link https://api.jquery.com/delay/ }\`
    * @since 1.4
    */
  def delay(duration: cypressLib.JQueryNs.Duration): this.type = js.native
  def delay(duration: cypressLib.JQueryNs.Duration, queueName: java.lang.String): this.type = js.native
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
    selector: cypressLib.JQueryNs.Selector,
    eventType: java.lang.String,
    handler: (cypressLib.JQueryNs.EventHandler[TElement, scala.Null]) | (cypressLib.JQueryNs.EventHandlerBase[_, cypressLib.JQueryNs.Event[TElement, scala.Null]])
  ): this.type = js.native
  def delegate(
    selector: cypressLib.JQueryNs.Selector,
    eventType: java.lang.String,
    handler: cypressLib.cypressLibNumbers.`false`
  ): this.type = js.native
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
  def delegate(
    selector: cypressLib.JQueryNs.Selector,
    events: cypressLib.JQueryNs.PlainObject[
      (cypressLib.JQueryNs.EventHandler[TElement, scala.Null]) | (cypressLib.JQueryNs.EventHandlerBase[_, cypressLib.JQueryNs.Event[TElement, scala.Null]]) | cypressLib.cypressLibNumbers.`false`
    ]
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
    selector: cypressLib.JQueryNs.Selector,
    eventType: java.lang.String,
    eventData: TData,
    handler: (cypressLib.JQueryNs.EventHandler[TElement, TData]) | (cypressLib.JQueryNs.EventHandlerBase[_, cypressLib.JQueryNs.Event[TElement, TData]])
  ): this.type = js.native
  /**
    * Execute the next function on the queue for the matched elements.
    *
    * @param queueName A string containing the name of the queue. Defaults to fx, the standard effects queue.
    * @see \`{@link https://api.jquery.com/dequeue/ }\`
    * @since 1.2
    */
  def dequeue(): this.type = js.native
  def dequeue(queueName: java.lang.String): this.type = js.native
  /**
    * Remove the set of matched elements from the DOM.
    *
    * @param selector A selector expression that filters the set of matched elements to be removed.
    * @see \`{@link https://api.jquery.com/detach/ }\`
    * @since 1.4
    */
  def detach(): this.type = js.native
  def detach(selector: cypressLib.JQueryNs.Selector): this.type = js.native
  /**
    * Iterate over a jQuery object, executing a function for each matched element.
    *
    * @param fn A function to execute for each matched element.
    * @see \`{@link https://api.jquery.com/each/ }\`
    * @since 1.0
    */
  def each(
    fn: js.ThisFunction2[
      /* this */ TElement, 
      /* index */ scala.Double, 
      /* element */ TElement, 
      scala.Unit | cypressLib.cypressLibNumbers.`false`
    ]
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
  def eq(index: scala.Double): this.type = js.native
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
  def fadeIn(duration_easing_complete_options: cypressLib.JQueryNs.Duration): this.type = js.native
  def fadeIn(duration_easing_complete_options: cypressLib.JQueryNs.EffectsOptions[TElement]): this.type = js.native
  def fadeIn(duration_easing_complete_options: java.lang.String): this.type = js.native
  def fadeIn(duration_easing_complete_options: js.ThisFunction0[/* this */ TElement, scala.Unit]): this.type = js.native
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
  def fadeIn(
    duration_easing: cypressLib.JQueryNs.Duration,
    complete: js.ThisFunction0[/* this */ TElement, scala.Unit]
  ): this.type = js.native
  def fadeIn(duration_easing: java.lang.String, complete: js.ThisFunction0[/* this */ TElement, scala.Unit]): this.type = js.native
  /**
    * Display the matched elements by fading them to opaque.
    *
    * @param duration A string or number determining how long the animation will run.
    * @param easing A string indicating which easing function to use for the transition.
    * @param complete A function to call once the animation is complete, called once per matched element.
    * @see \`{@link https://api.jquery.com/fadeIn/ }\`
    * @since 1.4.3
    */
  def fadeIn(duration: cypressLib.JQueryNs.Duration, easing: java.lang.String): this.type = js.native
  def fadeIn(
    duration: cypressLib.JQueryNs.Duration,
    easing: java.lang.String,
    complete: js.ThisFunction0[/* this */ TElement, scala.Unit]
  ): this.type = js.native
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
  def fadeOut(duration_easing_complete_options: cypressLib.JQueryNs.Duration): this.type = js.native
  def fadeOut(duration_easing_complete_options: cypressLib.JQueryNs.EffectsOptions[TElement]): this.type = js.native
  def fadeOut(duration_easing_complete_options: java.lang.String): this.type = js.native
  def fadeOut(duration_easing_complete_options: js.ThisFunction0[/* this */ TElement, scala.Unit]): this.type = js.native
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
  def fadeOut(
    duration_easing: cypressLib.JQueryNs.Duration,
    complete: js.ThisFunction0[/* this */ TElement, scala.Unit]
  ): this.type = js.native
  def fadeOut(duration_easing: java.lang.String, complete: js.ThisFunction0[/* this */ TElement, scala.Unit]): this.type = js.native
  /**
    * Hide the matched elements by fading them to transparent.
    *
    * @param duration A string or number determining how long the animation will run.
    * @param easing A string indicating which easing function to use for the transition.
    * @param complete A function to call once the animation is complete, called once per matched element.
    * @see \`{@link https://api.jquery.com/fadeOut/ }\`
    * @since 1.4.3
    */
  def fadeOut(duration: cypressLib.JQueryNs.Duration, easing: java.lang.String): this.type = js.native
  def fadeOut(
    duration: cypressLib.JQueryNs.Duration,
    easing: java.lang.String,
    complete: js.ThisFunction0[/* this */ TElement, scala.Unit]
  ): this.type = js.native
  /**
    * Adjust the opacity of the matched elements.
    *
    * @param duration A string or number determining how long the animation will run.
    * @param opacity A number between 0 and 1 denoting the target opacity.
    * @param complete A function to call once the animation is complete, called once per matched element.
    * @see \`{@link https://api.jquery.com/fadeTo/ }\`
    * @since 1.0
    */
  def fadeTo(duration: cypressLib.JQueryNs.Duration, opacity: scala.Double): this.type = js.native
  def fadeTo(
    duration: cypressLib.JQueryNs.Duration,
    opacity: scala.Double,
    complete: js.ThisFunction0[/* this */ TElement, scala.Unit]
  ): this.type = js.native
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
  def fadeTo(duration: cypressLib.JQueryNs.Duration, opacity: scala.Double, easing: java.lang.String): this.type = js.native
  def fadeTo(
    duration: cypressLib.JQueryNs.Duration,
    opacity: scala.Double,
    easing: java.lang.String,
    complete: js.ThisFunction0[/* this */ TElement, scala.Unit]
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
  def fadeToggle(duration_easing_complete_options: cypressLib.JQueryNs.Duration): this.type = js.native
  def fadeToggle(duration_easing_complete_options: cypressLib.JQueryNs.EffectsOptions[TElement]): this.type = js.native
  def fadeToggle(duration_easing_complete_options: java.lang.String): this.type = js.native
  def fadeToggle(duration_easing_complete_options: js.ThisFunction0[/* this */ TElement, scala.Unit]): this.type = js.native
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
  def fadeToggle(
    duration_easing: cypressLib.JQueryNs.Duration,
    complete: js.ThisFunction0[/* this */ TElement, scala.Unit]
  ): this.type = js.native
  def fadeToggle(duration_easing: java.lang.String, complete: js.ThisFunction0[/* this */ TElement, scala.Unit]): this.type = js.native
  /**
    * Display or hide the matched elements by animating their opacity.
    *
    * @param duration A string or number determining how long the animation will run.
    * @param easing A string indicating which easing function to use for the transition.
    * @param complete A function to call once the animation is complete, called once per matched element.
    * @see \`{@link https://api.jquery.com/fadeToggle/ }\`
    * @since 1.4.4
    */
  def fadeToggle(duration: cypressLib.JQueryNs.Duration, easing: java.lang.String): this.type = js.native
  def fadeToggle(
    duration: cypressLib.JQueryNs.Duration,
    easing: java.lang.String,
    complete: js.ThisFunction0[/* this */ TElement, scala.Unit]
  ): this.type = js.native
  def filter(selector: JQuery[stdLib.HTMLElement]): this.type = js.native
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
  def filter(selector: cypressLib.JQueryNs.Selector): this.type = js.native
  def filter(selector: cypressLib.JQueryNs.TypeOrArray[stdLib.Element]): this.type = js.native
  def filter(
    selector: js.ThisFunction2[/* this */ TElement, /* index */ scala.Double, /* element */ TElement, scala.Boolean]
  ): this.type = js.native
  def find(selector: JQuery[stdLib.HTMLElement]): this.type = js.native
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
  def find(selector: cypressLib.JQueryNs.Selector): this.type = js.native
  def find(selector: stdLib.Element): this.type = js.native
  /**
    * Stop the currently-running animation, remove all queued animations, and complete all animations for
    * the matched elements.
    *
    * @param queue The name of the queue in which to stop animations.
    * @see \`{@link https://api.jquery.com/finish/ }\`
    * @since 1.9
    */
  def finish(): this.type = js.native
  def finish(queue: java.lang.String): this.type = js.native
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
  def focus(
    handler: (cypressLib.JQueryNs.EventHandler[TElement, scala.Null]) | (cypressLib.JQueryNs.EventHandlerBase[_, cypressLib.JQueryNs.Event[TElement, scala.Null]])
  ): this.type = js.native
  def focus(handler: cypressLib.cypressLibNumbers.`false`): this.type = js.native
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
    handler: (cypressLib.JQueryNs.EventHandler[TElement, TData]) | (cypressLib.JQueryNs.EventHandlerBase[_, cypressLib.JQueryNs.Event[TElement, TData]])
  ): this.type = js.native
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
  def focusin(
    handler: (cypressLib.JQueryNs.EventHandler[TElement, scala.Null]) | (cypressLib.JQueryNs.EventHandlerBase[_, cypressLib.JQueryNs.Event[TElement, scala.Null]])
  ): this.type = js.native
  def focusin(handler: cypressLib.cypressLibNumbers.`false`): this.type = js.native
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
    handler: (cypressLib.JQueryNs.EventHandler[TElement, TData]) | (cypressLib.JQueryNs.EventHandlerBase[_, cypressLib.JQueryNs.Event[TElement, TData]])
  ): this.type = js.native
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
  def focusout(
    handler: (cypressLib.JQueryNs.EventHandler[TElement, scala.Null]) | (cypressLib.JQueryNs.EventHandlerBase[_, cypressLib.JQueryNs.Event[TElement, scala.Null]])
  ): this.type = js.native
  def focusout(handler: cypressLib.cypressLibNumbers.`false`): this.type = js.native
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
    handler: (cypressLib.JQueryNs.EventHandler[TElement, TData]) | (cypressLib.JQueryNs.EventHandlerBase[_, cypressLib.JQueryNs.Event[TElement, TData]])
  ): this.type = js.native
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
  def get(index: scala.Double): TElement = js.native
  /**
    * Reduce the set of matched elements to those that have a descendant that matches the selector or DOM element.
    *
    * @param selector A string containing a selector expression to match elements against.
    *                 A DOM element to match elements against.
    * @see \`{@link https://api.jquery.com/has/ }\`
    * @since 1.4
    */
  def has(selector: java.lang.String): this.type = js.native
  def has(selector: stdLib.Element): this.type = js.native
  /**
    * Determine whether any of the matched elements are assigned the given class.
    *
    * @param className The class name to search for.
    * @see \`{@link https://api.jquery.com/hasClass/ }\`
    * @since 1.2
    */
  def hasClass(className: java.lang.String): scala.Boolean = js.native
  /**
    * Get the current computed height for the first element in the set of matched elements.
    *
    * @see \`{@link https://api.jquery.com/height/ }\`
    * @since 1.0
    */
  def height(): js.UndefOr[scala.Double] = js.native
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
  def height(value: java.lang.String): this.type = js.native
  def height(
    value: js.ThisFunction2[
      /* this */ TElement, 
      /* index */ scala.Double, 
      /* height */ scala.Double, 
      java.lang.String | scala.Double
    ]
  ): this.type = js.native
  def height(value: scala.Double): this.type = js.native
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
  def hide(duration_complete_options: cypressLib.JQueryNs.Duration): this.type = js.native
  def hide(duration_complete_options: cypressLib.JQueryNs.EffectsOptions[TElement]): this.type = js.native
  def hide(duration_complete_options: js.ThisFunction0[/* this */ TElement, scala.Unit]): this.type = js.native
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
  def hide(duration: cypressLib.JQueryNs.Duration, easing_complete: java.lang.String): this.type = js.native
  def hide(
    duration: cypressLib.JQueryNs.Duration,
    easing_complete: js.ThisFunction0[/* this */ TElement, scala.Unit]
  ): this.type = js.native
  /**
    * Hide the matched elements.
    *
    * @param duration A string or number determining how long the animation will run.
    * @param easing A string indicating which easing function to use for the transition.
    * @param complete A function to call once the animation is complete, called once per matched element.
    * @see \`{@link https://api.jquery.com/hide/ }\`
    * @since 1.4.3
    */
  def hide(
    duration: cypressLib.JQueryNs.Duration,
    easing: java.lang.String,
    complete: js.ThisFunction0[/* this */ TElement, scala.Unit]
  ): this.type = js.native
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
  def hover[T](
    handlerInOut: (cypressLib.JQueryNs.EventHandler[TElement, scala.Null]) | (cypressLib.JQueryNs.EventHandlerBase[_, cypressLib.JQueryNs.Event[TElement, scala.Null]])
  ): this.type = js.native
  def hover[T](
    handlerInOut: (cypressLib.JQueryNs.EventHandler[TElement, scala.Null]) | (cypressLib.JQueryNs.EventHandlerBase[_, cypressLib.JQueryNs.Event[TElement, scala.Null]]),
    handlerOut: (cypressLib.JQueryNs.EventHandler[TElement, scala.Null]) | (cypressLib.JQueryNs.EventHandlerBase[_, cypressLib.JQueryNs.Event[TElement, scala.Null]])
  ): this.type = js.native
  def hover[T](
    handlerInOut: (cypressLib.JQueryNs.EventHandler[TElement, scala.Null]) | (cypressLib.JQueryNs.EventHandlerBase[_, cypressLib.JQueryNs.Event[TElement, scala.Null]]),
    handlerOut: cypressLib.cypressLibNumbers.`false`
  ): this.type = js.native
  def hover[T](handlerInOut: cypressLib.cypressLibNumbers.`false`): this.type = js.native
  def hover[T](
    handlerInOut: cypressLib.cypressLibNumbers.`false`,
    handlerOut: (cypressLib.JQueryNs.EventHandler[TElement, scala.Null]) | (cypressLib.JQueryNs.EventHandlerBase[_, cypressLib.JQueryNs.Event[TElement, scala.Null]])
  ): this.type = js.native
  def hover[T](
    handlerInOut: cypressLib.cypressLibNumbers.`false`,
    handlerOut: cypressLib.cypressLibNumbers.`false`
  ): this.type = js.native
  /**
    * Get the HTML contents of the first element in the set of matched elements.
    *
    * @see \`{@link https://api.jquery.com/html/ }\`
    * @since 1.0
    */
  def html(): java.lang.String = js.native
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
  def html(htmlString: cypressLib.JQueryNs.htmlString): this.type = js.native
  def html(
    htmlString: js.ThisFunction2[
      /* this */ TElement, 
      /* index */ scala.Double, 
      /* oldhtml */ cypressLib.JQueryNs.htmlString, 
      cypressLib.JQueryNs.htmlString
    ]
  ): this.type = js.native
  /**
    * Search for a given element from among the matched elements.
    *
    * @param element The DOM element or first element within the jQuery object to look for.
    *                A selector representing a jQuery collection in which to look for an element.
    * @see \`{@link https://api.jquery.com/index/ }\`
    * @since 1.0
    * @since 1.4
    */
  def index(): scala.Double = js.native
  def index(element: JQuery[stdLib.HTMLElement]): scala.Double = js.native
  def index(element: cypressLib.JQueryNs.Selector): scala.Double = js.native
  def index(element: stdLib.Element): scala.Double = js.native
  /**
    * Get the current computed height for the first element in the set of matched elements, including
    * padding but not border.
    *
    * @see \`{@link https://api.jquery.com/innerHeight/ }\`
    * @since 1.2.6
    */
  def innerHeight(): js.UndefOr[scala.Double] = js.native
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
  def innerHeight(value: java.lang.String): this.type = js.native
  def innerHeight(
    value: js.ThisFunction2[
      /* this */ TElement, 
      /* index */ scala.Double, 
      /* height */ scala.Double, 
      java.lang.String | scala.Double
    ]
  ): this.type = js.native
  def innerHeight(value: scala.Double): this.type = js.native
  /**
    * Get the current computed inner width for the first element in the set of matched elements, including
    * padding but not border.
    *
    * @see \`{@link https://api.jquery.com/innerWidth/ }\`
    * @since 1.2.6
    */
  def innerWidth(): js.UndefOr[scala.Double] = js.native
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
  def innerWidth(value: java.lang.String): this.type = js.native
  def innerWidth(
    value: js.ThisFunction2[
      /* this */ TElement, 
      /* index */ scala.Double, 
      /* width */ scala.Double, 
      java.lang.String | scala.Double
    ]
  ): this.type = js.native
  def innerWidth(value: scala.Double): this.type = js.native
  /**
    * Insert every element in the set of matched elements after the target.
    *
    * @param target A selector, element, array of elements, HTML string, or jQuery object; the matched set of elements
    *               will be inserted after the element(s) specified by this parameter.
    * @see \`{@link https://api.jquery.com/insertAfter/ }\`
    * @since 1.0
    */
  def insertAfter(
    target: cypressLib.JQueryNs.Selector | cypressLib.JQueryNs.TypeOrArray[stdLib.Node] | cypressLib.JQueryNs.htmlString
  ): this.type = js.native
  def insertAfter(target: JQuery[stdLib.Node]): this.type = js.native
  /**
    * Insert every element in the set of matched elements before the target.
    *
    * @param target A selector, element, array of elements, HTML string, or jQuery object; the matched set of elements
    *               will be inserted before the element(s) specified by this parameter.
    * @see \`{@link https://api.jquery.com/insertBefore/ }\`
    * @since 1.0
    */
  def insertBefore(
    target: cypressLib.JQueryNs.Selector | cypressLib.JQueryNs.TypeOrArray[stdLib.Node] | cypressLib.JQueryNs.htmlString
  ): this.type = js.native
  def insertBefore(target: JQuery[stdLib.Node]): this.type = js.native
  def is(selector: JQuery[stdLib.HTMLElement]): scala.Boolean = js.native
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
  def is(selector: cypressLib.JQueryNs.Selector): scala.Boolean = js.native
  def is(selector: cypressLib.JQueryNs.TypeOrArray[stdLib.Element]): scala.Boolean = js.native
  def is(
    selector: js.ThisFunction2[/* this */ TElement, /* index */ scala.Double, /* element */ TElement, scala.Boolean]
  ): scala.Boolean = js.native
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
  def keydown(
    handler: (cypressLib.JQueryNs.EventHandler[TElement, scala.Null]) | (cypressLib.JQueryNs.EventHandlerBase[_, cypressLib.JQueryNs.Event[TElement, scala.Null]])
  ): this.type = js.native
  def keydown(handler: cypressLib.cypressLibNumbers.`false`): this.type = js.native
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
    handler: (cypressLib.JQueryNs.EventHandler[TElement, TData]) | (cypressLib.JQueryNs.EventHandlerBase[_, cypressLib.JQueryNs.Event[TElement, TData]])
  ): this.type = js.native
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
  def keypress(
    handler: (cypressLib.JQueryNs.EventHandler[TElement, scala.Null]) | (cypressLib.JQueryNs.EventHandlerBase[_, cypressLib.JQueryNs.Event[TElement, scala.Null]])
  ): this.type = js.native
  def keypress(handler: cypressLib.cypressLibNumbers.`false`): this.type = js.native
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
    handler: (cypressLib.JQueryNs.EventHandler[TElement, TData]) | (cypressLib.JQueryNs.EventHandlerBase[_, cypressLib.JQueryNs.Event[TElement, TData]])
  ): this.type = js.native
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
  def keyup(
    handler: (cypressLib.JQueryNs.EventHandler[TElement, scala.Null]) | (cypressLib.JQueryNs.EventHandlerBase[_, cypressLib.JQueryNs.Event[TElement, scala.Null]])
  ): this.type = js.native
  def keyup(handler: cypressLib.cypressLibNumbers.`false`): this.type = js.native
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
    handler: (cypressLib.JQueryNs.EventHandler[TElement, TData]) | (cypressLib.JQueryNs.EventHandlerBase[_, cypressLib.JQueryNs.Event[TElement, TData]])
  ): this.type = js.native
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
  def load(url: java.lang.String): this.type = js.native
  def load(url: java.lang.String, complete_data: cypressLib.JQueryNs.PlainObject[_]): this.type = js.native
  def load(url: java.lang.String, complete_data: java.lang.String): this.type = js.native
  def load(
    url: java.lang.String,
    complete_data: js.ThisFunction3[
      /* this */ TElement, 
      /* responseText */ java.lang.String, 
      /* textStatus */ cypressLib.JQueryNs.AjaxNs.TextStatus, 
      /* jqXHR */ cypressLib.JQueryNs.jqXHR[_], 
      scala.Unit
    ]
  ): this.type = js.native
  def load(
    url: java.lang.String,
    data: cypressLib.JQueryNs.PlainObject[_],
    complete: js.ThisFunction3[
      /* this */ TElement, 
      /* responseText */ java.lang.String, 
      /* textStatus */ cypressLib.JQueryNs.AjaxNs.TextStatus, 
      /* jqXHR */ cypressLib.JQueryNs.jqXHR[_], 
      scala.Unit
    ]
  ): this.type = js.native
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
    url: java.lang.String,
    data: java.lang.String,
    complete: js.ThisFunction3[
      /* this */ TElement, 
      /* responseText */ java.lang.String, 
      /* textStatus */ cypressLib.JQueryNs.AjaxNs.TextStatus, 
      /* jqXHR */ cypressLib.JQueryNs.jqXHR[_], 
      scala.Unit
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
      /* index */ scala.Double, 
      /* domElement */ TElement, 
      js.UndefOr[cypressLib.JQueryNs.TypeOrArray[TReturn] | scala.Null]
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
  def mousedown(
    handler: (cypressLib.JQueryNs.EventHandler[TElement, scala.Null]) | (cypressLib.JQueryNs.EventHandlerBase[_, cypressLib.JQueryNs.Event[TElement, scala.Null]])
  ): this.type = js.native
  def mousedown(handler: cypressLib.cypressLibNumbers.`false`): this.type = js.native
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
    handler: (cypressLib.JQueryNs.EventHandler[TElement, TData]) | (cypressLib.JQueryNs.EventHandlerBase[_, cypressLib.JQueryNs.Event[TElement, TData]])
  ): this.type = js.native
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
  def mouseenter(
    handler: (cypressLib.JQueryNs.EventHandler[TElement, scala.Null]) | (cypressLib.JQueryNs.EventHandlerBase[_, cypressLib.JQueryNs.Event[TElement, scala.Null]])
  ): this.type = js.native
  def mouseenter(handler: cypressLib.cypressLibNumbers.`false`): this.type = js.native
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
    handler: (cypressLib.JQueryNs.EventHandler[TElement, TData]) | (cypressLib.JQueryNs.EventHandlerBase[_, cypressLib.JQueryNs.Event[TElement, TData]])
  ): this.type = js.native
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
  def mouseleave(
    handler: (cypressLib.JQueryNs.EventHandler[TElement, scala.Null]) | (cypressLib.JQueryNs.EventHandlerBase[_, cypressLib.JQueryNs.Event[TElement, scala.Null]])
  ): this.type = js.native
  def mouseleave(handler: cypressLib.cypressLibNumbers.`false`): this.type = js.native
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
    handler: (cypressLib.JQueryNs.EventHandler[TElement, TData]) | (cypressLib.JQueryNs.EventHandlerBase[_, cypressLib.JQueryNs.Event[TElement, TData]])
  ): this.type = js.native
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
  def mousemove(
    handler: (cypressLib.JQueryNs.EventHandler[TElement, scala.Null]) | (cypressLib.JQueryNs.EventHandlerBase[_, cypressLib.JQueryNs.Event[TElement, scala.Null]])
  ): this.type = js.native
  def mousemove(handler: cypressLib.cypressLibNumbers.`false`): this.type = js.native
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
    handler: (cypressLib.JQueryNs.EventHandler[TElement, TData]) | (cypressLib.JQueryNs.EventHandlerBase[_, cypressLib.JQueryNs.Event[TElement, TData]])
  ): this.type = js.native
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
  def mouseout(
    handler: (cypressLib.JQueryNs.EventHandler[TElement, scala.Null]) | (cypressLib.JQueryNs.EventHandlerBase[_, cypressLib.JQueryNs.Event[TElement, scala.Null]])
  ): this.type = js.native
  def mouseout(handler: cypressLib.cypressLibNumbers.`false`): this.type = js.native
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
    handler: (cypressLib.JQueryNs.EventHandler[TElement, TData]) | (cypressLib.JQueryNs.EventHandlerBase[_, cypressLib.JQueryNs.Event[TElement, TData]])
  ): this.type = js.native
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
  def mouseover(
    handler: (cypressLib.JQueryNs.EventHandler[TElement, scala.Null]) | (cypressLib.JQueryNs.EventHandlerBase[_, cypressLib.JQueryNs.Event[TElement, scala.Null]])
  ): this.type = js.native
  def mouseover(handler: cypressLib.cypressLibNumbers.`false`): this.type = js.native
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
    handler: (cypressLib.JQueryNs.EventHandler[TElement, TData]) | (cypressLib.JQueryNs.EventHandlerBase[_, cypressLib.JQueryNs.Event[TElement, TData]])
  ): this.type = js.native
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
  def mouseup(
    handler: (cypressLib.JQueryNs.EventHandler[TElement, scala.Null]) | (cypressLib.JQueryNs.EventHandlerBase[_, cypressLib.JQueryNs.Event[TElement, scala.Null]])
  ): this.type = js.native
  def mouseup(handler: cypressLib.cypressLibNumbers.`false`): this.type = js.native
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
    handler: (cypressLib.JQueryNs.EventHandler[TElement, TData]) | (cypressLib.JQueryNs.EventHandlerBase[_, cypressLib.JQueryNs.Event[TElement, TData]])
  ): this.type = js.native
  /**
    * Get the immediately following sibling of each element in the set of matched elements. If a selector
    * is provided, it retrieves the next sibling only if it matches that selector.
    *
    * @param selector A string containing a selector expression to match elements against.
    * @see \`{@link https://api.jquery.com/next/ }\`
    * @since 1.0
    */
  def next(): this.type = js.native
  def next(selector: cypressLib.JQueryNs.Selector): this.type = js.native
  /**
    * Get all following siblings of each element in the set of matched elements, optionally filtered by a selector.
    *
    * @param selector A string containing a selector expression to match elements against.
    * @see \`{@link https://api.jquery.com/nextAll/ }\`
    * @since 1.2
    */
  def nextAll(): this.type = js.native
  def nextAll(selector: java.lang.String): this.type = js.native
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
  def nextUntil(selector: JQuery[stdLib.HTMLElement]): this.type = js.native
  def nextUntil(selector: cypressLib.JQueryNs.Selector): this.type = js.native
  def nextUntil(selector: cypressLib.JQueryNs.Selector, filter: cypressLib.JQueryNs.Selector): this.type = js.native
  def nextUntil(selector: JQuery[stdLib.HTMLElement], filter: cypressLib.JQueryNs.Selector): this.type = js.native
  def nextUntil(selector: stdLib.Element): this.type = js.native
  def nextUntil(selector: stdLib.Element, filter: cypressLib.JQueryNs.Selector): this.type = js.native
  def not(selector: JQuery[stdLib.HTMLElement]): this.type = js.native
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
  def not(selector: cypressLib.JQueryNs.Selector): this.type = js.native
  def not(selector: cypressLib.JQueryNs.TypeOrArray[stdLib.Element]): this.type = js.native
  def not(
    selector: js.ThisFunction2[/* this */ TElement, /* index */ scala.Double, /* element */ TElement, scala.Boolean]
  ): this.type = js.native
  /**
    * Remove an event handler.
    *
    * @param event A jQuery.Event object.
    * @see \`{@link https://api.jquery.com/off/ }\`
    * @since 1.7
    */
  def off(): this.type = js.native
  def off(event: cypressLib.JQueryNs.Event[TElement, scala.Null]): this.type = js.native
  /**
    * Remove an event handler.
    *
    * @param events An object where the string keys represent one or more space-separated event types and optional
    *               namespaces, and the values represent handler functions previously attached for the event(s).
    * @param selector A selector which should match the one originally passed to .on() when attaching event handlers.
    * @see \`{@link https://api.jquery.com/off/ }\`
    * @since 1.7
    */
  def off(
    events: cypressLib.JQueryNs.PlainObject[
      (cypressLib.JQueryNs.EventHandlerBase[_, cypressLib.JQueryNs.Event[TElement, _]]) | cypressLib.cypressLibNumbers.`false`
    ]
  ): this.type = js.native
  def off(
    events: cypressLib.JQueryNs.PlainObject[
      (cypressLib.JQueryNs.EventHandlerBase[_, cypressLib.JQueryNs.Event[TElement, _]]) | cypressLib.cypressLibNumbers.`false`
    ],
    selector: cypressLib.JQueryNs.Selector
  ): this.type = js.native
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
  def off(events: java.lang.String): this.type = js.native
  def off(
    events: java.lang.String,
    selector_handler: cypressLib.JQueryNs.EventHandlerBase[_, cypressLib.JQueryNs.Event[TElement, _]]
  ): this.type = js.native
  def off(events: java.lang.String, selector_handler: cypressLib.JQueryNs.Selector): this.type = js.native
  def off(events: java.lang.String, selector_handler: cypressLib.cypressLibNumbers.`false`): this.type = js.native
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
  def off(
    events: java.lang.String,
    selector: cypressLib.JQueryNs.Selector,
    handler: cypressLib.JQueryNs.EventHandlerBase[_, cypressLib.JQueryNs.Event[TElement, _]]
  ): this.type = js.native
  def off(
    events: java.lang.String,
    selector: cypressLib.JQueryNs.Selector,
    handler: cypressLib.cypressLibNumbers.`false`
  ): this.type = js.native
  /**
    * Get the current coordinates of the first element in the set of matched elements, relative to the document.
    *
    * @see \`{@link https://api.jquery.com/offset/ }\`
    * @since 1.2
    */
  def offset(): js.UndefOr[cypressLib.JQueryNs.Coordinates] = js.native
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
  def offset(coordinates: cypressLib.JQueryNs.CoordinatesPartial): this.type = js.native
  def offset(
    coordinates: js.ThisFunction2[
      /* this */ TElement, 
      /* index */ scala.Double, 
      /* coords */ cypressLib.JQueryNs.Coordinates, 
      cypressLib.JQueryNs.CoordinatesPartial
    ]
  ): this.type = js.native
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
    * @param events An object in which the string keys represent one or more space-separated event types and optional
    *               namespaces, and the values represent a handler function to be called for the event(s).
    * @see \`{@link https://api.jquery.com/on/ }\`
    * @since 1.7
    */
  def on(
    events: cypressLib.JQueryNs.PlainObject[
      (cypressLib.JQueryNs.EventHandler[TElement, scala.Null]) | (cypressLib.JQueryNs.EventHandlerBase[_, cypressLib.JQueryNs.Event[TElement, scala.Null]]) | cypressLib.cypressLibNumbers.`false`
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
  def on(
    events: cypressLib.JQueryNs.PlainObject[
      (cypressLib.JQueryNs.EventHandler[TElement, scala.Null]) | (cypressLib.JQueryNs.EventHandlerBase[_, cypressLib.JQueryNs.Event[TElement, scala.Null]]) | cypressLib.cypressLibNumbers.`false`
    ],
    selector: cypressLib.JQueryNs.Selector
  ): this.type = js.native
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
    events: java.lang.String,
     // tslint:disable-line:unified-signatures
  data: js.Any,
    handler: js.Function1[/* event */ JQueryEventObject, scala.Unit]
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
    events: java.lang.String,
    handler: (cypressLib.JQueryNs.EventHandler[TElement, scala.Null]) | (cypressLib.JQueryNs.EventHandlerBase[_, cypressLib.JQueryNs.Event[TElement, scala.Null]])
  ): this.type = js.native
  def on(events: java.lang.String, handler: cypressLib.cypressLibNumbers.`false`): this.type = js.native
  /**
    * Attach an event handler function for one or more events to the selected elements.
    *
    * @param events One or more space-separated event types and optional namespaces, such as "click" or "keydown.myPlugin".
    * @param handler A function to execute when the event is triggered.
    * @see \`{@link https://api.jquery.com/on/ }\`
    * @since 1.7
    */
  def on(events: java.lang.String, handler: js.Function1[/* event */ JQueryEventObject, scala.Unit]): this.type = js.native
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
    events: java.lang.String,
    selector: cypressLib.JQueryNs.Selector,
    data: js.Any,
    handler: js.Function1[/* event */ JQueryEventObject, scala.Unit]
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
    events: java.lang.String,
    selector: cypressLib.JQueryNs.Selector,
    handler: (cypressLib.JQueryNs.EventHandler[TElement, scala.Null]) | (cypressLib.JQueryNs.EventHandlerBase[_, cypressLib.JQueryNs.Event[TElement, scala.Null]])
  ): this.type = js.native
  def on(
    events: java.lang.String,
    selector: cypressLib.JQueryNs.Selector,
    handler: cypressLib.cypressLibNumbers.`false`
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
  def on(
    events: java.lang.String,
    selector: cypressLib.JQueryNs.Selector,
    handler: js.Function1[/* event */ JQueryEventObject, scala.Unit]
  ): this.type = js.native
  def on(
    events: java.lang.String,
    selector: scala.Null,
    data: js.Any,
    handler: js.Function1[/* event */ JQueryEventObject, scala.Unit]
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
  def on[TData](
    events: cypressLib.JQueryNs.PlainObject[
      (cypressLib.JQueryNs.EventHandler[TElement, TData]) | (cypressLib.JQueryNs.EventHandlerBase[_, cypressLib.JQueryNs.Event[TElement, TData]]) | cypressLib.cypressLibNumbers.`false`
    ],
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
  def on[TData](
    events: cypressLib.JQueryNs.PlainObject[
      (cypressLib.JQueryNs.EventHandler[TElement, TData]) | (cypressLib.JQueryNs.EventHandlerBase[_, cypressLib.JQueryNs.Event[TElement, TData]]) | cypressLib.cypressLibNumbers.`false`
    ],
    selector: cypressLib.JQueryNs.Selector,
    data: TData
  ): this.type = js.native
  def on[TData](
    events: cypressLib.JQueryNs.PlainObject[
      (cypressLib.JQueryNs.EventHandler[TElement, TData]) | (cypressLib.JQueryNs.EventHandlerBase[_, cypressLib.JQueryNs.Event[TElement, TData]]) | cypressLib.cypressLibNumbers.`false`
    ],
    selector: scala.Null,
    data: TData
  ): this.type = js.native
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
    events: java.lang.String,
    data: TData,
    handler: (cypressLib.JQueryNs.EventHandler[TElement, TData]) | (cypressLib.JQueryNs.EventHandlerBase[_, cypressLib.JQueryNs.Event[TElement, TData]])
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
    events: java.lang.String,
    selector: cypressLib.JQueryNs.Selector,
    data: TData,
    handler: (cypressLib.JQueryNs.EventHandler[TElement, TData]) | (cypressLib.JQueryNs.EventHandlerBase[_, cypressLib.JQueryNs.Event[TElement, TData]])
  ): this.type = js.native
  def on[TData](
    events: java.lang.String,
    selector: scala.Null,
    data: TData,
    handler: (cypressLib.JQueryNs.EventHandler[TElement, TData]) | (cypressLib.JQueryNs.EventHandlerBase[_, cypressLib.JQueryNs.Event[TElement, TData]])
  ): this.type = js.native
  /**
    * Attach a handler to an event for the elements. The handler is executed at most once per element per event type.
    *
    * @param events An object in which the string keys represent one or more space-separated event types and optional
    *               namespaces, and the values represent a handler function to be called for the event(s).
    * @see \`{@link https://api.jquery.com/one/ }\`
    * @since 1.7
    */
  def one(
    events: cypressLib.JQueryNs.PlainObject[
      (cypressLib.JQueryNs.EventHandler[TElement, scala.Null]) | (cypressLib.JQueryNs.EventHandlerBase[_, cypressLib.JQueryNs.Event[TElement, scala.Null]]) | cypressLib.cypressLibNumbers.`false`
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
  def one(
    events: cypressLib.JQueryNs.PlainObject[
      (cypressLib.JQueryNs.EventHandler[TElement, scala.Null]) | (cypressLib.JQueryNs.EventHandlerBase[_, cypressLib.JQueryNs.Event[TElement, scala.Null]]) | cypressLib.cypressLibNumbers.`false`
    ],
    selector: cypressLib.JQueryNs.Selector
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
    events: java.lang.String,
    handler: (cypressLib.JQueryNs.EventHandler[TElement, scala.Null]) | (cypressLib.JQueryNs.EventHandlerBase[_, cypressLib.JQueryNs.Event[TElement, scala.Null]])
  ): this.type = js.native
  def one(events: java.lang.String, handler: cypressLib.cypressLibNumbers.`false`): this.type = js.native
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
    events: java.lang.String,
    selector: cypressLib.JQueryNs.Selector,
    handler: (cypressLib.JQueryNs.EventHandler[TElement, scala.Null]) | (cypressLib.JQueryNs.EventHandlerBase[_, cypressLib.JQueryNs.Event[TElement, scala.Null]])
  ): this.type = js.native
  def one(
    events: java.lang.String,
    selector: cypressLib.JQueryNs.Selector,
    handler: cypressLib.cypressLibNumbers.`false`
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
  def one[TData](
    events: cypressLib.JQueryNs.PlainObject[
      (cypressLib.JQueryNs.EventHandler[TElement, TData]) | (cypressLib.JQueryNs.EventHandlerBase[_, cypressLib.JQueryNs.Event[TElement, TData]]) | cypressLib.cypressLibNumbers.`false`
    ],
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
  def one[TData](
    events: cypressLib.JQueryNs.PlainObject[
      (cypressLib.JQueryNs.EventHandler[TElement, TData]) | (cypressLib.JQueryNs.EventHandlerBase[_, cypressLib.JQueryNs.Event[TElement, TData]]) | cypressLib.cypressLibNumbers.`false`
    ],
    selector: cypressLib.JQueryNs.Selector,
    data: TData
  ): this.type = js.native
  def one[TData](
    events: cypressLib.JQueryNs.PlainObject[
      (cypressLib.JQueryNs.EventHandler[TElement, TData]) | (cypressLib.JQueryNs.EventHandlerBase[_, cypressLib.JQueryNs.Event[TElement, TData]]) | cypressLib.cypressLibNumbers.`false`
    ],
    selector: scala.Null,
    data: TData
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
    events: java.lang.String,
    data: TData,
    handler: (cypressLib.JQueryNs.EventHandler[TElement, TData]) | (cypressLib.JQueryNs.EventHandlerBase[_, cypressLib.JQueryNs.Event[TElement, TData]])
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
    events: java.lang.String,
    selector: cypressLib.JQueryNs.Selector,
    data: TData,
    handler: (cypressLib.JQueryNs.EventHandler[TElement, TData]) | (cypressLib.JQueryNs.EventHandlerBase[_, cypressLib.JQueryNs.Event[TElement, TData]])
  ): this.type = js.native
  def one[TData](
    events: java.lang.String,
    selector: scala.Null,
    data: TData,
    handler: (cypressLib.JQueryNs.EventHandler[TElement, TData]) | (cypressLib.JQueryNs.EventHandlerBase[_, cypressLib.JQueryNs.Event[TElement, TData]])
  ): this.type = js.native
  /**
    * Get the current computed outer height (including padding, border, and optionally margin) for the
    * first element in the set of matched elements.
    *
    * @param includeMargin A Boolean indicating whether to include the element's margin in the calculation.
    * @see \`{@link https://api.jquery.com/outerHeight/ }\`
    * @since 1.2.6
    */
  def outerHeight(): js.UndefOr[scala.Double] = js.native
  def outerHeight(includeMargin: scala.Boolean): js.UndefOr[scala.Double] = js.native
  /**
    * Set the CSS outer height of each element in the set of matched elements.
    *
    * @param value A number representing the number of pixels, or a number along with an optional unit of measure
    *              appended (as a string).
    * @see \`{@link https://api.jquery.com/outerHeight/ }\`
    * @since 1.8.0
    */
  def outerHeight(value: java.lang.String): this.type = js.native
  def outerHeight(
    value: js.ThisFunction2[
      /* this */ TElement, 
      /* index */ scala.Double, 
      /* height */ scala.Double, 
      java.lang.String | scala.Double
    ]
  ): this.type = js.native
  def outerHeight(value: scala.Double): this.type = js.native
  /**
    * Get the current computed outer width (including padding, border, and optionally margin) for the
    * first element in the set of matched elements.
    *
    * @param includeMargin A Boolean indicating whether to include the element's margin in the calculation.
    * @see \`{@link https://api.jquery.com/outerWidth/ }\`
    * @since 1.2.6
    */
  def outerWidth(): js.UndefOr[scala.Double] = js.native
  def outerWidth(includeMargin: scala.Boolean): js.UndefOr[scala.Double] = js.native
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
  def outerWidth(value: java.lang.String): this.type = js.native
  def outerWidth(
    value: js.ThisFunction2[
      /* this */ TElement, 
      /* index */ scala.Double, 
      /* width */ scala.Double, 
      java.lang.String | scala.Double
    ]
  ): this.type = js.native
  def outerWidth(value: scala.Double): this.type = js.native
  /**
    * Get the parent of each element in the current set of matched elements, optionally filtered by a selector.
    *
    * @param selector A string containing a selector expression to match elements against.
    * @see \`{@link https://api.jquery.com/parent/ }\`
    * @since 1.0
    */
  def parent(): this.type = js.native
  def parent(selector: cypressLib.JQueryNs.Selector): this.type = js.native
  /**
    * Get the ancestors of each element in the current set of matched elements, optionally filtered by a selector.
    *
    * @param selector A string containing a selector expression to match elements against.
    * @see \`{@link https://api.jquery.com/parents/ }\`
    * @since 1.0
    */
  def parents(): this.type = js.native
  def parents(selector: cypressLib.JQueryNs.Selector): this.type = js.native
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
  def parentsUntil(selector: JQuery[stdLib.HTMLElement]): this.type = js.native
  def parentsUntil(selector: cypressLib.JQueryNs.Selector): this.type = js.native
  def parentsUntil(selector: cypressLib.JQueryNs.Selector, filter: cypressLib.JQueryNs.Selector): this.type = js.native
  def parentsUntil(selector: JQuery[stdLib.HTMLElement], filter: cypressLib.JQueryNs.Selector): this.type = js.native
  def parentsUntil(selector: stdLib.Element): this.type = js.native
  def parentsUntil(selector: stdLib.Element, filter: cypressLib.JQueryNs.Selector): this.type = js.native
  /**
    * Get the current coordinates of the first element in the set of matched elements, relative to the offset parent.
    *
    * @see \`{@link https://api.jquery.com/position/ }\`
    * @since 1.2
    */
  def position(): cypressLib.JQueryNs.Coordinates = js.native
  /**
    * Insert content, specified by the parameter, to the beginning of each element in the set of matched elements.
    *
    * @param contents One or more additional DOM elements, text nodes, arrays of elements and text nodes, HTML strings, or
    *                 jQuery objects to insert at the beginning of each element in the set of matched elements.
    * @see \`{@link https://api.jquery.com/prepend/ }\`
    * @since 1.0
    */
  def prepend(
    contents: (cypressLib.JQueryNs.htmlString | (cypressLib.JQueryNs.TypeOrArray[cypressLib.JQueryNs.Node | JQuery[cypressLib.JQueryNs.Node]]))*
  ): this.type = js.native
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
      /* index */ scala.Double, 
      /* html */ java.lang.String, 
      cypressLib.JQueryNs.htmlString | (cypressLib.JQueryNs.TypeOrArray[cypressLib.JQueryNs.Node | JQuery[cypressLib.JQueryNs.Node]])
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
  def prependTo(
    target: cypressLib.JQueryNs.Selector | cypressLib.JQueryNs.TypeOrArray[stdLib.Element] | cypressLib.JQueryNs.htmlString
  ): this.type = js.native
  def prependTo(target: JQuery[stdLib.HTMLElement]): this.type = js.native
  /**
    * Get the immediately preceding sibling of each element in the set of matched elements. If a selector
    * is provided, it retrieves the previous sibling only if it matches that selector.
    *
    * @param selector A string containing a selector expression to match elements against.
    * @see \`{@link https://api.jquery.com/prev/ }\`
    * @since 1.0
    */
  def prev(): this.type = js.native
  def prev(selector: cypressLib.JQueryNs.Selector): this.type = js.native
  /**
    * Get all preceding siblings of each element in the set of matched elements, optionally filtered by a selector.
    *
    * @param selector A string containing a selector expression to match elements against.
    * @see \`{@link https://api.jquery.com/prevAll/ }\`
    * @since 1.2
    */
  def prevAll(): this.type = js.native
  def prevAll(selector: cypressLib.JQueryNs.Selector): this.type = js.native
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
  def prevUntil(selector: JQuery[stdLib.HTMLElement]): this.type = js.native
  def prevUntil(selector: cypressLib.JQueryNs.Selector): this.type = js.native
  def prevUntil(selector: cypressLib.JQueryNs.Selector, filter: cypressLib.JQueryNs.Selector): this.type = js.native
  def prevUntil(selector: JQuery[stdLib.HTMLElement], filter: cypressLib.JQueryNs.Selector): this.type = js.native
  def prevUntil(selector: stdLib.Element): this.type = js.native
  def prevUntil(selector: stdLib.Element, filter: cypressLib.JQueryNs.Selector): this.type = js.native
  /**
    * Return a Promise object to observe when all actions of a certain type bound to the collection,
    * queued or not, have finished.
    *
    * @param type The type of queue that needs to be observed.
    * @see \`{@link https://api.jquery.com/promise/ }\`
    * @since 1.6
    */
  def promise(): cypressLib.JQueryNs.Promise[this.type, _, _] = js.native
  def promise(`type`: java.lang.String): cypressLib.JQueryNs.Promise[this.type, _, _] = js.native
  /**
    * Return a Promise object to observe when all actions of a certain type bound to the collection,
    * queued or not, have finished.
    *
    * @param target Object onto which the promise methods have to be attached
    * @see \`{@link https://api.jquery.com/promise/ }\`
    * @since 1.6
    */
  def promise[T /* <: js.Object */](target: T): T with (cypressLib.JQueryNs.Promise[this.type, _, _]) = js.native
  /**
    * Return a Promise object to observe when all actions of a certain type bound to the collection,
    * queued or not, have finished.
    *
    * @param type The type of queue that needs to be observed.
    * @param target Object onto which the promise methods have to be attached
    * @see \`{@link https://api.jquery.com/promise/ }\`
    * @since 1.6
    */
  def promise[T /* <: js.Object */](`type`: java.lang.String, target: T): T with (cypressLib.JQueryNs.Promise[this.type, _, _]) = js.native
   // tslint:disable-line:unified-signatures
  /**
    * Set one or more properties for the set of matched elements.
    *
    * @param properties An object of property-value pairs to set.
    * @see \`{@link https://api.jquery.com/prop/ }\`
    * @since 1.6
    */
  def prop(properties: cypressLib.JQueryNs.PlainObject[_]): this.type = js.native
  /**
    * Get the value of a property for the first element in the set of matched elements.
    *
    * @param propertyName The name of the property to get.
    * @see \`{@link https://api.jquery.com/prop/ }\`
    * @since 1.6
    */
  def prop(propertyName: java.lang.String): js.UndefOr[js.Any] = js.native
  /**
    * Set one or more properties for the set of matched elements.
    *
    * @param propertyName The name of the property to set.
    * @param value A value to set for the property.
    * @see \`{@link https://api.jquery.com/prop/ }\`
    * @since 1.6
    */
  def prop(propertyName: java.lang.String, value: js.Any): this.type = js.native
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
    propertyName: java.lang.String,
    value: js.ThisFunction2[/* this */ TElement, /* index */ scala.Double, /* oldPropertyValue */ js.Any, _]
  ): this.type = js.native
  /**
    * Add a collection of DOM elements onto the jQuery stack.
    *
    * @param elements An array of elements to push onto the stack and make into a new jQuery object.
    * @see \`{@link https://api.jquery.com/pushStack/ }\`
    * @since 1.0
    */
  def pushStack(elements: stdLib.ArrayLike[stdLib.Element]): this.type = js.native
  /**
    * Add a collection of DOM elements onto the jQuery stack.
    *
    * @param elements An array of elements to push onto the stack and make into a new jQuery object.
    * @param name The name of a jQuery method that generated the array of elements.
    * @param args The arguments that were passed in to the jQuery method (for serialization).
    * @see \`{@link https://api.jquery.com/pushStack/ }\`
    * @since 1.3
    */
  def pushStack(elements: stdLib.ArrayLike[stdLib.Element], name: java.lang.String, args: js.Array[_]): this.type = js.native
  /**
    * Show the queue of functions to be executed on the matched elements.
    *
    * @param queueName A string containing the name of the queue. Defaults to fx, the standard effects queue.
    * @see \`{@link https://api.jquery.com/queue/ }\`
    * @since 1.2
    */
  def queue(): cypressLib.JQueryNs.Queue[stdLib.Node] = js.native
  /**
    * Manipulate the queue of functions to be executed, once for each matched element.
    *
    * @param newQueue The new function to add to the queue, with a function to call that will dequeue the next item.
    *                 An array of functions to replace the current queue contents.
    * @see \`{@link https://api.jquery.com/queue/ }\`
    * @since 1.2
    */
  def queue(newQueue: cypressLib.JQueryNs.TypeOrArray[cypressLib.JQueryNs.QueueFunction[TElement]]): this.type = js.native
  def queue(queueName: java.lang.String): cypressLib.JQueryNs.Queue[stdLib.Node] = js.native
  /**
    * Manipulate the queue of functions to be executed, once for each matched element.
    *
    * @param queueName A string containing the name of the queue. Defaults to fx, the standard effects queue.
    * @param newQueue The new function to add to the queue, with a function to call that will dequeue the next item.
    *                 An array of functions to replace the current queue contents.
    * @see \`{@link https://api.jquery.com/queue/ }\`
    * @since 1.2
    */
  def queue(
    queueName: java.lang.String,
    newQueue: cypressLib.JQueryNs.TypeOrArray[cypressLib.JQueryNs.QueueFunction[TElement]]
  ): this.type = js.native
  /**
    * Specify a function to execute when the DOM is fully loaded.
    *
    * @param handler A function to execute after the DOM is ready.
    * @see \`{@link https://api.jquery.com/ready/ }\`
    * @since 1.0
    *
    * @deprecated Deprecated since 3.0. Use `jQuery(function() { })`.
    */
  def ready(handler: js.Function1[/* $ */ JQueryStatic, scala.Unit]): this.type = js.native
  /**
    * Remove the set of matched elements from the DOM.
    *
    * @param selector A selector expression that filters the set of matched elements to be removed.
    * @see \`{@link https://api.jquery.com/remove/ }\`
    * @since 1.0
    */
  def remove(): this.type = js.native
  def remove(selector: java.lang.String): this.type = js.native
  /**
    * Remove an attribute from each element in the set of matched elements.
    *
    * @param attributeName An attribute to remove; as of version 1.7, it can be a space-separated list of attributes.
    * @see \`{@link https://api.jquery.com/removeAttr/ }\`
    * @since 1.0
    */
  def removeAttr(attributeName: java.lang.String): this.type = js.native
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
  def removeClass(className: cypressLib.JQueryNs.TypeOrArray[java.lang.String]): this.type = js.native
  def removeClass(
    className: js.ThisFunction2[
      /* this */ TElement, 
      /* index */ scala.Double, 
      /* className */ java.lang.String, 
      java.lang.String
    ]
  ): this.type = js.native
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
  def removeData(name: cypressLib.JQueryNs.TypeOrArray[java.lang.String]): this.type = js.native
  /**
    * Remove a property for the set of matched elements.
    *
    * @param propertyName The name of the property to remove.
    * @see \`{@link https://api.jquery.com/removeProp/ }\`
    * @since 1.6
    */
  def removeProp(propertyName: java.lang.String): this.type = js.native
  def replaceAll(target: JQuery[stdLib.HTMLElement]): this.type = js.native
  /**
    * Replace each target element with the set of matched elements.
    *
    * @param target A selector string, jQuery object, DOM element, or array of elements indicating which element(s) to replace.
    * @see \`{@link https://api.jquery.com/replaceAll/ }\`
    * @since 1.2
    */
  def replaceAll(target: cypressLib.JQueryNs.Selector): this.type = js.native
  def replaceAll(target: cypressLib.JQueryNs.TypeOrArray[stdLib.Element]): this.type = js.native
  def replaceWith(newContent: JQuery[stdLib.HTMLElement]): this.type = js.native
  def replaceWith(newContent: cypressLib.JQueryNs.TypeOrArray[stdLib.Element]): this.type = js.native
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
  def replaceWith(newContent: cypressLib.JQueryNs.htmlString): this.type = js.native
  def replaceWith(newContent: js.ThisFunction0[/* this */ TElement, _]): this.type = js.native
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
  def resize(
    handler: (cypressLib.JQueryNs.EventHandler[TElement, scala.Null]) | (cypressLib.JQueryNs.EventHandlerBase[_, cypressLib.JQueryNs.Event[TElement, scala.Null]])
  ): this.type = js.native
  def resize(handler: cypressLib.cypressLibNumbers.`false`): this.type = js.native
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
    handler: (cypressLib.JQueryNs.EventHandler[TElement, TData]) | (cypressLib.JQueryNs.EventHandlerBase[_, cypressLib.JQueryNs.Event[TElement, TData]])
  ): this.type = js.native
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
  def scroll(
    handler: (cypressLib.JQueryNs.EventHandler[TElement, scala.Null]) | (cypressLib.JQueryNs.EventHandlerBase[_, cypressLib.JQueryNs.Event[TElement, scala.Null]])
  ): this.type = js.native
  def scroll(handler: cypressLib.cypressLibNumbers.`false`): this.type = js.native
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
    handler: (cypressLib.JQueryNs.EventHandler[TElement, TData]) | (cypressLib.JQueryNs.EventHandlerBase[_, cypressLib.JQueryNs.Event[TElement, TData]])
  ): this.type = js.native
  /**
    * Get the current horizontal position of the scroll bar for the first element in the set of matched elements.
    *
    * @see \`{@link https://api.jquery.com/scrollLeft/ }\`
    * @since 1.2.6
    */
  def scrollLeft(): js.UndefOr[scala.Double] = js.native
  /**
    * Set the current horizontal position of the scroll bar for each of the set of matched elements.
    *
    * @param value An integer indicating the new position to set the scroll bar to.
    * @see \`{@link https://api.jquery.com/scrollLeft/ }\`
    * @since 1.2.6
    */
  def scrollLeft(value: scala.Double): this.type = js.native
  /**
    * Get the current vertical position of the scroll bar for the first element in the set of matched
    * elements or set the vertical position of the scroll bar for every matched element.
    *
    * @see \`{@link https://api.jquery.com/scrollTop/ }\`
    * @since 1.2.6
    */
  def scrollTop(): js.UndefOr[scala.Double] = js.native
  /**
    * Set the current vertical position of the scroll bar for each of the set of matched elements.
    *
    * @param value A number indicating the new position to set the scroll bar to.
    * @see \`{@link https://api.jquery.com/scrollTop/ }\`
    * @since 1.2.6
    */
  def scrollTop(value: scala.Double): this.type = js.native
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
  def select(
    handler: (cypressLib.JQueryNs.EventHandler[TElement, scala.Null]) | (cypressLib.JQueryNs.EventHandlerBase[_, cypressLib.JQueryNs.Event[TElement, scala.Null]])
  ): this.type = js.native
  def select(handler: cypressLib.cypressLibNumbers.`false`): this.type = js.native
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
    handler: (cypressLib.JQueryNs.EventHandler[TElement, TData]) | (cypressLib.JQueryNs.EventHandlerBase[_, cypressLib.JQueryNs.Event[TElement, TData]])
  ): this.type = js.native
  /**
    * Encode a set of form elements as a string for submission.
    *
    * @see \`{@link https://api.jquery.com/serialize/ }\`
    * @since 1.0
    */
  def serialize(): java.lang.String = js.native
  /**
    * Encode a set of form elements as an array of names and values.
    *
    * @see \`{@link https://api.jquery.com/serializeArray/ }\`
    * @since 1.2
    */
  def serializeArray(): js.Array[cypressLib.JQueryNs.NameValuePair] = js.native
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
  def show(duration_complete_options: cypressLib.JQueryNs.Duration): this.type = js.native
  def show(duration_complete_options: cypressLib.JQueryNs.EffectsOptions[TElement]): this.type = js.native
  def show(duration_complete_options: js.ThisFunction0[/* this */ TElement, scala.Unit]): this.type = js.native
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
  def show(duration: cypressLib.JQueryNs.Duration, easing_complete: java.lang.String): this.type = js.native
  def show(
    duration: cypressLib.JQueryNs.Duration,
    easing_complete: js.ThisFunction0[/* this */ TElement, scala.Unit]
  ): this.type = js.native
  /**
    * Display the matched elements.
    *
    * @param duration A string or number determining how long the animation will run.
    * @param easing A string indicating which easing function to use for the transition.
    * @param complete A function to call once the animation is complete, called once per matched element.
    * @see \`{@link https://api.jquery.com/show/ }\`
    * @since 1.4.3
    */
  def show(
    duration: cypressLib.JQueryNs.Duration,
    easing: java.lang.String,
    complete: js.ThisFunction0[/* this */ TElement, scala.Unit]
  ): this.type = js.native
  /**
    * Get the siblings of each element in the set of matched elements, optionally filtered by a selector.
    *
    * @param selector A string containing a selector expression to match elements against.
    * @see \`{@link https://api.jquery.com/siblings/ }\`
    * @since 1.0
    */
  def siblings(): this.type = js.native
  def siblings(selector: cypressLib.JQueryNs.Selector): this.type = js.native
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
  def slice(start: scala.Double): this.type = js.native
  def slice(start: scala.Double, end: scala.Double): this.type = js.native
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
  def slideDown(duration_easing_complete_options: cypressLib.JQueryNs.Duration): this.type = js.native
  def slideDown(duration_easing_complete_options: cypressLib.JQueryNs.EffectsOptions[TElement]): this.type = js.native
  def slideDown(duration_easing_complete_options: java.lang.String): this.type = js.native
  def slideDown(duration_easing_complete_options: js.ThisFunction0[/* this */ TElement, scala.Unit]): this.type = js.native
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
  def slideDown(
    duration_easing: cypressLib.JQueryNs.Duration,
    complete: js.ThisFunction0[/* this */ TElement, scala.Unit]
  ): this.type = js.native
  def slideDown(duration_easing: java.lang.String, complete: js.ThisFunction0[/* this */ TElement, scala.Unit]): this.type = js.native
  /**
    * Display the matched elements with a sliding motion.
    *
    * @param duration A string or number determining how long the animation will run.
    * @param easing A string indicating which easing function to use for the transition.
    * @param complete A function to call once the animation is complete, called once per matched element.
    * @see \`{@link https://api.jquery.com/slideDown/ }\`
    * @since 1.4.3
    */
  def slideDown(duration: cypressLib.JQueryNs.Duration, easing: java.lang.String): this.type = js.native
  def slideDown(
    duration: cypressLib.JQueryNs.Duration,
    easing: java.lang.String,
    complete: js.ThisFunction0[/* this */ TElement, scala.Unit]
  ): this.type = js.native
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
  def slideToggle(duration_easing_complete_options: cypressLib.JQueryNs.Duration): this.type = js.native
  def slideToggle(duration_easing_complete_options: cypressLib.JQueryNs.EffectsOptions[TElement]): this.type = js.native
  def slideToggle(duration_easing_complete_options: java.lang.String): this.type = js.native
  def slideToggle(duration_easing_complete_options: js.ThisFunction0[/* this */ TElement, scala.Unit]): this.type = js.native
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
  def slideToggle(
    duration_easing: cypressLib.JQueryNs.Duration,
    complete: js.ThisFunction0[/* this */ TElement, scala.Unit]
  ): this.type = js.native
  def slideToggle(duration_easing: java.lang.String, complete: js.ThisFunction0[/* this */ TElement, scala.Unit]): this.type = js.native
  /**
    * Display or hide the matched elements with a sliding motion.
    *
    * @param duration A string or number determining how long the animation will run.
    * @param easing A string indicating which easing function to use for the transition.
    * @param complete A function to call once the animation is complete, called once per matched element.
    * @see \`{@link https://api.jquery.com/slideToggle/ }\`
    * @since 1.4.3
    */
  def slideToggle(duration: cypressLib.JQueryNs.Duration, easing: java.lang.String): this.type = js.native
  def slideToggle(
    duration: cypressLib.JQueryNs.Duration,
    easing: java.lang.String,
    complete: js.ThisFunction0[/* this */ TElement, scala.Unit]
  ): this.type = js.native
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
  def slideUp(duration_easing_complete_options: cypressLib.JQueryNs.Duration): this.type = js.native
  def slideUp(duration_easing_complete_options: cypressLib.JQueryNs.EffectsOptions[TElement]): this.type = js.native
  def slideUp(duration_easing_complete_options: java.lang.String): this.type = js.native
  def slideUp(duration_easing_complete_options: js.ThisFunction0[/* this */ TElement, scala.Unit]): this.type = js.native
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
  def slideUp(
    duration_easing: cypressLib.JQueryNs.Duration,
    complete: js.ThisFunction0[/* this */ TElement, scala.Unit]
  ): this.type = js.native
  def slideUp(duration_easing: java.lang.String, complete: js.ThisFunction0[/* this */ TElement, scala.Unit]): this.type = js.native
  /**
    * Hide the matched elements with a sliding motion.
    *
    * @param duration A string or number determining how long the animation will run.
    * @param easing A string indicating which easing function to use for the transition.
    * @param complete A function to call once the animation is complete, called once per matched element.
    * @see \`{@link https://api.jquery.com/slideUp/ }\`
    * @since 1.4.3
    */
  def slideUp(duration: cypressLib.JQueryNs.Duration, easing: java.lang.String): this.type = js.native
  def slideUp(
    duration: cypressLib.JQueryNs.Duration,
    easing: java.lang.String,
    complete: js.ThisFunction0[/* this */ TElement, scala.Unit]
  ): this.type = js.native
  /**
    * Stop the currently-running animation on the matched elements.
    *
    * @param clearQueue A Boolean indicating whether to remove queued animation as well. Defaults to false.
    * @param jumpToEnd A Boolean indicating whether to complete the current animation immediately. Defaults to false.
    * @see \`{@link https://api.jquery.com/stop/ }\`
    * @since 1.2
    */
  def stop(): this.type = js.native
  def stop(clearQueue: scala.Boolean): this.type = js.native
  def stop(clearQueue: scala.Boolean, jumpToEnd: scala.Boolean): this.type = js.native
  /**
    * Stop the currently-running animation on the matched elements.
    *
    * @param queue The name of the queue in which to stop animations.
    * @param clearQueue A Boolean indicating whether to remove queued animation as well. Defaults to false.
    * @param jumpToEnd A Boolean indicating whether to complete the current animation immediately. Defaults to false.
    * @see \`{@link https://api.jquery.com/stop/ }\`
    * @since 1.7
    */
  def stop(queue: java.lang.String): this.type = js.native
  def stop(queue: java.lang.String, clearQueue: scala.Boolean): this.type = js.native
  def stop(queue: java.lang.String, clearQueue: scala.Boolean, jumpToEnd: scala.Boolean): this.type = js.native
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
  def submit(
    handler: (cypressLib.JQueryNs.EventHandler[TElement, scala.Null]) | (cypressLib.JQueryNs.EventHandlerBase[_, cypressLib.JQueryNs.Event[TElement, scala.Null]])
  ): this.type = js.native
  def submit(handler: cypressLib.cypressLibNumbers.`false`): this.type = js.native
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
    handler: (cypressLib.JQueryNs.EventHandler[TElement, TData]) | (cypressLib.JQueryNs.EventHandlerBase[_, cypressLib.JQueryNs.Event[TElement, TData]])
  ): this.type = js.native
  /**
    * Get the combined text contents of each element in the set of matched elements, including their descendants.
    *
    * @see \`{@link https://api.jquery.com/text/ }\`
    * @since 1.0
    */
  def text(): java.lang.String = js.native
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
  def text(text: java.lang.String): this.type = js.native
  def text(
    text: js.ThisFunction2[
      /* this */ TElement, 
      /* index */ scala.Double, 
      /* text */ java.lang.String, 
      java.lang.String | scala.Double | scala.Boolean
    ]
  ): this.type = js.native
  def text(text: scala.Boolean): this.type = js.native
  def text(text: scala.Double): this.type = js.native
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
  def toggle(duration_complete_options_display: cypressLib.JQueryNs.Duration): this.type = js.native
  def toggle(duration_complete_options_display: cypressLib.JQueryNs.EffectsOptions[TElement]): this.type = js.native
  def toggle(duration_complete_options_display: js.ThisFunction0[/* this */ TElement, scala.Unit]): this.type = js.native
  def toggle(duration_complete_options_display: scala.Boolean): this.type = js.native
  /**
    * Display or hide the matched elements.
    *
    * @param duration A string or number determining how long the animation will run.
    * @param complete A function to call once the animation is complete, called once per matched element.
    * @see \`{@link https://api.jquery.com/toggle/ }\`
    * @since 1.0
    */
  def toggle(
    duration: cypressLib.JQueryNs.Duration,
    complete: js.ThisFunction0[/* this */ TElement, scala.Unit]
  ): this.type = js.native
  /**
    * Display or hide the matched elements.
    *
    * @param duration A string or number determining how long the animation will run.
    * @param easing A string indicating which easing function to use for the transition.
    * @param complete A function to call once the animation is complete, called once per matched element.
    * @see \`{@link https://api.jquery.com/toggle/ }\`
    * @since 1.4.3
    */
  def toggle(duration: cypressLib.JQueryNs.Duration, easing: java.lang.String): this.type = js.native
  def toggle(
    duration: cypressLib.JQueryNs.Duration,
    easing: java.lang.String,
    complete: js.ThisFunction0[/* this */ TElement, scala.Unit]
  ): this.type = js.native
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
  def toggleClass(state: scala.Boolean): this.type = js.native
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
  def toggleClass[TState /* <: scala.Boolean */](className: cypressLib.JQueryNs.TypeOrArray[java.lang.String]): this.type = js.native
  def toggleClass[TState /* <: scala.Boolean */](className: cypressLib.JQueryNs.TypeOrArray[java.lang.String], state: TState): this.type = js.native
  def toggleClass[TState /* <: scala.Boolean */](
    className: js.ThisFunction3[
      /* this */ TElement, 
      /* index */ scala.Double, 
      /* className */ java.lang.String, 
      /* state */ TState, 
      java.lang.String
    ]
  ): this.type = js.native
  def toggleClass[TState /* <: scala.Boolean */](
    className: js.ThisFunction3[
      /* this */ TElement, 
      /* index */ scala.Double, 
      /* className */ java.lang.String, 
      /* state */ TState, 
      java.lang.String
    ],
    state: TState
  ): this.type = js.native
  def trigger(eventType: cypressLib.JQueryNs.Event[TElement, scala.Null]): this.type = js.native
  def trigger(
    eventType: cypressLib.JQueryNs.Event[TElement, scala.Null],
    extraParameters: cypressLib.JQueryNs.PlainObject[_]
  ): this.type = js.native
  def trigger(eventType: cypressLib.JQueryNs.Event[TElement, scala.Null], extraParameters: java.lang.String): this.type = js.native
  def trigger(eventType: cypressLib.JQueryNs.Event[TElement, scala.Null], extraParameters: js.Array[_]): this.type = js.native
  def trigger(eventType: cypressLib.JQueryNs.Event[TElement, scala.Null], extraParameters: scala.Double): this.type = js.native
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
  def trigger(eventType: java.lang.String): this.type = js.native
  def trigger(eventType: java.lang.String, extraParameters: cypressLib.JQueryNs.PlainObject[_]): this.type = js.native
  def trigger(eventType: java.lang.String, extraParameters: java.lang.String): this.type = js.native
  def trigger(eventType: java.lang.String, extraParameters: js.Array[_]): this.type = js.native
  def trigger(eventType: java.lang.String, extraParameters: scala.Double): this.type = js.native
  def triggerHandler(eventType: cypressLib.JQueryNs.Event[TElement, scala.Null]): js.UndefOr[js.Any] = js.native
  def triggerHandler(
    eventType: cypressLib.JQueryNs.Event[TElement, scala.Null],
    extraParameters: cypressLib.JQueryNs.PlainObject[_]
  ): js.UndefOr[js.Any] = js.native
  def triggerHandler(eventType: cypressLib.JQueryNs.Event[TElement, scala.Null], extraParameters: java.lang.String): js.UndefOr[js.Any] = js.native
  def triggerHandler(eventType: cypressLib.JQueryNs.Event[TElement, scala.Null], extraParameters: js.Array[_]): js.UndefOr[js.Any] = js.native
  def triggerHandler(eventType: cypressLib.JQueryNs.Event[TElement, scala.Null], extraParameters: scala.Double): js.UndefOr[js.Any] = js.native
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
  def triggerHandler(eventType: java.lang.String): js.UndefOr[js.Any] = js.native
  def triggerHandler(eventType: java.lang.String, extraParameters: cypressLib.JQueryNs.PlainObject[_]): js.UndefOr[js.Any] = js.native
  def triggerHandler(eventType: java.lang.String, extraParameters: java.lang.String): js.UndefOr[js.Any] = js.native
  def triggerHandler(eventType: java.lang.String, extraParameters: js.Array[_]): js.UndefOr[js.Any] = js.native
  def triggerHandler(eventType: java.lang.String, extraParameters: scala.Double): js.UndefOr[js.Any] = js.native
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
  def unbind(event: cypressLib.JQueryNs.Event[TElement, scala.Null]): this.type = js.native
  def unbind(event: java.lang.String): this.type = js.native
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
  def unbind(
    event: java.lang.String,
    handler: cypressLib.JQueryNs.EventHandlerBase[_, cypressLib.JQueryNs.Event[TElement, _]]
  ): this.type = js.native
  def unbind(event: java.lang.String, handler: cypressLib.cypressLibNumbers.`false`): this.type = js.native
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
  def undelegate(namespace: java.lang.String): this.type = js.native
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
  def undelegate(
    selector: cypressLib.JQueryNs.Selector,
    eventType: java.lang.String,
    handler: cypressLib.JQueryNs.EventHandlerBase[_, cypressLib.JQueryNs.Event[TElement, _]]
  ): this.type = js.native
  def undelegate(
    selector: cypressLib.JQueryNs.Selector,
    eventType: java.lang.String,
    handler: cypressLib.cypressLibNumbers.`false`
  ): this.type = js.native
  def undelegate(
    selector: cypressLib.JQueryNs.Selector,
    eventTypes: cypressLib.JQueryNs.PlainObject[
      (cypressLib.JQueryNs.EventHandlerBase[_, cypressLib.JQueryNs.Event[TElement, _]]) | cypressLib.cypressLibNumbers.`false`
    ]
  ): this.type = js.native
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
  def undelegate(selector: cypressLib.JQueryNs.Selector, eventTypes: java.lang.String): this.type = js.native
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
  def unwrap(selector: java.lang.String): this.type = js.native
  /**
    * Get the current value of the first element in the set of matched elements.
    *
    * @see \`{@link https://api.jquery.com/val/ }\`
    * @since 1.0
    */
  def `val`(): js.UndefOr[java.lang.String | scala.Double | js.Array[java.lang.String]] = js.native
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
  def `val`(value: java.lang.String): this.type = js.native
  def `val`(value: js.Array[java.lang.String]): this.type = js.native
  def `val`(
    value: js.ThisFunction2[
      /* this */ TElement, 
      /* index */ scala.Double, 
      /* value */ java.lang.String, 
      java.lang.String
    ]
  ): this.type = js.native
  def `val`(value: scala.Double): this.type = js.native
  /**
    * Get the current computed width for the first element in the set of matched elements.
    *
    * @see \`{@link https://api.jquery.com/width/ }\`
    * @since 1.0
    */
  def width(): js.UndefOr[scala.Double] = js.native
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
  def width(value: java.lang.String): this.type = js.native
  def width(
    value: js.ThisFunction2[
      /* this */ TElement, 
      /* index */ scala.Double, 
      /* value */ scala.Double, 
      java.lang.String | scala.Double
    ]
  ): this.type = js.native
  def width(value: scala.Double): this.type = js.native
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
  def wrap(wrappingElement: cypressLib.JQueryNs.Selector | cypressLib.JQueryNs.htmlString): this.type = js.native
  def wrap(wrappingElement: JQuery[stdLib.HTMLElement]): this.type = js.native
  def wrap(
    wrappingElement: js.ThisFunction1[
      /* this */ TElement, 
      /* index */ scala.Double, 
      java.lang.String | JQuery[stdLib.HTMLElement]
    ]
  ): this.type = js.native
  def wrap(wrappingElement: stdLib.Element): this.type = js.native
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
  def wrapAll(wrappingElement: cypressLib.JQueryNs.Selector | cypressLib.JQueryNs.htmlString): this.type = js.native
  def wrapAll(wrappingElement: JQuery[stdLib.HTMLElement]): this.type = js.native
  def wrapAll(
    wrappingElement: js.ThisFunction0[/* this */ TElement, java.lang.String | JQuery[stdLib.HTMLElement]]
  ): this.type = js.native
  def wrapAll(wrappingElement: stdLib.Element): this.type = js.native
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
  def wrapInner(wrappingElement: cypressLib.JQueryNs.Selector | cypressLib.JQueryNs.htmlString): this.type = js.native
  def wrapInner(wrappingElement: JQuery[stdLib.HTMLElement]): this.type = js.native
  def wrapInner(
    wrappingElement: js.ThisFunction1[
      /* this */ TElement, 
      /* index */ scala.Double, 
      java.lang.String | JQuery[stdLib.HTMLElement] | stdLib.Element
    ]
  ): this.type = js.native
  def wrapInner(wrappingElement: stdLib.Element): this.type = js.native
}

