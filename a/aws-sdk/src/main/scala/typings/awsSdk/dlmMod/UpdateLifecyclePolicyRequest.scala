package typings.awsSdk.dlmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(PolicyId: PolicyId): UpdateLifecyclePolicyRequest = {
    val __obj = js.Dynamic.literal(PolicyId = PolicyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateLifecyclePolicyRequest]
  }
  
  @scala.inline
  implicit class UpdateLifecyclePolicyRequestOps[Self <: UpdateLifecyclePolicyRequest] (val x: Self) extends AnyVal {
    
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
    def setPolicyId(value: PolicyId): Self = this.set("PolicyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: PolicyDescription): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setExecutionRoleArn(value: ExecutionRoleArn): Self = this.set("ExecutionRoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExecutionRoleArn: Self = this.set("ExecutionRoleArn", js.undefined)
    
    @scala.inline
    def setPolicyDetails(value: PolicyDetails): Self = this.set("PolicyDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolicyDetails: Self = this.set("PolicyDetails", js.undefined)
    
    @scala.inline
    def setState(value: SettablePolicyStateValues): Self = this.set("State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
  }
}
