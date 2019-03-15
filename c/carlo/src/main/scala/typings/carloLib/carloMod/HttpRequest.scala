package typings
package carloLib.carloMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpRequest extends js.Object {
  /**
    * Aborts request.
    * If request is a navigation request, navigation is aborted as well.
    */
  def abort(): js.Promise[scala.Unit]
  /**
    * Proceeds with the default behavior for this request.
    * Either serves it from the filesystem or defers to the browser.
    */
  def continue(): js.Promise[scala.Unit]
  /**
    * Marks the request as failed.
    * If request is a navigation request, navigation is still committed, but to a location that fails to be fetched.
    */
  def fail(): js.Promise[scala.Unit]
  /**
    * Fulfills the network request with the given data. 'Content-Length' header is generated in case it is not listed in the headers.
    */
  def fulfill(options: carloLib.Anon_Body): js.Promise[scala.Unit]
  /**
    * Network request headers
    */
  def headers(): js.Object
  /**
    * HTTP method of this network request (GET, POST, etc.)
    */
  def method(): java.lang.String
  /**
    * Network request URL
    */
  def url(): java.lang.String
}

object HttpRequest {
  @scala.inline
  def apply(
    abort: () => js.Promise[scala.Unit],
    continue: () => js.Promise[scala.Unit],
    fail: () => js.Promise[scala.Unit],
    fulfill: carloLib.Anon_Body => js.Promise[scala.Unit],
    headers: () => js.Object,
    method: () => java.lang.String,
    url: () => java.lang.String
  ): HttpRequest = {
    val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort), continue = js.Any.fromFunction0(continue), fail = js.Any.fromFunction0(fail), fulfill = js.Any.fromFunction1(fulfill), headers = js.Any.fromFunction0(headers), method = js.Any.fromFunction0(method), url = js.Any.fromFunction0(url))
  
    __obj.asInstanceOf[HttpRequest]
  }
}

