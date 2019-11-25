package typings.cypress.JQuery.Ajax

import typings.cypress.JQuery.PlainObject
import typings.cypress.JQuery.TypeOrArray
import typings.cypress.JQuery.jqXHR
import typings.cypress.cypressNumbers.`false`
import typings.cypress.cypressNumbers.`true`
import typings.cypress.cypressStrings.html_
import typings.cypress.cypressStrings.json_
import typings.cypress.cypressStrings.jsonp
import typings.cypress.cypressStrings.script
import typings.cypress.cypressStrings.text
import typings.cypress.cypressStrings.xml
import typings.std.RegExp
import typings.std.XMLHttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see \`{@link https://api.jquery.com/jquery.ajax/#jQuery-ajax-settings }\`
  */
trait AjaxSettingsBase[TContext] extends js.Object {
  /**
    * A set of key/value pairs that map a given dataType to its MIME type, which gets sent in the Accept request header. This header tells the server what kind of response it will accept in return.
    */
  var accepts: js.UndefOr[PlainObject[String]] = js.undefined
  /**
    * By default, all requests are sent asynchronously (i.e. this is set to true by default). If you need synchronous requests, set this option to false. Cross-domain requests and dataType: "jsonp" requests do not support synchronous operation. Note that synchronous requests may temporarily lock the browser, disabling any actions while the request is active. As of jQuery 1.8, the use of async: false with jqXHR ($.Deferred) is deprecated; you must use the success/error/complete callback options instead of the corresponding methods of the jqXHR object such as jqXHR.done().
    */
  var async: js.UndefOr[Boolean] = js.undefined
  /**
    * A pre-request callback function that can be used to modify the jqXHR (in jQuery 1.4.x, XMLHTTPRequest) object before it is sent. Use this to set custom headers, etc. The jqXHR and settings objects are passed as arguments. This is an Ajax Event. Returning false in the beforeSend function will cancel the request. As of jQuery 1.5, the beforeSend option will be called regardless of the type of request.
    */
  var beforeSend: js.UndefOr[
    js.ThisFunction2[/* this */ TContext, /* jqXHR */ jqXHR[_], /* settings */ this.type, `false` | Unit]
  ] = js.undefined
  /**
    * If set to false, it will force requested pages not to be cached by the browser. Note: Setting cache to false will only work correctly with HEAD and GET requests. It works by appending "_={timestamp}" to the GET parameters. The parameter is not needed for other types of requests, except in IE8 when a POST is made to a URL that has already been requested by a GET.
    */
  var cache: js.UndefOr[Boolean] = js.undefined
  /**
    * A function to be called when the request finishes (after success and error callbacks are executed). The function gets passed two arguments: The jqXHR (in jQuery 1.4.x, XMLHTTPRequest) object and a string categorizing the status of the request ("success", "notmodified", "nocontent", "error", "timeout", "abort", or "parsererror"). As of jQuery 1.5, the complete setting can accept an array of functions. Each function will be called in turn. This is an Ajax Event.
    */
  var complete: js.UndefOr[TypeOrArray[CompleteCallback[TContext]]] = js.undefined
  /**
    * When sending data to the server, use this content type. Default is "application/x-www-form-urlencoded; charset=UTF-8", which is fine for most cases. If you explicitly pass in a content-type to $.ajax(), then it is always sent to the server (even if no data is sent). As of jQuery 1.6 you can pass false to tell jQuery to not set any content type header. Note: The W3C XMLHttpRequest specification dictates that the charset is always UTF-8; specifying another charset will not force the browser to change the encoding. Note: For cross-domain requests, setting the content type to anything other than application/x-www-form-urlencoded, multipart/form-data, or text/plain will trigger the browser to send a preflight OPTIONS request to the server.
    */
  var contentType: js.UndefOr[String | `false`] = js.undefined
  /**
    * An object of string/regular-expression pairs that determine how jQuery will parse the response, given its content type.
    */
  var contents: js.UndefOr[PlainObject[RegExp]] = js.undefined
  /**
    * This object will be the context of all Ajax-related callbacks. By default, the context is an object that represents the Ajax settings used in the call ($.ajaxSettings merged with the settings passed to $.ajax).
    */
  var context: js.UndefOr[TContext] = js.undefined
  /**
    * An object containing dataType-to-dataType converters. Each converter's value is a function that returns the transformed value of the response.
    */
  var converters: js.UndefOr[PlainObject[(js.Function1[/* value */ _, _]) | `true`]] = js.undefined
  /**
    * If you wish to force a crossDomain request (such as JSONP) on the same domain, set the value of crossDomain to true. This allows, for example, server-side redirection to another domain.
    */
  var crossDomain: js.UndefOr[Boolean] = js.undefined
  /**
    * Data to be sent to the server. It is converted to a query string, if not already a string. It's appended to the url for GET-requests. See processData option to prevent this automatic processing. Object must be Key/Value pairs. If value is an Array, jQuery serializes multiple values with same key based on the value of the traditional setting (described below).
    */
  var data: js.UndefOr[PlainObject[_] | String] = js.undefined
  /**
    * A function to be used to handle the raw response data of XMLHttpRequest. This is a pre-filtering function to sanitize the response. You should return the sanitized data. The function accepts two arguments: The raw data returned from the server and the 'dataType' parameter.
    */
  var dataFilter: js.UndefOr[js.Function2[/* data */ String, /* type */ String, _]] = js.undefined
  /**
    * The type of data that you're expecting back from the server. If none is specified, jQuery will try to infer it based on the MIME type of the response (an XML MIME type will yield XML, in 1.4 JSON will yield a JavaScript object, in 1.4 script will execute the script, and anything else will be returned as a string). The available types (and the result passed as the first argument to your success callback) are:
    *
    * "xml": Returns a XML document that can be processed via jQuery.
    *
    * "html": Returns HTML as plain text; included script tags are evaluated when inserted in the DOM.
    *
    * "script": Evaluates the response as JavaScript and returns it as plain text. Disables caching by appending a query string parameter, _=[TIMESTAMP], to the URL unless the cache option is set to true. Note: This will turn POSTs into GETs for remote-domain requests.
    *
    * "json": Evaluates the response as JSON and returns a JavaScript object. Cross-domain "json" requests are converted to "jsonp" unless the request includes jsonp: false in its request options. The JSON data is parsed in a strict manner; any malformed JSON is rejected and a parse error is thrown. As of jQuery 1.9, an empty response is also rejected; the server should return a response of null or {} instead. (See json.org for more information on proper JSON formatting.)
    *
    * "jsonp": Loads in a JSON block using JSONP. Adds an extra "?callback=?" to the end of your URL to specify the callback. Disables caching by appending a query string parameter, "_=[TIMESTAMP]", to the URL unless the cache option is set to true.
    *
    * "text": A plain text string.
    *
    * multiple, space-separated values: As of jQuery 1.5, jQuery can convert a dataType from what it received in the Content-Type header to what you require. For example, if you want a text response to be treated as XML, use "text xml" for the dataType. You can also make a JSONP request, have it received as text, and interpreted by jQuery as XML: "jsonp text xml". Similarly, a shorthand string such as "jsonp xml" will first attempt to convert from jsonp to xml, and, failing that, convert from jsonp to text, and then from text to xml.
    */
  var dataType: js.UndefOr[xml | html_ | script | json_ | jsonp | text | String] = js.undefined
  /**
    * A function to be called if the request fails. The function receives three arguments: The jqXHR (in jQuery 1.4.x, XMLHttpRequest) object, a string describing the type of error that occurred and an optional exception object, if one occurred. Possible values for the second argument (besides null) are "timeout", "error", "abort", and "parsererror". When an HTTP error occurs, errorThrown receives the textual portion of the HTTP status, such as "Not Found" or "Internal Server Error." As of jQuery 1.5, the error setting can accept an array of functions. Each function will be called in turn. Note: This handler is not called for cross-domain script and cross-domain JSONP requests. This is an Ajax Event.
    */
  var error: js.UndefOr[TypeOrArray[ErrorCallback[TContext]]] = js.undefined
  /**
    * Whether to trigger global Ajax event handlers for this request. The default is true. Set to false to prevent the global handlers like ajaxStart or ajaxStop from being triggered. This can be used to control various Ajax Events.
    */
  var global: js.UndefOr[Boolean] = js.undefined
  /**
    * An object of additional header key/value pairs to send along with requests using the XMLHttpRequest transport. The header X-Requested-With: XMLHttpRequest is always added, but its default XMLHttpRequest value can be changed here. Values in the headers setting can also be overwritten from within the beforeSend function.
    */
  var headers: js.UndefOr[PlainObject[js.UndefOr[String | Null]]] = js.undefined
  /**
    * Allow the request to be successful only if the response has changed since the last request. This is done by checking the Last-Modified header. Default value is false, ignoring the header. In jQuery 1.4 this technique also checks the 'etag' specified by the server to catch unmodified data.
    */
  var ifModified: js.UndefOr[Boolean] = js.undefined
  /**
    * Allow the current environment to be recognized as "local," (e.g. the filesystem), even if jQuery does not recognize it as such by default. The following protocols are currently recognized as local: file, *-extension, and widget. If the isLocal setting needs modification, it is recommended to do so once in the $.ajaxSetup() method.
    */
  var isLocal: js.UndefOr[Boolean] = js.undefined
  /**
    * Override the callback function name in a JSONP request. This value will be used instead of 'callback' in the 'callback=?' part of the query string in the url. So {jsonp:'onJSONPLoad'} would result in 'onJSONPLoad=?' passed to the server. As of jQuery 1.5, setting the jsonp option to false prevents jQuery from adding the "?callback" string to the URL or attempting to use "=?" for transformation. In this case, you should also explicitly set the jsonpCallback setting. For example, { jsonp: false, jsonpCallback: "callbackName" }. If you don't trust the target of your Ajax requests, consider setting the jsonp property to false for security reasons.
    */
  var jsonp: js.UndefOr[String | `false`] = js.undefined
  /**
    * Specify the callback function name for a JSONP request. This value will be used instead of the random name automatically generated by jQuery. It is preferable to let jQuery generate a unique name as it'll make it easier to manage the requests and provide callbacks and error handling. You may want to specify the callback when you want to enable better browser caching of GET requests. As of jQuery 1.5, you can also use a function for this setting, in which case the value of jsonpCallback is set to the return value of that function.
    */
  var jsonpCallback: js.UndefOr[String | (js.ThisFunction0[/* this */ TContext, String])] = js.undefined
  /**
    * The HTTP method to use for the request (e.g. "POST", "GET", "PUT").
    */
  var method: js.UndefOr[String] = js.undefined
  /**
    * A mime type to override the XHR mime type.
    */
  var mimeType: js.UndefOr[String] = js.undefined
  /**
    * A password to be used with XMLHttpRequest in response to an HTTP access authentication request.
    */
  var password: js.UndefOr[String] = js.undefined
  /**
    * By default, data passed in to the data option as an object (technically, anything other than a string) will be processed and transformed into a query string, fitting to the default content-type "application/x-www-form-urlencoded". If you want to send a DOMDocument, or other non-processed data, set this option to false.
    */
  var processData: js.UndefOr[Boolean] = js.undefined
  /**
    * Only applies when the "script" transport is used (e.g., cross-domain requests with "jsonp" or "script" dataType and "GET" type). Sets the charset attribute on the script tag used in the request. Used when the character set on the local page is not the same as the one on the remote script.
    */
  var scriptCharset: js.UndefOr[String] = js.undefined
  /**
    * An object of numeric HTTP codes and functions to be called when the response has the corresponding code.
    *
    * If the request is successful, the status code functions take the same parameters as the success callback; if it results in an error (including 3xx redirect), they take the same parameters as the error callback.
    */
  var statusCode: js.UndefOr[StatusCodeCallbacks[TContext]] = js.undefined
  /**
    * A function to be called if the request succeeds. The function gets passed three arguments: The data returned from the server, formatted according to the dataType parameter or the dataFilter callback function, if specified; a string describing the status; and the jqXHR (in jQuery 1.4.x, XMLHttpRequest) object. As of jQuery 1.5, the success setting can accept an array of functions. Each function will be called in turn. This is an Ajax Event.
    */
  var success: js.UndefOr[TypeOrArray[SuccessCallback[TContext]]] = js.undefined
  /**
    * Set a timeout (in milliseconds) for the request. A value of 0 means there will be no timeout. This will override any global timeout set with $.ajaxSetup(). The timeout period starts at the point the $.ajax call is made; if several other requests are in progress and the browser has no connections available, it is possible for a request to time out before it can be sent. In jQuery 1.4.x and below, the XMLHttpRequest object will be in an invalid state if the request times out; accessing any object members may throw an exception. In Firefox 3.0+ only, script and JSONP requests cannot be cancelled by a timeout; the script will run even if it arrives after the timeout period.
    */
  var timeout: js.UndefOr[Double] = js.undefined
  /**
    * Set this to true if you wish to use the traditional style of param serialization.
    */
  var traditional: js.UndefOr[Boolean] = js.undefined
  /**
    * An alias for method. You should use type if you're using versions of jQuery prior to 1.9.0.
    */
  var `type`: js.UndefOr[String] = js.undefined
  /**
    * A username to be used with XMLHttpRequest in response to an HTTP access authentication request.
    */
  var username: js.UndefOr[String] = js.undefined
  // ActiveXObject requires "lib": ["scripthost"] which consumers would also require
  /**
    * Callback for creating the XMLHttpRequest object. Defaults to the ActiveXObject when available (IE), the XMLHttpRequest otherwise. Override to provide your own implementation for XMLHttpRequest or enhancements to the factory.
    */
  var xhr: js.UndefOr[js.Function0[XMLHttpRequest]] = js.undefined
  /**
    * An object of fieldName-fieldValue pairs to set on the native XHR object.
    *
    * In jQuery 1.5, the withCredentials property was not propagated to the native XHR and thus CORS requests requiring it would ignore this flag. For this reason, we recommend using jQuery 1.5.1+ should you require the use of it.
    */
  var xhrFields: js.UndefOr[XHRFields] = js.undefined
}

object AjaxSettingsBase {
  @scala.inline
  def apply[TContext](
    accepts: PlainObject[String] = null,
    async: js.UndefOr[Boolean] = js.undefined,
    beforeSend: js.ThisFunction2[/* this */ TContext, /* jqXHR */ jqXHR[_], AjaxSettingsBase[TContext], `false` | Unit] = null,
    cache: js.UndefOr[Boolean] = js.undefined,
    complete: TypeOrArray[CompleteCallback[TContext]] = null,
    contentType: String | `false` = null,
    contents: PlainObject[RegExp] = null,
    context: TContext = null,
    converters: PlainObject[(js.Function1[/* value */ _, _]) | `true`] = null,
    crossDomain: js.UndefOr[Boolean] = js.undefined,
    data: PlainObject[_] | String = null,
    dataFilter: (/* data */ String, /* type */ String) => _ = null,
    dataType: xml | html_ | script | json_ | jsonp | text | String = null,
    error: TypeOrArray[ErrorCallback[TContext]] = null,
    global: js.UndefOr[Boolean] = js.undefined,
    headers: PlainObject[js.UndefOr[String | Null]] = null,
    ifModified: js.UndefOr[Boolean] = js.undefined,
    isLocal: js.UndefOr[Boolean] = js.undefined,
    jsonp: String | `false` = null,
    jsonpCallback: String | (js.ThisFunction0[/* this */ TContext, String]) = null,
    method: String = null,
    mimeType: String = null,
    password: String = null,
    processData: js.UndefOr[Boolean] = js.undefined,
    scriptCharset: String = null,
    statusCode: StatusCodeCallbacks[TContext] = null,
    success: TypeOrArray[SuccessCallback[TContext]] = null,
    timeout: Int | Double = null,
    traditional: js.UndefOr[Boolean] = js.undefined,
    `type`: String = null,
    username: String = null,
    xhr: () => XMLHttpRequest = null,
    xhrFields: XHRFields = null
  ): AjaxSettingsBase[TContext] = {
    val __obj = js.Dynamic.literal()
    if (accepts != null) __obj.updateDynamic("accepts")(accepts.asInstanceOf[js.Any])
    if (!js.isUndefined(async)) __obj.updateDynamic("async")(async.asInstanceOf[js.Any])
    if (beforeSend != null) __obj.updateDynamic("beforeSend")(beforeSend.asInstanceOf[js.Any])
    if (!js.isUndefined(cache)) __obj.updateDynamic("cache")(cache.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(complete.asInstanceOf[js.Any])
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    if (contents != null) __obj.updateDynamic("contents")(contents.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (converters != null) __obj.updateDynamic("converters")(converters.asInstanceOf[js.Any])
    if (!js.isUndefined(crossDomain)) __obj.updateDynamic("crossDomain")(crossDomain.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (dataFilter != null) __obj.updateDynamic("dataFilter")(js.Any.fromFunction2(dataFilter))
    if (dataType != null) __obj.updateDynamic("dataType")(dataType.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (!js.isUndefined(global)) __obj.updateDynamic("global")(global.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (!js.isUndefined(ifModified)) __obj.updateDynamic("ifModified")(ifModified.asInstanceOf[js.Any])
    if (!js.isUndefined(isLocal)) __obj.updateDynamic("isLocal")(isLocal.asInstanceOf[js.Any])
    if (jsonp != null) __obj.updateDynamic("jsonp")(jsonp.asInstanceOf[js.Any])
    if (jsonpCallback != null) __obj.updateDynamic("jsonpCallback")(jsonpCallback.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (mimeType != null) __obj.updateDynamic("mimeType")(mimeType.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (!js.isUndefined(processData)) __obj.updateDynamic("processData")(processData.asInstanceOf[js.Any])
    if (scriptCharset != null) __obj.updateDynamic("scriptCharset")(scriptCharset.asInstanceOf[js.Any])
    if (statusCode != null) __obj.updateDynamic("statusCode")(statusCode.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(success.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (!js.isUndefined(traditional)) __obj.updateDynamic("traditional")(traditional.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    if (xhr != null) __obj.updateDynamic("xhr")(js.Any.fromFunction0(xhr))
    if (xhrFields != null) __obj.updateDynamic("xhrFields")(xhrFields.asInstanceOf[js.Any])
    __obj.asInstanceOf[AjaxSettingsBase[TContext]]
  }
}

