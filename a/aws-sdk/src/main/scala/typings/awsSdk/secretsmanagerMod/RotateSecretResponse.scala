package typings.awsSdk.secretsmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RotateSecretResponse extends js.Object {
  /**
    * The ARN of the secret.
    */
  var ARN: js.UndefOr[SecretARNType] = js.native
  /**
    * The friendly name of the secret.
    */
  var Name: js.UndefOr[SecretNameType] = js.native
  /**
    * The ID of the new version of the secret created by the rotation started by this request.
    */
  var VersionId: js.UndefOr[SecretVersionIdType] = js.native
}

object RotateSecretResponse {
  @scala.inline
  def apply(): RotateSecretResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RotateSecretResponse]
  }
  @scala.inline
  implicit class RotateSecretResponseOps[Self <: RotateSecretResponse] (val x: Self) extends AnyVal {
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
    def setARN(value: SecretARNType): Self = this.set("ARN", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteARN: Self = this.set("ARN", js.undefined)
    @scala.inline
    def setName(value: SecretNameType): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    @scala.inline
    def setVersionId(value: SecretVersionIdType): Self = this.set("VersionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersionId: Self = this.set("VersionId", js.undefined)
  }
  
}

