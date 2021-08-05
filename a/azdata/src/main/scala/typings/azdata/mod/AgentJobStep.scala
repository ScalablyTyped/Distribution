package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AgentJobStep extends StObject {
  
  var jobId: String
  
  var message: String
  
  var runDate: String
  
  var runStatus: Double
  
  var stepDetails: AgentJobStepInfo
  
  var stepId: String
  
  var stepName: String
}
object AgentJobStep {
  
  inline def apply(
    jobId: String,
    message: String,
    runDate: String,
    runStatus: Double,
    stepDetails: AgentJobStepInfo,
    stepId: String,
    stepName: String
  ): AgentJobStep = {
    val __obj = js.Dynamic.literal(jobId = jobId.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], runDate = runDate.asInstanceOf[js.Any], runStatus = runStatus.asInstanceOf[js.Any], stepDetails = stepDetails.asInstanceOf[js.Any], stepId = stepId.asInstanceOf[js.Any], stepName = stepName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentJobStep]
  }
  
  extension [Self <: AgentJobStep](x: Self) {
    
    inline def setJobId(value: String): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setRunDate(value: String): Self = StObject.set(x, "runDate", value.asInstanceOf[js.Any])
    
    inline def setRunStatus(value: Double): Self = StObject.set(x, "runStatus", value.asInstanceOf[js.Any])
    
    inline def setStepDetails(value: AgentJobStepInfo): Self = StObject.set(x, "stepDetails", value.asInstanceOf[js.Any])
    
    inline def setStepId(value: String): Self = StObject.set(x, "stepId", value.asInstanceOf[js.Any])
    
    inline def setStepName(value: String): Self = StObject.set(x, "stepName", value.asInstanceOf[js.Any])
  }
}
