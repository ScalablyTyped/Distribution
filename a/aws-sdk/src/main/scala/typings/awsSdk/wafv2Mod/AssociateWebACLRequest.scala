package typings.awsSdk.wafv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociateWebACLRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the resource to associate with the web ACL.  The ARN must be in one of the following formats:   For an Application Load Balancer: arn:aws:elasticloadbalancing:region:account-id:loadbalancer/app/load-balancer-name/load-balancer-id     For an Amazon API Gateway stage: arn:aws:apigateway:region::/restapis/api-id/stages/stage-name    
    */
  var ResourceArn: typings.awsSdk.wafv2Mod.ResourceArn = js.native
  /**
    * The Amazon Resource Name (ARN) of the Web ACL that you want to associate with the resource.
    */
  var WebACLArn: ResourceArn = js.native
}

object AssociateWebACLRequest {
  @scala.inline
  def apply(ResourceArn: ResourceArn, WebACLArn: ResourceArn): AssociateWebACLRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any], WebACLArn = WebACLArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateWebACLRequest]
  }
}

