package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AgentJobInfo extends StObject {
  
  var alerts: js.Array[AgentAlertInfo]
  
  var category: String
  
  var categoryId: Double
  
  var categoryType: Double
  
  var currentExecutionStatus: Double
  
  var currentExecutionStep: String
  
  var deleteLevel: JobCompletionActionCondition
  
  var description: String
  
  var emailLevel: JobCompletionActionCondition
  
  var enabled: Boolean
  
  var eventLogLevel: JobCompletionActionCondition
  
  var hasSchedule: Boolean
  
  var hasStep: Boolean
  
  var hasTarget: Boolean
  
  var jobId: String
  
  var jobSchedules: js.Array[AgentJobScheduleInfo]
  
  var jobSteps: js.Array[AgentJobStepInfo]
  
  var lastRun: String
  
  var lastRunOutcome: Double
  
  var name: String
  
  var nextRun: String
  
  var operatorToEmail: String
  
  var operatorToPage: String
  
  var owner: String
  
  var pageLevel: JobCompletionActionCondition
  
  var runnable: Boolean
  
  var startStepId: Double
}
object AgentJobInfo {
  
  inline def apply(
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
  
  extension [Self <: AgentJobInfo](x: Self) {
    
    inline def setAlerts(value: js.Array[AgentAlertInfo]): Self = StObject.set(x, "alerts", value.asInstanceOf[js.Any])
    
    inline def setAlertsVarargs(value: AgentAlertInfo*): Self = StObject.set(x, "alerts", js.Array(value :_*))
    
    inline def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryId(value: Double): Self = StObject.set(x, "categoryId", value.asInstanceOf[js.Any])
    
    inline def setCategoryType(value: Double): Self = StObject.set(x, "categoryType", value.asInstanceOf[js.Any])
    
    inline def setCurrentExecutionStatus(value: Double): Self = StObject.set(x, "currentExecutionStatus", value.asInstanceOf[js.Any])
    
    inline def setCurrentExecutionStep(value: String): Self = StObject.set(x, "currentExecutionStep", value.asInstanceOf[js.Any])
    
    inline def setDeleteLevel(value: JobCompletionActionCondition): Self = StObject.set(x, "deleteLevel", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setEmailLevel(value: JobCompletionActionCondition): Self = StObject.set(x, "emailLevel", value.asInstanceOf[js.Any])
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEventLogLevel(value: JobCompletionActionCondition): Self = StObject.set(x, "eventLogLevel", value.asInstanceOf[js.Any])
    
    inline def setHasSchedule(value: Boolean): Self = StObject.set(x, "hasSchedule", value.asInstanceOf[js.Any])
    
    inline def setHasStep(value: Boolean): Self = StObject.set(x, "hasStep", value.asInstanceOf[js.Any])
    
    inline def setHasTarget(value: Boolean): Self = StObject.set(x, "hasTarget", value.asInstanceOf[js.Any])
    
    inline def setJobId(value: String): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
    
    inline def setJobSchedules(value: js.Array[AgentJobScheduleInfo]): Self = StObject.set(x, "jobSchedules", value.asInstanceOf[js.Any])
    
    inline def setJobSchedulesVarargs(value: AgentJobScheduleInfo*): Self = StObject.set(x, "jobSchedules", js.Array(value :_*))
    
    inline def setJobSteps(value: js.Array[AgentJobStepInfo]): Self = StObject.set(x, "jobSteps", value.asInstanceOf[js.Any])
    
    inline def setJobStepsVarargs(value: AgentJobStepInfo*): Self = StObject.set(x, "jobSteps", js.Array(value :_*))
    
    inline def setLastRun(value: String): Self = StObject.set(x, "lastRun", value.asInstanceOf[js.Any])
    
    inline def setLastRunOutcome(value: Double): Self = StObject.set(x, "lastRunOutcome", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNextRun(value: String): Self = StObject.set(x, "nextRun", value.asInstanceOf[js.Any])
    
    inline def setOperatorToEmail(value: String): Self = StObject.set(x, "operatorToEmail", value.asInstanceOf[js.Any])
    
    inline def setOperatorToPage(value: String): Self = StObject.set(x, "operatorToPage", value.asInstanceOf[js.Any])
    
    inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setPageLevel(value: JobCompletionActionCondition): Self = StObject.set(x, "pageLevel", value.asInstanceOf[js.Any])
    
    inline def setRunnable(value: Boolean): Self = StObject.set(x, "runnable", value.asInstanceOf[js.Any])
    
    inline def setStartStepId(value: Double): Self = StObject.set(x, "startStepId", value.asInstanceOf[js.Any])
  }
}
