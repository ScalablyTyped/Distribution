package typings
package chocolatechipjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChocolateChipStatic extends js.Object {
  /**
    * A cache to hold callbacks execute by the response from a JSONP request.
    * This is an array of strings.
    * By default these values get purged when the callback execute and exposes the data returned by the request.
    */
  var JSONPCallbacks: js.Array[java.lang.String] = js.native
  /**
    * ATENTION: DO NOT TOUCH!
    * This is the ChocolateChipJS cache.
    * This is used to store details about registered events and data.
    * You should not touch any of these values, even though they are exposed, as this can seriously impair the behavior of your app.
    *
    * data: this is used by $(element).data() to store data.
    * events: this is used by the event system.
    */
  var chch_cache: Anon_DataEvents = js.native
  /**
    * The base for extending ChocolateChipJS collections, which are arrays of elements.
    */
  var fn: Anon_Extend = js.native
  /**
    * Whether OS is Android
    */
  var isAndroid: scala.Boolean = js.native
  /**
    * Whether OS is Blackberry.
    */
  var isBlackberry: scala.Boolean = js.native
  /**
    * Whether browser is Chrome.
    */
  var isChrome: scala.Boolean = js.native
  /**
    * Whether browser is running on desktop.
    */
  var isDesktop: scala.Boolean = js.native
  /**
    * Whether browser is IE10.
    */
  var isIE10: scala.Boolean = js.native
  /**
    * Whether browser is IE11.
    */
  var isIE11: scala.Boolean = js.native
  /**
    * Whether browser is running on mobile device.
    */
  var isMobile: scala.Boolean = js.native
  /**
    * Is native Android browser (not mobile Chrome).
    */
  var isNativeAndroid: scala.Boolean = js.native
  /**
    * Whether there is a network connection.
    */
  var isOnline: scala.Boolean = js.native
  /**
    * Whether browser is Safari.
    */
  var isSafari: scala.Boolean = js.native
  /**
    * Whether app is running in stanalone mode.
    */
  var isStandalone: scala.Boolean = js.native
  /**
    * Whether OS supports touch events.
    */
  var isTouchEnabled: scala.Boolean = js.native
  /**
    * Whether OS is WebOS.
    */
  var isWebOS: scala.Boolean = js.native
  /**
    * Whether browser is Webkit based.
    */
  var isWebkit: scala.Boolean = js.native
  /**
    * Whether OS is Windows.
    */
  var isWin: scala.Boolean = js.native
  /**
    * Whether device is Windows Phone.
    */
  var isWinPhone: scala.Boolean = js.native
  /**
    * Whether OS is iOS.
    */
  var isiOS: scala.Boolean = js.native
  /**
    * Whether OS is iOS 6.
    */
  var isiOS6: scala.Boolean = js.native
  /**
    * Whether OS i iOS 7.
    */
  var isiOS7: scala.Boolean = js.native
  /**
    * Whether device is iPad.
    */
  var isiPad: scala.Boolean = js.native
  /**
    * Whether device is iPhone.
    */
  var isiPhone: scala.Boolean = js.native
  /**
    * Whether device is iPod.
    */
  var isiPod: scala.Boolean = js.native
  /**
    * Contains the name of the library (ChocolateChip).
    */
  var libraryName: java.lang.String = js.native
  /**
    * This method returns a parsed template.
    *
    */
  @JSName("template")
  var template_Original: Anon_DataElement = js.native
  /**
    * Object used to store string templates and parsed templates.
    *
    * @param {strin} A string defining the template.
    * @param {string} A label used to access an object's properties in the template. If none is provided it defaults to "data": [[= data.name]].
    * @return {void}
    */
  var templates: js.Object = js.native
  /**
    * Uuid number.
    */
  var uuid: scala.Double = js.native
  /**
    * Contains the version of ChocolateChipJS in use.
    */
  var version: java.lang.String = js.native
  /**
    * If no argument is provided, return the document as a ChocolateChipElementArray.
    */
  def apply(): js.Array[stdLib.Document] = js.native
  /**
    * Binds a function to be executed when the DOM has finished loading.
    *
    * @param callback A function to execute after the DOM is ready.
    */
  def apply(callback: js.Function0[_]): scala.Unit = js.native
  /**
    * Accepts the document element and returns it wrapped in an array.
    *
    * @param document The document object.
    */
  def apply(document: stdLib.Document): js.Array[stdLib.Document] = js.native
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
  def apply(selector: java.lang.String): ChocolateChipElementArray = js.native
  def apply(selector: java.lang.String, context: ChocolateChipElementArray): ChocolateChipElementArray = js.native
  def apply(selector: java.lang.String, context: stdLib.HTMLElement): ChocolateChipElementArray = js.native
  def apply(selector: stdLib.Document, context: ChocolateChipElementArray): ChocolateChipElementArray = js.native
  def apply(selector: stdLib.Document, context: stdLib.HTMLElement): ChocolateChipElementArray = js.native
  /**
    * Accepts a string containing a CSS selector which is then used to match a set of elements.
    *
    * @param element A DOM element to wrap in an array.
    */
  def apply(selector: stdLib.HTMLElement): ChocolateChipElementArray = js.native
  def apply(selector: stdLib.HTMLElement, context: ChocolateChipElementArray): ChocolateChipElementArray = js.native
  def apply(selector: stdLib.HTMLElement, context: stdLib.HTMLElement): ChocolateChipElementArray = js.native
  /**
    * This method converts a string of hyphenated tokens into a camel cased string.
    *
    * @param string A string of hyphenated tokens.
    */
  def camelize(string: java.lang.String): java.lang.String = js.native
  /**
    * This method capitalizes the first letter of a string.
    */
  def capitalize(string: java.lang.String): java.lang.String = js.native
  def capitalize(string: java.lang.String, boolean: scala.Boolean): java.lang.String = js.native
  /**
    * This method will concatenate strings or values as a cleaner alternative to using the '+' operator.
    *
    * @param {string | number} A comma separated series of strings to concatenate.
    */
  def concat(string: java.lang.String*): java.lang.String = js.native
  /**
    * This method converts a camel case string into lowercase with hyphens.
    *
    * @param string A camel case string.
    */
  def deCamelize(string: java.lang.String): java.lang.String = js.native
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
  def delay(callback: js.Function): js.Any = js.native
  def delay(callback: js.Function, duration: scala.Double): js.Any = js.native
  /**
    * This method allows you to execute a callback on each item in an array of elements.
    *
    * @param array An array of elements.
    * @param callback A callback to execute on each element. This has two parameters: the context, followed by the index of the current iteration.
    */
  def each[T](array: js.Array[T], callback: js.Function2[/* ctx */ T, /* idx */ scala.Double, _]): js.Any = js.native
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
    * Grabs values from a form and converts them into a JSON object.
    *
    * @param rootNode: A form whose values you want to convert to JSON.
    * @param delimiter A delimiter to namespace your form values. The default is "."
    * You use the form input's name to set up the namespace structure for your JSON, e.g. name="newUser.name.first".
    */
  def form2JSON(rootNode: java.lang.String, delimiter: java.lang.String): js.Object = js.native
  def form2JSON(rootNode: stdLib.HTMLElement, delimiter: java.lang.String): js.Object = js.native
  /**
    * Create a ChocolateChip collection object by creating elements from an HTML string. This is an alias for $.make.
    */
  def html(selector: java.lang.String): ChocolateChipElementArray = js.native
  /**
    * Determine whether the argument is an array.
    *
    * @param obj Object to test whether or not it is an array.
    */
  def isArray(obj: js.Any): scala.Boolean = js.native
  /**
    * Determine whether the argument is an empty object.
    *
    * @param obj Object to test whether or not it is an empty object.
    * @return boolean
    */
  def isEmptyObject(obj: js.Any): scala.Boolean = js.native
  /**
    * Determine whether the argument is a float.
    *
    * @param obj Object to test whether or not it is a float.
    */
  def isFloat(obj: js.Any): scala.Boolean = js.native
  /**
    * Determine whether the argument is a function.
    *
    * @param obj Object to test whether or not it is an function.
    */
  def isFunction(obj: js.Any): scala.Boolean = js.native
  /**
    * Determine whether the argument is an integer.
    *
    * @param obj Object to test whether or not it is an integer.
    */
  def isInteger(obj: js.Any): scala.Boolean = js.native
  /**
    * Determine whether the argument is a number.
    *
    * @param obj Object to test whether or not it is a number.
    */
  def isNumber(obj: js.Any): scala.Boolean = js.native
  /**
    * Determine whether the argument is an object.
    *
    * @param obj Object to test whether or not it is an object.
    */
  def isObject(obj: js.Any): scala.Boolean = js.native
  /**
    * Determine whether the argument is a string.
    *
    * @param obj Object to test whether or not it is a string.
    */
  def isString(obj: js.Any): scala.Boolean = js.native
  /**
    * Parse the data in a Promise response as JSON.
    *
    * @param response The response from a Promise.
    */
  def json(reponse: stdLib.Response): stdLib.JSON = js.native
  /**
    * Method to perform JSONP request.
    *
    * @param url A string defining the url to target.
    * @param options And object literal of properties: {timeout? number, callbackName?: string, clear?: boolean}
    */
  def jsonp(url: java.lang.String): js.Any = js.native
  def jsonp(url: java.lang.String, options: Anon_CallbackName): js.Any = js.native
  /**
    * Create a ChocolateChip collection object by creating elements from an HTML string.
    */
  def make(selector: java.lang.String): ChocolateChipElementArray = js.native
  /**
    * Creates a uuid using uuidNum().
    */
  def makeUuid(): java.lang.String = js.native
  /**
    * An empty function.
    */
  def noop(): scala.Unit = js.native
  /**
    * Process JavaScript returned by Ajax request. An optional name can be used to create a custom variable name by which the data is exposed, otherwise it is exposed with the variable "data".
    *
    * @param url A string containing the URL where the script resides.
    * @param callback A callback function that is executed after the script loads.
    * @return {Function}
    */
  def processJSON(json: java.lang.String): js.Any = js.native
  def processJSON(json: java.lang.String, name: java.lang.String): js.Any = js.native
  /**
    *    Publish a topic with data for the topic's subscribers to receive.
    *
    * @param topic The topic you wish to publish.
    * @param data The data to send with the publication. This can be of any type: string, number, array, object, etc.
    * @return {void}
    */
  def publish(topic: java.lang.String, data: js.Any): java.lang.String = js.native
  /**
    * Replace one element with another.
    * @return {HTMLElement[]}
    */
  def replace(newElement: ChocolateChipElementArray, oldElement: ChocolateChipElementArray): scala.Unit = js.native
  /**
    * Load a JavaScript file from a url, then execute it.
    *
    * @param url A string containing the URL where the script resides.
    * @param callback A callback function that is executed after the script loads.
    * @return {void}
    */
  def require(url: java.lang.String, callback: js.Function): js.Function = js.native
  /**
    * This method makes sure a method always returns an array.
    * If no values are available to return, it returns and empty array.
    * This is to make sure that methods that expect a chainable array will not throw and exception.
    *
    * @param result The result of a method to test if it can be returned in an array.
    * @return An array holding the results of a method, otherwise an empty array.
    */
  def returnResult(result: js.Array[stdLib.HTMLElement]): js.Array[_] = js.native
  /**
    * This method takes a referenced form and serializes its element names and values, which it returns as a string. This is required if you want to send form data.
    *
    * @param element A string, HTML element or ChocolateChipElementArray containing a reference to a from.
    * @return An encode string form element names and values.
    */
  def serialize(element: js.Any): java.lang.String = js.native
  def serialize(form: ChocolateChipElementArray): java.lang.String = js.native
  /**
    * Serialize
    */
  def serialize(form: stdLib.HTMLFormElement): java.lang.String = js.native
  /**
    * Subscribe to a publication. You provide the topic you want to subscribe to, as well as a callback to execute when a publication occurs.
    * Any data passed by the publisher is exposed to the callback as its second parameter. The callback's first parameter is the published topic.
    *
    * @param topic A topic to subscribe to. This can be a single term, or any type of namespaced term with delimiters.
    * @param callback You can receive any type: string, number, array, object, etc.
    */
  def subscribe(
    topic: java.lang.String,
    callback: js.Function2[/* topic */ java.lang.String, /* data */ js.Any, _]
  ): scala.Boolean = js.native
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
  def template(template: java.lang.String): js.Function = js.native
  def template(template: java.lang.String, variable: java.lang.String): js.Function = js.native
  /**
    * Unsubscribe from a topic. Pass this the topic you wish to unsubscribe from. The subscription will be terminated immediately.
    *
    * @param topic The name of the topic to unsubscribe from.
    */
  def unsubscribe(topic: java.lang.String): scala.Unit = js.native
  /**
    * Create a random number to use as a uuid.
    */
  def uuidNum(): scala.Double = js.native
  /**
    * This method takes a space-delimited string of words and returns it as an array where the individual words are indices.
    *
    * @param Any string with values separated by spaces.
    */
  def w(string: java.lang.String): js.Array[java.lang.String] = js.native
}

