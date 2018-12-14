package typings
package chaiDashJqueryLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * The chai-jquery instance members
 */
@js.native
trait ChaiJQuery
  extends /* index */ org.scalablytyped.runtime.StringDictionary[js.Any]
     with /* index */ org.scalablytyped.runtime.NumberDictionary[stdLib.HTMLElement] {
  /**
       * The DOM node context originally passed to jQuery(); if none was passed then context will likely be the document. (DEPRECATED from v1.10)
       */
  var context: stdLib.Element = js.native
  var jquery: java.lang.String = js.native
  /**
       * The number of elements in the jQuery object.
       */
  var length: scala.Double = js.native
  /**
       * A selector representing selector passed to jQuery(), if any, when creating the original set.
       * version deprecated: 1.7, removed: 1.9
       */
  var selector: java.lang.String = js.native
  @JSName("should")
  var should_Original: chaiDashJqueryLib.ChaiNs.Assertion = js.native
  /**
       * Add elements to the set of matched elements.
       *
       * @param elements One or more elements to add to the set of matched elements.
       */
  def add(elements: stdLib.Element*): ChaiJQuery = js.native
  /**
       * Add elements to the set of matched elements.
       *
       * @param obj An existing jQuery object to add to the set of matched elements.
       */
  def add(obj: jqueryLib.JQuery[stdLib.HTMLElement]): ChaiJQuery = js.native
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
  def add(selector: java.lang.String): ChaiJQuery = js.native
  /**
       * Add elements to the set of matched elements.
       *
       * @param selector A string representing a selector expression to find additional elements to add to the set of matched elements.
       * @param context The point in the document at which the selector should begin matching; similar to the context argument of the $(selector, context) method.
       */
  def add(selector: java.lang.String, context: stdLib.Element): ChaiJQuery = js.native
  /**
       * Add the previous set of elements on the stack to the current set, optionally filtered by a selector.
       */
  def addBack(): ChaiJQuery = js.native
  /**
       * Add the previous set of elements on the stack to the current set, optionally filtered by a selector.
       */
  def addBack(selector: java.lang.String): ChaiJQuery = js.native
  /**
       * Adds the specified class(es) to each of the set of matched elements.
       *
       * @param className One or more space-separated classes to be added to the class attribute of each matched element.
       */
  def addClass(className: java.lang.String): ChaiJQuery = js.native
  /**
       * Adds the specified class(es) to each of the set of matched elements.
       *
       * @param function A function returning one or more space-separated class names to be added to the existing class name(s). Receives the index position of the element in the set and the existing class name(s) as arguments. Within the function, this refers to the current element in the set.
       */
  def addClass(func: js.Function2[/* index */ scala.Double, /* className */ java.lang.String, java.lang.String]): ChaiJQuery = js.native
  /**
       * Insert content, specified by the parameter, after each element in the set of matched elements.
       *
       * param content1 HTML string, DOM element, array of elements, or jQuery object to insert after each element in the set of matched elements.
       * param content2 One or more additional DOM elements, arrays of elements, HTML strings, or jQuery objects to insert after each element in the set of matched elements.
       */
  def after(content1: java.lang.String, content2: js.Any*): ChaiJQuery = js.native
  /**
       * Insert content, specified by the parameter, after each element in the set of matched elements.
       *
       * param content1 HTML string, DOM element, array of elements, or jQuery object to insert after each element in the set of matched elements.
       * param content2 One or more additional DOM elements, arrays of elements, HTML strings, or jQuery objects to insert after each element in the set of matched elements.
       */
  def after(content1: jqueryLib.JQuery[stdLib.HTMLElement], content2: js.Any*): ChaiJQuery = js.native
  /**
       * Insert content, specified by the parameter, after each element in the set of matched elements.
       *
       * param content1 HTML string, DOM element, array of elements, or jQuery object to insert after each element in the set of matched elements.
       * param content2 One or more additional DOM elements, arrays of elements, HTML strings, or jQuery objects to insert after each element in the set of matched elements.
       */
  def after(content1: js.Array[_], content2: js.Any*): ChaiJQuery = js.native
  /**
       * Insert content, specified by the parameter, after each element in the set of matched elements.
       *
       * param content1 HTML string, DOM element, array of elements, or jQuery object to insert after each element in the set of matched elements.
       * param content2 One or more additional DOM elements, arrays of elements, HTML strings, or jQuery objects to insert after each element in the set of matched elements.
       */
  def after(content1: stdLib.Element, content2: js.Any*): ChaiJQuery = js.native
  /**
       * Insert content, specified by the parameter, after each element in the set of matched elements.
       *
       * param content1 HTML string, DOM element, array of elements, or jQuery object to insert after each element in the set of matched elements.
       * param content2 One or more additional DOM elements, arrays of elements, HTML strings, or jQuery objects to insert after each element in the set of matched elements.
       */
  def after(content1: stdLib.Text, content2: js.Any*): ChaiJQuery = js.native
  /**
       * Insert content, specified by the parameter, after each element in the set of matched elements.
       *
       * param func A function that returns an HTML string, DOM element(s), or jQuery object to insert after each element in the set of matched elements. Receives the index position of the element in the set as an argument. Within the function, this refers to the current element in the set.
       */
  def after(
    func: js.Function2[
      /* index */ scala.Double, 
      /* html */ java.lang.String, 
      java.lang.String | stdLib.Element | jqueryLib.JQuery[stdLib.HTMLElement]
    ]
  ): ChaiJQuery = js.native
  /**
       * Register a handler to be called when Ajax requests complete. This is an AjaxEvent.
       *
       * @param handler The function to be invoked.
       */
  def ajaxComplete(
    handler: js.Function3[
      /* event */ jqueryLib.JQueryEventObject, 
      /* XMLHttpRequest */ stdLib.XMLHttpRequest, 
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
      /* event */ jqueryLib.JQueryEventObject, 
      /* jqXHR */ jqueryLib.JQueryXHR, 
      /* ajaxSettings */ jqueryLib.JQueryAjaxSettings, 
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
      /* event */ jqueryLib.JQueryEventObject, 
      /* jqXHR */ jqueryLib.JQueryXHR, 
      /* ajaxOptions */ jqueryLib.JQueryAjaxSettings, 
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
      /* event */ jqueryLib.JQueryEventObject, 
      /* XMLHttpRequest */ stdLib.XMLHttpRequest, 
      /* ajaxOptions */ jqueryLib.JQueryAjaxSettings, 
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
  def animate(properties: js.Object): ChaiJQuery = js.native
  /**
       * Perform a custom animation of a set of CSS properties.
       *
       * @param properties An object of CSS properties and values that the animation will move toward.
       * @param duration A string or number determining how long the animation will run.
       * @param complete A function to call once the animation is complete.
       */
  def animate(properties: js.Object, duration: java.lang.String): ChaiJQuery = js.native
  /**
       * Perform a custom animation of a set of CSS properties.
       *
       * @param properties An object of CSS properties and values that the animation will move toward.
       * @param duration A string or number determining how long the animation will run.
       * @param complete A function to call once the animation is complete.
       */
  def animate(properties: js.Object, duration: java.lang.String, complete: js.Function): ChaiJQuery = js.native
  /**
       * Perform a custom animation of a set of CSS properties.
       *
       * @param properties An object of CSS properties and values that the animation will move toward.
       * @param duration A string or number determining how long the animation will run.
       * @param easing A string indicating which easing function to use for the transition. (default: swing)
       * @param complete A function to call once the animation is complete.
       */
  def animate(properties: js.Object, duration: java.lang.String, easing: java.lang.String): ChaiJQuery = js.native
  /**
       * Perform a custom animation of a set of CSS properties.
       *
       * @param properties An object of CSS properties and values that the animation will move toward.
       * @param duration A string or number determining how long the animation will run.
       * @param easing A string indicating which easing function to use for the transition. (default: swing)
       * @param complete A function to call once the animation is complete.
       */
  def animate(properties: js.Object, duration: java.lang.String, easing: java.lang.String, complete: js.Function): ChaiJQuery = js.native
  /**
       * Perform a custom animation of a set of CSS properties.
       *
       * @param properties An object of CSS properties and values that the animation will move toward.
       * @param duration A string or number determining how long the animation will run.
       * @param complete A function to call once the animation is complete.
       */
  def animate(properties: js.Object, duration: scala.Double): ChaiJQuery = js.native
  /**
       * Perform a custom animation of a set of CSS properties.
       *
       * @param properties An object of CSS properties and values that the animation will move toward.
       * @param duration A string or number determining how long the animation will run.
       * @param complete A function to call once the animation is complete.
       */
  def animate(properties: js.Object, duration: scala.Double, complete: js.Function): ChaiJQuery = js.native
  /**
       * Perform a custom animation of a set of CSS properties.
       *
       * @param properties An object of CSS properties and values that the animation will move toward.
       * @param duration A string or number determining how long the animation will run.
       * @param easing A string indicating which easing function to use for the transition. (default: swing)
       * @param complete A function to call once the animation is complete.
       */
  def animate(properties: js.Object, duration: scala.Double, easing: java.lang.String): ChaiJQuery = js.native
  /**
       * Perform a custom animation of a set of CSS properties.
       *
       * @param properties An object of CSS properties and values that the animation will move toward.
       * @param duration A string or number determining how long the animation will run.
       * @param easing A string indicating which easing function to use for the transition. (default: swing)
       * @param complete A function to call once the animation is complete.
       */
  def animate(properties: js.Object, duration: scala.Double, easing: java.lang.String, complete: js.Function): ChaiJQuery = js.native
  /**
       * Perform a custom animation of a set of CSS properties.
       *
       * @param properties An object of CSS properties and values that the animation will move toward.
       * @param options A map of additional options to pass to the method.
       */
  def animate(properties: js.Object, options: jqueryLib.JQueryAnimationOptions): ChaiJQuery = js.native
  /**
       * Insert content, specified by the parameter, to the end of each element in the set of matched elements.
       *
       * param content1 DOM element, array of elements, HTML string, or jQuery object to insert at the end of each element in the set of matched elements.
       * param content2 One or more additional DOM elements, arrays of elements, HTML strings, or jQuery objects to insert at the end of each element in the set of matched elements.
       */
  def append(content1: java.lang.String, content2: js.Any*): ChaiJQuery = js.native
  /**
       * Insert content, specified by the parameter, to the end of each element in the set of matched elements.
       *
       * param content1 DOM element, array of elements, HTML string, or jQuery object to insert at the end of each element in the set of matched elements.
       * param content2 One or more additional DOM elements, arrays of elements, HTML strings, or jQuery objects to insert at the end of each element in the set of matched elements.
       */
  def append(content1: jqueryLib.JQuery[stdLib.HTMLElement], content2: js.Any*): ChaiJQuery = js.native
  /**
       * Insert content, specified by the parameter, to the end of each element in the set of matched elements.
       *
       * param content1 DOM element, array of elements, HTML string, or jQuery object to insert at the end of each element in the set of matched elements.
       * param content2 One or more additional DOM elements, arrays of elements, HTML strings, or jQuery objects to insert at the end of each element in the set of matched elements.
       */
  def append(content1: js.Array[_], content2: js.Any*): ChaiJQuery = js.native
  /**
       * Insert content, specified by the parameter, to the end of each element in the set of matched elements.
       *
       * param content1 DOM element, array of elements, HTML string, or jQuery object to insert at the end of each element in the set of matched elements.
       * param content2 One or more additional DOM elements, arrays of elements, HTML strings, or jQuery objects to insert at the end of each element in the set of matched elements.
       */
  def append(content1: stdLib.Element, content2: js.Any*): ChaiJQuery = js.native
  /**
       * Insert content, specified by the parameter, to the end of each element in the set of matched elements.
       *
       * param content1 DOM element, array of elements, HTML string, or jQuery object to insert at the end of each element in the set of matched elements.
       * param content2 One or more additional DOM elements, arrays of elements, HTML strings, or jQuery objects to insert at the end of each element in the set of matched elements.
       */
  def append(content1: stdLib.Text, content2: js.Any*): ChaiJQuery = js.native
  /**
       * Insert content, specified by the parameter, to the end of each element in the set of matched elements.
       *
       * param func A function that returns an HTML string, DOM element(s), or jQuery object to insert at the end of each element in the set of matched elements. Receives the index position of the element in the set and the old HTML value of the element as arguments. Within the function, this refers to the current element in the set.
       */
  def append(
    func: js.Function2[
      /* index */ scala.Double, 
      /* html */ java.lang.String, 
      java.lang.String | stdLib.Element | jqueryLib.JQuery[stdLib.HTMLElement]
    ]
  ): ChaiJQuery = js.native
  /**
       * Insert every element in the set of matched elements to the end of the target.
       *
       * @param target A selector, element, HTML string, array of elements, or jQuery object; the matched set of elements will be inserted at the end of the element(s) specified by this parameter.
       */
  def appendTo(target: java.lang.String): ChaiJQuery = js.native
  /**
       * Insert every element in the set of matched elements to the end of the target.
       *
       * @param target A selector, element, HTML string, array of elements, or jQuery object; the matched set of elements will be inserted at the end of the element(s) specified by this parameter.
       */
  def appendTo(target: jqueryLib.JQuery[stdLib.HTMLElement]): ChaiJQuery = js.native
  /**
       * Insert every element in the set of matched elements to the end of the target.
       *
       * @param target A selector, element, HTML string, array of elements, or jQuery object; the matched set of elements will be inserted at the end of the element(s) specified by this parameter.
       */
  def appendTo(target: js.Array[_]): ChaiJQuery = js.native
  /**
       * Insert every element in the set of matched elements to the end of the target.
       *
       * @param target A selector, element, HTML string, array of elements, or jQuery object; the matched set of elements will be inserted at the end of the element(s) specified by this parameter.
       */
  def appendTo(target: stdLib.Element): ChaiJQuery = js.native
  /**
       * Get the value of an attribute for the first element in the set of matched elements.
       *
       * @param attributeName The name of the attribute to get.
       */
  def attr(attributeName: java.lang.String): java.lang.String = js.native
  /**
       * Set one or more attributes for the set of matched elements.
       *
       * @param attributeName The name of the attribute to set.
       * @param func A function returning the value to set. this is the current element. Receives the index position of the element in the set and the old attribute value as arguments.
       */
  def attr(
    attributeName: java.lang.String,
    func: js.Function2[
      /* index */ scala.Double, 
      /* attr */ java.lang.String, 
      java.lang.String | scala.Double
    ]
  ): ChaiJQuery = js.native
  /**
       * Set one or more attributes for the set of matched elements.
       *
       * @param attributeName The name of the attribute to set.
       * @param value A value to set for the attribute.
       */
  def attr(attributeName: java.lang.String, value: java.lang.String): ChaiJQuery = js.native
  /**
       * Set one or more attributes for the set of matched elements.
       *
       * @param attributeName The name of the attribute to set.
       * @param value A value to set for the attribute.
       */
  def attr(attributeName: java.lang.String, value: scala.Double): ChaiJQuery = js.native
  /**
       * Set one or more attributes for the set of matched elements.
       *
       * @param attributes An object of attribute-value pairs to set.
       */
  def attr(attributes: js.Object): ChaiJQuery = js.native
  /**
       * Insert content, specified by the parameter, before each element in the set of matched elements.
       *
       * param content1 HTML string, DOM element, array of elements, or jQuery object to insert before each element in the set of matched elements.
       * param content2 One or more additional DOM elements, arrays of elements, HTML strings, or jQuery objects to insert before each element in the set of matched elements.
       */
  def before(content1: java.lang.String, content2: js.Any*): ChaiJQuery = js.native
  /**
       * Insert content, specified by the parameter, before each element in the set of matched elements.
       *
       * param content1 HTML string, DOM element, array of elements, or jQuery object to insert before each element in the set of matched elements.
       * param content2 One or more additional DOM elements, arrays of elements, HTML strings, or jQuery objects to insert before each element in the set of matched elements.
       */
  def before(content1: jqueryLib.JQuery[stdLib.HTMLElement], content2: js.Any*): ChaiJQuery = js.native
  /**
       * Insert content, specified by the parameter, before each element in the set of matched elements.
       *
       * param content1 HTML string, DOM element, array of elements, or jQuery object to insert before each element in the set of matched elements.
       * param content2 One or more additional DOM elements, arrays of elements, HTML strings, or jQuery objects to insert before each element in the set of matched elements.
       */
  def before(content1: js.Array[_], content2: js.Any*): ChaiJQuery = js.native
  /**
       * Insert content, specified by the parameter, before each element in the set of matched elements.
       *
       * param content1 HTML string, DOM element, array of elements, or jQuery object to insert before each element in the set of matched elements.
       * param content2 One or more additional DOM elements, arrays of elements, HTML strings, or jQuery objects to insert before each element in the set of matched elements.
       */
  def before(content1: stdLib.Element, content2: js.Any*): ChaiJQuery = js.native
  /**
       * Insert content, specified by the parameter, before each element in the set of matched elements.
       *
       * param content1 HTML string, DOM element, array of elements, or jQuery object to insert before each element in the set of matched elements.
       * param content2 One or more additional DOM elements, arrays of elements, HTML strings, or jQuery objects to insert before each element in the set of matched elements.
       */
  def before(content1: stdLib.Text, content2: js.Any*): ChaiJQuery = js.native
  /**
       * Insert content, specified by the parameter, before each element in the set of matched elements.
       *
       * param func A function that returns an HTML string, DOM element(s), or jQuery object to insert before each element in the set of matched elements. Receives the index position of the element in the set as an argument. Within the function, this refers to the current element in the set.
       */
  def before(
    func: js.Function2[
      /* index */ scala.Double, 
      /* html */ java.lang.String, 
      java.lang.String | stdLib.Element | jqueryLib.JQuery[stdLib.HTMLElement]
    ]
  ): ChaiJQuery = js.native
  /**
       * Attach a handler to an event for the elements.
       *
       * @param eventType A string containing one or more DOM event types, such as "click" or "submit," or custom event names.
       * @param eventData An object containing data that will be passed to the event handler.
       * @param handler A function to execute each time the event is triggered.
       */
  def bind(
    eventType: java.lang.String,
    eventData: js.Any,
    handler: js.Function1[/* eventObject */ jqueryLib.JQueryEventObject, _]
  ): ChaiJQuery = js.native
  /**
       * Attach a handler to an event for the elements.
       *
       * @param eventType A string containing one or more DOM event types, such as "click" or "submit," or custom event names.
       * @param eventData An object containing data that will be passed to the event handler.
       * @param preventBubble Setting the third argument to false will attach a function that prevents the default action from occurring and stops the event from bubbling. The default is true.
       */
  def bind(eventType: java.lang.String, eventData: js.Any, preventBubble: scala.Boolean): ChaiJQuery = js.native
  /**
       * Attach a handler to an event for the elements.
       *
       * @param eventType A string containing one or more DOM event types, such as "click" or "submit," or custom event names.
       * @param handler A function to execute each time the event is triggered.
       */
  def bind(
    eventType: java.lang.String,
    handler: js.Function1[/* eventObject */ jqueryLib.JQueryEventObject, _]
  ): ChaiJQuery = js.native
  /**
       * Attach a handler to an event for the elements.
       *
       * @param eventType A string containing one or more DOM event types, such as "click" or "submit," or custom event names.
       * @param preventBubble Setting the third argument to false will attach a function that prevents the default action from occurring and stops the event from bubbling. The default is true.
       */
  def bind(eventType: java.lang.String, preventBubble: scala.Boolean): ChaiJQuery = js.native
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
  /**
       * Bind an event handler to the "blur" JavaScript event
       *
       * @param eventData An object containing data that will be passed to the event handler.
       * @param handler A function to execute each time the event is triggered.
       */
  def blur(eventData: js.Any): ChaiJQuery = js.native
  /**
       * Bind an event handler to the "blur" JavaScript event
       *
       * @param eventData An object containing data that will be passed to the event handler.
       * @param handler A function to execute each time the event is triggered.
       */
  def blur(eventData: js.Any, handler: js.Function1[/* eventObject */ jqueryLib.JQueryEventObject, _]): ChaiJQuery = js.native
  /**
       * Bind an event handler to the "blur" JavaScript event
       *
       * @param handler A function to execute each time the event is triggered.
       */
  def blur(handler: js.Function1[/* eventObject */ jqueryLib.JQueryEventObject, _]): ChaiJQuery = js.native
  /**
       * Trigger the "change" event on an element.
       */
  def change(): ChaiJQuery = js.native
  /**
       * Bind an event handler to the "change" JavaScript event
       *
       * @param eventData An object containing data that will be passed to the event handler.
       * @param handler A function to execute each time the event is triggered.
       */
  def change(eventData: js.Any): ChaiJQuery = js.native
  /**
       * Bind an event handler to the "change" JavaScript event
       *
       * @param eventData An object containing data that will be passed to the event handler.
       * @param handler A function to execute each time the event is triggered.
       */
  def change(eventData: js.Any, handler: js.Function1[/* eventObject */ jqueryLib.JQueryEventObject, _]): ChaiJQuery = js.native
  /**
       * Bind an event handler to the "change" JavaScript event
       *
       * @param handler A function to execute each time the event is triggered.
       */
  def change(handler: js.Function1[/* eventObject */ jqueryLib.JQueryEventObject, _]): ChaiJQuery = js.native
  /**
       * Get the children of each element in the set of matched elements, optionally filtered by a selector.
       *
       * @param selector A string containing a selector expression to match elements against.
       */
  def children(): ChaiJQuery = js.native
  /**
       * Get the children of each element in the set of matched elements, optionally filtered by a selector.
       *
       * @param selector A string containing a selector expression to match elements against.
       */
  def children(selector: java.lang.String): ChaiJQuery = js.native
  /**
       * Remove from the queue all items that have not yet been run.
       *
       * @param queueName A string containing the name of the queue. Defaults to fx, the standard effects queue.
       */
  def clearQueue(): ChaiJQuery = js.native
  /**
       * Remove from the queue all items that have not yet been run.
       *
       * @param queueName A string containing the name of the queue. Defaults to fx, the standard effects queue.
       */
  def clearQueue(queueName: java.lang.String): ChaiJQuery = js.native
  /**
       * Trigger the "click" event on an element.
       */
  def click(): ChaiJQuery = js.native
  /**
       * Bind an event handler to the "click" JavaScript event
       *
       * @param eventData An object containing data that will be passed to the event handler.
       * @param handler A function to execute each time the event is triggered.
       */
  def click(eventData: js.Any): ChaiJQuery = js.native
  /**
       * Bind an event handler to the "click" JavaScript event
       *
       * @param eventData An object containing data that will be passed to the event handler.
       * @param handler A function to execute each time the event is triggered.
       */
  def click(eventData: js.Any, handler: js.Function1[/* eventObject */ jqueryLib.JQueryEventObject, _]): ChaiJQuery = js.native
  /**
       * Bind an event handler to the "click" JavaScript event
       *
       * @param eventData An object containing data that will be passed to the event handler.
       */
  def click(handler: js.Function1[/* eventObject */ jqueryLib.JQueryEventObject, _]): ChaiJQuery = js.native
  /**
       * Create a deep copy of the set of matched elements.
       *
       * param withDataAndEvents A Boolean indicating whether event handlers and data should be copied along with the elements. The default value is false.
       * param deepWithDataAndEvents A Boolean indicating whether event handlers and data for all children of the cloned element should be copied. By default its value matches the first argument's value (which defaults to false).
       */
  def clone(withDataAndEvents: scala.Boolean): ChaiJQuery = js.native
  /**
       * Create a deep copy of the set of matched elements.
       *
       * param withDataAndEvents A Boolean indicating whether event handlers and data should be copied along with the elements. The default value is false.
       * param deepWithDataAndEvents A Boolean indicating whether event handlers and data for all children of the cloned element should be copied. By default its value matches the first argument's value (which defaults to false).
       */
  def clone(withDataAndEvents: scala.Boolean, deepWithDataAndEvents: scala.Boolean): ChaiJQuery = js.native
  /**
       * For each element in the set, get the first element that matches the selector by testing the element itself and traversing up through its ancestors in the DOM tree.
       *
       * @param element An element to match elements against.
       */
  def closest(element: stdLib.Element): ChaiJQuery = js.native
  /**
       * For each element in the set, get the first element that matches the selector by testing the element itself and traversing up through its ancestors in the DOM tree.
       *
       * @param obj A jQuery object to match elements against.
       */
  def closest(obj: jqueryLib.JQuery[stdLib.HTMLElement]): ChaiJQuery = js.native
  /**
       * For each element in the set, get the first element that matches the selector by testing the element itself and traversing up through its ancestors in the DOM tree.
       *
       * @param selector A string containing a selector expression to match elements against.
       */
  def closest(selector: java.lang.String): ChaiJQuery = js.native
  /**
       * For each element in the set, get the first element that matches the selector by testing the element itself and traversing up through its ancestors in the DOM tree.
       *
       * @param selector A string containing a selector expression to match elements against.
       * @param context A DOM element within which a matching element may be found. If no context is passed in then the context of the jQuery set will be used instead.
       */
  def closest(selector: java.lang.String, context: stdLib.Element): ChaiJQuery = js.native
  /**
       * Get an array of all the elements and selectors matched against the current element up through the DOM tree.
       *
       * @param selectors An array or string containing a selector expression to match elements against (can also be a jQuery object).
       * @param context A DOM element within which a matching element may be found. If no context is passed in then the context of the jQuery set will be used instead.
       */
  def closest(selectors: js.Any): js.Array[_] = js.native
  /**
       * Get an array of all the elements and selectors matched against the current element up through the DOM tree.
       *
       * @param selectors An array or string containing a selector expression to match elements against (can also be a jQuery object).
       * @param context A DOM element within which a matching element may be found. If no context is passed in then the context of the jQuery set will be used instead.
       */
  def closest(selectors: js.Any, context: stdLib.Element): js.Array[_] = js.native
  /**
       * Get the children of each element in the set of matched elements, including text and comment nodes.
       */
  def contents(): ChaiJQuery = js.native
  /**
       * Set one or more CSS properties for the set of matched elements.
       *
       * @param properties An object of property-value pairs to set.
       */
  def css(properties: js.Object): ChaiJQuery = js.native
  /**
       * Get the value of style properties for the first element in the set of matched elements.
       *
       * @param propertyName A CSS property.
       */
  def css(propertyName: java.lang.String): java.lang.String = js.native
  /**
       * Set one or more CSS properties for the set of matched elements.
       *
       * @param propertyName A CSS property name.
       * @param value A value to set for the property.
       */
  def css(propertyName: java.lang.String, value: java.lang.String): ChaiJQuery = js.native
  /**
       * Set one or more CSS properties for the set of matched elements.
       *
       * @param propertyName A CSS property name.
       * @param value A function returning the value to set. this is the current element. Receives the index position of the element in the set and the old value as arguments.
       */
  def css(
    propertyName: java.lang.String,
    value: js.Function2[
      /* index */ scala.Double, 
      /* value */ java.lang.String, 
      java.lang.String | scala.Double
    ]
  ): ChaiJQuery = js.native
  /**
       * Set one or more CSS properties for the set of matched elements.
       *
       * @param propertyName A CSS property name.
       * @param value A value to set for the property.
       */
  def css(propertyName: java.lang.String, value: scala.Double): ChaiJQuery = js.native
  /**
       * Return the value at the named data store for the first element in the jQuery collection, as set by data(name, value) or by an HTML5 data-* attribute.
       */
  def data(): js.Any = js.native
  /**
       * Return the value at the named data store for the first element in the jQuery collection, as set by data(name, value) or by an HTML5 data-* attribute.
       *
       * @param key Name of the data stored.
       */
  def data(key: java.lang.String): js.Any = js.native
  /**
       * Store arbitrary data associated with the matched elements.
       *
       * @param key A string naming the piece of data to set.
       * @param value The new data value; it can be any Javascript type including Array or Object.
       */
  def data(key: java.lang.String, value: js.Any): ChaiJQuery = js.native
  /**
       * Store arbitrary data associated with the matched elements.
       *
       * @param obj An object of key-value pairs of data to update.
       */
  def data(obj: org.scalablytyped.runtime.StringDictionary[js.Any]): ChaiJQuery = js.native
  /**
       * Trigger the "dblclick" event on an element.
       */
  def dblclick(): ChaiJQuery = js.native
  /**
       * Bind an event handler to the "dblclick" JavaScript event
       *
       * @param eventData An object containing data that will be passed to the event handler.
       * @param handler A function to execute each time the event is triggered.
       */
  def dblclick(eventData: js.Any): ChaiJQuery = js.native
  /**
       * Bind an event handler to the "dblclick" JavaScript event
       *
       * @param eventData An object containing data that will be passed to the event handler.
       * @param handler A function to execute each time the event is triggered.
       */
  def dblclick(eventData: js.Any, handler: js.Function1[/* eventObject */ jqueryLib.JQueryEventObject, _]): ChaiJQuery = js.native
  /**
       * Bind an event handler to the "dblclick" JavaScript event
       *
       * @param handler A function to execute each time the event is triggered.
       */
  def dblclick(handler: js.Function1[/* eventObject */ jqueryLib.JQueryEventObject, _]): ChaiJQuery = js.native
  /**
       * Set a timer to delay execution of subsequent items in the queue.
       *
       * @param duration An integer indicating the number of milliseconds to delay execution of the next item in the queue.
       * @param queueName A string containing the name of the queue. Defaults to fx, the standard effects queue.
       */
  def delay(duration: scala.Double): ChaiJQuery = js.native
  /**
       * Set a timer to delay execution of subsequent items in the queue.
       *
       * @param duration An integer indicating the number of milliseconds to delay execution of the next item in the queue.
       * @param queueName A string containing the name of the queue. Defaults to fx, the standard effects queue.
       */
  def delay(duration: scala.Double, queueName: java.lang.String): ChaiJQuery = js.native
  def delegate(
    selector: js.Any,
    eventType: java.lang.String,
    eventData: js.Any,
    handler: js.Function1[/* eventObject */ jqueryLib.JQueryEventObject, _]
  ): ChaiJQuery = js.native
  def delegate(
    selector: js.Any,
    eventType: java.lang.String,
    handler: js.Function1[/* eventObject */ jqueryLib.JQueryEventObject, _]
  ): ChaiJQuery = js.native
  /**
       * Execute the next function on the queue for the matched elements.
       *
       * @param queueName A string containing the name of the queue. Defaults to fx, the standard effects queue.
       */
  def dequeue(): ChaiJQuery = js.native
  /**
       * Execute the next function on the queue for the matched elements.
       *
       * @param queueName A string containing the name of the queue. Defaults to fx, the standard effects queue.
       */
  def dequeue(queueName: java.lang.String): ChaiJQuery = js.native
  /**
       * Remove the set of matched elements from the DOM.
       *
       * param selector A selector expression that filters the set of matched elements to be removed.
       */
  def detach(): ChaiJQuery = js.native
  /**
       * Remove the set of matched elements from the DOM.
       *
       * param selector A selector expression that filters the set of matched elements to be removed.
       */
  def detach(selector: java.lang.String): ChaiJQuery = js.native
  /**
       * Iterate over a jQuery object, executing a function for each matched element.
       *
       * @param func A function to execute for each matched element.
       */
  def each(func: js.Function2[/* index */ scala.Double, /* elem */ stdLib.Element, _]): ChaiJQuery = js.native
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
  def eq(index: scala.Double): ChaiJQuery = js.native
  /**
       * Bind an event handler to the "error" JavaScript event. (DEPRECATED from v1.8)
       *
       * @param eventData A plain object of data that will be passed to the event handler.
       * @param handler A function to execute when the event is triggered.
       */
  def error(eventData: js.Any, handler: js.Function1[/* eventObject */ jqueryLib.JQueryEventObject, _]): ChaiJQuery = js.native
  /**
       * Bind an event handler to the "error" JavaScript event. (DEPRECATED from v1.8)
       *
       * @param handler A function to execute when the event is triggered.
       */
  def error(handler: js.Function1[/* eventObject */ jqueryLib.JQueryEventObject, _]): ChaiJQuery = js.native
  /**
       * Display the matched elements by fading them to opaque.
       *
       * @param duration A string or number determining how long the animation will run.
       * @param complete A function to call once the animation is complete.
       */
  def fadeIn(): ChaiJQuery = js.native
  /**
       * Display the matched elements by fading them to opaque.
       *
       * @param duration A string or number determining how long the animation will run.
       * @param complete A function to call once the animation is complete.
       */
  def fadeIn(duration: java.lang.String): ChaiJQuery = js.native
  /**
       * Display the matched elements by fading them to opaque.
       *
       * @param duration A string or number determining how long the animation will run.
       * @param complete A function to call once the animation is complete.
       */
  def fadeIn(duration: java.lang.String, complete: js.Function): ChaiJQuery = js.native
  /**
       * Display the matched elements by fading them to opaque.
       *
       * @param duration A string or number determining how long the animation will run.
       * @param easing A string indicating which easing function to use for the transition.
       * @param complete A function to call once the animation is complete.
       */
  def fadeIn(duration: java.lang.String, easing: java.lang.String): ChaiJQuery = js.native
  /**
       * Display the matched elements by fading them to opaque.
       *
       * @param duration A string or number determining how long the animation will run.
       * @param easing A string indicating which easing function to use for the transition.
       * @param complete A function to call once the animation is complete.
       */
  def fadeIn(duration: java.lang.String, easing: java.lang.String, complete: js.Function): ChaiJQuery = js.native
  /**
       * Display the matched elements by fading them to opaque.
       *
       * @param duration A string or number determining how long the animation will run.
       * @param complete A function to call once the animation is complete.
       */
  def fadeIn(duration: scala.Double): ChaiJQuery = js.native
  /**
       * Display the matched elements by fading them to opaque.
       *
       * @param duration A string or number determining how long the animation will run.
       * @param complete A function to call once the animation is complete.
       */
  def fadeIn(duration: scala.Double, complete: js.Function): ChaiJQuery = js.native
  /**
       * Display the matched elements by fading them to opaque.
       *
       * @param duration A string or number determining how long the animation will run.
       * @param easing A string indicating which easing function to use for the transition.
       * @param complete A function to call once the animation is complete.
       */
  def fadeIn(duration: scala.Double, easing: java.lang.String): ChaiJQuery = js.native
  /**
       * Display the matched elements by fading them to opaque.
       *
       * @param duration A string or number determining how long the animation will run.
       * @param easing A string indicating which easing function to use for the transition.
       * @param complete A function to call once the animation is complete.
       */
  def fadeIn(duration: scala.Double, easing: java.lang.String, complete: js.Function): ChaiJQuery = js.native
  /**
       * Display the matched elements by fading them to opaque.
       *
       * @param options A map of additional options to pass to the method.
       */
  def fadeIn(options: jqueryLib.JQueryAnimationOptions): ChaiJQuery = js.native
  /**
       * Hide the matched elements by fading them to transparent.
       *
       * @param duration A string or number determining how long the animation will run.
       * @param complete A function to call once the animation is complete.
       */
  def fadeOut(): ChaiJQuery = js.native
  /**
       * Hide the matched elements by fading them to transparent.
       *
       * @param duration A string or number determining how long the animation will run.
       * @param complete A function to call once the animation is complete.
       */
  def fadeOut(duration: java.lang.String): ChaiJQuery = js.native
  /**
       * Hide the matched elements by fading them to transparent.
       *
       * @param duration A string or number determining how long the animation will run.
       * @param complete A function to call once the animation is complete.
       */
  def fadeOut(duration: java.lang.String, complete: js.Function): ChaiJQuery = js.native
  /**
       * Hide the matched elements by fading them to transparent.
       *
       * @param duration A string or number determining how long the animation will run.
       * @param easing A string indicating which easing function to use for the transition.
       * @param complete A function to call once the animation is complete.
       */
  def fadeOut(duration: java.lang.String, easing: java.lang.String): ChaiJQuery = js.native
  /**
       * Hide the matched elements by fading them to transparent.
       *
       * @param duration A string or number determining how long the animation will run.
       * @param easing A string indicating which easing function to use for the transition.
       * @param complete A function to call once the animation is complete.
       */
  def fadeOut(duration: java.lang.String, easing: java.lang.String, complete: js.Function): ChaiJQuery = js.native
  /**
       * Hide the matched elements by fading them to transparent.
       *
       * @param duration A string or number determining how long the animation will run.
       * @param complete A function to call once the animation is complete.
       */
  def fadeOut(duration: scala.Double): ChaiJQuery = js.native
  /**
       * Hide the matched elements by fading them to transparent.
       *
       * @param duration A string or number determining how long the animation will run.
       * @param complete A function to call once the animation is complete.
       */
  def fadeOut(duration: scala.Double, complete: js.Function): ChaiJQuery = js.native
  /**
       * Hide the matched elements by fading them to transparent.
       *
       * @param duration A string or number determining how long the animation will run.
       * @param easing A string indicating which easing function to use for the transition.
       * @param complete A function to call once the animation is complete.
       */
  def fadeOut(duration: scala.Double, easing: java.lang.String): ChaiJQuery = js.native
  /**
       * Hide the matched elements by fading them to transparent.
       *
       * @param duration A string or number determining how long the animation will run.
       * @param easing A string indicating which easing function to use for the transition.
       * @param complete A function to call once the animation is complete.
       */
  def fadeOut(duration: scala.Double, easing: java.lang.String, complete: js.Function): ChaiJQuery = js.native
  /**
       * Hide the matched elements by fading them to transparent.
       *
       * @param options A map of additional options to pass to the method.
       */
  def fadeOut(options: jqueryLib.JQueryAnimationOptions): ChaiJQuery = js.native
  /**
       * Adjust the opacity of the matched elements.
       *
       * @param duration A string or number determining how long the animation will run.
       * @param opacity A number between 0 and 1 denoting the target opacity.
       * @param complete A function to call once the animation is complete.
       */
  def fadeTo(duration: java.lang.String, opacity: scala.Double): ChaiJQuery = js.native
  /**
       * Adjust the opacity of the matched elements.
       *
       * @param duration A string or number determining how long the animation will run.
       * @param opacity A number between 0 and 1 denoting the target opacity.
       * @param complete A function to call once the animation is complete.
       */
  def fadeTo(duration: java.lang.String, opacity: scala.Double, complete: js.Function): ChaiJQuery = js.native
  /**
       * Adjust the opacity of the matched elements.
       *
       * @param duration A string or number determining how long the animation will run.
       * @param opacity A number between 0 and 1 denoting the target opacity.
       * @param easing A string indicating which easing function to use for the transition.
       * @param complete A function to call once the animation is complete.
       */
  def fadeTo(duration: java.lang.String, opacity: scala.Double, easing: java.lang.String): ChaiJQuery = js.native
  /**
       * Adjust the opacity of the matched elements.
       *
       * @param duration A string or number determining how long the animation will run.
       * @param opacity A number between 0 and 1 denoting the target opacity.
       * @param easing A string indicating which easing function to use for the transition.
       * @param complete A function to call once the animation is complete.
       */
  def fadeTo(duration: java.lang.String, opacity: scala.Double, easing: java.lang.String, complete: js.Function): ChaiJQuery = js.native
  /**
       * Adjust the opacity of the matched elements.
       *
       * @param duration A string or number determining how long the animation will run.
       * @param opacity A number between 0 and 1 denoting the target opacity.
       * @param complete A function to call once the animation is complete.
       */
  def fadeTo(duration: scala.Double, opacity: scala.Double): ChaiJQuery = js.native
  /**
       * Adjust the opacity of the matched elements.
       *
       * @param duration A string or number determining how long the animation will run.
       * @param opacity A number between 0 and 1 denoting the target opacity.
       * @param complete A function to call once the animation is complete.
       */
  def fadeTo(duration: scala.Double, opacity: scala.Double, complete: js.Function): ChaiJQuery = js.native
  /**
       * Adjust the opacity of the matched elements.
       *
       * @param duration A string or number determining how long the animation will run.
       * @param opacity A number between 0 and 1 denoting the target opacity.
       * @param easing A string indicating which easing function to use for the transition.
       * @param complete A function to call once the animation is complete.
       */
  def fadeTo(duration: scala.Double, opacity: scala.Double, easing: java.lang.String): ChaiJQuery = js.native
  /**
       * Adjust the opacity of the matched elements.
       *
       * @param duration A string or number determining how long the animation will run.
       * @param opacity A number between 0 and 1 denoting the target opacity.
       * @param easing A string indicating which easing function to use for the transition.
       * @param complete A function to call once the animation is complete.
       */
  def fadeTo(duration: scala.Double, opacity: scala.Double, easing: java.lang.String, complete: js.Function): ChaiJQuery = js.native
  /**
       * Display or hide the matched elements by animating their opacity.
       *
       * @param duration A string or number determining how long the animation will run.
       * @param complete A function to call once the animation is complete.
       */
  def fadeToggle(): ChaiJQuery = js.native
  /**
       * Display or hide the matched elements by animating their opacity.
       *
       * @param duration A string or number determining how long the animation will run.
       * @param complete A function to call once the animation is complete.
       */
  def fadeToggle(duration: java.lang.String): ChaiJQuery = js.native
  /**
       * Display or hide the matched elements by animating their opacity.
       *
       * @param duration A string or number determining how long the animation will run.
       * @param complete A function to call once the animation is complete.
       */
  def fadeToggle(duration: java.lang.String, complete: js.Function): ChaiJQuery = js.native
  /**
       * Display or hide the matched elements by animating their opacity.
       *
       * @param duration A string or number determining how long the animation will run.
       * @param easing A string indicating which easing function to use for the transition.
       * @param complete A function to call once the animation is complete.
       */
  def fadeToggle(duration: java.lang.String, easing: java.lang.String): ChaiJQuery = js.native
  /**
       * Display or hide the matched elements by animating their opacity.
       *
       * @param duration A string or number determining how long the animation will run.
       * @param easing A string indicating which easing function to use for the transition.
       * @param complete A function to call once the animation is complete.
       */
  def fadeToggle(duration: java.lang.String, easing: java.lang.String, complete: js.Function): ChaiJQuery = js.native
  /**
       * Display or hide the matched elements by animating their opacity.
       *
       * @param duration A string or number determining how long the animation will run.
       * @param complete A function to call once the animation is complete.
       */
  def fadeToggle(duration: scala.Double): ChaiJQuery = js.native
  /**
       * Display or hide the matched elements by animating their opacity.
       *
       * @param duration A string or number determining how long the animation will run.
       * @param complete A function to call once the animation is complete.
       */
  def fadeToggle(duration: scala.Double, complete: js.Function): ChaiJQuery = js.native
  /**
       * Display or hide the matched elements by animating their opacity.
       *
       * @param duration A string or number determining how long the animation will run.
       * @param easing A string indicating which easing function to use for the transition.
       * @param complete A function to call once the animation is complete.
       */
  def fadeToggle(duration: scala.Double, easing: java.lang.String): ChaiJQuery = js.native
  /**
       * Display or hide the matched elements by animating their opacity.
       *
       * @param duration A string or number determining how long the animation will run.
       * @param easing A string indicating which easing function to use for the transition.
       * @param complete A function to call once the animation is complete.
       */
  def fadeToggle(duration: scala.Double, easing: java.lang.String, complete: js.Function): ChaiJQuery = js.native
  /**
       * Display or hide the matched elements by animating their opacity.
       *
       * @param options A map of additional options to pass to the method.
       */
  def fadeToggle(options: jqueryLib.JQueryAnimationOptions): ChaiJQuery = js.native
  /**
       * Reduce the set of matched elements to those that match the selector or pass the function's test.
       *
       * @param element An element to match the current set of elements against.
       */
  def filter(element: stdLib.Element): ChaiJQuery = js.native
  /**
       * Reduce the set of matched elements to those that match the selector or pass the function's test.
       *
       * @param func A function used as a test for each element in the set. this is the current DOM element.
       */
  def filter(func: js.Function2[/* index */ scala.Double, /* element */ stdLib.Element, _]): ChaiJQuery = js.native
  /**
       * Reduce the set of matched elements to those that match the selector or pass the function's test.
       *
       * @param obj An existing jQuery object to match the current set of elements against.
       */
  def filter(obj: jqueryLib.JQuery[stdLib.HTMLElement]): ChaiJQuery = js.native
  /**
       * Reduce the set of matched elements to those that match the selector or pass the function's test.
       *
       * @param selector A string containing a selector expression to match the current set of elements against.
       */
  def filter(selector: java.lang.String): ChaiJQuery = js.native
  /**
       * Get the descendants of each element in the current set of matched elements, filtered by a selector, jQuery object, or element.
       *
       * @param element An element to match elements against.
       */
  def find(element: stdLib.Element): ChaiJQuery = js.native
  /**
       * Get the descendants of each element in the current set of matched elements, filtered by a selector, jQuery object, or element.
       *
       * @param obj A jQuery object to match elements against.
       */
  def find(obj: jqueryLib.JQuery[stdLib.HTMLElement]): ChaiJQuery = js.native
  /**
       * Get the descendants of each element in the current set of matched elements, filtered by a selector, jQuery object, or element.
       *
       * @param selector A string containing a selector expression to match elements against.
       */
  def find(selector: java.lang.String): ChaiJQuery = js.native
  /**
       * Stop the currently-running animation, remove all queued animations, and complete all animations for the matched elements.
       *
       * @param queue The name of the queue in which to stop animations.
       */
  def finish(): ChaiJQuery = js.native
  /**
       * Stop the currently-running animation, remove all queued animations, and complete all animations for the matched elements.
       *
       * @param queue The name of the queue in which to stop animations.
       */
  def finish(queue: java.lang.String): ChaiJQuery = js.native
  /**
       * Reduce the set of matched elements to the first in the set.
       */
  def first(): ChaiJQuery = js.native
  /**
       * Trigger the "focus" event on an element.
       */
  def focus(): ChaiJQuery = js.native
  /**
       * Bind an event handler to the "focus" JavaScript event
       *
       * @param eventData An object containing data that will be passed to the event handler.
       * @param handler A function to execute each time the event is triggered.
       */
  def focus(eventData: js.Any): ChaiJQuery = js.native
  /**
       * Bind an event handler to the "focus" JavaScript event
       *
       * @param eventData An object containing data that will be passed to the event handler.
       * @param handler A function to execute each time the event is triggered.
       */
  def focus(eventData: js.Any, handler: js.Function1[/* eventObject */ jqueryLib.JQueryEventObject, _]): ChaiJQuery = js.native
  /**
       * Bind an event handler to the "focus" JavaScript event
       *
       * @param handler A function to execute each time the event is triggered.
       */
  def focus(handler: js.Function1[/* eventObject */ jqueryLib.JQueryEventObject, _]): ChaiJQuery = js.native
  /**
       * Bind an event handler to the "focusin" JavaScript event
       *
       * @param eventData An object containing data that will be passed to the event handler.
       * @param handler A function to execute each time the event is triggered.
       */
  def focusin(eventData: js.Object, handler: js.Function1[/* eventObject */ jqueryLib.JQueryEventObject, _]): ChaiJQuery = js.native
  /**
       * Bind an event handler to the "focusin" JavaScript event
       *
       * @param handler A function to execute each time the event is triggered.
       */
  def focusin(handler: js.Function1[/* eventObject */ jqueryLib.JQueryEventObject, _]): ChaiJQuery = js.native
  /**
       * Bind an event handler to the "focusout" JavaScript event
       *
       * @param eventData An object containing data that will be passed to the event handler.
       * @param handler A function to execute each time the event is triggered.
       */
  def focusout(eventData: js.Object, handler: js.Function1[/* eventObject */ jqueryLib.JQueryEventObject, _]): ChaiJQuery = js.native
  /**
       * Bind an event handler to the "focusout" JavaScript event
       *
       * @param handler A function to execute each time the event is triggered.
       */
  def focusout(handler: js.Function1[/* eventObject */ jqueryLib.JQueryEventObject, _]): ChaiJQuery = js.native
  /**
       * Retrieve the elements matched by the jQuery object.
       */
  def get(): js.Array[_] = js.native
  /**
       * Retrieve one of the elements matched by the jQuery object.
       *
       * @param index A zero-based integer indicating which element to retrieve.
       */
  def get(index: scala.Double): stdLib.HTMLElement = js.native
  /**
       * Reduce the set of matched elements to those that have a descendant that matches the selector or DOM element.
       *
       * @param contained A DOM element to match elements against.
       */
  def has(contained: stdLib.Element): ChaiJQuery = js.native
  /**
       * Reduce the set of matched elements to those that have a descendant that matches the selector or DOM element.
       *
       * @param selector A string containing a selector expression to match elements against.
       */
  def has(selector: java.lang.String): ChaiJQuery = js.native
  /**
       * Determine whether any of the matched elements are assigned the given class.
       *
       * @param className The class name to search for.
       */
  def hasClass(className: java.lang.String): scala.Boolean = js.native
  /**
       * Get the current computed height for the first element in the set of matched elements.
       */
  def height(): scala.Double = js.native
  /**
       * Set the CSS height of every matched element.
       *
       * @param func A function returning the height to set. Receives the index position of the element in the set and the old height as arguments. Within the function, this refers to the current element in the set.
       */
  def height(
    func: js.Function2[/* index */ scala.Double, /* height */ scala.Double, scala.Double | java.lang.String]
  ): ChaiJQuery = js.native
  /**
       * Set the CSS height of every matched element.
       *
       * @param value An integer representing the number of pixels, or an integer with an optional unit of measure appended (as a string).
       */
  def height(value: java.lang.String): ChaiJQuery = js.native
  /**
       * Set the CSS height of every matched element.
       *
       * @param value An integer representing the number of pixels, or an integer with an optional unit of measure appended (as a string).
       */
  def height(value: scala.Double): ChaiJQuery = js.native
  /**
       * Hide the matched elements.
       *
       * @param duration A string or number determining how long the animation will run.
       * @param complete A function to call once the animation is complete.
       */
  def hide(): ChaiJQuery = js.native
  /**
       * Hide the matched elements.
       *
       * @param duration A string or number determining how long the animation will run.
       * @param complete A function to call once the animation is complete.
       */
  def hide(duration: java.lang.String): ChaiJQuery = js.native
  /**
       * Hide the matched elements.
       *
       * @param duration A string or number determining how long the animation will run.
       * @param complete A function to call once the animation is complete.
       */
  def hide(duration: java.lang.String, complete: js.Function): ChaiJQuery = js.native
  /**
       * Hide the matched elements.
       *
       * @param duration A string or number determining how long the animation will run.
       * @param easing A string indicating which easing function to use for the transition.
       * @param complete A function to call once the animation is complete.
       */
  def hide(duration: java.lang.String, easing: java.lang.String): ChaiJQuery = js.native
  /**
       * Hide the matched elements.
       *
       * @param duration A string or number determining how long the animation will run.
       * @param easing A string indicating which easing function to use for the transition.
       * @param complete A function to call once the animation is complete.
       */
  def hide(duration: java.lang.String, easing: java.lang.String, complete: js.Function): ChaiJQuery = js.native
  /**
       * Hide the matched elements.
       *
       * @param duration A string or number determining how long the animation will run.
       * @param complete A function to call once the animation is complete.
       */
  def hide(duration: scala.Double): ChaiJQuery = js.native
  /**
       * Hide the matched elements.
       *
       * @param duration A string or number determining how long the animation will run.
       * @param complete A function to call once the animation is complete.
       */
  def hide(duration: scala.Double, complete: js.Function): ChaiJQuery = js.native
  /**
       * Hide the matched elements.
       *
       * @param duration A string or number determining how long the animation will run.
       * @param easing A string indicating which easing function to use for the transition.
       * @param complete A function to call once the animation is complete.
       */
  def hide(duration: scala.Double, easing: java.lang.String): ChaiJQuery = js.native
  /**
       * Hide the matched elements.
       *
       * @param duration A string or number determining how long the animation will run.
       * @param easing A string indicating which easing function to use for the transition.
       * @param complete A function to call once the animation is complete.
       */
  def hide(duration: scala.Double, easing: java.lang.String, complete: js.Function): ChaiJQuery = js.native
  /**
       * Hide the matched elements.
       *
       * @param options A map of additional options to pass to the method.
       */
  def hide(options: jqueryLib.JQueryAnimationOptions): ChaiJQuery = js.native
  /**
       * Bind a single handler to the matched elements, to be executed when the mouse pointer enters or leaves the elements.
       *
       * @param handlerInOut A function to execute when the mouse pointer enters or leaves the element.
       */
  def hover(handlerInOut: js.Function1[/* eventObject */ jqueryLib.JQueryEventObject, _]): ChaiJQuery = js.native
  /**
       * Bind two handlers to the matched elements, to be executed when the mouse pointer enters and leaves the elements.
       *
       * @param handlerIn A function to execute when the mouse pointer enters the element.
       * @param handlerOut A function to execute when the mouse pointer leaves the element.
       */
  def hover(
    handlerIn: js.Function1[/* eventObject */ jqueryLib.JQueryEventObject, _],
    handlerOut: js.Function1[/* eventObject */ jqueryLib.JQueryEventObject, _]
  ): ChaiJQuery = js.native
  /**
       * Get the HTML contents of the first element in the set of matched elements.
       */
  def html(): java.lang.String = js.native
  /**
       * Set the HTML contents of each element in the set of matched elements.
       *
       * @param func A function returning the HTML content to set. Receives the index position of the element in the set and the old HTML value as arguments. jQuery empties the element before calling the function; use the oldhtml argument to reference the previous content. Within the function, this refers to the current element in the set.
       */
  def html(func: js.Function2[/* index */ scala.Double, /* oldhtml */ java.lang.String, java.lang.String]): ChaiJQuery = js.native
  /**
       * Set the HTML contents of each element in the set of matched elements.
       *
       * @param htmlString A string of HTML to set as the content of each matched element.
       */
  def html(htmlString: java.lang.String): ChaiJQuery = js.native
  /**
       * Search for a given element from among the matched elements.
       */
  def index(): scala.Double = js.native
  /**
       * Search for a given element from among the matched elements.
       *
       * @param selector A selector representing a jQuery collection in which to look for an element.
       */
  def index(selector: java.lang.String): scala.Double = js.native
  /**
       * Search for a given element from among the matched elements.
       *
       * @param selector A selector representing a jQuery collection in which to look for an element.
       */
  def index(selector: jqueryLib.JQuery[stdLib.HTMLElement]): scala.Double = js.native
  /**
       * Search for a given element from among the matched elements.
       *
       * @param selector A selector representing a jQuery collection in which to look for an element.
       */
  def index(selector: stdLib.Element): scala.Double = js.native
  /**
       * Get the current computed height for the first element in the set of matched elements, including padding but not border.
       */
  def innerHeight(): scala.Double = js.native
  /**
       * Sets the inner height on elements in the set of matched elements, including padding but not border.
       *
       * @param value An integer representing the number of pixels, or an integer along with an optional unit of measure appended (as a string).
       */
  def innerHeight(height: java.lang.String): ChaiJQuery = js.native
  /**
       * Sets the inner height on elements in the set of matched elements, including padding but not border.
       *
       * @param value An integer representing the number of pixels, or an integer along with an optional unit of measure appended (as a string).
       */
  def innerHeight(height: scala.Double): ChaiJQuery = js.native
  /**
       * Get the current computed width for the first element in the set of matched elements, including padding but not border.
       */
  def innerWidth(): scala.Double = js.native
  /**
       * Sets the inner width on elements in the set of matched elements, including padding but not border.
       *
       * @param value An integer representing the number of pixels, or an integer along with an optional unit of measure appended (as a string).
       */
  def innerWidth(width: java.lang.String): ChaiJQuery = js.native
  /**
       * Sets the inner width on elements in the set of matched elements, including padding but not border.
       *
       * @param value An integer representing the number of pixels, or an integer along with an optional unit of measure appended (as a string).
       */
  def innerWidth(width: scala.Double): ChaiJQuery = js.native
  /**
       * Insert every element in the set of matched elements after the target.
       *
       * param target A selector, element, array of elements, HTML string, or jQuery object; the matched set of elements will be inserted after the element(s) specified by this parameter.
       */
  def insertAfter(target: java.lang.String): ChaiJQuery = js.native
  /**
       * Insert every element in the set of matched elements after the target.
       *
       * param target A selector, element, array of elements, HTML string, or jQuery object; the matched set of elements will be inserted after the element(s) specified by this parameter.
       */
  def insertAfter(target: jqueryLib.JQuery[stdLib.HTMLElement]): ChaiJQuery = js.native
  /**
       * Insert every element in the set of matched elements after the target.
       *
       * param target A selector, element, array of elements, HTML string, or jQuery object; the matched set of elements will be inserted after the element(s) specified by this parameter.
       */
  def insertAfter(target: js.Array[_]): ChaiJQuery = js.native
  /**
       * Insert every element in the set of matched elements after the target.
       *
       * param target A selector, element, array of elements, HTML string, or jQuery object; the matched set of elements will be inserted after the element(s) specified by this parameter.
       */
  def insertAfter(target: stdLib.Element): ChaiJQuery = js.native
  /**
       * Insert every element in the set of matched elements after the target.
       *
       * param target A selector, element, array of elements, HTML string, or jQuery object; the matched set of elements will be inserted after the element(s) specified by this parameter.
       */
  def insertAfter(target: stdLib.Text): ChaiJQuery = js.native
  /**
       * Insert every element in the set of matched elements before the target.
       *
       * param target A selector, element, array of elements, HTML string, or jQuery object; the matched set of elements will be inserted before the element(s) specified by this parameter.
       */
  def insertBefore(target: java.lang.String): ChaiJQuery = js.native
  /**
       * Insert every element in the set of matched elements before the target.
       *
       * param target A selector, element, array of elements, HTML string, or jQuery object; the matched set of elements will be inserted before the element(s) specified by this parameter.
       */
  def insertBefore(target: jqueryLib.JQuery[stdLib.HTMLElement]): ChaiJQuery = js.native
  /**
       * Insert every element in the set of matched elements before the target.
       *
       * param target A selector, element, array of elements, HTML string, or jQuery object; the matched set of elements will be inserted before the element(s) specified by this parameter.
       */
  def insertBefore(target: js.Array[_]): ChaiJQuery = js.native
  /**
       * Insert every element in the set of matched elements before the target.
       *
       * param target A selector, element, array of elements, HTML string, or jQuery object; the matched set of elements will be inserted before the element(s) specified by this parameter.
       */
  def insertBefore(target: stdLib.Element): ChaiJQuery = js.native
  /**
       * Insert every element in the set of matched elements before the target.
       *
       * param target A selector, element, array of elements, HTML string, or jQuery object; the matched set of elements will be inserted before the element(s) specified by this parameter.
       */
  def insertBefore(target: stdLib.Text): ChaiJQuery = js.native
  /**
       * Check the current matched set of elements against a selector, element, or jQuery object and return true if at least one of these elements matches the given arguments.
       *
       * @param elements One or more elements to match the current set of elements against.
       */
  def is(elements: js.Any): scala.Boolean = js.native
  /**
       * Check the current matched set of elements against a selector, element, or jQuery object and return true if at least one of these elements matches the given arguments.
       *
       * @param func A function used as a test for the set of elements. It accepts one argument, index, which is the element's index in the jQuery collection.Within the function, this refers to the current DOM element.
       */
  def is(func: js.Function2[/* index */ scala.Double, /* element */ stdLib.Element, scala.Boolean]): scala.Boolean = js.native
  /**
       * Check the current matched set of elements against a selector, element, or jQuery object and return true if at least one of these elements matches the given arguments.
       *
       * @param obj An existing jQuery object to match the current set of elements against.
       */
  def is(obj: jqueryLib.JQuery[stdLib.HTMLElement]): scala.Boolean = js.native
  /**
       * Check the current matched set of elements against a selector, element, or jQuery object and return true if at least one of these elements matches the given arguments.
       *
       * @param selector A string containing a selector expression to match elements against.
       */
  def is(selector: java.lang.String): scala.Boolean = js.native
  /**
       * Trigger the "keydown" event on an element.
       */
  def keydown(): ChaiJQuery = js.native
  /**
       * Bind an event handler to the "keydown" JavaScript event
       *
       * @param eventData An object containing data that will be passed to the event handler.
       * @param handler A function to execute each time the event is triggered.
       */
  def keydown(eventData: js.Any): ChaiJQuery = js.native
  /**
       * Bind an event handler to the "keydown" JavaScript event
       *
       * @param eventData An object containing data that will be passed to the event handler.
       * @param handler A function to execute each time the event is triggered.
       */
  def keydown(eventData: js.Any, handler: js.Function1[/* eventObject */ jqueryLib.JQueryKeyEventObject, _]): ChaiJQuery = js.native
  /**
       * Bind an event handler to the "keydown" JavaScript event
       *
       * @param handler A function to execute each time the event is triggered.
       */
  def keydown(handler: js.Function1[/* eventObject */ jqueryLib.JQueryKeyEventObject, _]): ChaiJQuery = js.native
  /**
       * Trigger the "keypress" event on an element.
       */
  def keypress(): ChaiJQuery = js.native
  /**
       * Bind an event handler to the "keypress" JavaScript event
       *
       * @param eventData An object containing data that will be passed to the event handler.
       * @param handler A function to execute each time the event is triggered.
       */
  def keypress(eventData: js.Any): ChaiJQuery = js.native
  /**
       * Bind an event handler to the "keypress" JavaScript event
       *
       * @param eventData An object containing data that will be passed to the event handler.
       * @param handler A function to execute each time the event is triggered.
       */
  def keypress(eventData: js.Any, handler: js.Function1[/* eventObject */ jqueryLib.JQueryKeyEventObject, _]): ChaiJQuery = js.native
  /**
       * Bind an event handler to the "keypress" JavaScript event
       *
       * @param handler A function to execute each time the event is triggered.
       */
  def keypress(handler: js.Function1[/* eventObject */ jqueryLib.JQueryKeyEventObject, _]): ChaiJQuery = js.native
  /**
       * Trigger the "keyup" event on an element.
       */
  def keyup(): ChaiJQuery = js.native
  /**
       * Bind an event handler to the "keyup" JavaScript event
       *
       * @param eventData An object containing data that will be passed to the event handler.
       * @param handler A function to execute each time the event is triggered.
       */
  def keyup(eventData: js.Any): ChaiJQuery = js.native
  /**
       * Bind an event handler to the "keyup" JavaScript event
       *
       * @param eventData An object containing data that will be passed to the event handler.
       * @param handler A function to execute each time the event is triggered.
       */
  def keyup(eventData: js.Any, handler: js.Function1[/* eventObject */ jqueryLib.JQueryKeyEventObject, _]): ChaiJQuery = js.native
  /**
       * Bind an event handler to the "keyup" JavaScript event
       *
       * @param handler A function to execute each time the event is triggered.
       */
  def keyup(handler: js.Function1[/* eventObject */ jqueryLib.JQueryKeyEventObject, _]): ChaiJQuery = js.native
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
  /**
       * Bind an event handler to the "load" JavaScript event.
       *
       * @param eventData An object containing data that will be passed to the event handler.
       * @param handler A function to execute when the event is triggered.
       */
  def load(eventData: js.Any): ChaiJQuery = js.native
  /**
       * Bind an event handler to the "load" JavaScript event.
       *
       * @param eventData An object containing data that will be passed to the event handler.
       * @param handler A function to execute when the event is triggered.
       */
  def load(eventData: js.Any, handler: js.Function1[/* eventObject */ jqueryLib.JQueryEventObject, _]): ChaiJQuery = js.native
  /**
       * Bind an event handler to the "load" JavaScript event.
       *
       * @param handler A function to execute when the event is triggered.
       */
  def load(handler: js.Function1[/* eventObject */ jqueryLib.JQueryEventObject, _]): ChaiJQuery = js.native
  /**
       * Load data from the server and place the returned HTML into the matched element.
       *
       * @param url A string containing the URL to which the request is sent.
       * @param data A plain object or string that is sent to the server with the request.
       * @param complete A callback function that is executed when the request completes.
       */
  def load(url: java.lang.String): ChaiJQuery = js.native
  /**
       * Load data from the server and place the returned HTML into the matched element.
       *
       * @param url A string containing the URL to which the request is sent.
       * @param data A plain object or string that is sent to the server with the request.
       * @param complete A callback function that is executed when the request completes.
       */
  def load(url: java.lang.String, data: java.lang.String): ChaiJQuery = js.native
  /**
       * Load data from the server and place the returned HTML into the matched element.
       *
       * @param url A string containing the URL to which the request is sent.
       * @param data A plain object or string that is sent to the server with the request.
       * @param complete A callback function that is executed when the request completes.
       */
  def load(
    url: java.lang.String,
    data: java.lang.String,
    complete: js.Function3[
      /* responseText */ java.lang.String, 
      /* textStatus */ java.lang.String, 
      /* XMLHttpRequest */ stdLib.XMLHttpRequest, 
      _
    ]
  ): ChaiJQuery = js.native
  /**
       * Load data from the server and place the returned HTML into the matched element.
       *
       * @param url A string containing the URL to which the request is sent.
       * @param data A plain object or string that is sent to the server with the request.
       * @param complete A callback function that is executed when the request completes.
       */
  def load(url: java.lang.String, data: js.Object): ChaiJQuery = js.native
  /**
       * Load data from the server and place the returned HTML into the matched element.
       *
       * @param url A string containing the URL to which the request is sent.
       * @param data A plain object or string that is sent to the server with the request.
       * @param complete A callback function that is executed when the request completes.
       */
  def load(
    url: java.lang.String,
    data: js.Object,
    complete: js.Function3[
      /* responseText */ java.lang.String, 
      /* textStatus */ java.lang.String, 
      /* XMLHttpRequest */ stdLib.XMLHttpRequest, 
      _
    ]
  ): ChaiJQuery = js.native
  /**
       * Pass each element in the current matched set through a function, producing a new jQuery object containing the return values.
       *
       * @param callback A function object that will be invoked for each element in the current set.
       */
  def map(callback: js.Function2[/* index */ scala.Double, /* domElement */ stdLib.Element, _]): ChaiJQuery = js.native
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
  def mousedown(eventData: js.Object, handler: js.Function1[/* eventObject */ jqueryLib.JQueryMouseEventObject, _]): ChaiJQuery = js.native
  /**
       * Bind an event handler to the "mousedown" JavaScript event.
       *
       * @param handler A function to execute when the event is triggered.
       */
  def mousedown(handler: js.Function1[/* eventObject */ jqueryLib.JQueryMouseEventObject, _]): ChaiJQuery = js.native
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
  def mouseenter(eventData: js.Object, handler: js.Function1[/* eventObject */ jqueryLib.JQueryMouseEventObject, _]): ChaiJQuery = js.native
  /**
       * Bind an event handler to be fired when the mouse enters an element.
       *
       * @param handler A function to execute when the event is triggered.
       */
  def mouseenter(handler: js.Function1[/* eventObject */ jqueryLib.JQueryMouseEventObject, _]): ChaiJQuery = js.native
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
  def mouseleave(eventData: js.Object, handler: js.Function1[/* eventObject */ jqueryLib.JQueryMouseEventObject, _]): ChaiJQuery = js.native
  /**
       * Bind an event handler to be fired when the mouse leaves an element.
       *
       * @param handler A function to execute when the event is triggered.
       */
  def mouseleave(handler: js.Function1[/* eventObject */ jqueryLib.JQueryMouseEventObject, _]): ChaiJQuery = js.native
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
  def mousemove(eventData: js.Object, handler: js.Function1[/* eventObject */ jqueryLib.JQueryMouseEventObject, _]): ChaiJQuery = js.native
  /**
       * Bind an event handler to the "mousemove" JavaScript event.
       *
       * @param handler A function to execute when the event is triggered.
       */
  def mousemove(handler: js.Function1[/* eventObject */ jqueryLib.JQueryMouseEventObject, _]): ChaiJQuery = js.native
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
  def mouseout(eventData: js.Object, handler: js.Function1[/* eventObject */ jqueryLib.JQueryMouseEventObject, _]): ChaiJQuery = js.native
  /**
       * Bind an event handler to the "mouseout" JavaScript event.
       *
       * @param handler A function to execute when the event is triggered.
       */
  def mouseout(handler: js.Function1[/* eventObject */ jqueryLib.JQueryMouseEventObject, _]): ChaiJQuery = js.native
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
  def mouseover(eventData: js.Object, handler: js.Function1[/* eventObject */ jqueryLib.JQueryMouseEventObject, _]): ChaiJQuery = js.native
  /**
       * Bind an event handler to the "mouseover" JavaScript event.
       *
       * @param handler A function to execute when the event is triggered.
       */
  def mouseover(handler: js.Function1[/* eventObject */ jqueryLib.JQueryMouseEventObject, _]): ChaiJQuery = js.native
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
  def mouseup(eventData: js.Object, handler: js.Function1[/* eventObject */ jqueryLib.JQueryMouseEventObject, _]): ChaiJQuery = js.native
  /**
       * Bind an event handler to the "mouseup" JavaScript event.
       *
       * @param handler A function to execute when the event is triggered.
       */
  def mouseup(handler: js.Function1[/* eventObject */ jqueryLib.JQueryMouseEventObject, _]): ChaiJQuery = js.native
  /**
       * Get the immediately following sibling of each element in the set of matched elements. If a selector is provided, it retrieves the next sibling only if it matches that selector.
       *
       * @param selector A string containing a selector expression to match elements against.
       */
  def next(): ChaiJQuery = js.native
  /**
       * Get the immediately following sibling of each element in the set of matched elements. If a selector is provided, it retrieves the next sibling only if it matches that selector.
       *
       * @param selector A string containing a selector expression to match elements against.
       */
  def next(selector: java.lang.String): ChaiJQuery = js.native
  /**
       * Get all following siblings of each element in the set of matched elements, optionally filtered by a selector.
       *
       * @param selector A string containing a selector expression to match elements against.
       */
  def nextAll(): ChaiJQuery = js.native
  /**
       * Get all following siblings of each element in the set of matched elements, optionally filtered by a selector.
       *
       * @param selector A string containing a selector expression to match elements against.
       */
  def nextAll(selector: java.lang.String): ChaiJQuery = js.native
  /**
       * Get all following siblings of each element up to but not including the element matched by the selector, DOM node, or jQuery object passed.
       *
       * @param selector A string containing a selector expression to indicate where to stop matching following sibling elements.
       * @param filter A string containing a selector expression to match elements against.
       */
  def nextUntil(): ChaiJQuery = js.native
  /**
       * Get all following siblings of each element up to but not including the element matched by the selector, DOM node, or jQuery object passed.
       *
       * @param element A DOM node or jQuery object indicating where to stop matching following sibling elements.
       * @param filter A string containing a selector expression to match elements against.
       */
  def nextUntil(element: stdLib.Element): ChaiJQuery = js.native
  /**
       * Get all following siblings of each element up to but not including the element matched by the selector, DOM node, or jQuery object passed.
       *
       * @param element A DOM node or jQuery object indicating where to stop matching following sibling elements.
       * @param filter A string containing a selector expression to match elements against.
       */
  def nextUntil(element: stdLib.Element, filter: java.lang.String): ChaiJQuery = js.native
  /**
       * Get all following siblings of each element up to but not including the element matched by the selector, DOM node, or jQuery object passed.
       *
       * @param obj A DOM node or jQuery object indicating where to stop matching following sibling elements.
       * @param filter A string containing a selector expression to match elements against.
       */
  def nextUntil(obj: jqueryLib.JQuery[stdLib.HTMLElement]): ChaiJQuery = js.native
  /**
       * Get all following siblings of each element up to but not including the element matched by the selector, DOM node, or jQuery object passed.
       *
       * @param obj A DOM node or jQuery object indicating where to stop matching following sibling elements.
       * @param filter A string containing a selector expression to match elements against.
       */
  def nextUntil(obj: jqueryLib.JQuery[stdLib.HTMLElement], filter: java.lang.String): ChaiJQuery = js.native
  /**
       * Get all following siblings of each element up to but not including the element matched by the selector, DOM node, or jQuery object passed.
       *
       * @param selector A string containing a selector expression to indicate where to stop matching following sibling elements.
       * @param filter A string containing a selector expression to match elements against.
       */
  def nextUntil(selector: java.lang.String): ChaiJQuery = js.native
  /**
       * Get all following siblings of each element up to but not including the element matched by the selector, DOM node, or jQuery object passed.
       *
       * @param selector A string containing a selector expression to indicate where to stop matching following sibling elements.
       * @param filter A string containing a selector expression to match elements against.
       */
  def nextUntil(selector: java.lang.String, filter: java.lang.String): ChaiJQuery = js.native
  /**
       * Remove elements from the set of matched elements.
       *
       * @param elements One or more DOM elements to remove from the matched set.
       */
  def not(elements: stdLib.Element*): ChaiJQuery = js.native
  /**
       * Remove elements from the set of matched elements.
       *
       * @param func A function used as a test for each element in the set. this is the current DOM element.
       */
  def not(func: js.Function2[/* index */ scala.Double, /* element */ stdLib.Element, scala.Boolean]): ChaiJQuery = js.native
  /**
       * Remove elements from the set of matched elements.
       *
       * @param obj An existing jQuery object to match the current set of elements against.
       */
  def not(obj: jqueryLib.JQuery[stdLib.HTMLElement]): ChaiJQuery = js.native
  /**
       * Remove elements from the set of matched elements.
       *
       * @param selector A string containing a selector expression to match elements against.
       */
  def not(selector: java.lang.String): ChaiJQuery = js.native
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
  def off(events: java.lang.String): ChaiJQuery = js.native
  /**
       * Remove an event handler.
       *
       * @param events One or more space-separated event types and optional namespaces, or just namespaces, such as "click", "keydown.myPlugin", or ".myPlugin".
       * @param handler A handler function previously attached for the event(s), or the special value false.
       */
  def off(events: java.lang.String, handler: js.Function1[/* eventObject */ jqueryLib.JQueryEventObject, _]): ChaiJQuery = js.native
  /**
       * Remove an event handler.
       *
       * @param events One or more space-separated event types and optional namespaces, or just namespaces, such as "click", "keydown.myPlugin", or ".myPlugin".
       * @param selector A selector which should match the one originally passed to .on() when attaching event handlers.
       * @param handler A handler function previously attached for the event(s), or the special value false.
       */
  def off(events: java.lang.String, selector: java.lang.String): ChaiJQuery = js.native
  /**
       * Remove an event handler.
       *
       * @param events One or more space-separated event types and optional namespaces, or just namespaces, such as "click", "keydown.myPlugin", or ".myPlugin".
       * @param selector A selector which should match the one originally passed to .on() when attaching event handlers.
       * @param handler A handler function previously attached for the event(s), or the special value false.
       */
  def off(
    events: java.lang.String,
    selector: java.lang.String,
    handler: js.Function1[/* eventObject */ jqueryLib.JQueryEventObject, _]
  ): ChaiJQuery = js.native
  /**
       * Remove an event handler.
       *
       * @param events An object where the string keys represent one or more space-separated event types and optional namespaces, and the values represent handler functions previously attached for the event(s).
       * @param selector A selector which should match the one originally passed to .on() when attaching event handlers.
       */
  def off(events: org.scalablytyped.runtime.StringDictionary[js.Any]): ChaiJQuery = js.native
  /**
       * Remove an event handler.
       *
       * @param events An object where the string keys represent one or more space-separated event types and optional namespaces, and the values represent handler functions previously attached for the event(s).
       * @param selector A selector which should match the one originally passed to .on() when attaching event handlers.
       */
  def off(events: org.scalablytyped.runtime.StringDictionary[js.Any], selector: java.lang.String): ChaiJQuery = js.native
  /**
       * Get the current coordinates of the first element in the set of matched elements, relative to the document.
       */
  def offset(): jqueryLib.JQueryCoordinates = js.native
  /**
       * An object containing the properties top and left, which are integers indicating the new top and left coordinates for the elements.
       *
       * @param coordinates An object containing the properties top and left, which are integers indicating the new top and left coordinates for the elements.
       */
  def offset(coordinates: jqueryLib.JQueryCoordinates): ChaiJQuery = js.native
  /**
       * An object containing the properties top and left, which are integers indicating the new top and left coordinates for the elements.
       *
       * @param func A function to return the coordinates to set. Receives the index of the element in the collection as the first argument and the current coordinates as the second argument. The function should return an object with the new top and left properties.
       */
  def offset(
    func: js.Function2[
      /* index */ scala.Double, 
      /* coords */ jqueryLib.JQueryCoordinates, 
      jqueryLib.JQueryCoordinates
    ]
  ): ChaiJQuery = js.native
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
    events: java.lang.String,
    data: js.Any,
    handler: js.Function2[/* eventObject */ jqueryLib.JQueryEventObject, /* repeated */js.Any, _]
  ): ChaiJQuery = js.native
  /**
       * Attach an event handler function for one or more events to the selected elements.
       *
       * @param events One or more space-separated event types and optional namespaces, such as "click" or "keydown.myPlugin".
       * @param handler A function to execute when the event is triggered. The value false is also allowed as a shorthand for a function that simply does return false. Rest parameter args is for optional parameters passed to jQuery.trigger(). Note that the actual parameters on the event handler function must be marked as optional (? syntax).
       */
  def on(
    events: java.lang.String,
    handler: js.Function2[/* eventObject */ jqueryLib.JQueryEventObject, /* repeated */js.Any, _]
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
    events: java.lang.String,
    selector: java.lang.String,
    data: js.Any,
    handler: js.Function2[/* eventObject */ jqueryLib.JQueryEventObject, /* repeated */js.Any, _]
  ): ChaiJQuery = js.native
  /**
       * Attach an event handler function for one or more events to the selected elements.
       *
       * @param events One or more space-separated event types and optional namespaces, such as "click" or "keydown.myPlugin".
       * @param selector A selector string to filter the descendants of the selected elements that trigger the event. If the selector is null or omitted, the event is always triggered when it reaches the selected element.
       * @param handler A function to execute when the event is triggered. The value false is also allowed as a shorthand for a function that simply does return false.
       */
  def on(
    events: java.lang.String,
    selector: java.lang.String,
    handler: js.Function2[/* eventObject */ jqueryLib.JQueryEventObject, /* repeated */js.Any, _]
  ): ChaiJQuery = js.native
  /**
       * Attach an event handler function for one or more events to the selected elements.
       *
       * @param events An object in which the string keys represent one or more space-separated event types and optional namespaces, and the values represent a handler function to be called for the event(s).
       * @param selector A selector string to filter the descendants of the selected elements that will call the handler. If the selector is null or omitted, the handler is always called when it reaches the selected element.
       * @param data Data to be passed to the handler in event.data when an event occurs.
       */
  def on(events: org.scalablytyped.runtime.StringDictionary[js.Any]): ChaiJQuery = js.native
  /**
       * Attach an event handler function for one or more events to the selected elements.
       *
       * @param events An object in which the string keys represent one or more space-separated event types and optional namespaces, and the values represent a handler function to be called for the event(s).
       * @param data Data to be passed to the handler in event.data when an event occurs.
       */
  def on(events: org.scalablytyped.runtime.StringDictionary[js.Any], data: js.Any): ChaiJQuery = js.native
  /**
       * Attach an event handler function for one or more events to the selected elements.
       *
       * @param events An object in which the string keys represent one or more space-separated event types and optional namespaces, and the values represent a handler function to be called for the event(s).
       * @param selector A selector string to filter the descendants of the selected elements that will call the handler. If the selector is null or omitted, the handler is always called when it reaches the selected element.
       * @param data Data to be passed to the handler in event.data when an event occurs.
       */
  def on(events: org.scalablytyped.runtime.StringDictionary[js.Any], selector: java.lang.String): ChaiJQuery = js.native
  /**
       * Attach an event handler function for one or more events to the selected elements.
       *
       * @param events An object in which the string keys represent one or more space-separated event types and optional namespaces, and the values represent a handler function to be called for the event(s).
       * @param selector A selector string to filter the descendants of the selected elements that will call the handler. If the selector is null or omitted, the handler is always called when it reaches the selected element.
       * @param data Data to be passed to the handler in event.data when an event occurs.
       */
  def on(
    events: org.scalablytyped.runtime.StringDictionary[js.Any],
    selector: java.lang.String,
    data: js.Any
  ): ChaiJQuery = js.native
  /**
       * Attach a handler to an event for the elements. The handler is executed at most once per element per event type.
       *
       * @param events A string containing one or more JavaScript event types, such as "click" or "submit," or custom event names.
       * @param data An object containing data that will be passed to the event handler.
       * @param handler A function to execute at the time the event is triggered.
       */
  def one(
    events: java.lang.String,
    data: js.Object,
    handler: js.Function1[/* eventObject */ jqueryLib.JQueryEventObject, _]
  ): ChaiJQuery = js.native
  /**
       * Attach a handler to an event for the elements. The handler is executed at most once per element per event type.
       *
       * @param events A string containing one or more JavaScript event types, such as "click" or "submit," or custom event names.
       * @param handler A function to execute at the time the event is triggered.
       */
  def one(events: java.lang.String, handler: js.Function1[/* eventObject */ jqueryLib.JQueryEventObject, _]): ChaiJQuery = js.native
  /**
       * Attach a handler to an event for the elements. The handler is executed at most once per element per event type.
       *
       * @param events One or more space-separated event types and optional namespaces, such as "click" or "keydown.myPlugin".
       * @param selector A selector string to filter the descendants of the selected elements that trigger the event. If the selector is null or omitted, the event is always triggered when it reaches the selected element.
       * @param data Data to be passed to the handler in event.data when an event is triggered.
       * @param handler A function to execute when the event is triggered. The value false is also allowed as a shorthand for a function that simply does return false.
       */
  def one(
    events: java.lang.String,
    selector: java.lang.String,
    data: js.Any,
    handler: js.Function1[/* eventObject */ jqueryLib.JQueryEventObject, _]
  ): ChaiJQuery = js.native
  /**
       * Attach a handler to an event for the elements. The handler is executed at most once per element per event type.
       *
       * @param events One or more space-separated event types and optional namespaces, such as "click" or "keydown.myPlugin".
       * @param selector A selector string to filter the descendants of the selected elements that trigger the event. If the selector is null or omitted, the event is always triggered when it reaches the selected element.
       * @param handler A function to execute when the event is triggered. The value false is also allowed as a shorthand for a function that simply does return false.
       */
  def one(
    events: java.lang.String,
    selector: java.lang.String,
    handler: js.Function1[/* eventObject */ jqueryLib.JQueryEventObject, _]
  ): ChaiJQuery = js.native
  /**
       * Attach a handler to an event for the elements. The handler is executed at most once per element per event type.
       *
       * @param events An object in which the string keys represent one or more space-separated event types and optional namespaces, and the values represent a handler function to be called for the event(s).
       * @param selector A selector string to filter the descendants of the selected elements that will call the handler. If the selector is null or omitted, the handler is always called when it reaches the selected element.
       * @param data Data to be passed to the handler in event.data when an event occurs.
       */
  def one(events: org.scalablytyped.runtime.StringDictionary[js.Any]): ChaiJQuery = js.native
  /**
       * Attach a handler to an event for the elements. The handler is executed at most once per element per event type.
       *
       * @param events An object in which the string keys represent one or more space-separated event types and optional namespaces, and the values represent a handler function to be called for the event(s).
       * @param data Data to be passed to the handler in event.data when an event occurs.
       */
  def one(events: org.scalablytyped.runtime.StringDictionary[js.Any], data: js.Any): ChaiJQuery = js.native
  /**
       * Attach a handler to an event for the elements. The handler is executed at most once per element per event type.
       *
       * @param events An object in which the string keys represent one or more space-separated event types and optional namespaces, and the values represent a handler function to be called for the event(s).
       * @param selector A selector string to filter the descendants of the selected elements that will call the handler. If the selector is null or omitted, the handler is always called when it reaches the selected element.
       * @param data Data to be passed to the handler in event.data when an event occurs.
       */
  def one(events: org.scalablytyped.runtime.StringDictionary[js.Any], selector: java.lang.String): ChaiJQuery = js.native
  /**
       * Attach a handler to an event for the elements. The handler is executed at most once per element per event type.
       *
       * @param events An object in which the string keys represent one or more space-separated event types and optional namespaces, and the values represent a handler function to be called for the event(s).
       * @param selector A selector string to filter the descendants of the selected elements that will call the handler. If the selector is null or omitted, the handler is always called when it reaches the selected element.
       * @param data Data to be passed to the handler in event.data when an event occurs.
       */
  def one(
    events: org.scalablytyped.runtime.StringDictionary[js.Any],
    selector: java.lang.String,
    data: js.Any
  ): ChaiJQuery = js.native
  /**
       * Get the current computed height for the first element in the set of matched elements, including padding, border, and optionally margin. Returns an integer (without "px") representation of the value or null if called on an empty set of elements.
       *
       * @param includeMargin A Boolean indicating whether to include the element's margin in the calculation.
       */
  def outerHeight(): scala.Double = js.native
  /**
       * Sets the outer height on elements in the set of matched elements, including padding and border.
       *
       * @param value An integer representing the number of pixels, or an integer along with an optional unit of measure appended (as a string).
       */
  def outerHeight(height: java.lang.String): ChaiJQuery = js.native
  /**
       * Sets the outer height on elements in the set of matched elements, including padding and border.
       *
       * @param value An integer representing the number of pixels, or an integer along with an optional unit of measure appended (as a string).
       */
  def outerHeight(height: scala.Double): ChaiJQuery = js.native
  /**
       * Get the current computed height for the first element in the set of matched elements, including padding, border, and optionally margin. Returns an integer (without "px") representation of the value or null if called on an empty set of elements.
       *
       * @param includeMargin A Boolean indicating whether to include the element's margin in the calculation.
       */
  def outerHeight(includeMargin: scala.Boolean): scala.Double = js.native
  /**
       * Get the current computed width for the first element in the set of matched elements, including padding and border.
       *
       * @param includeMargin A Boolean indicating whether to include the element's margin in the calculation.
       */
  def outerWidth(): scala.Double = js.native
  /**
       * Get the current computed width for the first element in the set of matched elements, including padding and border.
       *
       * @param includeMargin A Boolean indicating whether to include the element's margin in the calculation.
       */
  def outerWidth(includeMargin: scala.Boolean): scala.Double = js.native
  /**
       * Sets the outer width on elements in the set of matched elements, including padding and border.
       *
       * @param value An integer representing the number of pixels, or an integer along with an optional unit of measure appended (as a string).
       */
  def outerWidth(width: java.lang.String): ChaiJQuery = js.native
  /**
       * Sets the outer width on elements in the set of matched elements, including padding and border.
       *
       * @param value An integer representing the number of pixels, or an integer along with an optional unit of measure appended (as a string).
       */
  def outerWidth(width: scala.Double): ChaiJQuery = js.native
  /**
       * Get the parent of each element in the current set of matched elements, optionally filtered by a selector.
       *
       * @param selector A string containing a selector expression to match elements against.
       */
  def parent(): ChaiJQuery = js.native
  /**
       * Get the parent of each element in the current set of matched elements, optionally filtered by a selector.
       *
       * @param selector A string containing a selector expression to match elements against.
       */
  def parent(selector: java.lang.String): ChaiJQuery = js.native
  /**
       * Get the ancestors of each element in the current set of matched elements, optionally filtered by a selector.
       *
       * @param selector A string containing a selector expression to match elements against.
       */
  def parents(): ChaiJQuery = js.native
  /**
       * Get the ancestors of each element in the current set of matched elements, optionally filtered by a selector.
       *
       * @param selector A string containing a selector expression to match elements against.
       */
  def parents(selector: java.lang.String): ChaiJQuery = js.native
  /**
       * Get the ancestors of each element in the current set of matched elements, up to but not including the element matched by the selector, DOM node, or jQuery object.
       *
       * @param selector A string containing a selector expression to indicate where to stop matching ancestor elements.
       * @param filter A string containing a selector expression to match elements against.
       */
  def parentsUntil(): ChaiJQuery = js.native
  /**
       * Get the ancestors of each element in the current set of matched elements, up to but not including the element matched by the selector, DOM node, or jQuery object.
       *
       * @param element A DOM node or jQuery object indicating where to stop matching ancestor elements.
       * @param filter A string containing a selector expression to match elements against.
       */
  def parentsUntil(element: stdLib.Element): ChaiJQuery = js.native
  /**
       * Get the ancestors of each element in the current set of matched elements, up to but not including the element matched by the selector, DOM node, or jQuery object.
       *
       * @param element A DOM node or jQuery object indicating where to stop matching ancestor elements.
       * @param filter A string containing a selector expression to match elements against.
       */
  def parentsUntil(element: stdLib.Element, filter: java.lang.String): ChaiJQuery = js.native
  /**
       * Get the ancestors of each element in the current set of matched elements, up to but not including the element matched by the selector, DOM node, or jQuery object.
       *
       * @param obj A DOM node or jQuery object indicating where to stop matching ancestor elements.
       * @param filter A string containing a selector expression to match elements against.
       */
  def parentsUntil(obj: jqueryLib.JQuery[stdLib.HTMLElement]): ChaiJQuery = js.native
  /**
       * Get the ancestors of each element in the current set of matched elements, up to but not including the element matched by the selector, DOM node, or jQuery object.
       *
       * @param obj A DOM node or jQuery object indicating where to stop matching ancestor elements.
       * @param filter A string containing a selector expression to match elements against.
       */
  def parentsUntil(obj: jqueryLib.JQuery[stdLib.HTMLElement], filter: java.lang.String): ChaiJQuery = js.native
  /**
       * Get the ancestors of each element in the current set of matched elements, up to but not including the element matched by the selector, DOM node, or jQuery object.
       *
       * @param selector A string containing a selector expression to indicate where to stop matching ancestor elements.
       * @param filter A string containing a selector expression to match elements against.
       */
  def parentsUntil(selector: java.lang.String): ChaiJQuery = js.native
  /**
       * Get the ancestors of each element in the current set of matched elements, up to but not including the element matched by the selector, DOM node, or jQuery object.
       *
       * @param selector A string containing a selector expression to indicate where to stop matching ancestor elements.
       * @param filter A string containing a selector expression to match elements against.
       */
  def parentsUntil(selector: java.lang.String, filter: java.lang.String): ChaiJQuery = js.native
  /**
       * Get the current coordinates of the first element in the set of matched elements, relative to the offset parent.
       */
  def position(): jqueryLib.JQueryCoordinates = js.native
  /**
       * Insert content, specified by the parameter, to the beginning of each element in the set of matched elements.
       *
       * param content1 DOM element, array of elements, HTML string, or jQuery object to insert at the beginning of each element in the set of matched elements.
       * param content2 One or more additional DOM elements, arrays of elements, HTML strings, or jQuery objects to insert at the beginning of each element in the set of matched elements.
       */
  def prepend(content1: java.lang.String, content2: js.Any*): ChaiJQuery = js.native
  /**
       * Insert content, specified by the parameter, to the beginning of each element in the set of matched elements.
       *
       * param content1 DOM element, array of elements, HTML string, or jQuery object to insert at the beginning of each element in the set of matched elements.
       * param content2 One or more additional DOM elements, arrays of elements, HTML strings, or jQuery objects to insert at the beginning of each element in the set of matched elements.
       */
  def prepend(content1: jqueryLib.JQuery[stdLib.HTMLElement], content2: js.Any*): ChaiJQuery = js.native
  /**
       * Insert content, specified by the parameter, to the beginning of each element in the set of matched elements.
       *
       * param content1 DOM element, array of elements, HTML string, or jQuery object to insert at the beginning of each element in the set of matched elements.
       * param content2 One or more additional DOM elements, arrays of elements, HTML strings, or jQuery objects to insert at the beginning of each element in the set of matched elements.
       */
  def prepend(content1: js.Array[_], content2: js.Any*): ChaiJQuery = js.native
  /**
       * Insert content, specified by the parameter, to the beginning of each element in the set of matched elements.
       *
       * param content1 DOM element, array of elements, HTML string, or jQuery object to insert at the beginning of each element in the set of matched elements.
       * param content2 One or more additional DOM elements, arrays of elements, HTML strings, or jQuery objects to insert at the beginning of each element in the set of matched elements.
       */
  def prepend(content1: stdLib.Element, content2: js.Any*): ChaiJQuery = js.native
  /**
       * Insert content, specified by the parameter, to the beginning of each element in the set of matched elements.
       *
       * param content1 DOM element, array of elements, HTML string, or jQuery object to insert at the beginning of each element in the set of matched elements.
       * param content2 One or more additional DOM elements, arrays of elements, HTML strings, or jQuery objects to insert at the beginning of each element in the set of matched elements.
       */
  def prepend(content1: stdLib.Text, content2: js.Any*): ChaiJQuery = js.native
  /**
       * Insert content, specified by the parameter, to the beginning of each element in the set of matched elements.
       *
       * param func A function that returns an HTML string, DOM element(s), or jQuery object to insert at the beginning of each element in the set of matched elements. Receives the index position of the element in the set and the old HTML value of the element as arguments. Within the function, this refers to the current element in the set.
       */
  def prepend(
    func: js.Function2[
      /* index */ scala.Double, 
      /* html */ java.lang.String, 
      java.lang.String | stdLib.Element | jqueryLib.JQuery[stdLib.HTMLElement]
    ]
  ): ChaiJQuery = js.native
  /**
       * Insert every element in the set of matched elements to the beginning of the target.
       *
       * @param target A selector, element, HTML string, array of elements, or jQuery object; the matched set of elements will be inserted at the beginning of the element(s) specified by this parameter.
       */
  def prependTo(target: java.lang.String): ChaiJQuery = js.native
  /**
       * Insert every element in the set of matched elements to the beginning of the target.
       *
       * @param target A selector, element, HTML string, array of elements, or jQuery object; the matched set of elements will be inserted at the beginning of the element(s) specified by this parameter.
       */
  def prependTo(target: jqueryLib.JQuery[stdLib.HTMLElement]): ChaiJQuery = js.native
  /**
       * Insert every element in the set of matched elements to the beginning of the target.
       *
       * @param target A selector, element, HTML string, array of elements, or jQuery object; the matched set of elements will be inserted at the beginning of the element(s) specified by this parameter.
       */
  def prependTo(target: js.Array[_]): ChaiJQuery = js.native
  /**
       * Insert every element in the set of matched elements to the beginning of the target.
       *
       * @param target A selector, element, HTML string, array of elements, or jQuery object; the matched set of elements will be inserted at the beginning of the element(s) specified by this parameter.
       */
  def prependTo(target: stdLib.Element): ChaiJQuery = js.native
  /**
       * Get the immediately preceding sibling of each element in the set of matched elements, optionally filtered by a selector.
       *
       * @param selector A string containing a selector expression to match elements against.
       */
  def prev(): ChaiJQuery = js.native
  /**
       * Get the immediately preceding sibling of each element in the set of matched elements, optionally filtered by a selector.
       *
       * @param selector A string containing a selector expression to match elements against.
       */
  def prev(selector: java.lang.String): ChaiJQuery = js.native
  /**
       * Get all preceding siblings of each element in the set of matched elements, optionally filtered by a selector.
       *
       * @param selector A string containing a selector expression to match elements against.
       */
  def prevAll(): ChaiJQuery = js.native
  /**
       * Get all preceding siblings of each element in the set of matched elements, optionally filtered by a selector.
       *
       * @param selector A string containing a selector expression to match elements against.
       */
  def prevAll(selector: java.lang.String): ChaiJQuery = js.native
  /**
       * Get all preceding siblings of each element up to but not including the element matched by the selector, DOM node, or jQuery object.
       *
       * @param selector A string containing a selector expression to indicate where to stop matching preceding sibling elements.
       * @param filter A string containing a selector expression to match elements against.
       */
  def prevUntil(): ChaiJQuery = js.native
  /**
       * Get all preceding siblings of each element up to but not including the element matched by the selector, DOM node, or jQuery object.
       *
       * @param element A DOM node or jQuery object indicating where to stop matching preceding sibling elements.
       * @param filter A string containing a selector expression to match elements against.
       */
  def prevUntil(element: stdLib.Element): ChaiJQuery = js.native
  /**
       * Get all preceding siblings of each element up to but not including the element matched by the selector, DOM node, or jQuery object.
       *
       * @param element A DOM node or jQuery object indicating where to stop matching preceding sibling elements.
       * @param filter A string containing a selector expression to match elements against.
       */
  def prevUntil(element: stdLib.Element, filter: java.lang.String): ChaiJQuery = js.native
  /**
       * Get all preceding siblings of each element up to but not including the element matched by the selector, DOM node, or jQuery object.
       *
       * @param obj A DOM node or jQuery object indicating where to stop matching preceding sibling elements.
       * @param filter A string containing a selector expression to match elements against.
       */
  def prevUntil(obj: jqueryLib.JQuery[stdLib.HTMLElement]): ChaiJQuery = js.native
  /**
       * Get all preceding siblings of each element up to but not including the element matched by the selector, DOM node, or jQuery object.
       *
       * @param obj A DOM node or jQuery object indicating where to stop matching preceding sibling elements.
       * @param filter A string containing a selector expression to match elements against.
       */
  def prevUntil(obj: jqueryLib.JQuery[stdLib.HTMLElement], filter: java.lang.String): ChaiJQuery = js.native
  /**
       * Get all preceding siblings of each element up to but not including the element matched by the selector, DOM node, or jQuery object.
       *
       * @param selector A string containing a selector expression to indicate where to stop matching preceding sibling elements.
       * @param filter A string containing a selector expression to match elements against.
       */
  def prevUntil(selector: java.lang.String): ChaiJQuery = js.native
  /**
       * Get all preceding siblings of each element up to but not including the element matched by the selector, DOM node, or jQuery object.
       *
       * @param selector A string containing a selector expression to indicate where to stop matching preceding sibling elements.
       * @param filter A string containing a selector expression to match elements against.
       */
  def prevUntil(selector: java.lang.String, filter: java.lang.String): ChaiJQuery = js.native
  /**
       * Return a Promise object to observe when all actions of a certain type bound to the collection, queued or not, have finished.
       *
       * @param type The type of queue that needs to be observed. (default: fx)
       * @param target Object onto which the promise methods have to be attached
       */
  def promise(): jqueryLib.JQueryPromise[_] = js.native
  /**
       * Return a Promise object to observe when all actions of a certain type bound to the collection, queued or not, have finished.
       *
       * @param type The type of queue that needs to be observed. (default: fx)
       * @param target Object onto which the promise methods have to be attached
       */
  def promise(`type`: java.lang.String): jqueryLib.JQueryPromise[_] = js.native
  /**
       * Return a Promise object to observe when all actions of a certain type bound to the collection, queued or not, have finished.
       *
       * @param type The type of queue that needs to be observed. (default: fx)
       * @param target Object onto which the promise methods have to be attached
       */
  def promise(`type`: java.lang.String, target: js.Object): jqueryLib.JQueryPromise[_] = js.native
  /**
       * Set one or more properties for the set of matched elements.
       *
       * @param properties An object of property-value pairs to set.
       */
  def prop(properties: js.Object): ChaiJQuery = js.native
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
  def prop(propertyName: java.lang.String): js.Any = js.native
  /**
       * Set one or more properties for the set of matched elements.
       *
       * @param propertyName The name of the property to set.
       * @param func A function returning the value to set. Receives the index position of the element in the set and the old property value as arguments. Within the function, the keyword this refers to the current element.
       */
  def prop(
    propertyName: java.lang.String,
    func: js.Function2[/* index */ scala.Double, /* oldPropertyValue */ js.Any, _]
  ): ChaiJQuery = js.native
  /**
       * Set one or more properties for the set of matched elements.
       *
       * @param propertyName The name of the property to set.
       * @param value A value to set for the property.
       */
  def prop(propertyName: java.lang.String, value: java.lang.String): ChaiJQuery = js.native
  /**
       * Set one or more properties for the set of matched elements.
       *
       * @param propertyName The name of the property to set.
       * @param value A value to set for the property.
       */
  def prop(propertyName: java.lang.String, value: scala.Boolean): ChaiJQuery = js.native
  /**
       * Set one or more properties for the set of matched elements.
       *
       * @param propertyName The name of the property to set.
       * @param value A value to set for the property.
       */
  def prop(propertyName: java.lang.String, value: scala.Double): ChaiJQuery = js.native
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
  def pushStack(elements: js.Array[_], name: java.lang.String, arguments: js.Array[_]): ChaiJQuery = js.native
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
  /**
       * Show the queue of functions to be executed on the matched elements.
       *
       * @param queueName A string containing the name of the queue. Defaults to fx, the standard effects queue.
       */
  def queue(queueName: java.lang.String): js.Array[_] = js.native
  /**
       * Manipulate the queue of functions to be executed, once for each matched element.
       *
       * @param queueName A string containing the name of the queue. Defaults to fx, the standard effects queue.
       * @param callback The new function to add to the queue, with a function to call that will dequeue the next item.
       */
  def queue(queueName: java.lang.String, callback: js.Function): ChaiJQuery = js.native
  /**
       * Manipulate the queue of functions to be executed, once for each matched element.
       *
       * @param queueName A string containing the name of the queue. Defaults to fx, the standard effects queue.
       * @param newQueue An array of functions to replace the current queue contents.
       */
  def queue(queueName: java.lang.String, newQueue: js.Array[js.Function]): ChaiJQuery = js.native
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
  /**
       * Remove the set of matched elements from the DOM.
       *
       * @param selector A selector expression that filters the set of matched elements to be removed.
       */
  def remove(selector: java.lang.String): ChaiJQuery = js.native
  /**
       * Remove an attribute from each element in the set of matched elements.
       *
       * @param attributeName An attribute to remove; as of version 1.7, it can be a space-separated list of attributes.
       */
  def removeAttr(attributeName: java.lang.String): ChaiJQuery = js.native
  /**
       * Remove a single class, multiple classes, or all classes from each element in the set of matched elements.
       *
       * @param className One or more space-separated classes to be removed from the class attribute of each matched element.
       */
  def removeClass(): ChaiJQuery = js.native
  /**
       * Remove a single class, multiple classes, or all classes from each element in the set of matched elements.
       *
       * @param className One or more space-separated classes to be removed from the class attribute of each matched element.
       */
  def removeClass(className: java.lang.String): ChaiJQuery = js.native
  /**
       * Remove a single class, multiple classes, or all classes from each element in the set of matched elements.
       *
       * @param function A function returning one or more space-separated class names to be removed. Receives the index position of the element in the set and the old class value as arguments.
       */
  def removeClass(func: js.Function2[/* index */ scala.Double, /* className */ java.lang.String, java.lang.String]): ChaiJQuery = js.native
  /**
       * Remove a previously-stored piece of data.
       *
       * @param list An array of strings naming the pieces of data to delete.
       */
  def removeData(list: js.Array[java.lang.String]): ChaiJQuery = js.native
  /**
       * Remove a previously-stored piece of data.
       *
       * @param name A string naming the piece of data to delete or space-separated string naming the pieces of data to delete.
       */
  def removeData(name: java.lang.String): ChaiJQuery = js.native
  /**
       * Remove a property for the set of matched elements.
       *
       * @param propertyName The name of the property to remove.
       */
  def removeProp(propertyName: java.lang.String): ChaiJQuery = js.native
  /**
       * Replace each target element with the set of matched elements.
       *
       * @param target A selector string, jQuery object, DOM element, or array of elements indicating which element(s) to replace.
       */
  def replaceAll(target: java.lang.String): ChaiJQuery = js.native
  /**
       * Replace each target element with the set of matched elements.
       *
       * @param target A selector string, jQuery object, DOM element, or array of elements indicating which element(s) to replace.
       */
  def replaceAll(target: jqueryLib.JQuery[stdLib.HTMLElement]): ChaiJQuery = js.native
  /**
       * Replace each target element with the set of matched elements.
       *
       * @param target A selector string, jQuery object, DOM element, or array of elements indicating which element(s) to replace.
       */
  def replaceAll(target: js.Array[_]): ChaiJQuery = js.native
  /**
       * Replace each target element with the set of matched elements.
       *
       * @param target A selector string, jQuery object, DOM element, or array of elements indicating which element(s) to replace.
       */
  def replaceAll(target: stdLib.Element): ChaiJQuery = js.native
  /**
       * Replace each element in the set of matched elements with the provided new content and return the set of elements that was removed.
       *
       * param func A function that returns content with which to replace the set of matched elements.
       */
  def replaceWith(func: js.Function0[stdLib.Element | jqueryLib.JQuery[stdLib.HTMLElement]]): ChaiJQuery = js.native
  /**
       * Replace each element in the set of matched elements with the provided new content and return the set of elements that was removed.
       *
       * param newContent The content to insert. May be an HTML string, DOM element, array of DOM elements, or jQuery object.
       */
  def replaceWith(newContent: java.lang.String): ChaiJQuery = js.native
  /**
       * Replace each element in the set of matched elements with the provided new content and return the set of elements that was removed.
       *
       * param newContent The content to insert. May be an HTML string, DOM element, array of DOM elements, or jQuery object.
       */
  def replaceWith(newContent: jqueryLib.JQuery[stdLib.HTMLElement]): ChaiJQuery = js.native
  /**
       * Replace each element in the set of matched elements with the provided new content and return the set of elements that was removed.
       *
       * param newContent The content to insert. May be an HTML string, DOM element, array of DOM elements, or jQuery object.
       */
  def replaceWith(newContent: js.Array[_]): ChaiJQuery = js.native
  /**
       * Replace each element in the set of matched elements with the provided new content and return the set of elements that was removed.
       *
       * param newContent The content to insert. May be an HTML string, DOM element, array of DOM elements, or jQuery object.
       */
  def replaceWith(newContent: stdLib.Element): ChaiJQuery = js.native
  /**
       * Replace each element in the set of matched elements with the provided new content and return the set of elements that was removed.
       *
       * param newContent The content to insert. May be an HTML string, DOM element, array of DOM elements, or jQuery object.
       */
  def replaceWith(newContent: stdLib.Text): ChaiJQuery = js.native
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
  def resize(eventData: js.Object, handler: js.Function1[/* eventObject */ jqueryLib.JQueryEventObject, _]): ChaiJQuery = js.native
  /**
       * Bind an event handler to the "resize" JavaScript event.
       *
       * @param handler A function to execute each time the event is triggered.
       */
  def resize(handler: js.Function1[/* eventObject */ jqueryLib.JQueryEventObject, _]): ChaiJQuery = js.native
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
  def scroll(eventData: js.Object, handler: js.Function1[/* eventObject */ jqueryLib.JQueryEventObject, _]): ChaiJQuery = js.native
  /**
       * Bind an event handler to the "scroll" JavaScript event.
       *
       * @param handler A function to execute each time the event is triggered.
       */
  def scroll(handler: js.Function1[/* eventObject */ jqueryLib.JQueryEventObject, _]): ChaiJQuery = js.native
  /**
       * Get the current horizontal position of the scroll bar for the first element in the set of matched elements or set the horizontal position of the scroll bar for every matched element.
       */
  def scrollLeft(): scala.Double = js.native
  /**
       * Set the current horizontal position of the scroll bar for each of the set of matched elements.
       *
       * @param value An integer indicating the new position to set the scroll bar to.
       */
  def scrollLeft(value: scala.Double): ChaiJQuery = js.native
  /**
       * Get the current vertical position of the scroll bar for the first element in the set of matched elements or set the vertical position of the scroll bar for every matched element.
       */
  def scrollTop(): scala.Double = js.native
  /**
       * Set the current vertical position of the scroll bar for each of the set of matched elements.
       *
       * @param value An integer indicating the new position to set the scroll bar to.
       */
  def scrollTop(value: scala.Double): ChaiJQuery = js.native
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
  def select(eventData: js.Object, handler: js.Function1[/* eventObject */ jqueryLib.JQueryEventObject, _]): ChaiJQuery = js.native
  /**
       * Bind an event handler to the "select" JavaScript event.
       *
       * @param handler A function to execute each time the event is triggered.
       */
  def select(handler: js.Function1[/* eventObject */ jqueryLib.JQueryEventObject, _]): ChaiJQuery = js.native
  /**
       * Encode a set of form elements as a string for submission.
       */
  def serialize(): java.lang.String = js.native
  /**
       * Encode a set of form elements as an array of names and values.
       */
  def serializeArray(): js.Array[jqueryLib.JQuerySerializeArrayElement] = js.native
  def should(selector: java.lang.String): chaiDashJqueryLib.ChaiNs.Assertion = js.native
  /**
       * Display the matched elements.
       *
       * @param duration A string or number determining how long the animation will run.
       * @param complete A function to call once the animation is complete.
       */
  def show(): ChaiJQuery = js.native
  /**
       * Display the matched elements.
       *
       * @param duration A string or number determining how long the animation will run.
       * @param complete A function to call once the animation is complete.
       */
  def show(duration: java.lang.String): ChaiJQuery = js.native
  /**
       * Display the matched elements.
       *
       * @param duration A string or number determining how long the animation will run.
       * @param complete A function to call once the animation is complete.
       */
  def show(duration: java.lang.String, complete: js.Function): ChaiJQuery = js.native
  /**
       * Display the matched elements.
       *
       * @param duration A string or number determining how long the animation will run.
       * @param easing A string indicating which easing function to use for the transition.
       * @param complete A function to call once the animation is complete.
       */
  def show(duration: java.lang.String, easing: java.lang.String): ChaiJQuery = js.native
  /**
       * Display the matched elements.
       *
       * @param duration A string or number determining how long the animation will run.
       * @param easing A string indicating which easing function to use for the transition.
       * @param complete A function to call once the animation is complete.
       */
  def show(duration: java.lang.String, easing: java.lang.String, complete: js.Function): ChaiJQuery = js.native
  /**
       * Display the matched elements.
       *
       * @param duration A string or number determining how long the animation will run.
       * @param complete A function to call once the animation is complete.
       */
  def show(duration: scala.Double): ChaiJQuery = js.native
  /**
       * Display the matched elements.
       *
       * @param duration A string or number determining how long the animation will run.
       * @param complete A function to call once the animation is complete.
       */
  def show(duration: scala.Double, complete: js.Function): ChaiJQuery = js.native
  /**
       * Display the matched elements.
       *
       * @param duration A string or number determining how long the animation will run.
       * @param easing A string indicating which easing function to use for the transition.
       * @param complete A function to call once the animation is complete.
       */
  def show(duration: scala.Double, easing: java.lang.String): ChaiJQuery = js.native
  /**
       * Display the matched elements.
       *
       * @param duration A string or number determining how long the animation will run.
       * @param easing A string indicating which easing function to use for the transition.
       * @param complete A function to call once the animation is complete.
       */
  def show(duration: scala.Double, easing: java.lang.String, complete: js.Function): ChaiJQuery = js.native
  /**
       * Display the matched elements.
       *
       * @param options A map of additional options to pass to the method.
       */
  def show(options: jqueryLib.JQueryAnimationOptions): ChaiJQuery = js.native
  /**
       * Get the siblings of each element in the set of matched elements, optionally filtered by a selector.
       *
       * @param selector A string containing a selector expression to match elements against.
       */
  def siblings(): ChaiJQuery = js.native
  /**
       * Get the siblings of each element in the set of matched elements, optionally filtered by a selector.
       *
       * @param selector A string containing a selector expression to match elements against.
       */
  def siblings(selector: java.lang.String): ChaiJQuery = js.native
  /**
       * Reduce the set of matched elements to a subset specified by a range of indices.
       *
       * @param start An integer indicating the 0-based position at which the elements begin to be selected. If negative, it indicates an offset from the end of the set.
       * @param end An integer indicating the 0-based position at which the elements stop being selected. If negative, it indicates an offset from the end of the set. If omitted, the range continues until the end of the set.
       */
  def slice(start: scala.Double): ChaiJQuery = js.native
  /**
       * Reduce the set of matched elements to a subset specified by a range of indices.
       *
       * @param start An integer indicating the 0-based position at which the elements begin to be selected. If negative, it indicates an offset from the end of the set.
       * @param end An integer indicating the 0-based position at which the elements stop being selected. If negative, it indicates an offset from the end of the set. If omitted, the range continues until the end of the set.
       */
  def slice(start: scala.Double, end: scala.Double): ChaiJQuery = js.native
  /**
       * Display the matched elements with a sliding motion.
       *
       * @param duration A string or number determining how long the animation will run.
       * @param complete A function to call once the animation is complete.
       */
  def slideDown(): ChaiJQuery = js.native
  /**
       * Display the matched elements with a sliding motion.
       *
       * @param duration A string or number determining how long the animation will run.
       * @param complete A function to call once the animation is complete.
       */
  def slideDown(duration: java.lang.String): ChaiJQuery = js.native
  /**
       * Display the matched elements with a sliding motion.
       *
       * @param duration A string or number determining how long the animation will run.
       * @param complete A function to call once the animation is complete.
       */
  def slideDown(duration: java.lang.String, complete: js.Function): ChaiJQuery = js.native
  /**
       * Display the matched elements with a sliding motion.
       *
       * @param duration A string or number determining how long the animation will run.
       * @param easing A string indicating which easing function to use for the transition.
       * @param complete A function to call once the animation is complete.
       */
  def slideDown(duration: java.lang.String, easing: java.lang.String): ChaiJQuery = js.native
  /**
       * Display the matched elements with a sliding motion.
       *
       * @param duration A string or number determining how long the animation will run.
       * @param easing A string indicating which easing function to use for the transition.
       * @param complete A function to call once the animation is complete.
       */
  def slideDown(duration: java.lang.String, easing: java.lang.String, complete: js.Function): ChaiJQuery = js.native
  /**
       * Display the matched elements with a sliding motion.
       *
       * @param duration A string or number determining how long the animation will run.
       * @param complete A function to call once the animation is complete.
       */
  def slideDown(duration: scala.Double): ChaiJQuery = js.native
  /**
       * Display the matched elements with a sliding motion.
       *
       * @param duration A string or number determining how long the animation will run.
       * @param complete A function to call once the animation is complete.
       */
  def slideDown(duration: scala.Double, complete: js.Function): ChaiJQuery = js.native
  /**
       * Display the matched elements with a sliding motion.
       *
       * @param duration A string or number determining how long the animation will run.
       * @param easing A string indicating which easing function to use for the transition.
       * @param complete A function to call once the animation is complete.
       */
  def slideDown(duration: scala.Double, easing: java.lang.String): ChaiJQuery = js.native
  /**
       * Display the matched elements with a sliding motion.
       *
       * @param duration A string or number determining how long the animation will run.
       * @param easing A string indicating which easing function to use for the transition.
       * @param complete A function to call once the animation is complete.
       */
  def slideDown(duration: scala.Double, easing: java.lang.String, complete: js.Function): ChaiJQuery = js.native
  /**
       * Display the matched elements with a sliding motion.
       *
       * @param options A map of additional options to pass to the method.
       */
  def slideDown(options: jqueryLib.JQueryAnimationOptions): ChaiJQuery = js.native
  /**
       * Display or hide the matched elements with a sliding motion.
       *
       * @param duration A string or number determining how long the animation will run.
       * @param complete A function to call once the animation is complete.
       */
  def slideToggle(): ChaiJQuery = js.native
  /**
       * Display or hide the matched elements with a sliding motion.
       *
       * @param duration A string or number determining how long the animation will run.
       * @param complete A function to call once the animation is complete.
       */
  def slideToggle(duration: java.lang.String): ChaiJQuery = js.native
  /**
       * Display or hide the matched elements with a sliding motion.
       *
       * @param duration A string or number determining how long the animation will run.
       * @param complete A function to call once the animation is complete.
       */
  def slideToggle(duration: java.lang.String, complete: js.Function): ChaiJQuery = js.native
  /**
       * Display or hide the matched elements with a sliding motion.
       *
       * @param duration A string or number determining how long the animation will run.
       * @param easing A string indicating which easing function to use for the transition.
       * @param complete A function to call once the animation is complete.
       */
  def slideToggle(duration: java.lang.String, easing: java.lang.String): ChaiJQuery = js.native
  /**
       * Display or hide the matched elements with a sliding motion.
       *
       * @param duration A string or number determining how long the animation will run.
       * @param easing A string indicating which easing function to use for the transition.
       * @param complete A function to call once the animation is complete.
       */
  def slideToggle(duration: java.lang.String, easing: java.lang.String, complete: js.Function): ChaiJQuery = js.native
  /**
       * Display or hide the matched elements with a sliding motion.
       *
       * @param duration A string or number determining how long the animation will run.
       * @param complete A function to call once the animation is complete.
       */
  def slideToggle(duration: scala.Double): ChaiJQuery = js.native
  /**
       * Display or hide the matched elements with a sliding motion.
       *
       * @param duration A string or number determining how long the animation will run.
       * @param complete A function to call once the animation is complete.
       */
  def slideToggle(duration: scala.Double, complete: js.Function): ChaiJQuery = js.native
  /**
       * Display or hide the matched elements with a sliding motion.
       *
       * @param duration A string or number determining how long the animation will run.
       * @param easing A string indicating which easing function to use for the transition.
       * @param complete A function to call once the animation is complete.
       */
  def slideToggle(duration: scala.Double, easing: java.lang.String): ChaiJQuery = js.native
  /**
       * Display or hide the matched elements with a sliding motion.
       *
       * @param duration A string or number determining how long the animation will run.
       * @param easing A string indicating which easing function to use for the transition.
       * @param complete A function to call once the animation is complete.
       */
  def slideToggle(duration: scala.Double, easing: java.lang.String, complete: js.Function): ChaiJQuery = js.native
  /**
       * Display or hide the matched elements with a sliding motion.
       *
       * @param options A map of additional options to pass to the method.
       */
  def slideToggle(options: jqueryLib.JQueryAnimationOptions): ChaiJQuery = js.native
  /**
       * Hide the matched elements with a sliding motion.
       *
       * @param duration A string or number determining how long the animation will run.
       * @param complete A function to call once the animation is complete.
       */
  def slideUp(): ChaiJQuery = js.native
  /**
       * Hide the matched elements with a sliding motion.
       *
       * @param duration A string or number determining how long the animation will run.
       * @param complete A function to call once the animation is complete.
       */
  def slideUp(duration: java.lang.String): ChaiJQuery = js.native
  /**
       * Hide the matched elements with a sliding motion.
       *
       * @param duration A string or number determining how long the animation will run.
       * @param complete A function to call once the animation is complete.
       */
  def slideUp(duration: java.lang.String, complete: js.Function): ChaiJQuery = js.native
  /**
       * Hide the matched elements with a sliding motion.
       *
       * @param duration A string or number determining how long the animation will run.
       * @param easing A string indicating which easing function to use for the transition.
       * @param complete A function to call once the animation is complete.
       */
  def slideUp(duration: java.lang.String, easing: java.lang.String): ChaiJQuery = js.native
  /**
       * Hide the matched elements with a sliding motion.
       *
       * @param duration A string or number determining how long the animation will run.
       * @param easing A string indicating which easing function to use for the transition.
       * @param complete A function to call once the animation is complete.
       */
  def slideUp(duration: java.lang.String, easing: java.lang.String, complete: js.Function): ChaiJQuery = js.native
  /**
       * Hide the matched elements with a sliding motion.
       *
       * @param duration A string or number determining how long the animation will run.
       * @param complete A function to call once the animation is complete.
       */
  def slideUp(duration: scala.Double): ChaiJQuery = js.native
  /**
       * Hide the matched elements with a sliding motion.
       *
       * @param duration A string or number determining how long the animation will run.
       * @param complete A function to call once the animation is complete.
       */
  def slideUp(duration: scala.Double, complete: js.Function): ChaiJQuery = js.native
  /**
       * Hide the matched elements with a sliding motion.
       *
       * @param duration A string or number determining how long the animation will run.
       * @param easing A string indicating which easing function to use for the transition.
       * @param complete A function to call once the animation is complete.
       */
  def slideUp(duration: scala.Double, easing: java.lang.String): ChaiJQuery = js.native
  /**
       * Hide the matched elements with a sliding motion.
       *
       * @param duration A string or number determining how long the animation will run.
       * @param easing A string indicating which easing function to use for the transition.
       * @param complete A function to call once the animation is complete.
       */
  def slideUp(duration: scala.Double, easing: java.lang.String, complete: js.Function): ChaiJQuery = js.native
  /**
       * Hide the matched elements with a sliding motion.
       *
       * @param options A map of additional options to pass to the method.
       */
  def slideUp(options: jqueryLib.JQueryAnimationOptions): ChaiJQuery = js.native
  /**
       * Stop the currently-running animation on the matched elements.
       *
       * @param clearQueue A Boolean indicating whether to remove queued animation as well. Defaults to false.
       * @param jumpToEnd A Boolean indicating whether to complete the current animation immediately. Defaults to false.
       */
  def stop(): ChaiJQuery = js.native
  /**
       * Stop the currently-running animation on the matched elements.
       *
       * @param clearQueue A Boolean indicating whether to remove queued animation as well. Defaults to false.
       * @param jumpToEnd A Boolean indicating whether to complete the current animation immediately. Defaults to false.
       */
  def stop(clearQueue: scala.Boolean): ChaiJQuery = js.native
  /**
       * Stop the currently-running animation on the matched elements.
       *
       * @param clearQueue A Boolean indicating whether to remove queued animation as well. Defaults to false.
       * @param jumpToEnd A Boolean indicating whether to complete the current animation immediately. Defaults to false.
       */
  def stop(clearQueue: scala.Boolean, jumpToEnd: scala.Boolean): ChaiJQuery = js.native
  /**
       * Stop the currently-running animation on the matched elements.
       *
       * @param queue The name of the queue in which to stop animations.
       * @param clearQueue A Boolean indicating whether to remove queued animation as well. Defaults to false.
       * @param jumpToEnd A Boolean indicating whether to complete the current animation immediately. Defaults to false.
       */
  def stop(queue: java.lang.String): ChaiJQuery = js.native
  /**
       * Stop the currently-running animation on the matched elements.
       *
       * @param queue The name of the queue in which to stop animations.
       * @param clearQueue A Boolean indicating whether to remove queued animation as well. Defaults to false.
       * @param jumpToEnd A Boolean indicating whether to complete the current animation immediately. Defaults to false.
       */
  def stop(queue: java.lang.String, clearQueue: scala.Boolean): ChaiJQuery = js.native
  /**
       * Stop the currently-running animation on the matched elements.
       *
       * @param queue The name of the queue in which to stop animations.
       * @param clearQueue A Boolean indicating whether to remove queued animation as well. Defaults to false.
       * @param jumpToEnd A Boolean indicating whether to complete the current animation immediately. Defaults to false.
       */
  def stop(queue: java.lang.String, clearQueue: scala.Boolean, jumpToEnd: scala.Boolean): ChaiJQuery = js.native
  /**
       * Trigger the "submit" event on an element.
       */
  def submit(): ChaiJQuery = js.native
  /**
       * Bind an event handler to the "submit" JavaScript event
       *
       * @param eventData An object containing data that will be passed to the event handler.
       * @param handler A function to execute each time the event is triggered.
       */
  def submit(eventData: js.Any): ChaiJQuery = js.native
  /**
       * Bind an event handler to the "submit" JavaScript event
       *
       * @param eventData An object containing data that will be passed to the event handler.
       * @param handler A function to execute each time the event is triggered.
       */
  def submit(eventData: js.Any, handler: js.Function1[/* eventObject */ jqueryLib.JQueryEventObject, _]): ChaiJQuery = js.native
  /**
       * Bind an event handler to the "submit" JavaScript event
       *
       * @param handler A function to execute each time the event is triggered.
       */
  def submit(handler: js.Function1[/* eventObject */ jqueryLib.JQueryEventObject, _]): ChaiJQuery = js.native
  /**
       * Get the combined text contents of each element in the set of matched elements, including their descendants.
       */
  def text(): java.lang.String = js.native
  /**
       * Set the content of each element in the set of matched elements to the specified text.
       *
       * @param func A function returning the text content to set. Receives the index position of the element in the set and the old text value as arguments.
       */
  def text(func: js.Function2[/* index */ scala.Double, /* text */ java.lang.String, java.lang.String]): ChaiJQuery = js.native
  /**
       * Set the content of each element in the set of matched elements to the specified text.
       *
       * @param text The text to set as the content of each matched element. When Number or Boolean is supplied, it will be converted to a String representation.
       */
  def text(text: java.lang.String): ChaiJQuery = js.native
  /**
       * Set the content of each element in the set of matched elements to the specified text.
       *
       * @param text The text to set as the content of each matched element. When Number or Boolean is supplied, it will be converted to a String representation.
       */
  def text(text: scala.Boolean): ChaiJQuery = js.native
  /**
       * Set the content of each element in the set of matched elements to the specified text.
       *
       * @param text The text to set as the content of each matched element. When Number or Boolean is supplied, it will be converted to a String representation.
       */
  def text(text: scala.Double): ChaiJQuery = js.native
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
  /**
       * Display or hide the matched elements.
       *
       * @param duration A string or number determining how long the animation will run.
       * @param complete A function to call once the animation is complete.
       */
  def toggle(duration: java.lang.String): ChaiJQuery = js.native
  /**
       * Display or hide the matched elements.
       *
       * @param duration A string or number determining how long the animation will run.
       * @param complete A function to call once the animation is complete.
       */
  def toggle(duration: java.lang.String, complete: js.Function): ChaiJQuery = js.native
  /**
       * Display or hide the matched elements.
       *
       * @param duration A string or number determining how long the animation will run.
       * @param easing A string indicating which easing function to use for the transition.
       * @param complete A function to call once the animation is complete.
       */
  def toggle(duration: java.lang.String, easing: java.lang.String): ChaiJQuery = js.native
  /**
       * Display or hide the matched elements.
       *
       * @param duration A string or number determining how long the animation will run.
       * @param easing A string indicating which easing function to use for the transition.
       * @param complete A function to call once the animation is complete.
       */
  def toggle(duration: java.lang.String, easing: java.lang.String, complete: js.Function): ChaiJQuery = js.native
  /**
       * Display or hide the matched elements.
       *
       * @param duration A string or number determining how long the animation will run.
       * @param complete A function to call once the animation is complete.
       */
  def toggle(duration: scala.Double): ChaiJQuery = js.native
  /**
       * Display or hide the matched elements.
       *
       * @param duration A string or number determining how long the animation will run.
       * @param complete A function to call once the animation is complete.
       */
  def toggle(duration: scala.Double, complete: js.Function): ChaiJQuery = js.native
  /**
       * Display or hide the matched elements.
       *
       * @param duration A string or number determining how long the animation will run.
       * @param easing A string indicating which easing function to use for the transition.
       * @param complete A function to call once the animation is complete.
       */
  def toggle(duration: scala.Double, easing: java.lang.String): ChaiJQuery = js.native
  /**
       * Display or hide the matched elements.
       *
       * @param duration A string or number determining how long the animation will run.
       * @param easing A string indicating which easing function to use for the transition.
       * @param complete A function to call once the animation is complete.
       */
  def toggle(duration: scala.Double, easing: java.lang.String, complete: js.Function): ChaiJQuery = js.native
  /**
       * Display or hide the matched elements.
       *
       * @param options A map of additional options to pass to the method.
       */
  def toggle(options: jqueryLib.JQueryAnimationOptions): ChaiJQuery = js.native
  /**
       * Display or hide the matched elements.
       *
       * @param showOrHide A Boolean indicating whether to show or hide the elements.
       */
  def toggle(showOrHide: scala.Boolean): ChaiJQuery = js.native
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
  def toggleClass(className: java.lang.String): ChaiJQuery = js.native
  /**
       * Add or remove one or more classes from each element in the set of matched elements, depending on either the class's presence or the value of the switch argument.
       *
       * @param className One or more class names (separated by spaces) to be toggled for each element in the matched set.
       * @param swtch A Boolean (not just truthy/falsy) value to determine whether the class should be added or removed.
       */
  def toggleClass(className: java.lang.String, swtch: scala.Boolean): ChaiJQuery = js.native
  /**
       * Add or remove one or more classes from each element in the set of matched elements, depending on either the class's presence or the value of the switch argument.
       *
       * @param func A function that returns class names to be toggled in the class attribute of each element in the matched set. Receives the index position of the element in the set, the old class value, and the switch as arguments.
       * @param swtch A boolean value to determine whether the class should be added or removed.
       */
  def toggleClass(
    func: js.Function3[
      /* index */ scala.Double, 
      /* className */ java.lang.String, 
      /* swtch */ scala.Boolean, 
      java.lang.String
    ]
  ): ChaiJQuery = js.native
  /**
       * Add or remove one or more classes from each element in the set of matched elements, depending on either the class's presence or the value of the switch argument.
       *
       * @param func A function that returns class names to be toggled in the class attribute of each element in the matched set. Receives the index position of the element in the set, the old class value, and the switch as arguments.
       * @param swtch A boolean value to determine whether the class should be added or removed.
       */
  def toggleClass(
    func: js.Function3[
      /* index */ scala.Double, 
      /* className */ java.lang.String, 
      /* swtch */ scala.Boolean, 
      java.lang.String
    ],
    swtch: scala.Boolean
  ): ChaiJQuery = js.native
  /**
       * Add or remove one or more classes from each element in the set of matched elements, depending on either the class's presence or the value of the switch argument.
       *
       * @param swtch A boolean value to determine whether the class should be added or removed.
       */
  def toggleClass(swtch: scala.Boolean): ChaiJQuery = js.native
  /**
       * Execute all handlers and behaviors attached to the matched elements for the given event type.
       *
       * @param eventType A string containing a JavaScript event type, such as click or submit.
       * @param extraParameters Additional parameters to pass along to the event handler.
       */
  def trigger(eventType: java.lang.String): ChaiJQuery = js.native
  /**
       * Execute all handlers and behaviors attached to the matched elements for the given event type.
       *
       * @param eventType A string containing a JavaScript event type, such as click or submit.
       * @param extraParameters Additional parameters to pass along to the event handler.
       */
  def trigger(eventType: java.lang.String, extraParameters: js.Array[_]): ChaiJQuery = js.native
  /**
       * Execute all handlers and behaviors attached to the matched elements for the given event type.
       *
       * @param eventType A string containing a JavaScript event type, such as click or submit.
       * @param extraParameters Additional parameters to pass along to the event handler.
       */
  def trigger(eventType: java.lang.String, extraParameters: js.Object): ChaiJQuery = js.native
  /**
       * Execute all handlers and behaviors attached to the matched elements for the given event type.
       *
       * @param event A jQuery.Event object.
       * @param extraParameters Additional parameters to pass along to the event handler.
       */
  def trigger(event: jqueryLib.JQueryEventObject): ChaiJQuery = js.native
  /**
       * Execute all handlers and behaviors attached to the matched elements for the given event type.
       *
       * @param event A jQuery.Event object.
       * @param extraParameters Additional parameters to pass along to the event handler.
       */
  def trigger(event: jqueryLib.JQueryEventObject, extraParameters: js.Array[_]): ChaiJQuery = js.native
  /**
       * Execute all handlers and behaviors attached to the matched elements for the given event type.
       *
       * @param event A jQuery.Event object.
       * @param extraParameters Additional parameters to pass along to the event handler.
       */
  def trigger(event: jqueryLib.JQueryEventObject, extraParameters: js.Object): ChaiJQuery = js.native
  /**
       * Execute all handlers attached to an element for an event.
       *
       * @param eventType A string containing a JavaScript event type, such as click or submit.
       * @param extraParameters An array of additional parameters to pass along to the event handler.
       */
  def triggerHandler(eventType: java.lang.String, extraParameters: js.Any*): js.Object = js.native
  /**
       * Remove a previously-attached event handler from the elements.
       *
       * @param eventType A string containing a JavaScript event type, such as click or submit.
       * @param handler The function that is to be no longer executed.
       */
  def unbind(): ChaiJQuery = js.native
  /**
       * Remove a previously-attached event handler from the elements.
       *
       * @param eventType A string containing a JavaScript event type, such as click or submit.
       * @param handler The function that is to be no longer executed.
       */
  def unbind(eventType: java.lang.String): ChaiJQuery = js.native
  /**
       * Remove a previously-attached event handler from the elements.
       *
       * @param eventType A string containing a JavaScript event type, such as click or submit.
       * @param fls Unbinds the corresponding 'return false' function that was bound using .bind( eventType, false ).
       */
  def unbind(eventType: java.lang.String, fls: scala.Boolean): ChaiJQuery = js.native
  /**
       * Remove a previously-attached event handler from the elements.
       *
       * @param eventType A string containing a JavaScript event type, such as click or submit.
       * @param handler The function that is to be no longer executed.
       */
  def unbind(
    eventType: java.lang.String,
    handler: js.Function1[/* eventObject */ jqueryLib.JQueryEventObject, _]
  ): ChaiJQuery = js.native
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
  def undelegate(namespace: java.lang.String): ChaiJQuery = js.native
  /**
       * Remove a handler from the event for all elements which match the current selector, based upon a specific set of root elements.
       *
       * @param selector A selector which will be used to filter the event results.
       * @param eventType A string containing a JavaScript event type, such as "click" or "keydown"
       * @param handler A function to execute at the time the event is triggered.
       */
  def undelegate(selector: java.lang.String, eventType: java.lang.String): ChaiJQuery = js.native
  /**
       * Remove a handler from the event for all elements which match the current selector, based upon a specific set of root elements.
       *
       * @param selector A selector which will be used to filter the event results.
       * @param eventType A string containing a JavaScript event type, such as "click" or "keydown"
       * @param handler A function to execute at the time the event is triggered.
       */
  def undelegate(
    selector: java.lang.String,
    eventType: java.lang.String,
    handler: js.Function1[/* eventObject */ jqueryLib.JQueryEventObject, _]
  ): ChaiJQuery = js.native
  /**
       * Remove a handler from the event for all elements which match the current selector, based upon a specific set of root elements.
       *
       * @param selector A selector which will be used to filter the event results.
       * @param events An object of one or more event types and previously bound functions to unbind from them.
       */
  def undelegate(selector: java.lang.String, events: js.Object): ChaiJQuery = js.native
  /**
       * Bind an event handler to the "unload" JavaScript event. (DEPRECATED from v1.8)
       *
       * @param eventData A plain object of data that will be passed to the event handler.
       * @param handler A function to execute when the event is triggered.
       */
  def unload(): ChaiJQuery = js.native
  /**
       * Bind an event handler to the "unload" JavaScript event. (DEPRECATED from v1.8)
       *
       * @param eventData A plain object of data that will be passed to the event handler.
       * @param handler A function to execute when the event is triggered.
       */
  def unload(eventData: js.Any): ChaiJQuery = js.native
  /**
       * Bind an event handler to the "unload" JavaScript event. (DEPRECATED from v1.8)
       *
       * @param eventData A plain object of data that will be passed to the event handler.
       * @param handler A function to execute when the event is triggered.
       */
  def unload(eventData: js.Any, handler: js.Function1[/* eventObject */ jqueryLib.JQueryEventObject, _]): ChaiJQuery = js.native
  /**
       * Bind an event handler to the "unload" JavaScript event. (DEPRECATED from v1.8)
       *
       * @param handler A function to execute when the event is triggered.
       */
  def unload(handler: js.Function1[/* eventObject */ jqueryLib.JQueryEventObject, _]): ChaiJQuery = js.native
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
  def `val`(func: js.Function2[/* index */ scala.Double, /* value */ java.lang.String, java.lang.String]): ChaiJQuery = js.native
  /**
       * Set the value of each element in the set of matched elements.
       *
       * @param value A string of text or an array of strings corresponding to the value of each matched element to set as selected/checked.
       */
  def `val`(value: java.lang.String): ChaiJQuery = js.native
  /**
       * Set the value of each element in the set of matched elements.
       *
       * @param value A string of text or an array of strings corresponding to the value of each matched element to set as selected/checked.
       */
  def `val`(value: js.Array[java.lang.String]): ChaiJQuery = js.native
  /**
       * Get the current computed width for the first element in the set of matched elements.
       */
  def width(): scala.Double = js.native
  /**
       * Set the CSS width of each element in the set of matched elements.
       *
       * @param func A function returning the width to set. Receives the index position of the element in the set and the old width as arguments. Within the function, this refers to the current element in the set.
       */
  def width(
    func: js.Function2[/* index */ scala.Double, /* width */ scala.Double, scala.Double | java.lang.String]
  ): ChaiJQuery = js.native
  /**
       * Set the CSS width of each element in the set of matched elements.
       *
       * @param value An integer representing the number of pixels, or an integer along with an optional unit of measure appended (as a string).
       */
  def width(value: java.lang.String): ChaiJQuery = js.native
  /**
       * Set the CSS width of each element in the set of matched elements.
       *
       * @param value An integer representing the number of pixels, or an integer along with an optional unit of measure appended (as a string).
       */
  def width(value: scala.Double): ChaiJQuery = js.native
  /**
       * Wrap an HTML structure around each element in the set of matched elements.
       *
       * @param func A callback function returning the HTML content or jQuery object to wrap around the matched elements. Receives the index position of the element in the set as an argument. Within the function, this refers to the current element in the set.
       */
  def wrap(
    func: js.Function1[/* index */ scala.Double, java.lang.String | jqueryLib.JQuery[stdLib.HTMLElement]]
  ): ChaiJQuery = js.native
  /**
       * Wrap an HTML structure around each element in the set of matched elements.
       *
       * @param wrappingElement A selector, element, HTML string, or jQuery object specifying the structure to wrap around the matched elements.
       */
  def wrap(wrappingElement: java.lang.String): ChaiJQuery = js.native
  /**
       * Wrap an HTML structure around each element in the set of matched elements.
       *
       * @param wrappingElement A selector, element, HTML string, or jQuery object specifying the structure to wrap around the matched elements.
       */
  def wrap(wrappingElement: jqueryLib.JQuery[stdLib.HTMLElement]): ChaiJQuery = js.native
  /**
       * Wrap an HTML structure around each element in the set of matched elements.
       *
       * @param wrappingElement A selector, element, HTML string, or jQuery object specifying the structure to wrap around the matched elements.
       */
  def wrap(wrappingElement: stdLib.Element): ChaiJQuery = js.native
  def wrapAll(func: js.Function1[/* index */ scala.Double, java.lang.String]): ChaiJQuery = js.native
  /**
       * Wrap an HTML structure around all elements in the set of matched elements.
       *
       * @param wrappingElement A selector, element, HTML string, or jQuery object specifying the structure to wrap around the matched elements.
       */
  def wrapAll(wrappingElement: java.lang.String): ChaiJQuery = js.native
  /**
       * Wrap an HTML structure around all elements in the set of matched elements.
       *
       * @param wrappingElement A selector, element, HTML string, or jQuery object specifying the structure to wrap around the matched elements.
       */
  def wrapAll(wrappingElement: jqueryLib.JQuery[stdLib.HTMLElement]): ChaiJQuery = js.native
  /**
       * Wrap an HTML structure around all elements in the set of matched elements.
       *
       * @param wrappingElement A selector, element, HTML string, or jQuery object specifying the structure to wrap around the matched elements.
       */
  def wrapAll(wrappingElement: stdLib.Element): ChaiJQuery = js.native
  /**
       * Wrap an HTML structure around the content of each element in the set of matched elements.
       *
       * @param func A callback function which generates a structure to wrap around the content of the matched elements. Receives the index position of the element in the set as an argument. Within the function, this refers to the current element in the set.
       */
  def wrapInner(func: js.Function1[/* index */ scala.Double, java.lang.String]): ChaiJQuery = js.native
  /**
       * Wrap an HTML structure around the content of each element in the set of matched elements.
       *
       * @param wrappingElement An HTML snippet, selector expression, jQuery object, or DOM element specifying the structure to wrap around the content of the matched elements.
       */
  def wrapInner(wrappingElement: java.lang.String): ChaiJQuery = js.native
  /**
       * Wrap an HTML structure around the content of each element in the set of matched elements.
       *
       * @param wrappingElement An HTML snippet, selector expression, jQuery object, or DOM element specifying the structure to wrap around the content of the matched elements.
       */
  def wrapInner(wrappingElement: jqueryLib.JQuery[stdLib.HTMLElement]): ChaiJQuery = js.native
  /**
       * Wrap an HTML structure around the content of each element in the set of matched elements.
       *
       * @param wrappingElement An HTML snippet, selector expression, jQuery object, or DOM element specifying the structure to wrap around the content of the matched elements.
       */
  def wrapInner(wrappingElement: stdLib.Element): ChaiJQuery = js.native
}

