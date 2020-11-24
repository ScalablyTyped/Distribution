package typings.awsSdk.cloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutDashboardOutput extends js.Object {
  
  /**
    * If the input for PutDashboard was correct and the dashboard was successfully created or modified, this result is empty. If this result includes only warning messages, then the input was valid enough for the dashboard to be created or modified, but some elements of the dashboard might not render. If this result includes error messages, the input was not valid and the operation failed.
    */
  var DashboardValidationMessages: js.UndefOr[typings.awsSdk.cloudwatchMod.DashboardValidationMessages] = js.native
}
object PutDashboardOutput {
  
  @scala.inline
  def apply(): PutDashboardOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutDashboardOutput]
  }
  
  @scala.inline
  implicit class PutDashboardOutputOps[Self <: PutDashboardOutput] (val x: Self) extends AnyVal {
    
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
    def setDashboardValidationMessagesVarargs(value: DashboardValidationMessage*): Self = this.set("DashboardValidationMessages", js.Array(value :_*))
    
    @scala.inline
    def setDashboardValidationMessages(value: DashboardValidationMessages): Self = this.set("DashboardValidationMessages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDashboardValidationMessages: Self = this.set("DashboardValidationMessages", js.undefined)
  }
}
