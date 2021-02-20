package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MLUserDataEncryption extends StObject {
  
  /**
    * The ID for the customer-provided KMS key.
    */
  var KmsKeyId: js.UndefOr[NameString] = js.native
  
  /**
    * The encryption mode applied to user data. Valid values are:   DISABLED: encryption is disabled   SSEKMS: use of server-side encryption with AWS Key Management Service (SSE-KMS) for user data stored in Amazon S3.  
    */
  var MlUserDataEncryptionMode: MLUserDataEncryptionModeString = js.native
}
object MLUserDataEncryption {
  
  @scala.inline
  def apply(MlUserDataEncryptionMode: MLUserDataEncryptionModeString): MLUserDataEncryption = {
    val __obj = js.Dynamic.literal(MlUserDataEncryptionMode = MlUserDataEncryptionMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[MLUserDataEncryption]
  }
  
  @scala.inline
  implicit class MLUserDataEncryptionMutableBuilder[Self <: MLUserDataEncryption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKmsKeyId(value: NameString): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
    
    @scala.inline
    def setMlUserDataEncryptionMode(value: MLUserDataEncryptionModeString): Self = StObject.set(x, "MlUserDataEncryptionMode", value.asInstanceOf[js.Any])
  }
}
