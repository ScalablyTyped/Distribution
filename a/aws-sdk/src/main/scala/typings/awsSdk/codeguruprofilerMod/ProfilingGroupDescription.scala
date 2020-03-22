package typings.awsSdk.codeguruprofilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProfilingGroupDescription extends js.Object {
  /**
    * 
    */
  var agentOrchestrationConfig: js.UndefOr[AgentOrchestrationConfig] = js.native
  /**
    * The Amazon Resource Name (ARN) identifying the profiling group.
    */
  var arn: js.UndefOr[ProfilingGroupArn] = js.native
  /**
    * The time, in milliseconds since the epoch, when the profiling group was created.
    */
  var createdAt: js.UndefOr[Timestamp] = js.native
  /**
    * The name of the profiling group.
    */
  var name: js.UndefOr[ProfilingGroupName] = js.native
  /**
    * The status of the profiling group.
    */
  var profilingStatus: js.UndefOr[ProfilingStatus] = js.native
  /**
    * The time, in milliseconds since the epoch, when the profiling group was last updated.
    */
  var updatedAt: js.UndefOr[Timestamp] = js.native
}

object ProfilingGroupDescription {
  @scala.inline
  def apply(
    agentOrchestrationConfig: AgentOrchestrationConfig = null,
    arn: ProfilingGroupArn = null,
    createdAt: Timestamp = null,
    name: ProfilingGroupName = null,
    profilingStatus: ProfilingStatus = null,
    updatedAt: Timestamp = null
  ): ProfilingGroupDescription = {
    val __obj = js.Dynamic.literal()
    if (agentOrchestrationConfig != null) __obj.updateDynamic("agentOrchestrationConfig")(agentOrchestrationConfig.asInstanceOf[js.Any])
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (createdAt != null) __obj.updateDynamic("createdAt")(createdAt.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (profilingStatus != null) __obj.updateDynamic("profilingStatus")(profilingStatus.asInstanceOf[js.Any])
    if (updatedAt != null) __obj.updateDynamic("updatedAt")(updatedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProfilingGroupDescription]
  }
}

