package typings.awsSdk.fmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPolicyResponse extends js.Object {
  /**
    * Information about the specified AWS Firewall Manager policy.
    */
  var Policy: js.UndefOr[typings.awsSdk.fmsMod.Policy] = js.native
  /**
    * The Amazon Resource Name (ARN) of the specified policy.
    */
  var PolicyArn: js.UndefOr[ResourceArn] = js.native
}

object GetPolicyResponse {
  @scala.inline
  def apply(Policy: Policy = null, PolicyArn: ResourceArn = null): GetPolicyResponse = {
    val __obj = js.Dynamic.literal()
    if (Policy != null) __obj.updateDynamic("Policy")(Policy.asInstanceOf[js.Any])
    if (PolicyArn != null) __obj.updateDynamic("PolicyArn")(PolicyArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPolicyResponse]
  }
}

