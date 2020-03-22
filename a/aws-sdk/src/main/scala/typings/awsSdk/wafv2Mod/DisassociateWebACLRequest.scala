package typings.awsSdk.wafv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisassociateWebACLRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the resource to disassociate from the web ACL.  The ARN must be in one of the following formats:   For an Application Load Balancer: arn:aws:elasticloadbalancing:region:account-id:loadbalancer/app/load-balancer-name/load-balancer-id     For an Amazon API Gateway stage: arn:aws:apigateway:region::/restapis/api-id/stages/stage-name    
    */
  var ResourceArn: typings.awsSdk.wafv2Mod.ResourceArn = js.native
}

object DisassociateWebACLRequest {
  @scala.inline
  def apply(ResourceArn: ResourceArn): DisassociateWebACLRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DisassociateWebACLRequest]
  }
}

