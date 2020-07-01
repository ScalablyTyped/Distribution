package typings.awsSdk.codeguruprofilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProfilingGroupDescription extends js.Object {
  /**
    *  An  AgentOrchestrationConfig  object that indicates if the profiling group is enabled for profiled or not. 
    */
  var agentOrchestrationConfig: js.UndefOr[AgentOrchestrationConfig] = js.native
  /**
    * The Amazon Resource Name (ARN) identifying the profiling group resource.
    */
  var arn: js.UndefOr[ProfilingGroupArn] = js.native
  /**
    *  The compute platform of the profiling group. If it is set to AWSLambda, then the profiled application runs on AWS Lambda. If it is set to Default, then the profiled application runs on a compute platform that is not AWS Lambda, such an Amazon EC2 instance, an on-premises server, or a different platform. The default is Default. 
    */
  var computePlatform: js.UndefOr[ComputePlatform] = js.native
  /**
    * The time when the profiling group was created. Specify using the ISO 8601 format. For example, 2020-06-01T13:15:02.001Z represents 1 millisecond past June 1, 2020 1:15:02 PM UTC. 
    */
  var createdAt: js.UndefOr[Timestamp] = js.native
  /**
    * The name of the profiling group.
    */
  var name: js.UndefOr[ProfilingGroupName] = js.native
  /**
    *  A  ProfilingStatus  object that includes information about the last time a profile agent pinged back, the last time a profile was received, and the aggregation period and start time for the most recent aggregated profile. 
    */
  var profilingStatus: js.UndefOr[ProfilingStatus] = js.native
  /**
    *  The date and time when the profiling group was last updated. Specify using the ISO 8601 format. For example, 2020-06-01T13:15:02.001Z represents 1 millisecond past June 1, 2020 1:15:02 PM UTC. 
    */
  var updatedAt: js.UndefOr[Timestamp] = js.native
}

object ProfilingGroupDescription {
  @scala.inline
  def apply(
    agentOrchestrationConfig: AgentOrchestrationConfig = null,
    arn: ProfilingGroupArn = null,
    computePlatform: ComputePlatform = null,
    createdAt: Timestamp = null,
    name: ProfilingGroupName = null,
    profilingStatus: ProfilingStatus = null,
    updatedAt: Timestamp = null
  ): ProfilingGroupDescription = {
    val __obj = js.Dynamic.literal()
    if (agentOrchestrationConfig != null) __obj.updateDynamic("agentOrchestrationConfig")(agentOrchestrationConfig.asInstanceOf[js.Any])
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (computePlatform != null) __obj.updateDynamic("computePlatform")(computePlatform.asInstanceOf[js.Any])
    if (createdAt != null) __obj.updateDynamic("createdAt")(createdAt.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (profilingStatus != null) __obj.updateDynamic("profilingStatus")(profilingStatus.asInstanceOf[js.Any])
    if (updatedAt != null) __obj.updateDynamic("updatedAt")(updatedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProfilingGroupDescription]
  }
}

