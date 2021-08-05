package typings.awsSdk.inspectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AgentPreview extends StObject {
  
  /**
    * The health status of the Amazon Inspector Agent.
    */
  var agentHealth: js.UndefOr[AgentHealth] = js.undefined
  
  /**
    * The ID of the EC2 instance where the agent is installed.
    */
  var agentId: AgentId
  
  /**
    * The version of the Amazon Inspector Agent.
    */
  var agentVersion: js.UndefOr[AgentVersion] = js.undefined
  
  /**
    * The Auto Scaling group for the EC2 instance where the agent is installed.
    */
  var autoScalingGroup: js.UndefOr[AutoScalingGroup] = js.undefined
  
  /**
    * The hostname of the EC2 instance on which the Amazon Inspector Agent is installed.
    */
  var hostname: js.UndefOr[Hostname] = js.undefined
  
  /**
    * The IP address of the EC2 instance on which the Amazon Inspector Agent is installed.
    */
  var ipv4Address: js.UndefOr[Ipv4Address] = js.undefined
  
  /**
    * The kernel version of the operating system running on the EC2 instance on which the Amazon Inspector Agent is installed.
    */
  var kernelVersion: js.UndefOr[KernelVersion] = js.undefined
  
  /**
    * The operating system running on the EC2 instance on which the Amazon Inspector Agent is installed.
    */
  var operatingSystem: js.UndefOr[OperatingSystem] = js.undefined
}
object AgentPreview {
  
  inline def apply(agentId: AgentId): AgentPreview = {
    val __obj = js.Dynamic.literal(agentId = agentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentPreview]
  }
  
  extension [Self <: AgentPreview](x: Self) {
    
    inline def setAgentHealth(value: AgentHealth): Self = StObject.set(x, "agentHealth", value.asInstanceOf[js.Any])
    
    inline def setAgentHealthUndefined: Self = StObject.set(x, "agentHealth", js.undefined)
    
    inline def setAgentId(value: AgentId): Self = StObject.set(x, "agentId", value.asInstanceOf[js.Any])
    
    inline def setAgentVersion(value: AgentVersion): Self = StObject.set(x, "agentVersion", value.asInstanceOf[js.Any])
    
    inline def setAgentVersionUndefined: Self = StObject.set(x, "agentVersion", js.undefined)
    
    inline def setAutoScalingGroup(value: AutoScalingGroup): Self = StObject.set(x, "autoScalingGroup", value.asInstanceOf[js.Any])
    
    inline def setAutoScalingGroupUndefined: Self = StObject.set(x, "autoScalingGroup", js.undefined)
    
    inline def setHostname(value: Hostname): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
    
    inline def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
    
    inline def setIpv4Address(value: Ipv4Address): Self = StObject.set(x, "ipv4Address", value.asInstanceOf[js.Any])
    
    inline def setIpv4AddressUndefined: Self = StObject.set(x, "ipv4Address", js.undefined)
    
    inline def setKernelVersion(value: KernelVersion): Self = StObject.set(x, "kernelVersion", value.asInstanceOf[js.Any])
    
    inline def setKernelVersionUndefined: Self = StObject.set(x, "kernelVersion", js.undefined)
    
    inline def setOperatingSystem(value: OperatingSystem): Self = StObject.set(x, "operatingSystem", value.asInstanceOf[js.Any])
    
    inline def setOperatingSystemUndefined: Self = StObject.set(x, "operatingSystem", js.undefined)
  }
}
