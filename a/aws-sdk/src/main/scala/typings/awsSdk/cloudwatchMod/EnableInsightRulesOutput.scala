package typings.awsSdk.cloudwatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnableInsightRulesOutput extends StObject {
  
  /**
    * An array listing the rules that could not be enabled. You cannot disable or enable built-in rules.
    */
  var Failures: js.UndefOr[BatchFailures] = js.native
}
object EnableInsightRulesOutput {
  
  @scala.inline
  def apply(): EnableInsightRulesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnableInsightRulesOutput]
  }
  
  @scala.inline
  implicit class EnableInsightRulesOutputMutableBuilder[Self <: EnableInsightRulesOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFailures(value: BatchFailures): Self = StObject.set(x, "Failures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailuresUndefined: Self = StObject.set(x, "Failures", js.undefined)
    
    @scala.inline
    def setFailuresVarargs(value: PartialFailure*): Self = StObject.set(x, "Failures", js.Array(value :_*))
  }
}
