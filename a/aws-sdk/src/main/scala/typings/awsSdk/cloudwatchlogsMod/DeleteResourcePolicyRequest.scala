package typings.awsSdk.cloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteResourcePolicyRequest extends js.Object {
  /**
    * The name of the policy to be revoked. This parameter is required.
    */
  var policyName: js.UndefOr[PolicyName] = js.native
}

object DeleteResourcePolicyRequest {
  @scala.inline
  def apply(policyName: PolicyName = null): DeleteResourcePolicyRequest = {
    val __obj = js.Dynamic.literal()
    if (policyName != null) __obj.updateDynamic("policyName")(policyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteResourcePolicyRequest]
  }
}

