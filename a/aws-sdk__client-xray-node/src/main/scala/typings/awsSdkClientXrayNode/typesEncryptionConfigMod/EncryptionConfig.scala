package typings.awsSdkClientXrayNode.typesEncryptionConfigMod

import typings.awsSdkClientXrayNode.awsSdkClientXrayNodeStrings.ACTIVE
import typings.awsSdkClientXrayNode.awsSdkClientXrayNodeStrings.KMS
import typings.awsSdkClientXrayNode.awsSdkClientXrayNodeStrings.NONE
import typings.awsSdkClientXrayNode.awsSdkClientXrayNodeStrings.UPDATING
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EncryptionConfig extends js.Object {
  /**
    * <p>The ID of the customer master key (CMK) used for encryption, if applicable.</p>
    */
  var KeyId: js.UndefOr[String] = js.native
  /**
    * <p>The encryption status. While the status is <code>UPDATING</code>, X-Ray may encrypt data with a combination of the new and old settings.</p>
    */
  var Status: js.UndefOr[UPDATING | ACTIVE | String] = js.native
  /**
    * <p>The type of encryption. Set to <code>KMS</code> for encryption with CMKs. Set to <code>NONE</code> for default encryption.</p>
    */
  var Type: js.UndefOr[NONE | KMS | String] = js.native
}

object EncryptionConfig {
  @scala.inline
  def apply(): EncryptionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EncryptionConfig]
  }
  @scala.inline
  implicit class EncryptionConfigOps[Self <: EncryptionConfig] (val x: Self) extends AnyVal {
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
    def setKeyId(value: String): Self = this.set("KeyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyId: Self = this.set("KeyId", js.undefined)
    @scala.inline
    def setStatus(value: UPDATING | ACTIVE | String): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    @scala.inline
    def setType(value: NONE | KMS | String): Self = this.set("Type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
  }
  
}

