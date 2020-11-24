package typings.awsSdk.organizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EffectivePolicy extends js.Object {
  
  /**
    * The time of the last update to this policy.
    */
  var LastUpdatedTimestamp: js.UndefOr[Timestamp] = js.native
  
  /**
    * The text content of the policy.
    */
  var PolicyContent: js.UndefOr[typings.awsSdk.organizationsMod.PolicyContent] = js.native
  
  /**
    * The policy type.
    */
  var PolicyType: js.UndefOr[EffectivePolicyType] = js.native
  
  /**
    * The account ID of the policy target. 
    */
  var TargetId: js.UndefOr[PolicyTargetId] = js.native
}
object EffectivePolicy {
  
  @scala.inline
  def apply(): EffectivePolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EffectivePolicy]
  }
  
  @scala.inline
  implicit class EffectivePolicyOps[Self <: EffectivePolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLastUpdatedTimestamp(value: Timestamp): Self = this.set("LastUpdatedTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastUpdatedTimestamp: Self = this.set("LastUpdatedTimestamp", js.undefined)
    
    @scala.inline
    def setPolicyContent(value: PolicyContent): Self = this.set("PolicyContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolicyContent: Self = this.set("PolicyContent", js.undefined)
    
    @scala.inline
    def setPolicyType(value: EffectivePolicyType): Self = this.set("PolicyType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolicyType: Self = this.set("PolicyType", js.undefined)
    
    @scala.inline
    def setTargetId(value: PolicyTargetId): Self = this.set("TargetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetId: Self = this.set("TargetId", js.undefined)
  }
}
