package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DetachPolicyRequest extends js.Object {
  /**
    * The policy to detach.
    */
  var policyName: PolicyName = js.native
  /**
    * The target from which the policy will be detached.
    */
  var target: PolicyTarget = js.native
}

object DetachPolicyRequest {
  @scala.inline
  def apply(policyName: PolicyName, target: PolicyTarget): DetachPolicyRequest = {
    val __obj = js.Dynamic.literal(policyName = policyName.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetachPolicyRequest]
  }
}

