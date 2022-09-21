package typings.awsSdk.codeguruprofilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProfilingGroupDescription extends StObject {
  
  /**
    *  An  AgentOrchestrationConfig  object that indicates if the profiling group is enabled for profiled or not. 
    */
  var agentOrchestrationConfig: js.UndefOr[AgentOrchestrationConfig] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) identifying the profiling group resource.
    */
  var arn: js.UndefOr[ProfilingGroupArn] = js.undefined
  
  /**
    *  The compute platform of the profiling group. If it is set to AWSLambda, then the profiled application runs on AWS Lambda. If it is set to Default, then the profiled application runs on a compute platform that is not AWS Lambda, such an Amazon EC2 instance, an on-premises server, or a different platform. The default is Default. 
    */
  var computePlatform: js.UndefOr[ComputePlatform] = js.undefined
  
  /**
    * The time when the profiling group was created. Specify using the ISO 8601 format. For example, 2020-06-01T13:15:02.001Z represents 1 millisecond past June 1, 2020 1:15:02 PM UTC. 
    */
  var createdAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the profiling group.
    */
  var name: js.UndefOr[ProfilingGroupName] = js.undefined
  
  /**
    *  A  ProfilingStatus  object that includes information about the last time a profile agent pinged back, the last time a profile was received, and the aggregation period and start time for the most recent aggregated profile. 
    */
  var profilingStatus: js.UndefOr[ProfilingStatus] = js.undefined
  
  /**
    *  A list of the tags that belong to this profiling group. 
    */
  var tags: js.UndefOr[TagsMap] = js.undefined
  
  /**
    *  The date and time when the profiling group was last updated. Specify using the ISO 8601 format. For example, 2020-06-01T13:15:02.001Z represents 1 millisecond past June 1, 2020 1:15:02 PM UTC. 
    */
  var updatedAt: js.UndefOr[js.Date] = js.undefined
}
object ProfilingGroupDescription {
  
  inline def apply(): ProfilingGroupDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProfilingGroupDescription]
  }
  
  extension [Self <: ProfilingGroupDescription](x: Self) {
    
    inline def setAgentOrchestrationConfig(value: AgentOrchestrationConfig): Self = StObject.set(x, "agentOrchestrationConfig", value.asInstanceOf[js.Any])
    
    inline def setAgentOrchestrationConfigUndefined: Self = StObject.set(x, "agentOrchestrationConfig", js.undefined)
    
    inline def setArn(value: ProfilingGroupArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setComputePlatform(value: ComputePlatform): Self = StObject.set(x, "computePlatform", value.asInstanceOf[js.Any])
    
    inline def setComputePlatformUndefined: Self = StObject.set(x, "computePlatform", js.undefined)
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    inline def setName(value: ProfilingGroupName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setProfilingStatus(value: ProfilingStatus): Self = StObject.set(x, "profilingStatus", value.asInstanceOf[js.Any])
    
    inline def setProfilingStatusUndefined: Self = StObject.set(x, "profilingStatus", js.undefined)
    
    inline def setTags(value: TagsMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setUpdatedAt(value: js.Date): Self = StObject.set(x, "updatedAt", value.asInstanceOf[js.Any])
    
    inline def setUpdatedAtUndefined: Self = StObject.set(x, "updatedAt", js.undefined)
  }
}
