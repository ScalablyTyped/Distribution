package typings.awsSdk.dlmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateLifecyclePolicyRequest extends js.Object {
  /**
    * A description of the lifecycle policy.
    */
  var Description: js.UndefOr[PolicyDescription] = js.native
  /**
    * The Amazon Resource Name (ARN) of the IAM role used to run the operations specified by the lifecycle policy.
    */
  var ExecutionRoleArn: js.UndefOr[typings.awsSdk.dlmMod.ExecutionRoleArn] = js.native
  /**
    * The configuration of the lifecycle policy. You cannot update the policy type or the resource type.
    */
  var PolicyDetails: js.UndefOr[typings.awsSdk.dlmMod.PolicyDetails] = js.native
  /**
    * The identifier of the lifecycle policy.
    */
  var PolicyId: typings.awsSdk.dlmMod.PolicyId = js.native
  /**
    * The desired activation state of the lifecycle policy after creation.
    */
  var State: js.UndefOr[SettablePolicyStateValues] = js.native
}

object UpdateLifecyclePolicyRequest {
  @scala.inline
  def apply(
    PolicyId: PolicyId,
    Description: PolicyDescription = null,
    ExecutionRoleArn: ExecutionRoleArn = null,
    PolicyDetails: PolicyDetails = null,
    State: SettablePolicyStateValues = null
  ): UpdateLifecyclePolicyRequest = {
    val __obj = js.Dynamic.literal(PolicyId = PolicyId.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (ExecutionRoleArn != null) __obj.updateDynamic("ExecutionRoleArn")(ExecutionRoleArn.asInstanceOf[js.Any])
    if (PolicyDetails != null) __obj.updateDynamic("PolicyDetails")(PolicyDetails.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateLifecyclePolicyRequest]
  }
}

