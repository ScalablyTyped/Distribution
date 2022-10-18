package typings.awsSdkS3ErrorUnmarshaller

import typings.awsSdkS3ErrorUnmarshaller.anon.RequestId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildConstantsMod {
  
  @JSImport("@aws-sdk/s3-error-unmarshaller/build/constants", "ERR_RESP_SHAPE")
  @js.native
  val ERR_RESP_SHAPE: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Member */ Any = js.native
  
  trait ParsedErrorResponse extends StObject {
    
    @JSName("$metadata")
    var $metadata: RequestId
    
    var Code: String
    
    var Message: String
  }
  object ParsedErrorResponse {
    
    inline def apply($metadata: RequestId, Code: String, Message: String): ParsedErrorResponse = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], Code = Code.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParsedErrorResponse]
    }
    
    extension [Self <: ParsedErrorResponse](x: Self) {
      
      inline def set$metadata(value: RequestId): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      inline def setCode(value: String): Self = StObject.set(x, "Code", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    }
  }
}
