package typings.awsSdk.organizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreatePolicyResponse extends js.Object {
  /**
    * A structure that contains details about the newly created policy.
    */
  var Policy: js.UndefOr[typings.awsSdk.organizationsMod.Policy] = js.native
}

object CreatePolicyResponse {
  @scala.inline
  def apply(Policy: Policy = null): CreatePolicyResponse = {
    val __obj = js.Dynamic.literal()
    if (Policy != null) __obj.updateDynamic("Policy")(Policy.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePolicyResponse]
  }
}

