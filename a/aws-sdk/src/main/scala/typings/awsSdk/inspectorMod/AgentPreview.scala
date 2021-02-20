package typings.awsSdk.inspectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AgentPreview extends StObject {
  
  /**
    * The health status of the Amazon Inspector Agent.
    */
  var agentHealth: js.UndefOr[AgentHealth] = js.native
  
  /**
    * The ID of the EC2 instance where the agent is installed.
    */
  var agentId: AgentId = js.native
  
  /**
    * The version of the Amazon Inspector Agent.
    */
  var agentVersion: js.UndefOr[AgentVersion] = js.native
  
  /**
    * The Auto Scaling group for the EC2 instance where the agent is installed.
    */
  var autoScalingGroup: js.UndefOr[AutoScalingGroup] = js.native
  
  /**
    * The hostname of the EC2 instance on which the Amazon Inspector Agent is installed.
    */
  var hostname: js.UndefOr[Hostname] = js.native
  
  /**
    * The IP address of the EC2 instance on which the Amazon Inspector Agent is installed.
    */
  var ipv4Address: js.UndefOr[Ipv4Address] = js.native
  
  /**
    * The kernel version of the operating system running on the EC2 instance on which the Amazon Inspector Agent is installed.
    */
  var kernelVersion: js.UndefOr[KernelVersion] = js.native
  
  /**
    * The operating system running on the EC2 instance on which the Amazon Inspector Agent is installed.
    */
  var operatingSystem: js.UndefOr[OperatingSystem] = js.native
}
object AgentPreview {
  
  @scala.inline
  def apply(agentId: AgentId): AgentPreview = {
    val __obj = js.Dynamic.literal(agentId = agentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentPreview]
  }
  
  @scala.inline
  implicit class AgentPreviewMutableBuilder[Self <: AgentPreview] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAgentHealth(value: AgentHealth): Self = StObject.set(x, "agentHealth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAgentHealthUndefined: Self = StObject.set(x, "agentHealth", js.undefined)
    
    @scala.inline
    def setAgentId(value: AgentId): Self = StObject.set(x, "agentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAgentVersion(value: AgentVersion): Self = StObject.set(x, "agentVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAgentVersionUndefined: Self = StObject.set(x, "agentVersion", js.undefined)
    
    @scala.inline
    def setAutoScalingGroup(value: AutoScalingGroup): Self = StObject.set(x, "autoScalingGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoScalingGroupUndefined: Self = StObject.set(x, "autoScalingGroup", js.undefined)
    
    @scala.inline
    def setHostname(value: Hostname): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
    
    @scala.inline
    def setIpv4Address(value: Ipv4Address): Self = StObject.set(x, "ipv4Address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpv4AddressUndefined: Self = StObject.set(x, "ipv4Address", js.undefined)
    
    @scala.inline
    def setKernelVersion(value: KernelVersion): Self = StObject.set(x, "kernelVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKernelVersionUndefined: Self = StObject.set(x, "kernelVersion", js.undefined)
    
    @scala.inline
    def setOperatingSystem(value: OperatingSystem): Self = StObject.set(x, "operatingSystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperatingSystemUndefined: Self = StObject.set(x, "operatingSystem", js.undefined)
  }
}
