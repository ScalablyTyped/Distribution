package typings.awsSdk.dlmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LifecyclePolicy extends StObject {
  
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
  implicit class LifecyclePolicyMutableBuilder[Self <: LifecyclePolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDateCreated(value: Timestamp): Self = StObject.set(x, "DateCreated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateCreatedUndefined: Self = StObject.set(x, "DateCreated", js.undefined)
    
    @scala.inline
    def setDateModified(value: Timestamp): Self = StObject.set(x, "DateModified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateModifiedUndefined: Self = StObject.set(x, "DateModified", js.undefined)
    
    @scala.inline
    def setDescription(value: PolicyDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setExecutionRoleArn(value: ExecutionRoleArn): Self = StObject.set(x, "ExecutionRoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutionRoleArnUndefined: Self = StObject.set(x, "ExecutionRoleArn", js.undefined)
    
    @scala.inline
    def setPolicyArn(value: PolicyArn): Self = StObject.set(x, "PolicyArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyArnUndefined: Self = StObject.set(x, "PolicyArn", js.undefined)
    
    @scala.inline
    def setPolicyDetails(value: PolicyDetails): Self = StObject.set(x, "PolicyDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyDetailsUndefined: Self = StObject.set(x, "PolicyDetails", js.undefined)
    
    @scala.inline
    def setPolicyId(value: PolicyId): Self = StObject.set(x, "PolicyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyIdUndefined: Self = StObject.set(x, "PolicyId", js.undefined)
    
    @scala.inline
    def setState(value: GettablePolicyStateValues): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    @scala.inline
    def setStatusMessage(value: StatusMessage): Self = StObject.set(x, "StatusMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusMessageUndefined: Self = StObject.set(x, "StatusMessage", js.undefined)
    
    @scala.inline
    def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
