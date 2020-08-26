package typings.cloudeventsSdk.emitterStructuredMod

import typings.cloudeventsSdk.anon.UrlURL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A class for sending {CloudEvent} instances over HTTP.
  */
@js.native
trait StructuredHTTPEmitter extends js.Object {
  /**
    * Sends the event over HTTP
    * @param {Object} options The configuration options for this event. Options
    * provided will be passed along to Node.js `http.request()`.
    * https://nodejs.org/api/http.html#http_http_request_options_callback
    * @param {URL} options.url The HTTP/S url that should receive this event
    * @param {CloudEvent} cloudevent The CloudEvent to be sent
    * @returns {Promise} Promise with an eventual response from the receiver
    */
  def emit(options: UrlURL, cloudevent: CloudEvent): js.Promise[_] = js.native
}

object StructuredHTTPEmitter {
  @scala.inline
  def apply(emit: (UrlURL, CloudEvent) => js.Promise[_]): StructuredHTTPEmitter = {
    val __obj = js.Dynamic.literal(emit = js.Any.fromFunction2(emit))
    __obj.asInstanceOf[StructuredHTTPEmitter]
  }
  @scala.inline
  implicit class StructuredHTTPEmitterOps[Self <: StructuredHTTPEmitter] (val x: Self) extends AnyVal {
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
    def setEmit(value: (UrlURL, CloudEvent) => js.Promise[_]): Self = this.set("emit", js.Any.fromFunction2(value))
  }
  
}

