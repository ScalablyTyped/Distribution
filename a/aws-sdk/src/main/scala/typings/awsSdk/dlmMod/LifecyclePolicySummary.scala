package typings.awsSdk.dlmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LifecyclePolicySummary extends StObject {
  
  /**
    * The description of the lifecycle policy.
    */
  var Description: js.UndefOr[PolicyDescription] = js.undefined
  
  /**
    * The identifier of the lifecycle policy.
    */
  var PolicyId: js.UndefOr[typings.awsSdk.dlmMod.PolicyId] = js.undefined
  
  /**
    * The type of policy. EBS_SNAPSHOT_MANAGEMENT indicates that the policy manages the lifecycle of Amazon EBS snapshots. IMAGE_MANAGEMENT indicates that the policy manages the lifecycle of EBS-backed AMIs. EVENT_BASED_POLICY indicates that the policy automates cross-account snapshot copies for snapshots that are shared with your account.
    */
  var PolicyType: js.UndefOr[PolicyTypeValues] = js.undefined
  
  /**
    * The activation state of the lifecycle policy.
    */
  var State: js.UndefOr[GettablePolicyStateValues] = js.undefined
  
  /**
    * The tags.
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
}
object LifecyclePolicySummary {
  
  inline def apply(): LifecyclePolicySummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LifecyclePolicySummary]
  }
  
  extension [Self <: LifecyclePolicySummary](x: Self) {
    
    inline def setDescription(value: PolicyDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setPolicyId(value: PolicyId): Self = StObject.set(x, "PolicyId", value.asInstanceOf[js.Any])
    
    inline def setPolicyIdUndefined: Self = StObject.set(x, "PolicyId", js.undefined)
    
    inline def setPolicyType(value: PolicyTypeValues): Self = StObject.set(x, "PolicyType", value.asInstanceOf[js.Any])
    
    inline def setPolicyTypeUndefined: Self = StObject.set(x, "PolicyType", js.undefined)
    
    inline def setState(value: GettablePolicyStateValues): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
