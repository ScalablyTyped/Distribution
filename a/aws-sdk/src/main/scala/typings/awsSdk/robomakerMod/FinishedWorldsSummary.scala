package typings.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FinishedWorldsSummary extends js.Object {
  
  /**
    * Information about worlds that failed.
    */
  var failureSummary: js.UndefOr[FailureSummary] = js.native
  
  /**
    * The total number of finished worlds.
    */
  var finishedCount: js.UndefOr[Integer] = js.native
  
  /**
    * A list of worlds that succeeded.
    */
  var succeededWorlds: js.UndefOr[Arns] = js.native
}
object FinishedWorldsSummary {
  
  @scala.inline
  def apply(): FinishedWorldsSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FinishedWorldsSummary]
  }
  
  @scala.inline
  implicit class FinishedWorldsSummaryOps[Self <: FinishedWorldsSummary] (val x: Self) extends AnyVal {
    
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
    def setFailureSummary(value: FailureSummary): Self = this.set("failureSummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailureSummary: Self = this.set("failureSummary", js.undefined)
    
    @scala.inline
    def setFinishedCount(value: Integer): Self = this.set("finishedCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFinishedCount: Self = this.set("finishedCount", js.undefined)
    
    @scala.inline
    def setSucceededWorldsVarargs(value: Arn*): Self = this.set("succeededWorlds", js.Array(value :_*))
    
    @scala.inline
    def setSucceededWorlds(value: Arns): Self = this.set("succeededWorlds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSucceededWorlds: Self = this.set("succeededWorlds", js.undefined)
  }
}
