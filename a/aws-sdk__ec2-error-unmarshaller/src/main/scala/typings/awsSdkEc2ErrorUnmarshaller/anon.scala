package typings.awsSdkEc2ErrorUnmarshaller

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Code extends StObject {
    
    var Code: String = js.native
    
    var Message: String = js.native
  }
  object Code {
    
    @scala.inline
    def apply(Code: String, Message: String): Code = {
      val __obj = js.Dynamic.literal(Code = Code.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any])
      __obj.asInstanceOf[Code]
    }
    
    @scala.inline
    implicit class CodeMutableBuilder[Self <: Code] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: String): Self = StObject.set(x, "Code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Error extends StObject {
    
    var Error: Code = js.native
  }
  object Error {
    
    @scala.inline
    def apply(Error: Code): Error = {
      val __obj = js.Dynamic.literal(Error = Error.asInstanceOf[js.Any])
      __obj.asInstanceOf[Error]
    }
    
    @scala.inline
    implicit class ErrorMutableBuilder[Self <: Error] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: Code): Self = StObject.set(x, "Error", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RequestId extends StObject {
    
    var requestId: String = js.native
  }
  object RequestId {
    
    @scala.inline
    def apply(requestId: String): RequestId = {
      val __obj = js.Dynamic.literal(requestId = requestId.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestId]
    }
    
    @scala.inline
    implicit class RequestIdMutableBuilder[Self <: RequestId] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    }
  }
}
