package typings.awsSdk.cloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnableInsightRulesOutput extends js.Object {
  
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
  implicit class EnableInsightRulesOutputOps[Self <: EnableInsightRulesOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFailuresVarargs(value: PartialFailure*): Self = this.set("Failures", js.Array(value :_*))
    
    @scala.inline
    def setFailures(value: BatchFailures): Self = this.set("Failures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailures: Self = this.set("Failures", js.undefined)
  }
}
