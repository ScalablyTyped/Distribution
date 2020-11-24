package typings.chaiJquery

import org.scalablytyped.runtime.StringDictionary
import typings.chaiJquery.anon.Interval
import typings.jquery.JQuery
import typings.jquery.JQueryAjaxSettings
import typings.jquery.JQueryCallback
import typings.jquery.JQueryDeferred
import typings.jquery.JQueryEventConstructor
import typings.jquery.JQueryParam
import typings.jquery.JQueryPromise
import typings.jquery.JQuerySupport
import typings.jquery.JQueryXHR
import typings.std.Document
import typings.std.Element
import typings.std.HTMLElement
import typings.std.Node
import typings.std.XMLDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Static members of chai-jquery (those on $ and jQuery themselves)
  */
@js.native
trait ChaiJQueryStatic extends js.Object {
  
  /**
    * Specify a function to execute when the DOM is fully loaded.
    */
  def apply(): ChaiJQuery = js.native
  /**
    * Binds a function to be executed when the DOM has finished loading.
    *
    * @param callback A function to execute after the DOM is ready.
    */
  def apply(callback: js.Function): ChaiJQuery = js.native
  /**
    * Accepts a string containing a CSS selector which is then used to match a set of elements.
    *
    * @param elementArray An array containing a set of DOM elements to wrap in a jQuery object.
    */
  def apply(elementArray: js.Array[Element]): ChaiJQuery = js.native
  /**
    * Accepts a string containing a CSS selector which is then used to match a set of elements.
    *
    * @param element A DOM element to wrap in a jQuery object.
    */
  def apply(element: Element): ChaiJQuery = js.native
  /**
    * Creates DOM elements on the fly from the provided string of raw HTML.
    *
    * @param html A string defining a single, standalone, HTML element (e.g. <div/> or <div></div>).
    * @param attributes An object of attributes, events, and methods to call on the newly-created element.
    */
  def apply(html: String, attributes: js.Object): ChaiJQuery = js.native
  def apply(html: String, ownerDocument: Document): ChaiJQuery = js.native
  /**
    * Accepts a string containing a CSS selector which is then used to match a set of elements.
    *
    * @param object A plain object to wrap in a jQuery object.
    */
  def apply(`object`: js.Object): ChaiJQuery = js.native
  /**
    * Accepts a string containing a CSS selector which is then used to match a set of elements.
    *
    * @param object An existing jQuery object to clone.
    */
  def apply(`object`: JQuery[HTMLElement]): ChaiJQuery = js.native
  /**
    * Accepts a string containing a CSS selector which is then used to match a set of elements.
    *
    * @param selector A string containing a selector expression
    * @param context A DOM Element, Document, or jQuery to use as context
    */
  /**
    * Creates DOM elements on the fly from the provided string of raw HTML.
    *
    * @param html A string of HTML to create on the fly. Note that this parses HTML, not XML.
    * @param ownerDocument A document in which the new elements will be created.
    */
  def apply(selector: String): ChaiJQuery = js.native
  def apply(selector: String, context: JQuery[HTMLElement]): ChaiJQuery = js.native
  def apply(selector: String, context: Element): ChaiJQuery = js.native
  
  /**
    * A multi-purpose callbacks list object that provides a powerful way to manage callback lists.
    *
    * @param flags An optional list of space-separated flags that change how the callback list behaves.
    */
  def Callbacks(): JQueryCallback = js.native
  def Callbacks(flags: String): JQueryCallback = js.native
  
  /**
    * A constructor function that returns a chainable utility object with methods to register multiple callbacks into callback queues, invoke callback queues, and relay the success or failure state of any synchronous or asynchronous function.
    *
    * @param beforeStart A function that is called just before the constructor returns.
    */
  def Deferred[T](): JQueryDeferred[T] = js.native
  def Deferred[T](beforeStart: js.Function1[/* deferred */ JQueryDeferred[T], _]): JQueryDeferred[T] = js.native
  
