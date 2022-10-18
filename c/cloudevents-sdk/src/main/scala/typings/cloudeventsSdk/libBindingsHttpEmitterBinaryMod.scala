package typings.cloudeventsSdk

import typings.cloudeventsSdk.anon.UrlURL
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libBindingsHttpEmitterBinaryMod {
  
  /**
    * A class to emit binary CloudEvents over HTTP.
    */
  @JSImport("cloudevents-sdk/lib/bindings/http/emitter_binary", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with BinaryHTTPEmitter {
    /**
      * Create a new {BinaryHTTPEmitter} for the provided CloudEvent specification version.
      * Once an instance is created for a given spec version, it may only be used to send
      * events for that version.
      * Default version is 1.0
      * @param {string} version - the CloudEvent HTTP specification version.
      * Default: 1.0
      */
    def this(version: String) = this()
    
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
    /* CompleteClass */
    override def emit(options: UrlURL, cloudevent: js.Object): js.Promise[Any] = js.native
    
    /* CompleteClass */
    var extensionPrefix: Any = js.native
    
    /* CompleteClass */
    var headerParserMap: Map[Any, Any] = js.native
  }
  
  /**
    * A class to emit binary CloudEvents over HTTP.
    */
  trait BinaryHTTPEmitter extends StObject {
    
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
    def emit(options: UrlURL, cloudevent: js.Object): js.Promise[Any]
    
    var extensionPrefix: Any
    
    var headerParserMap: Map[Any, Any]
  }
  object BinaryHTTPEmitter {
    
    inline def apply(emit: (UrlURL, js.Object) => js.Promise[Any], extensionPrefix: Any, headerParserMap: Map[Any, Any]): BinaryHTTPEmitter = {
      val __obj = js.Dynamic.literal(emit = js.Any.fromFunction2(emit), extensionPrefix = extensionPrefix.asInstanceOf[js.Any], headerParserMap = headerParserMap.asInstanceOf[js.Any])
      __obj.asInstanceOf[BinaryHTTPEmitter]
    }
    
    extension [Self <: BinaryHTTPEmitter](x: Self) {
      
      inline def setEmit(value: (UrlURL, js.Object) => js.Promise[Any]): Self = StObject.set(x, "emit", js.Any.fromFunction2(value))
      
      inline def setExtensionPrefix(value: Any): Self = StObject.set(x, "extensionPrefix", value.asInstanceOf[js.Any])
      
      inline def setHeaderParserMap(value: Map[Any, Any]): Self = StObject.set(x, "headerParserMap", value.asInstanceOf[js.Any])
    }
  }
}
