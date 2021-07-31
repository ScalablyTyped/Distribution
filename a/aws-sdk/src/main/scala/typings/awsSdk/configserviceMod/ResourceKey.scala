package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceKey extends StObject {
  
  /**
    * The ID of the resource (for example., sg-xxxxxx). 
    */
  var resourceId: ResourceId
  
  /**
    * The resource type.
    */
  var resourceType: ResourceType
}
object ResourceKey {
  
  @scala.inline
  def apply(resourceId: ResourceId, resourceType: ResourceType): ResourceKey = {
    val __obj = js.Dynamic.literal(resourceId = resourceId.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceKey]
  }
  
  @scala.inline
  implicit class ResourceKeyMutableBuilder[Self <: ResourceKey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceId(value: ResourceId): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceType(value: ResourceType): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
  }
}
