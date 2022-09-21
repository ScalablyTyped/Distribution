package typings.devextremeB5DqTZzf.mod.DevExpress.ui

import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.pattern
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PatternRule
  extends StObject
     with ValidationRule {
  
  /**
    * If set to true, empty values are valid.
    */
  var ignoreEmptyValue: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the message that is shown if the rule is broken.
    */
  var message: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the regular expression that the validated value must match.
    */
  var pattern: js.UndefOr[js.RegExp | String] = js.undefined
  
  /**
    * Specifies the rule type. Set it to &apos;pattern&apos; to use the PatternRule.
    */
  var `type`: pattern
}
object PatternRule {
  
  inline def apply(): PatternRule = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("pattern")
    __obj.asInstanceOf[PatternRule]
  }
  
  extension [Self <: PatternRule](x: Self) {
    
    inline def setIgnoreEmptyValue(value: Boolean): Self = StObject.set(x, "ignoreEmptyValue", value.asInstanceOf[js.Any])
    
    inline def setIgnoreEmptyValueUndefined: Self = StObject.set(x, "ignoreEmptyValue", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setPattern(value: js.RegExp | String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
    
    inline def setType(value: pattern): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
