package typings.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
}

