package typings.awsSdk.codeguruprofilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateProfilingGroupRequest extends StObject {
  
  /**
    *  Specifies whether profiling is enabled or disabled for a profiling group. 
    */
  var agentOrchestrationConfig: AgentOrchestrationConfig
  
  /**
    * The name of the profiling group to update.
    */
  var profilingGroupName: ProfilingGroupName
}
object UpdateProfilingGroupRequest {
  
  @scala.inline
  def apply(agentOrchestrationConfig: AgentOrchestrationConfig, profilingGroupName: ProfilingGroupName): UpdateProfilingGroupRequest = {
    val __obj = js.Dynamic.literal(agentOrchestrationConfig = agentOrchestrationConfig.asInstanceOf[js.Any], profilingGroupName = profilingGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateProfilingGroupRequest]
  }
  
  @scala.inline
  implicit class UpdateProfilingGroupRequestMutableBuilder[Self <: UpdateProfilingGroupRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAgentOrchestrationConfig(value: AgentOrchestrationConfig): Self = StObject.set(x, "agentOrchestrationConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfilingGroupName(value: ProfilingGroupName): Self = StObject.set(x, "profilingGroupName", value.asInstanceOf[js.Any])
  }
}
