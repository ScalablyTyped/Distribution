package typings.awsSdk.fmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComplianceViolator extends js.Object {
  
  /**
    * The resource ID.
    */
  var ResourceId: js.UndefOr[typings.awsSdk.fmsMod.ResourceId] = js.native
  
  /**
    * The resource type. This is in the format shown in the AWS Resource Types Reference. For example: AWS::ElasticLoadBalancingV2::LoadBalancer, AWS::CloudFront::Distribution, or AWS::NetworkFirewall::FirewallPolicy.
    */
  var ResourceType: js.UndefOr[typings.awsSdk.fmsMod.ResourceType] = js.native
  
  /**
    * The reason that the resource is not protected by the policy.
    */
  var ViolationReason: js.UndefOr[typings.awsSdk.fmsMod.ViolationReason] = js.native
}
object ComplianceViolator {
  
  @scala.inline
  def apply(): ComplianceViolator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComplianceViolator]
  }
  
  @scala.inline
  implicit class ComplianceViolatorOps[Self <: ComplianceViolator] (val x: Self) extends AnyVal {
    
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
    def setResourceId(value: ResourceId): Self = this.set("ResourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceId: Self = this.set("ResourceId", js.undefined)
    
    @scala.inline
    def setResourceType(value: ResourceType): Self = this.set("ResourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceType: Self = this.set("ResourceType", js.undefined)
    
    @scala.inline
    def setViolationReason(value: ViolationReason): Self = this.set("ViolationReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViolationReason: Self = this.set("ViolationReason", js.undefined)
  }
}
