package typings.awsSdk.iottwinmakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetComponentTypeResponse extends StObject {
  
  /**
    * The ARN of the component type.
    */
  var arn: TwinMakerArn
  
  /**
    * The ID of the component type.
    */
  var componentTypeId: ComponentTypeId
  
  /**
    * The date and time when the component type was created.
    */
  var creationDateTime: js.Date
  
  /**
    * The description of the component type.
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    * The name of the parent component type that this component type extends.
    */
  var extendsFrom: js.UndefOr[ExtendsFrom] = js.undefined
  
  /**
    * An object that maps strings to the functions in the component type. Each string in the mapping must be unique to this object.
    */
  var functions: js.UndefOr[FunctionsResponse] = js.undefined
  
  /**
    * A Boolean value that specifies whether the component type is abstract.
    */
  var isAbstract: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A Boolean value that specifies whether the component type has a schema initializer and that the schema initializer has run.
    */
  var isSchemaInitialized: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A Boolean value that specifies whether an entity can have more than one component of this type.
    */
  var isSingleton: js.UndefOr[Boolean] = js.undefined
  
  /**
    * An object that maps strings to the property definitions in the component type. Each string in the mapping must be unique to this object.
    */
  var propertyDefinitions: js.UndefOr[PropertyDefinitionsResponse] = js.undefined
  
  /**
    * The current status of the component type.
    */
  var status: js.UndefOr[Status] = js.undefined
  
  /**
    * The date and time when the component was last updated.
    */
  var updateDateTime: js.Date
  
  /**
    * The ID of the workspace that contains the component type.
    */
  var workspaceId: Id
}
object GetComponentTypeResponse {
  
  inline def apply(
    arn: TwinMakerArn,
    componentTypeId: ComponentTypeId,
    creationDateTime: js.Date,
    updateDateTime: js.Date,
    workspaceId: Id
  ): GetComponentTypeResponse = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], componentTypeId = componentTypeId.asInstanceOf[js.Any], creationDateTime = creationDateTime.asInstanceOf[js.Any], updateDateTime = updateDateTime.asInstanceOf[js.Any], workspaceId = workspaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetComponentTypeResponse]
  }
  
  extension [Self <: GetComponentTypeResponse](x: Self) {
    
    inline def setArn(value: TwinMakerArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setComponentTypeId(value: ComponentTypeId): Self = StObject.set(x, "componentTypeId", value.asInstanceOf[js.Any])
    
    inline def setCreationDateTime(value: js.Date): Self = StObject.set(x, "creationDateTime", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setExtendsFrom(value: ExtendsFrom): Self = StObject.set(x, "extendsFrom", value.asInstanceOf[js.Any])
    
    inline def setExtendsFromUndefined: Self = StObject.set(x, "extendsFrom", js.undefined)
    
    inline def setExtendsFromVarargs(value: ComponentTypeId*): Self = StObject.set(x, "extendsFrom", js.Array(value*))
    
    inline def setFunctions(value: FunctionsResponse): Self = StObject.set(x, "functions", value.asInstanceOf[js.Any])
    
    inline def setFunctionsUndefined: Self = StObject.set(x, "functions", js.undefined)
    
    inline def setIsAbstract(value: Boolean): Self = StObject.set(x, "isAbstract", value.asInstanceOf[js.Any])
    
    inline def setIsAbstractUndefined: Self = StObject.set(x, "isAbstract", js.undefined)
    
    inline def setIsSchemaInitialized(value: Boolean): Self = StObject.set(x, "isSchemaInitialized", value.asInstanceOf[js.Any])
    
    inline def setIsSchemaInitializedUndefined: Self = StObject.set(x, "isSchemaInitialized", js.undefined)
    
    inline def setIsSingleton(value: Boolean): Self = StObject.set(x, "isSingleton", value.asInstanceOf[js.Any])
    
    inline def setIsSingletonUndefined: Self = StObject.set(x, "isSingleton", js.undefined)
    
    inline def setPropertyDefinitions(value: PropertyDefinitionsResponse): Self = StObject.set(x, "propertyDefinitions", value.asInstanceOf[js.Any])
    
    inline def setPropertyDefinitionsUndefined: Self = StObject.set(x, "propertyDefinitions", js.undefined)
    
    inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setUpdateDateTime(value: js.Date): Self = StObject.set(x, "updateDateTime", value.asInstanceOf[js.Any])
    
    inline def setWorkspaceId(value: Id): Self = StObject.set(x, "workspaceId", value.asInstanceOf[js.Any])
  }
}
