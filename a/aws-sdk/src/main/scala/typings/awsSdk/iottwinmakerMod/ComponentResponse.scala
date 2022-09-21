package typings.awsSdk.iottwinmakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentResponse extends StObject {
  
  /**
    * The name of the component.
    */
  var componentName: js.UndefOr[Name] = js.undefined
  
  /**
    * The ID of the component type.
    */
  var componentTypeId: js.UndefOr[ComponentTypeId] = js.undefined
  
  /**
    * The name of the property definition set in the request.
    */
  var definedIn: js.UndefOr[String] = js.undefined
  
  /**
    * The description of the component type.
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    * An object that maps strings to the properties to set in the component type. Each string in the mapping must be unique to this object.
    */
  var properties: js.UndefOr[PropertyResponses] = js.undefined
  
  /**
    * The status of the component type.
    */
  var status: js.UndefOr[Status] = js.undefined
}
object ComponentResponse {
  
  inline def apply(): ComponentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComponentResponse]
  }
  
  extension [Self <: ComponentResponse](x: Self) {
    
    inline def setComponentName(value: Name): Self = StObject.set(x, "componentName", value.asInstanceOf[js.Any])
    
    inline def setComponentNameUndefined: Self = StObject.set(x, "componentName", js.undefined)
    
    inline def setComponentTypeId(value: ComponentTypeId): Self = StObject.set(x, "componentTypeId", value.asInstanceOf[js.Any])
    
    inline def setComponentTypeIdUndefined: Self = StObject.set(x, "componentTypeId", js.undefined)
    
    inline def setDefinedIn(value: String): Self = StObject.set(x, "definedIn", value.asInstanceOf[js.Any])
    
    inline def setDefinedInUndefined: Self = StObject.set(x, "definedIn", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setProperties(value: PropertyResponses): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
