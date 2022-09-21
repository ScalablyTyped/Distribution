package typings.awsSdk.iottwinmakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateComponentTypeRequest extends StObject {
  
  /**
    * The ID of the component type.
    */
  var componentTypeId: ComponentTypeId
  
  /**
    * The description of the component type.
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    * Specifies the component type that this component type extends.
    */
  var extendsFrom: js.UndefOr[ExtendsFrom] = js.undefined
  
  /**
    * An object that maps strings to the functions in the component type. Each string in the mapping must be unique to this object.
    */
  var functions: js.UndefOr[FunctionsRequest] = js.undefined
  
  /**
    * A Boolean value that specifies whether an entity can have more than one component of this type.
    */
  var isSingleton: js.UndefOr[Boolean] = js.undefined
  
  /**
    * An object that maps strings to the property definitions in the component type. Each string in the mapping must be unique to this object.
    */
  var propertyDefinitions: js.UndefOr[PropertyDefinitionsRequest] = js.undefined
  
  /**
    * The ID of the workspace that contains the component type.
    */
  var workspaceId: Id
}
object UpdateComponentTypeRequest {
  
  inline def apply(componentTypeId: ComponentTypeId, workspaceId: Id): UpdateComponentTypeRequest = {
    val __obj = js.Dynamic.literal(componentTypeId = componentTypeId.asInstanceOf[js.Any], workspaceId = workspaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateComponentTypeRequest]
  }
  
  extension [Self <: UpdateComponentTypeRequest](x: Self) {
    
    inline def setComponentTypeId(value: ComponentTypeId): Self = StObject.set(x, "componentTypeId", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setExtendsFrom(value: ExtendsFrom): Self = StObject.set(x, "extendsFrom", value.asInstanceOf[js.Any])
    
    inline def setExtendsFromUndefined: Self = StObject.set(x, "extendsFrom", js.undefined)
    
    inline def setExtendsFromVarargs(value: ComponentTypeId*): Self = StObject.set(x, "extendsFrom", js.Array(value*))
    
    inline def setFunctions(value: FunctionsRequest): Self = StObject.set(x, "functions", value.asInstanceOf[js.Any])
    
    inline def setFunctionsUndefined: Self = StObject.set(x, "functions", js.undefined)
    
    inline def setIsSingleton(value: Boolean): Self = StObject.set(x, "isSingleton", value.asInstanceOf[js.Any])
    
    inline def setIsSingletonUndefined: Self = StObject.set(x, "isSingleton", js.undefined)
    
    inline def setPropertyDefinitions(value: PropertyDefinitionsRequest): Self = StObject.set(x, "propertyDefinitions", value.asInstanceOf[js.Any])
    
    inline def setPropertyDefinitionsUndefined: Self = StObject.set(x, "propertyDefinitions", js.undefined)
    
    inline def setWorkspaceId(value: Id): Self = StObject.set(x, "workspaceId", value.asInstanceOf[js.Any])
  }
}
