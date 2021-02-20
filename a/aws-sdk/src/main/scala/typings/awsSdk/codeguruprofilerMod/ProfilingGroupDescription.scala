package typings.awsSdk.codeguruprofilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProfilingGroupDescription extends StObject {
  
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
  implicit class ProfilingGroupDescriptionMutableBuilder[Self <: ProfilingGroupDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAgentOrchestrationConfig(value: AgentOrchestrationConfig): Self = StObject.set(x, "agentOrchestrationConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAgentOrchestrationConfigUndefined: Self = StObject.set(x, "agentOrchestrationConfig", js.undefined)
    
    @scala.inline
    def setArn(value: ProfilingGroupArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    @scala.inline
    def setComputePlatform(value: ComputePlatform): Self = StObject.set(x, "computePlatform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComputePlatformUndefined: Self = StObject.set(x, "computePlatform", js.undefined)
    
    @scala.inline
    def setCreatedAt(value: Timestamp): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    @scala.inline
    def setName(value: ProfilingGroupName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setProfilingStatus(value: ProfilingStatus): Self = StObject.set(x, "profilingStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfilingStatusUndefined: Self = StObject.set(x, "profilingStatus", js.undefined)
    
    @scala.inline
    def setTags(value: TagsMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setUpdatedAt(value: Timestamp): Self = StObject.set(x, "updatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedAtUndefined: Self = StObject.set(x, "updatedAt", js.undefined)
  }
}
