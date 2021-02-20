package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AgentJobStep extends StObject {
  
  var jobId: String = js.native
  
  var message: String = js.native
  
  var runDate: String = js.native
  
  var runStatus: Double = js.native
  
  var stepDetails: AgentJobStepInfo = js.native
  
  var stepId: String = js.native
  
  var stepName: String = js.native
}
object AgentJobStep {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class AgentJobStepMutableBuilder[Self <: AgentJobStep] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJobId(value: String): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunDate(value: String): Self = StObject.set(x, "runDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunStatus(value: Double): Self = StObject.set(x, "runStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepDetails(value: AgentJobStepInfo): Self = StObject.set(x, "stepDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepId(value: String): Self = StObject.set(x, "stepId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepName(value: String): Self = StObject.set(x, "stepName", value.asInstanceOf[js.Any])
  }
}
