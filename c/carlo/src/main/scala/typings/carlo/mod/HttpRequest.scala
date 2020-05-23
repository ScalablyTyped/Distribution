package typings.carlo.mod

import typings.carlo.anon.Body
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpRequest extends js.Object {
  /**
    * Aborts request.
    * If request is a navigation request, navigation is aborted as well.
    */
  def abort(): js.Promise[Unit]
  /**
    * Proceeds with the default behavior for this request.
    * Either serves it from the filesystem or defers to the browser.
    */
  def continue(): js.Promise[Unit]
  /**
    * Marks the request as failed.
    * If request is a navigation request, navigation is still committed, but to a location that fails to be fetched.
    */
  def fail(): js.Promise[Unit]
  /**
    * Fulfills the network request with the given data. 'Content-Length' header is generated in case it is not listed in the headers.
    */
  def fulfill(options: Body): js.Promise[Unit]
  /**
    * Network request headers
    */
  def headers(): js.Object
  /**
    * HTTP method of this network request (GET, POST, etc.)
    */
  def method(): String
  /**
    * Network request URL
    */
  def url(): String
}

object HttpRequest {
  @scala.inline
  def apply(
    abort: () => js.Promise[Unit],
    continue: () => js.Promise[Unit],
    fail: () => js.Promise[Unit],
    fulfill: Body => js.Promise[Unit],
    headers: () => js.Object,
    method: () => String,
    url: () => String
  ): HttpRequest = {
    val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort), continue = js.Any.fromFunction0(continue), fail = js.Any.fromFunction0(fail), fulfill = js.Any.fromFunction1(fulfill), headers = js.Any.fromFunction0(headers), method = js.Any.fromFunction0(method), url = js.Any.fromFunction0(url))
    __obj.asInstanceOf[HttpRequest]
  }
}

