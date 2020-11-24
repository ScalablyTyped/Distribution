package typings.awsSdk.mqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EncryptionOptions extends js.Object {
  
  /**
    * The symmetric customer master key (CMK) to use for the AWS Key Management Service (KMS). This key is used to encrypt your data at rest. If not provided, Amazon MQ will use a default CMK to encrypt your data.
    */
  var KmsKeyId: js.UndefOr[string] = js.native
  
  /**
    * Enables the use of an AWS owned CMK using AWS Key Management Service (KMS).
    */
  var UseAwsOwnedKey: boolean = js.native
}
object EncryptionOptions {
  
  @scala.inline
  def apply(UseAwsOwnedKey: boolean): EncryptionOptions = {
    val __obj = js.Dynamic.literal(UseAwsOwnedKey = UseAwsOwnedKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncryptionOptions]
  }
  
  @scala.inline
  implicit class EncryptionOptionsOps[Self <: EncryptionOptions] (val x: Self) extends AnyVal {
    
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
    def setUseAwsOwnedKey(value: boolean): Self = this.set("UseAwsOwnedKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmsKeyId(value: string): Self = this.set("KmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKmsKeyId: Self = this.set("KmsKeyId", js.undefined)
  }
}
