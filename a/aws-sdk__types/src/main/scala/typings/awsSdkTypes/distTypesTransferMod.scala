package typings.awsSdkTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTransferMod {
  
  @js.native
  trait RequestHandler[RequestType, ResponseType, HandlerOptions] extends StObject {
    
    var destroy: js.UndefOr[js.Function0[Unit]] = js.native
    
    def handle(request: RequestType): js.Promise[RequestHandlerOutput[ResponseType]] = js.native
    def handle(request: RequestType, handlerOptions: HandlerOptions): js.Promise[RequestHandlerOutput[ResponseType]] = js.native
    
    /**
      * metadata contains information of a handler. For example
      * 'h2' refers this handler is for handling HTTP/2 requests,
      * whereas 'h1' refers handling HTTP1 requests
      */
    var metadata: js.UndefOr[RequestHandlerMetadata] = js.native
  }
  
  trait RequestHandlerMetadata extends StObject {
    
    var handlerProtocol: String
  }
  object RequestHandlerMetadata {
    
    inline def apply(handlerProtocol: String): RequestHandlerMetadata = {
      val __obj = js.Dynamic.literal(handlerProtocol = handlerProtocol.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestHandlerMetadata]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RequestHandlerMetadata] (val x: Self) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RequestHandlerOutput[?], ResponseType] (val x: Self & RequestHandlerOutput[ResponseType]) extends AnyVal {
      
      inline def setResponse(value: ResponseType): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    }
  }
}
