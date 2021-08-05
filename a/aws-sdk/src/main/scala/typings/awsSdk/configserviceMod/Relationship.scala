package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Relationship extends StObject {
  
  /**
    * The type of relationship with the related resource.
    */
  var relationshipName: js.UndefOr[RelationshipName] = js.undefined
  
  /**
    * The ID of the related resource (for example, sg-xxxxxx).
    */
  var resourceId: js.UndefOr[ResourceId] = js.undefined
  
  /**
    * The custom name of the related resource, if available.
    */
  var resourceName: js.UndefOr[ResourceName] = js.undefined
  
  /**
    * The resource type of the related resource.
    */
  var resourceType: js.UndefOr[ResourceType] = js.undefined
}
object Relationship {
  
  inline def apply(): Relationship = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Relationship]
  }
  
  extension [Self <: Relationship](x: Self) {
    
    inline def setRelationshipName(value: RelationshipName): Self = StObject.set(x, "relationshipName", value.asInstanceOf[js.Any])
    
    inline def setRelationshipNameUndefined: Self = StObject.set(x, "relationshipName", js.undefined)
    
    inline def setResourceId(value: ResourceId): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
    
    inline def setResourceIdUndefined: Self = StObject.set(x, "resourceId", js.undefined)
    
    inline def setResourceName(value: ResourceName): Self = StObject.set(x, "resourceName", value.asInstanceOf[js.Any])
    
    inline def setResourceNameUndefined: Self = StObject.set(x, "resourceName", js.undefined)
    
    inline def setResourceType(value: ResourceType): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
  }
}
