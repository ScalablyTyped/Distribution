package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AgentNotebookInfo
  extends StObject
     with AgentJobInfo {
  
  var executeDatabase: String
  
  var lastRunNotebookError: String
  
  var targetDatabase: String
  
  var templateId: Double
}
object AgentNotebookInfo {
  
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
    executeDatabase: String,
    hasSchedule: Boolean,
    hasStep: Boolean,
    hasTarget: Boolean,
    jobId: String,
    jobSchedules: js.Array[AgentJobScheduleInfo],
    jobSteps: js.Array[AgentJobStepInfo],
    lastRun: String,
    lastRunNotebookError: String,
    lastRunOutcome: Double,
    name: String,
    nextRun: String,
    operatorToEmail: String,
    operatorToPage: String,
    owner: String,
    pageLevel: JobCompletionActionCondition,
    runnable: Boolean,
    startStepId: Double,
    targetDatabase: String,
    templateId: Double
  ): AgentNotebookInfo = {
    val __obj = js.Dynamic.literal(alerts = alerts.asInstanceOf[js.Any], category = category.asInstanceOf[js.Any], categoryId = categoryId.asInstanceOf[js.Any], categoryType = categoryType.asInstanceOf[js.Any], currentExecutionStatus = currentExecutionStatus.asInstanceOf[js.Any], currentExecutionStep = currentExecutionStep.asInstanceOf[js.Any], deleteLevel = deleteLevel.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], emailLevel = emailLevel.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], eventLogLevel = eventLogLevel.asInstanceOf[js.Any], executeDatabase = executeDatabase.asInstanceOf[js.Any], hasSchedule = hasSchedule.asInstanceOf[js.Any], hasStep = hasStep.asInstanceOf[js.Any], hasTarget = hasTarget.asInstanceOf[js.Any], jobId = jobId.asInstanceOf[js.Any], jobSchedules = jobSchedules.asInstanceOf[js.Any], jobSteps = jobSteps.asInstanceOf[js.Any], lastRun = lastRun.asInstanceOf[js.Any], lastRunNotebookError = lastRunNotebookError.asInstanceOf[js.Any], lastRunOutcome = lastRunOutcome.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nextRun = nextRun.asInstanceOf[js.Any], operatorToEmail = operatorToEmail.asInstanceOf[js.Any], operatorToPage = operatorToPage.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], pageLevel = pageLevel.asInstanceOf[js.Any], runnable = runnable.asInstanceOf[js.Any], startStepId = startStepId.asInstanceOf[js.Any], targetDatabase = targetDatabase.asInstanceOf[js.Any], templateId = templateId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentNotebookInfo]
  }
  
  @scala.inline
  implicit class AgentNotebookInfoMutableBuilder[Self <: AgentNotebookInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecuteDatabase(value: String): Self = StObject.set(x, "executeDatabase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastRunNotebookError(value: String): Self = StObject.set(x, "lastRunNotebookError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetDatabase(value: String): Self = StObject.set(x, "targetDatabase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateId(value: Double): Self = StObject.set(x, "templateId", value.asInstanceOf[js.Any])
  }
}
