package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttachPolicyRequest extends js.Object {
  /**
    * The name of the policy to attach.
    */
  var policyName: PolicyName = js.native
  /**
    * The identity to which the policy is attached.
    */
  var target: PolicyTarget = js.native
}

object AttachPolicyRequest {
  @scala.inline
  def apply(policyName: PolicyName, target: PolicyTarget): AttachPolicyRequest = {
    val __obj = js.Dynamic.literal(policyName = policyName.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachPolicyRequest]
  }
}

