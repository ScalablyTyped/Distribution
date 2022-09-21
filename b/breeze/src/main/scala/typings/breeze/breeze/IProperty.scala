package typings.breeze.breeze

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IProperty extends StObject {
  
  var custom: Any
  
  var displayName: String
  
  var isDataProperty: Boolean
  
  var isNavigationProperty: Boolean
  
  var name: String
  
  var nameOnServer: String
  
  var parentType: EntityType | ComplexType
  
  var validators: js.Array[Validator]
}
object IProperty {
  
  inline def apply(
    custom: Any,
    displayName: String,
    isDataProperty: Boolean,
    isNavigationProperty: Boolean,
    name: String,
    nameOnServer: String,
    parentType: EntityType | ComplexType,
    validators: js.Array[Validator]
  ): IProperty = {
    val __obj = js.Dynamic.literal(custom = custom.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], isDataProperty = isDataProperty.asInstanceOf[js.Any], isNavigationProperty = isNavigationProperty.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nameOnServer = nameOnServer.asInstanceOf[js.Any], parentType = parentType.asInstanceOf[js.Any], validators = validators.asInstanceOf[js.Any])
    __obj.asInstanceOf[IProperty]
  }
  
  extension [Self <: IProperty](x: Self) {
    
    inline def setCustom(value: Any): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setIsDataProperty(value: Boolean): Self = StObject.set(x, "isDataProperty", value.asInstanceOf[js.Any])
    
    inline def setIsNavigationProperty(value: Boolean): Self = StObject.set(x, "isNavigationProperty", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameOnServer(value: String): Self = StObject.set(x, "nameOnServer", value.asInstanceOf[js.Any])
    
    inline def setParentType(value: EntityType | ComplexType): Self = StObject.set(x, "parentType", value.asInstanceOf[js.Any])
    
    inline def setValidators(value: js.Array[Validator]): Self = StObject.set(x, "validators", value.asInstanceOf[js.Any])
    
    inline def setValidatorsVarargs(value: Validator*): Self = StObject.set(x, "validators", js.Array(value*))
  }
}
