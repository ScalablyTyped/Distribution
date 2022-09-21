package typings.tslintXANLscI2.anon

import typings.tslintXANLscI2.ruleDTsMod.RuleSeverity
import typings.tslintXANLscI2.tslintXANLscI2Strings.default
import typings.tslintXANLscI2.tslintXANLscI2Strings.none
import typings.tslintXANLscI2.tslintXANLscI2Strings.warn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Severity extends StObject {
  
  var options: js.UndefOr[Any] = js.undefined
  
  var severity: js.UndefOr[RuleSeverity | warn | none | default] = js.undefined
}
object Severity {
  
  inline def apply(): Severity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Severity]
  }
  
  extension [Self <: Severity](x: Self) {
    
    inline def setOptions(value: Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setSeverity(value: RuleSeverity | warn | none | default): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    inline def setSeverityUndefined: Self = StObject.set(x, "severity", js.undefined)
  }
}
