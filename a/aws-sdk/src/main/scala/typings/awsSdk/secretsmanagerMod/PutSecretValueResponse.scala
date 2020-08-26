package typings.awsSdk.secretsmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutSecretValueResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) for the secret for which you just created a version.
    */
  var ARN: js.UndefOr[SecretARNType] = js.native
  /**
    * The friendly name of the secret for which you just created or updated a version.
    */
  var Name: js.UndefOr[SecretNameType] = js.native
  /**
    * The unique identifier of the version of the secret you just created or updated.
    */
  var VersionId: js.UndefOr[SecretVersionIdType] = js.native
  /**
    * The list of staging labels that are currently attached to this version of the secret. Staging labels are used to track a version as it progresses through the secret rotation process.
    */
  var VersionStages: js.UndefOr[SecretVersionStagesType] = js.native
}

object PutSecretValueResponse {
  @scala.inline
  def apply(): PutSecretValueResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutSecretValueResponse]
  }
  @scala.inline
  implicit class PutSecretValueResponseOps[Self <: PutSecretValueResponse] (val x: Self) extends AnyVal {
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
    @scala.inline
    def setVersionStagesVarargs(value: SecretVersionStageType*): Self = this.set("VersionStages", js.Array(value :_*))
    @scala.inline
    def setVersionStages(value: SecretVersionStagesType): Self = this.set("VersionStages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersionStages: Self = this.set("VersionStages", js.undefined)
  }
  
}

