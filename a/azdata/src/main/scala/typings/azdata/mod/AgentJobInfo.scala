package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AgentJobInfo extends js.Object {
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
}

