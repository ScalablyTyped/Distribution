package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AgentJobHistoryInfo extends StObject {
  
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
  implicit class AgentJobHistoryInfoMutableBuilder[Self <: AgentJobHistoryInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceId(value: Double): Self = StObject.set(x, "instanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobId(value: String): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobName(value: String): Self = StObject.set(x, "jobName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperatorEmailed(value: String): Self = StObject.set(x, "operatorEmailed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperatorNetsent(value: String): Self = StObject.set(x, "operatorNetsent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperatorPaged(value: String): Self = StObject.set(x, "operatorPaged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetriesAttempted(value: String): Self = StObject.set(x, "retriesAttempted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunDate(value: String): Self = StObject.set(x, "runDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunDuration(value: String): Self = StObject.set(x, "runDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunStatus(value: Double): Self = StObject.set(x, "runStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServer(value: String): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSqlMessageId(value: String): Self = StObject.set(x, "sqlMessageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSqlSeverity(value: String): Self = StObject.set(x, "sqlSeverity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepId(value: String): Self = StObject.set(x, "stepId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepName(value: String): Self = StObject.set(x, "stepName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSteps(value: js.Array[AgentJobStep]): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepsVarargs(value: AgentJobStep*): Self = StObject.set(x, "steps", js.Array(value :_*))
  }
}
