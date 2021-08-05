package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AgentProxiesResult
  extends StObject
     with ResultStatus {
  
  var proxies: js.Array[AgentProxyInfo]
}
object AgentProxiesResult {
  
  inline def apply(errorMessage: String, proxies: js.Array[AgentProxyInfo], success: Boolean): AgentProxiesResult = {
    val __obj = js.Dynamic.literal(errorMessage = errorMessage.asInstanceOf[js.Any], proxies = proxies.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentProxiesResult]
  }
  
  extension [Self <: AgentProxiesResult](x: Self) {
    
    inline def setProxies(value: js.Array[AgentProxyInfo]): Self = StObject.set(x, "proxies", value.asInstanceOf[js.Any])
    
    inline def setProxiesVarargs(value: AgentProxyInfo*): Self = StObject.set(x, "proxies", js.Array(value :_*))
  }
}
