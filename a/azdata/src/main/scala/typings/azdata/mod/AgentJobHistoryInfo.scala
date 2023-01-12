package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AgentJobHistoryInfo extends StObject {
  
  var instanceId: Double
  
  var jobId: String
  
  var jobName: String
  
  var message: String
  
  var operatorEmailed: String
  
  var operatorNetsent: String
  
  var operatorPaged: String
  
  var retriesAttempted: String
  
  var runDate: String
  
  var runDuration: String
  
  var runStatus: Double
  
  var server: String
  
  var sqlMessageId: String
  
  var sqlSeverity: String
  
  var stepId: String
  
  var stepName: String
  
  var steps: js.Array[AgentJobStep]
}
object AgentJobHistoryInfo {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: AgentJobHistoryInfo] (val x: Self) extends AnyVal {
    
    inline def setInstanceId(value: Double): Self = StObject.set(x, "instanceId", value.asInstanceOf[js.Any])
    
    inline def setJobId(value: String): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
    
    inline def setJobName(value: String): Self = StObject.set(x, "jobName", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setOperatorEmailed(value: String): Self = StObject.set(x, "operatorEmailed", value.asInstanceOf[js.Any])
    
    inline def setOperatorNetsent(value: String): Self = StObject.set(x, "operatorNetsent", value.asInstanceOf[js.Any])
    
    inline def setOperatorPaged(value: String): Self = StObject.set(x, "operatorPaged", value.asInstanceOf[js.Any])
    
    inline def setRetriesAttempted(value: String): Self = StObject.set(x, "retriesAttempted", value.asInstanceOf[js.Any])
    
    inline def setRunDate(value: String): Self = StObject.set(x, "runDate", value.asInstanceOf[js.Any])
    
    inline def setRunDuration(value: String): Self = StObject.set(x, "runDuration", value.asInstanceOf[js.Any])
    
    inline def setRunStatus(value: Double): Self = StObject.set(x, "runStatus", value.asInstanceOf[js.Any])
    
    inline def setServer(value: String): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
    
    inline def setSqlMessageId(value: String): Self = StObject.set(x, "sqlMessageId", value.asInstanceOf[js.Any])
    
    inline def setSqlSeverity(value: String): Self = StObject.set(x, "sqlSeverity", value.asInstanceOf[js.Any])
    
    inline def setStepId(value: String): Self = StObject.set(x, "stepId", value.asInstanceOf[js.Any])
    
    inline def setStepName(value: String): Self = StObject.set(x, "stepName", value.asInstanceOf[js.Any])
    
    inline def setSteps(value: js.Array[AgentJobStep]): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
    
    inline def setStepsVarargs(value: AgentJobStep*): Self = StObject.set(x, "steps", js.Array(value*))
  }
}
