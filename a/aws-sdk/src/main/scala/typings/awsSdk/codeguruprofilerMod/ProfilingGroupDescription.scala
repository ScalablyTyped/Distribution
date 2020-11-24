package typings.awsSdk.codeguruprofilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    *  A list of the tags that belong to this profiling group. 
    */
  var tags: js.UndefOr[TagsMap] = js.native
  
  /**
    *  The date and time when the profiling group was last updated. Specify using the ISO 8601 format. For example, 2020-06-01T13:15:02.001Z represents 1 millisecond past June 1, 2020 1:15:02 PM UTC. 
    */
  var updatedAt: js.UndefOr[Timestamp] = js.native
}
object ProfilingGroupDescription {
  
  @scala.inline
  def apply(): ProfilingGroupDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProfilingGroupDescription]
  }
  
  @scala.inline
  implicit class ProfilingGroupDescriptionOps[Self <: ProfilingGroupDescription] (val x: Self) extends AnyVal {
    
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
    def setAgentOrchestrationConfig(value: AgentOrchestrationConfig): Self = this.set("agentOrchestrationConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAgentOrchestrationConfig: Self = this.set("agentOrchestrationConfig", js.undefined)
    
    @scala.inline
    def setArn(value: ProfilingGroupArn): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    
    @scala.inline
    def setComputePlatform(value: ComputePlatform): Self = this.set("computePlatform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComputePlatform: Self = this.set("computePlatform", js.undefined)
    
    @scala.inline
    def setCreatedAt(value: Timestamp): Self = this.set("createdAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedAt: Self = this.set("createdAt", js.undefined)
    
    @scala.inline
    def setName(value: ProfilingGroupName): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setProfilingStatus(value: ProfilingStatus): Self = this.set("profilingStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProfilingStatus: Self = this.set("profilingStatus", js.undefined)
    
    @scala.inline
    def setTags(value: TagsMap): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    
    @scala.inline
    def setUpdatedAt(value: Timestamp): Self = this.set("updatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdatedAt: Self = this.set("updatedAt", js.undefined)
  }
}
