package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateAgentProxyResult
  extends StObject
     with ResultStatus {
  
  var proxy: AgentProxyInfo
  
  var step: AgentJobStepInfo
}
object UpdateAgentProxyResult {
  
  inline def apply(errorMessage: String, proxy: AgentProxyInfo, step: AgentJobStepInfo, success: Boolean): UpdateAgentProxyResult = {
    val __obj = js.Dynamic.literal(errorMessage = errorMessage.asInstanceOf[js.Any], proxy = proxy.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAgentProxyResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateAgentProxyResult] (val x: Self) extends AnyVal {
    
    inline def setProxy(value: AgentProxyInfo): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
    
    inline def setStep(value: AgentJobStepInfo): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
  }
}
