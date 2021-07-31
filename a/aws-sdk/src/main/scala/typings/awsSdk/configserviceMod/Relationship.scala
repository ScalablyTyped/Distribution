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
  
  @scala.inline
  def apply(): Relationship = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Relationship]
  }
  
  @scala.inline
  implicit class RelationshipMutableBuilder[Self <: Relationship] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRelationshipName(value: RelationshipName): Self = StObject.set(x, "relationshipName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelationshipNameUndefined: Self = StObject.set(x, "relationshipName", js.undefined)
    
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
