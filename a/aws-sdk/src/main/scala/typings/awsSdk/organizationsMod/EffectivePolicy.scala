package typings.awsSdk.organizationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EffectivePolicy extends StObject {
  
  /**
    * The time of the last update to this policy.
    */
  var LastUpdatedTimestamp: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The text content of the policy.
    */
  var PolicyContent: js.UndefOr[typings.awsSdk.organizationsMod.PolicyContent] = js.undefined
  
  /**
    * The policy type.
    */
  var PolicyType: js.UndefOr[EffectivePolicyType] = js.undefined
  
  /**
    * The account ID of the policy target. 
    */
  var TargetId: js.UndefOr[PolicyTargetId] = js.undefined
}
object EffectivePolicy {
  
  @scala.inline
  def apply(): EffectivePolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EffectivePolicy]
  }
  
  @scala.inline
  implicit class EffectivePolicyMutableBuilder[Self <: EffectivePolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLastUpdatedTimestamp(value: Timestamp): Self = StObject.set(x, "LastUpdatedTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedTimestampUndefined: Self = StObject.set(x, "LastUpdatedTimestamp", js.undefined)
    
    @scala.inline
    def setPolicyContent(value: PolicyContent): Self = StObject.set(x, "PolicyContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyContentUndefined: Self = StObject.set(x, "PolicyContent", js.undefined)
    
    @scala.inline
    def setPolicyType(value: EffectivePolicyType): Self = StObject.set(x, "PolicyType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyTypeUndefined: Self = StObject.set(x, "PolicyType", js.undefined)
    
    @scala.inline
    def setTargetId(value: PolicyTargetId): Self = StObject.set(x, "TargetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetIdUndefined: Self = StObject.set(x, "TargetId", js.undefined)
  }
}
