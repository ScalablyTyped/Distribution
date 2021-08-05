package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateAgentJobStepResult
  extends StObject
     with ResultStatus {
  
  var step: AgentJobStepInfo
}
object UpdateAgentJobStepResult {
  
  inline def apply(errorMessage: String, step: AgentJobStepInfo, success: Boolean): UpdateAgentJobStepResult = {
    val __obj = js.Dynamic.literal(errorMessage = errorMessage.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAgentJobStepResult]
  }
  
  extension [Self <: UpdateAgentJobStepResult](x: Self) {
    
    inline def setStep(value: AgentJobStepInfo): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
  }
}
