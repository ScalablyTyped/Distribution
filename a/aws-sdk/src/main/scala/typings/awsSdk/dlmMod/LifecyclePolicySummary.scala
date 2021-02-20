package typings.awsSdk.dlmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LifecyclePolicySummary extends StObject {
  
  /**
    * The description of the lifecycle policy.
    */
  var Description: js.UndefOr[PolicyDescription] = js.native
  
  /**
    * The identifier of the lifecycle policy.
    */
  var PolicyId: js.UndefOr[typings.awsSdk.dlmMod.PolicyId] = js.native
  
  /**
    * The type of policy. EBS_SNAPSHOT_MANAGEMENT indicates that the policy manages the lifecycle of Amazon EBS snapshots. IMAGE_MANAGEMENT indicates that the policy manages the lifecycle of EBS-backed AMIs.
    */
  var PolicyType: js.UndefOr[PolicyTypeValues] = js.native
  
  /**
    * The activation state of the lifecycle policy.
    */
  var State: js.UndefOr[GettablePolicyStateValues] = js.native
  
  /**
    * The tags.
    */
  var Tags: js.UndefOr[TagMap] = js.native
}
object LifecyclePolicySummary {
  
  @scala.inline
  def apply(): LifecyclePolicySummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LifecyclePolicySummary]
  }
  
  @scala.inline
  implicit class LifecyclePolicySummaryMutableBuilder[Self <: LifecyclePolicySummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: PolicyDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setPolicyId(value: PolicyId): Self = StObject.set(x, "PolicyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyIdUndefined: Self = StObject.set(x, "PolicyId", js.undefined)
    
    @scala.inline
    def setPolicyType(value: PolicyTypeValues): Self = StObject.set(x, "PolicyType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyTypeUndefined: Self = StObject.set(x, "PolicyType", js.undefined)
    
    @scala.inline
    def setState(value: GettablePolicyStateValues): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    @scala.inline
    def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