  /**
    * The jQuery.Event constructor is exposed and can be used when calling trigger. The new operator is optional.
    *
    * Check \`{@link https://api.jquery.com/trigger/ trigger}\`'s documentation to see how to combine it with your own event object.
    * @see \`{@link https://api.jquery.com/category/events/event-object/ }\`
    * @since 1.6
    * @example
  ```javascript
  //Create a new jQuery.Event object without the "new" operator.
  var e = jQuery.Event( "click" );
  ​
  // trigger an artificial click event
  jQuery( "body" ).trigger( e );
  ```
    * @example
  ```javascript
  // Create a new jQuery.Event object with specified event properties.
  var e = jQuery.Event( "keydown", { keyCode: 64 } );
  ​
  // trigger an artificial keydown event with keyCode 64
  jQuery( "body" ).trigger( e );
  ```
    */
  def Event[T /* <: js.Object */](event: String): typings.jquery.JQuery.Event with T = js.native
  def Event[T /* <: js.Object */](event: String, properties: T): typings.jquery.JQuery.Event with T = js.native
  @JSName("Event")
  var Event_Original: JQueryEventConstructor = js.native
  
  /**
    * Perform an asynchronous HTTP (Ajax) request.
    *
    * @param settings A set of key/value pairs that configure the Ajax request. All settings are optional. A default can be set for any option with $.ajaxSetup().
    */
  def ajax(settings: JQueryAjaxSettings): JQueryXHR = js.native
  /**
    * Perform an asynchronous HTTP (Ajax) request.
    *
    * @param url A string containing the URL to which the request is sent.
    * @param settings A set of key/value pairs that configure the Ajax request. All settings are optional. A default can be set for any option with $.ajaxSetup().
    */
  def ajax(url: String): JQueryXHR = js.native
  def ajax(url: String, settings: JQueryAjaxSettings): JQueryXHR = js.native
  
  /**
    * Handle custom Ajax options or modify existing options before each request is sent and before they are processed by $.ajax().
    *
    * @param dataTypes An optional string containing one or more space-separated dataTypes
    * @param handler A handler to set default values for future Ajax requests.
    */
  def ajaxPrefilter(
    dataTypes: String,
    handler: js.Function3[/* opts */ js.Any, /* originalOpts */ JQueryAjaxSettings, /* jqXHR */ JQueryXHR, _]
  ): Unit = js.native
  /**
    * Handle custom Ajax options or modify existing options before each request is sent and before they are processed by $.ajax().
    *
    * @param handler A handler to set default values for future Ajax requests.
    */
  def ajaxPrefilter(
    handler: js.Function3[/* opts */ js.Any, /* originalOpts */ JQueryAjaxSettings, /* jqXHR */ JQueryXHR, _]
  ): Unit = js.native
  
  var ajaxSettings: JQueryAjaxSettings = js.native
  
  /**
    * Set default values for future Ajax requests. Its use is not recommended.
    *
    * @param options A set of key/value pairs that configure the default Ajax request. All options are optional.
    */
  def ajaxSetup(options: JQueryAjaxSettings): Unit = js.native
  
  /**
    * Check to see if a DOM element is a descendant of another DOM element.
    *
    * @param container The DOM element that may contain the other element.
    * @param contained The DOM element that may be contained by (a descendant of) the other element.
    */
  def contains(container: Element, contained: Element): Boolean = js.native
  
  /**
    * Hook directly into jQuery to override how particular CSS properties are retrieved or set, normalize CSS property naming, or create custom properties.
    */
  var cssHooks: StringDictionary[js.Any] = js.native
  
  var cssNumber: js.Any = js.native
  
  /**
    * Returns value at named data store for the element, as set by jQuery.data(element, name, value), or the full data store for the element.
    *
    * @param element The DOM element to associate with the data.
    */
  def data(element: Element): js.Any = js.native
  /**
    * Returns value at named data store for the element, as set by jQuery.data(element, name, value), or the full data store for the element.
    *
    * @param element The DOM element to associate with the data.
    * @param key A string naming the piece of data to set.
    */
  def data(element: Element, key: String): js.Any = js.native
  /**
    * Store arbitrary data associated with the specified element. Returns the value that was set.
    *
    * @param element The DOM element to associate with the data.
    * @param key A string naming the piece of data to set.
    * @param value The new data value.
    */
  def data[T](element: Element, key: String, value: T): T = js.native
  
