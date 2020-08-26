package typings.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTagsForResourceRequest extends js.Object {
  /**
    * The ID of the resource for which you want to retrieve tags.
    */
  var ResourceId: TagResourceId = js.native
  /**
    * The type of the resource.   The resource type for health checks is healthcheck.   The resource type for hosted zones is hostedzone.  
    */
  var ResourceType: TagResourceType = js.native
}

object ListTagsForResourceRequest {
  @scala.inline
  def apply(ResourceId: TagResourceId, ResourceType: TagResourceType): ListTagsForResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceId = ResourceId.asInstanceOf[js.Any], ResourceType = ResourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsForResourceRequest]
  }
  @scala.inline
  implicit class ListTagsForResourceRequestOps[Self <: ListTagsForResourceRequest] (val x: Self) extends AnyVal {
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
    def setResourceId(value: TagResourceId): Self = this.set("ResourceId", value.asInstanceOf[js.Any])
    @scala.inline
    def setResourceType(value: TagResourceType): Self = this.set("ResourceType", value.asInstanceOf[js.Any])
  }
  
}

