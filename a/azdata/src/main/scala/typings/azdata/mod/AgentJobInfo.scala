package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AgentJobInfo extends js.Object {
  
  var alerts: js.Array[AgentAlertInfo] = js.native
  
  var category: String = js.native
  
  var categoryId: Double = js.native
  
  var categoryType: Double = js.native
  
  var currentExecutionStatus: Double = js.native
  
  var currentExecutionStep: String = js.native
  
  var deleteLevel: JobCompletionActionCondition = js.native
  
  var description: String = js.native
  
  var emailLevel: JobCompletionActionCondition = js.native
  
  var enabled: Boolean = js.native
  
  var eventLogLevel: JobCompletionActionCondition = js.native
  
  var hasSchedule: Boolean = js.native
  
  var hasStep: Boolean = js.native
  
  var hasTarget: Boolean = js.native
  
  var jobId: String = js.native
  
  var jobSchedules: js.Array[AgentJobScheduleInfo] = js.native
  
  var jobSteps: js.Array[AgentJobStepInfo] = js.native
  
  var lastRun: String = js.native
  
  var lastRunOutcome: Double = js.native
  
  var name: String = js.native
  
  var nextRun: String = js.native
  
  var operatorToEmail: String = js.native
  
  var operatorToPage: String = js.native
  
  var owner: String = js.native
  
  var pageLevel: JobCompletionActionCondition = js.native
  
  var runnable: Boolean = js.native
  
  var startStepId: Double = js.native
}
object AgentJobInfo {
  
  @scala.inline
  def apply(
    alerts: js.Array[AgentAlertInfo],
    category: String,
    categoryId: Double,
    categoryType: Double,
    currentExecutionStatus: Double,
    currentExecutionStep: String,
    deleteLevel: JobCompletionActionCondition,
    description: String,
    emailLevel: JobCompletionActionCondition,
    enabled: Boolean,
    eventLogLevel: JobCompletionActionCondition,
    hasSchedule: Boolean,
    hasStep: Boolean,
    hasTarget: Boolean,
    jobId: String,
    jobSchedules: js.Array[AgentJobScheduleInfo],
    jobSteps: js.Array[AgentJobStepInfo],
    lastRun: String,
    lastRunOutcome: Double,
    name: String,
    nextRun: String,
    operatorToEmail: String,
    operatorToPage: String,
    owner: String,
    pageLevel: JobCompletionActionCondition,
    runnable: Boolean,
    startStepId: Double
  ): AgentJobInfo = {
    val __obj = js.Dynamic.literal(alerts = alerts.asInstanceOf[js.Any], category = category.asInstanceOf[js.Any], categoryId = categoryId.asInstanceOf[js.Any], categoryType = categoryType.asInstanceOf[js.Any], currentExecutionStatus = currentExecutionStatus.asInstanceOf[js.Any], currentExecutionStep = currentExecutionStep.asInstanceOf[js.Any], deleteLevel = deleteLevel.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], emailLevel = emailLevel.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], eventLogLevel = eventLogLevel.asInstanceOf[js.Any], hasSchedule = hasSchedule.asInstanceOf[js.Any], hasStep = hasStep.asInstanceOf[js.Any], hasTarget = hasTarget.asInstanceOf[js.Any], jobId = jobId.asInstanceOf[js.Any], jobSchedules = jobSchedules.asInstanceOf[js.Any], jobSteps = jobSteps.asInstanceOf[js.Any], lastRun = lastRun.asInstanceOf[js.Any], lastRunOutcome = lastRunOutcome.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nextRun = nextRun.asInstanceOf[js.Any], operatorToEmail = operatorToEmail.asInstanceOf[js.Any], operatorToPage = operatorToPage.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], pageLevel = pageLevel.asInstanceOf[js.Any], runnable = runnable.asInstanceOf[js.Any], startStepId = startStepId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentJobInfo]
  }
  
  @scala.inline
  implicit class AgentJobInfoOps[Self <: AgentJobInfo] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def setCategory(value: String): Self = this.set("category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoryId(value: Double): Self = this.set("categoryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoryType(value: Double): Self = this.set("categoryType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentExecutionStatus(value: Double): Self = this.set("currentExecutionStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentExecutionStep(value: String): Self = this.set("currentExecutionStep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteLevel(value: JobCompletionActionCondition): Self = this.set("deleteLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailLevel(value: JobCompletionActionCondition): Self = this.set("emailLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventLogLevel(value: JobCompletionActionCondition): Self = this.set("eventLogLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasSchedule(value: Boolean): Self = this.set("hasSchedule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasStep(value: Boolean): Self = this.set("hasStep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasTarget(value: Boolean): Self = this.set("hasTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobId(value: String): Self = this.set("jobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobSchedulesVarargs(value: AgentJobScheduleInfo*): Self = this.set("jobSchedules", js.Array(value :_*))
    
    @scala.inline
    def setJobSchedules(value: js.Array[AgentJobScheduleInfo]): Self = this.set("jobSchedules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobStepsVarargs(value: AgentJobStepInfo*): Self = this.set("jobSteps", js.Array(value :_*))
    
    @scala.inline
    def setJobSteps(value: js.Array[AgentJobStepInfo]): Self = this.set("jobSteps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastRun(value: String): Self = this.set("lastRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastRunOutcome(value: Double): Self = this.set("lastRunOutcome", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextRun(value: String): Self = this.set("nextRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperatorToEmail(value: String): Self = this.set("operatorToEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperatorToPage(value: String): Self = this.set("operatorToPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwner(value: String): Self = this.set("owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageLevel(value: JobCompletionActionCondition): Self = this.set("pageLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunnable(value: Boolean): Self = this.set("runnable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartStepId(value: Double): Self = this.set("startStepId", value.asInstanceOf[js.Any])
  }
}
