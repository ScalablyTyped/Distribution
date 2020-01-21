package typings.awsSdk.datasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
    * The type of endpoint that your agent is connected to. If the endpoint is a VPC endpoint, the agent is not accessible over the public Internet. 
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
  def apply(
    AgentArn: AgentArn = null,
    CreationTime: Time = null,
    EndpointType: EndpointType = null,
    LastConnectionTime: Time = null,
    Name: TagValue = null,
    PrivateLinkConfig: PrivateLinkConfig = null,
    Status: AgentStatus = null
  ): DescribeAgentResponse = {
    val __obj = js.Dynamic.literal()
    if (AgentArn != null) __obj.updateDynamic("AgentArn")(AgentArn.asInstanceOf[js.Any])
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime.asInstanceOf[js.Any])
    if (EndpointType != null) __obj.updateDynamic("EndpointType")(EndpointType.asInstanceOf[js.Any])
    if (LastConnectionTime != null) __obj.updateDynamic("LastConnectionTime")(LastConnectionTime.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (PrivateLinkConfig != null) __obj.updateDynamic("PrivateLinkConfig")(PrivateLinkConfig.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAgentResponse]
  }
}

