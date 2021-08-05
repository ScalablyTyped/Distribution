package typings.awsSdk.wafregionalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListResourcesForWebACLRequest extends StObject {
  
  /**
    * The type of resource to list, either an application load balancer or Amazon API Gateway.
    */
  var ResourceType: js.UndefOr[typings.awsSdk.wafregionalMod.ResourceType] = js.undefined
  
  /**
    * The unique identifier (ID) of the web ACL for which to list the associated resources.
    */
  var WebACLId: ResourceId
}
object ListResourcesForWebACLRequest {
  
  inline def apply(WebACLId: ResourceId): ListResourcesForWebACLRequest = {
    val __obj = js.Dynamic.literal(WebACLId = WebACLId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListResourcesForWebACLRequest]
  }
  
  extension [Self <: ListResourcesForWebACLRequest](x: Self) {
    
    inline def setResourceType(value: ResourceType): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "ResourceType", js.undefined)
    
    inline def setWebACLId(value: ResourceId): Self = StObject.set(x, "WebACLId", value.asInstanceOf[js.Any])
  }
}
