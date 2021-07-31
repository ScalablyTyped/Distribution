package typings.awsSdkS3ErrorUnmarshaller

import typings.awsSdkS3ErrorUnmarshaller.anon.RequestId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object constantsMod {
  
  @JSImport("@aws-sdk/s3-error-unmarshaller/build/constants", "ERR_RESP_SHAPE")
  @js.native
  val ERR_RESP_SHAPE: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Member */ js.Any = js.native
  
  trait ParsedErrorResponse extends StObject {
    
    @JSName("$metadata")
    var $metadata: RequestId
    
    var Code: String
    
    var Message: String
  }
  object ParsedErrorResponse {
    
    @scala.inline
    def apply($metadata: RequestId, Code: String, Message: String): ParsedErrorResponse = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], Code = Code.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParsedErrorResponse]
    }
    
    @scala.inline
    implicit class ParsedErrorResponseMutableBuilder[Self <: ParsedErrorResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$metadata(value: RequestId): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCode(value: String): Self = StObject.set(x, "Code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    }
  }
}
