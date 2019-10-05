package typings.cypress

import typings.cypress.JQuery.AjaxSettings
import typings.cypress.JQuery.CSSHook
import typings.cypress.JQuery.DeferredStatic
import typings.cypress.JQuery.Duration
import typings.cypress.JQuery.EffectsOptions
import typings.cypress.JQuery.EventLike
import typings.cypress.JQuery.EventStatic
import typings.cypress.JQuery.PlainObject
import typings.cypress.JQuery.Promise
import typings.cypress.JQuery.Promise2
import typings.cypress.JQuery.Promise3
import typings.cypress.JQuery.Queue
import typings.cypress.JQuery.QueueFunction
import typings.cypress.JQuery.Selector
import typings.cypress.JQuery.SpeedSettings
import typings.cypress.JQuery.Thenable
import typings.cypress.JQuery.Transport
import typings.cypress.JQuery.TypeOrArray
import typings.cypress.JQuery.UrlAjaxSettings
import typings.cypress.JQuery.ValHook
import typings.cypress.JQuery.htmlString
import typings.cypress.JQuery.jqXHR
import typings.cypress.JQuery.jqXHR.DoneCallback
import typings.cypress.cypressNumbers.`false`
import typings.cypress.cypressNumbers.`true`
import typings.cypress.cypressStrings.`null`
import typings.cypress.cypressStrings.`object`
import typings.cypress.cypressStrings.array
import typings.cypress.cypressStrings.boolean
import typings.cypress.cypressStrings.date
import typings.cypress.cypressStrings.error
import typings.cypress.cypressStrings.function
import typings.cypress.cypressStrings.number
import typings.cypress.cypressStrings.regexp
import typings.cypress.cypressStrings.string
import typings.cypress.cypressStrings.symbol
import typings.cypress.cypressStrings.undefined
import typings.std.ArrayLike
import typings.std.Document
import typings.std.Element
import typings.std.Error
import typings.std.EventTarget
import typings.std.HTMLElement
import typings.std.Node
import typings.std.XMLDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQueryStatic extends js.Object {
  /**
    * A factory function that returns a chainable utility object with methods to register multiple
    * callbacks into callback queues, invoke callback queues, and relay the success or failure state of
    * any synchronous or asynchronous function.
    *
    * @param beforeStart A function that is called just before the constructor returns.
    * @see \`{@link https://api.jquery.com/jQuery.Deferred/ }\`
    * @since 1.5
    */
  @JSName("Deferred")
  var Deferred_Original: DeferredStatic = js.native
  @JSName("Event")
  var Event_Original: EventStatic = js.native
  /**
    * @see \`{@link http://api.jquery.com/jquery.ajax/#jQuery-ajax1 }\`
    *
    * @deprecated Use \`{@link JQueryStatic.ajaxSetup }\`.
    */
  var ajaxSettings: AjaxSettings[_] = js.native
  /**
    * Hook directly into jQuery to override how particular CSS properties are retrieved or set, normalize
    * CSS property naming, or create custom properties.
    *
    * @see \`{@link https://api.jquery.com/jQuery.cssHooks/ }\`
    * @since 1.4.3
    */
  // Set to HTMLElement to minimize breaks but should probably be Element.
  var cssHooks: PlainObject[CSSHook[HTMLElement]] = js.native
  /**
    * An object containing all CSS properties that may be used without a unit. The .css() method uses this
    * object to see if it may append px to unitless values.
    *
    * @see \`{@link https://api.jquery.com/jQuery.cssNumber/ }\`
    * @since 1.4.3
    */
  var cssNumber: PlainObject[Boolean] = js.native
  // Set to HTMLElement to minimize breaks but should probably be Element.
  val fn: JQuery[HTMLElement] = js.native
  var fx: Anon_IntervalOff = js.native
  /**
    * A Promise-like object (or "thenable") that resolves when the document is ready.
    *
    * @see \`{@link https://api.jquery.com/jQuery.ready/ }\`
    * @since 1.8
    */
  var ready: Thenable[JQueryStatic] = js.native
  /**
    * A collection of properties that represent the presence of different browser features or bugs.
    * Intended for jQuery's internal use; specific properties may be removed when they are no longer
    * needed internally to improve page startup performance. For your own project's feature-detection
    * needs, we strongly recommend the use of an external library such as Modernizr instead of dependency
    * on properties in jQuery.support.
    *
    * @see \`{@link https://api.jquery.com/jQuery.support/ }\`
    * @since 1.3
    *
    * @deprecated Deprecated since 1.9. See \`{@link https://api.jquery.com/jQuery.support/ }\`.
    */
  var support: PlainObject[_] = js.native
  // Set to HTMLElement to minimize breaks but should probably be Element.
  var valHooks: PlainObject[ValHook[HTMLElement]] = js.native
  // HACK: This is the factory function returned when importing jQuery without a DOM. Declaring it separately breaks using the type parameter on JQueryStatic.
  // HACK: The discriminator parameter handles the edge case of passing a Window object to JQueryStatic. It doesn't actually exist on the factory function.
  def apply(window: Window, discriminator: Boolean): JQueryStatic = js.native
  /**
    * Returns an empty jQuery set.
    *
    * @see \`{@link https://api.jquery.com/jQuery/ }\`
    * @since 1.4
    */
  // tslint:disable-next-line:no-unnecessary-generics
  def apply[TElement](): JQuery[TElement] = js.native
  /**
    * Binds a function to be executed when the DOM has finished loading.
    *
    * @param callback The function to execute when the DOM is ready.
    * @see \`{@link https://api.jquery.com/jQuery/ }\`
    * @since 1.0
    */
  // tslint:disable-next-line:no-unnecessary-generics unified-signatures
  def apply[TElement](callback: js.ThisFunction1[/* this */ Document, /* $ */ this.type, Unit]): JQuery[TElement] = js.native
  /**
    * Return a collection of matched elements either found in the DOM based on passed argument(s) or created
    * by passing an HTML string.
    *
    * @param elementArray An array containing a set of DOM elements to wrap in a jQuery object.
    * @see \`{@link https://api.jquery.com/jQuery/ }\`
    * @since 1.0
    */
  // Using a unified signature is not possible due to a TypeScript 2.4 bug (DefinitelyTyped#27810)
  // tslint:disable-next-line:unified-signatures
  def apply[T /* <: Element */](elementArray: js.Array[T]): JQuery[T] = js.native
  /**
    * Return a collection of matched elements either found in the DOM based on passed argument(s) or created
    * by passing an HTML string.
    *
    * @param element A DOM element to wrap in a jQuery object.
    * @see \`{@link https://api.jquery.com/jQuery/ }\`
    * @since 1.0
    */
  // Using a unified signature is not possible due to a TypeScript 2.4 bug (DefinitelyTyped#27810)
  // tslint:disable-next-line:unified-signatures
  def apply[T /* <: Element */](element: T): JQuery[T] = js.native
  /**
    * Creates DOM elements on the fly from the provided string of raw HTML.
    *
    * @param html A string of HTML to create on the fly. Note that this parses HTML, not XML.
    *             A string defining a single, standalone, HTML element (e.g. <div/> or <div></div>).
    * @param ownerDocument_attributes A document in which the new elements will be created.
    *                                 An object of attributes, events, and methods to call on the newly-created element.
    * @see \`{@link https://api.jquery.com/jQuery/ }\`
    * @since 1.0
    * @since 1.4
    */
  // tslint:disable-next-line:no-unnecessary-generics
  def apply[TElement /* <: HTMLElement */](html: htmlString): JQuery[TElement] = js.native
  def apply[TElement /* <: HTMLElement */](html: htmlString, ownerDocument_attributes: PlainObject[_]): JQuery[TElement] = js.native
  def apply[TElement /* <: HTMLElement */](html: htmlString, ownerDocument_attributes: Document): JQuery[TElement] = js.native
  /**
    * Return a collection of matched elements either found in the DOM based on passed argument(s) or created
    * by passing an HTML string.
    *
    * @param selection An existing jQuery object to clone.
    * @see \`{@link https://api.jquery.com/jQuery/ }\`
    * @since 1.0
    */
  def apply[T](selection: JQuery[T]): JQuery[T] = js.native
  def apply[TElement /* <: Element */](selector: Selector, context: JQuery[HTMLElement]): JQuery[TElement] = js.native
  def apply[TElement /* <: Element */](selector: Selector, context: Element): JQuery[TElement] = js.native
  /**
    * A multi-purpose callbacks list object that provides a powerful way to manage callback lists.
    *
    * @param flags An optional list of space-separated flags that change how the callback list behaves.
    * @see \`{@link https://api.jquery.com/jQuery.Callbacks/ }\`
    * @since 1.7
    */
  // tslint:disable-next-line:ban-types no-unnecessary-generics
  def Callbacks[T /* <: js.Function */](): typings.cypress.JQuery.Callbacks[T] = js.native
  def Callbacks[T /* <: js.Function */](flags: String): typings.cypress.JQuery.Callbacks[T] = js.native
  /**
    * A factory function that returns a chainable utility object with methods to register multiple
    * callbacks into callback queues, invoke callback queues, and relay the success or failure state of
    * any synchronous or asynchronous function.
    *
    * @param beforeStart A function that is called just before the constructor returns.
    * @see \`{@link https://api.jquery.com/jQuery.Deferred/ }\`
    * @since 1.5
    */
  def Deferred[TR, TJ, TN](): typings.cypress.JQuery.Deferred[TR, TJ, TN] = js.native
  def Deferred[TR, TJ, TN](
    beforeStart: js.ThisFunction1[
      /* this */ typings.cypress.JQuery.Deferred[TR, TJ, TN], 
      /* deferred */ typings.cypress.JQuery.Deferred[TR, TJ, TN], 
      Unit
    ]
  ): typings.cypress.JQuery.Deferred[TR, TJ, TN] = js.native
  // tslint:disable-next-line:no-unnecessary-generics
  def Event[T /* <: js.Object */, TTarget /* <: EventTarget */](event: String): (typings.cypress.JQuery.Event[TTarget, Null]) with T = js.native
  def Event[T /* <: js.Object */, TTarget /* <: EventTarget */](event: String, properties: T): (typings.cypress.JQuery.Event[TTarget, Null]) with T = js.native
  // tslint:disable-next-line:no-unnecessary-generics
  def Event[T /* <: EventLike */, TTarget /* <: EventTarget */](properties: T): (typings.cypress.JQuery.Event[TTarget, Null]) with T = js.native
  /**
    * Perform an asynchronous HTTP (Ajax) request.
    *
    * @param settings A set of key/value pairs that configure the Ajax request. All settings are optional. A default can
    *                 be set for any option with $.ajaxSetup().
    * @see \`{@link https://api.jquery.com/jQuery.ajax/ }\`
    * @since 1.0
    */
  def ajax(): jqXHR[_] = js.native
  def ajax(settings: AjaxSettings[_]): jqXHR[_] = js.native
  /**
    * Perform an asynchronous HTTP (Ajax) request.
    *
    * @param url A string containing the URL to which the request is sent.
    * @param settings A set of key/value pairs that configure the Ajax request. All settings are optional. A default can
    *                 be set for any option with $.ajaxSetup(). See jQuery.ajax( settings ) below for a complete list of all settings.
    * @see \`{@link https://api.jquery.com/jQuery.ajax/ }\`
    * @since 1.5
    */
  def ajax(url: String): jqXHR[_] = js.native
  def ajax(url: String, settings: AjaxSettings[_]): jqXHR[_] = js.native
  /**
    * Handle custom Ajax options or modify existing options before each request is sent and before they
    * are processed by $.ajax().
    *
    * @param dataTypes An optional string containing one or more space-separated dataTypes
    * @param handler A handler to set default values for future Ajax requests.
    * @see \`{@link https://api.jquery.com/jQuery.ajaxPrefilter/ }\`
    * @since 1.5
    */
  def ajaxPrefilter(
    dataTypes: String,
    handler: js.Function3[
      /* options */ AjaxSettings[_], 
      /* originalOptions */ AjaxSettings[_], 
      /* jqXHR */ jqXHR[_], 
      String | Unit
    ]
  ): Unit = js.native
  /**
    * Handle custom Ajax options or modify existing options before each request is sent and before they
    * are processed by $.ajax().
    *
    * @param handler A handler to set default values for future Ajax requests.
    * @see \`{@link https://api.jquery.com/jQuery.ajaxPrefilter/ }\`
    * @since 1.5
    */
  def ajaxPrefilter(
    handler: js.Function3[
      /* options */ AjaxSettings[_], 
      /* originalOptions */ AjaxSettings[_], 
      /* jqXHR */ jqXHR[_], 
      String | Unit
    ]
  ): Unit = js.native
  /**
    * Set default values for future Ajax requests. Its use is not recommended.
    *
    * @param options A set of key/value pairs that configure the default Ajax request. All options are optional.
    * @see \`{@link https://api.jquery.com/jQuery.ajaxSetup/ }\`
    * @since 1.1
    */
  def ajaxSetup(options: AjaxSettings[_]): AjaxSettings[_] = js.native
  /**
    * Creates an object that handles the actual transmission of Ajax data.
    *
    * @param dataType A string identifying the data type to use
    * @param handler A handler to return the new transport object to use with the data type provided in the first argument.
    * @see \`{@link https://api.jquery.com/jQuery.ajaxTransport/ }\`
    * @since 1.5
    */
  def ajaxTransport(
    dataType: String,
    handler: js.Function3[
      /* options */ AjaxSettings[_], 
      /* originalOptions */ AjaxSettings[_], 
      /* jqXHR */ jqXHR[_], 
      Transport | Unit
    ]
  ): Unit = js.native
  /**
    * @deprecated Deprecated since 3.3. Internal. See \`{@link https://github.com/jquery/jquery/issues/3384 }\`.
    */
  def camelCase(value: String): String = js.native
  /**
    * Check to see if a DOM element is a descendant of another DOM element.
    *
    * @param container The DOM element that may contain the other element.
    * @param contained The DOM element that may be contained by (a descendant of) the other element.
    * @see \`{@link https://api.jquery.com/jQuery.contains/ }\`
    * @since 1.4
    */
  def contains(container: Element, contained: Element): Boolean = js.native
  def css(elem: Element, unknown: js.Any): js.Any = js.native
  /**
    * Returns value at named data store for the element, as set by jQuery.data(element, name, value), or
    * the full data store for the element.
    *
    * @param element The DOM element to query for the data.
    * @param key Name of the data stored.
    * @see \`{@link https://api.jquery.com/jQuery.data/ }\`
    * @since 1.2.3
    * @since 1.4
    */
  def data(element: Element): js.Any = js.native
  /**
    * Returns value at named data store for the element, as set by jQuery.data(element, name, value), or
    * the full data store for the element.
    *
    * @param element The DOM element to query for the data.
    * @param key Name of the data stored.
    * @see \`{@link https://api.jquery.com/jQuery.data/ }\`
    * @since 1.2.3
    */
  def data(element: Element, key: String): js.Any = js.native
   // tslint:disable-line:unified-signatures
  /**
    * Store arbitrary data associated with the specified element. Returns the value that was set.
    *
    * @param element The DOM element to associate with the data.
    * @param key A string naming the piece of data to set.
    * @param value The new data value; this can be any Javascript type except undefined.
    * @see \`{@link https://api.jquery.com/jQuery.data/ }\`
    * @since 1.2.3
    */
  def data[T](element: Element, key: String, value: T): T = js.native
  /**
    * Execute the next function on the queue for the matched element.
    *
    * @param element A DOM element from which to remove and execute a queued function.
    * @param queueName A string containing the name of the queue. Defaults to fx, the standard effects queue.
    * @see \`{@link https://api.jquery.com/jQuery.dequeue/ }\`
    * @since 1.3
    */
  def dequeue(element: Element): Unit = js.native
  def dequeue(element: Element, queueName: String): Unit = js.native
  /**
    * A generic iterator function, which can be used to seamlessly iterate over both objects and arrays.
    * Arrays and array-like objects with a length property (such as a function's arguments object) are
    * iterated by numeric index, from 0 to length-1. Other objects are iterated via their named properties.
    *
    * @param array The array to iterate over.
    * @param callback The function that will be executed on every object.
    * @see \`{@link https://api.jquery.com/jQuery.each/ }\`
    * @since 1.0
    */
  @JSName("each")
  def each_false[T](
    array: ArrayLike[T],
    callback: js.ThisFunction2[/* this */ T, /* indexInArray */ Double, /* value */ T, `false` | _]
  ): ArrayLike[T] = js.native
  /**
    * A generic iterator function, which can be used to seamlessly iterate over both objects and arrays.
    * Arrays and array-like objects with a length property (such as a function's arguments object) are
    * iterated by numeric index, from 0 to length-1. Other objects are iterated via their named properties.
    *
    * @param obj The object to iterate over.
    * @param callback The function that will be executed on every object.
    * @see \`{@link https://api.jquery.com/jQuery.each/ }\`
    * @since 1.0
    */
  @JSName("each")
  def each_false[T, K /* <: String */](
    obj: T,
    callback: js.ThisFunction2[
      /* import warning: ImportType.apply Failed type conversion: T[K] */ /* this */ js.Any, 
      /* propertyName */ K, 
      /* import warning: ImportType.apply Failed type conversion: T[K] */ /* valueOfProperty */ js.Any, 
      `false` | _
    ]
  ): T = js.native
  /**
    * Takes a string and throws an exception containing it.
    *
    * @param message The message to send out.
    * @see \`{@link https://api.jquery.com/jQuery.error/ }\`
    * @since 1.4.1
    */
  def error(message: String): js.Any = js.native
  /**
    * Escapes any character that has a special meaning in a CSS selector.
    *
    * @param selector A string containing a selector expression to escape.
    * @see \`{@link https://api.jquery.com/jQuery.escapeSelector/ }\`
    * @since 3.0
    */
  def escapeSelector(selector: Selector): Selector = js.native
  /**
    * Merge the contents of two or more objects together into the first object.
    *
    * @param target An object that will receive the new properties if additional objects are passed in or that will
    *               extend the jQuery namespace if it is the sole argument.
    * @see \`{@link https://api.jquery.com/jQuery.extend/ }\`
    * @since 1.0
    */
  def extend(target: js.Any, object1: js.Any, objects: js.Any*): js.Any = js.native
  /**
    * Merge the contents of two or more objects together into the first object.
    *
    * @param target An object that will receive the new properties if additional objects are passed in or that will
    *               extend the jQuery namespace if it is the sole argument.
    * @see \`{@link https://api.jquery.com/jQuery.extend/ }\`
    * @since 1.0
    */
  def extend[T, U](target: T, object1: U): T with U = js.native
  /**
    * Merge the contents of two or more objects together into the first object.
    *
    * @param target An object that will receive the new properties if additional objects are passed in or that will
    *               extend the jQuery namespace if it is the sole argument.
    * @see \`{@link https://api.jquery.com/jQuery.extend/ }\`
    * @since 1.0
    */
  def extend[T, U, V](target: T, object1: U, object2: V): T with U with V = js.native
  /**
    * Merge the contents of two or more objects together into the first object.
    *
    * @param target An object that will receive the new properties if additional objects are passed in or that will
    *               extend the jQuery namespace if it is the sole argument.
    * @see \`{@link https://api.jquery.com/jQuery.extend/ }\`
    * @since 1.0
    */
  def extend[T, U, V, W](target: T, object1: U, object2: V, object3: W): T with U with V with W = js.native
  /**
    * Merge the contents of two or more objects together into the first object.
    *
    * @param target An object that will receive the new properties if additional objects are passed in or that will
    *               extend the jQuery namespace if it is the sole argument.
    * @see \`{@link https://api.jquery.com/jQuery.extend/ }\`
    * @since 1.0
    */
  def extend[T, U, V, W, X](target: T, object1: U, object2: V, object3: W, object4: X): T with U with V with W with X = js.native
  /**
    * Merge the contents of two or more objects together into the first object.
    *
    * @param target An object that will receive the new properties if additional objects are passed in or that will
    *               extend the jQuery namespace if it is the sole argument.
    * @see \`{@link https://api.jquery.com/jQuery.extend/ }\`
    * @since 1.0
    */
  def extend[T, U, V, W, X, Y](target: T, object1: U, object2: V, object3: W, object4: X, object5: Y): T with U with V with W with X with Y = js.native
  /**
    * Merge the contents of two or more objects together into the first object.
    *
    * @param target An object that will receive the new properties if additional objects are passed in or that will
    *               extend the jQuery namespace if it is the sole argument.
    * @see \`{@link https://api.jquery.com/jQuery.extend/ }\`
    * @since 1.0
    */
  def extend[T, U, V, W, X, Y, Z](target: T, object1: U, object2: V, object3: W, object4: X, object5: Y, object6: Z): T with U with V with W with X with Y with Z = js.native
  /**
    * Merge the contents of two or more objects together into the first object.
    *
    * @param deep If true, the merge becomes recursive (aka. deep copy). Passing false for this argument is not supported.
    * @param target The object to extend. It will receive the new properties.
    * @see \`{@link https://api.jquery.com/jQuery.extend/ }\`
    * @since 1.1.4
    */
  @JSName("extend")
  def extend_true(deep: `true`, target: js.Any, object1: js.Any, objects: js.Any*): js.Any = js.native
  /**
    * Merge the contents of two or more objects together into the first object.
    *
    * @param deep If true, the merge becomes recursive (aka. deep copy). Passing false for this argument is not supported.
    * @param target The object to extend. It will receive the new properties.
    * @see \`{@link https://api.jquery.com/jQuery.extend/ }\`
    * @since 1.1.4
    */
  @JSName("extend")
  def extend_true[T, U](deep: `true`, target: T, object1: U): T with U = js.native
  /**
    * Merge the contents of two or more objects together into the first object.
    *
    * @param deep If true, the merge becomes recursive (aka. deep copy). Passing false for this argument is not supported.
    * @param target The object to extend. It will receive the new properties.
    * @see \`{@link https://api.jquery.com/jQuery.extend/ }\`
    * @since 1.1.4
    */
  @JSName("extend")
  def extend_true[T, U, V](deep: `true`, target: T, object1: U, object2: V): T with U with V = js.native
  /**
    * Merge the contents of two or more objects together into the first object.
    *
    * @param deep If true, the merge becomes recursive (aka. deep copy). Passing false for this argument is not supported.
    * @param target The object to extend. It will receive the new properties.
    * @see \`{@link https://api.jquery.com/jQuery.extend/ }\`
    * @since 1.1.4
    */
  @JSName("extend")
  def extend_true[T, U, V, W](deep: `true`, target: T, object1: U, object2: V, object3: W): T with U with V with W = js.native
  /**
    * Merge the contents of two or more objects together into the first object.
    *
    * @param deep If true, the merge becomes recursive (aka. deep copy). Passing false for this argument is not supported.
    * @param target The object to extend. It will receive the new properties.
    * @see \`{@link https://api.jquery.com/jQuery.extend/ }\`
    * @since 1.1.4
    */
  @JSName("extend")
  def extend_true[T, U, V, W, X](deep: `true`, target: T, object1: U, object2: V, object3: W, object4: X): T with U with V with W with X = js.native
  /**
    * Merge the contents of two or more objects together into the first object.
    *
    * @param deep If true, the merge becomes recursive (aka. deep copy). Passing false for this argument is not supported.
    * @param target The object to extend. It will receive the new properties.
    * @see \`{@link https://api.jquery.com/jQuery.extend/ }\`
    * @since 1.1.4
    */
  @JSName("extend")
  def extend_true[T, U, V, W, X, Y](deep: `true`, target: T, object1: U, object2: V, object3: W, object4: X, object5: Y): T with U with V with W with X with Y = js.native
  /**
    * Merge the contents of two or more objects together into the first object.
    *
    * @param deep If true, the merge becomes recursive (aka. deep copy). Passing false for this argument is not supported.
    * @param target The object to extend. It will receive the new properties.
    * @see \`{@link https://api.jquery.com/jQuery.extend/ }\`
    * @since 1.1.4
    */
  @JSName("extend")
  def extend_true[T, U, V, W, X, Y, Z](deep: `true`, target: T, object1: U, object2: V, object3: W, object4: X, object5: Y, object6: Z): T with U with V with W with X with Y with Z = js.native
  /**
    * Load data from the server using a HTTP GET request.
    *
    * @param url_settings A string containing the URL to which the request is sent.
    *                     A set of key/value pairs that configure the Ajax request. All properties except for url are
    *                     optional. A default can be set for any option with $.ajaxSetup(). See jQuery.ajax( settings ) for a
    *                     complete list of all settings. The type option will automatically be set to GET.
    * @see \`{@link https://api.jquery.com/jQuery.get/ }\`
    * @since 1.0
    * @since 1.12
    * @since 2.2
    */
  def get(): jqXHR[_] = js.native
  def get(url_settings: String): jqXHR[_] = js.native
  def get(url_settings: UrlAjaxSettings[_]): jqXHR[_] = js.native
  def get(url: String, data: String): jqXHR[_] = js.native
  def get(url: String, data: String, success: Null, dataType: String): jqXHR[_] = js.native
  def get(url: String, data: String, success: DoneCallback[_, jqXHR[_]]): jqXHR[_] = js.native
  def get(url: String, data: String, success: DoneCallback[_, jqXHR[_]], dataType: String): jqXHR[_] = js.native
  def get(url: String, data: PlainObject[_]): jqXHR[_] = js.native
  def get(url: String, data: PlainObject[_], success: Null, dataType: String): jqXHR[_] = js.native
  /**
    * Load data from the server using a HTTP GET request.
    *
    * @param url A string containing the URL to which the request is sent.
    * @param data A plain object or string that is sent to the server with the request.
    * @param success A callback function that is executed if the request succeeds. Required if dataType is provided, but
    *                you can use null or jQuery.noop as a placeholder.
    * @param dataType The type of data expected from the server. Default: Intelligent Guess (xml, json, script, text, html).
    * @see \`{@link https://api.jquery.com/jQuery.get/ }\`
    * @since 1.0
    */
  def get(url: String, data: PlainObject[_], success: DoneCallback[_, jqXHR[_]]): jqXHR[_] = js.native
  def get(url: String, data: PlainObject[_], success: DoneCallback[_, jqXHR[_]], dataType: String): jqXHR[_] = js.native
  /**
    * Load data from the server using a HTTP GET request.
    *
    * @param url A string containing the URL to which the request is sent.
    * @param success_data A callback function that is executed if the request succeeds. Required if dataType is provided, but
    *                     you can use null or jQuery.noop as a placeholder.
    *                     A plain object or string that is sent to the server with the request.
    * @see \`{@link https://api.jquery.com/jQuery.get/ }\`
    * @since 1.0
    */
  def get(url: String, success_data: DoneCallback[_, jqXHR[_]]): jqXHR[_] = js.native
  def get(url: String, success: Null, dataType: String): jqXHR[_] = js.native
  /**
    * Load data from the server using a HTTP GET request.
    *
    * @param url A string containing the URL to which the request is sent.
    * @param success A callback function that is executed if the request succeeds. Required if dataType is provided, but
    *                you can use null or jQuery.noop as a placeholder.
    * @param dataType The type of data expected from the server. Default: Intelligent Guess (xml, json, script, text, html).
    * @see \`{@link https://api.jquery.com/jQuery.get/ }\`
    * @since 1.0
    */
  def get(url: String, success: DoneCallback[_, jqXHR[_]], dataType: String): jqXHR[_] = js.native
  /**
    * Load JSON-encoded data from the server using a GET HTTP request.
    *
    * @param url A string containing the URL to which the request is sent.
    * @param success_data A callback function that is executed if the request succeeds.
    *                     A plain object or string that is sent to the server with the request.
    * @see \`{@link https://api.jquery.com/jQuery.getJSON/ }\`
    * @since 1.0
    */
  def getJSON(url: String): jqXHR[_] = js.native
  def getJSON(url: String, data: String, success: DoneCallback[_, jqXHR[_]]): jqXHR[_] = js.native
  /**
    * Load JSON-encoded data from the server using a GET HTTP request.
    *
    * @param url A string containing the URL to which the request is sent.
    * @param data A plain object or string that is sent to the server with the request.
    * @param success A callback function that is executed if the request succeeds.
    * @see \`{@link https://api.jquery.com/jQuery.getJSON/ }\`
    * @since 1.0
    */
  def getJSON(url: String, data: PlainObject[_], success: DoneCallback[_, jqXHR[_]]): jqXHR[_] = js.native
  def getJSON(url: String, success_data: String): jqXHR[_] = js.native
  def getJSON(url: String, success_data: PlainObject[_]): jqXHR[_] = js.native
  def getJSON(url: String, success_data: DoneCallback[_, jqXHR[_]]): jqXHR[_] = js.native
  /**
    * Load a JavaScript file from the server using a GET HTTP request, then execute it.
    *
    * @param url A string containing the URL to which the request is sent.
    * @param success A callback function that is executed if the request succeeds.
    * @see \`{@link https://api.jquery.com/jQuery.getScript/ }\`
    * @since 1.0
    */
  def getScript(url: String): jqXHR[js.UndefOr[String]] = js.native
  def getScript(url: String, success: DoneCallback[js.UndefOr[String], jqXHR[js.UndefOr[String]]]): jqXHR[js.UndefOr[String]] = js.native
  /**
    * Execute some JavaScript code globally.
    *
    * @param code The JavaScript code to execute.
    * @see \`{@link https://api.jquery.com/jQuery.globalEval/ }\`
    * @since 1.0.4
    */
  def globalEval(code: String): Unit = js.native
  /**
    * Finds the elements of an array which satisfy a filter function. The original array is not affected.
    *
    * @param array The array-like object to search through.
    * @param fn The function to process each item against. The first argument to the function is the item, and the
    *           second argument is the index. The function should return a Boolean value. this will be the global window object.
    * @param invert If "invert" is false, or not provided, then the function returns an array consisting of all elements
    *               for which "callback" returns true. If "invert" is true, then the function returns an array
    *               consisting of all elements for which "callback" returns false.
    * @see \`{@link https://api.jquery.com/jQuery.grep/ }\`
    * @since 1.0
    */
  def grep[T](array: ArrayLike[T], fn: js.Function2[/* elementOfArray */ T, /* indexInArray */ Double, Boolean]): js.Array[T] = js.native
  def grep[T](
    array: ArrayLike[T],
    fn: js.Function2[/* elementOfArray */ T, /* indexInArray */ Double, Boolean],
    invert: Boolean
  ): js.Array[T] = js.native
  /**
    * Determine whether an element has any jQuery data associated with it.
    *
    * @param element A DOM element to be checked for data.
    * @see \`{@link https://api.jquery.com/jQuery.hasData/ }\`
    * @since 1.5
    */
  def hasData(element: Element): Boolean = js.native
  /**
    * Holds or releases the execution of jQuery's ready event.
    *
    * @param hold Indicates whether the ready hold is being requested or released
    * @see \`{@link https://api.jquery.com/jQuery.holdReady/ }\`
    * @since 1.6
    *
    * @deprecated Deprecated since 3.2. See \`{@link https://github.com/jquery/jquery/issues/3288 }\`.
    */
  def holdReady(hold: Boolean): Unit = js.native
  /**
    * Modify and filter HTML strings passed through jQuery manipulation methods.
    *
    * @param html The HTML string on which to operate.
    * @see \`{@link https://api.jquery.com/jQuery.htmlPrefilter/ }\`
    * @since 1.12/2.2
    */
  def htmlPrefilter(html: htmlString): htmlString = js.native
  /**
    * Search for a specified value within an array and return its index (or -1 if not found).
    *
    * @param value The value to search for.
    * @param array An array through which to search.
    * @param fromIndex The index of the array at which to begin the search. The default is 0, which will search the whole array.
    * @see \`{@link https://api.jquery.com/jQuery.inArray/ }\`
    * @since 1.2
    */
  def inArray[T](value: T, array: js.Array[T]): Double = js.native
  def inArray[T](value: T, array: js.Array[T], fromIndex: Double): Double = js.native
  /**
    * Determine whether the argument is an array.
    *
    * @param obj Object to test whether or not it is an array.
    * @see \`{@link https://api.jquery.com/jQuery.isArray/ }\`
    * @since 1.3
    *
    * @deprecated Deprecated since 3.2. Use \`{@link Array.isArray }\`.
    */
  def isArray(obj: js.Any): /* is std.Array<any> */ Boolean = js.native
  /**
    * Check to see if an object is empty (contains no enumerable properties).
    *
    * @param obj The object that will be checked to see if it's empty.
    * @see \`{@link https://api.jquery.com/jQuery.isEmptyObject/ }\`
    * @since 1.4
    */
  def isEmptyObject(obj: js.Any): Boolean = js.native
  /**
    * Determine if the argument passed is a JavaScript function object.
    *
    * @param obj Object to test whether or not it is a function.
    * @see \`{@link https://api.jquery.com/jQuery.isFunction/ }\`
    * @since 1.2
    *
    * @deprecated Deprecated since 3.3. Use `typeof x === "function"`.
    */
  // tslint:disable-next-line:ban-types
  def isFunction(obj: js.Any): /* is std.Function */ Boolean = js.native
  /**
    * Determines whether its argument represents a JavaScript number.
    *
    * @param value The value to be tested.
    * @see \`{@link https://api.jquery.com/jQuery.isNumeric/ }\`
    * @since 1.7
    *
    * @deprecated Deprecated since 3.3. Internal. See \`{@link https://github.com/jquery/jquery/issues/2960 }\`.
    */
  def isNumeric(value: js.Any): /* is number */ Boolean = js.native
  /**
    * Check to see if an object is a plain object (created using "{}" or "new Object").
    *
    * @param obj The object that will be checked to see if it's a plain object.
    * @see \`{@link https://api.jquery.com/jQuery.isPlainObject/ }\`
    * @since 1.4
    */
  def isPlainObject(obj: js.Any): /* is cypress.JQuery.PlainObject<any> */ Boolean = js.native
  /**
    * Determine whether the argument is a window.
    *
    * @param obj Object to test whether or not it is a window.
    * @see \`{@link https://api.jquery.com/jQuery.isWindow/ }\`
    * @since 1.4.3
    *
    * @deprecated Deprecated since 3.3. Internal. See \`{@link https://github.com/jquery/jquery/issues/3629 }\`.
    */
  def isWindow(obj: js.Any): /* is cypress.Window */ Boolean = js.native
  /**
    * Check to see if a DOM node is within an XML document (or is an XML document).
    *
    * @param node The DOM node that will be checked to see if it's in an XML document.
    * @see \`{@link https://api.jquery.com/jQuery.isXMLDoc/ }\`
    * @since 1.1.4
    */
  def isXMLDoc(node: Node): Boolean = js.native
  /**
    * Convert an array-like object into a true JavaScript array.
    *
    * @param obj Any object to turn into a native Array.
    * @see \`{@link https://api.jquery.com/jQuery.makeArray/ }\`
    * @since 1.2
    */
  def makeArray[T](obj: ArrayLike[T]): js.Array[T] = js.native
  /**
    * Translate all items in an array or object to new array of items.
    *
    * @param array The Array to translate.
    * @param callback The function to process each item against. The first argument to the function is the array item, the
    *                 second argument is the index in array The function can return any value. A returned array will be
    *                 flattened into the resulting array. Within the function, this refers to the global (window) object.
    * @see \`{@link https://api.jquery.com/jQuery.map/ }\`
    * @since 1.0
    */
  def map[T, TReturn](
    array: js.Array[T],
    callback: js.ThisFunction2[
      /* this */ Window, 
      /* elementOfArray */ T, 
      /* indexInArray */ Double, 
      js.UndefOr[TypeOrArray[TReturn] | Null]
    ]
  ): js.Array[TReturn] = js.native
  /**
    * Translate all items in an array or object to new array of items.
    *
    * @param obj The Object to translate.
    * @param callback The function to process each item against. The first argument to the function is the value; the
    *                 second argument is the key of the object property. The function can return any value to add to the
    *                 array. A returned array will be flattened into the resulting array. Within the function, this refers
    *                 to the global (window) object.
    * @see \`{@link https://api.jquery.com/jQuery.map/ }\`
    * @since 1.6
    */
  def map[T, K /* <: String */, TReturn](
    obj: T,
    callback: js.ThisFunction2[
      /* this */ Window, 
      /* import warning: ImportType.apply Failed type conversion: T[K] */ /* propertyOfObject */ js.Any, 
      /* key */ K, 
      js.UndefOr[TypeOrArray[TReturn] | Null]
    ]
  ): js.Array[TReturn] = js.native
  /**
    * Merge the contents of two arrays together into the first array.
    *
    * @param first The first array-like object to merge, the elements of second added.
    * @param second The second array-like object to merge into the first, unaltered.
    * @see \`{@link https://api.jquery.com/jQuery.merge/ }\`
    * @since 1.0
    */
  def merge[T, U](first: ArrayLike[T], second: ArrayLike[U]): js.Array[T | U] = js.native
  /**
    * Relinquish jQuery's control of the $ variable.
    *
    * @param removeAll A Boolean indicating whether to remove all jQuery variables from the global scope (including jQuery itself).
    * @see \`{@link https://api.jquery.com/jQuery.noConflict/ }\`
    * @since 1.0
    */
  def noConflict(): this.type = js.native
  def noConflict(removeAll: Boolean): this.type = js.native
  /**
    * An empty function.
    *
    * @see \`{@link https://api.jquery.com/jQuery.noop/ }\`
    * @since 1.4
    */
  def noop(): js.UndefOr[scala.Nothing] = js.native
  /**
    * Return a number representing the current time.
    *
    * @see \`{@link https://api.jquery.com/jQuery.now/ }\`
    * @since 1.4.3
    *
    * @deprecated Deprecated since 3.3. Use \`{@link Date.now }\`.
    */
  def now(): Double = js.native
  /**
    * Create a serialized representation of an array, a plain object, or a jQuery object suitable for use
    * in a URL query string or Ajax request. In case a jQuery object is passed, it should contain input
    * elements with name/value properties.
    *
    * @param obj An array, a plain object, or a jQuery object to serialize.
    * @param traditional A Boolean indicating whether to perform a traditional "shallow" serialization.
    * @see \`{@link https://api.jquery.com/jQuery.param/ }\`
    * @since 1.2
    * @since 1.4
    */
  def param(obj: js.Array[_]): String = js.native
  def param(obj: js.Array[_], traditional: Boolean): String = js.native
  def param(obj: JQuery[HTMLElement]): String = js.native
  def param(obj: PlainObject[_]): String = js.native
  def param(obj: PlainObject[_], traditional: Boolean): String = js.native
  def param(obj: JQuery[HTMLElement], traditional: Boolean): String = js.native
  /**
    * Parses a string into an array of DOM nodes.
    *
    * @param data HTML string to be parsed
    * @param context_keepScripts Document element to serve as the context in which the HTML fragment will be created
    *                            A Boolean indicating whether to include scripts passed in the HTML string
    * @see \`{@link https://api.jquery.com/jQuery.parseHTML/ }\`
    * @since 1.8
    */
  def parseHTML(data: String): js.Array[typings.cypress.JQuery.Node] = js.native
  def parseHTML(data: String, context_keepScripts: Boolean): js.Array[typings.cypress.JQuery.Node] = js.native
  def parseHTML(data: String, context_keepScripts: Document): js.Array[typings.cypress.JQuery.Node] = js.native
  def parseHTML(data: String, context: js.UndefOr[scala.Nothing], keepScripts: Boolean): js.Array[typings.cypress.JQuery.Node] = js.native
  def parseHTML(data: String, context: Null, keepScripts: Boolean): js.Array[typings.cypress.JQuery.Node] = js.native
  /**
    * Parses a string into an array of DOM nodes.
    *
    * @param data HTML string to be parsed
    * @param context Document element to serve as the context in which the HTML fragment will be created
    * @param keepScripts A Boolean indicating whether to include scripts passed in the HTML string
    * @see \`{@link https://api.jquery.com/jQuery.parseHTML/ }\`
    * @since 1.8
    */
  def parseHTML(data: String, context: Document, keepScripts: Boolean): js.Array[typings.cypress.JQuery.Node] = js.native
  /**
    * Takes a well-formed JSON string and returns the resulting JavaScript value.
    *
    * @param json The JSON string to parse.
    * @see \`{@link https://api.jquery.com/jQuery.parseJSON/ }\`
    * @since 1.4.1
    *
    * @deprecated Deprecated since 3.0. Use \`{@link JSON.parse }\`.
    */
  def parseJSON(json: String): js.Any = js.native
  /**
    * Parses a string into an XML document.
    *
    * @param data a well-formed XML string to be parsed
    * @see \`{@link https://api.jquery.com/jQuery.parseXML/ }\`
    * @since 1.5
    */
  def parseXML(data: String): XMLDocument = js.native
  /**
    * Load data from the server using a HTTP POST request.
    *
    * @param url_settings A string containing the URL to which the request is sent.
    *                     A set of key/value pairs that configure the Ajax request. All properties except for url are
    *                     optional. A default can be set for any option with $.ajaxSetup(). See jQuery.ajax( settings ) for a
    *                     complete list of all settings. Type will automatically be set to POST.
    * @see \`{@link https://api.jquery.com/jQuery.post/ }\`
    * @since 1.0
    * @since 1.12
    * @since 2.2
    */
  def post(): jqXHR[_] = js.native
  def post(url_settings: String): jqXHR[_] = js.native
  def post(url_settings: UrlAjaxSettings[_]): jqXHR[_] = js.native
  def post(url: String, data: String): jqXHR[_] = js.native
  def post(url: String, data: String, success: Null, dataType: String): jqXHR[_] = js.native
  def post(url: String, data: String, success: DoneCallback[_, jqXHR[_]]): jqXHR[_] = js.native
  def post(url: String, data: String, success: DoneCallback[_, jqXHR[_]], dataType: String): jqXHR[_] = js.native
  def post(url: String, data: PlainObject[_]): jqXHR[_] = js.native
  def post(url: String, data: PlainObject[_], success: Null, dataType: String): jqXHR[_] = js.native
  /**
    * Load data from the server using a HTTP POST request.
    *
    * @param url A string containing the URL to which the request is sent.
    * @param data A plain object or string that is sent to the server with the request.
    * @param success A callback function that is executed if the request succeeds. Required if dataType is provided, but
    *                can be null in that case.
    * @param dataType The type of data expected from the server. Default: Intelligent Guess (xml, json, script, text, html).
    * @see \`{@link https://api.jquery.com/jQuery.post/ }\`
    * @since 1.0
    */
  def post(url: String, data: PlainObject[_], success: DoneCallback[_, jqXHR[_]]): jqXHR[_] = js.native
  def post(url: String, data: PlainObject[_], success: DoneCallback[_, jqXHR[_]], dataType: String): jqXHR[_] = js.native
  /**
    * Load data from the server using a HTTP POST request.
    *
    * @param url A string containing the URL to which the request is sent.
    * @param success_data A callback function that is executed if the request succeeds. Required if dataType is provided, but
    *                     can be null in that case.
    *                     A plain object or string that is sent to the server with the request.
    * @see \`{@link https://api.jquery.com/jQuery.post/ }\`
    * @since 1.0
    */
  def post(url: String, success_data: DoneCallback[_, jqXHR[_]]): jqXHR[_] = js.native
  def post(url: String, success: Null, dataType: String): jqXHR[_] = js.native
  /**
    * Load data from the server using a HTTP POST request.
    *
    * @param url A string containing the URL to which the request is sent.
    * @param success A callback function that is executed if the request succeeds. Required if dataType is provided, but
    *                can be null in that case.
    * @param dataType The type of data expected from the server. Default: Intelligent Guess (xml, json, script, text, html).
    * @see \`{@link https://api.jquery.com/jQuery.post/ }\`
    * @since 1.0
    */
  def post(url: String, success: DoneCallback[_, jqXHR[_]], dataType: String): jqXHR[_] = js.native
  // endregion
  // endregion
  // region (context, name)
  /**
    * Takes a function and returns a new one that will always have a particular context.
    *
    * @param context The object to which the context of the function should be set.
    * @param name The name of the function whose context will be changed (should be a property of the context object).
    * @param additionalArguments Any number of arguments to be passed to the function named in the name argument.
    * @see \`{@link https://api.jquery.com/jQuery.proxy/ }\`
    * @since 1.4
    * @since 1.6
    *
    * @deprecated Deprecated since 3.3. Use \`{@link Function.bind }\`.
    */
  def proxy[TContext /* <: js.Object */](context: TContext, name: String, additionalArguments: js.Any*): js.ThisFunction1[/* this */ TContext, /* repeated */ js.Any, _] = js.native
  /**
    * Takes a function and returns a new one that will always have a particular context.
    *
    * @param fn The function whose context will be changed.
    * @param context The object to which the context (this) of the function should be set.
    * @see \`{@link https://api.jquery.com/jQuery.proxy/ }\`
    * @since 1.9
    *
    * @deprecated Deprecated since 3.3. Use \`{@link Function.bind }\`.
    */
  def proxy[TReturn](fn: js.Function0[TReturn]): js.Function0[TReturn] = js.native
  // endregion
  // endregion
  // region 8+ arguments
  /**
    * Takes a function and returns a new one that will always have a particular context.
    *
    * @param fn The function whose context will be changed.
    * @param context The object to which the context (this) of the function should be set.
    * @param additionalArguments Any number of arguments to be passed to the function referenced in the function argument.
    * @see \`{@link https://api.jquery.com/jQuery.proxy/ }\`
    * @since 1.9
    *
    * @deprecated Deprecated since 3.3. Use \`{@link Function.bind }\`.
    */
  def proxy[TReturn](fn: js.Function1[/* repeated */ js.Any, TReturn], additionalArguments: js.Any*): js.Function1[/* repeated */ js.Any, TReturn] = js.native
  /**
    * Takes a function and returns a new one that will always have a particular context.
    *
    * @param fn The function whose context will be changed.
    * @param context The object to which the context (this) of the function should be set.
    * @see \`{@link https://api.jquery.com/jQuery.proxy/ }\`
    * @since 1.4
    * @since 1.6
    *
    * @deprecated Deprecated since 3.3. Use \`{@link Function.bind }\`.
    */
  def proxy[TContext /* <: js.Object */, TReturn](fn: js.Function0[TReturn], context: TContext): js.ThisFunction0[/* this */ TContext, TReturn] = js.native
  /**
    * Takes a function and returns a new one that will always have a particular context.
    *
    * @param fn The function whose context will be changed.
    * @param context The object to which the context (this) of the function should be set.
    * @see \`{@link https://api.jquery.com/jQuery.proxy/ }\`
    * @since 1.9
    *
    * @deprecated Deprecated since 3.3. Use \`{@link Function.bind }\`.
    */
  def proxy[TReturn, T](fn: js.Function1[/* t */ T, TReturn]): js.Function1[/* t */ T, TReturn] = js.native
  // endregion
  // endregion
  // region 8+ arguments
  /**
    * Takes a function and returns a new one that will always have a particular context.
    *
    * @param fn The function whose context will be changed.
    * @param context The object to which the context (this) of the function should be set.
    * @param additionalArguments Any number of arguments to be passed to the function referenced in the function argument.
    * @see \`{@link https://api.jquery.com/jQuery.proxy/ }\`
    * @since 1.4
    * @since 1.6
    *
    * @deprecated Deprecated since 3.3. Use \`{@link Function.bind }\`.
    */
  def proxy[TContext /* <: js.Object */, TReturn](fn: js.Function1[/* repeated */ js.Any, TReturn], context: TContext, additionalArguments: js.Any*): js.ThisFunction1[/* this */ TContext, /* repeated */ js.Any, TReturn] = js.native
  def proxy[TReturn, A](fn: js.Function1[/* a */ A, TReturn], context: js.UndefOr[scala.Nothing], a: A): js.Function0[TReturn] = js.native
  /**
    * Takes a function and returns a new one that will always have a particular context.
    *
    * @param fn The function whose context will be changed.
    * @param context The object to which the context (this) of the function should be set.
    * @see \`{@link https://api.jquery.com/jQuery.proxy/ }\`
    * @since 1.4`
    * @since 1.6
    *
    * @deprecated Deprecated since 3.3. Use \`{@link Function.bind }\`.
    */
  def proxy[TReturn, A](fn: js.Function1[/* a */ A, TReturn], context: Null, a: A): js.Function0[TReturn] = js.native
  /**
    * Takes a function and returns a new one that will always have a particular context.
    *
    * @param fn The function whose context will be changed.
    * @param context The object to which the context (this) of the function should be set.
    * @see \`{@link https://api.jquery.com/jQuery.proxy/ }\`
    * @since 1.4
    * @since 1.6
    *
    * @deprecated Deprecated since 3.3. Use \`{@link Function.bind }\`.
    */
  def proxy[TContext /* <: js.Object */, TReturn, T](fn: js.Function1[/* t */ T, TReturn], context: TContext): js.ThisFunction1[/* this */ TContext, /* t */ T, TReturn] = js.native
  /**
    * Takes a function and returns a new one that will always have a particular context.
    *
    * @param fn The function whose context will be changed.
    * @param context The object to which the context (this) of the function should be set.
    * @see \`{@link https://api.jquery.com/jQuery.proxy/ }\`
    * @since 1.4`
    * @since 1.6
    *
    * @deprecated Deprecated since 3.3. Use \`{@link Function.bind }\`.
    */
  def proxy[TContext /* <: js.Object */, TReturn, A](fn: js.Function1[/* a */ A, TReturn], context: TContext, a: A): js.ThisFunction0[/* this */ TContext, TReturn] = js.native
  /**
    * Takes a function and returns a new one that will always have a particular context.
    *
    * @param fn The function whose context will be changed.
    * @param context The object to which the context (this) of the function should be set.
    * @see \`{@link https://api.jquery.com/jQuery.proxy/ }\`
    * @since 1.9
    *
    * @deprecated Deprecated since 3.3. Use \`{@link Function.bind }\`.
    */
  def proxy[TReturn, T, U](fn: js.Function2[/* t */ T, /* u */ U, TReturn]): js.Function2[/* t */ T, /* u */ U, TReturn] = js.native
  def proxy[TReturn, A, T](fn: js.Function2[/* a */ A, /* t */ T, TReturn], context: js.UndefOr[scala.Nothing], a: A): js.Function1[/* t */ T, TReturn] = js.native
  def proxy[TReturn, A, B](fn: js.Function2[/* a */ A, /* b */ B, TReturn], context: js.UndefOr[scala.Nothing], a: A, b: B): js.Function0[TReturn] = js.native
  /**
    * Takes a function and returns a new one that will always have a particular context.
    *
    * @param fn The function whose context will be changed.
    * @param context The object to which the context (this) of the function should be set.
    * @see \`{@link https://api.jquery.com/jQuery.proxy/ }\`
    * @since 1.9
    *
    * @deprecated Deprecated since 3.3. Use \`{@link Function.bind }\`.
    */
  def proxy[TReturn, A, T](fn: js.Function2[/* a */ A, /* t */ T, TReturn], context: Null, a: A): js.Function1[/* t */ T, TReturn] = js.native
  /**
    * Takes a function and returns a new one that will always have a particular context.
    *
    * @param fn The function whose context will be changed.
    * @param context The object to which the context (this) of the function should be set.
    * @see \`{@link https://api.jquery.com/jQuery.proxy/ }\`
    * @since 1.9
    *
    * @deprecated Deprecated since 3.3. Use \`{@link Function.bind }\`.
    */
  def proxy[TReturn, A, B](fn: js.Function2[/* a */ A, /* b */ B, TReturn], context: Null, a: A, b: B): js.Function0[TReturn] = js.native
  /**
    * Takes a function and returns a new one that will always have a particular context.
    *
    * @param fn The function whose context will be changed.
    * @param context The object to which the context (this) of the function should be set.
    * @see \`{@link https://api.jquery.com/jQuery.proxy/ }\`
    * @since 1.4
    * @since 1.6
    *
    * @deprecated Deprecated since 3.3. Use \`{@link Function.bind }\`.
    */
  def proxy[TContext /* <: js.Object */, TReturn, T, U](fn: js.Function2[/* t */ T, /* u */ U, TReturn], context: TContext): js.ThisFunction2[/* this */ TContext, /* t */ T, /* u */ U, TReturn] = js.native
  /**
    * Takes a function and returns a new one that will always have a particular context.
    *
    * @param fn The function whose context will be changed.
    * @param context The object to which the context (this) of the function should be set.
    * @see \`{@link https://api.jquery.com/jQuery.proxy/ }\`
    * @since 1.4
    * @since 1.6
    *
    * @deprecated Deprecated since 3.3. Use \`{@link Function.bind }\`.
    */
  def proxy[TContext /* <: js.Object */, TReturn, A, T](fn: js.Function2[/* a */ A, /* t */ T, TReturn], context: TContext, a: A): js.ThisFunction1[/* this */ TContext, /* t */ T, TReturn] = js.native
  /**
    * Takes a function and returns a new one that will always have a particular context.
    *
    * @param fn The function whose context will be changed.
    * @param context The object to which the context (this) of the function should be set.
    * @see \`{@link https://api.jquery.com/jQuery.proxy/ }\`
    * @since 1.4
    * @since 1.6
    *
    * @deprecated Deprecated since 3.3. Use \`{@link Function.bind }\`.
    */
  def proxy[TContext /* <: js.Object */, TReturn, A, B](fn: js.Function2[/* a */ A, /* b */ B, TReturn], context: TContext, a: A, b: B): js.ThisFunction0[/* this */ TContext, TReturn] = js.native
  /**
    * Takes a function and returns a new one that will always have a particular context.
    *
    * @param fn The function whose context will be changed.
    * @param context The object to which the context (this) of the function should be set.
    * @see \`{@link https://api.jquery.com/jQuery.proxy/ }\`
    * @since 1.9
    *
    * @deprecated Deprecated since 3.3. Use \`{@link Function.bind }\`.
    */
  def proxy[TReturn, T, U, V](fn: js.Function3[/* t */ T, /* u */ U, /* v */ V, TReturn]): js.Function3[/* t */ T, /* u */ U, /* v */ V, TReturn] = js.native
  def proxy[TReturn, A, T, U](
    fn: js.Function3[/* a */ A, /* t */ T, /* u */ U, TReturn],
    context: js.UndefOr[scala.Nothing],
    a: A
  ): js.Function2[/* t */ T, /* u */ U, TReturn] = js.native
  def proxy[TReturn, A, B, T](
    fn: js.Function3[/* a */ A, /* b */ B, /* t */ T, TReturn],
    context: js.UndefOr[scala.Nothing],
    a: A,
    b: B
  ): js.Function1[/* t */ T, TReturn] = js.native
  def proxy[TReturn, A, B, C](
    fn: js.Function3[/* a */ A, /* b */ B, /* c */ C, TReturn],
    context: js.UndefOr[scala.Nothing],
    a: A,
    b: B,
    c: C
  ): js.Function0[TReturn] = js.native
  /**
    * Takes a function and returns a new one that will always have a particular context.
    *
    * @param fn The function whose context will be changed.
    * @param context The object to which the context (this) of the function should be set.
    * @see \`{@link https://api.jquery.com/jQuery.proxy/ }\`
    * @since 1.9
    *
    * @deprecated Deprecated since 3.3. Use \`{@link Function.bind }\`.
    */
  def proxy[TReturn, A, T, U](fn: js.Function3[/* a */ A, /* t */ T, /* u */ U, TReturn], context: Null, a: A): js.Function2[/* t */ T, /* u */ U, TReturn] = js.native
  /**
    * Takes a function and returns a new one that will always have a particular context.
    *
    * @param fn The function whose context will be changed.
    * @param context The object to which the context (this) of the function should be set.
    * @see \`{@link https://api.jquery.com/jQuery.proxy/ }\`
    * @since 1.9
    *
    * @deprecated Deprecated since 3.3. Use \`{@link Function.bind }\`.
    */
  def proxy[TReturn, A, B, T](fn: js.Function3[/* a */ A, /* b */ B, /* t */ T, TReturn], context: Null, a: A, b: B): js.Function1[/* t */ T, TReturn] = js.native
  /**
    * Takes a function and returns a new one that will always have a particular context.
    *
    * @param fn The function whose context will be changed.
    * @param context The object to which the context (this) of the function should be set.
    * @see \`{@link https://api.jquery.com/jQuery.proxy/ }\`
    * @since 1.9
    *
    * @deprecated Deprecated since 3.3. Use \`{@link Function.bind }\`.
    */
  def proxy[TReturn, A, B, C](fn: js.Function3[/* a */ A, /* b */ B, /* c */ C, TReturn], context: Null, a: A, b: B, c: C): js.Function0[TReturn] = js.native
  /**
    * Takes a function and returns a new one that will always have a particular context.
    *
    * @param fn The function whose context will be changed.
    * @param context The object to which the context (this) of the function should be set.
    * @see \`{@link https://api.jquery.com/jQuery.proxy/ }\`
    * @since 1.4
    * @since 1.6
    *
    * @deprecated Deprecated since 3.3. Use \`{@link Function.bind }\`.
    */
  def proxy[TContext /* <: js.Object */, TReturn, T, U, V](fn: js.Function3[/* t */ T, /* u */ U, /* v */ V, TReturn], context: TContext): js.ThisFunction3[/* this */ TContext, /* t */ T, /* u */ U, /* v */ V, TReturn] = js.native
  /**
    * Takes a function and returns a new one that will always have a particular context.
    *
    * @param fn The function whose context will be changed.
    * @param context The object to which the context (this) of the function should be set.
    * @see \`{@link https://api.jquery.com/jQuery.proxy/ }\`
    * @since 1.4
    * @since 1.6
    *
    * @deprecated Deprecated since 3.3. Use \`{@link Function.bind }\`.
    */
  def proxy[TContext /* <: js.Object */, TReturn, A, T, U](fn: js.Function3[/* a */ A, /* t */ T, /* u */ U, TReturn], context: TContext, a: A): js.ThisFunction2[/* this */ TContext, /* t */ T, /* u */ U, TReturn] = js.native
  /**
    * Takes a function and returns a new one that will always have a particular context.
    *
    * @param fn The function whose context will be changed.
    * @param context The object to which the context (this) of the function should be set.
    * @see \`{@link https://api.jquery.com/jQuery.proxy/ }\`
    * @since 1.4
    * @since 1.6
    *
    * @deprecated Deprecated since 3.3. Use \`{@link Function.bind }\`.
    */
  def proxy[TContext /* <: js.Object */, TReturn, A, B, T](fn: js.Function3[/* a */ A, /* b */ B, /* t */ T, TReturn], context: TContext, a: A, b: B): js.ThisFunction1[/* this */ TContext, /* t */ T, TReturn] = js.native
  /**
    * Takes a function and returns a new one that will always have a particular context.
    *
    * @param fn The function whose context will be changed.
    * @param context The object to which the context (this) of the function should be set.
    * @see \`{@link https://api.jquery.com/jQuery.proxy/ }\`
    * @since 1.4
    * @since 1.6
    *
    * @deprecated Deprecated since 3.3. Use \`{@link Function.bind }\`.
    */
  def proxy[TContext /* <: js.Object */, TReturn, A, B, C](fn: js.Function3[/* a */ A, /* b */ B, /* c */ C, TReturn], context: TContext, a: A, b: B, c: C): js.ThisFunction0[/* this */ TContext, TReturn] = js.native
  /**
    * Takes a function and returns a new one that will always have a particular context.
    *
    * @param fn The function whose context will be changed.
    * @param context The object to which the context (this) of the function should be set.
    * @see \`{@link https://api.jquery.com/jQuery.proxy/ }\`
    * @since 1.9
    *
    * @deprecated Deprecated since 3.3. Use \`{@link Function.bind }\`.
    */
  def proxy[TReturn, T, U, V, W](fn: js.Function4[/* t */ T, /* u */ U, /* v */ V, /* w */ W, TReturn]): js.Function4[/* t */ T, /* u */ U, /* v */ V, /* w */ W, TReturn] = js.native
  def proxy[TReturn, A, T, U, V](
    fn: js.Function4[/* a */ A, /* t */ T, /* u */ U, /* v */ V, TReturn],
    context: js.UndefOr[scala.Nothing],
    a: A
  ): js.Function3[/* t */ T, /* u */ U, /* v */ V, TReturn] = js.native
  def proxy[TReturn, A, B, T, U](
    fn: js.Function4[/* a */ A, /* b */ B, /* t */ T, /* u */ U, TReturn],
    context: js.UndefOr[scala.Nothing],
    a: A,
    b: B
  ): js.Function2[/* t */ T, /* u */ U, TReturn] = js.native
  def proxy[TReturn, A, B, C, T](
    fn: js.Function4[/* a */ A, /* b */ B, /* c */ C, /* t */ T, TReturn],
    context: js.UndefOr[scala.Nothing],
    a: A,
    b: B,
    c: C
  ): js.Function1[/* t */ T, TReturn] = js.native
  def proxy[TReturn, A, B, C, D](
    fn: js.Function4[/* a */ A, /* b */ B, /* c */ C, /* d */ D, TReturn],
    context: js.UndefOr[scala.Nothing],
    a: A,
    b: B,
    c: C,
    d: D
  ): js.Function0[TReturn] = js.native
  /**
    * Takes a function and returns a new one that will always have a particular context.
    *
    * @param fn The function whose context will be changed.
    * @param context The object to which the context (this) of the function should be set.
    * @see \`{@link https://api.jquery.com/jQuery.proxy/ }\`
    * @since 1.9
    *
    * @deprecated Deprecated since 3.3. Use \`{@link Function.bind }\`.
    */
  def proxy[TReturn, A, T, U, V](fn: js.Function4[/* a */ A, /* t */ T, /* u */ U, /* v */ V, TReturn], context: Null, a: A): js.Function3[/* t */ T, /* u */ U, /* v */ V, TReturn] = js.native
  /**
    * Takes a function and returns a new one that will always have a particular context.
    *
    * @param fn The function whose context will be changed.
    * @param context The object to which the context (this) of the function should be set.
    * @see \`{@link https://api.jquery.com/jQuery.proxy/ }\`
    * @since 1.9
    *
    * @deprecated Deprecated since 3.3. Use \`{@link Function.bind }\`.
    */
  def proxy[TReturn, A, B, T, U](fn: js.Function4[/* a */ A, /* b */ B, /* t */ T, /* u */ U, TReturn], context: Null, a: A, b: B): js.Function2[/* t */ T, /* u */ U, TReturn] = js.native
  /**
    * Takes a function and returns a new one that will always have a particular context.
    *
    * @param fn The function whose context will be changed.
    * @param context The object to which the context (this) of the function should be set.
    * @see \`{@link https://api.jquery.com/jQuery.proxy/ }\`
    * @since 1.9
    *
    * @deprecated Deprecated since 3.3. Use \`{@link Function.bind }\`.
    */
  def proxy[TReturn, A, B, C, T](
    fn: js.Function4[/* a */ A, /* b */ B, /* c */ C, /* t */ T, TReturn],
    context: Null,
    a: A,
    b: B,
    c: C
  ): js.Function1[/* t */ T, TReturn] = js.native
  /**
    * Takes a function and returns a new one that will always have a particular context.
    *
    * @param fn The function whose context will be changed.
    * @param context The object to which the context (this) of the function should be set.
    * @see \`{@link https://api.jquery.com/jQuery.proxy/ }\`
    * @since 1.9
    *
    * @deprecated Deprecated since 3.3. Use \`{@link Function.bind }\`.
    */
  def proxy[TReturn, A, B, C, D](
    fn: js.Function4[/* a */ A, /* b */ B, /* c */ C, /* d */ D, TReturn],
    context: Null,
    a: A,
    b: B,
    c: C,
    d: D
  ): js.Function0[TReturn] = js.native
  /**
    * Takes a function and returns a new one that will always have a particular context.
    *
    * @param fn The function whose context will be changed.
    * @param context The object to which the context (this) of the function should be set.
    * @see \`{@link https://api.jquery.com/jQuery.proxy/ }\`
    * @since 1.4
    * @since 1.6
    *
    * @deprecated Deprecated since 3.3. Use \`{@link Function.bind }\`.
    */
  def proxy[TContext /* <: js.Object */, TReturn, T, U, V, W](fn: js.Function4[/* t */ T, /* u */ U, /* v */ V, /* w */ W, TReturn], context: TContext): js.ThisFunction4[/* this */ TContext, /* t */ T, /* u */ U, /* v */ V, /* w */ W, TReturn] = js.native
  /**
    * Takes a function and returns a new one that will always have a particular context.
    *
    * @param fn The function whose context will be changed.
    * @param context The object to which the context (this) of the function should be set.
    * @see \`{@link https://api.jquery.com/jQuery.proxy/ }\`
    * @since 1.4
    * @since 1.6
    *
    * @deprecated Deprecated since 3.3. Use \`{@link Function.bind }\`.
    */
  def proxy[TContext /* <: js.Object */, TReturn, A, T, U, V](fn: js.Function4[/* a */ A, /* t */ T, /* u */ U, /* v */ V, TReturn], context: TContext, a: A): js.ThisFunction3[/* this */ TContext, /* t */ T, /* u */ U, /* v */ V, TReturn] = js.native
  /**
    * Takes a function and returns a new one that will always have a particular context.
    *
    * @param fn The function whose context will be changed.
    * @param context The object to which the context (this) of the function should be set.
    * @see \`{@link https://api.jquery.com/jQuery.proxy/ }\`
    * @since 1.4
    * @since 1.6
    *
    * @deprecated Deprecated since 3.3. Use \`{@link Function.bind }\`.
    */
  def proxy[TContext /* <: js.Object */, TReturn, A, B, T, U](
    fn: js.Function4[/* a */ A, /* b */ B, /* t */ T, /* u */ U, TReturn],
    context: TContext,
    a: A,
    b: B
  ): js.ThisFunction2[/* this */ TContext, /* t */ T, /* u */ U, TReturn] = js.native
  /**
    * Takes a function and returns a new one that will always have a particular context.
    *
    * @param fn The function whose context will be changed.
    * @param context The object to which the context (this) of the function should be set.
    * @see \`{@link https://api.jquery.com/jQuery.proxy/ }\`
    * @since 1.4
    * @since 1.6
    *
    * @deprecated Deprecated since 3.3. Use \`{@link Function.bind }\`.
    */
  def proxy[TContext /* <: js.Object */, TReturn, A, B, C, T](
    fn: js.Function4[/* a */ A, /* b */ B, /* c */ C, /* t */ T, TReturn],
    context: TContext,
    a: A,
    b: B,
    c: C
  ): js.ThisFunction1[/* this */ TContext, /* t */ T, TReturn] = js.native
  /**
    * Takes a function and returns a new one that will always have a particular context.
    *
    * @param fn The function whose context will be changed.
    * @param context The object to which the context (this) of the function should be set.
    * @see \`{@link https://api.jquery.com/jQuery.proxy/ }\`
    * @since 1.4
    * @since 1.6
    *
    * @deprecated Deprecated since 3.3. Use \`{@link Function.bind }\`.
    */
  def proxy[TContext /* <: js.Object */, TReturn, A, B, C, D](
    fn: js.Function4[/* a */ A, /* b */ B, /* c */ C, /* d */ D, TReturn],
    context: TContext,
    a: A,
    b: B,
    c: C,
    d: D
  ): js.ThisFunction0[/* this */ TContext, TReturn] = js.native
  /**
    * Takes a function and returns a new one that will always have a particular context.
    *
    * @param fn The function whose context will be changed.
    * @param context The object to which the context (this) of the function should be set.
    * @see \`{@link https://api.jquery.com/jQuery.proxy/ }\`
    * @since 1.9
    *
    * @deprecated Deprecated since 3.3. Use \`{@link Function.bind }\`.
    */
  def proxy[TReturn, T, U, V, W, X](fn: js.Function5[/* t */ T, /* u */ U, /* v */ V, /* w */ W, /* x */ X, TReturn]): js.Function5[/* t */ T, /* u */ U, /* v */ V, /* w */ W, /* x */ X, TReturn] = js.native
  def proxy[TReturn, A, T, U, V, W](
    fn: js.Function5[/* a */ A, /* t */ T, /* u */ U, /* v */ V, /* w */ W, TReturn],
    context: js.UndefOr[scala.Nothing],
    a: A
  ): js.Function4[/* t */ T, /* u */ U, /* v */ V, /* w */ W, TReturn] = js.native
  def proxy[TReturn, A, B, T, U, V](
    fn: js.Function5[/* a */ A, /* b */ B, /* t */ T, /* u */ U, /* v */ V, TReturn],
    context: js.UndefOr[scala.Nothing],
    a: A,
    b: B
  ): js.Function3[/* t */ T, /* u */ U, /* v */ V, TReturn] = js.native
  def proxy[TReturn, A, B, C, T, U](
    fn: js.Function5[/* a */ A, /* b */ B, /* c */ C, /* t */ T, /* u */ U, TReturn],
    context: js.UndefOr[scala.Nothing],
    a: A,
    b: B,
    c: C
  ): js.Function2[/* t */ T, /* u */ U, TReturn] = js.native
  def proxy[TReturn, A, B, C, D, T](
    fn: js.Function5[/* a */ A, /* b */ B, /* c */ C, /* d */ D, /* t */ T, TReturn],
    context: js.UndefOr[scala.Nothing],
    a: A,
    b: B,
    c: C,
    d: D
  ): js.Function1[/* t */ T, TReturn] = js.native
  def proxy[TReturn, A, B, C, D, E](
    fn: js.Function5[/* a */ A, /* b */ B, /* c */ C, /* d */ D, /* e */ E, TReturn],
    context: js.UndefOr[scala.Nothing],
    a: A,
    b: B,
    c: C,
    d: D,
    e: E
  ): js.Function0[TReturn] = js.native
  /**
    * Takes a function and returns a new one that will always have a particular context.
    *
    * @param fn The function whose context will be changed.
    * @param context The object to which the context (this) of the function should be set.
    * @see \`{@link https://api.jquery.com/jQuery.proxy/ }\`
    * @since 1.9
    *
    * @deprecated Deprecated since 3.3. Use \`{@link Function.bind }\`.
    */
  def proxy[TReturn, A, T, U, V, W](
    fn: js.Function5[/* a */ A, /* t */ T, /* u */ U, /* v */ V, /* w */ W, TReturn],
    context: Null,
    a: A
  ): js.Function4[/* t */ T, /* u */ U, /* v */ V, /* w */ W, TReturn] = js.native
  /**
    * Takes a function and returns a new one that will always have a particular context.
    *
    * @param fn The function whose context will be changed.
    * @param context The object to which the context (this) of the function should be set.
    * @see \`{@link https://api.jquery.com/jQuery.proxy/ }\`
    * @since 1.9
    *
    * @deprecated Deprecated since 3.3. Use \`{@link Function.bind }\`.
    */
  def proxy[TReturn, A, B, T, U, V](
    fn: js.Function5[/* a */ A, /* b */ B, /* t */ T, /* u */ U, /* v */ V, TReturn],
    context: Null,
    a: A,
    b: B
  ): js.Function3[/* t */ T, /* u */ U, /* v */ V, TReturn] = js.native
  /**
    * Takes a function and returns a new one that will always have a particular context.
    *
    * @param fn The function whose context will be changed.
    * @param context The object to which the context (this) of the function should be set.
    * @see \`{@link https://api.jquery.com/jQuery.proxy/ }\`
    * @since 1.9
    *
    * @deprecated Deprecated since 3.3. Use \`{@link Function.bind }\`.
    */
  def proxy[TReturn, A, B, C, T, U](
    fn: js.Function5[/* a */ A, /* b */ B, /* c */ C, /* t */ T, /* u */ U, TReturn],
    context: Null,
    a: A,
    b: B,
    c: C
  ): js.Function2[/* t */ T, /* u */ U, TReturn] = js.native
  /**
    * Takes a function and returns a new one that will always have a particular context.
    *
    * @param fn The function whose context will be changed.
    * @param context The object to which the context (this) of the function should be set.
    * @see \`{@link https://api.jquery.com/jQuery.proxy/ }\`
    * @since 1.9
    *
    * @deprecated Deprecated since 3.3. Use \`{@link Function.bind }\`.
    */
  def proxy[TReturn, A, B, C, D, T](
    fn: js.Function5[/* a */ A, /* b */ B, /* c */ C, /* d */ D, /* t */ T, TReturn],
    context: Null,
    a: A,
    b: B,
    c: C,
    d: D
  ): js.Function1[/* t */ T, TReturn] = js.native
  /**
    * Takes a function and returns a new one that will always have a particular context.
    *
    * @param fn The function whose context will be changed.
    * @param context The object to which the context (this) of the function should be set.
    * @see \`{@link https://api.jquery.com/jQuery.proxy/ }\`
    * @since 1.9
    *
    * @deprecated Deprecated since 3.3. Use \`{@link Function.bind }\`.
    */
  def proxy[TReturn, A, B, C, D, E](
    fn: js.Function5[/* a */ A, /* b */ B, /* c */ C, /* d */ D, /* e */ E, TReturn],
    context: Null,
    a: A,
    b: B,
    c: C,
    d: D,
    e: E
  ): js.Function0[TReturn] = js.native
  /**
    * Takes a function and returns a new one that will always have a particular context.
    *
    * @param fn The function whose context will be changed.
    * @param context The object to which the context (this) of the function should be set.
    * @see \`{@link https://api.jquery.com/jQuery.proxy/ }\`
    * @since 1.4
    * @since 1.6
    *
    * @deprecated Deprecated since 3.3. Use \`{@link Function.bind }\`.
    */
  def proxy[TContext /* <: js.Object */, TReturn, T, U, V, W, X](
    fn: js.Function5[/* t */ T, /* u */ U, /* v */ V, /* w */ W, /* x */ X, TReturn],
    context: TContext
  ): js.ThisFunction5[/* this */ TContext, /* t */ T, /* u */ U, /* v */ V, /* w */ W, /* x */ X, TReturn] = js.native
  /**
    * Takes a function and returns a new one that will always have a particular context.
    *
    * @param fn The function whose context will be changed.
    * @param context The object to which the context (this) of the function should be set.
    * @see \`{@link https://api.jquery.com/jQuery.proxy/ }\`
    * @since 1.4
    * @since 1.6
    *
    * @deprecated Deprecated since 3.3. Use \`{@link Function.bind }\`.
    */
  def proxy[TContext /* <: js.Object */, TReturn, A, T, U, V, W](
    fn: js.Function5[/* a */ A, /* t */ T, /* u */ U, /* v */ V, /* w */ W, TReturn],
    context: TContext,
    a: A
  ): js.ThisFunction4[/* this */ TContext, /* t */ T, /* u */ U, /* v */ V, /* w */ W, TReturn] = js.native
  /**
    * Takes a function and returns a new one that will always have a particular context.
    *
    * @param fn The function whose context will be changed.
    * @param context The object to which the context (this) of the function should be set.
    * @see \`{@link https://api.jquery.com/jQuery.proxy/ }\`
    * @since 1.4
    * @since 1.6
    *
    * @deprecated Deprecated since 3.3. Use \`{@link Function.bind }\`.
    */
  def proxy[TContext /* <: js.Object */, TReturn, A, B, T, U, V](
    fn: js.Function5[/* a */ A, /* b */ B, /* t */ T, /* u */ U, /* v */ V, TReturn],
    context: TContext,
    a: A,
    b: B
  ): js.ThisFunction3[/* this */ TContext, /* t */ T, /* u */ U, /* v */ V, TReturn] = js.native
  /**
    * Takes a function and returns a new one that will always have a particular context.
    *
    * @param fn The function whose context will be changed.
    * @param context The object to which the context (this) of the function should be set.
    * @see \`{@link https://api.jquery.com/jQuery.proxy/ }\`
    * @since 1.4
    * @since 1.6
    *
    * @deprecated Deprecated since 3.3. Use \`{@link Function.bind }\`.
    */
  def proxy[TContext /* <: js.Object */, TReturn, A, B, C, T, U](
    fn: js.Function5[/* a */ A, /* b */ B, /* c */ C, /* t */ T, /* u */ U, TReturn],
    context: TContext,
    a: A,
    b: B,
    c: C
  ): js.ThisFunction2[/* this */ TContext, /* t */ T, /* u */ U, TReturn] = js.native
  /**
    * Takes a function and returns a new one that will always have a particular context.
    *
    * @param fn The function whose context will be changed.
    * @param context The object to which the context (this) of the function should be set.
    * @see \`{@link https://api.jquery.com/jQuery.proxy/ }\`
    * @since 1.4
    * @since 1.6
    *
    * @deprecated Deprecated since 3.3. Use \`{@link Function.bind }\`.
    */
  def proxy[TContext /* <: js.Object */, TReturn, A, B, C, D, T](
    fn: js.Function5[/* a */ A, /* b */ B, /* c */ C, /* d */ D, /* t */ T, TReturn],
    context: TContext,
    a: A,
    b: B,
    c: C,
    d: D
  ): js.ThisFunction1[/* this */ TContext, /* t */ T, TReturn] = js.native
  /**
    * Takes a function and returns a new one that will always have a particular context.
    *
    * @param fn The function whose context will be changed.
    * @param context The object to which the context (this) of the function should be set.
    * @see \`{@link https://api.jquery.com/jQuery.proxy/ }\`
    * @since 1.4
    * @since 1.6
    *
    * @deprecated Deprecated since 3.3. Use \`{@link Function.bind }\`.
    */
  def proxy[TContext /* <: js.Object */, TReturn, A, B, C, D, E](
    fn: js.Function5[/* a */ A, /* b */ B, /* c */ C, /* d */ D, /* e */ E, TReturn],
    context: TContext,
    a: A,
    b: B,
    c: C,
    d: D,
    e: E
  ): js.ThisFunction0[/* this */ TContext, TReturn] = js.native
  /**
    * Takes a function and returns a new one that will always have a particular context.
    *
    * @param fn The function whose context will be changed.
    * @param context The object to which the context (this) of the function should be set.
    * @see \`{@link https://api.jquery.com/jQuery.proxy/ }\`
    * @since 1.9
    *
    * @deprecated Deprecated since 3.3. Use \`{@link Function.bind }\`.
    */
  def proxy[TReturn, T, U, V, W, X, Y](fn: js.Function6[/* t */ T, /* u */ U, /* v */ V, /* w */ W, /* x */ X, /* y */ Y, TReturn]): js.Function6[/* t */ T, /* u */ U, /* v */ V, /* w */ W, /* x */ X, /* y */ Y, TReturn] = js.native
  def proxy[TReturn, A, T, U, V, W, X](
    fn: js.Function6[/* a */ A, /* t */ T, /* u */ U, /* v */ V, /* w */ W, /* x */ X, TReturn],
    context: js.UndefOr[scala.Nothing],
    a: A
  ): js.Function5[/* t */ T, /* u */ U, /* v */ V, /* w */ W, /* x */ X, TReturn] = js.native
  def proxy[TReturn, A, B, T, U, V, W](
    fn: js.Function6[/* a */ A, /* b */ B, /* t */ T, /* u */ U, /* v */ V, /* w */ W, TReturn],
    context: js.UndefOr[scala.Nothing],
    a: A,
    b: B
  ): js.Function4[/* t */ T, /* u */ U, /* v */ V, /* w */ W, TReturn] = js.native
  def proxy[TReturn, A, B, C, T, U, V](
    fn: js.Function6[/* a */ A, /* b */ B, /* c */ C, /* t */ T, /* u */ U, /* v */ V, TReturn],
    context: js.UndefOr[scala.Nothing],
    a: A,
    b: B,
    c: C
  ): js.Function3[/* t */ T, /* u */ U, /* v */ V, TReturn] = js.native
  def proxy[TReturn, A, B, C, D, T, U](
    fn: js.Function6[/* a */ A, /* b */ B, /* c */ C, /* d */ D, /* t */ T, /* u */ U, TReturn],
    context: js.UndefOr[scala.Nothing],
    a: A,
    b: B,
    c: C,
    d: D
  ): js.Function2[/* t */ T, /* u */ U, TReturn] = js.native
  def proxy[TReturn, A, B, C, D, E, T](
    fn: js.Function6[/* a */ A, /* b */ B, /* c */ C, /* d */ D, /* e */ E, /* t */ T, TReturn],
    context: js.UndefOr[scala.Nothing],
    a: A,
    b: B,
    c: C,
    d: D,
    e: E
  ): js.Function1[/* t */ T, TReturn] = js.native
  def proxy[TReturn, A, B, C, D, E, F](
    fn: js.Function6[/* a */ A, /* b */ B, /* c */ C, /* d */ D, /* e */ E, /* f */ F, TReturn],
    context: js.UndefOr[scala.Nothing],
    a: A,
    b: B,
    c: C,
    d: D,
    e: E,
    f: F
  ): js.Function0[TReturn] = js.native
  /**
    * Takes a function and returns a new one that will always have a particular context.
    *
    * @param fn The function whose context will be changed.
    * @param context The object to which the context (this) of the function should be set.
    * @see \`{@link https://api.jquery.com/jQuery.proxy/ }\`
    * @since 1.9
    *
    * @deprecated Deprecated since 3.3. Use \`{@link Function.bind }\`.
    */
  def proxy[TReturn, A, T, U, V, W, X](
    fn: js.Function6[/* a */ A, /* t */ T, /* u */ U, /* v */ V, /* w */ W, /* x */ X, TReturn],
    context: Null,
    a: A
  ): js.Function5[/* t */ T, /* u */ U, /* v */ V, /* w */ W, /* x */ X, TReturn] = js.native
  /**
    * Takes a function and returns a new one that will always have a particular context.
    *
    * @param fn The function whose context will be changed.
    * @param context The object to which the context (this) of the function should be set.
    * @see \`{@link https://api.jquery.com/jQuery.proxy/ }\`
    * @since 1.9
    *
    * @deprecated Deprecated since 3.3. Use \`{@link Function.bind }\`.
    */
  def proxy[TReturn, A, B, T, U, V, W](
    fn: js.Function6[/* a */ A, /* b */ B, /* t */ T, /* u */ U, /* v */ V, /* w */ W, TReturn],
    context: Null,
    a: A,
    b: B
  ): js.Function4[/* t */ T, /* u */ U, /* v */ V, /* w */ W, TReturn] = js.native
  /**
    * Takes a function and returns a new one that will always have a particular context.
    *
    * @param fn The function whose context will be changed.
    * @param context The object to which the context (this) of the function should be set.
    * @see \`{@link https://api.jquery.com/jQuery.proxy/ }\`
    * @since 1.9
    *
    * @deprecated Deprecated since 3.3. Use \`{@link Function.bind }\`.
    */
  def proxy[TReturn, A, B, C, T, U, V](
    fn: js.Function6[/* a */ A, /* b */ B, /* c */ C, /* t */ T, /* u */ U, /* v */ V, TReturn],
    context: Null,
    a: A,
    b: B,
    c: C
  ): js.Function3[/* t */ T, /* u */ U, /* v */ V, TReturn] = js.native
  /**
    * Takes a function and returns a new one that will always have a particular context.
    *
    * @param fn The function whose context will be changed.
    * @param context The object to which the context (this) of the function should be set.
    * @see \`{@link https://api.jquery.com/jQuery.proxy/ }\`
    * @since 1.9
    *
    * @deprecated Deprecated since 3.3. Use \`{@link Function.bind }\`.
    */
  def proxy[TReturn, A, B, C, D, T, U](
    fn: js.Function6[/* a */ A, /* b */ B, /* c */ C, /* d */ D, /* t */ T, /* u */ U, TReturn],
    context: Null,
    a: A,
    b: B,
    c: C,
    d: D
  ): js.Function2[/* t */ T, /* u */ U, TReturn] = js.native
  /**
    * Takes a function and returns a new one that will always have a particular context.
    *
    * @param fn The function whose context will be changed.
    * @param context The object to which the context (this) of the function should be set.
    * @see \`{@link https://api.jquery.com/jQuery.proxy/ }\`
    * @since 1.9
    *
    * @deprecated Deprecated since 3.3. Use \`{@link Function.bind }\`.
    */
  def proxy[TReturn, A, B, C, D, E, T](
    fn: js.Function6[/* a */ A, /* b */ B, /* c */ C, /* d */ D, /* e */ E, /* t */ T, TReturn],
    context: Null,
    a: A,
    b: B,
    c: C,
    d: D,
    e: E
  ): js.Function1[/* t */ T, TReturn] = js.native
  /**
    * Takes a function and returns a new one that will always have a particular context.
    *
    * @param fn The function whose context will be changed.
    * @param context The object to which the context (this) of the function should be set.
    * @see \`{@link https://api.jquery.com/jQuery.proxy/ }\`
    * @since 1.9
    *
    * @deprecated Deprecated since 3.3. Use \`{@link Function.bind }\`.
    */
  def proxy[TReturn, A, B, C, D, E, F](
    fn: js.Function6[/* a */ A, /* b */ B, /* c */ C, /* d */ D, /* e */ E, /* f */ F, TReturn],
    context: Null,
    a: A,
    b: B,
    c: C,
    d: D,
    e: E,
    f: F
  ): js.Function0[TReturn] = js.native
  /**
    * Takes a function and returns a new one that will always have a particular context.
    *
    * @param fn The function whose context will be changed.
    * @param context The object to which the context (this) of the function should be set.
    * @see \`{@link https://api.jquery.com/jQuery.proxy/ }\`
    * @since 1.4
    * @since 1.6
    *
    * @deprecated Deprecated since 3.3. Use \`{@link Function.bind }\`.
    */
  def proxy[TContext /* <: js.Object */, TReturn, T, U, V, W, X, Y](
    fn: js.Function6[/* t */ T, /* u */ U, /* v */ V, /* w */ W, /* x */ X, /* y */ Y, TReturn],
    context: TContext
  ): js.ThisFunction6[/* this */ TContext, /* t */ T, /* u */ U, /* v */ V, /* w */ W, /* x */ X, /* y */ Y, TReturn] = js.native
  /**
    * Takes a function and returns a new one that will always have a particular context.
    *
    * @param fn The function whose context will be changed.
    * @param context The object to which the context (this) of the function should be set.
    * @see \`{@link https://api.jquery.com/jQuery.proxy/ }\`
    * @since 1.4
    * @since 1.6
    *
    * @deprecated Deprecated since 3.3. Use \`{@link Function.bind }\`.
    */
  def proxy[TContext /* <: js.Object */, TReturn, A, T, U, V, W, X](
    fn: js.Function6[/* a */ A, /* t */ T, /* u */ U, /* v */ V, /* w */ W, /* x */ X, TReturn],
    context: TContext,
    a: A
  ): js.ThisFunction5[/* this */ TContext, /* t */ T, /* u */ U, /* v */ V, /* w */ W, /* x */ X, TReturn] = js.native
  /**
    * Takes a function and returns a new one that will always have a particular context.
    *
    * @param fn The function whose context will be changed.
    * @param context The object to which the context (this) of the function should be set.
    * @see \`{@link https://api.jquery.com/jQuery.proxy/ }\`
    * @since 1.4
    * @since 1.6
    *
    * @deprecated Deprecated since 3.3. Use \`{@link Function.bind }\`.
    */
  def proxy[TContext /* <: js.Object */, TReturn, A, B, T, U, V, W](
    fn: js.Function6[/* a */ A, /* b */ B, /* t */ T, /* u */ U, /* v */ V, /* w */ W, TReturn],
    context: TContext,
    a: A,
    b: B
  ): js.ThisFunction4[/* this */ TContext, /* t */ T, /* u */ U, /* v */ V, /* w */ W, TReturn] = js.native
  /**
    * Takes a function and returns a new one that will always have a particular context.
    *
    * @param fn The function whose context will be changed.
    * @param context The object to which the context (this) of the function should be set.
    * @see \`{@link https://api.jquery.com/jQuery.proxy/ }\`
    * @since 1.4
    * @since 1.6
    *
    * @deprecated Deprecated since 3.3. Use \`{@link Function.bind }\`.
    */
  def proxy[TContext /* <: js.Object */, TReturn, A, B, C, T, U, V](
    fn: js.Function6[/* a */ A, /* b */ B, /* c */ C, /* t */ T, /* u */ U, /* v */ V, TReturn],
    context: TContext,
    a: A,
    b: B,
    c: C
  ): js.ThisFunction3[/* this */ TContext, /* t */ T, /* u */ U, /* v */ V, TReturn] = js.native
  /**
    * Takes a function and returns a new one that will always have a particular context.
    *
    * @param fn The function whose context will be changed.
    * @param context The object to which the context (this) of the function should be set.
    * @see \`{@link https://api.jquery.com/jQuery.proxy/ }\`
    * @since 1.4
    * @since 1.6
    *
    * @deprecated Deprecated since 3.3. Use \`{@link Function.bind }\`.
    */
  def proxy[TContext /* <: js.Object */, TReturn, A, B, C, D, T, U](
    fn: js.Function6[/* a */ A, /* b */ B, /* c */ C, /* d */ D, /* t */ T, /* u */ U, TReturn],
    context: TContext,
    a: A,
    b: B,
    c: C,
    d: D
  ): js.ThisFunction2[/* this */ TContext, /* t */ T, /* u */ U, TReturn] = js.native
  /**
    * Takes a function and returns a new one that will always have a particular context.
    *
    * @param fn The function whose context will be changed.
    * @param context The object to which the context (this) of the function should be set.
    * @see \`{@link https://api.jquery.com/jQuery.proxy/ }\`
    * @since 1.4
    * @since 1.6
    *
    * @deprecated Deprecated since 3.3. Use \`{@link Function.bind }\`.
    */
  def proxy[TContext /* <: js.Object */, TReturn, A, B, C, D, E, T](
    fn: js.Function6[/* a */ A, /* b */ B, /* c */ C, /* d */ D, /* e */ E, /* t */ T, TReturn],
    context: TContext,
    a: A,
    b: B,
    c: C,
    d: D,
    e: E
  ): js.ThisFunction1[/* this */ TContext, /* t */ T, TReturn] = js.native
  /**
    * Takes a function and returns a new one that will always have a particular context.
    *
    * @param fn The function whose context will be changed.
    * @param context The object to which the context (this) of the function should be set.
    * @see \`{@link https://api.jquery.com/jQuery.proxy/ }\`
    * @since 1.4
    * @since 1.6
    *
    * @deprecated Deprecated since 3.3. Use \`{@link Function.bind }\`.
    */
  def proxy[TContext /* <: js.Object */, TReturn, A, B, C, D, E, F](
    fn: js.Function6[/* a */ A, /* b */ B, /* c */ C, /* d */ D, /* e */ E, /* f */ F, TReturn],
    context: TContext,
    a: A,
    b: B,
    c: C,
    d: D,
    e: E,
    f: F
  ): js.ThisFunction0[/* this */ TContext, TReturn] = js.native
  def proxy[TReturn, A, T, U, V, W, X, Y](
    fn: js.Function7[/* a */ A, /* t */ T, /* u */ U, /* v */ V, /* w */ W, /* x */ X, /* y */ Y, TReturn],
    context: js.UndefOr[scala.Nothing],
    a: A
  ): js.Function6[/* t */ T, /* u */ U, /* v */ V, /* w */ W, /* x */ X, /* y */ Y, TReturn] = js.native
  def proxy[TReturn, A, B, T, U, V, W, X](
    fn: js.Function7[/* a */ A, /* b */ B, /* t */ T, /* u */ U, /* v */ V, /* w */ W, /* x */ X, TReturn],
    context: js.UndefOr[scala.Nothing],
    a: A,
    b: B
  ): js.Function5[/* t */ T, /* u */ U, /* v */ V, /* w */ W, /* x */ X, TReturn] = js.native
  def proxy[TReturn, A, B, C, T, U, V, W](
    fn: js.Function7[/* a */ A, /* b */ B, /* c */ C, /* t */ T, /* u */ U, /* v */ V, /* w */ W, TReturn],
    context: js.UndefOr[scala.Nothing],
    a: A,
    b: B,
    c: C
  ): js.Function4[/* t */ T, /* u */ U, /* v */ V, /* w */ W, TReturn] = js.native
  def proxy[TReturn, A, B, C, D, T, U, V](
    fn: js.Function7[/* a */ A, /* b */ B, /* c */ C, /* d */ D, /* t */ T, /* u */ U, /* v */ V, TReturn],
    context: js.UndefOr[scala.Nothing],
    a: A,
    b: B,
    c: C,
    d: D
  ): js.Function3[/* t */ T, /* u */ U, /* v */ V, TReturn] = js.native
  def proxy[TReturn, A, B, C, D, E, T, U](
    fn: js.Function7[/* a */ A, /* b */ B, /* c */ C, /* d */ D, /* e */ E, /* t */ T, /* u */ U, TReturn],
    context: js.UndefOr[scala.Nothing],
    a: A,
    b: B,
    c: C,
    d: D,
    e: E
  ): js.Function2[/* t */ T, /* u */ U, TReturn] = js.native
  def proxy[TReturn, A, B, C, D, E, F, T](
    fn: js.Function7[/* a */ A, /* b */ B, /* c */ C, /* d */ D, /* e */ E, /* f */ F, /* t */ T, TReturn],
    context: js.UndefOr[scala.Nothing],
    a: A,
    b: B,
    c: C,
    d: D,
    e: E,
    f: F
  ): js.Function1[/* t */ T, TReturn] = js.native
  def proxy[TReturn, A, B, C, D, E, F, G](
    fn: js.Function7[/* a */ A, /* b */ B, /* c */ C, /* d */ D, /* e */ E, /* f */ F, /* g */ G, TReturn],
    context: js.UndefOr[scala.Nothing],
    a: A,
    b: B,
    c: C,
    d: D,
    e: E,
    f: F,
    g: G
  ): js.Function0[TReturn] = js.native
  /**
    * Takes a function and returns a new one that will always have a particular context.
    *
    * @param fn The function whose context will be changed.
    * @param context The object to which the context (this) of the function should be set.
    * @see \`{@link https://api.jquery.com/jQuery.proxy/ }\`
    * @since 1.9
    *
    * @deprecated Deprecated since 3.3. Use \`{@link Function.bind }\`.
    */
  def proxy[TReturn, A, T, U, V, W, X, Y](
    fn: js.Function7[/* a */ A, /* t */ T, /* u */ U, /* v */ V, /* w */ W, /* x */ X, /* y */ Y, TReturn],
    context: Null,
    a: A
  ): js.Function6[/* t */ T, /* u */ U, /* v */ V, /* w */ W, /* x */ X, /* y */ Y, TReturn] = js.native
  /**
    * Takes a function and returns a new one that will always have a particular context.
    *
    * @param fn The function whose context will be changed.
    * @param context The object to which the context (this) of the function should be set.
    * @see \`{@link https://api.jquery.com/jQuery.proxy/ }\`
    * @since 1.9
    *
    * @deprecated Deprecated since 3.3. Use \`{@link Function.bind }\`.
    */
  def proxy[TReturn, A, B, T, U, V, W, X](
    fn: js.Function7[/* a */ A, /* b */ B, /* t */ T, /* u */ U, /* v */ V, /* w */ W, /* x */ X, TReturn],
    context: Null,
    a: A,
    b: B
  ): js.Function5[/* t */ T, /* u */ U, /* v */ V, /* w */ W, /* x */ X, TReturn] = js.native
  /**
    * Takes a function and returns a new one that will always have a particular context.
    *
    * @param fn The function whose context will be changed.
    * @param context The object to which the context (this) of the function should be set.
    * @see \`{@link https://api.jquery.com/jQuery.proxy/ }\`
    * @since 1.9
    *
    * @deprecated Deprecated since 3.3. Use \`{@link Function.bind }\`.
    */
  def proxy[TReturn, A, B, C, T, U, V, W](
    fn: js.Function7[/* a */ A, /* b */ B, /* c */ C, /* t */ T, /* u */ U, /* v */ V, /* w */ W, TReturn],
    context: Null,
    a: A,
    b: B,
    c: C
  ): js.Function4[/* t */ T, /* u */ U, /* v */ V, /* w */ W, TReturn] = js.native
  /**
    * Takes a function and returns a new one that will always have a particular context.
    *
    * @param fn The function whose context will be changed.
    * @param context The object to which the context (this) of the function should be set.
    * @see \`{@link https://api.jquery.com/jQuery.proxy/ }\`
    * @since 1.9
    *
    * @deprecated Deprecated since 3.3. Use \`{@link Function.bind }\`.
    */
  def proxy[TReturn, A, B, C, D, T, U, V](
    fn: js.Function7[/* a */ A, /* b */ B, /* c */ C, /* d */ D, /* t */ T, /* u */ U, /* v */ V, TReturn],
    context: Null,
    a: A,
    b: B,
    c: C,
    d: D
  ): js.Function3[/* t */ T, /* u */ U, /* v */ V, TReturn] = js.native
  /**
    * Takes a function and returns a new one that will always have a particular context.
    *
    * @param fn The function whose context will be changed.
    * @param context The object to which the context (this) of the function should be set.
    * @see \`{@link https://api.jquery.com/jQuery.proxy/ }\`
    * @since 1.9
    *
    * @deprecated Deprecated since 3.3. Use \`{@link Function.bind }\`.
    */
  def proxy[TReturn, A, B, C, D, E, T, U](
    fn: js.Function7[/* a */ A, /* b */ B, /* c */ C, /* d */ D, /* e */ E, /* t */ T, /* u */ U, TReturn],
    context: Null,
    a: A,
    b: B,
    c: C,
    d: D,
    e: E
  ): js.Function2[/* t */ T, /* u */ U, TReturn] = js.native
  /**
    * Takes a function and returns a new one that will always have a particular context.
    *
    * @param fn The function whose context will be changed.
    * @param context The object to which the context (this) of the function should be set.
    * @see \`{@link https://api.jquery.com/jQuery.proxy/ }\`
    * @since 1.9
    *
    * @deprecated Deprecated since 3.3. Use \`{@link Function.bind }\`.
    */
  def proxy[TReturn, A, B, C, D, E, F, T](
    fn: js.Function7[/* a */ A, /* b */ B, /* c */ C, /* d */ D, /* e */ E, /* f */ F, /* t */ T, TReturn],
    context: Null,
    a: A,
    b: B,
    c: C,
    d: D,
    e: E,
    f: F
  ): js.Function1[/* t */ T, TReturn] = js.native
  // region proxy
  // region (fn, null | undefined)
  // region 0 to 7 arguments
  // region 0 parameters
  /**
    * Takes a function and returns a new one that will always have a particular context.
    *
    * @param fn The function whose context will be changed.
    * @param context The object to which the context (this) of the function should be set.
    * @see \`{@link https://api.jquery.com/jQuery.proxy/ }\`
    * @since 1.9
    *
    * @deprecated Deprecated since 3.3. Use \`{@link Function.bind }\`.
    */
  def proxy[TReturn, A, B, C, D, E, F, G](
    fn: js.Function7[/* a */ A, /* b */ B, /* c */ C, /* d */ D, /* e */ E, /* f */ F, /* g */ G, TReturn],
    context: Null,
    a: A,
    b: B,
    c: C,
    d: D,
    e: E,
    f: F,
    g: G
  ): js.Function0[TReturn] = js.native
  /**
    * Takes a function and returns a new one that will always have a particular context.
    *
    * @param fn The function whose context will be changed.
    * @param context The object to which the context (this) of the function should be set.
    * @see \`{@link https://api.jquery.com/jQuery.proxy/ }\`
    * @since 1.9
    *
    * @deprecated Deprecated since 3.3. Use \`{@link Function.bind }\`.
    */
  def proxy[TReturn, T, U, V, W, X, Y, Z](
    fn: js.Function8[
      /* t */ T, 
      /* u */ U, 
      /* v */ V, 
      /* w */ W, 
      /* x */ X, 
      /* y */ Y, 
      /* z */ Z, 
      /* repeated */ js.Any, 
      TReturn
    ]
  ): js.Function8[
    /* t */ T, 
    /* u */ U, 
    /* v */ V, 
    /* w */ W, 
    /* x */ X, 
    /* y */ Y, 
    /* z */ Z, 
    /* repeated */ js.Any, 
    TReturn
  ] = js.native
  /**
    * Takes a function and returns a new one that will always have a particular context.
    *
    * @param fn The function whose context will be changed.
    * @param context The object to which the context (this) of the function should be set.
    * @see \`{@link https://api.jquery.com/jQuery.proxy/ }\`
    * @since 1.4
    * @since 1.6
    *
    * @deprecated Deprecated since 3.3. Use \`{@link Function.bind }\`.
    */
  def proxy[TContext /* <: js.Object */, TReturn, A, T, U, V, W, X, Y](
    fn: js.Function7[/* a */ A, /* t */ T, /* u */ U, /* v */ V, /* w */ W, /* x */ X, /* y */ Y, TReturn],
    context: TContext,
    a: A
  ): js.ThisFunction6[/* this */ TContext, /* t */ T, /* u */ U, /* v */ V, /* w */ W, /* x */ X, /* y */ Y, TReturn] = js.native
  /**
    * Takes a function and returns a new one that will always have a particular context.
    *
    * @param fn The function whose context will be changed.
    * @param context The object to which the context (this) of the function should be set.
    * @see \`{@link https://api.jquery.com/jQuery.proxy/ }\`
    * @since 1.4
    * @since 1.6
    *
    * @deprecated Deprecated since 3.3. Use \`{@link Function.bind }\`.
    */
  def proxy[TContext /* <: js.Object */, TReturn, A, B, T, U, V, W, X](
    fn: js.Function7[/* a */ A, /* b */ B, /* t */ T, /* u */ U, /* v */ V, /* w */ W, /* x */ X, TReturn],
    context: TContext,
    a: A,
    b: B
  ): js.ThisFunction5[/* this */ TContext, /* t */ T, /* u */ U, /* v */ V, /* w */ W, /* x */ X, TReturn] = js.native
  /**
    * Takes a function and returns a new one that will always have a particular context.
    *
    * @param fn The function whose context will be changed.
    * @param context The object to which the context (this) of the function should be set.
    * @see \`{@link https://api.jquery.com/jQuery.proxy/ }\`
    * @since 1.4
    * @since 1.6
    *
    * @deprecated Deprecated since 3.3. Use \`{@link Function.bind }\`.
    */
  def proxy[TContext /* <: js.Object */, TReturn, A, B, C, T, U, V, W](
    fn: js.Function7[/* a */ A, /* b */ B, /* c */ C, /* t */ T, /* u */ U, /* v */ V, /* w */ W, TReturn],
    context: TContext,
    a: A,
    b: B,
    c: C
  ): js.ThisFunction4[/* this */ TContext, /* t */ T, /* u */ U, /* v */ V, /* w */ W, TReturn] = js.native
  /**
    * Takes a function and returns a new one that will always have a particular context.
    *
    * @param fn The function whose context will be changed.
    * @param context The object to which the context (this) of the function should be set.
    * @see \`{@link https://api.jquery.com/jQuery.proxy/ }\`
    * @since 1.4
    * @since 1.6
    *
    * @deprecated Deprecated since 3.3. Use \`{@link Function.bind }\`.
    */
  def proxy[TContext /* <: js.Object */, TReturn, A, B, C, D, T, U, V](
    fn: js.Function7[/* a */ A, /* b */ B, /* c */ C, /* d */ D, /* t */ T, /* u */ U, /* v */ V, TReturn],
    context: TContext,
    a: A,
    b: B,
    c: C,
    d: D
  ): js.ThisFunction3[/* this */ TContext, /* t */ T, /* u */ U, /* v */ V, TReturn] = js.native
  /**
    * Takes a function and returns a new one that will always have a particular context.
    *
    * @param fn The function whose context will be changed.
    * @param context The object to which the context (this) of the function should be set.
    * @see \`{@link https://api.jquery.com/jQuery.proxy/ }\`
    * @since 1.4
    * @since 1.6
    *
    * @deprecated Deprecated since 3.3. Use \`{@link Function.bind }\`.
    */
  def proxy[TContext /* <: js.Object */, TReturn, A, B, C, D, E, T, U](
    fn: js.Function7[/* a */ A, /* b */ B, /* c */ C, /* d */ D, /* e */ E, /* t */ T, /* u */ U, TReturn],
    context: TContext,
    a: A,
    b: B,
    c: C,
    d: D,
    e: E
  ): js.ThisFunction2[/* this */ TContext, /* t */ T, /* u */ U, TReturn] = js.native
  /**
    * Takes a function and returns a new one that will always have a particular context.
    *
    * @param fn The function whose context will be changed.
    * @param context The object to which the context (this) of the function should be set.
    * @see \`{@link https://api.jquery.com/jQuery.proxy/ }\`
    * @since 1.4
    * @since 1.6
    *
    * @deprecated Deprecated since 3.3. Use \`{@link Function.bind }\`.
    */
  def proxy[TContext /* <: js.Object */, TReturn, A, B, C, D, E, F, T](
    fn: js.Function7[/* a */ A, /* b */ B, /* c */ C, /* d */ D, /* e */ E, /* f */ F, /* t */ T, TReturn],
    context: TContext,
    a: A,
    b: B,
    c: C,
    d: D,
    e: E,
    f: F
  ): js.ThisFunction1[/* this */ TContext, /* t */ T, TReturn] = js.native
  // endregion
  // endregion
  // region (fn, context)
  // region 0 to 7 arguments
  // region 0 parameters
  /**
    * Takes a function and returns a new one that will always have a particular context.
    *
    * @param fn The function whose context will be changed.
    * @param context The object to which the context (this) of the function should be set.
    * @see \`{@link https://api.jquery.com/jQuery.proxy/ }\`
    * @since 1.4
    * @since 1.6
    *
    * @deprecated Deprecated since 3.3. Use \`{@link Function.bind }\`.
    */
  def proxy[TContext /* <: js.Object */, TReturn, A, B, C, D, E, F, G](
    fn: js.Function7[/* a */ A, /* b */ B, /* c */ C, /* d */ D, /* e */ E, /* f */ F, /* g */ G, TReturn],
    context: TContext,
    a: A,
    b: B,
    c: C,
    d: D,
    e: E,
    f: F,
    g: G
  ): js.ThisFunction0[/* this */ TContext, TReturn] = js.native
  /**
    * Takes a function and returns a new one that will always have a particular context.
    *
    * @param fn The function whose context will be changed.
    * @param context The object to which the context (this) of the function should be set.
    * @see \`{@link https://api.jquery.com/jQuery.proxy/ }\`
    * @since 1.4
    * @since 1.6
    *
    * @deprecated Deprecated since 3.3. Use \`{@link Function.bind }\`.
    */
  def proxy[TContext /* <: js.Object */, TReturn, T, U, V, W, X, Y, Z](
    fn: js.Function8[
      /* t */ T, 
      /* u */ U, 
      /* v */ V, 
      /* w */ W, 
      /* x */ X, 
      /* y */ Y, 
      /* z */ Z, 
      /* repeated */ js.Any, 
      TReturn
    ],
    context: TContext
  ): js.ThisFunction8[
    /* this */ TContext, 
    /* t */ T, 
    /* u */ U, 
    /* v */ V, 
    /* w */ W, 
    /* x */ X, 
    /* y */ Y, 
    /* z */ Z, 
    /* repeated */ js.Any, 
    TReturn
  ] = js.native
  def proxy[TReturn, A, B, T, U, V, W, X, Y](
    fn: js.Function8[/* a */ A, /* b */ B, /* t */ T, /* u */ U, /* v */ V, /* w */ W, /* x */ X, /* y */ Y, TReturn],
    context: js.UndefOr[scala.Nothing],
    a: A,
    b: B
  ): js.Function6[/* t */ T, /* u */ U, /* v */ V, /* w */ W, /* x */ X, /* y */ Y, TReturn] = js.native
  def proxy[TReturn, A, B, C, T, U, V, W, X](
    fn: js.Function8[/* a */ A, /* b */ B, /* c */ C, /* t */ T, /* u */ U, /* v */ V, /* w */ W, /* x */ X, TReturn],
    context: js.UndefOr[scala.Nothing],
    a: A,
    b: B,
    c: C
  ): js.Function5[/* t */ T, /* u */ U, /* v */ V, /* w */ W, /* x */ X, TReturn] = js.native
  def proxy[TReturn, A, B, C, D, T, U, V, W](
    fn: js.Function8[/* a */ A, /* b */ B, /* c */ C, /* d */ D, /* t */ T, /* u */ U, /* v */ V, /* w */ W, TReturn],
    context: js.UndefOr[scala.Nothing],
    a: A,
    b: B,
    c: C,
    d: D
  ): js.Function4[/* t */ T, /* u */ U, /* v */ V, /* w */ W, TReturn] = js.native
  def proxy[TReturn, A, B, C, D, E, T, U, V](
    fn: js.Function8[/* a */ A, /* b */ B, /* c */ C, /* d */ D, /* e */ E, /* t */ T, /* u */ U, /* v */ V, TReturn],
    context: js.UndefOr[scala.Nothing],
    a: A,
    b: B,
    c: C,
    d: D,
    e: E
  ): js.Function3[/* t */ T, /* u */ U, /* v */ V, TReturn] = js.native
  def proxy[TReturn, A, B, C, D, E, F, T, U](
    fn: js.Function8[/* a */ A, /* b */ B, /* c */ C, /* d */ D, /* e */ E, /* f */ F, /* t */ T, /* u */ U, TReturn],
    context: js.UndefOr[scala.Nothing],
    a: A,
    b: B,
    c: C,
    d: D,
    e: E,
    f: F
  ): js.Function2[/* t */ T, /* u */ U, TReturn] = js.native
  def proxy[TReturn, A, B, C, D, E, F, G, T](
    fn: js.Function8[/* a */ A, /* b */ B, /* c */ C, /* d */ D, /* e */ E, /* f */ F, /* g */ G, /* t */ T, TReturn],
    context: js.UndefOr[scala.Nothing],
    a: A,
    b: B,
    c: C,
    d: D,
    e: E,
    f: F,
    g: G
  ): js.Function1[/* t */ T, TReturn] = js.native
  /**
    * Takes a function and returns a new one that will always have a particular context.
    *
    * @param fn The function whose context will be changed.
    * @param context The object to which the context (this) of the function should be set.
    * @see \`{@link https://api.jquery.com/jQuery.proxy/ }\`
    * @since 1.9
    *
    * @deprecated Deprecated since 3.3. Use \`{@link Function.bind }\`.
    */
  def proxy[TReturn, A, B, T, U, V, W, X, Y](
    fn: js.Function8[/* a */ A, /* b */ B, /* t */ T, /* u */ U, /* v */ V, /* w */ W, /* x */ X, /* y */ Y, TReturn],
    context: Null,
    a: A,
    b: B
  ): js.Function6[/* t */ T, /* u */ U, /* v */ V, /* w */ W, /* x */ X, /* y */ Y, TReturn] = js.native
  /**
    * Takes a function and returns a new one that will always have a particular context.
    *
    * @param fn The function whose context will be changed.
    * @param context The object to which the context (this) of the function should be set.
    * @see \`{@link https://api.jquery.com/jQuery.proxy/ }\`
    * @since 1.9
    *
    * @deprecated Deprecated since 3.3. Use \`{@link Function.bind }\`.
    */
  def proxy[TReturn, A, B, C, T, U, V, W, X](
    fn: js.Function8[/* a */ A, /* b */ B, /* c */ C, /* t */ T, /* u */ U, /* v */ V, /* w */ W, /* x */ X, TReturn],
    context: Null,
    a: A,
    b: B,
    c: C
  ): js.Function5[/* t */ T, /* u */ U, /* v */ V, /* w */ W, /* x */ X, TReturn] = js.native
  /**
    * Takes a function and returns a new one that will always have a particular context.
    *
    * @param fn The function whose context will be changed.
    * @param context The object to which the context (this) of the function should be set.
    * @see \`{@link https://api.jquery.com/jQuery.proxy/ }\`
    * @since 1.9
    *
    * @deprecated Deprecated since 3.3. Use \`{@link Function.bind }\`.
    */
  def proxy[TReturn, A, B, C, D, T, U, V, W](
    fn: js.Function8[/* a */ A, /* b */ B, /* c */ C, /* d */ D, /* t */ T, /* u */ U, /* v */ V, /* w */ W, TReturn],
    context: Null,
    a: A,
    b: B,
    c: C,
    d: D
  ): js.Function4[/* t */ T, /* u */ U, /* v */ V, /* w */ W, TReturn] = js.native
  /**
    * Takes a function and returns a new one that will always have a particular context.
    *
    * @param fn The function whose context will be changed.
    * @param context The object to which the context (this) of the function should be set.
    * @see \`{@link https://api.jquery.com/jQuery.proxy/ }\`
    * @since 1.9
    *
    * @deprecated Deprecated since 3.3. Use \`{@link Function.bind }\`.
    */
  def proxy[TReturn, A, B, C, D, E, T, U, V](
    fn: js.Function8[/* a */ A, /* b */ B, /* c */ C, /* d */ D, /* e */ E, /* t */ T, /* u */ U, /* v */ V, TReturn],
    context: Null,
    a: A,
    b: B,
    c: C,
    d: D,
    e: E
  ): js.Function3[/* t */ T, /* u */ U, /* v */ V, TReturn] = js.native
  /**
    * Takes a function and returns a new one that will always have a particular context.
    *
    * @param fn The function whose context will be changed.
    * @param context The object to which the context (this) of the function should be set.
    * @see \`{@link https://api.jquery.com/jQuery.proxy/ }\`
    * @since 1.9
    *
    * @deprecated Deprecated since 3.3. Use \`{@link Function.bind }\`.
    */
  def proxy[TReturn, A, B, C, D, E, F, T, U](
    fn: js.Function8[/* a */ A, /* b */ B, /* c */ C, /* d */ D, /* e */ E, /* f */ F, /* t */ T, /* u */ U, TReturn],
    context: Null,
    a: A,
    b: B,
    c: C,
    d: D,
    e: E,
    f: F
  ): js.Function2[/* t */ T, /* u */ U, TReturn] = js.native
  // endregion
  // region 1 parameters
  /**
    * Takes a function and returns a new one that will always have a particular context.
    *
    * @param fn The function whose context will be changed.
    * @param context The object to which the context (this) of the function should be set.
    * @see \`{@link https://api.jquery.com/jQuery.proxy/ }\`
    * @since 1.9
    *
    * @deprecated Deprecated since 3.3. Use \`{@link Function.bind }\`.
    */
  def proxy[TReturn, A, B, C, D, E, F, G, T](
    fn: js.Function8[/* a */ A, /* b */ B, /* c */ C, /* d */ D, /* e */ E, /* f */ F, /* g */ G, /* t */ T, TReturn],
    context: Null,
    a: A,
    b: B,
    c: C,
    d: D,
    e: E,
    f: F,
    g: G
  ): js.Function1[/* t */ T, TReturn] = js.native
  def proxy[TReturn, A, T, U, V, W, X, Y, Z](
    fn: js.Function9[
      /* a */ A, 
      /* t */ T, 
      /* u */ U, 
      /* v */ V, 
      /* w */ W, 
      /* x */ X, 
      /* y */ Y, 
      /* z */ Z, 
      /* repeated */ js.Any, 
      TReturn
    ],
    context: js.UndefOr[scala.Nothing],
    a: A
  ): js.Function8[
    /* t */ T, 
    /* u */ U, 
    /* v */ V, 
    /* w */ W, 
    /* x */ X, 
    /* y */ Y, 
    /* z */ Z, 
    /* repeated */ js.Any, 
    TReturn
  ] = js.native
  /**
    * Takes a function and returns a new one that will always have a particular context.
    *
    * @param fn The function whose context will be changed.
    * @param context The object to which the context (this) of the function should be set.
    * @see \`{@link https://api.jquery.com/jQuery.proxy/ }\`
    * @since 1.9
    *
    * @deprecated Deprecated since 3.3. Use \`{@link Function.bind }\`.
    */
  def proxy[TReturn, A, T, U, V, W, X, Y, Z](
    fn: js.Function9[
      /* a */ A, 
      /* t */ T, 
      /* u */ U, 
      /* v */ V, 
      /* w */ W, 
      /* x */ X, 
      /* y */ Y, 
      /* z */ Z, 
      /* repeated */ js.Any, 
      TReturn
    ],
    context: Null,
    a: A
  ): js.Function8[
    /* t */ T, 
    /* u */ U, 
    /* v */ V, 
    /* w */ W, 
    /* x */ X, 
    /* y */ Y, 
    /* z */ Z, 
    /* repeated */ js.Any, 
    TReturn
  ] = js.native
  def proxy[TReturn, A, B, T, U, V, W, X, Y, Z](
    fn: js.Function10[
      /* a */ A, 
      /* b */ B, 
      /* t */ T, 
      /* u */ U, 
      /* v */ V, 
      /* w */ W, 
      /* x */ X, 
      /* y */ Y, 
      /* z */ Z, 
      /* repeated */ js.Any, 
      TReturn
    ],
    context: js.UndefOr[scala.Nothing],
    a: A,
    b: B
  ): js.Function8[
    /* t */ T, 
    /* u */ U, 
    /* v */ V, 
    /* w */ W, 
    /* x */ X, 
    /* y */ Y, 
    /* z */ Z, 
    /* repeated */ js.Any, 
    TReturn
  ] = js.native
  /**
    * Takes a function and returns a new one that will always have a particular context.
    *
    * @param fn The function whose context will be changed.
    * @param context The object to which the context (this) of the function should be set.
    * @see \`{@link https://api.jquery.com/jQuery.proxy/ }\`
    * @since 1.9
    *
    * @deprecated Deprecated since 3.3. Use \`{@link Function.bind }\`.
    */
  def proxy[TReturn, A, B, T, U, V, W, X, Y, Z](
    fn: js.Function10[
      /* a */ A, 
      /* b */ B, 
      /* t */ T, 
      /* u */ U, 
      /* v */ V, 
      /* w */ W, 
      /* x */ X, 
      /* y */ Y, 
      /* z */ Z, 
      /* repeated */ js.Any, 
      TReturn
    ],
    context: Null,
    a: A,
    b: B
  ): js.Function8[
    /* t */ T, 
    /* u */ U, 
    /* v */ V, 
    /* w */ W, 
    /* x */ X, 
    /* y */ Y, 
    /* z */ Z, 
    /* repeated */ js.Any, 
    TReturn
  ] = js.native
  /**
    * Takes a function and returns a new one that will always have a particular context.
    *
    * @param fn The function whose context will be changed.
    * @param context The object to which the context (this) of the function should be set.
    * @see \`{@link https://api.jquery.com/jQuery.proxy/ }\`
    * @since 1.4
    * @since 1.6
    *
    * @deprecated Deprecated since 3.3. Use \`{@link Function.bind }\`.
    */
  def proxy[TContext /* <: js.Object */, TReturn, A, B, T, U, V, W, X, Y](
    fn: js.Function8[/* a */ A, /* b */ B, /* t */ T, /* u */ U, /* v */ V, /* w */ W, /* x */ X, /* y */ Y, TReturn],
    context: TContext,
    a: A,
    b: B
  ): js.ThisFunction6[/* this */ TContext, /* t */ T, /* u */ U, /* v */ V, /* w */ W, /* x */ X, /* y */ Y, TReturn] = js.native
  /**
    * Takes a function and returns a new one that will always have a particular context.
    *
    * @param fn The function whose context will be changed.
    * @param context The object to which the context (this) of the function should be set.
    * @see \`{@link https://api.jquery.com/jQuery.proxy/ }\`
    * @since 1.4
    * @since 1.6
    *
    * @deprecated Deprecated since 3.3. Use \`{@link Function.bind }\`.
    */
  def proxy[TContext /* <: js.Object */, TReturn, A, B, C, T, U, V, W, X](
    fn: js.Function8[/* a */ A, /* b */ B, /* c */ C, /* t */ T, /* u */ U, /* v */ V, /* w */ W, /* x */ X, TReturn],
    context: TContext,
    a: A,
    b: B,
    c: C
  ): js.ThisFunction5[/* this */ TContext, /* t */ T, /* u */ U, /* v */ V, /* w */ W, /* x */ X, TReturn] = js.native
  /**
    * Takes a function and returns a new one that will always have a particular context.
    *
    * @param fn The function whose context will be changed.
    * @param context The object to which the context (this) of the function should be set.
    * @see \`{@link https://api.jquery.com/jQuery.proxy/ }\`
    * @since 1.4
    * @since 1.6
    *
    * @deprecated Deprecated since 3.3. Use \`{@link Function.bind }\`.
    */
  def proxy[TContext /* <: js.Object */, TReturn, A, B, C, D, T, U, V, W](
    fn: js.Function8[/* a */ A, /* b */ B, /* c */ C, /* d */ D, /* t */ T, /* u */ U, /* v */ V, /* w */ W, TReturn],
    context: TContext,
    a: A,
    b: B,
    c: C,
    d: D
  ): js.ThisFunction4[/* this */ TContext, /* t */ T, /* u */ U, /* v */ V, /* w */ W, TReturn] = js.native
  /**
    * Takes a function and returns a new one that will always have a particular context.
    *
    * @param fn The function whose context will be changed.
    * @param context The object to which the context (this) of the function should be set.
    * @see \`{@link https://api.jquery.com/jQuery.proxy/ }\`
    * @since 1.4
    * @since 1.6
    *
    * @deprecated Deprecated since 3.3. Use \`{@link Function.bind }\`.
    */
  def proxy[TContext /* <: js.Object */, TReturn, A, B, C, D, E, T, U, V](
    fn: js.Function8[/* a */ A, /* b */ B, /* c */ C, /* d */ D, /* e */ E, /* t */ T, /* u */ U, /* v */ V, TReturn],
    context: TContext,
    a: A,
    b: B,
    c: C,
    d: D,
    e: E
  ): js.ThisFunction3[/* this */ TContext, /* t */ T, /* u */ U, /* v */ V, TReturn] = js.native
  /**
    * Takes a function and returns a new one that will always have a particular context.
    *
    * @param fn The function whose context will be changed.
    * @param context The object to which the context (this) of the function should be set.
    * @see \`{@link https://api.jquery.com/jQuery.proxy/ }\`
    * @since 1.4
    * @since 1.6
    *
    * @deprecated Deprecated since 3.3. Use \`{@link Function.bind }\`.
    */
  def proxy[TContext /* <: js.Object */, TReturn, A, B, C, D, E, F, T, U](
    fn: js.Function8[/* a */ A, /* b */ B, /* c */ C, /* d */ D, /* e */ E, /* f */ F, /* t */ T, /* u */ U, TReturn],
    context: TContext,
    a: A,
    b: B,
    c: C,
    d: D,
    e: E,
    f: F
  ): js.ThisFunction2[/* this */ TContext, /* t */ T, /* u */ U, TReturn] = js.native
  // endregion
  // region 1 parameters
  /**
    * Takes a function and returns a new one that will always have a particular context.
    *
    * @param fn The function whose context will be changed.
    * @param context The object to which the context (this) of the function should be set.
    * @see \`{@link https://api.jquery.com/jQuery.proxy/ }\`
    * @since 1.4
    * @since 1.6
    *
    * @deprecated Deprecated since 3.3. Use \`{@link Function.bind }\`.
    */
  def proxy[TContext /* <: js.Object */, TReturn, A, B, C, D, E, F, G, T](
    fn: js.Function8[/* a */ A, /* b */ B, /* c */ C, /* d */ D, /* e */ E, /* f */ F, /* g */ G, /* t */ T, TReturn],
    context: TContext,
    a: A,
    b: B,
    c: C,
    d: D,
    e: E,
    f: F,
    g: G
  ): js.ThisFunction1[/* this */ TContext, /* t */ T, TReturn] = js.native
  /**
    * Takes a function and returns a new one that will always have a particular context.
    *
    * @param fn The function whose context will be changed.
    * @param context The object to which the context (this) of the function should be set.
    * @see \`{@link https://api.jquery.com/jQuery.proxy/ }\`
    * @since 1.4
    * @since 1.6
    *
    * @deprecated Deprecated since 3.3. Use \`{@link Function.bind }\`.
    */
  def proxy[TContext /* <: js.Object */, TReturn, A, T, U, V, W, X, Y, Z](
    fn: js.Function9[
      /* a */ A, 
      /* t */ T, 
      /* u */ U, 
      /* v */ V, 
      /* w */ W, 
      /* x */ X, 
      /* y */ Y, 
      /* z */ Z, 
      /* repeated */ js.Any, 
      TReturn
    ],
    context: TContext,
    a: A
  ): js.ThisFunction8[
    /* this */ TContext, 
    /* t */ T, 
    /* u */ U, 
    /* v */ V, 
    /* w */ W, 
    /* x */ X, 
    /* y */ Y, 
    /* z */ Z, 
    /* repeated */ js.Any, 
    TReturn
  ] = js.native
  def proxy[TReturn, A, B, C, T, U, V, W, X, Y](
    fn: js.Function9[
      /* a */ A, 
      /* b */ B, 
      /* c */ C, 
      /* t */ T, 
      /* u */ U, 
      /* v */ V, 
      /* w */ W, 
      /* x */ X, 
      /* y */ Y, 
      TReturn
    ],
    context: js.UndefOr[scala.Nothing],
    a: A,
    b: B,
    c: C
  ): js.Function6[/* t */ T, /* u */ U, /* v */ V, /* w */ W, /* x */ X, /* y */ Y, TReturn] = js.native
  def proxy[TReturn, A, B, C, D, T, U, V, W, X](
    fn: js.Function9[
      /* a */ A, 
      /* b */ B, 
      /* c */ C, 
      /* d */ D, 
      /* t */ T, 
      /* u */ U, 
      /* v */ V, 
      /* w */ W, 
      /* x */ X, 
      TReturn
    ],
    context: js.UndefOr[scala.Nothing],
    a: A,
    b: B,
    c: C,
    d: D
  ): js.Function5[/* t */ T, /* u */ U, /* v */ V, /* w */ W, /* x */ X, TReturn] = js.native
  def proxy[TReturn, A, B, C, D, E, T, U, V, W](
    fn: js.Function9[
      /* a */ A, 
      /* b */ B, 
      /* c */ C, 
      /* d */ D, 
      /* e */ E, 
      /* t */ T, 
      /* u */ U, 
      /* v */ V, 
      /* w */ W, 
      TReturn
    ],
    context: js.UndefOr[scala.Nothing],
    a: A,
    b: B,
    c: C,
    d: D,
    e: E
  ): js.Function4[/* t */ T, /* u */ U, /* v */ V, /* w */ W, TReturn] = js.native
  def proxy[TReturn, A, B, C, D, E, F, T, U, V](
    fn: js.Function9[
      /* a */ A, 
      /* b */ B, 
      /* c */ C, 
      /* d */ D, 
      /* e */ E, 
      /* f */ F, 
      /* t */ T, 
      /* u */ U, 
      /* v */ V, 
      TReturn
    ],
    context: js.UndefOr[scala.Nothing],
    a: A,
    b: B,
    c: C,
    d: D,
    e: E,
    f: F
  ): js.Function3[/* t */ T, /* u */ U, /* v */ V, TReturn] = js.native
  def proxy[TReturn, A, B, C, D, E, F, G, T, U](
    fn: js.Function9[
      /* a */ A, 
      /* b */ B, 
      /* c */ C, 
      /* d */ D, 
      /* e */ E, 
      /* f */ F, 
      /* g */ G, 
      /* t */ T, 
      /* u */ U, 
      TReturn
    ],
    context: js.UndefOr[scala.Nothing],
    a: A,
    b: B,
    c: C,
    d: D,
    e: E,
    f: F,
    g: G
  ): js.Function2[/* t */ T, /* u */ U, TReturn] = js.native
  /**
    * Takes a function and returns a new one that will always have a particular context.
    *
    * @param fn The function whose context will be changed.
    * @param context The object to which the context (this) of the function should be set.
    * @see \`{@link https://api.jquery.com/jQuery.proxy/ }\`
    * @since 1.9
    *
    * @deprecated Deprecated since 3.3. Use \`{@link Function.bind }\`.
    */
  def proxy[TReturn, A, B, C, T, U, V, W, X, Y](
    fn: js.Function9[
      /* a */ A, 
      /* b */ B, 
      /* c */ C, 
      /* t */ T, 
      /* u */ U, 
      /* v */ V, 
      /* w */ W, 
      /* x */ X, 
      /* y */ Y, 
      TReturn
    ],
    context: Null,
    a: A,
    b: B,
    c: C
  ): js.Function6[/* t */ T, /* u */ U, /* v */ V, /* w */ W, /* x */ X, /* y */ Y, TReturn] = js.native
  /**
    * Takes a function and returns a new one that will always have a particular context.
    *
    * @param fn The function whose context will be changed.
    * @param context The object to which the context (this) of the function should be set.
    * @see \`{@link https://api.jquery.com/jQuery.proxy/ }\`
    * @since 1.9
    *
    * @deprecated Deprecated since 3.3. Use \`{@link Function.bind }\`.
    */
  def proxy[TReturn, A, B, C, D, T, U, V, W, X](
    fn: js.Function9[
      /* a */ A, 
      /* b */ B, 
      /* c */ C, 
      /* d */ D, 
      /* t */ T, 
      /* u */ U, 
      /* v */ V, 
      /* w */ W, 
      /* x */ X, 
      TReturn
    ],
    context: Null,
    a: A,
    b: B,
    c: C,
    d: D
  ): js.Function5[/* t */ T, /* u */ U, /* v */ V, /* w */ W, /* x */ X, TReturn] = js.native
  /**
    * Takes a function and returns a new one that will always have a particular context.
    *
    * @param fn The function whose context will be changed.
    * @param context The object to which the context (this) of the function should be set.
    * @see \`{@link https://api.jquery.com/jQuery.proxy/ }\`
    * @since 1.9
    *
    * @deprecated Deprecated since 3.3. Use \`{@link Function.bind }\`.
    */
  def proxy[TReturn, A, B, C, D, E, T, U, V, W](
    fn: js.Function9[
      /* a */ A, 
      /* b */ B, 
      /* c */ C, 
      /* d */ D, 
      /* e */ E, 
      /* t */ T, 
      /* u */ U, 
      /* v */ V, 
      /* w */ W, 
      TReturn
    ],
    context: Null,
    a: A,
    b: B,
    c: C,
    d: D,
    e: E
  ): js.Function4[/* t */ T, /* u */ U, /* v */ V, /* w */ W, TReturn] = js.native
  /**
    * Takes a function and returns a new one that will always have a particular context.
    *
    * @param fn The function whose context will be changed.
    * @param context The object to which the context (this) of the function should be set.
    * @see \`{@link https://api.jquery.com/jQuery.proxy/ }\`
    * @since 1.9
    *
    * @deprecated Deprecated since 3.3. Use \`{@link Function.bind }\`.
    */
  def proxy[TReturn, A, B, C, D, E, F, T, U, V](
    fn: js.Function9[
      /* a */ A, 
      /* b */ B, 
      /* c */ C, 
      /* d */ D, 
      /* e */ E, 
      /* f */ F, 
      /* t */ T, 
      /* u */ U, 
      /* v */ V, 
      TReturn
    ],
    context: Null,
    a: A,
    b: B,
    c: C,
    d: D,
    e: E,
    f: F
  ): js.Function3[/* t */ T, /* u */ U, /* v */ V, TReturn] = js.native
  // endregion
  // region 2 parameters
  /**
    * Takes a function and returns a new one that will always have a particular context.
    *
    * @param fn The function whose context will be changed.
    * @param context The object to which the context (this) of the function should be set.
    * @see \`{@link https://api.jquery.com/jQuery.proxy/ }\`
    * @since 1.9
    *
    * @deprecated Deprecated since 3.3. Use \`{@link Function.bind }\`.
    */
  def proxy[TReturn, A, B, C, D, E, F, G, T, U](
    fn: js.Function9[
      /* a */ A, 
      /* b */ B, 
      /* c */ C, 
      /* d */ D, 
      /* e */ E, 
      /* f */ F, 
      /* g */ G, 
      /* t */ T, 
      /* u */ U, 
      TReturn
    ],
    context: Null,
    a: A,
    b: B,
    c: C,
    d: D,
    e: E,
    f: F,
    g: G
  ): js.Function2[/* t */ T, /* u */ U, TReturn] = js.native
  /**
    * Takes a function and returns a new one that will always have a particular context.
    *
    * @param fn The function whose context will be changed.
    * @param context The object to which the context (this) of the function should be set.
    * @see \`{@link https://api.jquery.com/jQuery.proxy/ }\`
    * @since 1.4
    * @since 1.6
    *
    * @deprecated Deprecated since 3.3. Use \`{@link Function.bind }\`.
    */
  def proxy[TContext /* <: js.Object */, TReturn, A, B, T, U, V, W, X, Y, Z](
    fn: js.Function10[
      /* a */ A, 
      /* b */ B, 
      /* t */ T, 
      /* u */ U, 
      /* v */ V, 
      /* w */ W, 
      /* x */ X, 
      /* y */ Y, 
      /* z */ Z, 
      /* repeated */ js.Any, 
      TReturn
    ],
    context: TContext,
    a: A,
    b: B
  ): js.ThisFunction8[
    /* this */ TContext, 
    /* t */ T, 
    /* u */ U, 
    /* v */ V, 
    /* w */ W, 
    /* x */ X, 
    /* y */ Y, 
    /* z */ Z, 
    /* repeated */ js.Any, 
    TReturn
  ] = js.native
  def proxy[TReturn, A, B, C, D, T, U, V, W, X, Y](
    fn: js.Function10[
      /* a */ A, 
      /* b */ B, 
      /* c */ C, 
      /* d */ D, 
      /* t */ T, 
      /* u */ U, 
      /* v */ V, 
      /* w */ W, 
      /* x */ X, 
      /* y */ Y, 
      TReturn
    ],
    context: js.UndefOr[scala.Nothing],
    a: A,
    b: B,
    c: C,
    d: D
  ): js.Function6[/* t */ T, /* u */ U, /* v */ V, /* w */ W, /* x */ X, /* y */ Y, TReturn] = js.native
  def proxy[TReturn, A, B, C, D, E, T, U, V, W, X](
    fn: js.Function10[
      /* a */ A, 
      /* b */ B, 
      /* c */ C, 
      /* d */ D, 
      /* e */ E, 
      /* t */ T, 
      /* u */ U, 
      /* v */ V, 
      /* w */ W, 
      /* x */ X, 
      TReturn
    ],
    context: js.UndefOr[scala.Nothing],
    a: A,
    b: B,
    c: C,
    d: D,
    e: E
  ): js.Function5[/* t */ T, /* u */ U, /* v */ V, /* w */ W, /* x */ X, TReturn] = js.native
  def proxy[TReturn, A, B, C, D, E, F, T, U, V, W](
    fn: js.Function10[
      /* a */ A, 
      /* b */ B, 
      /* c */ C, 
      /* d */ D, 
      /* e */ E, 
      /* f */ F, 
      /* t */ T, 
      /* u */ U, 
      /* v */ V, 
      /* w */ W, 
      TReturn
    ],
    context: js.UndefOr[scala.Nothing],
    a: A,
    b: B,
    c: C,
    d: D,
    e: E,
    f: F
  ): js.Function4[/* t */ T, /* u */ U, /* v */ V, /* w */ W, TReturn] = js.native
  def proxy[TReturn, A, B, C, D, E, F, G, T, U, V](
    fn: js.Function10[
      /* a */ A, 
      /* b */ B, 
      /* c */ C, 
      /* d */ D, 
      /* e */ E, 
      /* f */ F, 
      /* g */ G, 
      /* t */ T, 
      /* u */ U, 
      /* v */ V, 
      TReturn
    ],
    context: js.UndefOr[scala.Nothing],
    a: A,
    b: B,
    c: C,
    d: D,
    e: E,
    f: F,
    g: G
  ): js.Function3[/* t */ T, /* u */ U, /* v */ V, TReturn] = js.native
  /**
    * Takes a function and returns a new one that will always have a particular context.
    *
    * @param fn The function whose context will be changed.
    * @param context The object to which the context (this) of the function should be set.
    * @see \`{@link https://api.jquery.com/jQuery.proxy/ }\`
    * @since 1.9
    *
    * @deprecated Deprecated since 3.3. Use \`{@link Function.bind }\`.
    */
  def proxy[TReturn, A, B, C, D, T, U, V, W, X, Y](
    fn: js.Function10[
      /* a */ A, 
      /* b */ B, 
      /* c */ C, 
      /* d */ D, 
      /* t */ T, 
      /* u */ U, 
      /* v */ V, 
      /* w */ W, 
      /* x */ X, 
      /* y */ Y, 
      TReturn
    ],
    context: Null,
    a: A,
    b: B,
    c: C,
    d: D
  ): js.Function6[/* t */ T, /* u */ U, /* v */ V, /* w */ W, /* x */ X, /* y */ Y, TReturn] = js.native
  /**
    * Takes a function and returns a new one that will always have a particular context.
    *
    * @param fn The function whose context will be changed.
    * @param context The object to which the context (this) of the function should be set.
    * @see \`{@link https://api.jquery.com/jQuery.proxy/ }\`
    * @since 1.9
    *
    * @deprecated Deprecated since 3.3. Use \`{@link Function.bind }\`.
    */
  def proxy[TReturn, A, B, C, D, E, T, U, V, W, X](
    fn: js.Function10[
      /* a */ A, 
      /* b */ B, 
      /* c */ C, 
      /* d */ D, 
      /* e */ E, 
      /* t */ T, 
      /* u */ U, 
      /* v */ V, 
      /* w */ W, 
      /* x */ X, 
      TReturn
    ],
    context: Null,
    a: A,
    b: B,
    c: C,
    d: D,
    e: E
  ): js.Function5[/* t */ T, /* u */ U, /* v */ V, /* w */ W, /* x */ X, TReturn] = js.native
  /**
    * Takes a function and returns a new one that will always have a particular context.
    *
    * @param fn The function whose context will be changed.
    * @param context The object to which the context (this) of the function should be set.
    * @see \`{@link https://api.jquery.com/jQuery.proxy/ }\`
    * @since 1.9
    *
    * @deprecated Deprecated since 3.3. Use \`{@link Function.bind }\`.
    */
  def proxy[TReturn, A, B, C, D, E, F, T, U, V, W](
    fn: js.Function10[
      /* a */ A, 
      /* b */ B, 
      /* c */ C, 
      /* d */ D, 
      /* e */ E, 
      /* f */ F, 
      /* t */ T, 
      /* u */ U, 
      /* v */ V, 
      /* w */ W, 
      TReturn
    ],
    context: Null,
    a: A,
    b: B,
    c: C,
    d: D,
    e: E,
    f: F
  ): js.Function4[/* t */ T, /* u */ U, /* v */ V, /* w */ W, TReturn] = js.native
  // endregion
  // region 3 parameters
  /**
    * Takes a function and returns a new one that will always have a particular context.
    *
    * @param fn The function whose context will be changed.
    * @param context The object to which the context (this) of the function should be set.
    * @see \`{@link https://api.jquery.com/jQuery.proxy/ }\`
    * @since 1.9
    *
    * @deprecated Deprecated since 3.3. Use \`{@link Function.bind }\`.
    */
  def proxy[TReturn, A, B, C, D, E, F, G, T, U, V](
    fn: js.Function10[
      /* a */ A, 
      /* b */ B, 
      /* c */ C, 
      /* d */ D, 
      /* e */ E, 
      /* f */ F, 
      /* g */ G, 
      /* t */ T, 
      /* u */ U, 
      /* v */ V, 
      TReturn
    ],
    context: Null,
    a: A,
    b: B,
    c: C,
    d: D,
    e: E,
    f: F,
    g: G
  ): js.Function3[/* t */ T, /* u */ U, /* v */ V, TReturn] = js.native
  def proxy[TReturn, A, B, C, T, U, V, W, X, Y, Z](
    fn: js.Function11[
      /* a */ A, 
      /* b */ B, 
      /* c */ C, 
      /* t */ T, 
      /* u */ U, 
      /* v */ V, 
      /* w */ W, 
      /* x */ X, 
      /* y */ Y, 
      /* z */ Z, 
      /* repeated */ js.Any, 
      TReturn
    ],
    context: js.UndefOr[scala.Nothing],
    a: A,
    b: B,
    c: C
  ): js.Function8[
    /* t */ T, 
    /* u */ U, 
    /* v */ V, 
    /* w */ W, 
    /* x */ X, 
    /* y */ Y, 
    /* z */ Z, 
    /* repeated */ js.Any, 
    TReturn
  ] = js.native
  /**
    * Takes a function and returns a new one that will always have a particular context.
    *
    * @param fn The function whose context will be changed.
    * @param context The object to which the context (this) of the function should be set.
    * @see \`{@link https://api.jquery.com/jQuery.proxy/ }\`
    * @since 1.9
    *
    * @deprecated Deprecated since 3.3. Use \`{@link Function.bind }\`.
    */
  def proxy[TReturn, A, B, C, T, U, V, W, X, Y, Z](
    fn: js.Function11[
      /* a */ A, 
      /* b */ B, 
      /* c */ C, 
      /* t */ T, 
      /* u */ U, 
      /* v */ V, 
      /* w */ W, 
      /* x */ X, 
      /* y */ Y, 
      /* z */ Z, 
      /* repeated */ js.Any, 
      TReturn
    ],
    context: Null,
    a: A,
    b: B,
    c: C
  ): js.Function8[
    /* t */ T, 
    /* u */ U, 
    /* v */ V, 
    /* w */ W, 
    /* x */ X, 
    /* y */ Y, 
    /* z */ Z, 
    /* repeated */ js.Any, 
    TReturn
  ] = js.native
  /**
    * Takes a function and returns a new one that will always have a particular context.
    *
    * @param fn The function whose context will be changed.
    * @param context The object to which the context (this) of the function should be set.
    * @see \`{@link https://api.jquery.com/jQuery.proxy/ }\`
    * @since 1.4
    * @since 1.6
    *
    * @deprecated Deprecated since 3.3. Use \`{@link Function.bind }\`.
    */
  def proxy[TContext /* <: js.Object */, TReturn, A, B, C, T, U, V, W, X, Y](
    fn: js.Function9[
      /* a */ A, 
      /* b */ B, 
      /* c */ C, 
      /* t */ T, 
      /* u */ U, 
      /* v */ V, 
      /* w */ W, 
      /* x */ X, 
      /* y */ Y, 
      TReturn
    ],
    context: TContext,
    a: A,
    b: B,
    c: C
  ): js.ThisFunction6[/* this */ TContext, /* t */ T, /* u */ U, /* v */ V, /* w */ W, /* x */ X, /* y */ Y, TReturn] = js.native
  /**
    * Takes a function and returns a new one that will always have a particular context.
    *
    * @param fn The function whose context will be changed.
    * @param context The object to which the context (this) of the function should be set.
    * @see \`{@link https://api.jquery.com/jQuery.proxy/ }\`
    * @since 1.4
    * @since 1.6
    *
    * @deprecated Deprecated since 3.3. Use \`{@link Function.bind }\`.
    */
  def proxy[TContext /* <: js.Object */, TReturn, A, B, C, D, T, U, V, W, X](
    fn: js.Function9[
      /* a */ A, 
      /* b */ B, 
      /* c */ C, 
      /* d */ D, 
      /* t */ T, 
      /* u */ U, 
      /* v */ V, 
      /* w */ W, 
      /* x */ X, 
      TReturn
    ],
    context: TContext,
    a: A,
    b: B,
    c: C,
    d: D
  ): js.ThisFunction5[/* this */ TContext, /* t */ T, /* u */ U, /* v */ V, /* w */ W, /* x */ X, TReturn] = js.native
  /**
    * Takes a function and returns a new one that will always have a particular context.
    *
    * @param fn The function whose context will be changed.
    * @param context The object to which the context (this) of the function should be set.
    * @see \`{@link https://api.jquery.com/jQuery.proxy/ }\`
    * @since 1.4
    * @since 1.6
    *
    * @deprecated Deprecated since 3.3. Use \`{@link Function.bind }\`.
    */
  def proxy[TContext /* <: js.Object */, TReturn, A, B, C, D, E, T, U, V, W](
    fn: js.Function9[
      /* a */ A, 
      /* b */ B, 
      /* c */ C, 
      /* d */ D, 
      /* e */ E, 
      /* t */ T, 
      /* u */ U, 
      /* v */ V, 
      /* w */ W, 
      TReturn
    ],
    context: TContext,
    a: A,
    b: B,
    c: C,
    d: D,
    e: E
  ): js.ThisFunction4[/* this */ TContext, /* t */ T, /* u */ U, /* v */ V, /* w */ W, TReturn] = js.native
  /**
    * Takes a function and returns a new one that will always have a particular context.
    *
    * @param fn The function whose context will be changed.
    * @param context The object to which the context (this) of the function should be set.
    * @see \`{@link https://api.jquery.com/jQuery.proxy/ }\`
    * @since 1.4
    * @since 1.6
    *
    * @deprecated Deprecated since 3.3. Use \`{@link Function.bind }\`.
    */
  def proxy[TContext /* <: js.Object */, TReturn, A, B, C, D, E, F, T, U, V](
    fn: js.Function9[
      /* a */ A, 
      /* b */ B, 
      /* c */ C, 
      /* d */ D, 
      /* e */ E, 
      /* f */ F, 
      /* t */ T, 
      /* u */ U, 
      /* v */ V, 
      TReturn
    ],
    context: TContext,
    a: A,
    b: B,
    c: C,
    d: D,
    e: E,
    f: F
  ): js.ThisFunction3[/* this */ TContext, /* t */ T, /* u */ U, /* v */ V, TReturn] = js.native
  // endregion
  // region 2 parameters
  /**
    * Takes a function and returns a new one that will always have a particular context.
    *
    * @param fn The function whose context will be changed.
    * @param context The object to which the context (this) of the function should be set.
    * @see \`{@link https://api.jquery.com/jQuery.proxy/ }\`
    * @since 1.4
    * @since 1.6
    *
    * @deprecated Deprecated since 3.3. Use \`{@link Function.bind }\`.
    */
  def proxy[TContext /* <: js.Object */, TReturn, A, B, C, D, E, F, G, T, U](
    fn: js.Function9[
      /* a */ A, 
      /* b */ B, 
      /* c */ C, 
      /* d */ D, 
      /* e */ E, 
      /* f */ F, 
      /* g */ G, 
      /* t */ T, 
      /* u */ U, 
      TReturn
    ],
    context: TContext,
    a: A,
    b: B,
    c: C,
    d: D,
    e: E,
    f: F,
    g: G
  ): js.ThisFunction2[/* this */ TContext, /* t */ T, /* u */ U, TReturn] = js.native
  /**
    * Takes a function and returns a new one that will always have a particular context.
    *
    * @param fn The function whose context will be changed.
    * @param context The object to which the context (this) of the function should be set.
    * @see \`{@link https://api.jquery.com/jQuery.proxy/ }\`
    * @since 1.4
    * @since 1.6
    *
    * @deprecated Deprecated since 3.3. Use \`{@link Function.bind }\`.
    */
  def proxy[TContext /* <: js.Object */, TReturn, A, B, C, D, T, U, V, W, X, Y](
    fn: js.Function10[
      /* a */ A, 
      /* b */ B, 
      /* c */ C, 
      /* d */ D, 
      /* t */ T, 
      /* u */ U, 
      /* v */ V, 
      /* w */ W, 
      /* x */ X, 
      /* y */ Y, 
      TReturn
    ],
    context: TContext,
    a: A,
    b: B,
    c: C,
    d: D
  ): js.ThisFunction6[/* this */ TContext, /* t */ T, /* u */ U, /* v */ V, /* w */ W, /* x */ X, /* y */ Y, TReturn] = js.native
  /**
    * Takes a function and returns a new one that will always have a particular context.
    *
    * @param fn The function whose context will be changed.
    * @param context The object to which the context (this) of the function should be set.
    * @see \`{@link https://api.jquery.com/jQuery.proxy/ }\`
    * @since 1.4
    * @since 1.6
    *
    * @deprecated Deprecated since 3.3. Use \`{@link Function.bind }\`.
    */
  def proxy[TContext /* <: js.Object */, TReturn, A, B, C, D, E, T, U, V, W, X](
    fn: js.Function10[
      /* a */ A, 
      /* b */ B, 
      /* c */ C, 
      /* d */ D, 
      /* e */ E, 
      /* t */ T, 
      /* u */ U, 
      /* v */ V, 
      /* w */ W, 
      /* x */ X, 
      TReturn
    ],
    context: TContext,
    a: A,
    b: B,
    c: C,
    d: D,
    e: E
  ): js.ThisFunction5[/* this */ TContext, /* t */ T, /* u */ U, /* v */ V, /* w */ W, /* x */ X, TReturn] = js.native
  /**
    * Takes a function and returns a new one that will always have a particular context.
    *
    * @param fn The function whose context will be changed.
    * @param context The object to which the context (this) of the function should be set.
    * @see \`{@link https://api.jquery.com/jQuery.proxy/ }\`
    * @since 1.4
    * @since 1.6
    *
    * @deprecated Deprecated since 3.3. Use \`{@link Function.bind }\`.
    */
  def proxy[TContext /* <: js.Object */, TReturn, A, B, C, D, E, F, T, U, V, W](
    fn: js.Function10[
      /* a */ A, 
      /* b */ B, 
      /* c */ C, 
      /* d */ D, 
      /* e */ E, 
      /* f */ F, 
      /* t */ T, 
      /* u */ U, 
      /* v */ V, 
      /* w */ W, 
      TReturn
    ],
    context: TContext,
    a: A,
    b: B,
    c: C,
    d: D,
    e: E,
    f: F
  ): js.ThisFunction4[/* this */ TContext, /* t */ T, /* u */ U, /* v */ V, /* w */ W, TReturn] = js.native
  // endregion
  // region 3 parameters
  /**
    * Takes a function and returns a new one that will always have a particular context.
    *
    * @param fn The function whose context will be changed.
    * @param context The object to which the context (this) of the function should be set.
    * @see \`{@link https://api.jquery.com/jQuery.proxy/ }\`
    * @since 1.4
    * @since 1.6
    *
    * @deprecated Deprecated since 3.3. Use \`{@link Function.bind }\`.
    */
  def proxy[TContext /* <: js.Object */, TReturn, A, B, C, D, E, F, G, T, U, V](
    fn: js.Function10[
      /* a */ A, 
      /* b */ B, 
      /* c */ C, 
      /* d */ D, 
      /* e */ E, 
      /* f */ F, 
      /* g */ G, 
      /* t */ T, 
      /* u */ U, 
      /* v */ V, 
      TReturn
    ],
    context: TContext,
    a: A,
    b: B,
    c: C,
    d: D,
    e: E,
    f: F,
    g: G
  ): js.ThisFunction3[/* this */ TContext, /* t */ T, /* u */ U, /* v */ V, TReturn] = js.native
  /**
    * Takes a function and returns a new one that will always have a particular context.
    *
    * @param fn The function whose context will be changed.
    * @param context The object to which the context (this) of the function should be set.
    * @see \`{@link https://api.jquery.com/jQuery.proxy/ }\`
    * @since 1.4
    * @since 1.6
    *
    * @deprecated Deprecated since 3.3. Use \`{@link Function.bind }\`.
    */
  def proxy[TContext /* <: js.Object */, TReturn, A, B, C, T, U, V, W, X, Y, Z](
    fn: js.Function11[
      /* a */ A, 
      /* b */ B, 
      /* c */ C, 
      /* t */ T, 
      /* u */ U, 
      /* v */ V, 
      /* w */ W, 
      /* x */ X, 
      /* y */ Y, 
      /* z */ Z, 
      /* repeated */ js.Any, 
      TReturn
    ],
    context: TContext,
    a: A,
    b: B,
    c: C
  ): js.ThisFunction8[
    /* this */ TContext, 
    /* t */ T, 
    /* u */ U, 
    /* v */ V, 
    /* w */ W, 
    /* x */ X, 
    /* y */ Y, 
    /* z */ Z, 
    /* repeated */ js.Any, 
    TReturn
  ] = js.native
  def proxy[TReturn, A, B, C, D, E, T, U, V, W, X, Y](
    fn: js.Function11[
      /* a */ A, 
      /* b */ B, 
      /* c */ C, 
      /* d */ D, 
      /* e */ E, 
      /* t */ T, 
      /* u */ U, 
      /* v */ V, 
      /* w */ W, 
      /* x */ X, 
      /* y */ Y, 
      TReturn
    ],
    context: js.UndefOr[scala.Nothing],
    a: A,
    b: B,
    c: C,
    d: D,
    e: E
  ): js.Function6[/* t */ T, /* u */ U, /* v */ V, /* w */ W, /* x */ X, /* y */ Y, TReturn] = js.native
  def proxy[TReturn, A, B, C, D, E, F, T, U, V, W, X](
    fn: js.Function11[
      /* a */ A, 
      /* b */ B, 
      /* c */ C, 
      /* d */ D, 
      /* e */ E, 
      /* f */ F, 
      /* t */ T, 
      /* u */ U, 
      /* v */ V, 
      /* w */ W, 
      /* x */ X, 
      TReturn
    ],
    context: js.UndefOr[scala.Nothing],
    a: A,
    b: B,
    c: C,
    d: D,
    e: E,
    f: F
  ): js.Function5[/* t */ T, /* u */ U, /* v */ V, /* w */ W, /* x */ X, TReturn] = js.native
  def proxy[TReturn, A, B, C, D, E, F, G, T, U, V, W](
    fn: js.Function11[
      /* a */ A, 
      /* b */ B, 
      /* c */ C, 
      /* d */ D, 
      /* e */ E, 
      /* f */ F, 
      /* g */ G, 
      /* t */ T, 
      /* u */ U, 
      /* v */ V, 
      /* w */ W, 
      TReturn
    ],
    context: js.UndefOr[scala.Nothing],
    a: A,
    b: B,
    c: C,
    d: D,
    e: E,
    f: F,
    g: G
  ): js.Function4[/* t */ T, /* u */ U, /* v */ V, /* w */ W, TReturn] = js.native
  /**
    * Takes a function and returns a new one that will always have a particular context.
    *
    * @param fn The function whose context will be changed.
    * @param context The object to which the context (this) of the function should be set.
    * @see \`{@link https://api.jquery.com/jQuery.proxy/ }\`
    * @since 1.9
    *
    * @deprecated Deprecated since 3.3. Use \`{@link Function.bind }\`.
    */
  def proxy[TReturn, A, B, C, D, E, T, U, V, W, X, Y](
    fn: js.Function11[
      /* a */ A, 
      /* b */ B, 
      /* c */ C, 
      /* d */ D, 
      /* e */ E, 
      /* t */ T, 
      /* u */ U, 
      /* v */ V, 
      /* w */ W, 
      /* x */ X, 
      /* y */ Y, 
      TReturn
    ],
    context: Null,
    a: A,
    b: B,
    c: C,
    d: D,
    e: E
  ): js.Function6[/* t */ T, /* u */ U, /* v */ V, /* w */ W, /* x */ X, /* y */ Y, TReturn] = js.native
  /**
    * Takes a function and returns a new one that will always have a particular context.
    *
    * @param fn The function whose context will be changed.
    * @param context The object to which the context (this) of the function should be set.
    * @see \`{@link https://api.jquery.com/jQuery.proxy/ }\`
    * @since 1.9
    *
    * @deprecated Deprecated since 3.3. Use \`{@link Function.bind }\`.
    */
  def proxy[TReturn, A, B, C, D, E, F, T, U, V, W, X](
    fn: js.Function11[
      /* a */ A, 
      /* b */ B, 
      /* c */ C, 
      /* d */ D, 
      /* e */ E, 
      /* f */ F, 
      /* t */ T, 
      /* u */ U, 
      /* v */ V, 
      /* w */ W, 
      /* x */ X, 
      TReturn
    ],
    context: Null,
    a: A,
    b: B,
    c: C,
    d: D,
    e: E,
    f: F
  ): js.Function5[/* t */ T, /* u */ U, /* v */ V, /* w */ W, /* x */ X, TReturn] = js.native
  // endregion
  // region 4 parameters
  /**
    * Takes a function and returns a new one that will always have a particular context.
    *
    * @param fn The function whose context will be changed.
    * @param context The object to which the context (this) of the function should be set.
    * @see \`{@link https://api.jquery.com/jQuery.proxy/ }\`
    * @since 1.9
    *
    * @deprecated Deprecated since 3.3. Use \`{@link Function.bind }\`.
    */
  def proxy[TReturn, A, B, C, D, E, F, G, T, U, V, W](
    fn: js.Function11[
      /* a */ A, 
      /* b */ B, 
      /* c */ C, 
      /* d */ D, 
      /* e */ E, 
      /* f */ F, 
      /* g */ G, 
      /* t */ T, 
      /* u */ U, 
      /* v */ V, 
      /* w */ W, 
      TReturn
    ],
    context: Null,
    a: A,
    b: B,
    c: C,
    d: D,
    e: E,
    f: F,
    g: G
  ): js.Function4[/* t */ T, /* u */ U, /* v */ V, /* w */ W, TReturn] = js.native
  def proxy[TReturn, A, B, C, D, T, U, V, W, X, Y, Z](
    fn: js.Function12[
      /* a */ A, 
      /* b */ B, 
      /* c */ C, 
      /* d */ D, 
      /* t */ T, 
      /* u */ U, 
      /* v */ V, 
      /* w */ W, 
      /* x */ X, 
      /* y */ Y, 
      /* z */ Z, 
      /* repeated */ js.Any, 
      TReturn
    ],
    context: js.UndefOr[scala.Nothing],
    a: A,
    b: B,
    c: C,
    d: D
  ): js.Function8[
    /* t */ T, 
    /* u */ U, 
    /* v */ V, 
    /* w */ W, 
    /* x */ X, 
    /* y */ Y, 
    /* z */ Z, 
    /* repeated */ js.Any, 
    TReturn
  ] = js.native
  /**
    * Takes a function and returns a new one that will always have a particular context.
    *
    * @param fn The function whose context will be changed.
    * @param context The object to which the context (this) of the function should be set.
    * @see \`{@link https://api.jquery.com/jQuery.proxy/ }\`
    * @since 1.9
    *
    * @deprecated Deprecated since 3.3. Use \`{@link Function.bind }\`.
    */
  def proxy[TReturn, A, B, C, D, T, U, V, W, X, Y, Z](
    fn: js.Function12[
      /* a */ A, 
      /* b */ B, 
      /* c */ C, 
      /* d */ D, 
      /* t */ T, 
      /* u */ U, 
      /* v */ V, 
      /* w */ W, 
      /* x */ X, 
      /* y */ Y, 
      /* z */ Z, 
      /* repeated */ js.Any, 
      TReturn
    ],
    context: Null,
    a: A,
    b: B,
    c: C,
    d: D
  ): js.Function8[
    /* t */ T, 
    /* u */ U, 
    /* v */ V, 
    /* w */ W, 
    /* x */ X, 
    /* y */ Y, 
    /* z */ Z, 
    /* repeated */ js.Any, 
    TReturn
  ] = js.native
  /**
    * Takes a function and returns a new one that will always have a particular context.
    *
    * @param fn The function whose context will be changed.
    * @param context The object to which the context (this) of the function should be set.
    * @see \`{@link https://api.jquery.com/jQuery.proxy/ }\`
    * @since 1.4
    * @since 1.6
    *
    * @deprecated Deprecated since 3.3. Use \`{@link Function.bind }\`.
    */
  def proxy[TContext /* <: js.Object */, TReturn, A, B, C, D, E, T, U, V, W, X, Y](
    fn: js.Function11[
      /* a */ A, 
      /* b */ B, 
      /* c */ C, 
      /* d */ D, 
      /* e */ E, 
      /* t */ T, 
      /* u */ U, 
      /* v */ V, 
      /* w */ W, 
      /* x */ X, 
      /* y */ Y, 
      TReturn
    ],
    context: TContext,
    a: A,
    b: B,
    c: C,
    d: D,
    e: E
  ): js.ThisFunction6[/* this */ TContext, /* t */ T, /* u */ U, /* v */ V, /* w */ W, /* x */ X, /* y */ Y, TReturn] = js.native
  /**
    * Takes a function and returns a new one that will always have a particular context.
    *
    * @param fn The function whose context will be changed.
    * @param context The object to which the context (this) of the function should be set.
    * @see \`{@link https://api.jquery.com/jQuery.proxy/ }\`
    * @since 1.4
    * @since 1.6
    *
    * @deprecated Deprecated since 3.3. Use \`{@link Function.bind }\`.
    */
  def proxy[TContext /* <: js.Object */, TReturn, A, B, C, D, E, F, T, U, V, W, X](
    fn: js.Function11[
      /* a */ A, 
      /* b */ B, 
      /* c */ C, 
      /* d */ D, 
      /* e */ E, 
      /* f */ F, 
      /* t */ T, 
      /* u */ U, 
      /* v */ V, 
      /* w */ W, 
      /* x */ X, 
      TReturn
    ],
    context: TContext,
    a: A,
    b: B,
    c: C,
    d: D,
    e: E,
    f: F
  ): js.ThisFunction5[/* this */ TContext, /* t */ T, /* u */ U, /* v */ V, /* w */ W, /* x */ X, TReturn] = js.native
  // endregion
  // region 4 parameters
  /**
    * Takes a function and returns a new one that will always have a particular context.
    *
    * @param fn The function whose context will be changed.
    * @param context The object to which the context (this) of the function should be set.
    * @see \`{@link https://api.jquery.com/jQuery.proxy/ }\`
    * @since 1.4
    * @since 1.6
    *
    * @deprecated Deprecated since 3.3. Use \`{@link Function.bind }\`.
    */
  def proxy[TContext /* <: js.Object */, TReturn, A, B, C, D, E, F, G, T, U, V, W](
    fn: js.Function11[
      /* a */ A, 
      /* b */ B, 
      /* c */ C, 
      /* d */ D, 
      /* e */ E, 
      /* f */ F, 
      /* g */ G, 
      /* t */ T, 
      /* u */ U, 
      /* v */ V, 
      /* w */ W, 
      TReturn
    ],
    context: TContext,
    a: A,
    b: B,
    c: C,
    d: D,
    e: E,
    f: F,
    g: G
  ): js.ThisFunction4[/* this */ TContext, /* t */ T, /* u */ U, /* v */ V, /* w */ W, TReturn] = js.native
  /**
    * Takes a function and returns a new one that will always have a particular context.
    *
    * @param fn The function whose context will be changed.
    * @param context The object to which the context (this) of the function should be set.
    * @see \`{@link https://api.jquery.com/jQuery.proxy/ }\`
    * @since 1.4
    * @since 1.6
    *
    * @deprecated Deprecated since 3.3. Use \`{@link Function.bind }\`.
    */
  def proxy[TContext /* <: js.Object */, TReturn, A, B, C, D, T, U, V, W, X, Y, Z](
    fn: js.Function12[
      /* a */ A, 
      /* b */ B, 
      /* c */ C, 
      /* d */ D, 
      /* t */ T, 
      /* u */ U, 
      /* v */ V, 
      /* w */ W, 
      /* x */ X, 
      /* y */ Y, 
      /* z */ Z, 
      /* repeated */ js.Any, 
      TReturn
    ],
    context: TContext,
    a: A,
    b: B,
    c: C,
    d: D
  ): js.ThisFunction8[
    /* this */ TContext, 
    /* t */ T, 
    /* u */ U, 
    /* v */ V, 
    /* w */ W, 
    /* x */ X, 
    /* y */ Y, 
    /* z */ Z, 
    /* repeated */ js.Any, 
    TReturn
  ] = js.native
  def proxy[TReturn, A, B, C, D, E, F, T, U, V, W, X, Y](
    fn: js.Function12[
      /* a */ A, 
      /* b */ B, 
      /* c */ C, 
      /* d */ D, 
      /* e */ E, 
      /* f */ F, 
      /* t */ T, 
      /* u */ U, 
      /* v */ V, 
      /* w */ W, 
      /* x */ X, 
      /* y */ Y, 
      TReturn
    ],
    context: js.UndefOr[scala.Nothing],
    a: A,
    b: B,
    c: C,
    d: D,
    e: E,
    f: F
  ): js.Function6[/* t */ T, /* u */ U, /* v */ V, /* w */ W, /* x */ X, /* y */ Y, TReturn] = js.native
  def proxy[TReturn, A, B, C, D, E, F, G, T, U, V, W, X](
    fn: js.Function12[
      /* a */ A, 
      /* b */ B, 
      /* c */ C, 
      /* d */ D, 
      /* e */ E, 
      /* f */ F, 
      /* g */ G, 
      /* t */ T, 
      /* u */ U, 
      /* v */ V, 
      /* w */ W, 
      /* x */ X, 
      TReturn
    ],
    context: js.UndefOr[scala.Nothing],
    a: A,
    b: B,
    c: C,
    d: D,
    e: E,
    f: F,
    g: G
  ): js.Function5[/* t */ T, /* u */ U, /* v */ V, /* w */ W, /* x */ X, TReturn] = js.native
  /**
    * Takes a function and returns a new one that will always have a particular context.
    *
    * @param fn The function whose context will be changed.
    * @param context The object to which the context (this) of the function should be set.
    * @see \`{@link https://api.jquery.com/jQuery.proxy/ }\`
    * @since 1.9
    *
    * @deprecated Deprecated since 3.3. Use \`{@link Function.bind }\`.
    */
  def proxy[TReturn, A, B, C, D, E, F, T, U, V, W, X, Y](
    fn: js.Function12[
      /* a */ A, 
      /* b */ B, 
      /* c */ C, 
      /* d */ D, 
      /* e */ E, 
      /* f */ F, 
      /* t */ T, 
      /* u */ U, 
      /* v */ V, 
      /* w */ W, 
      /* x */ X, 
      /* y */ Y, 
      TReturn
    ],
    context: Null,
    a: A,
    b: B,
    c: C,
    d: D,
    e: E,
    f: F
  ): js.Function6[/* t */ T, /* u */ U, /* v */ V, /* w */ W, /* x */ X, /* y */ Y, TReturn] = js.native
  // endregion
  // region 5 parameters
  /**
    * Takes a function and returns a new one that will always have a particular context.
    *
    * @param fn The function whose context will be changed.
    * @param context The object to which the context (this) of the function should be set.
    * @see \`{@link https://api.jquery.com/jQuery.proxy/ }\`
    * @since 1.9
    *
    * @deprecated Deprecated since 3.3. Use \`{@link Function.bind }\`.
    */
  def proxy[TReturn, A, B, C, D, E, F, G, T, U, V, W, X](
    fn: js.Function12[
      /* a */ A, 
      /* b */ B, 
      /* c */ C, 
      /* d */ D, 
      /* e */ E, 
      /* f */ F, 
      /* g */ G, 
      /* t */ T, 
      /* u */ U, 
      /* v */ V, 
      /* w */ W, 
      /* x */ X, 
      TReturn
    ],
    context: Null,
    a: A,
    b: B,
    c: C,
    d: D,
    e: E,
    f: F,
    g: G
  ): js.Function5[/* t */ T, /* u */ U, /* v */ V, /* w */ W, /* x */ X, TReturn] = js.native
  def proxy[TReturn, A, B, C, D, E, T, U, V, W, X, Y, Z](
    fn: js.Function13[
      /* a */ A, 
      /* b */ B, 
      /* c */ C, 
      /* d */ D, 
      /* e */ E, 
      /* t */ T, 
      /* u */ U, 
      /* v */ V, 
      /* w */ W, 
      /* x */ X, 
      /* y */ Y, 
      /* z */ Z, 
      /* repeated */ js.Any, 
      TReturn
    ],
    context: js.UndefOr[scala.Nothing],
    a: A,
    b: B,
    c: C,
    d: D,
    e: E
  ): js.Function8[
    /* t */ T, 
    /* u */ U, 
    /* v */ V, 
    /* w */ W, 
    /* x */ X, 
    /* y */ Y, 
    /* z */ Z, 
    /* repeated */ js.Any, 
    TReturn
  ] = js.native
  /**
    * Takes a function and returns a new one that will always have a particular context.
    *
    * @param fn The function whose context will be changed.
    * @param context The object to which the context (this) of the function should be set.
    * @see \`{@link https://api.jquery.com/jQuery.proxy/ }\`
    * @since 1.9
    *
    * @deprecated Deprecated since 3.3. Use \`{@link Function.bind }\`.
    */
  def proxy[TReturn, A, B, C, D, E, T, U, V, W, X, Y, Z](
    fn: js.Function13[
      /* a */ A, 
      /* b */ B, 
      /* c */ C, 
      /* d */ D, 
      /* e */ E, 
      /* t */ T, 
      /* u */ U, 
      /* v */ V, 
      /* w */ W, 
      /* x */ X, 
      /* y */ Y, 
      /* z */ Z, 
      /* repeated */ js.Any, 
      TReturn
    ],
    context: Null,
    a: A,
    b: B,
    c: C,
    d: D,
    e: E
  ): js.Function8[
    /* t */ T, 
    /* u */ U, 
    /* v */ V, 
    /* w */ W, 
    /* x */ X, 
    /* y */ Y, 
    /* z */ Z, 
    /* repeated */ js.Any, 
    TReturn
  ] = js.native
  /**
    * Takes a function and returns a new one that will always have a particular context.
    *
    * @param fn The function whose context will be changed.
    * @param context The object to which the context (this) of the function should be set.
    * @see \`{@link https://api.jquery.com/jQuery.proxy/ }\`
    * @since 1.4
    * @since 1.6
    *
    * @deprecated Deprecated since 3.3. Use \`{@link Function.bind }\`.
    */
  def proxy[TContext /* <: js.Object */, TReturn, A, B, C, D, E, F, T, U, V, W, X, Y](
    fn: js.Function12[
      /* a */ A, 
      /* b */ B, 
      /* c */ C, 
      /* d */ D, 
      /* e */ E, 
      /* f */ F, 
      /* t */ T, 
      /* u */ U, 
      /* v */ V, 
      /* w */ W, 
      /* x */ X, 
      /* y */ Y, 
      TReturn
    ],
    context: TContext,
    a: A,
    b: B,
    c: C,
    d: D,
    e: E,
    f: F
  ): js.ThisFunction6[/* this */ TContext, /* t */ T, /* u */ U, /* v */ V, /* w */ W, /* x */ X, /* y */ Y, TReturn] = js.native
  // endregion
  // region 5 parameters
  /**
    * Takes a function and returns a new one that will always have a particular context.
    *
    * @param fn The function whose context will be changed.
    * @param context The object to which the context (this) of the function should be set.
    * @see \`{@link https://api.jquery.com/jQuery.proxy/ }\`
    * @since 1.4
    * @since 1.6
    *
    * @deprecated Deprecated since 3.3. Use \`{@link Function.bind }\`.
    */
  def proxy[TContext /* <: js.Object */, TReturn, A, B, C, D, E, F, G, T, U, V, W, X](
    fn: js.Function12[
      /* a */ A, 
      /* b */ B, 
      /* c */ C, 
      /* d */ D, 
      /* e */ E, 
      /* f */ F, 
      /* g */ G, 
      /* t */ T, 
      /* u */ U, 
      /* v */ V, 
      /* w */ W, 
      /* x */ X, 
      TReturn
    ],
    context: TContext,
    a: A,
    b: B,
    c: C,
    d: D,
    e: E,
    f: F,
    g: G
  ): js.ThisFunction5[/* this */ TContext, /* t */ T, /* u */ U, /* v */ V, /* w */ W, /* x */ X, TReturn] = js.native
  /**
    * Takes a function and returns a new one that will always have a particular context.
    *
    * @param fn The function whose context will be changed.
    * @param context The object to which the context (this) of the function should be set.
    * @see \`{@link https://api.jquery.com/jQuery.proxy/ }\`
    * @since 1.4
    * @since 1.6
    *
    * @deprecated Deprecated since 3.3. Use \`{@link Function.bind }\`.
    */
  def proxy[TContext /* <: js.Object */, TReturn, A, B, C, D, E, T, U, V, W, X, Y, Z](
    fn: js.Function13[
      /* a */ A, 
      /* b */ B, 
      /* c */ C, 
      /* d */ D, 
      /* e */ E, 
      /* t */ T, 
      /* u */ U, 
      /* v */ V, 
      /* w */ W, 
      /* x */ X, 
      /* y */ Y, 
      /* z */ Z, 
      /* repeated */ js.Any, 
      TReturn
    ],
    context: TContext,
    a: A,
    b: B,
    c: C,
    d: D,
    e: E
  ): js.ThisFunction8[
    /* this */ TContext, 
    /* t */ T, 
    /* u */ U, 
    /* v */ V, 
    /* w */ W, 
    /* x */ X, 
    /* y */ Y, 
    /* z */ Z, 
    /* repeated */ js.Any, 
    TReturn
  ] = js.native
  def proxy[TReturn, A, B, C, D, E, F, G, T, U, V, W, X, Y](
    fn: js.Function13[
      /* a */ A, 
      /* b */ B, 
      /* c */ C, 
      /* d */ D, 
      /* e */ E, 
      /* f */ F, 
      /* g */ G, 
      /* t */ T, 
      /* u */ U, 
      /* v */ V, 
      /* w */ W, 
      /* x */ X, 
      /* y */ Y, 
      TReturn
    ],
    context: js.UndefOr[scala.Nothing],
    a: A,
    b: B,
    c: C,
    d: D,
    e: E,
    f: F,
    g: G
  ): js.Function6[/* t */ T, /* u */ U, /* v */ V, /* w */ W, /* x */ X, /* y */ Y, TReturn] = js.native
  // endregion
  // region 6 parameters
  /**
    * Takes a function and returns a new one that will always have a particular context.
    *
    * @param fn The function whose context will be changed.
    * @param context The object to which the context (this) of the function should be set.
    * @see \`{@link https://api.jquery.com/jQuery.proxy/ }\`
    * @since 1.9
    *
    * @deprecated Deprecated since 3.3. Use \`{@link Function.bind }\`.
    */
  def proxy[TReturn, A, B, C, D, E, F, G, T, U, V, W, X, Y](
    fn: js.Function13[
      /* a */ A, 
      /* b */ B, 
      /* c */ C, 
      /* d */ D, 
      /* e */ E, 
      /* f */ F, 
      /* g */ G, 
      /* t */ T, 
      /* u */ U, 
      /* v */ V, 
      /* w */ W, 
      /* x */ X, 
      /* y */ Y, 
      TReturn
    ],
    context: Null,
    a: A,
    b: B,
    c: C,
    d: D,
    e: E,
    f: F,
    g: G
  ): js.Function6[/* t */ T, /* u */ U, /* v */ V, /* w */ W, /* x */ X, /* y */ Y, TReturn] = js.native
  def proxy[TReturn, A, B, C, D, E, F, T, U, V, W, X, Y, Z](
    fn: js.Function14[
      /* a */ A, 
      /* b */ B, 
      /* c */ C, 
      /* d */ D, 
      /* e */ E, 
      /* f */ F, 
      /* t */ T, 
      /* u */ U, 
      /* v */ V, 
      /* w */ W, 
      /* x */ X, 
      /* y */ Y, 
      /* z */ Z, 
      /* repeated */ js.Any, 
      TReturn
    ],
    context: js.UndefOr[scala.Nothing],
    a: A,
    b: B,
    c: C,
    d: D,
    e: E,
    f: F
  ): js.Function8[
    /* t */ T, 
    /* u */ U, 
    /* v */ V, 
    /* w */ W, 
    /* x */ X, 
    /* y */ Y, 
    /* z */ Z, 
    /* repeated */ js.Any, 
    TReturn
  ] = js.native
  /**
    * Takes a function and returns a new one that will always have a particular context.
    *
    * @param fn The function whose context will be changed.
    * @param context The object to which the context (this) of the function should be set.
    * @see \`{@link https://api.jquery.com/jQuery.proxy/ }\`
    * @since 1.9
    *
    * @deprecated Deprecated since 3.3. Use \`{@link Function.bind }\`.
    */
  def proxy[TReturn, A, B, C, D, E, F, T, U, V, W, X, Y, Z](
    fn: js.Function14[
      /* a */ A, 
      /* b */ B, 
      /* c */ C, 
      /* d */ D, 
      /* e */ E, 
      /* f */ F, 
      /* t */ T, 
      /* u */ U, 
      /* v */ V, 
      /* w */ W, 
      /* x */ X, 
      /* y */ Y, 
      /* z */ Z, 
      /* repeated */ js.Any, 
      TReturn
    ],
    context: Null,
    a: A,
    b: B,
    c: C,
    d: D,
    e: E,
    f: F
  ): js.Function8[
    /* t */ T, 
    /* u */ U, 
    /* v */ V, 
    /* w */ W, 
    /* x */ X, 
    /* y */ Y, 
    /* z */ Z, 
    /* repeated */ js.Any, 
    TReturn
  ] = js.native
  // endregion
  // region 6 parameters
  /**
    * Takes a function and returns a new one that will always have a particular context.
    *
    * @param fn The function whose context will be changed.
    * @param context The object to which the context (this) of the function should be set.
    * @see \`{@link https://api.jquery.com/jQuery.proxy/ }\`
    * @since 1.4
    * @since 1.6
    *
    * @deprecated Deprecated since 3.3. Use \`{@link Function.bind }\`.
    */
  def proxy[TContext /* <: js.Object */, TReturn, A, B, C, D, E, F, G, T, U, V, W, X, Y](
    fn: js.Function13[
      /* a */ A, 
      /* b */ B, 
      /* c */ C, 
      /* d */ D, 
      /* e */ E, 
      /* f */ F, 
      /* g */ G, 
      /* t */ T, 
      /* u */ U, 
      /* v */ V, 
      /* w */ W, 
      /* x */ X, 
      /* y */ Y, 
      TReturn
    ],
    context: TContext,
    a: A,
    b: B,
    c: C,
    d: D,
    e: E,
    f: F,
    g: G
  ): js.ThisFunction6[/* this */ TContext, /* t */ T, /* u */ U, /* v */ V, /* w */ W, /* x */ X, /* y */ Y, TReturn] = js.native
  /**
    * Takes a function and returns a new one that will always have a particular context.
    *
    * @param fn The function whose context will be changed.
    * @param context The object to which the context (this) of the function should be set.
    * @see \`{@link https://api.jquery.com/jQuery.proxy/ }\`
    * @since 1.4
    * @since 1.6
    *
    * @deprecated Deprecated since 3.3. Use \`{@link Function.bind }\`.
    */
  def proxy[TContext /* <: js.Object */, TReturn, A, B, C, D, E, F, T, U, V, W, X, Y, Z](
    fn: js.Function14[
      /* a */ A, 
      /* b */ B, 
      /* c */ C, 
      /* d */ D, 
      /* e */ E, 
      /* f */ F, 
      /* t */ T, 
      /* u */ U, 
      /* v */ V, 
      /* w */ W, 
      /* x */ X, 
      /* y */ Y, 
      /* z */ Z, 
      /* repeated */ js.Any, 
      TReturn
    ],
    context: TContext,
    a: A,
    b: B,
    c: C,
    d: D,
    e: E,
    f: F
  ): js.ThisFunction8[
    /* this */ TContext, 
    /* t */ T, 
    /* u */ U, 
    /* v */ V, 
    /* w */ W, 
    /* x */ X, 
    /* y */ Y, 
    /* z */ Z, 
    /* repeated */ js.Any, 
    TReturn
  ] = js.native
  def proxy[TReturn, A, B, C, D, E, F, G, T, U, V, W, X, Y, Z](
    fn: js.Function15[
      /* a */ A, 
      /* b */ B, 
      /* c */ C, 
      /* d */ D, 
      /* e */ E, 
      /* f */ F, 
      /* g */ G, 
      /* t */ T, 
      /* u */ U, 
      /* v */ V, 
      /* w */ W, 
      /* x */ X, 
      /* y */ Y, 
      /* z */ Z, 
      /* repeated */ js.Any, 
      TReturn
    ],
    context: js.UndefOr[scala.Nothing],
    a: A,
    b: B,
    c: C,
    d: D,
    e: E,
    f: F,
    g: G
  ): js.Function8[
    /* t */ T, 
    /* u */ U, 
    /* v */ V, 
    /* w */ W, 
    /* x */ X, 
    /* y */ Y, 
    /* z */ Z, 
    /* repeated */ js.Any, 
    TReturn
  ] = js.native
  // endregion
  // region 7+ parameters
  /**
    * Takes a function and returns a new one that will always have a particular context.
    *
    * @param fn The function whose context will be changed.
    * @param context The object to which the context (this) of the function should be set.
    * @see \`{@link https://api.jquery.com/jQuery.proxy/ }\`
    * @since 1.9
    *
    * @deprecated Deprecated since 3.3. Use \`{@link Function.bind }\`.
    */
  def proxy[TReturn, A, B, C, D, E, F, G, T, U, V, W, X, Y, Z](
    fn: js.Function15[
      /* a */ A, 
      /* b */ B, 
      /* c */ C, 
      /* d */ D, 
      /* e */ E, 
      /* f */ F, 
      /* g */ G, 
      /* t */ T, 
      /* u */ U, 
      /* v */ V, 
      /* w */ W, 
      /* x */ X, 
      /* y */ Y, 
      /* z */ Z, 
      /* repeated */ js.Any, 
      TReturn
    ],
    context: Null,
    a: A,
    b: B,
    c: C,
    d: D,
    e: E,
    f: F,
    g: G
  ): js.Function8[
    /* t */ T, 
    /* u */ U, 
    /* v */ V, 
    /* w */ W, 
    /* x */ X, 
    /* y */ Y, 
    /* z */ Z, 
    /* repeated */ js.Any, 
    TReturn
  ] = js.native
  // endregion
  // region 7+ parameters
  /**
    * Takes a function and returns a new one that will always have a particular context.
    *
    * @param fn The function whose context will be changed.
    * @param context The object to which the context (this) of the function should be set.
    * @see \`{@link https://api.jquery.com/jQuery.proxy/ }\`
    * @since 1.4
    * @since 1.6
    *
    * @deprecated Deprecated since 3.3. Use \`{@link Function.bind }\`.
    */
  def proxy[TContext /* <: js.Object */, TReturn, A, B, C, D, E, F, G, T, U, V, W, X, Y, Z](
    fn: js.Function15[
      /* a */ A, 
      /* b */ B, 
      /* c */ C, 
      /* d */ D, 
      /* e */ E, 
      /* f */ F, 
      /* g */ G, 
      /* t */ T, 
      /* u */ U, 
      /* v */ V, 
      /* w */ W, 
      /* x */ X, 
      /* y */ Y, 
      /* z */ Z, 
      /* repeated */ js.Any, 
      TReturn
    ],
    context: TContext,
    a: A,
    b: B,
    c: C,
    d: D,
    e: E,
    f: F,
    g: G
  ): js.ThisFunction8[
    /* this */ TContext, 
    /* t */ T, 
    /* u */ U, 
    /* v */ V, 
    /* w */ W, 
    /* x */ X, 
    /* y */ Y, 
    /* z */ Z, 
    /* repeated */ js.Any, 
    TReturn
  ] = js.native
  // endregion
  // endregion
  /**
    * Manipulate the queue of functions to be executed on the matched element.
    *
    * @param element A DOM element where the array of queued functions is attached.
    * @param queueName A string containing the name of the queue. Defaults to fx, the standard effects queue.
    * @param newQueue The new function to add to the queue.
    *                 An array of functions to replace the current queue contents.
    * @see \`{@link https://api.jquery.com/jQuery.queue/ }\`
    * @since 1.3
    */
  def queue[T /* <: Element */](element: T): Queue[T] = js.native
  def queue[T /* <: Element */](element: T, queueName: String): Queue[T] = js.native
  def queue[T /* <: Element */](element: T, queueName: String, newQueue: TypeOrArray[QueueFunction[T]]): Queue[T] = js.native
  /**
    * Handles errors thrown synchronously in functions wrapped in jQuery().
    *
    * @param error An error thrown in the function wrapped in jQuery().
    * @see \`{@link https://api.jquery.com/jQuery.readyException/ }\`
    * @since 3.1
    */
  def readyException(error: Error): js.Any = js.native
  /**
    * Remove a previously-stored piece of data.
    *
    * @param element A DOM element from which to remove data.
    * @param name A string naming the piece of data to remove.
    * @see \`{@link https://api.jquery.com/jQuery.removeData/ }\`
    * @since 1.2.3
    */
  def removeData(element: Element): Unit = js.native
  def removeData(element: Element, name: String): Unit = js.native
  /**
    * Creates an object containing a set of properties ready to be used in the definition of custom animations.
    *
    * @param duration_complete_settings A string or number determining how long the animation will run.
    *                                   A function to call once the animation is complete, called once per matched element.
    * @see \`{@link https://api.jquery.com/jQuery.speed/ }\`
    * @since 1.0
    * @since 1.1
    */
  def speed[TElement /* <: Element */](): EffectsOptions[TElement] = js.native
  def speed[TElement /* <: Element */](duration_complete_settings: js.ThisFunction0[/* this */ TElement, Unit]): EffectsOptions[TElement] = js.native
  def speed[TElement /* <: Element */](duration_complete_settings: Duration): EffectsOptions[TElement] = js.native
  def speed[TElement /* <: Element */](duration_complete_settings: SpeedSettings[TElement]): EffectsOptions[TElement] = js.native
  /**
    * Creates an object containing a set of properties ready to be used in the definition of custom animations.
    *
    * @param duration A string or number determining how long the animation will run.
    * @param easing_complete A string indicating which easing function to use for the transition.
    *                        A function to call once the animation is complete, called once per matched element.
    * @see \`{@link https://api.jquery.com/jQuery.speed/ }\`
    * @since 1.0
    * @since 1.1
    */
  def speed[TElement /* <: Element */](duration: Duration, easing_complete: String): EffectsOptions[TElement] = js.native
  def speed[TElement /* <: Element */](duration: Duration, easing_complete: js.ThisFunction0[/* this */ TElement, Unit]): EffectsOptions[TElement] = js.native
  /**
    * Creates an object containing a set of properties ready to be used in the definition of custom animations.
    *
    * @param duration A string or number determining how long the animation will run.
    * @param easing A string indicating which easing function to use for the transition.
    * @param complete A function to call once the animation is complete, called once per matched element.
    * @see \`{@link https://api.jquery.com/jQuery.speed/ }\`
    * @since 1.1
    */
  def speed[TElement /* <: Element */](duration: Duration, easing: String, complete: js.ThisFunction0[/* this */ TElement, Unit]): EffectsOptions[TElement] = js.native
  /**
    * Remove the whitespace from the beginning and end of a string.
    *
    * @param str The string to trim.
    * @see \`{@link https://api.jquery.com/jQuery.trim/ }\`
    * @since 1.0
    */
  def trim(str: String): String = js.native
  /**
    * Determine the internal JavaScript [[Class]] of an object.
    *
    * @param obj Object to get the internal JavaScript [[Class]] of.
    * @see \`{@link https://api.jquery.com/jQuery.type/ }\`
    * @since 1.4.3
    *
    * @deprecated Deprecated since 3.3. See \`{@link https://github.com/jquery/jquery/issues/3605 }`.
    */
  def `type`(obj: js.Any): array | boolean | date | error | function | `null` | number | `object` | regexp | string | symbol | undefined = js.native
  /**
    * @description Sorts an array of DOM elements, in place, with the duplicates removed. Note that this only works on
    * arrays of DOM elements, not strings or numbers.
    *
    * @param array The Array of DOM elements.
    * @see \`{@link https://api.jquery.com/jQuery.unique/ }\`
    * @since 1.1.3
    *
    * @deprecated Deprecated since 3.0. Use \`{@link JQueryStatic.uniqueSort }`.
    */
  def unique[T /* <: Element */](array: js.Array[T]): js.Array[T] = js.native
  /**
    * Sorts an array of DOM elements, in place, with the duplicates removed. Note that this only works on
    * arrays of DOM elements, not strings or numbers.
    *
    * @param array The Array of DOM elements.
    * @see \`{@link https://api.jquery.com/jQuery.uniqueSort/ }\`
    * @since 1.12
    * @since 2.2
    */
  def uniqueSort[T /* <: Element */](array: js.Array[T]): js.Array[T] = js.native
   // tslint:disable-line:use-default-type-parameter
  /**
    * Provides a way to execute callback functions based on zero or more Thenable objects, usually
    * Deferred objects that represent asynchronous events.
    *
    * @param deferreds Zero or more Thenable objects.
    * @see \`{@link https://api.jquery.com/jQuery.when/ }\`
    * @since 1.5
    */
  def when(deferreds: js.Any*): Promise[_, _, scala.Nothing] = js.native
  def when[TR1, TJ1](deferred: TR1): Promise[TR1, TJ1, scala.Nothing] = js.native
  /**
    * Provides a way to execute callback functions based on zero or more Thenable objects, usually
    * Deferred objects that represent asynchronous events.
    *
    * @see \`{@link https://api.jquery.com/jQuery.when/ }\`
    * @since 1.5
    */
  def when[TR1, TJ1](deferred: Promise[TR1, TJ1, _]): Promise[TR1, TJ1, scala.Nothing] = js.native
  def when[TR1, TJ1](deferred: Thenable[TR1]): Promise[TR1, TJ1, scala.Nothing] = js.native
  def when[TR1, UR1, TJ1, UJ1]( // tslint:disable-line:use-default-type-parameter
  deferredT: TR1, deferredU: UR1): Promise2[TR1, TJ1, scala.Nothing, UR1, UJ1, scala.Nothing] = js.native
  def when[TR1, UR1, TJ1, UJ1]( // tslint:disable-line:use-default-type-parameter
  deferredT: TR1, deferredU: Promise[UR1, UJ1, _]): Promise2[TR1, TJ1, scala.Nothing, UR1, UJ1, scala.Nothing] = js.native
  def when[TR1, UR1, TJ1, UJ1]( // tslint:disable-line:use-default-type-parameter
  deferredT: TR1, deferredU: Thenable[UR1]): Promise2[TR1, TJ1, scala.Nothing, UR1, UJ1, scala.Nothing] = js.native
  def when[TR1, UR1, TJ1, UJ1]( // tslint:disable-line:use-default-type-parameter
  deferredT: Promise[TR1, TJ1, _], deferredU: UR1): Promise2[TR1, TJ1, scala.Nothing, UR1, UJ1, scala.Nothing] = js.native
  /**
    * Provides a way to execute callback functions based on zero or more Thenable objects, usually
    * Deferred objects that represent asynchronous events.
    *
    * @see \`{@link https://api.jquery.com/jQuery.when/ }\`
    * @since 1.5
    */
  def when[TR1, UR1, TJ1, UJ1](
     // tslint:disable-line:use-default-type-parameter
  deferredT: Promise[TR1, TJ1, _],
    deferredU: Promise[UR1, UJ1, _]
  ): Promise2[TR1, TJ1, scala.Nothing, UR1, UJ1, scala.Nothing] = js.native
  def when[TR1, UR1, TJ1, UJ1](
     // tslint:disable-line:use-default-type-parameter
  deferredT: Promise[TR1, TJ1, _],
    deferredU: Thenable[UR1]
  ): Promise2[TR1, TJ1, scala.Nothing, UR1, UJ1, scala.Nothing] = js.native
  def when[TR1, UR1, TJ1, UJ1]( // tslint:disable-line:use-default-type-parameter
  deferredT: Thenable[TR1], deferredU: UR1): Promise2[TR1, TJ1, scala.Nothing, UR1, UJ1, scala.Nothing] = js.native
  def when[TR1, UR1, TJ1, UJ1](
     // tslint:disable-line:use-default-type-parameter
  deferredT: Thenable[TR1],
    deferredU: Promise[UR1, UJ1, _]
  ): Promise2[TR1, TJ1, scala.Nothing, UR1, UJ1, scala.Nothing] = js.native
  def when[TR1, UR1, TJ1, UJ1](
     // tslint:disable-line:use-default-type-parameter
  deferredT: Thenable[TR1],
    deferredU: Thenable[UR1]
  ): Promise2[TR1, TJ1, scala.Nothing, UR1, UJ1, scala.Nothing] = js.native
  /**
    * Provides a way to execute callback functions based on zero or more Thenable objects, usually
    * Deferred objects that represent asynchronous events.
    *
    * @see \`{@link https://api.jquery.com/jQuery.when/ }\`
    * @since 1.5
    */
  def when[TR1, UR1, VR1, TJ1, UJ1, VJ1](
     // tslint:disable-line:use-default-type-parameter
  deferredT: (Promise[TR1, TJ1, _]) | Thenable[TR1] | TR1,
     // tslint:disable-line:use-default-type-parameter
  deferredU: (Promise[UR1, UJ1, _]) | Thenable[UR1] | UR1,
    deferredV: (Promise[VR1, VJ1, _]) | Thenable[VR1] | VR1
  ): Promise3[TR1, TJ1, scala.Nothing, UR1, UJ1, scala.Nothing, VR1, VJ1, scala.Nothing] = js.native
   // tslint:disable-line:use-default-type-parameter
  /**
    * Provides a way to execute callback functions based on zero or more Thenable objects, usually
    * Deferred objects that represent asynchronous events.
    *
    * @param deferreds Zero or more Thenable objects.
    * @see \`{@link https://api.jquery.com/jQuery.when/ }\`
    * @since 1.5
    */
  @JSName("when")
  def when_TR1TJ1[TR1, TJ1](deferreds: ((Promise[TR1, TJ1, _]) | Thenable[TR1] | TR1)*): Promise[TR1, TJ1, scala.Nothing] = js.native
  /**
    * Provides a way to execute callback functions based on zero or more Thenable objects, usually
    * Deferred objects that represent asynchronous events.
    *
    * @see \`{@link https://api.jquery.com/jQuery.when/ }\`
    * @since 1.5
    */
  @JSName("when")
  def when_TR1TJ1TR2TJ2TR3TJ3_Promise3[TR1, TJ1, TR2, TJ2, TR3, TJ3](
    deferredT: (Promise2[TR1, TJ1, _, TR2, TJ2, _]) | (Promise3[TR1, TJ1, _, TR2, TJ2, _, TR3, TJ3, _])
  ): Promise3[TR1, TJ1, scala.Nothing, TR2, TJ2, scala.Nothing, TR3, TJ3, scala.Nothing] = js.native
}

