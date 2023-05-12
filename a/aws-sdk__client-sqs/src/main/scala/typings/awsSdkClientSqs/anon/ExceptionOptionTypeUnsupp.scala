package typings.awsSdkClientSqs.anon

import typings.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @aws-sdk/smithy-client.@aws-sdk/smithy-client.ExceptionOptionType<@aws-sdk/client-sqs.@aws-sdk/client-sqs/dist-types/models/models_0.UnsupportedOperation, @aws-sdk/client-sqs.@aws-sdk/client-sqs/dist-types/models/SQSServiceException.SQSServiceException> */
trait ExceptionOptionTypeUnsupp extends StObject {
  
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  
  var message: String
}
object ExceptionOptionTypeUnsupp {
  
  inline def apply($metadata: ResponseMetadata, message: String): ExceptionOptionTypeUnsupp = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExceptionOptionTypeUnsupp]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExceptionOptionTypeUnsupp] (val x: Self) extends AnyVal {
    
    inline def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
