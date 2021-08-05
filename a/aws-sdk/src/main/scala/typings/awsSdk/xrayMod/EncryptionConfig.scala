package typings.awsSdk.xrayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EncryptionConfig extends StObject {
  
  /**
    * The ID of the customer master key (CMK) used for encryption, if applicable.
    */
  var KeyId: js.UndefOr[String] = js.undefined
  
  /**
    * The encryption status. While the status is UPDATING, X-Ray may encrypt data with a combination of the new and old settings.
    */
  var Status: js.UndefOr[EncryptionStatus] = js.undefined
  
  /**
    * The type of encryption. Set to KMS for encryption with CMKs. Set to NONE for default encryption.
    */
  var Type: js.UndefOr[EncryptionType] = js.undefined
}
object EncryptionConfig {
  
  inline def apply(): EncryptionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EncryptionConfig]
  }
  
  extension [Self <: EncryptionConfig](x: Self) {
    
    inline def setKeyId(value: String): Self = StObject.set(x, "KeyId", value.asInstanceOf[js.Any])
    
    inline def setKeyIdUndefined: Self = StObject.set(x, "KeyId", js.undefined)
    
    inline def setStatus(value: EncryptionStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setType(value: EncryptionType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
