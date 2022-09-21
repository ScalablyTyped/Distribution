package typings.devextremeB5DqTZzf.mod.DevExpress.ui

import typings.devextremeB5DqTZzf.anon.ApplyValidationResults
import typings.devextremeB5DqTZzf.mod.DevExpress.DOMComponentOptions
import typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxValidator.ValidatedEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxValidatorOptions
  extends StObject
     with DOMComponentOptions[dxValidator] {
  
  /**
    * An object that specifies what and when to validate, and how to apply the validation result.
    */
  var adapter: js.UndefOr[ApplyValidationResults] = js.undefined
  
  /**
    * Specifies the editor name to be used in the validation default messages.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * A function that is executed after a value is validated.
    */
  var onValidated: js.UndefOr[js.Function1[/* validatedInfo */ ValidatedEvent, Unit]] = js.undefined
  
  /**
    * Specifies the validation group the editor will be related to.
    */
  var validationGroup: js.UndefOr[String] = js.undefined
  
  /**
    * An array of validation rules to be checked for the editor with which the dxValidator object is associated.
    */
  var validationRules: js.UndefOr[js.Array[ValidationRule]] = js.undefined
}
object dxValidatorOptions {
  
  inline def apply(): dxValidatorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxValidatorOptions]
  }
  
  extension [Self <: dxValidatorOptions](x: Self) {
    
    inline def setAdapter(value: ApplyValidationResults): Self = StObject.set(x, "adapter", value.asInstanceOf[js.Any])
    
    inline def setAdapterUndefined: Self = StObject.set(x, "adapter", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOnValidated(value: /* validatedInfo */ ValidatedEvent => Unit): Self = StObject.set(x, "onValidated", js.Any.fromFunction1(value))
    
    inline def setOnValidatedUndefined: Self = StObject.set(x, "onValidated", js.undefined)
    
    inline def setValidationGroup(value: String): Self = StObject.set(x, "validationGroup", value.asInstanceOf[js.Any])
    
    inline def setValidationGroupUndefined: Self = StObject.set(x, "validationGroup", js.undefined)
    
    inline def setValidationRules(value: js.Array[ValidationRule]): Self = StObject.set(x, "validationRules", value.asInstanceOf[js.Any])
    
    inline def setValidationRulesUndefined: Self = StObject.set(x, "validationRules", js.undefined)
    
    inline def setValidationRulesVarargs(value: ValidationRule*): Self = StObject.set(x, "validationRules", js.Array(value*))
  }
}
