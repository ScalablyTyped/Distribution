package typings.cloudeventsSdk.emitterBinaryMod

import typings.cloudeventsSdk.anon.UrlURL
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A class to emit binary CloudEvents over HTTP.
  */
@js.native
trait BinaryHTTPEmitter extends js.Object {
  
  /**
    * Sends this cloud event to a receiver over HTTP.
    *
    * @param {Object} options The configuration options for this event. Options
    * provided other than `url` will be passed along to Node.js `http.request`.
    * https://nodejs.org/api/http.html#http_http_request_options_callback
    * @param {URL} options.url The HTTP/S url that should receive this event
    * @param {Object} cloudevent the CloudEvent to be sent
    * @returns {Promise} Promise with an eventual response from the receiver
    */
  def emit(options: UrlURL, cloudevent: js.Object): js.Promise[_] = js.native
  
  var extensionPrefix: js.Any = js.native
  
  var headerParserMap: Map[_, _] = js.native
}
object BinaryHTTPEmitter {
  
  @scala.inline
  def apply(emit: (UrlURL, js.Object) => js.Promise[_], extensionPrefix: js.Any, headerParserMap: Map[_, _]): BinaryHTTPEmitter = {
    val __obj = js.Dynamic.literal(emit = js.Any.fromFunction2(emit), extensionPrefix = extensionPrefix.asInstanceOf[js.Any], headerParserMap = headerParserMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[BinaryHTTPEmitter]
  }
  
  @scala.inline
  implicit class BinaryHTTPEmitterOps[Self <: BinaryHTTPEmitter] (val x: Self) extends AnyVal {
    
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
    def setEmit(value: (UrlURL, js.Object) => js.Promise[_]): Self = this.set("emit", js.Any.fromFunction2(value))
    
    @scala.inline
    def setExtensionPrefix(value: js.Any): Self = this.set("extensionPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderParserMap(value: Map[_, _]): Self = this.set("headerParserMap", value.asInstanceOf[js.Any])
  }
}
