package typings.awsSdk.route53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTagsForResourcesRequest extends StObject {
  
  /**
    * A complex type that contains the ResourceId element for each resource for which you want to get a list of tags.
    */
  var ResourceIds: TagResourceIdList
  
  /**
    * The type of the resources.   The resource type for health checks is healthcheck.   The resource type for hosted zones is hostedzone.  
    */
  var ResourceType: TagResourceType
}
object ListTagsForResourcesRequest {
  
  inline def apply(ResourceIds: TagResourceIdList, ResourceType: TagResourceType): ListTagsForResourcesRequest = {
    val __obj = js.Dynamic.literal(ResourceIds = ResourceIds.asInstanceOf[js.Any], ResourceType = ResourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsForResourcesRequest]
  }
  
  extension [Self <: ListTagsForResourcesRequest](x: Self) {
    
    inline def setResourceIds(value: TagResourceIdList): Self = StObject.set(x, "ResourceIds", value.asInstanceOf[js.Any])
    
    inline def setResourceIdsVarargs(value: TagResourceId*): Self = StObject.set(x, "ResourceIds", js.Array(value*))
    
    inline def setResourceType(value: TagResourceType): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
  }
}
