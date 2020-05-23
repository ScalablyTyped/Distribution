package typings.cypress.sinonMod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SinonFakeServer extends SinonFakeServerOptions {
  /**
    * You can inspect the server.requests to verify request ordering, find unmatched requests or check that no requests has been done.
    * server.requests is an array of all the FakeXMLHttpRequest objects that have been created.
    */
  var requests: js.Array[SinonFakeXMLHttpRequest] = js.native
  // Properties
  /**
    * Used internally to determine the HTTP method used with the provided request.
    * By default this method simply returns request.method.
    * When server.fakeHTTPMethods is true, the method will return the value of the _method parameter if the method is “POST”.
    * This method can be overridden to provide custom behavior.
    * @param request
    */
  def getHTTPMethod(request: SinonFakeXMLHttpRequest): String = js.native
  /**
    * Causes all queued asynchronous requests to receive a response.
    * If none of the responses added through respondWith match, the default response is [404, {}, ""].
    * Synchronous requests are responded to immediately, so make sure to call respondWith upfront.
    * If called with arguments, respondWith will be called with those arguments before responding to requests.
    */
  def respond(): Unit = js.native
  // Methods
  /**
    * Causes the server to respond to any request not matched by another response with the provided data. The default catch-all response is [404, {}, ""].
    * A String representing the response body
    * An Array with status, headers and response body, e.g. [200, { "Content-Type": "text/html", "Content-Length": 2 }, "OK"]
    * A Function.
    * Default status is 200 and default headers are none.
    * When the response is a Function, it will be passed the request object. You must manually call respond on it to complete the request.
    * @param body A String representing the response body
    */
  def respondWith(body: String): Unit = js.native
  /**
    * Causes the server to respond to any request not matched by another response with the provided data. The default catch-all response is [404, {}, ""].
    * Default status is 200 and default headers are none.
    * When the response is a Function, it will be passed the request object. You must manually call respond on it to complete the request.
    * @param fn A Function.
    */
  def respondWith(fn: js.Function1[/* xhr */ SinonFakeXMLHttpRequest, Unit]): Unit = js.native
  /**
    * Responds to all method requests to the given URL with the given response.
    * method is an HTTP verb.
    */
  def respondWith(method: String, url: String, body: String): Unit = js.native
  /**
    * Responds to all method requests to the given URL with the given response.
    * method is an HTTP verb.
    */
  def respondWith(method: String, url: String, fn: js.Function1[/* xhr */ SinonFakeXMLHttpRequest, Unit]): Unit = js.native
  /**
    * Responds to all method requests to the given URL with the given response.
    * method is an HTTP verb.
    */
  def respondWith(method: String, url: String, response: js.Array[_]): Unit = js.native
  /**
    * Responds to all method requests to URLs matching the regular expression.
    */
  def respondWith(method: String, url: RegExp, body: String): Unit = js.native
  /**
    * Responds to all method requests to URLs matching the regular expression.
    */
  def respondWith(method: String, url: RegExp, fn: js.Function1[/* xhr */ SinonFakeXMLHttpRequest, Unit]): Unit = js.native
  /**
    * Responds to all method requests to URLs matching the regular expression.
    */
  def respondWith(method: String, url: RegExp, response: js.Array[_]): Unit = js.native
  /**
    * Causes the server to respond to any request not matched by another response with the provided data. The default catch-all response is [404, {}, ""].
    * Default status is 200 and default headers are none.
    * When the response is a Function, it will be passed the request object. You must manually call respond on it to complete the request.
    * @param response An Array with status, headers and response body, e.g. [200, { "Content-Type": "text/html", "Content-Length": 2 }, "OK"]
    */
  def respondWith(response: js.Array[_]): Unit = js.native
  /**
    * Responds to all requests to given URL, e.g. /posts/1.
    */
  def respondWith(url: String, body: String): Unit = js.native
  /**
    * Responds to all requests to given URL, e.g. /posts/1.
    */
  def respondWith(url: String, fn: js.Function1[/* xhr */ SinonFakeXMLHttpRequest, Unit]): Unit = js.native
  /**
    * Responds to all requests to given URL, e.g. /posts/1.
    */
  def respondWith(url: String, response: js.Array[_]): Unit = js.native
  /**
    * URL may be a regular expression, e.g. /\\/post\\//\\d+
    * If the response is a Function, it will be passed any capture groups from the regular expression along with the XMLHttpRequest object:
    */
  def respondWith(url: RegExp, body: String): Unit = js.native
  /**
    * URL may be a regular expression, e.g. /\\/post\\//\\d+
    * If the response is a Function, it will be passed any capture groups from the regular expression along with the XMLHttpRequest object:
    */
  def respondWith(url: RegExp, fn: js.Function1[/* xhr */ SinonFakeXMLHttpRequest, Unit]): Unit = js.native
  /**
    * URL may be a regular expression, e.g. /\\/post\\//\\d+
    * If the response is a Function, it will be passed any capture groups from the regular expression along with the XMLHttpRequest object:
    */
  def respondWith(url: RegExp, response: js.Array[_]): Unit = js.native
  def restore(): Unit = js.native
}

