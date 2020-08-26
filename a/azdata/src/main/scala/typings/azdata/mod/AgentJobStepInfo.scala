package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AgentJobStepInfo extends js.Object {
  var appendLogToTable: Boolean = js.native
  var appendToLogFile: Boolean = js.native
  var appendToStepHist: Boolean = js.native
  var command: String = js.native
  var commandExecutionSuccessCode: Double = js.native
  var databaseName: String = js.native
  var databaseUserName: String = js.native
  var failStepId: Double = js.native
  var failureAction: StepCompletionAction = js.native
  var id: Double = js.native
  var jobId: String = js.native
  var jobName: String = js.native
  var outputFileName: String = js.native
  var proxyName: String = js.native
  var retryAttempts: Double = js.native
  var retryInterval: Double = js.native
  var script: String = js.native
  var scriptName: String = js.native
  var server: String = js.native
  var stepName: String = js.native
  var subSystem: AgentSubSystem = js.native
  var successAction: StepCompletionAction = js.native
  var successStepId: Double = js.native
  var writeLogToTable: Boolean = js.native
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
  @scala.inline
  implicit class AgentJobStepInfoOps[Self <: AgentJobStepInfo] (val x: Self) extends AnyVal {
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
    def setAppendLogToTable(value: Boolean): Self = this.set("appendLogToTable", value.asInstanceOf[js.Any])
    @scala.inline
    def setAppendToLogFile(value: Boolean): Self = this.set("appendToLogFile", value.asInstanceOf[js.Any])
    @scala.inline
    def setAppendToStepHist(value: Boolean): Self = this.set("appendToStepHist", value.asInstanceOf[js.Any])
    @scala.inline
    def setCommand(value: String): Self = this.set("command", value.asInstanceOf[js.Any])
    @scala.inline
    def setCommandExecutionSuccessCode(value: Double): Self = this.set("commandExecutionSuccessCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setDatabaseName(value: String): Self = this.set("databaseName", value.asInstanceOf[js.Any])
    @scala.inline
    def setDatabaseUserName(value: String): Self = this.set("databaseUserName", value.asInstanceOf[js.Any])
    @scala.inline
    def setFailStepId(value: Double): Self = this.set("failStepId", value.asInstanceOf[js.Any])
    @scala.inline
    def setFailureAction(value: StepCompletionAction): Self = this.set("failureAction", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setJobId(value: String): Self = this.set("jobId", value.asInstanceOf[js.Any])
    @scala.inline
    def setJobName(value: String): Self = this.set("jobName", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutputFileName(value: String): Self = this.set("outputFileName", value.asInstanceOf[js.Any])
    @scala.inline
    def setProxyName(value: String): Self = this.set("proxyName", value.asInstanceOf[js.Any])
    @scala.inline
    def setRetryAttempts(value: Double): Self = this.set("retryAttempts", value.asInstanceOf[js.Any])
    @scala.inline
    def setRetryInterval(value: Double): Self = this.set("retryInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def setScript(value: String): Self = this.set("script", value.asInstanceOf[js.Any])
    @scala.inline
    def setScriptName(value: String): Self = this.set("scriptName", value.asInstanceOf[js.Any])
    @scala.inline
    def setServer(value: String): Self = this.set("server", value.asInstanceOf[js.Any])
    @scala.inline
    def setStepName(value: String): Self = this.set("stepName", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubSystem(value: AgentSubSystem): Self = this.set("subSystem", value.asInstanceOf[js.Any])
    @scala.inline
    def setSuccessAction(value: StepCompletionAction): Self = this.set("successAction", value.asInstanceOf[js.Any])
    @scala.inline
    def setSuccessStepId(value: Double): Self = this.set("successStepId", value.asInstanceOf[js.Any])
    @scala.inline
    def setWriteLogToTable(value: Boolean): Self = this.set("writeLogToTable", value.asInstanceOf[js.Any])
  }
  
}

