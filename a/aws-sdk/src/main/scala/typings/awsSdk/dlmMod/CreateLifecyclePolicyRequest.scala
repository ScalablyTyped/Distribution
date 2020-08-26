package typings.awsSdk.dlmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateLifecyclePolicyRequest extends js.Object {
  /**
    * A description of the lifecycle policy. The characters ^[0-9A-Za-z _-]+$ are supported.
    */
  var Description: PolicyDescription = js.native
  /**
    * The Amazon Resource Name (ARN) of the IAM role used to run the operations specified by the lifecycle policy.
    */
  var ExecutionRoleArn: typings.awsSdk.dlmMod.ExecutionRoleArn = js.native
  /**
    * The configuration details of the lifecycle policy.
    */
  var PolicyDetails: typings.awsSdk.dlmMod.PolicyDetails = js.native
  /**
    * The desired activation state of the lifecycle policy after creation.
    */
  var State: SettablePolicyStateValues = js.native
  /**
    * The tags to apply to the lifecycle policy during creation.
    */
  var Tags: js.UndefOr[TagMap] = js.native
}

object CreateLifecyclePolicyRequest {
  @scala.inline
  def apply(
    Description: PolicyDescription,
    ExecutionRoleArn: ExecutionRoleArn,
    PolicyDetails: PolicyDetails,
    State: SettablePolicyStateValues
  ): CreateLifecyclePolicyRequest = {
    val __obj = js.Dynamic.literal(Description = Description.asInstanceOf[js.Any], ExecutionRoleArn = ExecutionRoleArn.asInstanceOf[js.Any], PolicyDetails = PolicyDetails.asInstanceOf[js.Any], State = State.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLifecyclePolicyRequest]
  }
  @scala.inline
  implicit class CreateLifecyclePolicyRequestOps[Self <: CreateLifecyclePolicyRequest] (val x: Self) extends AnyVal {
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
    def setDescription(value: PolicyDescription): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def setExecutionRoleArn(value: ExecutionRoleArn): Self = this.set("ExecutionRoleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setPolicyDetails(value: PolicyDetails): Self = this.set("PolicyDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def setState(value: SettablePolicyStateValues): Self = this.set("State", value.asInstanceOf[js.Any])
    @scala.inline
    def setTags(value: TagMap): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
  
}

