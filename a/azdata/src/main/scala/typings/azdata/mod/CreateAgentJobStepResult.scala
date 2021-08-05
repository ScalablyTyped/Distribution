package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAgentJobStepResult
  extends StObject
     with ResultStatus {
  
  var step: AgentJobStepInfo
}
object CreateAgentJobStepResult {
  
  inline def apply(errorMessage: String, step: AgentJobStepInfo, success: Boolean): CreateAgentJobStepResult = {
    val __obj = js.Dynamic.literal(errorMessage = errorMessage.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAgentJobStepResult]
  }
  
  extension [Self <: CreateAgentJobStepResult](x: Self) {
    
    inline def setStep(value: AgentJobStepInfo): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
  }
}
