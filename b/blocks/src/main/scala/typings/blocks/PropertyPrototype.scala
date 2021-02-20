package typings.blocks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/////////////////////////////////////////
// App.Property
/////////////////////////////////////////
@js.native
trait PropertyPrototype extends StObject {
  
  var creditcard: js.UndefOr[Validator] = js.native
  
  var date: js.UndefOr[Validator] = js.native
  
  var defaultValue: js.UndefOr[js.Any] = js.native
  
  var digits: js.UndefOr[Validator] = js.native
  
  var email: js.UndefOr[Validator] = js.native
  
  @JSName("equals")
  var equals_FPropertyPrototype: js.UndefOr[Validator] = js.native
  
  var field: js.UndefOr[String] = js.native
  
  var isObservable: js.UndefOr[Boolean] = js.native
  
  var letters: js.UndefOr[Validator] = js.native
  
  var max: js.UndefOr[Validator] = js.native
  
  var maxErrors: js.UndefOr[Double] = js.native
  
  var maxlength: js.UndefOr[Validator] = js.native
  
  var min: js.UndefOr[Validator] = js.native
  
  var minlength: js.UndefOr[Validator] = js.native
  
  var number: js.UndefOr[Validator] = js.native
  
  var regexp: js.UndefOr[Validator] = js.native
  
  // Validators
  var required: js.UndefOr[Validator] = js.native
  
  var url: js.UndefOr[Validator] = js.native
  
  var validateInitially: js.UndefOr[Boolean] = js.native
  
  var validateOnChange: js.UndefOr[Boolean] = js.native
  
  var value: js.UndefOr[js.Any] = js.native
}
object PropertyPrototype {
  
  @scala.inline
  def apply(): PropertyPrototype = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PropertyPrototype]
  }
  
  @scala.inline
  implicit class PropertyPrototypeMutableBuilder[Self <: PropertyPrototype] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreditcard(value: Validator): Self = StObject.set(x, "creditcard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreditcardUndefined: Self = StObject.set(x, "creditcard", js.undefined)
    
    @scala.inline
    def setDate(value: Validator): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    @scala.inline
    def setDefaultValue(value: js.Any): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    @scala.inline
    def setDigits(value: Validator): Self = StObject.set(x, "digits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDigitsUndefined: Self = StObject.set(x, "digits", js.undefined)
    
    @scala.inline
    def setEmail(value: Validator): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    @scala.inline
    def setEquals_(value: Validator): Self = StObject.set(x, "equals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEquals_Undefined: Self = StObject.set(x, "equals", js.undefined)
    
    @scala.inline
    def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    @scala.inline
    def setIsObservable(value: Boolean): Self = StObject.set(x, "isObservable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsObservableUndefined: Self = StObject.set(x, "isObservable", js.undefined)
    
    @scala.inline
    def setLetters(value: Validator): Self = StObject.set(x, "letters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLettersUndefined: Self = StObject.set(x, "letters", js.undefined)
    
    @scala.inline
    def setMax(value: Validator): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxErrors(value: Double): Self = StObject.set(x, "maxErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxErrorsUndefined: Self = StObject.set(x, "maxErrors", js.undefined)
    
    @scala.inline
    def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    @scala.inline
    def setMaxlength(value: Validator): Self = StObject.set(x, "maxlength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxlengthUndefined: Self = StObject.set(x, "maxlength", js.undefined)
    
    @scala.inline
    def setMin(value: Validator): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    @scala.inline
    def setMinlength(value: Validator): Self = StObject.set(x, "minlength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinlengthUndefined: Self = StObject.set(x, "minlength", js.undefined)
    
    @scala.inline
    def setNumber(value: Validator): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
    
    @scala.inline
    def setRegexp(value: Validator): Self = StObject.set(x, "regexp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegexpUndefined: Self = StObject.set(x, "regexp", js.undefined)
    
    @scala.inline
    def setRequired(value: Validator): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    @scala.inline
    def setUrl(value: Validator): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    @scala.inline
    def setValidateInitially(value: Boolean): Self = StObject.set(x, "validateInitially", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidateInitiallyUndefined: Self = StObject.set(x, "validateInitially", js.undefined)
    
    @scala.inline
    def setValidateOnChange(value: Boolean): Self = StObject.set(x, "validateOnChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidateOnChangeUndefined: Self = StObject.set(x, "validateOnChange", js.undefined)
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
