package typings.awsSdk.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AgentPreview extends js.Object {
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
  implicit class AgentPreviewOps[Self <: AgentPreview] (val x: Self) extends AnyVal {
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
    def setAgentId(value: AgentId): Self = this.set("agentId", value.asInstanceOf[js.Any])
    @scala.inline
    def setAgentHealth(value: AgentHealth): Self = this.set("agentHealth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAgentHealth: Self = this.set("agentHealth", js.undefined)
    @scala.inline
    def setAgentVersion(value: AgentVersion): Self = this.set("agentVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAgentVersion: Self = this.set("agentVersion", js.undefined)
    @scala.inline
    def setAutoScalingGroup(value: AutoScalingGroup): Self = this.set("autoScalingGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoScalingGroup: Self = this.set("autoScalingGroup", js.undefined)
    @scala.inline
    def setHostname(value: Hostname): Self = this.set("hostname", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHostname: Self = this.set("hostname", js.undefined)
    @scala.inline
    def setIpv4Address(value: Ipv4Address): Self = this.set("ipv4Address", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIpv4Address: Self = this.set("ipv4Address", js.undefined)
    @scala.inline
    def setKernelVersion(value: KernelVersion): Self = this.set("kernelVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKernelVersion: Self = this.set("kernelVersion", js.undefined)
    @scala.inline
    def setOperatingSystem(value: OperatingSystem): Self = this.set("operatingSystem", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperatingSystem: Self = this.set("operatingSystem", js.undefined)
  }
  
}

