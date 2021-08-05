package typings.awsSdkEc2ErrorUnmarshaller

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Code extends StObject {
    
    var Code: String
    
    var Message: String
  }
  object Code {
    
    inline def apply(Code: String, Message: String): Code = {
      val __obj = js.Dynamic.literal(Code = Code.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any])
      __obj.asInstanceOf[Code]
    }
    
    extension [Self <: Code](x: Self) {
      
      inline def setCode(value: String): Self = StObject.set(x, "Code", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    }
  }
  
  trait Error extends StObject {
    
    var Error: Code
  }
  object Error {
    
    inline def apply(Error: Code): Error = {
      val __obj = js.Dynamic.literal(Error = Error.asInstanceOf[js.Any])
      __obj.asInstanceOf[Error]
    }
    
    extension [Self <: Error](x: Self) {
      
      inline def setError(value: Code): Self = StObject.set(x, "Error", value.asInstanceOf[js.Any])
    }
  }
  
  trait RequestId extends StObject {
    
    var requestId: String
  }
  object RequestId {
    
    inline def apply(requestId: String): RequestId = {
      val __obj = js.Dynamic.literal(requestId = requestId.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestId]
    }
    
    extension [Self <: RequestId](x: Self) {
      
      inline def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    }
  }
}