  /**
    * Execute the next function on the queue for the matched element.
    *
    * @param element A DOM element from which to remove and execute a queued function.
    * @param queueName A string containing the name of the queue. Defaults to fx, the standard effects queue.
    */
  def dequeue(element: Element): Unit = js.native
  def dequeue(element: Element, queueName: String): Unit = js.native
  
  /**
    * A generic iterator function, which can be used to seamlessly iterate over both objects and arrays. Arrays and array-like objects with a length property (such as a function's arguments object) are iterated by numeric index, from 0 to length-1. Other objects are iterated via their named properties.
    *
    * @param collection The object or array to iterate over.
    * @param callback The function that will be executed on every object.
    */
  def each(
    collection: js.Any,
    callback: js.Function2[/* indexInArray */ js.Any, /* valueOfElement */ js.Any, _]
  ): js.Any = js.native
  /**
    * A generic iterator function, which can be used to seamlessly iterate over both objects and arrays. Arrays and array-like objects with a length property (such as a function's arguments object) are iterated by numeric index, from 0 to length-1. Other objects are iterated via their named properties.
    *
    * @param collection The object or array to iterate over.
    * @param callback The function that will be executed on every object.
    */
  def each[T](
    collection: js.Array[T],
    callback: js.Function2[/* indexInArray */ Double, /* valueOfElement */ T, _]
  ): js.Any = js.native
  
  /**
    * Takes a string and throws an exception containing it.
    *
    * @param message The message to send out.
    */
  def error(message: js.Any): ChaiJQuery = js.native
  
  var expr: js.Any = js.native
  
  def extend(deep: Boolean, target: js.Any, object1: js.UndefOr[scala.Nothing], objectN: js.Any*): js.Any = js.native
  /**
    * Merge the contents of two or more objects together into the first object.
    *
    * @param deep If true, the merge becomes recursive (aka. deep copy).
    * @param target The object to extend. It will receive the new properties.
    * @param object1 An object containing additional properties to merge in.
    * @param objectN Additional objects containing properties to merge in.
    */
  def extend(deep: Boolean, target: js.Any, object1: js.Any, objectN: js.Any*): js.Any = js.native
  def extend(target: js.Any, object1: js.UndefOr[scala.Nothing], objectN: js.Any*): js.Any = js.native
  /**
    * Merge the contents of two or more objects together into the first object.
    *
    * @param target An object that will receive the new properties if additional objects are passed in or that will extend the jQuery namespace if it is the sole argument.
    * @param object1 An object containing additional properties to merge in.
    * @param objectN Additional objects containing properties to merge in.
    */
  def extend(target: js.Any, object1: js.Any, objectN: js.Any*): js.Any = js.native
  
  var fn: js.Any = js.native
  
  /**
    * Effects
    */
  var fx: Interval = js.native
  
