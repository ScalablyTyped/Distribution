package typings.awsSdk.datasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeAgentResponse extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the agent.
    */
  var AgentArn: js.UndefOr[typings.awsSdk.datasyncMod.AgentArn] = js.native
  
  /**
    * The time that the agent was activated (that is, created in your account).
    */
  var CreationTime: js.UndefOr[Time] = js.native
  
  /**
    * The type of endpoint that your agent is connected to. If the endpoint is a VPC endpoint, the agent is not accessible over the public internet. 
    */
  var EndpointType: js.UndefOr[typings.awsSdk.datasyncMod.EndpointType] = js.native
  
  /**
    * The time that the agent last connected to DataSyc.
    */
  var LastConnectionTime: js.UndefOr[Time] = js.native
  
  /**
    * The name of the agent.
    */
  var Name: js.UndefOr[TagValue] = js.native
  
  /**
    * The subnet and the security group that DataSync used to access a VPC endpoint.
    */
  var PrivateLinkConfig: js.UndefOr[typings.awsSdk.datasyncMod.PrivateLinkConfig] = js.native
  
  /**
    * The status of the agent. If the status is ONLINE, then the agent is configured properly and is available to use. The Running status is the normal running status for an agent. If the status is OFFLINE, the agent's VM is turned off or the agent is in an unhealthy state. When the issue that caused the unhealthy state is resolved, the agent returns to ONLINE status.
    */
  var Status: js.UndefOr[AgentStatus] = js.native
}
object DescribeAgentResponse {
  
  @scala.inline
  def apply(): DescribeAgentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAgentResponse]
  }
  
  @scala.inline
  implicit class DescribeAgentResponseOps[Self <: DescribeAgentResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAgentArn(value: AgentArn): Self = this.set("AgentArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAgentArn: Self = this.set("AgentArn", js.undefined)
    
    @scala.inline
    def setCreationTime(value: Time): Self = this.set("CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationTime: Self = this.set("CreationTime", js.undefined)
    
    @scala.inline
    def setEndpointType(value: EndpointType): Self = this.set("EndpointType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndpointType: Self = this.set("EndpointType", js.undefined)
    
    @scala.inline
    def setLastConnectionTime(value: Time): Self = this.set("LastConnectionTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastConnectionTime: Self = this.set("LastConnectionTime", js.undefined)
    
    @scala.inline
    def setName(value: TagValue): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    
    @scala.inline
    def setPrivateLinkConfig(value: PrivateLinkConfig): Self = this.set("PrivateLinkConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrivateLinkConfig: Self = this.set("PrivateLinkConfig", js.undefined)
    
    @scala.inline
    def setStatus(value: AgentStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
  }
}
