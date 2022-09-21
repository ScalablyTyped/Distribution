package typings.awsSdk.robomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FailureSummary extends StObject {
  
  /**
    * The worlds that failed.
    */
  var failures: js.UndefOr[WorldFailures] = js.undefined
  
  /**
    * The total number of failures.
    */
  var totalFailureCount: js.UndefOr[Integer] = js.undefined
}
object FailureSummary {
  
  inline def apply(): FailureSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FailureSummary]
  }
  
  extension [Self <: FailureSummary](x: Self) {
    
    inline def setFailures(value: WorldFailures): Self = StObject.set(x, "failures", value.asInstanceOf[js.Any])
    
    inline def setFailuresUndefined: Self = StObject.set(x, "failures", js.undefined)
    
    inline def setFailuresVarargs(value: WorldFailure*): Self = StObject.set(x, "failures", js.Array(value*))
    
    inline def setTotalFailureCount(value: Integer): Self = StObject.set(x, "totalFailureCount", value.asInstanceOf[js.Any])
    
    inline def setTotalFailureCountUndefined: Self = StObject.set(x, "totalFailureCount", js.undefined)
  }
}
