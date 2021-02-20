package typings.awsSdk.cloudwatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisableInsightRulesOutput extends StObject {
  
  /**
    * An array listing the rules that could not be disabled. You cannot disable built-in rules.
    */
  var Failures: js.UndefOr[BatchFailures] = js.native
}
object DisableInsightRulesOutput {
  
  @scala.inline
  def apply(): DisableInsightRulesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisableInsightRulesOutput]
  }
  
  @scala.inline
  implicit class DisableInsightRulesOutputMutableBuilder[Self <: DisableInsightRulesOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFailures(value: BatchFailures): Self = StObject.set(x, "Failures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailuresUndefined: Self = StObject.set(x, "Failures", js.undefined)
    
    @scala.inline
    def setFailuresVarargs(value: PartialFailure*): Self = StObject.set(x, "Failures", js.Array(value :_*))
  }
}
