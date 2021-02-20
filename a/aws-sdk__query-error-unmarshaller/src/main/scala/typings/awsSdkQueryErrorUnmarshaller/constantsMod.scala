package typings.awsSdkQueryErrorUnmarshaller

import typings.awsSdkQueryErrorUnmarshaller.anon.Code
import typings.awsSdkQueryErrorUnmarshaller.anon.RequestId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object constantsMod {
  
  @JSImport("@aws-sdk/query-error-unmarshaller/build/constants", "ERR_RESP_SHAPE")
  @js.native
  val ERR_RESP_SHAPE: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Member */ js.Any = js.native
  
  @js.native
  trait ParsedErrorResponse extends StObject {
    
    @JSName("$metadata")
    var $metadata: RequestId = js.native
    
    var Error: js.UndefOr[Code] = js.native
  }
  object ParsedErrorResponse {
    
    @scala.inline
    def apply($metadata: RequestId): ParsedErrorResponse = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParsedErrorResponse]
    }
    
    @scala.inline
    implicit class ParsedErrorResponseMutableBuilder[Self <: ParsedErrorResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$metadata(value: RequestId): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setError(value: Code): Self = StObject.set(x, "Error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "Error", js.undefined)
    }
  }
}
