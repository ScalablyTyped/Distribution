package typings.awsSdk.inspectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AgentFilter extends StObject {
  
  /**
    * The detailed health state of the agent. Values can be set to IDLE, RUNNING, SHUTDOWN, UNHEALTHY, THROTTLED, and UNKNOWN. 
    */
  var agentHealthCodes: AgentHealthCodeList = js.native
  
  /**
    * The current health state of the agent. Values can be set to HEALTHY or UNHEALTHY.
    */
  var agentHealths: AgentHealthList = js.native
}
object AgentFilter {
  
  @scala.inline
  def apply(agentHealthCodes: AgentHealthCodeList, agentHealths: AgentHealthList): AgentFilter = {
    val __obj = js.Dynamic.literal(agentHealthCodes = agentHealthCodes.asInstanceOf[js.Any], agentHealths = agentHealths.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentFilter]
  }
  
  @scala.inline
  implicit class AgentFilterMutableBuilder[Self <: AgentFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAgentHealthCodes(value: AgentHealthCodeList): Self = StObject.set(x, "agentHealthCodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAgentHealthCodesVarargs(value: AgentHealthCode*): Self = StObject.set(x, "agentHealthCodes", js.Array(value :_*))
    
    @scala.inline
    def setAgentHealths(value: AgentHealthList): Self = StObject.set(x, "agentHealths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAgentHealthsVarargs(value: AgentHealth*): Self = StObject.set(x, "agentHealths", js.Array(value :_*))
  }
}
