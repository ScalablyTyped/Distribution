package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MLUserDataEncryption extends StObject {
  
  /**
    * The ID for the customer-provided KMS key.
    */
  var KmsKeyId: js.UndefOr[NameString] = js.undefined
  
  /**
    * The encryption mode applied to user data. Valid values are:   DISABLED: encryption is disabled   SSEKMS: use of server-side encryption with Key Management Service (SSE-KMS) for user data stored in Amazon S3.  
    */
  var MlUserDataEncryptionMode: MLUserDataEncryptionModeString
}
object MLUserDataEncryption {
  
  inline def apply(MlUserDataEncryptionMode: MLUserDataEncryptionModeString): MLUserDataEncryption = {
    val __obj = js.Dynamic.literal(MlUserDataEncryptionMode = MlUserDataEncryptionMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[MLUserDataEncryption]
  }
  
  extension [Self <: MLUserDataEncryption](x: Self) {
    
    inline def setKmsKeyId(value: NameString): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
    
    inline def setMlUserDataEncryptionMode(value: MLUserDataEncryptionModeString): Self = StObject.set(x, "MlUserDataEncryptionMode", value.asInstanceOf[js.Any])
  }
}