  /**
    * Load data from the server using a HTTP GET request.
    *
    * @param url A string containing the URL to which the request is sent.
    * @param success A callback function that is executed if the request succeeds.
    * @param dataType The type of data expected from the server. Default: Intelligent Guess (xml, json, script, or html).
    */
  def get(url: String): JQueryXHR = js.native
  def get(url: String, data: js.UndefOr[scala.Nothing], success: js.UndefOr[scala.Nothing], dataType: String): JQueryXHR = js.native
  def get(
    url: String,
    data: js.UndefOr[scala.Nothing],
    success: js.Function3[/* data */ js.Any, /* textStatus */ String, /* jqXHR */ JQueryXHR, _]
  ): JQueryXHR = js.native
  def get(
    url: String,
    data: js.UndefOr[scala.Nothing],
    success: js.Function3[/* data */ js.Any, /* textStatus */ String, /* jqXHR */ JQueryXHR, _],
    dataType: String
  ): JQueryXHR = js.native
  def get(url: String, data: String): JQueryXHR = js.native
  def get(url: String, data: String, success: js.UndefOr[scala.Nothing], dataType: String): JQueryXHR = js.native
  def get(
    url: String,
    data: String,
    success: js.Function3[/* data */ js.Any, /* textStatus */ String, /* jqXHR */ JQueryXHR, _]
  ): JQueryXHR = js.native
  def get(
    url: String,
    data: String,
    success: js.Function3[/* data */ js.Any, /* textStatus */ String, /* jqXHR */ JQueryXHR, _],
    dataType: String
  ): JQueryXHR = js.native
  def get(url: String, data: js.Object): JQueryXHR = js.native
  def get(url: String, data: js.Object, success: js.UndefOr[scala.Nothing], dataType: String): JQueryXHR = js.native
  def get(
    url: String,
    data: js.Object,
    success: js.Function3[/* data */ js.Any, /* textStatus */ String, /* jqXHR */ JQueryXHR, _]
  ): JQueryXHR = js.native
  def get(
    url: String,
    data: js.Object,
    success: js.Function3[/* data */ js.Any, /* textStatus */ String, /* jqXHR */ JQueryXHR, _],
    dataType: String
  ): JQueryXHR = js.native
  def get(url: String, success: js.UndefOr[scala.Nothing], dataType: String): JQueryXHR = js.native
  def get(
    url: String,
    success: js.Function3[/* data */ js.Any, /* textStatus */ String, /* jqXHR */ JQueryXHR, _]
  ): JQueryXHR = js.native
  def get(
    url: String,
    success: js.Function3[/* data */ js.Any, /* textStatus */ String, /* jqXHR */ JQueryXHR, _],
    dataType: String
  ): JQueryXHR = js.native
  
  /**
    * Load JSON-encoded data from the server using a GET HTTP request.
    *
    * @param url A string containing the URL to which the request is sent.
    * @param success A callback function that is executed if the request succeeds.
    */
  def getJSON(url: String): JQueryXHR = js.native
  def getJSON(
    url: String,
    data: js.UndefOr[scala.Nothing],
    success: js.Function3[/* data */ js.Any, /* textStatus */ String, /* jqXHR */ JQueryXHR, _]
  ): JQueryXHR = js.native
  def getJSON(url: String, data: String): JQueryXHR = js.native
  def getJSON(
    url: String,
    data: String,
    success: js.Function3[/* data */ js.Any, /* textStatus */ String, /* jqXHR */ JQueryXHR, _]
  ): JQueryXHR = js.native
  def getJSON(url: String, data: js.Object): JQueryXHR = js.native
  def getJSON(
    url: String,
    data: js.Object,
    success: js.Function3[/* data */ js.Any, /* textStatus */ String, /* jqXHR */ JQueryXHR, _]
  ): JQueryXHR = js.native
  def getJSON(
    url: String,
    success: js.Function3[/* data */ js.Any, /* textStatus */ String, /* jqXHR */ JQueryXHR, _]
  ): JQueryXHR = js.native
  
  /**
    * Load a JavaScript file from the server using a GET HTTP request, then execute it.
    *
    * @param url A string containing the URL to which the request is sent.
    * @param success A callback function that is executed if the request succeeds.
    */
  def getScript(url: String): JQueryXHR = js.native
  def getScript(
    url: String,
    success: js.Function3[/* script */ String, /* textStatus */ String, /* jqXHR */ JQueryXHR, _]
  ): JQueryXHR = js.native
  
  /**
    * Execute some JavaScript code globally.
    *
    * @param code The JavaScript code to execute.
    */
  def globalEval(code: String): js.Any = js.native
  
  /**
    * Finds the elements of an array which satisfy a filter function. The original array is not affected.
    *
    * @param array The array to search through.
    * @param func The function to process each item against. The first argument to the function is the item, and the second argument is the index. The function should return a Boolean value.  this will be the global window object.
    * @param invert If "invert" is false, or not provided, then the function returns an array consisting of all elements for which "callback" returns true. If "invert" is true, then the function returns an array consisting of all elements for which "callback" returns false.
    */
  def grep[T](array: js.Array[T], func: js.Function2[/* elementOfArray */ T, /* indexInArray */ Double, Boolean]): js.Array[T] = js.native
  def grep[T](
    array: js.Array[T],
    func: js.Function2[/* elementOfArray */ T, /* indexInArray */ Double, Boolean],
    invert: Boolean
  ): js.Array[T] = js.native
  
