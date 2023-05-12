package typings.awsSdkClientDynamodb.anon

import typings.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @aws-sdk/smithy-client.@aws-sdk/smithy-client.ExceptionOptionType<@aws-sdk/client-dynamodb.@aws-sdk/client-dynamodb/dist-types/models/models_0.BackupNotFoundException, @aws-sdk/client-dynamodb.@aws-sdk/client-dynamodb/dist-types/models/DynamoDBServiceException.DynamoDBServiceException> */
trait ExceptionOptionTypeBackup extends StObject {
  
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  
  var message: String
}
object ExceptionOptionTypeBackup {
  
  inline def apply($metadata: ResponseMetadata, message: String): ExceptionOptionTypeBackup = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExceptionOptionTypeBackup]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExceptionOptionTypeBackup] (val x: Self) extends AnyVal {
    
    inline def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
