package typings.awsSdk.cloudwatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnableInsightRulesOutput extends StObject {
  
  /**
    * An array listing the rules that could not be enabled. You cannot disable or enable built-in rules.
    */
  var Failures: js.UndefOr[BatchFailures] = js.undefined
}
object EnableInsightRulesOutput {
  
  inline def apply(): EnableInsightRulesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnableInsightRulesOutput]
  }
  
  extension [Self <: EnableInsightRulesOutput](x: Self) {
    
    inline def setFailures(value: BatchFailures): Self = StObject.set(x, "Failures", value.asInstanceOf[js.Any])
    
    inline def setFailuresUndefined: Self = StObject.set(x, "Failures", js.undefined)
    
    inline def setFailuresVarargs(value: PartialFailure*): Self = StObject.set(x, "Failures", js.Array(value*))
  }
}
