package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreatePolicyResponse extends js.Object {
  /**
    * A structure containing details about the new policy.
    */
  var Policy: js.UndefOr[typings.awsSdk.iamMod.Policy] = js.native
}

object CreatePolicyResponse {
  @scala.inline
  def apply(Policy: Policy = null): CreatePolicyResponse = {
    val __obj = js.Dynamic.literal()
    if (Policy != null) __obj.updateDynamic("Policy")(Policy.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePolicyResponse]
  }
}

