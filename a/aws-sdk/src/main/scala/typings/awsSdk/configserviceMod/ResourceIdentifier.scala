package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceIdentifier extends StObject {
  
  /**
    * The time that the resource was deleted.
    */
  var resourceDeletionTime: js.UndefOr[ResourceDeletionTime] = js.undefined
  
  /**
    * The ID of the resource (for example, sg-xxxxxx).
    */
  var resourceId: js.UndefOr[ResourceId] = js.undefined
  
  /**
    * The custom name of the resource (if available).
    */
  var resourceName: js.UndefOr[ResourceName] = js.undefined
  
  /**
    * The type of resource.
    */
  var resourceType: js.UndefOr[ResourceType] = js.undefined
}
object ResourceIdentifier {
  
  inline def apply(): ResourceIdentifier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceIdentifier]
  }
  
  extension [Self <: ResourceIdentifier](x: Self) {
    
    inline def setResourceDeletionTime(value: ResourceDeletionTime): Self = StObject.set(x, "resourceDeletionTime", value.asInstanceOf[js.Any])
    
    inline def setResourceDeletionTimeUndefined: Self = StObject.set(x, "resourceDeletionTime", js.undefined)
    
    inline def setResourceId(value: ResourceId): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
    
    inline def setResourceIdUndefined: Self = StObject.set(x, "resourceId", js.undefined)
    
    inline def setResourceName(value: ResourceName): Self = StObject.set(x, "resourceName", value.asInstanceOf[js.Any])
    
    inline def setResourceNameUndefined: Self = StObject.set(x, "resourceName", js.undefined)
    
    inline def setResourceType(value: ResourceType): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
  }
}
