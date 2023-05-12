package typings.awsSdkClientKms.anon

import typings.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @aws-sdk/smithy-client.@aws-sdk/smithy-client.ExceptionOptionType<@aws-sdk/client-kms.@aws-sdk/client-kms/dist-types/models/models_0.AlreadyExistsException, @aws-sdk/client-kms.@aws-sdk/client-kms/dist-types/models/KMSServiceException.KMSServiceException> */
trait ExceptionOptionTypeAlread extends StObject {
  
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  
  var message: String
}
object ExceptionOptionTypeAlread {
  
  inline def apply($metadata: ResponseMetadata, message: String): ExceptionOptionTypeAlread = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExceptionOptionTypeAlread]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExceptionOptionTypeAlread] (val x: Self) extends AnyVal {
    
    inline def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
