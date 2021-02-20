package typings.cloudeventsSdk

import org.scalablytyped.runtime.Instantiable1
import typings.cloudeventsSdk.anon.UrlURL
import typings.cloudeventsSdk.cloudeventMod.CE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object emitterStructuredMod {
  
  /**
    * A class for sending {CloudEvent} instances over HTTP.
    */
  @JSImport("cloudevents-sdk/lib/bindings/http/emitter_structured", JSImport.Namespace)
  @js.native
  class ^ () extends StructuredHTTPEmitter
  
  @js.native
  trait CloudEvent extends StObject {
    
    var CloudEvent: Instantiable1[/* event */ CE, typings.cloudeventsSdk.cloudeventMod.CloudEvent] = js.native
  }
  object CloudEvent {
    
    @scala.inline
    def apply(CloudEvent: Instantiable1[/* event */ CE, typings.cloudeventsSdk.cloudeventMod.CloudEvent]): CloudEvent = {
      val __obj = js.Dynamic.literal(CloudEvent = CloudEvent.asInstanceOf[js.Any])
      __obj.asInstanceOf[CloudEvent]
    }
    
    @scala.inline
    implicit class CloudEventMutableBuilder[Self <: CloudEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCloudEvent(value: Instantiable1[/* event */ CE, typings.cloudeventsSdk.cloudeventMod.CloudEvent]): Self = StObject.set(x, "CloudEvent", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * A class for sending {CloudEvent} instances over HTTP.
    */
  @js.native
  trait StructuredHTTPEmitter extends StObject {
    
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
    implicit class StructuredHTTPEmitterMutableBuilder[Self <: StructuredHTTPEmitter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEmit(value: (UrlURL, CloudEvent) => js.Promise[_]): Self = StObject.set(x, "emit", js.Any.fromFunction2(value))
    }
  }
}
