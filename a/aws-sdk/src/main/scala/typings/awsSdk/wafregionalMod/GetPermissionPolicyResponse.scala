package typings.awsSdk.wafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPermissionPolicyResponse extends js.Object {
  /**
    * The IAM policy attached to the specified RuleGroup.
    */
  var Policy: js.UndefOr[PolicyString] = js.native
}

object GetPermissionPolicyResponse {
  @scala.inline
  def apply(Policy: PolicyString = null): GetPermissionPolicyResponse = {
    val __obj = js.Dynamic.literal()
    if (Policy != null) __obj.updateDynamic("Policy")(Policy.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPermissionPolicyResponse]
  }
}

