package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AgentNotebookHistoryResult extends ResultStatus {
  
  var histories: js.Array[AgentNotebookHistoryInfo] = js.native
  
  var schedules: js.Array[AgentJobScheduleInfo] = js.native
  
  var steps: js.Array[AgentJobStepInfo] = js.native
}
object AgentNotebookHistoryResult {
  
  @scala.inline
  def apply(
    errorMessage: String,
    histories: js.Array[AgentNotebookHistoryInfo],
    schedules: js.Array[AgentJobScheduleInfo],
    steps: js.Array[AgentJobStepInfo],
    success: Boolean
  ): AgentNotebookHistoryResult = {
    val __obj = js.Dynamic.literal(errorMessage = errorMessage.asInstanceOf[js.Any], histories = histories.asInstanceOf[js.Any], schedules = schedules.asInstanceOf[js.Any], steps = steps.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentNotebookHistoryResult]
  }
  
  @scala.inline
  implicit class AgentNotebookHistoryResultMutableBuilder[Self <: AgentNotebookHistoryResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHistories(value: js.Array[AgentNotebookHistoryInfo]): Self = StObject.set(x, "histories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHistoriesVarargs(value: AgentNotebookHistoryInfo*): Self = StObject.set(x, "histories", js.Array(value :_*))
    
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
