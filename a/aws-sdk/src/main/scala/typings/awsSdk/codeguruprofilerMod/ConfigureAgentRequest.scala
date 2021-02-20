package typings.awsSdk.codeguruprofilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfigureAgentRequest extends StObject {
  
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
  implicit class ConfigureAgentRequestMutableBuilder[Self <: ConfigureAgentRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFleetInstanceId(value: FleetInstanceId): Self = StObject.set(x, "fleetInstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFleetInstanceIdUndefined: Self = StObject.set(x, "fleetInstanceId", js.undefined)
    
    @scala.inline
    def setMetadata(value: Metadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    @scala.inline
    def setProfilingGroupName(value: ProfilingGroupName): Self = StObject.set(x, "profilingGroupName", value.asInstanceOf[js.Any])
  }
}
