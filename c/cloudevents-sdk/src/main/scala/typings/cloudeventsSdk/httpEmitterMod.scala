package typings.cloudeventsSdk

import typings.cloudeventsSdk.anon.Mode
import typings.cloudeventsSdk.anon.Url
import typings.cloudeventsSdk.cloudeventMod.CloudEvent
import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object httpEmitterMod {
  
  @JSImport("cloudevents-sdk/lib/bindings/http/http_emitter", "HTTPEmitter")
  @js.native
  open class HTTPEmitter protected () extends StObject {
    /**
      * Creates a new instance of {HTTPEmitter}. The default emitter uses the 1.0
      * protocol specification in binary mode.
      *
      * @param {Object} [options] The configuration options for this event emitter
      * @param {URL} options.url The endpoint that will receive the sent events.
      * @param {string} [options.version] The HTTP binding specification version. Default: "1.0"
      * @throws {TypeError} if no options.url is provided or an unknown specification version is provided.
      */
    def this(hasUrlVersion: Url) = this()
    
    var binary: Any = js.native
    
    /**
      * Sends the {CloudEvent} to an event receiver over HTTP POST
      *
      * @param {CloudEvent} event the CloudEvent to be sent
      * @param {Object} [options] The configuration options for this event. Options
      * provided will be passed along to Node.js `http.request()`.
      * https://nodejs.org/api/http.html#http_http_request_options_callback
      * @param {URL} [options.url] The HTTP/S url that should receive this event.
      * The URL is optional if one was provided when this emitter was constructed.
      * In that case, it will be used as the recipient endpoint. The endpoint can
      * be overridden by providing a URL here.
      * @param {string} [options.mode] the message mode for sending this event.
      * Possible values are "binary" and "structured". Default: structured
      * @returns {Promise} Promise with an eventual response from the receiver
      */
    def send(event: CloudEvent): Any = js.native
    def send(event: CloudEvent, hasUrlModeHttpOpts: Mode): Any = js.native
    
    var structured: Any = js.native
    
    var url: URL | String = js.native
  }
  /* static members */
  object HTTPEmitter {
    
    @JSImport("cloudevents-sdk/lib/bindings/http/http_emitter", "HTTPEmitter")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("cloudevents-sdk/lib/bindings/http/http_emitter", "HTTPEmitter.headers")
    @js.native
    def headers: js.Function = js.native
    inline def headers_=(x: js.Function): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("headers")(x.asInstanceOf[js.Any])
  }
}
