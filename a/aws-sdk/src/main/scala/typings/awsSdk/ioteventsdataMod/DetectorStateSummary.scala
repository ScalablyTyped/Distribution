package typings.awsSdk.ioteventsdataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DetectorStateSummary extends js.Object {
  
  /**
    * The name of the state.
    */
  var stateName: js.UndefOr[StateName] = js.native
}
object DetectorStateSummary {
  
  @scala.inline
  def apply(): DetectorStateSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetectorStateSummary]
  }
  
  @scala.inline
  implicit class DetectorStateSummaryOps[Self <: DetectorStateSummary] (val x: Self) extends AnyVal {
    
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
    def setStateName(value: StateName): Self = this.set("stateName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStateName: Self = this.set("stateName", js.undefined)
  }
}
