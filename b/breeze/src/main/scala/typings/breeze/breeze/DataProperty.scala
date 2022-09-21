package typings.breeze.breeze

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataProperty
  extends StObject
     with IProperty {
  
  var complexTypeName: String
  
  var concurrencyMode: String
  
  var dataType: DataTypeSymbol
  
  var defaultValue: Any
  
  var isComplexProperty: Boolean
  
  var isInherited: Boolean
  
  var isNullable: Boolean
  
  var isPartOfKey: Boolean
  
  var isSettable: Boolean
  
  var isUnmapped: Boolean
  
  var maxLength: Double
  
  var relatedNavigationProperty: NavigationProperty
}
object DataProperty {
  
  inline def apply(
    complexTypeName: String,
    concurrencyMode: String,
    custom: Any,
    dataType: DataTypeSymbol,
    defaultValue: Any,
    displayName: String,
    isComplexProperty: Boolean,
    isDataProperty: Boolean,
    isInherited: Boolean,
    isNavigationProperty: Boolean,
    isNullable: Boolean,
    isPartOfKey: Boolean,
    isSettable: Boolean,
    isUnmapped: Boolean,
    maxLength: Double,
    name: String,
    nameOnServer: String,
    parentType: EntityType | ComplexType,
    relatedNavigationProperty: NavigationProperty,
    validators: js.Array[Validator]
  ): DataProperty = {
    val __obj = js.Dynamic.literal(complexTypeName = complexTypeName.asInstanceOf[js.Any], concurrencyMode = concurrencyMode.asInstanceOf[js.Any], custom = custom.asInstanceOf[js.Any], dataType = dataType.asInstanceOf[js.Any], defaultValue = defaultValue.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], isComplexProperty = isComplexProperty.asInstanceOf[js.Any], isDataProperty = isDataProperty.asInstanceOf[js.Any], isInherited = isInherited.asInstanceOf[js.Any], isNavigationProperty = isNavigationProperty.asInstanceOf[js.Any], isNullable = isNullable.asInstanceOf[js.Any], isPartOfKey = isPartOfKey.asInstanceOf[js.Any], isSettable = isSettable.asInstanceOf[js.Any], isUnmapped = isUnmapped.asInstanceOf[js.Any], maxLength = maxLength.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nameOnServer = nameOnServer.asInstanceOf[js.Any], parentType = parentType.asInstanceOf[js.Any], relatedNavigationProperty = relatedNavigationProperty.asInstanceOf[js.Any], validators = validators.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataProperty]
  }
  
  extension [Self <: DataProperty](x: Self) {
    
    inline def setComplexTypeName(value: String): Self = StObject.set(x, "complexTypeName", value.asInstanceOf[js.Any])
    
    inline def setConcurrencyMode(value: String): Self = StObject.set(x, "concurrencyMode", value.asInstanceOf[js.Any])
    
    inline def setDataType(value: DataTypeSymbol): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
    
    inline def setDefaultValue(value: Any): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setIsComplexProperty(value: Boolean): Self = StObject.set(x, "isComplexProperty", value.asInstanceOf[js.Any])
    
    inline def setIsInherited(value: Boolean): Self = StObject.set(x, "isInherited", value.asInstanceOf[js.Any])
    
    inline def setIsNullable(value: Boolean): Self = StObject.set(x, "isNullable", value.asInstanceOf[js.Any])
    
    inline def setIsPartOfKey(value: Boolean): Self = StObject.set(x, "isPartOfKey", value.asInstanceOf[js.Any])
    
    inline def setIsSettable(value: Boolean): Self = StObject.set(x, "isSettable", value.asInstanceOf[js.Any])
    
    inline def setIsUnmapped(value: Boolean): Self = StObject.set(x, "isUnmapped", value.asInstanceOf[js.Any])
    
    inline def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
    
    inline def setRelatedNavigationProperty(value: NavigationProperty): Self = StObject.set(x, "relatedNavigationProperty", value.asInstanceOf[js.Any])
  }
}
