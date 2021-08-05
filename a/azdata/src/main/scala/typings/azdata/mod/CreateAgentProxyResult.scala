package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAgentProxyResult
  extends StObject
     with ResultStatus {
  
  var proxy: AgentProxyInfo
  
  var step: AgentJobStepInfo
}
object CreateAgentProxyResult {
  
  inline def apply(errorMessage: String, proxy: AgentProxyInfo, step: AgentJobStepInfo, success: Boolean): CreateAgentProxyResult = {
    val __obj = js.Dynamic.literal(errorMessage = errorMessage.asInstanceOf[js.Any], proxy = proxy.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAgentProxyResult]
  }
  
  extension [Self <: CreateAgentProxyResult](x: Self) {
    
    inline def setProxy(value: AgentProxyInfo): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
    
    inline def setStep(value: AgentJobStepInfo): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
  }
}
