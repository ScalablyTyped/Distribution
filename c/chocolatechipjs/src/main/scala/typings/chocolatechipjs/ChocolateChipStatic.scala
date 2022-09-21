package typings.chocolatechipjs

import typings.chocolatechipjs.anon.Call
import typings.chocolatechipjs.anon.CallbackName
import typings.chocolatechipjs.anon.Data
import typings.chocolatechipjs.anon.Extend
import typings.std.Document
import typings.std.HTMLElement
import typings.std.HTMLFormElement
import typings.std.JSON
import typings.std.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChocolateChipStatic extends StObject {
  
  /**
    * If no argument is provided, return the document as a ChocolateChipElementArray.
    */
  def apply(): js.Array[Document] = js.native
  /**
    * Binds a function to be executed when the DOM has finished loading.
    *
    * @param callback A function to execute after the DOM is ready.
    */
  def apply(callback: js.Function0[Any]): Unit = js.native
  /**
    * Accepts a string containing a CSS selector which is then used to match a set of elements.
    *
    * @param elementArray An array of DOM elements to convert into a ChocolateChip Collection.
    */
  def apply(elementArray: ChocolateChipElementArray): ChocolateChipElementArray = js.native
  /**
    * Accepts a string containing a CSS selector which is then used to match a set of elements.
    *
    * @param selector A string containing a selector expression
    * @param context A DOM HTMLElement to use as context
    */
  def apply(selector: String): ChocolateChipElementArray = js.native
  def apply(selector: String, context: ChocolateChipElementArray): ChocolateChipElementArray = js.native
  def apply(selector: String, context: HTMLElement): ChocolateChipElementArray = js.native
  def apply(selector: Document): ChocolateChipElementArray = js.native
  def apply(selector: Document, context: ChocolateChipElementArray): ChocolateChipElementArray = js.native
  def apply(selector: Document, context: HTMLElement): ChocolateChipElementArray = js.native
  /**
    * Accepts a string containing a CSS selector which is then used to match a set of elements.
    *
    * @param element A DOM element to wrap in an array.
    */
  def apply(selector: HTMLElement): ChocolateChipElementArray = js.native
  def apply(selector: HTMLElement, context: ChocolateChipElementArray): ChocolateChipElementArray = js.native
  def apply(selector: HTMLElement, context: HTMLElement): ChocolateChipElementArray = js.native
  
  /**
    * A cache to hold callbacks execute by the response from a JSONP request.
    * This is an array of strings.
    * By default these values get purged when the callback execute and exposes the data returned by the request.
    */
  var JSONPCallbacks: js.Array[String] = js.native
  
  /**
    * This method converts a string of hyphenated tokens into a camel cased string.
    *
    * @param string A string of hyphenated tokens.
    */
  def camelize(string: String): String = js.native
  
  /**
    * This method capitalizes the first letter of a string.
    */
  def capitalize(string: String): String = js.native
  def capitalize(string: String, boolean: Boolean): String = js.native
  
  /**
    * ATENTION: DO NOT TOUCH!
    * This is the ChocolateChipJS cache.
    * This is used to store details about registered events and data.
    * You should not touch any of these values, even though they are exposed, as this can seriously impair the behavior of your app.
    *
    * data: this is used by $(element).data() to store data.
    * events: this is used by the event system.
    */
  var chch_cache: Data = js.native
  
  /**
    * This method will concatenate strings or values as a cleaner alternative to using the '+' operator.
    *
    * @param {string | number} A comma separated series of strings to concatenate.
    */
  def concat(string: String*): String = js.native
  
  /**
    * This method converts a camel case string into lowercase with hyphens.
    *
    * @param string A camel case string.
    */
  def deCamelize(string: String): String = js.native
  
  /**
    * The method will defer the execution of its callback until the call stack is clear.
    *
    * @param callback A callback to execute after a delay.
    */
  def defer(callback: js.Function): js.Function = js.native
  
  /**
    * This method will defer the execution of a function until the call stack is clear.
    *
    * @param callback A function to execute.
    * @param duration The number of milliseconds to delay execution.
    */
  def delay(callback: js.Function): Any = js.native
  def delay(callback: js.Function, duration: Double): Any = js.native
  
  /**
    * This method allows you to execute a callback on each item in an array of elements.
    *
    * @param array An array of elements.
    * @param callback A callback to execute on each element. This has two parameters: the context, followed by the index of the current iteration.
    */
  def each[T](array: js.Array[T], callback: js.Function2[/* ctx */ T, /* idx */ Double, Any]): Any = js.native
  
  /**
    * Extend the ChocolateChipJS object itself with the provided object.
    *
    * @param object The object to add to ChocolateChipJS.
    * @return The ChocolateChipJS object.
    */
  def extend(`object`: js.Object): js.Object = js.native
  /**
    * Extend a target object with another object.
    *
    * @param target An object to extend.
    * @param object The object to add to the target.
    * @return The extended object.
    */
  def extend(target: js.Object, `object`: js.Object): js.Object = js.native
  
  /**
    * The base for extending ChocolateChipJS collections, which are arrays of elements.
    */
  var fn: Extend = js.native
  
  /**
    * Grabs values from a form and converts them into a JSON object.
    *
    * @param rootNode: A form whose values you want to convert to JSON.
    * @param delimiter A delimiter to namespace your form values. The default is "."
    * You use the form input's name to set up the namespace structure for your JSON, e.g. name="newUser.name.first".
    */
  def form2JSON(rootNode: String, delimiter: String): js.Object = js.native
  def form2JSON(rootNode: HTMLElement, delimiter: String): js.Object = js.native
  
  /**
    * Create a ChocolateChip collection object by creating elements from an HTML string. This is an alias for $.make.
    */
  def html(selector: String): ChocolateChipElementArray = js.native
  
  /**
    * Whether OS is Android
    */
  var isAndroid: Boolean = js.native
  
  /**
    * Determine whether the argument is an array.
    *
    * @param obj Object to test whether or not it is an array.
    */
  def isArray(obj: Any): Boolean = js.native
  
  /**
    * Whether OS is Blackberry.
    */
  var isBlackberry: Boolean = js.native
  
  /**
    * Whether browser is Chrome.
    */
  var isChrome: Boolean = js.native
  
  /**
    * Whether browser is running on desktop.
    */
  var isDesktop: Boolean = js.native
  
  /**
    * Determine whether the argument is an empty object.
    *
    * @param obj Object to test whether or not it is an empty object.
    * @return boolean
    */
  def isEmptyObject(obj: Any): Boolean = js.native
  
  /**
    * Determine whether the argument is a float.
    *
    * @param obj Object to test whether or not it is a float.
    */
  def isFloat(obj: Any): Boolean = js.native
  
  /**
    * Determine whether the argument is a function.
    *
    * @param obj Object to test whether or not it is an function.
    */
  def isFunction(obj: Any): Boolean = js.native
  
  /**
    * Whether browser is IE10.
    */
  var isIE10: Boolean = js.native
  
  /**
    * Whether browser is IE11.
    */
  var isIE11: Boolean = js.native
  
  /**
    * Determine whether the argument is an integer.
    *
    * @param obj Object to test whether or not it is an integer.
    */
  def isInteger(obj: Any): Boolean = js.native
  
  /**
    * Whether browser is running on mobile device.
    */
  var isMobile: Boolean = js.native
  
  /**
    * Is native Android browser (not mobile Chrome).
    */
  var isNativeAndroid: Boolean = js.native
  
  /**
    * Determine whether the argument is a number.
    *
    * @param obj Object to test whether or not it is a number.
    */
  def isNumber(obj: Any): Boolean = js.native
  
  /**
    * Determine whether the argument is an object.
    *
    * @param obj Object to test whether or not it is an object.
    */
  def isObject(obj: Any): Boolean = js.native
  
  /**
    * Whether there is a network connection.
    */
  var isOnline: Boolean = js.native
  
  /**
    * Whether browser is Safari.
    */
  var isSafari: Boolean = js.native
  
  /**
    * Whether app is running in stanalone mode.
    */
  var isStandalone: Boolean = js.native
  
  /**
    * Determine whether the argument is a string.
    *
    * @param obj Object to test whether or not it is a string.
    */
  def isString(obj: Any): Boolean = js.native
  
  /**
    * Whether OS supports touch events.
    */
  var isTouchEnabled: Boolean = js.native
  
  /**
    * Whether OS is WebOS.
    */
  var isWebOS: Boolean = js.native
  
  /**
    * Whether browser is Webkit based.
    */
  var isWebkit: Boolean = js.native
  
  /**
    * Whether OS is Windows.
    */
  var isWin: Boolean = js.native
  
  /**
    * Whether device is Windows Phone.
    */
  var isWinPhone: Boolean = js.native
  
  /**
    * Whether OS is iOS.
    */
  var isiOS: Boolean = js.native
  
  /**
    * Whether OS is iOS 6.
    */
  var isiOS6: Boolean = js.native
  
  /**
    * Whether OS i iOS 7.
    */
  var isiOS7: Boolean = js.native
  
  /**
    * Whether device is iPad.
    */
  var isiPad: Boolean = js.native
  
  /**
    * Whether device is iPhone.
    */
  var isiPhone: Boolean = js.native
  
  /**
    * Whether device is iPod.
    */
  var isiPod: Boolean = js.native
  
  /**
    * Parse the data in a Promise response as JSON.
    *
    * @param response The response from a Promise.
    */
  def json(reponse: Response): JSON = js.native
  
  /**
    * Method to perform JSONP request.
    *
    * @param url A string defining the url to target.
    * @param options And object literal of properties: {timeout? number, callbackName?: string, clear?: boolean}
    */
  def jsonp(url: String): Any = js.native
  def jsonp(url: String, options: CallbackName): Any = js.native
  
  /**
    * Contains the name of the library (ChocolateChip).
    */
  var libraryName: String = js.native
  
  /**
    * Create a ChocolateChip collection object by creating elements from an HTML string.
    */
  def make(selector: String): ChocolateChipElementArray = js.native
  
  /**
    * Creates a uuid using uuidNum().
    */
  def makeUuid(): String = js.native
  
  /**
    * An empty function.
    */
  def noop(): Unit = js.native
  
  /**
    * Process JavaScript returned by Ajax request. An optional name can be used to create a custom variable name by which the data is exposed, otherwise it is exposed with the variable "data".
    *
    * @param url A string containing the URL where the script resides.
    * @param callback A callback function that is executed after the script loads.
    * @return {Function}
    */
  def processJSON(json: String): Any = js.native
  def processJSON(json: String, name: String): Any = js.native
  
  /**
    *    Publish a topic with data for the topic's subscribers to receive.
    *
    * @param topic The topic you wish to publish.
    * @param data The data to send with the publication. This can be of any type: string, number, array, object, etc.
    * @return {void}
    */
  def publish(topic: String, data: Any): String = js.native
  
  /**
    * Replace one element with another.
    * @return {HTMLElement[]}
    */
  def replace(newElement: ChocolateChipElementArray, oldElement: ChocolateChipElementArray): Unit = js.native
  
  /**
    * Load a JavaScript file from a url, then execute it.
    *
    * @param url A string containing the URL where the script resides.
    * @param callback A callback function that is executed after the script loads.
    * @return {void}
    */
  def require(url: String, callback: js.Function): js.Function = js.native
  
  /**
    * This method makes sure a method always returns an array.
    * If no values are available to return, it returns and empty array.
    * This is to make sure that methods that expect a chainable array will not throw and exception.
    *
    * @param result The result of a method to test if it can be returned in an array.
    * @return An array holding the results of a method, otherwise an empty array.
    */
  def returnResult(result: js.Array[HTMLElement]): js.Array[Any] = js.native
  
  /**
    * This method takes a referenced form and serializes its element names and values, which it returns as a string. This is required if you want to send form data.
    *
    * @param element A string, HTML element or ChocolateChipElementArray containing a reference to a from.
    * @return An encode string form element names and values.
    */
  def serialize(element: Any): String = js.native
  def serialize(form: ChocolateChipElementArray): String = js.native
  /**
    * Serialize
    */
  def serialize(form: HTMLFormElement): String = js.native
  
  /**
    * Subscribe to a publication. You provide the topic you want to subscribe to, as well as a callback to execute when a publication occurs.
    * Any data passed by the publisher is exposed to the callback as its second parameter. The callback's first parameter is the published topic.
    *
    * @param topic A topic to subscribe to. This can be a single term, or any type of namespaced term with delimiters.
    * @param callback You can receive any type: string, number, array, object, etc.
    */
  def subscribe(topic: String, callback: js.Function2[/* topic */ String, /* data */ Any, Any]): Boolean = js.native
  
  /**
    * This method parses a string and an optoinal variable name and returns a parsed template in the form of a function. You can then pass this function data to get rendered nodes.
    *
    * @param template A string of markup to use as a template.
    * @param variable An option name to use in the template. If it were "myData": [[= myData.name]]. Otherwise it defaults to "data": [[= data.name]].
    */
  /**
    * This method returns a parsed template.
    *
    */
  def template(template: String): js.Function = js.native
  def template(template: String, variable: String): js.Function = js.native
  /**
    * This method returns a parsed template.
    *
    */
  @JSName("template")
  var template_Original: Call = js.native
  
  /**
    * Object used to store string templates and parsed templates.
    *
    * @param {strin} A string defining the template.
    * @param {string} A label used to access an object's properties in the template. If none is provided it defaults to "data": [[= data.name]].
    * @return {void}
    */
  var templates: js.Object = js.native
  
  /**
    * Unsubscribe from a topic. Pass this the topic you wish to unsubscribe from. The subscription will be terminated immediately.
    *
    * @param topic The name of the topic to unsubscribe from.
    */
  def unsubscribe(topic: String): Unit = js.native
  
  /**
    * Uuid number.
    */
  var uuid: Double = js.native
  
  /**
    * Create a random number to use as a uuid.
    */
  def uuidNum(): Double = js.native
  
  /**
    * Contains the version of ChocolateChipJS in use.
    */
  var version: String = js.native
  
  /**
    * This method takes a space-delimited string of words and returns it as an array where the individual words are indices.
    *
    * @param Any string with values separated by spaces.
    */
  def w(string: String): js.Array[String] = js.native
}
