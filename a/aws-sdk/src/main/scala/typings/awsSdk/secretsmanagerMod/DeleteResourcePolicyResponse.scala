package typings.awsSdk.secretsmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteResourcePolicyResponse extends js.Object {
  /**
    * The ARN of the secret that the resource-based policy was deleted for.
    */
  var ARN: js.UndefOr[SecretARNType] = js.native
  /**
    * The friendly name of the secret that the resource-based policy was deleted for.
    */
  var Name: js.UndefOr[NameType] = js.native
}

object DeleteResourcePolicyResponse {
  @scala.inline
  def apply(): DeleteResourcePolicyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteResourcePolicyResponse]
  }
  @scala.inline
  implicit class DeleteResourcePolicyResponseOps[Self <: DeleteResourcePolicyResponse] (val x: Self) extends AnyVal {
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
    def setName(value: NameType): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
  }
  
}

