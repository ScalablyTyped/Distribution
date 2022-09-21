package typings.awsSdk.codegurureviewerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KMSKeyDetails extends StObject {
  
  /**
    * The encryption option for a repository association. It is either owned by Amazon Web Services Key Management Service (KMS) (AWS_OWNED_CMK) or customer managed (CUSTOMER_MANAGED_CMK).
    */
  var EncryptionOption: js.UndefOr[typings.awsSdk.codegurureviewerMod.EncryptionOption] = js.undefined
  
  /**
    * The ID of the Amazon Web Services KMS key that is associated with a repository association.
    */
  var KMSKeyId: js.UndefOr[typings.awsSdk.codegurureviewerMod.KMSKeyId] = js.undefined
}
object KMSKeyDetails {
  
  inline def apply(): KMSKeyDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KMSKeyDetails]
  }
  
  extension [Self <: KMSKeyDetails](x: Self) {
    
    inline def setEncryptionOption(value: EncryptionOption): Self = StObject.set(x, "EncryptionOption", value.asInstanceOf[js.Any])
    
    inline def setEncryptionOptionUndefined: Self = StObject.set(x, "EncryptionOption", js.undefined)
    
    inline def setKMSKeyId(value: KMSKeyId): Self = StObject.set(x, "KMSKeyId", value.asInstanceOf[js.Any])
    
    inline def setKMSKeyIdUndefined: Self = StObject.set(x, "KMSKeyId", js.undefined)
  }
}
