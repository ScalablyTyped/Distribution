package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceOption extends StObject {
  
  var categoryValues: js.Array[CategoryValue]
  
  var defaultValue: String
  
  var description: String
  
  var displayName: String
  
  var groupName: String
  
  var isArray: Boolean
  
  var isRequired: Boolean
  
  var name: String
  
  var objectType: String
  
  var valueType: ServiceOptionType
}
object ServiceOption {
  
  inline def apply(
    categoryValues: js.Array[CategoryValue],
    defaultValue: String,
    description: String,
    displayName: String,
    groupName: String,
    isArray: Boolean,
    isRequired: Boolean,
    name: String,
    objectType: String,
    valueType: ServiceOptionType
  ): ServiceOption = {
    val __obj = js.Dynamic.literal(categoryValues = categoryValues.asInstanceOf[js.Any], defaultValue = defaultValue.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], groupName = groupName.asInstanceOf[js.Any], isArray = isArray.asInstanceOf[js.Any], isRequired = isRequired.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], objectType = objectType.asInstanceOf[js.Any], valueType = valueType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceOption]
  }
  
  extension [Self <: ServiceOption](x: Self) {
    
    inline def setCategoryValues(value: js.Array[CategoryValue]): Self = StObject.set(x, "categoryValues", value.asInstanceOf[js.Any])
    
    inline def setCategoryValuesVarargs(value: CategoryValue*): Self = StObject.set(x, "categoryValues", js.Array(value :_*))
    
    inline def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setGroupName(value: String): Self = StObject.set(x, "groupName", value.asInstanceOf[js.Any])
    
    inline def setIsArray(value: Boolean): Self = StObject.set(x, "isArray", value.asInstanceOf[js.Any])
    
    inline def setIsRequired(value: Boolean): Self = StObject.set(x, "isRequired", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setObjectType(value: String): Self = StObject.set(x, "objectType", value.asInstanceOf[js.Any])
    
    inline def setValueType(value: ServiceOptionType): Self = StObject.set(x, "valueType", value.asInstanceOf[js.Any])
  }
}