  /**
    * Determine whether an element has any jQuery data associated with it.
    *
    * @param element A DOM element to be checked for data.
    */
  def hasData(element: Element): Boolean = js.native
  
  /**
    * Holds or releases the execution of jQuery's ready event.
    *
    * @param hold Indicates whether the ready hold is being requested or released
    */
  def holdReady(hold: Boolean): Unit = js.native
  
  /**
    * Search for a specified value within an array and return its index (or -1 if not found).
    *
    * @param value The value to search for.
    * @param array An array through which to search.
    * @param fromIndex The index of the array at which to begin the search. The default is 0, which will search the whole array.
    */
  def inArray[T](value: T, array: js.Array[T]): Double = js.native
  def inArray[T](value: T, array: js.Array[T], fromIndex: Double): Double = js.native
  
  /**
    * Determine whether the argument is an array.
    *
    * @param obj Object to test whether or not it is an array.
    */
  def isArray(obj: js.Any): Boolean = js.native
  
  /**
    * Check to see if an object is empty (contains no enumerable properties).
    *
    * @param obj The object that will be checked to see if it's empty.
    */
  def isEmptyObject(obj: js.Any): Boolean = js.native
  
  /**
    * Determine if the argument passed is a Javascript function object.
    *
    * @param obj Object to test whether or not it is a function.
    */
  def isFunction(obj: js.Any): Boolean = js.native
  
  /**
    * Determines whether its argument is a number.
    *
    * @param obj The value to be tested.
    */
  def isNumeric(value: js.Any): Boolean = js.native
  
  /**
    * Check to see if an object is a plain object (created using "{}" or "new Object").
    *
    * @param obj The object that will be checked to see if it's a plain object.
    */
  def isPlainObject(obj: js.Any): Boolean = js.native
  
    //TODO: Decide how we want to type this
  var isReady: Boolean = js.native
  
  /**
    * Determine whether the argument is a window.
    *
    * @param obj Object to test whether or not it is a window.
    */
  def isWindow(obj: js.Any): Boolean = js.native
  
  /**
    * Check to see if a DOM node is within an XML document (or is an XML document).
    *
    * @param node The DOM node that will be checked to see if it's in an XML document.
    */
  def isXMLDoc(node: Node): Boolean = js.native
  
  /**
    * Convert an array-like object into a true JavaScript array.
    *
    * @param obj Any object to turn into a native Array.
    */
  def makeArray(obj: js.Any): js.Array[_] = js.native
  
  /**
    * Translate all items in an array or object to new array of items.
    *
    * @param arrayOrObject The Array or Object to translate.
    * @param callback The function to process each item against. The first argument to the function is the value; the second argument is the index or key of the array or object property. The function can return any value to add to the array. A returned array will be flattened into the resulting array. Within the function, this refers to the global (window) object.
    */
  def map(arrayOrObject: js.Any, callback: js.Function2[/* value */ js.Any, /* indexOrKey */ js.Any, _]): js.Any = js.native
  /**
    * Translate all items in an array or object to new array of items.
    *
    * @param array The Array to translate.
    * @param callback The function to process each item against. The first argument to the function is the array item, the second argument is the index in array The function can return any value. Within the function, this refers to the global (window) object.
    */
  def map[T, U](array: js.Array[T], callback: js.Function2[/* elementOfArray */ T, /* indexInArray */ Double, U]): js.Array[U] = js.native
  
  /**
    * Merge the contents of two arrays together into the first array.
    *
    * @param first The first array to merge, the elements of second added.
    * @param second The second array to merge into the first, unaltered.
    */
  def merge[T](first: js.Array[T], second: js.Array[T]): js.Array[T] = js.native
  
