package typings.awsSdkMiddlewareRetry

import typings.awsSdkTypes.distTypesResponseMod.MetadataBearer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AfterRequest extends StObject {
    
    var afterRequest: js.Function
    
    var beforeRequest: js.Function
  }
  object AfterRequest {
    
    inline def apply(afterRequest: js.Function, beforeRequest: js.Function): AfterRequest = {
      val __obj = js.Dynamic.literal(afterRequest = afterRequest.asInstanceOf[js.Any], beforeRequest = beforeRequest.asInstanceOf[js.Any])
      __obj.asInstanceOf[AfterRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AfterRequest] (val x: Self) extends AnyVal {
      
      inline def setAfterRequest(value: js.Function): Self = StObject.set(x, "afterRequest", value.asInstanceOf[js.Any])
      
      inline def setBeforeRequest(value: js.Function): Self = StObject.set(x, "beforeRequest", value.asInstanceOf[js.Any])
    }
  }
  
  trait Output[Ouput /* <: MetadataBearer */] extends StObject {
    
    var output: Ouput
    
    var response: Any
  }
  object Output {
    
    inline def apply[Ouput /* <: MetadataBearer */](output: Ouput, response: Any): Output[Ouput] = {
      val __obj = js.Dynamic.literal(output = output.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
      __obj.asInstanceOf[Output[Ouput]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Output[?], Ouput /* <: MetadataBearer */] (val x: Self & Output[Ouput]) extends AnyVal {
      
      inline def setOutput(value: Ouput): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      inline def setResponse(value: Any): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    }
  }
}
