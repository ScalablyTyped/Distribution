package typings.breeze.breeze

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataPropertyOptions extends StObject {
  
  var complexTypeName: js.UndefOr[String] = js.native
  
  var concurrencyMode: js.UndefOr[String] = js.native
  
  var custom: js.UndefOr[js.Any] = js.native
  
  var dataType: js.UndefOr[DataTypeSymbol] = js.native
  
  var defaultValue: js.UndefOr[js.Any] = js.native
  
  var displayName: js.UndefOr[String] = js.native
  
  var isNullable: js.UndefOr[Boolean] = js.native
  
  var isPartOfKey: js.UndefOr[Boolean] = js.native
  
  var isScalar: js.UndefOr[Boolean] = js.native
  
  var isUnmapped: js.UndefOr[Boolean] = js.native
  
  var maxLength: js.UndefOr[Double] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var nameOnServer: js.UndefOr[String] = js.native
  
  var validators: js.UndefOr[js.Array[Validator]] = js.native
}
object DataPropertyOptions {
  
  @scala.inline
  def apply(): DataPropertyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataPropertyOptions]
  }
  
  @scala.inline
  implicit class DataPropertyOptionsMutableBuilder[Self <: DataPropertyOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplexTypeName(value: String): Self = StObject.set(x, "complexTypeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComplexTypeNameUndefined: Self = StObject.set(x, "complexTypeName", js.undefined)
    
    @scala.inline
    def setConcurrencyMode(value: String): Self = StObject.set(x, "concurrencyMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConcurrencyModeUndefined: Self = StObject.set(x, "concurrencyMode", js.undefined)
    
    @scala.inline
    def setCustom(value: js.Any): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomUndefined: Self = StObject.set(x, "custom", js.undefined)
    
    @scala.inline
    def setDataType(value: DataTypeSymbol): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataTypeUndefined: Self = StObject.set(x, "dataType", js.undefined)
    
    @scala.inline
    def setDefaultValue(value: js.Any): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setIsNullable(value: Boolean): Self = StObject.set(x, "isNullable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsNullableUndefined: Self = StObject.set(x, "isNullable", js.undefined)
    
    @scala.inline
    def setIsPartOfKey(value: Boolean): Self = StObject.set(x, "isPartOfKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsPartOfKeyUndefined: Self = StObject.set(x, "isPartOfKey", js.undefined)
    
    @scala.inline
    def setIsScalar(value: Boolean): Self = StObject.set(x, "isScalar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsScalarUndefined: Self = StObject.set(x, "isScalar", js.undefined)
    
    @scala.inline
    def setIsUnmapped(value: Boolean): Self = StObject.set(x, "isUnmapped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsUnmappedUndefined: Self = StObject.set(x, "isUnmapped", js.undefined)
    
    @scala.inline
    def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameOnServer(value: String): Self = StObject.set(x, "nameOnServer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameOnServerUndefined: Self = StObject.set(x, "nameOnServer", js.undefined)
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setValidators(value: js.Array[Validator]): Self = StObject.set(x, "validators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidatorsUndefined: Self = StObject.set(x, "validators", js.undefined)
    
    @scala.inline
    def setValidatorsVarargs(value: Validator*): Self = StObject.set(x, "validators", js.Array(value :_*))
  }
}
