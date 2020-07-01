package typings.awsSdk.codeguruprofilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateProfilingGroupRequest extends js.Object {
  /**
    *  Specifies whether profiling is enabled or disabled for the created profiling group. 
    */
  var agentOrchestrationConfig: js.UndefOr[AgentOrchestrationConfig] = js.native
  /**
    *  Amazon CodeGuru Profiler uses this universally unique identifier (UUID) to prevent the accidental creation of duplicate profiling groups if there are failures and retries. 
    */
  var clientToken: ClientToken = js.native
  /**
    *  The compute platform of the profiling group. Use AWSLambda if your application runs on AWS Lambda. Use Default if your application runs on a compute platform that is not AWS Lambda, such an Amazon EC2 instance, an on-premises server, or a different platform. If not specified, Default is used. 
    */
  var computePlatform: js.UndefOr[ComputePlatform] = js.native
  /**
    * The name of the profiling group to create.
    */
  var profilingGroupName: ProfilingGroupName = js.native
}

object CreateProfilingGroupRequest {
  @scala.inline
  def apply(
    clientToken: ClientToken,
    profilingGroupName: ProfilingGroupName,
    agentOrchestrationConfig: AgentOrchestrationConfig = null,
    computePlatform: ComputePlatform = null
  ): CreateProfilingGroupRequest = {
    val __obj = js.Dynamic.literal(clientToken = clientToken.asInstanceOf[js.Any], profilingGroupName = profilingGroupName.asInstanceOf[js.Any])
    if (agentOrchestrationConfig != null) __obj.updateDynamic("agentOrchestrationConfig")(agentOrchestrationConfig.asInstanceOf[js.Any])
    if (computePlatform != null) __obj.updateDynamic("computePlatform")(computePlatform.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateProfilingGroupRequest]
  }
}

