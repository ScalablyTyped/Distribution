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
  
  @scala.inline
  def apply(errorMessage: String, step: AgentJobStepInfo, success: Boolean): UpdateAgentJobStepResult = {
    val __obj = js.Dynamic.literal(errorMessage = errorMessage.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAgentJobStepResult]
  }
  
  @scala.inline
  implicit class UpdateAgentJobStepResultMutableBuilder[Self <: UpdateAgentJobStepResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStep(value: AgentJobStepInfo): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
  }
}
