package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AgentNotebookHistoryInfo extends AgentJobHistoryInfo {
  var materializedNotebookDeleted: Boolean = js.native
  var materializedNotebookErrorInfo: String = js.native
  var materializedNotebookId: Double = js.native
  var materializedNotebookName: String = js.native
  var materializedNotebookPin: Boolean = js.native
}

object AgentNotebookHistoryInfo {
  @scala.inline
  def apply(
    instanceId: Double,
    jobId: String,
    jobName: String,
    materializedNotebookDeleted: Boolean,
    materializedNotebookErrorInfo: String,
    materializedNotebookId: Double,
    materializedNotebookName: String,
    materializedNotebookPin: Boolean,
    message: String,
    operatorEmailed: String,
    operatorNetsent: String,
    operatorPaged: String,
    retriesAttempted: String,
    runDate: String,
    runDuration: String,
    runStatus: Double,
    server: String,
    sqlMessageId: String,
    sqlSeverity: String,
    stepId: String,
    stepName: String,
    steps: js.Array[AgentJobStep]
  ): AgentNotebookHistoryInfo = {
    val __obj = js.Dynamic.literal(instanceId = instanceId.asInstanceOf[js.Any], jobId = jobId.asInstanceOf[js.Any], jobName = jobName.asInstanceOf[js.Any], materializedNotebookDeleted = materializedNotebookDeleted.asInstanceOf[js.Any], materializedNotebookErrorInfo = materializedNotebookErrorInfo.asInstanceOf[js.Any], materializedNotebookId = materializedNotebookId.asInstanceOf[js.Any], materializedNotebookName = materializedNotebookName.asInstanceOf[js.Any], materializedNotebookPin = materializedNotebookPin.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], operatorEmailed = operatorEmailed.asInstanceOf[js.Any], operatorNetsent = operatorNetsent.asInstanceOf[js.Any], operatorPaged = operatorPaged.asInstanceOf[js.Any], retriesAttempted = retriesAttempted.asInstanceOf[js.Any], runDate = runDate.asInstanceOf[js.Any], runDuration = runDuration.asInstanceOf[js.Any], runStatus = runStatus.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any], sqlMessageId = sqlMessageId.asInstanceOf[js.Any], sqlSeverity = sqlSeverity.asInstanceOf[js.Any], stepId = stepId.asInstanceOf[js.Any], stepName = stepName.asInstanceOf[js.Any], steps = steps.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentNotebookHistoryInfo]
  }
  @scala.inline
  implicit class AgentNotebookHistoryInfoOps[Self <: AgentNotebookHistoryInfo] (val x: Self) extends AnyVal {
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
    def setMaterializedNotebookDeleted(value: Boolean): Self = this.set("materializedNotebookDeleted", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaterializedNotebookErrorInfo(value: String): Self = this.set("materializedNotebookErrorInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaterializedNotebookId(value: Double): Self = this.set("materializedNotebookId", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaterializedNotebookName(value: String): Self = this.set("materializedNotebookName", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaterializedNotebookPin(value: Boolean): Self = this.set("materializedNotebookPin", value.asInstanceOf[js.Any])
  }
  
}

