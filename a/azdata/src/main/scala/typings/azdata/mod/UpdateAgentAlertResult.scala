package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateAgentAlertResult
  extends StObject
     with ResultStatus {
  
  var alert: AgentJobStepInfo
}
object UpdateAgentAlertResult {
  
  @scala.inline
  def apply(alert: AgentJobStepInfo, errorMessage: String, success: Boolean): UpdateAgentAlertResult = {
    val __obj = js.Dynamic.literal(alert = alert.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAgentAlertResult]
  }
  
  @scala.inline
  implicit class UpdateAgentAlertResultMutableBuilder[Self <: UpdateAgentAlertResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlert(value: AgentJobStepInfo): Self = StObject.set(x, "alert", value.asInstanceOf[js.Any])
  }
}
