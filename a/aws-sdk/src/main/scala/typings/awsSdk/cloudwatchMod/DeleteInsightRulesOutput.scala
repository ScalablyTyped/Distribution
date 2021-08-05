package typings.awsSdk.cloudwatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteInsightRulesOutput extends StObject {
  
  /**
    * An array listing the rules that could not be deleted. You cannot delete built-in rules.
    */
  var Failures: js.UndefOr[BatchFailures] = js.undefined
}
object DeleteInsightRulesOutput {
  
  inline def apply(): DeleteInsightRulesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteInsightRulesOutput]
  }
  
  extension [Self <: DeleteInsightRulesOutput](x: Self) {
    
    inline def setFailures(value: BatchFailures): Self = StObject.set(x, "Failures", value.asInstanceOf[js.Any])
    
    inline def setFailuresUndefined: Self = StObject.set(x, "Failures", js.undefined)
    
    inline def setFailuresVarargs(value: PartialFailure*): Self = StObject.set(x, "Failures", js.Array(value :_*))
  }
}
