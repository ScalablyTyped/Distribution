package typings.awsSdk.secretsmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancelRotateSecretResponse extends js.Object {
  /**
    * The ARN of the secret for which rotation was canceled.
    */
  var ARN: js.UndefOr[SecretARNType] = js.native
  /**
    * The friendly name of the secret for which rotation was canceled.
    */
  var Name: js.UndefOr[SecretNameType] = js.native
  /**
    * The unique identifier of the version of the secret created during the rotation. This version might not be complete, and should be evaluated for possible deletion. At the very least, you should remove the VersionStage value AWSPENDING to enable this version to be deleted. Failing to clean up a cancelled rotation can block you from successfully starting future rotations.
    */
  var VersionId: js.UndefOr[SecretVersionIdType] = js.native
}

object CancelRotateSecretResponse {
  @scala.inline
  def apply(): CancelRotateSecretResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CancelRotateSecretResponse]
  }
  @scala.inline
  implicit class CancelRotateSecretResponseOps[Self <: CancelRotateSecretResponse] (val x: Self) extends AnyVal {
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

