package typings.awsSdk.cloudwatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutManagedInsightRulesOutput extends StObject {
  
  /**
    *  An array that lists the rules that could not be enabled. 
    */
  var Failures: js.UndefOr[BatchFailures] = js.undefined
}
object PutManagedInsightRulesOutput {
  
  inline def apply(): PutManagedInsightRulesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutManagedInsightRulesOutput]
  }
  
  extension [Self <: PutManagedInsightRulesOutput](x: Self) {
    
    inline def setFailures(value: BatchFailures): Self = StObject.set(x, "Failures", value.asInstanceOf[js.Any])
    
    inline def setFailuresUndefined: Self = StObject.set(x, "Failures", js.undefined)
    
    inline def setFailuresVarargs(value: PartialFailure*): Self = StObject.set(x, "Failures", js.Array(value*))
  }
}
