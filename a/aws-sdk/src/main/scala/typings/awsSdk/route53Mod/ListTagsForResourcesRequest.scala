package typings.awsSdk.route53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListTagsForResourcesRequest extends StObject {
  
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
  implicit class ListTagsForResourcesRequestMutableBuilder[Self <: ListTagsForResourcesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceIds(value: TagResourceIdList): Self = StObject.set(x, "ResourceIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceIdsVarargs(value: TagResourceId*): Self = StObject.set(x, "ResourceIds", js.Array(value :_*))
    
    @scala.inline
    def setResourceType(value: TagResourceType): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
  }
}
