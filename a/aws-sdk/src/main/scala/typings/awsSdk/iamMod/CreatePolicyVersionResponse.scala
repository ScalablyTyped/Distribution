package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreatePolicyVersionResponse extends js.Object {
  /**
    * A structure containing details about the new policy version.
    */
  var PolicyVersion: js.UndefOr[typings.awsSdk.iamMod.PolicyVersion] = js.native
}

object CreatePolicyVersionResponse {
  @scala.inline
  def apply(): CreatePolicyVersionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreatePolicyVersionResponse]
  }
  @scala.inline
  implicit class CreatePolicyVersionResponseOps[Self <: CreatePolicyVersionResponse] (val x: Self) extends AnyVal {
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
    def setPolicyVersion(value: PolicyVersion): Self = this.set("PolicyVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePolicyVersion: Self = this.set("PolicyVersion", js.undefined)
  }
  
}

