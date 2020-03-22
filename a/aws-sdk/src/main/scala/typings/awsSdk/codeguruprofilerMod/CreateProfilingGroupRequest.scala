package typings.awsSdk.codeguruprofilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateProfilingGroupRequest extends js.Object {
  /**
    * The agent orchestration configuration.
    */
  var agentOrchestrationConfig: js.UndefOr[AgentOrchestrationConfig] = js.native
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. This parameter specifies a unique identifier for the new profiling group that helps ensure idempotency.
    */
  var clientToken: ClientToken = js.native
  /**
    * The name of the profiling group.
    */
  var profilingGroupName: ProfilingGroupName = js.native
}

object CreateProfilingGroupRequest {
  @scala.inline
  def apply(
    clientToken: ClientToken,
    profilingGroupName: ProfilingGroupName,
    agentOrchestrationConfig: AgentOrchestrationConfig = null
  ): CreateProfilingGroupRequest = {
    val __obj = js.Dynamic.literal(clientToken = clientToken.asInstanceOf[js.Any], profilingGroupName = profilingGroupName.asInstanceOf[js.Any])
    if (agentOrchestrationConfig != null) __obj.updateDynamic("agentOrchestrationConfig")(agentOrchestrationConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateProfilingGroupRequest]
  }
}

