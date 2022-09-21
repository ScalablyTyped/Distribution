package typings.devextremeB5DqTZzf.mod.DevExpress.ui

import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.invalid
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.pending
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.valid
import typings.devextremeB5DqTZzf.mod.DevExpress.core.utils.DxPromise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxValidationGroupResult extends StObject {
  
  /**
    * An array of the validation rules that failed.
    */
  var brokenRules: js.UndefOr[
    js.Array[
      RequiredRule | NumericRule | RangeRule | StringLengthRule | CustomRule | CompareRule | PatternRule | EmailRule | AsyncRule
    ]
  ] = js.undefined
  
  /**
    * A promise that is fulfilled when all async rules are validated.
    */
  var complete: js.UndefOr[DxPromise[dxValidationGroupResult]] = js.undefined
  
  /**
    * Indicates whether all the rules checked for the group are satisfied.
    */
  var isValid: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates the validation status.
    */
  var status: js.UndefOr[valid | invalid | pending] = js.undefined
  
  /**
    * Validator UI components included in the validated group.
    */
  var validators: js.UndefOr[js.Array[Any]] = js.undefined
}
object dxValidationGroupResult {
  
  inline def apply(): dxValidationGroupResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxValidationGroupResult]
  }
  
  extension [Self <: dxValidationGroupResult](x: Self) {
    
    inline def setBrokenRules(
      value: js.Array[
          RequiredRule | NumericRule | RangeRule | StringLengthRule | CustomRule | CompareRule | PatternRule | EmailRule | AsyncRule
        ]
    ): Self = StObject.set(x, "brokenRules", value.asInstanceOf[js.Any])
    
    inline def setBrokenRulesUndefined: Self = StObject.set(x, "brokenRules", js.undefined)
    
    inline def setBrokenRulesVarargs(
      value: (RequiredRule | NumericRule | RangeRule | StringLengthRule | CustomRule | CompareRule | PatternRule | EmailRule | AsyncRule)*
    ): Self = StObject.set(x, "brokenRules", js.Array(value*))
    
    inline def setComplete(value: DxPromise[dxValidationGroupResult]): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setIsValid(value: Boolean): Self = StObject.set(x, "isValid", value.asInstanceOf[js.Any])
    
    inline def setIsValidUndefined: Self = StObject.set(x, "isValid", js.undefined)
    
    inline def setStatus(value: valid | invalid | pending): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setValidators(value: js.Array[Any]): Self = StObject.set(x, "validators", value.asInstanceOf[js.Any])
    
    inline def setValidatorsUndefined: Self = StObject.set(x, "validators", js.undefined)
    
    inline def setValidatorsVarargs(value: Any*): Self = StObject.set(x, "validators", js.Array(value*))
  }
}
