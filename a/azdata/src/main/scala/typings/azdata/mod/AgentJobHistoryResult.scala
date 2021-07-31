package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AgentJobHistoryResult
  extends StObject
     with ResultStatus {
  
  var alerts: js.Array[AgentAlertInfo]
  
  var histories: js.Array[AgentJobHistoryInfo]
  
  var schedules: js.Array[AgentJobScheduleInfo]
  
  var steps: js.Array[AgentJobStepInfo]
}
object AgentJobHistoryResult {
  
  @scala.inline
  def apply(
    alerts: js.Array[AgentAlertInfo],
    errorMessage: String,
    histories: js.Array[AgentJobHistoryInfo],
    schedules: js.Array[AgentJobScheduleInfo],
    steps: js.Array[AgentJobStepInfo],
    success: Boolean
  ): AgentJobHistoryResult = {
    val __obj = js.Dynamic.literal(alerts = alerts.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any], histories = histories.asInstanceOf[js.Any], schedules = schedules.asInstanceOf[js.Any], steps = steps.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentJobHistoryResult]
  }
  
  @scala.inline
  implicit class AgentJobHistoryResultMutableBuilder[Self <: AgentJobHistoryResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlerts(value: js.Array[AgentAlertInfo]): Self = StObject.set(x, "alerts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlertsVarargs(value: AgentAlertInfo*): Self = StObject.set(x, "alerts", js.Array(value :_*))
    
    @scala.inline
    def setHistories(value: js.Array[AgentJobHistoryInfo]): Self = StObject.set(x, "histories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHistoriesVarargs(value: AgentJobHistoryInfo*): Self = StObject.set(x, "histories", js.Array(value :_*))
    
    @scala.inline
    def setSchedules(value: js.Array[AgentJobScheduleInfo]): Self = StObject.set(x, "schedules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchedulesVarargs(value: AgentJobScheduleInfo*): Self = StObject.set(x, "schedules", js.Array(value :_*))
    
    @scala.inline
    def setSteps(value: js.Array[AgentJobStepInfo]): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepsVarargs(value: AgentJobStepInfo*): Self = StObject.set(x, "steps", js.Array(value :_*))
  }
}
