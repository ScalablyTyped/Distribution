package typings.awsSdk.iottwinmakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateEntityRequest extends StObject {
  
  /**
    * An object that maps strings to the component updates in the request. Each string in the mapping must be unique to this object.
    */
  var componentUpdates: js.UndefOr[ComponentUpdatesMapRequest] = js.undefined
  
  /**
    * The description of the entity.
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    * The ID of the entity.
    */
  var entityId: EntityId
  
  /**
    * The name of the entity.
    */
  var entityName: js.UndefOr[EntityName] = js.undefined
  
  /**
    * An object that describes the update request for a parent entity.
    */
  var parentEntityUpdate: js.UndefOr[ParentEntityUpdateRequest] = js.undefined
  
  /**
    * The ID of the workspace that contains the entity.
    */
  var workspaceId: Id
}
object UpdateEntityRequest {
  
  inline def apply(entityId: EntityId, workspaceId: Id): UpdateEntityRequest = {
    val __obj = js.Dynamic.literal(entityId = entityId.asInstanceOf[js.Any], workspaceId = workspaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateEntityRequest]
  }
  
  extension [Self <: UpdateEntityRequest](x: Self) {
    
    inline def setComponentUpdates(value: ComponentUpdatesMapRequest): Self = StObject.set(x, "componentUpdates", value.asInstanceOf[js.Any])
    
    inline def setComponentUpdatesUndefined: Self = StObject.set(x, "componentUpdates", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEntityId(value: EntityId): Self = StObject.set(x, "entityId", value.asInstanceOf[js.Any])
    
    inline def setEntityName(value: EntityName): Self = StObject.set(x, "entityName", value.asInstanceOf[js.Any])
    
    inline def setEntityNameUndefined: Self = StObject.set(x, "entityName", js.undefined)
    
    inline def setParentEntityUpdate(value: ParentEntityUpdateRequest): Self = StObject.set(x, "parentEntityUpdate", value.asInstanceOf[js.Any])
    
    inline def setParentEntityUpdateUndefined: Self = StObject.set(x, "parentEntityUpdate", js.undefined)
    
    inline def setWorkspaceId(value: Id): Self = StObject.set(x, "workspaceId", value.asInstanceOf[js.Any])
  }
}
