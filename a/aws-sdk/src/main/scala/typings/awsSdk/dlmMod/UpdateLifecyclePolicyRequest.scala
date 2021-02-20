package typings.awsSdk.dlmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateLifecyclePolicyRequest extends StObject {
  
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
  implicit class UpdateLifecyclePolicyRequestMutableBuilder[Self <: UpdateLifecyclePolicyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: PolicyDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setExecutionRoleArn(value: ExecutionRoleArn): Self = StObject.set(x, "ExecutionRoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutionRoleArnUndefined: Self = StObject.set(x, "ExecutionRoleArn", js.undefined)
    
    @scala.inline
    def setPolicyDetails(value: PolicyDetails): Self = StObject.set(x, "PolicyDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyDetailsUndefined: Self = StObject.set(x, "PolicyDetails", js.undefined)
    
    @scala.inline
    def setPolicyId(value: PolicyId): Self = StObject.set(x, "PolicyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: SettablePolicyStateValues): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}