  /**
    * Relinquish jQuery's control of the $ variable.
    *
    * @param removeAll A Boolean indicating whether to remove all jQuery variables from the global scope (including jQuery itself).
    */
  def noConflict(): js.Object = js.native
  def noConflict(removeAll: Boolean): js.Object = js.native
  
  /**
    * An empty function.
    */
  def noop(): js.Any = js.native
  
  /**
    * Return a number representing the current time.
    */
  def now(): Double = js.native
  
  /**
    * Create a serialized representation of an array or object, suitable for use in a URL query string or Ajax request.
    */
  def param(obj: js.Any): String = js.native
  def param(obj: js.Any, traditional: Boolean): String = js.native
  /**
    * Create a serialized representation of an array or object, suitable for use in a URL query string or Ajax request.
    */
  @JSName("param")
  var param_Original: JQueryParam = js.native
  
  /**
    * Parses a string into an array of DOM nodes.
    *
    * @param data HTML string to be parsed
    * @param context DOM element to serve as the context in which the HTML fragment will be created
    * @param keepScripts A Boolean indicating whether to include scripts passed in the HTML string
    */
  def parseHTML(data: String): js.Array[_] = js.native
  def parseHTML(data: String, context: js.UndefOr[scala.Nothing], keepScripts: Boolean): js.Array[_] = js.native
  def parseHTML(data: String, context: Document): js.Array[_] = js.native
  def parseHTML(data: String, context: Document, keepScripts: Boolean): js.Array[_] = js.native
  def parseHTML(data: String, context: HTMLElement): js.Array[_] = js.native
  def parseHTML(data: String, context: HTMLElement, keepScripts: Boolean): js.Array[_] = js.native
  
  /**
    * Takes a well-formed JSON string and returns the resulting JavaScript object.
    *
    * @param json The JSON string to parse.
    */
  def parseJSON(json: String): js.Any = js.native
  
  /**
    * Parses a string into an XML document.
    *
    * @param data a well-formed XML string to be parsed
    */
  def parseXML(data: String): XMLDocument = js.native
  
  /**
    * Load data from the server using a HTTP POST request.
    *
    * @param url A string containing the URL to which the request is sent.
    * @param success A callback function that is executed if the request succeeds. Required if dataType is provided, but can be null in that case.
    * @param dataType The type of data expected from the server. Default: Intelligent Guess (xml, json, script, text, html).
    */
  def post(url: String): JQueryXHR = js.native
  def post(url: String, data: js.UndefOr[scala.Nothing], success: js.UndefOr[scala.Nothing], dataType: String): JQueryXHR = js.native
  def post(
    url: String,
    data: js.UndefOr[scala.Nothing],
    success: js.Function3[/* data */ js.Any, /* textStatus */ String, /* jqXHR */ JQueryXHR, _]
  ): JQueryXHR = js.native
  def post(
    url: String,
    data: js.UndefOr[scala.Nothing],
    success: js.Function3[/* data */ js.Any, /* textStatus */ String, /* jqXHR */ JQueryXHR, _],
    dataType: String
  ): JQueryXHR = js.native
  def post(url: String, data: String): JQueryXHR = js.native
  def post(url: String, data: String, success: js.UndefOr[scala.Nothing], dataType: String): JQueryXHR = js.native
  def post(
    url: String,
    data: String,
    success: js.Function3[/* data */ js.Any, /* textStatus */ String, /* jqXHR */ JQueryXHR, _]
  ): JQueryXHR = js.native
  def post(
    url: String,
    data: String,
    success: js.Function3[/* data */ js.Any, /* textStatus */ String, /* jqXHR */ JQueryXHR, _],
    dataType: String
  ): JQueryXHR = js.native
  def post(url: String, data: js.Object): JQueryXHR = js.native
  def post(url: String, data: js.Object, success: js.UndefOr[scala.Nothing], dataType: String): JQueryXHR = js.native
  def post(
    url: String,
    data: js.Object,
    success: js.Function3[/* data */ js.Any, /* textStatus */ String, /* jqXHR */ JQueryXHR, _]
  ): JQueryXHR = js.native
  def post(
    url: String,
    data: js.Object,
    success: js.Function3[/* data */ js.Any, /* textStatus */ String, /* jqXHR */ JQueryXHR, _],
    dataType: String
  ): JQueryXHR = js.native
  def post(url: String, success: js.UndefOr[scala.Nothing], dataType: String): JQueryXHR = js.native
  def post(
    url: String,
    success: js.Function3[/* data */ js.Any, /* textStatus */ String, /* jqXHR */ JQueryXHR, _]
  ): JQueryXHR = js.native
  def post(
    url: String,
    success: js.Function3[/* data */ js.Any, /* textStatus */ String, /* jqXHR */ JQueryXHR, _],
    dataType: String
  ): JQueryXHR = js.native
  
