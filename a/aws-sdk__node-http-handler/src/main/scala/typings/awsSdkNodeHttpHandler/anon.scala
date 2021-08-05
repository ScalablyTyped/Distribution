package typings.awsSdkNodeHttpHandler

import typings.awsSdkProtocolHttp.mod.HttpResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait HandlerProtocol extends StObject {
    
    var handlerProtocol: String
  }
  object HandlerProtocol {
    
    inline def apply(handlerProtocol: String): HandlerProtocol = {
      val __obj = js.Dynamic.literal(handlerProtocol = handlerProtocol.asInstanceOf[js.Any])
      __obj.asInstanceOf[HandlerProtocol]
    }
    
    extension [Self <: HandlerProtocol](x: Self) {
      
      inline def setHandlerProtocol(value: String): Self = StObject.set(x, "handlerProtocol", value.asInstanceOf[js.Any])
    }
  }
  
  trait Response extends StObject {
    
    var response: HttpResponse
  }
  object Response {
    
    inline def apply(response: HttpResponse): Response = {
      val __obj = js.Dynamic.literal(response = response.asInstanceOf[js.Any])
      __obj.asInstanceOf[Response]
    }
    
    extension [Self <: Response](x: Self) {
      
      inline def setResponse(value: HttpResponse): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    }
  }
}
