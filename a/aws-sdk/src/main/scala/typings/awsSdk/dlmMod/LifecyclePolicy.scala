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
  def apply(): LifecyclePolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LifecyclePolicy]
  }
  @scala.inline
  implicit class LifecyclePolicyOps[Self <: LifecyclePolicy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDateCreated(value: Timestamp): Self = this.set("DateCreated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDateCreated: Self = this.set("DateCreated", js.undefined)
    @scala.inline
    def setDateModified(value: Timestamp): Self = this.set("DateModified", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDateModified: Self = this.set("DateModified", js.undefined)
    @scala.inline
    def setDescription(value: PolicyDescription): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setExecutionRoleArn(value: ExecutionRoleArn): Self = this.set("ExecutionRoleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExecutionRoleArn: Self = this.set("ExecutionRoleArn", js.undefined)
    @scala.inline
    def setPolicyArn(value: PolicyArn): Self = this.set("PolicyArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePolicyArn: Self = this.set("PolicyArn", js.undefined)
    @scala.inline
    def setPolicyDetails(value: PolicyDetails): Self = this.set("PolicyDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePolicyDetails: Self = this.set("PolicyDetails", js.undefined)
    @scala.inline
    def setPolicyId(value: PolicyId): Self = this.set("PolicyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePolicyId: Self = this.set("PolicyId", js.undefined)
    @scala.inline
    def setState(value: GettablePolicyStateValues): Self = this.set("State", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
    @scala.inline
    def setStatusMessage(value: StatusMessage): Self = this.set("StatusMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatusMessage: Self = this.set("StatusMessage", js.undefined)
    @scala.inline
    def setTags(value: TagMap): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
  
}

