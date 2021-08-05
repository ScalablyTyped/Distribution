package typings.breeze.breeze

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataPropertyOptions extends StObject {
  
  var complexTypeName: js.UndefOr[String] = js.undefined
  
  var concurrencyMode: js.UndefOr[String] = js.undefined
  
  var custom: js.UndefOr[js.Any] = js.undefined
  
  var dataType: js.UndefOr[DataTypeSymbol] = js.undefined
  
  var defaultValue: js.UndefOr[js.Any] = js.undefined
  
  var displayName: js.UndefOr[String] = js.undefined
  
  var isNullable: js.UndefOr[Boolean] = js.undefined
  
  var isPartOfKey: js.UndefOr[Boolean] = js.undefined
  
  var isScalar: js.UndefOr[Boolean] = js.undefined
  
  var isUnmapped: js.UndefOr[Boolean] = js.undefined
  
  var maxLength: js.UndefOr[Double] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var nameOnServer: js.UndefOr[String] = js.undefined
  
  var validators: js.UndefOr[js.Array[Validator]] = js.undefined
}
object DataPropertyOptions {
  
  inline def apply(): DataPropertyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataPropertyOptions]
  }
  
  extension [Self <: DataPropertyOptions](x: Self) {
    
    inline def setComplexTypeName(value: String): Self = StObject.set(x, "complexTypeName", value.asInstanceOf[js.Any])
    
    inline def setComplexTypeNameUndefined: Self = StObject.set(x, "complexTypeName", js.undefined)
    
    inline def setConcurrencyMode(value: String): Self = StObject.set(x, "concurrencyMode", value.asInstanceOf[js.Any])
    
    inline def setConcurrencyModeUndefined: Self = StObject.set(x, "concurrencyMode", js.undefined)
    
    inline def setCustom(value: js.Any): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
    
    inline def setCustomUndefined: Self = StObject.set(x, "custom", js.undefined)
    
    inline def setDataType(value: DataTypeSymbol): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
    
    inline def setDataTypeUndefined: Self = StObject.set(x, "dataType", js.undefined)
    
    inline def setDefaultValue(value: js.Any): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setIsNullable(value: Boolean): Self = StObject.set(x, "isNullable", value.asInstanceOf[js.Any])
    
    inline def setIsNullableUndefined: Self = StObject.set(x, "isNullable", js.undefined)
    
    inline def setIsPartOfKey(value: Boolean): Self = StObject.set(x, "isPartOfKey", value.asInstanceOf[js.Any])
    
    inline def setIsPartOfKeyUndefined: Self = StObject.set(x, "isPartOfKey", js.undefined)
    
    inline def setIsScalar(value: Boolean): Self = StObject.set(x, "isScalar", value.asInstanceOf[js.Any])
    
    inline def setIsScalarUndefined: Self = StObject.set(x, "isScalar", js.undefined)
    
    inline def setIsUnmapped(value: Boolean): Self = StObject.set(x, "isUnmapped", value.asInstanceOf[js.Any])
    
    inline def setIsUnmappedUndefined: Self = StObject.set(x, "isUnmapped", js.undefined)
    
    inline def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
    
    inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameOnServer(value: String): Self = StObject.set(x, "nameOnServer", value.asInstanceOf[js.Any])
    
    inline def setNameOnServerUndefined: Self = StObject.set(x, "nameOnServer", js.undefined)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setValidators(value: js.Array[Validator]): Self = StObject.set(x, "validators", value.asInstanceOf[js.Any])
    
    inline def setValidatorsUndefined: Self = StObject.set(x, "validators", js.undefined)
    
    inline def setValidatorsVarargs(value: Validator*): Self = StObject.set(x, "validators", js.Array(value :_*))
  }
}
