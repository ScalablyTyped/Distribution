package typings.tslintXANLscI2.mod

import typings.tslintXANLscI2.formatterDTsMod.FormatterConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LintResult extends StObject {
  
  var errorCount: Double
  
  var failures: js.Array[typings.tslintXANLscI2.ruleDTsMod.RuleFailure]
  
  var fixes: js.UndefOr[js.Array[typings.tslintXANLscI2.ruleDTsMod.RuleFailure]] = js.undefined
  
  var format: String | FormatterConstructor
  
  var output: String
  
  var warningCount: Double
}
object LintResult {
  
  inline def apply(
    errorCount: Double,
    failures: js.Array[typings.tslintXANLscI2.ruleDTsMod.RuleFailure],
    format: String | FormatterConstructor,
    output: String,
    warningCount: Double
  ): LintResult = {
    val __obj = js.Dynamic.literal(errorCount = errorCount.asInstanceOf[js.Any], failures = failures.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any], warningCount = warningCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[LintResult]
  }
  
  extension [Self <: LintResult](x: Self) {
    
    inline def setErrorCount(value: Double): Self = StObject.set(x, "errorCount", value.asInstanceOf[js.Any])
    
    inline def setFailures(value: js.Array[typings.tslintXANLscI2.ruleDTsMod.RuleFailure]): Self = StObject.set(x, "failures", value.asInstanceOf[js.Any])
    
    inline def setFailuresVarargs(value: typings.tslintXANLscI2.ruleDTsMod.RuleFailure*): Self = StObject.set(x, "failures", js.Array(value*))
    
    inline def setFixes(value: js.Array[typings.tslintXANLscI2.ruleDTsMod.RuleFailure]): Self = StObject.set(x, "fixes", value.asInstanceOf[js.Any])
    
    inline def setFixesUndefined: Self = StObject.set(x, "fixes", js.undefined)
    
    inline def setFixesVarargs(value: typings.tslintXANLscI2.ruleDTsMod.RuleFailure*): Self = StObject.set(x, "fixes", js.Array(value*))
    
    inline def setFormat(value: String | FormatterConstructor): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setOutput(value: String): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    
    inline def setWarningCount(value: Double): Self = StObject.set(x, "warningCount", value.asInstanceOf[js.Any])
  }
}
