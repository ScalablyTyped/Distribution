package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AgentJobStepInfo extends js.Object {
  var appendLogToTable: Boolean
  var appendToLogFile: Boolean
  var appendToStepHist: Boolean
  var command: String
  var commandExecutionSuccessCode: Double
  var databaseName: String
  var databaseUserName: String
  var failStepId: Double
  var failureAction: StepCompletionAction
  var id: Double
  var jobId: String
  var jobName: String
  var outputFileName: String
  var proxyName: String
  var retryAttempts: Double
  var retryInterval: Double
  var script: String
  var scriptName: String
  var server: String
  var stepName: String
  var subSystem: AgentSubSystem
  var successAction: StepCompletionAction
  var successStepId: Double
  var writeLogToTable: Boolean
}

object AgentJobStepInfo {
  @scala.inline
  def apply(
    appendLogToTable: Boolean,
    appendToLogFile: Boolean,
    appendToStepHist: Boolean,
    command: String,
    commandExecutionSuccessCode: Double,
    databaseName: String,
    databaseUserName: String,
    failStepId: Double,
    failureAction: StepCompletionAction,
    id: Double,
    jobId: String,
    jobName: String,
    outputFileName: String,
    proxyName: String,
    retryAttempts: Double,
    retryInterval: Double,
    script: String,
    scriptName: String,
    server: String,
    stepName: String,
    subSystem: AgentSubSystem,
    successAction: StepCompletionAction,
    successStepId: Double,
    writeLogToTable: Boolean
  ): AgentJobStepInfo = {
    val __obj = js.Dynamic.literal(appendLogToTable = appendLogToTable.asInstanceOf[js.Any], appendToLogFile = appendToLogFile.asInstanceOf[js.Any], appendToStepHist = appendToStepHist.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], commandExecutionSuccessCode = commandExecutionSuccessCode.asInstanceOf[js.Any], databaseName = databaseName.asInstanceOf[js.Any], databaseUserName = databaseUserName.asInstanceOf[js.Any], failStepId = failStepId.asInstanceOf[js.Any], failureAction = failureAction.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], jobId = jobId.asInstanceOf[js.Any], jobName = jobName.asInstanceOf[js.Any], outputFileName = outputFileName.asInstanceOf[js.Any], proxyName = proxyName.asInstanceOf[js.Any], retryAttempts = retryAttempts.asInstanceOf[js.Any], retryInterval = retryInterval.asInstanceOf[js.Any], script = script.asInstanceOf[js.Any], scriptName = scriptName.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any], stepName = stepName.asInstanceOf[js.Any], subSystem = subSystem.asInstanceOf[js.Any], successAction = successAction.asInstanceOf[js.Any], successStepId = successStepId.asInstanceOf[js.Any], writeLogToTable = writeLogToTable.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentJobStepInfo]
  }
}

