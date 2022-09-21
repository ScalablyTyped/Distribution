package typings.devextremeB5DqTZzf.mod.DevExpress.ui

import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.EqualssignEqualssign
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.EqualssignEqualssignEqualssign
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.ExclamationmarkEqualssign
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.ExclamationmarkEqualssignEqualssign
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.Greaterthansign
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.GreaterthansignEqualssign
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.Lessthansign
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.LessthansignEqualssign
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.compare
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompareRule
  extends StObject
     with ValidationRule {
  
  /**
    * Specifies the function whose return value is used for comparison with the validated value.
    */
  var comparisonTarget: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /**
    * Specifies the operator to be used for comparing the validated value with the target.
    */
  var comparisonType: js.UndefOr[
    ExclamationmarkEqualssign | ExclamationmarkEqualssignEqualssign | Lessthansign | LessthansignEqualssign | EqualssignEqualssign | EqualssignEqualssignEqualssign | Greaterthansign | GreaterthansignEqualssign
  ] = js.undefined
  
  /**
    * If set to true, empty values are valid.
    */
  var ignoreEmptyValue: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the message that is shown if the rule is broken.
    */
  var message: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the rule type. Set it to &apos;compare&apos; to use the CompareRule.
    */
  var `type`: compare
}
object CompareRule {
  
  inline def apply(): CompareRule = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("compare")
    __obj.asInstanceOf[CompareRule]
  }
  
  extension [Self <: CompareRule](x: Self) {
    
    inline def setComparisonTarget(value: () => Any): Self = StObject.set(x, "comparisonTarget", js.Any.fromFunction0(value))
    
    inline def setComparisonTargetUndefined: Self = StObject.set(x, "comparisonTarget", js.undefined)
    
    inline def setComparisonType(
      value: ExclamationmarkEqualssign | ExclamationmarkEqualssignEqualssign | Lessthansign | LessthansignEqualssign | EqualssignEqualssign | EqualssignEqualssignEqualssign | Greaterthansign | GreaterthansignEqualssign
    ): Self = StObject.set(x, "comparisonType", value.asInstanceOf[js.Any])
    
    inline def setComparisonTypeUndefined: Self = StObject.set(x, "comparisonType", js.undefined)
    
    inline def setIgnoreEmptyValue(value: Boolean): Self = StObject.set(x, "ignoreEmptyValue", value.asInstanceOf[js.Any])
    
    inline def setIgnoreEmptyValueUndefined: Self = StObject.set(x, "ignoreEmptyValue", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setType(value: compare): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
