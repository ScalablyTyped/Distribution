package typings.awsSdk.wafv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListResourcesForWebACLRequest extends js.Object {
  /**
    * Used for web ACLs that are scoped for regional applications. A regional application can be an Application Load Balancer (ALB) or an API Gateway stage. 
    */
  var ResourceType: js.UndefOr[typings.awsSdk.wafv2Mod.ResourceType] = js.native
  /**
    * The Amazon Resource Name (ARN) of the Web ACL.
    */
  var WebACLArn: ResourceArn = js.native
}

object ListResourcesForWebACLRequest {
  @scala.inline
  def apply(WebACLArn: ResourceArn, ResourceType: ResourceType = null): ListResourcesForWebACLRequest = {
    val __obj = js.Dynamic.literal(WebACLArn = WebACLArn.asInstanceOf[js.Any])
    if (ResourceType != null) __obj.updateDynamic("ResourceType")(ResourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListResourcesForWebACLRequest]
  }
}

