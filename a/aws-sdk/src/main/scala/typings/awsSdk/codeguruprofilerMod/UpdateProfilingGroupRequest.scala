package typings.awsSdk.codeguruprofilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateProfilingGroupRequest extends js.Object {
  /**
    * 
    */
  var agentOrchestrationConfig: AgentOrchestrationConfig = js.native
  /**
    * The name of the profiling group to update.
    */
  var profilingGroupName: ProfilingGroupName = js.native
}

object UpdateProfilingGroupRequest {
  @scala.inline
  def apply(agentOrchestrationConfig: AgentOrchestrationConfig, profilingGroupName: ProfilingGroupName): UpdateProfilingGroupRequest = {
    val __obj = js.Dynamic.literal(agentOrchestrationConfig = agentOrchestrationConfig.asInstanceOf[js.Any], profilingGroupName = profilingGroupName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UpdateProfilingGroupRequest]
  }
}

