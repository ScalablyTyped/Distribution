package typings.awsSdk.datasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAgentResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the agent.
    */
  var AgentArn: js.UndefOr[typings.awsSdk.datasyncMod.AgentArn] = js.undefined
  
  /**
    * The time that the agent was activated (that is, created in your account).
    */
  var CreationTime: js.UndefOr[Time] = js.undefined
  
  /**
    * The type of endpoint that your agent is connected to. If the endpoint is a VPC endpoint, the agent is not accessible over the public internet. 
    */
  var EndpointType: js.UndefOr[typings.awsSdk.datasyncMod.EndpointType] = js.undefined
  
  /**
    * The time that the agent last connected to DataSyc.
    */
  var LastConnectionTime: js.UndefOr[Time] = js.undefined
  
  /**
    * The name of the agent.
    */
  var Name: js.UndefOr[TagValue] = js.undefined
  
  /**
    * The subnet and the security group that DataSync used to access a VPC endpoint.
    */
  var PrivateLinkConfig: js.UndefOr[typings.awsSdk.datasyncMod.PrivateLinkConfig] = js.undefined
  
  /**
    * The status of the agent. If the status is ONLINE, then the agent is configured properly and is available to use. The Running status is the normal running status for an agent. If the status is OFFLINE, the agent's VM is turned off or the agent is in an unhealthy state. When the issue that caused the unhealthy state is resolved, the agent returns to ONLINE status.
    */
  var Status: js.UndefOr[AgentStatus] = js.undefined
}
object DescribeAgentResponse {
  
  inline def apply(): DescribeAgentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAgentResponse]
  }
  
  extension [Self <: DescribeAgentResponse](x: Self) {
    
    inline def setAgentArn(value: AgentArn): Self = StObject.set(x, "AgentArn", value.asInstanceOf[js.Any])
    
    inline def setAgentArnUndefined: Self = StObject.set(x, "AgentArn", js.undefined)
    
    inline def setCreationTime(value: Time): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setEndpointType(value: EndpointType): Self = StObject.set(x, "EndpointType", value.asInstanceOf[js.Any])
    
    inline def setEndpointTypeUndefined: Self = StObject.set(x, "EndpointType", js.undefined)
    
    inline def setLastConnectionTime(value: Time): Self = StObject.set(x, "LastConnectionTime", value.asInstanceOf[js.Any])
    
    inline def setLastConnectionTimeUndefined: Self = StObject.set(x, "LastConnectionTime", js.undefined)
    
    inline def setName(value: TagValue): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setPrivateLinkConfig(value: PrivateLinkConfig): Self = StObject.set(x, "PrivateLinkConfig", value.asInstanceOf[js.Any])
    
    inline def setPrivateLinkConfigUndefined: Self = StObject.set(x, "PrivateLinkConfig", js.undefined)
    
    inline def setStatus(value: AgentStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
