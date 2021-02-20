package typings.awsSdk.robomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FailureSummary extends StObject {
  
  /**
    * The worlds that failed.
    */
  var failures: js.UndefOr[WorldFailures] = js.native
  
  /**
    * The total number of failures.
    */
  var totalFailureCount: js.UndefOr[Integer] = js.native
}
object FailureSummary {
  
  @scala.inline
  def apply(): FailureSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FailureSummary]
  }
  
  @scala.inline
  implicit class FailureSummaryMutableBuilder[Self <: FailureSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFailures(value: WorldFailures): Self = StObject.set(x, "failures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailuresUndefined: Self = StObject.set(x, "failures", js.undefined)
    
    @scala.inline
    def setFailuresVarargs(value: WorldFailure*): Self = StObject.set(x, "failures", js.Array(value :_*))
    
    @scala.inline
    def setTotalFailureCount(value: Integer): Self = StObject.set(x, "totalFailureCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalFailureCountUndefined: Self = StObject.set(x, "totalFailureCount", js.undefined)
  }
}
