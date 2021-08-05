package typings.awsSdk.fmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComplianceViolator extends StObject {
  
  /**
    * The resource ID.
    */
  var ResourceId: js.UndefOr[typings.awsSdk.fmsMod.ResourceId] = js.undefined
  
  /**
    * The resource type. This is in the format shown in the AWS Resource Types Reference. For example: AWS::ElasticLoadBalancingV2::LoadBalancer, AWS::CloudFront::Distribution, or AWS::NetworkFirewall::FirewallPolicy.
    */
  var ResourceType: js.UndefOr[typings.awsSdk.fmsMod.ResourceType] = js.undefined
  
  /**
    * The reason that the resource is not protected by the policy.
    */
  var ViolationReason: js.UndefOr[typings.awsSdk.fmsMod.ViolationReason] = js.undefined
}
object ComplianceViolator {
  
  inline def apply(): ComplianceViolator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComplianceViolator]
  }
  
  extension [Self <: ComplianceViolator](x: Self) {
    
    inline def setResourceId(value: ResourceId): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    inline def setResourceIdUndefined: Self = StObject.set(x, "ResourceId", js.undefined)
    
    inline def setResourceType(value: ResourceType): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "ResourceType", js.undefined)
    
    inline def setViolationReason(value: ViolationReason): Self = StObject.set(x, "ViolationReason", value.asInstanceOf[js.Any])
    
    inline def setViolationReasonUndefined: Self = StObject.set(x, "ViolationReason", js.undefined)
  }
}
