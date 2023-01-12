package typings.awsSdk.clientsVoiceidMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServerSideEncryptionUpdateDetails extends StObject {
  
  /**
    * Message explaining the current UpdateStatus. When the UpdateStatus is FAILED, this message explains the cause of the failure.
    */
  var Message: js.UndefOr[String] = js.undefined
  
  /**
    * The previous KMS key ID the domain was encrypted with, before ServerSideEncryptionConfiguration was updated to a new KMS key ID.
    */
  var OldKmsKeyId: js.UndefOr[KmsKeyId] = js.undefined
  
  /**
    * Status of the server-side encryption update. During an update, if there is an issue with the domain's current or old KMS key ID, such as an inaccessible or disabled key, then the status is FAILED. In order to resolve this, the key needs to be made accessible, and then an UpdateDomain call with the existing server-side encryption configuration will re-attempt this update process.
    */
  var UpdateStatus: js.UndefOr[ServerSideEncryptionUpdateStatus] = js.undefined
}
object ServerSideEncryptionUpdateDetails {
  
  inline def apply(): ServerSideEncryptionUpdateDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerSideEncryptionUpdateDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ServerSideEncryptionUpdateDetails] (val x: Self) extends AnyVal {
    
    inline def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
    
    inline def setOldKmsKeyId(value: KmsKeyId): Self = StObject.set(x, "OldKmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setOldKmsKeyIdUndefined: Self = StObject.set(x, "OldKmsKeyId", js.undefined)
    
    inline def setUpdateStatus(value: ServerSideEncryptionUpdateStatus): Self = StObject.set(x, "UpdateStatus", value.asInstanceOf[js.Any])
    
    inline def setUpdateStatusUndefined: Self = StObject.set(x, "UpdateStatus", js.undefined)
  }
}