  /**
    * Takes a function and returns a new one that will always have a particular context.
    *
    * @param context The object to which the context (this) of the function should be set.
    * @param name The name of the function whose context will be changed (should be a property of the context object).
    * @param additionalArguments Any number of arguments to be passed to the function named in the name argument.
    */
  def proxy(context: js.Object, name: String, additionalArguments: js.Any*): js.Any = js.native
  /**
    * Takes a function and returns a new one that will always have a particular context.
    *
    * @param fnction The function whose context will be changed.
    * @param context The object to which the context (this) of the function should be set.
    * @param additionalArguments Any number of arguments to be passed to the function referenced in the function argument.
    */
  def proxy(fnction: js.Function1[/* repeated */ js.Any, _], context: js.Object, additionalArguments: js.Any*): js.Any = js.native
  
  /**
    * Show the queue of functions to be executed on the matched element.
    *
    * @param element A DOM element to inspect for an attached queue.
    * @param queueName A string containing the name of the queue. Defaults to fx, the standard effects queue.
    */
  def queue(element: Element): js.Array[_] = js.native
  def queue(element: Element, queueName: String): js.Array[_] = js.native
  /**
    * Manipulate the queue of functions to be executed on the matched element.
    *
    * @param element A DOM element on which to add a queued function.
    * @param queueName A string containing the name of the queue. Defaults to fx, the standard effects queue.
    * @param callback The new function to add to the queue.
    */
  def queue(element: Element, queueName: String, callback: js.Function): ChaiJQuery = js.native
  /**
    * Manipulate the queue of functions to be executed on the matched element.
    *
    * @param element A DOM element where the array of queued functions is attached.
    * @param queueName A string containing the name of the queue. Defaults to fx, the standard effects queue.
    * @param newQueue An array of functions to replace the current queue contents.
    */
  def queue(element: Element, queueName: String, newQueue: js.Array[js.Function]): ChaiJQuery = js.native
  
  /**
    * Remove a previously-stored piece of data.
    *
    * @param element A DOM element from which to remove data.
    * @param name A string naming the piece of data to remove.
    */
  def removeData(element: Element): ChaiJQuery = js.native
  def removeData(element: Element, name: String): ChaiJQuery = js.native
  
  // Properties
  var support: JQuerySupport = js.native
  
  /**
    * Remove the whitespace from the beginning and end of a string.
    *
    * @param str Remove the whitespace from the beginning and end of a string.
    */
  def trim(str: String): String = js.native
  
  /**
    * Determine the internal JavaScript [[Class]] of an object.
    *
    * @param obj Object to get the internal JavaScript [[Class]] of.
    */
  def `type`(obj: js.Any): String = js.native
  
  /**
    * Sorts an array of DOM elements, in place, with the duplicates removed. Note that this only works on arrays of DOM elements, not strings or numbers.
    *
    * @param array The Array of DOM elements.
    */
  def unique(array: js.Array[Element]): js.Array[Element] = js.native
  
  /**
    * Provides a way to execute callback functions based on one or more objects, usually Deferred objects that represent asynchronous events.
    *
    * @param deferreds One or more Deferred objects, or plain JavaScript objects.
    */
  def when[T](deferreds: (T | JQueryPromise[T])*): JQueryPromise[T] = js.native
}
