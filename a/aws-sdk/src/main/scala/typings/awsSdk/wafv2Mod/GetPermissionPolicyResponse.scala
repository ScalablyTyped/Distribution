package typings.awsSdk.wafv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPermissionPolicyResponse extends js.Object {
  /**
    * The IAM policy that is attached to the specified rule group.
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

