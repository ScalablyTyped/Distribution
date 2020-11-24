package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AgentJobHistoryInfo extends js.Object {
  
  var instanceId: Double = js.native
  
  var jobId: String = js.native
  
  var jobName: String = js.native
  
  var message: String = js.native
  
  var operatorEmailed: String = js.native
  
  var operatorNetsent: String = js.native
  
  var operatorPaged: String = js.native
  
  var retriesAttempted: String = js.native
  
  var runDate: String = js.native
  
  var runDuration: String = js.native
  
  var runStatus: Double = js.native
  
  var server: String = js.native
  
  var sqlMessageId: String = js.native
  
  var sqlSeverity: String = js.native
  
  var stepId: String = js.native
  
  var stepName: String = js.native
  
  var steps: js.Array[AgentJobStep] = js.native
}
object AgentJobHistoryInfo {
  
  @scala.inline
  def apply(
    instanceId: Double,
    jobId: String,
    jobName: String,
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
  ): AgentJobHistoryInfo = {
    val __obj = js.Dynamic.literal(instanceId = instanceId.asInstanceOf[js.Any], jobId = jobId.asInstanceOf[js.Any], jobName = jobName.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], operatorEmailed = operatorEmailed.asInstanceOf[js.Any], operatorNetsent = operatorNetsent.asInstanceOf[js.Any], operatorPaged = operatorPaged.asInstanceOf[js.Any], retriesAttempted = retriesAttempted.asInstanceOf[js.Any], runDate = runDate.asInstanceOf[js.Any], runDuration = runDuration.asInstanceOf[js.Any], runStatus = runStatus.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any], sqlMessageId = sqlMessageId.asInstanceOf[js.Any], sqlSeverity = sqlSeverity.asInstanceOf[js.Any], stepId = stepId.asInstanceOf[js.Any], stepName = stepName.asInstanceOf[js.Any], steps = steps.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentJobHistoryInfo]
  }
  
  @scala.inline
  implicit class AgentJobHistoryInfoOps[Self <: AgentJobHistoryInfo] (val x: Self) extends AnyVal {
    
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
    def setInstanceId(value: Double): Self = this.set("instanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobId(value: String): Self = this.set("jobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobName(value: String): Self = this.set("jobName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperatorEmailed(value: String): Self = this.set("operatorEmailed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperatorNetsent(value: String): Self = this.set("operatorNetsent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperatorPaged(value: String): Self = this.set("operatorPaged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetriesAttempted(value: String): Self = this.set("retriesAttempted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunDate(value: String): Self = this.set("runDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunDuration(value: String): Self = this.set("runDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunStatus(value: Double): Self = this.set("runStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServer(value: String): Self = this.set("server", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSqlMessageId(value: String): Self = this.set("sqlMessageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSqlSeverity(value: String): Self = this.set("sqlSeverity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepId(value: String): Self = this.set("stepId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepName(value: String): Self = this.set("stepName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepsVarargs(value: AgentJobStep*): Self = this.set("steps", js.Array(value :_*))
    
    @scala.inline
    def setSteps(value: js.Array[AgentJobStep]): Self = this.set("steps", value.asInstanceOf[js.Any])
  }
}
