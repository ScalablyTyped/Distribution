package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateAgentProxyResult extends ResultStatus {
  
  var proxy: AgentProxyInfo = js.native
  
  var step: AgentJobStepInfo = js.native
}
object CreateAgentProxyResult {
  
  @scala.inline
  def apply(errorMessage: String, proxy: AgentProxyInfo, step: AgentJobStepInfo, success: Boolean): CreateAgentProxyResult = {
    val __obj = js.Dynamic.literal(errorMessage = errorMessage.asInstanceOf[js.Any], proxy = proxy.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAgentProxyResult]
  }
  
  @scala.inline
  implicit class CreateAgentProxyResultMutableBuilder[Self <: CreateAgentProxyResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProxy(value: AgentProxyInfo): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStep(value: AgentJobStepInfo): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
  }
}
