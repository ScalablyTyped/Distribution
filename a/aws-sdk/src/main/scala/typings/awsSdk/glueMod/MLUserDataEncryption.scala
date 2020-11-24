package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MLUserDataEncryption extends js.Object {
  
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
  implicit class MLUserDataEncryptionOps[Self <: MLUserDataEncryption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMlUserDataEncryptionMode(value: MLUserDataEncryptionModeString): Self = this.set("MlUserDataEncryptionMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmsKeyId(value: NameString): Self = this.set("KmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKmsKeyId: Self = this.set("KmsKeyId", js.undefined)
  }
}
