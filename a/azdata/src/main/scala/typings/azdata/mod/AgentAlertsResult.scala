package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AgentAlertsResult extends ResultStatus {
  
  var alerts: js.Array[AgentAlertInfo] = js.native
}
object AgentAlertsResult {
  
  @scala.inline
  def apply(alerts: js.Array[AgentAlertInfo], errorMessage: String, success: Boolean): AgentAlertsResult = {
    val __obj = js.Dynamic.literal(alerts = alerts.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentAlertsResult]
  }
  
  @scala.inline
  implicit class AgentAlertsResultOps[Self <: AgentAlertsResult] (val x: Self) extends AnyVal {
    
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
    def setAlertsVarargs(value: AgentAlertInfo*): Self = this.set("alerts", js.Array(value :_*))
    
    @scala.inline
    def setAlerts(value: js.Array[AgentAlertInfo]): Self = this.set("alerts", value.asInstanceOf[js.Any])
  }
}
