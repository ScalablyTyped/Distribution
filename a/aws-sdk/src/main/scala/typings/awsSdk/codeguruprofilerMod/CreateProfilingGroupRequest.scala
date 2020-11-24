package typings.awsSdk.codeguruprofilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  /**
    *  A list of tags to add to the created profiling group. 
    */
  var tags: js.UndefOr[TagsMap] = js.native
}
object CreateProfilingGroupRequest {
  
  @scala.inline
  def apply(clientToken: ClientToken, profilingGroupName: ProfilingGroupName): CreateProfilingGroupRequest = {
    val __obj = js.Dynamic.literal(clientToken = clientToken.asInstanceOf[js.Any], profilingGroupName = profilingGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateProfilingGroupRequest]
  }
  
  @scala.inline
  implicit class CreateProfilingGroupRequestOps[Self <: CreateProfilingGroupRequest] (val x: Self) extends AnyVal {
    
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
    def setClientToken(value: ClientToken): Self = this.set("clientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfilingGroupName(value: ProfilingGroupName): Self = this.set("profilingGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAgentOrchestrationConfig(value: AgentOrchestrationConfig): Self = this.set("agentOrchestrationConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAgentOrchestrationConfig: Self = this.set("agentOrchestrationConfig", js.undefined)
    
    @scala.inline
    def setComputePlatform(value: ComputePlatform): Self = this.set("computePlatform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComputePlatform: Self = this.set("computePlatform", js.undefined)
    
    @scala.inline
    def setTags(value: TagsMap): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
