package typings.awsSdk.wafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListResourcesForWebACLRequest extends js.Object {
  
  /**
    * The type of resource to list, either an application load balancer or Amazon API Gateway.
    */
  var ResourceType: js.UndefOr[typings.awsSdk.wafregionalMod.ResourceType] = js.native
  
  /**
    * The unique identifier (ID) of the web ACL for which to list the associated resources.
    */
  var WebACLId: ResourceId = js.native
}
object ListResourcesForWebACLRequest {
  
  @scala.inline
  def apply(WebACLId: ResourceId): ListResourcesForWebACLRequest = {
    val __obj = js.Dynamic.literal(WebACLId = WebACLId.asInstanceOf[js.Any])
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
    def setWebACLId(value: ResourceId): Self = this.set("WebACLId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceType(value: ResourceType): Self = this.set("ResourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceType: Self = this.set("ResourceType", js.undefined)
  }
}
