package typings.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EncryptionKey extends js.Object {
  /**
    * The ID used to identify the key. For an AWS KMS key, you can use the key ID, the key ARN, or the alias ARN.  Aliases are recognized only in the account that created the customer master key (CMK). For cross-account actions, you can only use the key ID or key ARN to identify the key. 
    */
  var id: EncryptionKeyId = js.native
  /**
    * The type of encryption key, such as an AWS Key Management Service (AWS KMS) key. When creating or updating a pipeline, the value must be set to 'KMS'.
    */
  var `type`: EncryptionKeyType = js.native
}

object EncryptionKey {
  @scala.inline
  def apply(id: EncryptionKeyId, `type`: EncryptionKeyType): EncryptionKey = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncryptionKey]
  }
  @scala.inline
  implicit class EncryptionKeyOps[Self <: EncryptionKey] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setId(value: EncryptionKeyId): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: EncryptionKeyType): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

