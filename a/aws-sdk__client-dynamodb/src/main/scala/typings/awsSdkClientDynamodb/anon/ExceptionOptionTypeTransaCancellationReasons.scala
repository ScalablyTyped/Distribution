package typings.awsSdkClientDynamodb.anon

import typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.CancellationReason
import typings.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @aws-sdk/smithy-client.@aws-sdk/smithy-client.ExceptionOptionType<@aws-sdk/client-dynamodb.@aws-sdk/client-dynamodb/dist-types/models/models_0.TransactionCanceledException, @aws-sdk/client-dynamodb.@aws-sdk/client-dynamodb/dist-types/models/DynamoDBServiceException.DynamoDBServiceException> */
trait ExceptionOptionTypeTransaCancellationReasons extends StObject {
  
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  
  var CancellationReasons: js.UndefOr[js.Array[CancellationReason]] = js.undefined
  
  var Message: js.UndefOr[String] = js.undefined
  
  var message: String
}
object ExceptionOptionTypeTransaCancellationReasons {
  
  inline def apply($metadata: ResponseMetadata, message: String): ExceptionOptionTypeTransaCancellationReasons = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExceptionOptionTypeTransaCancellationReasons]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExceptionOptionTypeTransaCancellationReasons] (val x: Self) extends AnyVal {
    
    inline def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
    
    inline def setCancellationReasons(value: js.Array[CancellationReason]): Self = StObject.set(x, "CancellationReasons", value.asInstanceOf[js.Any])
    
    inline def setCancellationReasonsUndefined: Self = StObject.set(x, "CancellationReasons", js.undefined)
    
    inline def setCancellationReasonsVarargs(value: CancellationReason*): Self = StObject.set(x, "CancellationReasons", js.Array(value*))
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
  }
}
