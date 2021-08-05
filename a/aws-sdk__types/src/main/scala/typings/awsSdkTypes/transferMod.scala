package typings.awsSdkTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transferMod {
  
  trait RequestHandler[RequestType, ResponseType, HandlerOptions] extends StObject {
    
    var destroy: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    def handle(request: RequestType, handlerOptions: HandlerOptions): js.Promise[RequestHandlerOutput[ResponseType]]
    
    /**
      * metadata contains information of a handler. For example
      * 'h2' refers this handler is for handling HTTP/2 requests,
      * whereas 'h1' refers handling HTTP1 requests
      */
    var metadata: js.UndefOr[RequestHandlerMetadata] = js.undefined
  }
  object RequestHandler {
    
    inline def apply[RequestType, ResponseType, HandlerOptions](handle: (RequestType, HandlerOptions) => js.Promise[RequestHandlerOutput[ResponseType]]): RequestHandler[RequestType, ResponseType, HandlerOptions] = {
      val __obj = js.Dynamic.literal(handle = js.Any.fromFunction2(handle))
      __obj.asInstanceOf[RequestHandler[RequestType, ResponseType, HandlerOptions]]
    }
    
    extension [Self <: RequestHandler[?, ?, ?], RequestType, ResponseType, HandlerOptions](x: Self & (RequestHandler[RequestType, ResponseType, HandlerOptions])) {
      
      inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      inline def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
      
      inline def setHandle(value: (RequestType, HandlerOptions) => js.Promise[RequestHandlerOutput[ResponseType]]): Self = StObject.set(x, "handle", js.Any.fromFunction2(value))
      
      inline def setMetadata(value: RequestHandlerMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    }
  }
  
  trait RequestHandlerMetadata extends StObject {
    
    var handlerProtocol: String
  }
  object RequestHandlerMetadata {
    
    inline def apply(handlerProtocol: String): RequestHandlerMetadata = {
      val __obj = js.Dynamic.literal(handlerProtocol = handlerProtocol.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestHandlerMetadata]
    }
    
    extension [Self <: RequestHandlerMetadata](x: Self) {
      
      inline def setHandlerProtocol(value: String): Self = StObject.set(x, "handlerProtocol", value.asInstanceOf[js.Any])
    }
  }
  
  trait RequestHandlerOutput[ResponseType] extends StObject {
    
    var response: ResponseType
  }
  object RequestHandlerOutput {
    
    inline def apply[ResponseType](response: ResponseType): RequestHandlerOutput[ResponseType] = {
      val __obj = js.Dynamic.literal(response = response.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestHandlerOutput[ResponseType]]
    }
    
    extension [Self <: RequestHandlerOutput[?], ResponseType](x: Self & RequestHandlerOutput[ResponseType]) {
      
      inline def setResponse(value: ResponseType): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    }
  }
}
