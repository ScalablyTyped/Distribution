package typings
package cypressLib.typesSinonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SinonFakeXMLHttpRequest extends js.Object {
  /**
    * Whether or not the request is asynchronous.
    */
  var async: scala.Boolean
  /**
    * The request method as a string.
    */
  var method: java.lang.String
  /**
    * Password, if any.
    */
  var password: java.lang.String
  /**
    * The request body
    */
  var requestBody: java.lang.String
  /**
    * An object of all request headers, i.e.:
    */
  var requestHeaders: js.Any
  /**
    * When using respond, this property is populated with a parsed document if response headers indicate as much (see the spec)
    */
  var responseXML: Document
  /**
    * The request’s status code.
    * undefined if the request has not been handled (see respond below)
    */
  var status: scala.Double
  /**
    * Only populated if the respond method is called (see below).
    */
  var statusText: java.lang.String
  var upload: SinonFakeUploadProgress
  // Properties
  /**
    * The URL set on the request object.
    */
  var url: java.lang.String
  /**
    * Username, if any.
    */
  var username: java.lang.String
  var withCredentials: scala.Boolean
  def autoRespond(ms: scala.Double): scala.Unit
  /**
    * Simulates a network error on the request. The onerror handler will be called and the status will be 0.
    */
  def error(): scala.Unit
  /**
    * All response headers as an object.
    */
  def getAllResponseHeaders(): js.Any
  /**
    * The value of the given response header, if the request has been responded to (see respond).
    * @param header
    */
  def getResponseHeader(header: java.lang.String): java.lang.String
  def onerror(): scala.Unit
  /**
    * Calls the above three methods.
    */
  def respond(status: scala.Double, headers: js.Any, body: java.lang.String): scala.Unit
  /**
    * Sets the respond body, updates the readyState property and fires onreadystatechange.
    * Additionally, populates responseXML with a parsed document if response headers indicate as much.
    */
  def setResponseBody(body: java.lang.String): scala.Unit
  // Methods
  /**
    * Sets response headers (e.g. { "Content-Type": "text/html", ... }, updates the readyState property and fires onreadystatechange.
    * @param headers
    */
  def setResponseHeaders(headers: js.Any): scala.Unit
}

object SinonFakeXMLHttpRequest {
  @scala.inline
  def apply(
    async: scala.Boolean,
    autoRespond: scala.Double => scala.Unit,
    error: () => scala.Unit,
    getAllResponseHeaders: () => js.Any,
    getResponseHeader: java.lang.String => java.lang.String,
    method: java.lang.String,
    onerror: () => scala.Unit,
    password: java.lang.String,
    requestBody: java.lang.String,
    requestHeaders: js.Any,
    respond: (scala.Double, js.Any, java.lang.String) => scala.Unit,
    responseXML: Document,
    setResponseBody: java.lang.String => scala.Unit,
    setResponseHeaders: js.Any => scala.Unit,
    status: scala.Double,
    statusText: java.lang.String,
    upload: SinonFakeUploadProgress,
    url: java.lang.String,
    username: java.lang.String,
    withCredentials: scala.Boolean
  ): SinonFakeXMLHttpRequest = {
    val __obj = js.Dynamic.literal(async = async, autoRespond = js.Any.fromFunction1(autoRespond), error = js.Any.fromFunction0(error), getAllResponseHeaders = js.Any.fromFunction0(getAllResponseHeaders), getResponseHeader = js.Any.fromFunction1(getResponseHeader), method = method, onerror = js.Any.fromFunction0(onerror), password = password, requestBody = requestBody, requestHeaders = requestHeaders, respond = js.Any.fromFunction3(respond), responseXML = responseXML, setResponseBody = js.Any.fromFunction1(setResponseBody), setResponseHeaders = js.Any.fromFunction1(setResponseHeaders), status = status, statusText = statusText, upload = upload, url = url, username = username, withCredentials = withCredentials)
  
    __obj.asInstanceOf[SinonFakeXMLHttpRequest]
  }
}

