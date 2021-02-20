package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceIdentifier extends StObject {
  
  /**
    * The time that the resource was deleted.
    */
  var resourceDeletionTime: js.UndefOr[ResourceDeletionTime] = js.native
  
  /**
    * The ID of the resource (for example, sg-xxxxxx).
    */
  var resourceId: js.UndefOr[ResourceId] = js.native
  
  /**
    * The custom name of the resource (if available).
    */
  var resourceName: js.UndefOr[ResourceName] = js.native
  
  /**
    * The type of resource.
    */
  var resourceType: js.UndefOr[ResourceType] = js.native
}
object ResourceIdentifier {
  
  @scala.inline
  def apply(): ResourceIdentifier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceIdentifier]
  }
  
  @scala.inline
  implicit class ResourceIdentifierMutableBuilder[Self <: ResourceIdentifier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceDeletionTime(value: ResourceDeletionTime): Self = StObject.set(x, "resourceDeletionTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceDeletionTimeUndefined: Self = StObject.set(x, "resourceDeletionTime", js.undefined)
    
    @scala.inline
    def setResourceId(value: ResourceId): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceIdUndefined: Self = StObject.set(x, "resourceId", js.undefined)
    
    @scala.inline
    def setResourceName(value: ResourceName): Self = StObject.set(x, "resourceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceNameUndefined: Self = StObject.set(x, "resourceName", js.undefined)
    
    @scala.inline
    def setResourceType(value: ResourceType): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
  }
}
