package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttachedPolicy extends js.Object {
  var PolicyArn: js.UndefOr[arnType] = js.native
  /**
    * The friendly name of the attached policy.
    */
  var PolicyName: js.UndefOr[policyNameType] = js.native
}

object AttachedPolicy {
  @scala.inline
  def apply(): AttachedPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttachedPolicy]
  }
  @scala.inline
  implicit class AttachedPolicyOps[Self <: AttachedPolicy] (val x: Self) extends AnyVal {
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
    def setPolicyArn(value: arnType): Self = this.set("PolicyArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePolicyArn: Self = this.set("PolicyArn", js.undefined)
    @scala.inline
    def setPolicyName(value: policyNameType): Self = this.set("PolicyName", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePolicyName: Self = this.set("PolicyName", js.undefined)
  }
  
}

