package typings.awsSdk.codeguruprofilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigureAgentRequest extends js.Object {
  /**
    *  A universally unique identifier (UUID) for a profiling instance. For example, if the profiling instance is an Amazon EC2 instance, it is the instance ID. If it is an AWS Fargate container, it is the container's task ID. 
    */
  var fleetInstanceId: js.UndefOr[FleetInstanceId] = js.native
  /**
    *  Metadata captured about the compute platform the agent is running on. It includes information about sampling and reporting. The valid fields are:    COMPUTE_PLATFORM - The compute platform on which the agent is running     AGENT_ID - The ID for an agent instance.     AWS_REQUEST_ID - The AWS request ID of a Lambda invocation.     EXECUTION_ENVIRONMENT - The execution environment a Lambda function is running on.     LAMBDA_FUNCTION_ARN - The Amazon Resource Name (ARN) that is used to invoke a Lambda function.     LAMBDA_MEMORY_LIMIT_IN_MB - The memory allocated to a Lambda function.     LAMBDA_REMAINING_TIME_IN_MILLISECONDS - The time in milliseconds before execution of a Lambda function times out.     LAMBDA_TIME_GAP_BETWEEN_INVOKES_IN_MILLISECONDS - The time in milliseconds between two invocations of a Lambda function.     LAMBDA_PREVIOUS_EXECUTION_TIME_IN_MILLISECONDS - The time in milliseconds for the previous Lambda invocation.   
    */
  var metadata: js.UndefOr[Metadata] = js.native
  /**
    *  The name of the profiling group for which the configured agent is collecting profiling data. 
    */
  var profilingGroupName: ProfilingGroupName = js.native
}

object ConfigureAgentRequest {
  @scala.inline
  def apply(profilingGroupName: ProfilingGroupName): ConfigureAgentRequest = {
    val __obj = js.Dynamic.literal(profilingGroupName = profilingGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigureAgentRequest]
  }
  @scala.inline
  implicit class ConfigureAgentRequestOps[Self <: ConfigureAgentRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setProfilingGroupName(value: ProfilingGroupName): Self = this.set("profilingGroupName", value.asInstanceOf[js.Any])
    @scala.inline
    def setFleetInstanceId(value: FleetInstanceId): Self = this.set("fleetInstanceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFleetInstanceId: Self = this.set("fleetInstanceId", js.undefined)
    @scala.inline
    def setMetadata(value: Metadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
  }
  
}

