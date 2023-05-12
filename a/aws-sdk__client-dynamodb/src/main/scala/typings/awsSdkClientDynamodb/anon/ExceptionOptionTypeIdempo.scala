package typings.awsSdkClientDynamodb.anon

import typings.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @aws-sdk/smithy-client.@aws-sdk/smithy-client.ExceptionOptionType<@aws-sdk/client-dynamodb.@aws-sdk/client-dynamodb/dist-types/models/models_0.IdempotentParameterMismatchException, @aws-sdk/client-dynamodb.@aws-sdk/client-dynamodb/dist-types/models/DynamoDBServiceException.DynamoDBServiceException> */
trait ExceptionOptionTypeIdempo extends StObject {
  
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  
  var Message: js.UndefOr[String] = js.undefined
  
  var message: String
}
object ExceptionOptionTypeIdempo {
  
  inline def apply($metadata: ResponseMetadata, message: String): ExceptionOptionTypeIdempo = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExceptionOptionTypeIdempo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExceptionOptionTypeIdempo] (val x: Self) extends AnyVal {
    
    inline def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
  }
}
