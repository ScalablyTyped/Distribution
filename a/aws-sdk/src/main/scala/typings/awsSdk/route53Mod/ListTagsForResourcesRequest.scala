package typings.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListTagsForResourcesRequest extends js.Object {
  
  /**
    * A complex type that contains the ResourceId element for each resource for which you want to get a list of tags.
    */
  var ResourceIds: TagResourceIdList = js.native
  
  /**
    * The type of the resources.   The resource type for health checks is healthcheck.   The resource type for hosted zones is hostedzone.  
    */
  var ResourceType: TagResourceType = js.native
}
object ListTagsForResourcesRequest {
  
  @scala.inline
  def apply(ResourceIds: TagResourceIdList, ResourceType: TagResourceType): ListTagsForResourcesRequest = {
    val __obj = js.Dynamic.literal(ResourceIds = ResourceIds.asInstanceOf[js.Any], ResourceType = ResourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsForResourcesRequest]
  }
  
  @scala.inline
  implicit class ListTagsForResourcesRequestOps[Self <: ListTagsForResourcesRequest] (val x: Self) extends AnyVal {
    
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
    def setResourceIdsVarargs(value: TagResourceId*): Self = this.set("ResourceIds", js.Array(value :_*))
    
    @scala.inline
    def setResourceIds(value: TagResourceIdList): Self = this.set("ResourceIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceType(value: TagResourceType): Self = this.set("ResourceType", value.asInstanceOf[js.Any])
  }
}
