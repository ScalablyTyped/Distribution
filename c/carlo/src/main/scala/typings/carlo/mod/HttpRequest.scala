package typings.carlo.mod

import typings.carlo.anon.Body
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HttpRequest extends js.Object {
  
  /**
    * Aborts request.
    * If request is a navigation request, navigation is aborted as well.
    */
  def abort(): js.Promise[Unit] = js.native
  
  /**
    * Proceeds with the default behavior for this request.
    * Either serves it from the filesystem or defers to the browser.
    */
  def continue(): js.Promise[Unit] = js.native
  
  /**
    * Marks the request as failed.
    * If request is a navigation request, navigation is still committed, but to a location that fails to be fetched.
    */
  def fail(): js.Promise[Unit] = js.native
  
  /**
    * Fulfills the network request with the given data. 'Content-Length' header is generated in case it is not listed in the headers.
    */
  def fulfill(options: Body): js.Promise[Unit] = js.native
  
  /**
    * Network request headers
    */
  def headers(): js.Object = js.native
  
  /**
    * HTTP method of this network request (GET, POST, etc.)
    */
  def method(): String = js.native
  
  /**
    * Network request URL
    */
  def url(): String = js.native
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
  
  @scala.inline
  implicit class HttpRequestOps[Self <: HttpRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAbort(value: () => js.Promise[Unit]): Self = this.set("abort", js.Any.fromFunction0(value))
    
    @scala.inline
    def setContinue(value: () => js.Promise[Unit]): Self = this.set("continue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFail(value: () => js.Promise[Unit]): Self = this.set("fail", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFulfill(value: Body => js.Promise[Unit]): Self = this.set("fulfill", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHeaders(value: () => js.Object): Self = this.set("headers", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMethod(value: () => String): Self = this.set("method", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUrl(value: () => String): Self = this.set("url", js.Any.fromFunction0(value))
  }
}
