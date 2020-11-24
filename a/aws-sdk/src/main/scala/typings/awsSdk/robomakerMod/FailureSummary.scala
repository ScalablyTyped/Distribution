package typings.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FailureSummary extends js.Object {
  
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
  implicit class FailureSummaryOps[Self <: FailureSummary] (val x: Self) extends AnyVal {
    
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
    def setFailuresVarargs(value: WorldFailure*): Self = this.set("failures", js.Array(value :_*))
    
    @scala.inline
    def setFailures(value: WorldFailures): Self = this.set("failures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailures: Self = this.set("failures", js.undefined)
    
    @scala.inline
    def setTotalFailureCount(value: Integer): Self = this.set("totalFailureCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalFailureCount: Self = this.set("totalFailureCount", js.undefined)
  }
}
