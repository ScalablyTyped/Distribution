package typings.blocks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/////////////////////////////////////////
// App.Property
/////////////////////////////////////////
trait PropertyPrototype extends StObject {
  
  var creditcard: js.UndefOr[Validator] = js.undefined
  
  var date: js.UndefOr[Validator] = js.undefined
  
  var defaultValue: js.UndefOr[js.Any] = js.undefined
  
  var digits: js.UndefOr[Validator] = js.undefined
  
  var email: js.UndefOr[Validator] = js.undefined
  
  @JSName("equals")
  var equals_FPropertyPrototype: js.UndefOr[Validator] = js.undefined
  
  var field: js.UndefOr[String] = js.undefined
  
  var isObservable: js.UndefOr[Boolean] = js.undefined
  
  var letters: js.UndefOr[Validator] = js.undefined
  
  var max: js.UndefOr[Validator] = js.undefined
  
  var maxErrors: js.UndefOr[Double] = js.undefined
  
  var maxlength: js.UndefOr[Validator] = js.undefined
  
  var min: js.UndefOr[Validator] = js.undefined
  
  var minlength: js.UndefOr[Validator] = js.undefined
  
  var number: js.UndefOr[Validator] = js.undefined
  
  var regexp: js.UndefOr[Validator] = js.undefined
  
  // Validators
  var required: js.UndefOr[Validator] = js.undefined
  
  var url: js.UndefOr[Validator] = js.undefined
  
  var validateInitially: js.UndefOr[Boolean] = js.undefined
  
  var validateOnChange: js.UndefOr[Boolean] = js.undefined
  
  var value: js.UndefOr[js.Any] = js.undefined
}
object PropertyPrototype {
  
  inline def apply(): PropertyPrototype = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PropertyPrototype]
  }
  
  extension [Self <: PropertyPrototype](x: Self) {
    
    inline def setCreditcard(value: Validator): Self = StObject.set(x, "creditcard", value.asInstanceOf[js.Any])
    
    inline def setCreditcardUndefined: Self = StObject.set(x, "creditcard", js.undefined)
    
    inline def setDate(value: Validator): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setDefaultValue(value: js.Any): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    inline def setDigits(value: Validator): Self = StObject.set(x, "digits", value.asInstanceOf[js.Any])
    
    inline def setDigitsUndefined: Self = StObject.set(x, "digits", js.undefined)
    
    inline def setEmail(value: Validator): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setEquals_(value: Validator): Self = StObject.set(x, "equals", value.asInstanceOf[js.Any])
    
    inline def setEquals_Undefined: Self = StObject.set(x, "equals", js.undefined)
    
    inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    inline def setIsObservable(value: Boolean): Self = StObject.set(x, "isObservable", value.asInstanceOf[js.Any])
    
    inline def setIsObservableUndefined: Self = StObject.set(x, "isObservable", js.undefined)
    
    inline def setLetters(value: Validator): Self = StObject.set(x, "letters", value.asInstanceOf[js.Any])
    
    inline def setLettersUndefined: Self = StObject.set(x, "letters", js.undefined)
    
    inline def setMax(value: Validator): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxErrors(value: Double): Self = StObject.set(x, "maxErrors", value.asInstanceOf[js.Any])
    
    inline def setMaxErrorsUndefined: Self = StObject.set(x, "maxErrors", js.undefined)
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMaxlength(value: Validator): Self = StObject.set(x, "maxlength", value.asInstanceOf[js.Any])
    
    inline def setMaxlengthUndefined: Self = StObject.set(x, "maxlength", js.undefined)
    
    inline def setMin(value: Validator): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setMinlength(value: Validator): Self = StObject.set(x, "minlength", value.asInstanceOf[js.Any])
    
    inline def setMinlengthUndefined: Self = StObject.set(x, "minlength", js.undefined)
    
    inline def setNumber(value: Validator): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
    
    inline def setRegexp(value: Validator): Self = StObject.set(x, "regexp", value.asInstanceOf[js.Any])
    
    inline def setRegexpUndefined: Self = StObject.set(x, "regexp", js.undefined)
    
    inline def setRequired(value: Validator): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    inline def setUrl(value: Validator): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setValidateInitially(value: Boolean): Self = StObject.set(x, "validateInitially", value.asInstanceOf[js.Any])
    
    inline def setValidateInitiallyUndefined: Self = StObject.set(x, "validateInitially", js.undefined)
    
    inline def setValidateOnChange(value: Boolean): Self = StObject.set(x, "validateOnChange", value.asInstanceOf[js.Any])
    
    inline def setValidateOnChangeUndefined: Self = StObject.set(x, "validateOnChange", js.undefined)
    
    inline def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
