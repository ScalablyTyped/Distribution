package typings.awsSdk.dlmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LifecyclePolicySummary extends js.Object {
  
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
  implicit class LifecyclePolicySummaryOps[Self <: LifecyclePolicySummary] (val x: Self) extends AnyVal {
    
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
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setPolicyId(value: PolicyId): Self = this.set("PolicyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolicyId: Self = this.set("PolicyId", js.undefined)
    
    @scala.inline
    def setPolicyType(value: PolicyTypeValues): Self = this.set("PolicyType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolicyType: Self = this.set("PolicyType", js.undefined)
    
    @scala.inline
    def setState(value: GettablePolicyStateValues): Self = this.set("State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
    
    @scala.inline
    def setTags(value: TagMap): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
}
