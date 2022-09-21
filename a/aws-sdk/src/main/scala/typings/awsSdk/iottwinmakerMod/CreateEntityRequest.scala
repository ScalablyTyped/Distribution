package typings.awsSdk.iottwinmakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateEntityRequest extends StObject {
  
  /**
    * An object that maps strings to the components in the entity. Each string in the mapping must be unique to this object.
    */
  var components: js.UndefOr[ComponentsMapRequest] = js.undefined
  
  /**
    * The description of the entity.
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    * The ID of the entity.
    */
  var entityId: js.UndefOr[EntityId] = js.undefined
  
  /**
    * The name of the entity.
    */
  var entityName: EntityName
  
  /**
    * The ID of the entity's parent entity.
    */
  var parentEntityId: js.UndefOr[ParentEntityId] = js.undefined
  
  /**
    * Metadata that you can use to manage the entity.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
  
  /**
    * The ID of the workspace that contains the entity.
    */
  var workspaceId: Id
}
object CreateEntityRequest {
  
  inline def apply(entityName: EntityName, workspaceId: Id): CreateEntityRequest = {
    val __obj = js.Dynamic.literal(entityName = entityName.asInstanceOf[js.Any], workspaceId = workspaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateEntityRequest]
  }
  
  extension [Self <: CreateEntityRequest](x: Self) {
    
    inline def setComponents(value: ComponentsMapRequest): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
    
    inline def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEntityId(value: EntityId): Self = StObject.set(x, "entityId", value.asInstanceOf[js.Any])
    
    inline def setEntityIdUndefined: Self = StObject.set(x, "entityId", js.undefined)
    
    inline def setEntityName(value: EntityName): Self = StObject.set(x, "entityName", value.asInstanceOf[js.Any])
    
    inline def setParentEntityId(value: ParentEntityId): Self = StObject.set(x, "parentEntityId", value.asInstanceOf[js.Any])
    
    inline def setParentEntityIdUndefined: Self = StObject.set(x, "parentEntityId", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setWorkspaceId(value: Id): Self = StObject.set(x, "workspaceId", value.asInstanceOf[js.Any])
  }
}
