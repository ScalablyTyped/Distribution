package typings.awsSdk.dlmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LifecyclePolicy extends js.Object {
  /**
    * The local date and time when the lifecycle policy was created.
    */
  var DateCreated: js.UndefOr[Timestamp] = js.native
  /**
    * The local date and time when the lifecycle policy was last modified.
    */
  var DateModified: js.UndefOr[Timestamp] = js.native
  /**
    * The description of the lifecycle policy.
    */
  var Description: js.UndefOr[PolicyDescription] = js.native
  /**
    * The Amazon Resource Name (ARN) of the IAM role used to run the operations specified by the lifecycle policy.
    */
  var ExecutionRoleArn: js.UndefOr[typings.awsSdk.dlmMod.ExecutionRoleArn] = js.native
  /**
    * The Amazon Resource Name (ARN) of the policy.
    */
  var PolicyArn: js.UndefOr[typings.awsSdk.dlmMod.PolicyArn] = js.native
  /**
    * The configuration of the lifecycle policy
    */
  var PolicyDetails: js.UndefOr[typings.awsSdk.dlmMod.PolicyDetails] = js.native
  /**
    * The identifier of the lifecycle policy.
    */
  var PolicyId: js.UndefOr[typings.awsSdk.dlmMod.PolicyId] = js.native
  /**
    * The activation state of the lifecycle policy.
    */
  var State: js.UndefOr[GettablePolicyStateValues] = js.native
  /**
    * The description of the status.
    */
  var StatusMessage: js.UndefOr[typings.awsSdk.dlmMod.StatusMessage] = js.native
  /**
    * The tags.
    */
  var Tags: js.UndefOr[TagMap] = js.native
}

object LifecyclePolicy {
  @scala.inline
  def apply(
    DateCreated: Timestamp = null,
    DateModified: Timestamp = null,
    Description: PolicyDescription = null,
    ExecutionRoleArn: ExecutionRoleArn = null,
    PolicyArn: PolicyArn = null,
    PolicyDetails: PolicyDetails = null,
    PolicyId: PolicyId = null,
    State: GettablePolicyStateValues = null,
    StatusMessage: StatusMessage = null,
    Tags: TagMap = null
  ): LifecyclePolicy = {
    val __obj = js.Dynamic.literal()
    if (DateCreated != null) __obj.updateDynamic("DateCreated")(DateCreated.asInstanceOf[js.Any])
    if (DateModified != null) __obj.updateDynamic("DateModified")(DateModified.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (ExecutionRoleArn != null) __obj.updateDynamic("ExecutionRoleArn")(ExecutionRoleArn.asInstanceOf[js.Any])
    if (PolicyArn != null) __obj.updateDynamic("PolicyArn")(PolicyArn.asInstanceOf[js.Any])
    if (PolicyDetails != null) __obj.updateDynamic("PolicyDetails")(PolicyDetails.asInstanceOf[js.Any])
    if (PolicyId != null) __obj.updateDynamic("PolicyId")(PolicyId.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (StatusMessage != null) __obj.updateDynamic("StatusMessage")(StatusMessage.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[LifecyclePolicy]
  }
}

