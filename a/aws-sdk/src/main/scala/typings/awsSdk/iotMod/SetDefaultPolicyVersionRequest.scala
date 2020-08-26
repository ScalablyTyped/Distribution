package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetDefaultPolicyVersionRequest extends js.Object {
  /**
    * The policy name.
    */
  var policyName: PolicyName = js.native
  /**
    * The policy version ID.
    */
  var policyVersionId: PolicyVersionId = js.native
}

object SetDefaultPolicyVersionRequest {
  @scala.inline
  def apply(policyName: PolicyName, policyVersionId: PolicyVersionId): SetDefaultPolicyVersionRequest = {
    val __obj = js.Dynamic.literal(policyName = policyName.asInstanceOf[js.Any], policyVersionId = policyVersionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetDefaultPolicyVersionRequest]
  }
  @scala.inline
  implicit class SetDefaultPolicyVersionRequestOps[Self <: SetDefaultPolicyVersionRequest] (val x: Self) extends AnyVal {
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
    def setPolicyName(value: PolicyName): Self = this.set("policyName", value.asInstanceOf[js.Any])
    @scala.inline
    def setPolicyVersionId(value: PolicyVersionId): Self = this.set("policyVersionId", value.asInstanceOf[js.Any])
  }
  
}

