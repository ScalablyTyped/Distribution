package typings.awsSdk.shieldMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateProtectionRequest extends StObject {
  
  /**
    * Friendly name for the Protection you are creating.
    */
  var Name: ProtectionName
  
  /**
    * The ARN (Amazon Resource Name) of the resource to be protected. The ARN should be in one of the following formats:   For an Application Load Balancer: arn:aws:elasticloadbalancing:region:account-id:loadbalancer/app/load-balancer-name/load-balancer-id     For an Elastic Load Balancer (Classic Load Balancer): arn:aws:elasticloadbalancing:region:account-id:loadbalancer/load-balancer-name     For an AWS CloudFront distribution: arn:aws:cloudfront::account-id:distribution/distribution-id     For an AWS Global Accelerator accelerator: arn:aws:globalaccelerator::account-id:accelerator/accelerator-id     For Amazon Route 53: arn:aws:route53:::hostedzone/hosted-zone-id     For an Elastic IP address: arn:aws:ec2:region:account-id:eip-allocation/allocation-id    
    */
  var ResourceArn: typings.awsSdk.shieldMod.ResourceArn
}
object CreateProtectionRequest {
  
  inline def apply(Name: ProtectionName, ResourceArn: ResourceArn): CreateProtectionRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], ResourceArn = ResourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateProtectionRequest]
  }
  
  extension [Self <: CreateProtectionRequest](x: Self) {
    
    inline def setName(value: ProtectionName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setResourceArn(value: ResourceArn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
  }
}
