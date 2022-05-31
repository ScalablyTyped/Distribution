package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPropertyDescriptionForEdition extends StObject {
  
  /** display name of the property */
  var displayName: String
  
  /** group of the property - all properties with the same group value will be displayed in a specific section */
  var groupName: String
  
  /** options for the property */
  var options: IEditablePropertyOption
  
  /** name of the property */
  var propertyName: String
  
  /** type of the property */
  var `type`: PropertyTypeForEdition
}
object IPropertyDescriptionForEdition {
  
  inline def apply(
    displayName: String,
    groupName: String,
    options: IEditablePropertyOption,
    propertyName: String,
    `type`: PropertyTypeForEdition
  ): IPropertyDescriptionForEdition = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], groupName = groupName.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], propertyName = propertyName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPropertyDescriptionForEdition]
  }
  
  extension [Self <: IPropertyDescriptionForEdition](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setGroupName(value: String): Self = StObject.set(x, "groupName", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: IEditablePropertyOption): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setPropertyName(value: String): Self = StObject.set(x, "propertyName", value.asInstanceOf[js.Any])
    
    inline def setType(value: PropertyTypeForEdition): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
