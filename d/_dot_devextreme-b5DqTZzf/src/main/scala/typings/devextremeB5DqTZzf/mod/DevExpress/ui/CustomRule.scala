package typings.devextremeB5DqTZzf.mod.DevExpress.ui

import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.custom
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomRule
  extends StObject
     with ValidationRule {
  
  /**
    * If true, the validationCallback is not executed for null, undefined, false, and empty strings.
    */
  var ignoreEmptyValue: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the message that is shown if the rule is broken.
    */
  var message: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates whether the rule should be always checked for the target value or only when the target value changes.
    */
  var reevaluate: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the rule type. Set it to &apos;custom&apos; to use the CustomRule.
    */
  var `type`: custom
  
  /**
    * A function that validates the target value.
    */
  var validationCallback: js.UndefOr[js.Function1[/* options */ ValidationCallbackData, Boolean]] = js.undefined
}
object CustomRule {
  
  inline def apply(): CustomRule = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("custom")
    __obj.asInstanceOf[CustomRule]
  }
  
  extension [Self <: CustomRule](x: Self) {
    
    inline def setIgnoreEmptyValue(value: Boolean): Self = StObject.set(x, "ignoreEmptyValue", value.asInstanceOf[js.Any])
    
    inline def setIgnoreEmptyValueUndefined: Self = StObject.set(x, "ignoreEmptyValue", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setReevaluate(value: Boolean): Self = StObject.set(x, "reevaluate", value.asInstanceOf[js.Any])
    
    inline def setReevaluateUndefined: Self = StObject.set(x, "reevaluate", js.undefined)
    
    inline def setType(value: custom): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValidationCallback(value: /* options */ ValidationCallbackData => Boolean): Self = StObject.set(x, "validationCallback", js.Any.fromFunction1(value))
    
    inline def setValidationCallbackUndefined: Self = StObject.set(x, "validationCallback", js.undefined)
  }
}
