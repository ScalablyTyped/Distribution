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
  def apply(WebACLArn: ResourceArn): ListResourcesForWebACLRequest = {
    val __obj = js.Dynamic.literal(WebACLArn = WebACLArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListResourcesForWebACLRequest]
  }
  @scala.inline
  implicit class ListResourcesForWebACLRequestOps[Self <: ListResourcesForWebACLRequest] (val x: Self) extends AnyVal {
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
    def setWebACLArn(value: ResourceArn): Self = this.set("WebACLArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setResourceType(value: ResourceType): Self = this.set("ResourceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceType: Self = this.set("ResourceType", js.undefined)
  }
  
}

