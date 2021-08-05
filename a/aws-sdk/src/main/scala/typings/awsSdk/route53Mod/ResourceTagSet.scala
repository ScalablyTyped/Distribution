package typings.awsSdk.route53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceTagSet extends StObject {
  
  /**
    * The ID for the specified resource.
    */
  var ResourceId: js.UndefOr[TagResourceId] = js.undefined
  
  /**
    * The type of the resource.   The resource type for health checks is healthcheck.   The resource type for hosted zones is hostedzone.  
    */
  var ResourceType: js.UndefOr[TagResourceType] = js.undefined
  
  /**
    * The tags associated with the specified resource.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object ResourceTagSet {
  
  inline def apply(): ResourceTagSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceTagSet]
  }
  
  extension [Self <: ResourceTagSet](x: Self) {
    
    inline def setResourceId(value: TagResourceId): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    inline def setResourceIdUndefined: Self = StObject.set(x, "ResourceId", js.undefined)
    
    inline def setResourceType(value: TagResourceType): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "ResourceType", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
