package typings.awsSdk.shieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateProtectionRequest extends js.Object {
  /**
    * Friendly name for the Protection you are creating.
    */
  var Name: ProtectionName = js.native
  /**
    * The ARN (Amazon Resource Name) of the resource to be protected. The ARN should be in one of the following formats:   For an Application Load Balancer: arn:aws:elasticloadbalancing:region:account-id:loadbalancer/app/load-balancer-name/load-balancer-id     For an Elastic Load Balancer (Classic Load Balancer): arn:aws:elasticloadbalancing:region:account-id:loadbalancer/load-balancer-name     For an AWS CloudFront distribution: arn:aws:cloudfront::account-id:distribution/distribution-id     For an AWS Global Accelerator accelerator: arn:aws:globalaccelerator::account-id:accelerator/accelerator-id     For Amazon Route 53: arn:aws:route53:::hostedzone/hosted-zone-id     For an Elastic IP address: arn:aws:ec2:region:account-id:eip-allocation/allocation-id    
    */
  var ResourceArn: typings.awsSdk.shieldMod.ResourceArn = js.native
}

object CreateProtectionRequest {
  @scala.inline
  def apply(Name: ProtectionName, ResourceArn: ResourceArn): CreateProtectionRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], ResourceArn = ResourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateProtectionRequest]
  }
  @scala.inline
  implicit class CreateProtectionRequestOps[Self <: CreateProtectionRequest] (val x: Self) extends AnyVal {
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
    def setName(value: ProtectionName): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setResourceArn(value: ResourceArn): Self = this.set("ResourceArn", value.asInstanceOf[js.Any])
  }
  
}

