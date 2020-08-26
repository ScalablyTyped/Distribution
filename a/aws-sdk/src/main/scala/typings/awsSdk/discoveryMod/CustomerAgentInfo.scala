package typings.awsSdk.discoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomerAgentInfo extends js.Object {
  /**
    * Number of active discovery agents.
    */
  var activeAgents: Integer = js.native
  /**
    * Number of blacklisted discovery agents.
    */
  var blackListedAgents: Integer = js.native
  /**
    * Number of healthy discovery agents
    */
  var healthyAgents: Integer = js.native
  /**
    * Number of discovery agents with status SHUTDOWN.
    */
  var shutdownAgents: Integer = js.native
  /**
    * Total number of discovery agents.
    */
  var totalAgents: Integer = js.native
  /**
    * Number of unhealthy discovery agents.
    */
  var unhealthyAgents: Integer = js.native
  /**
    * Number of unknown discovery agents.
    */
  var unknownAgents: Integer = js.native
}

object CustomerAgentInfo {
  @scala.inline
  def apply(
    activeAgents: Integer,
    blackListedAgents: Integer,
    healthyAgents: Integer,
    shutdownAgents: Integer,
    totalAgents: Integer,
    unhealthyAgents: Integer,
    unknownAgents: Integer
  ): CustomerAgentInfo = {
    val __obj = js.Dynamic.literal(activeAgents = activeAgents.asInstanceOf[js.Any], blackListedAgents = blackListedAgents.asInstanceOf[js.Any], healthyAgents = healthyAgents.asInstanceOf[js.Any], shutdownAgents = shutdownAgents.asInstanceOf[js.Any], totalAgents = totalAgents.asInstanceOf[js.Any], unhealthyAgents = unhealthyAgents.asInstanceOf[js.Any], unknownAgents = unknownAgents.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomerAgentInfo]
  }
  @scala.inline
  implicit class CustomerAgentInfoOps[Self <: CustomerAgentInfo] (val x: Self) extends AnyVal {
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
    def setActiveAgents(value: Integer): Self = this.set("activeAgents", value.asInstanceOf[js.Any])
    @scala.inline
    def setBlackListedAgents(value: Integer): Self = this.set("blackListedAgents", value.asInstanceOf[js.Any])
    @scala.inline
    def setHealthyAgents(value: Integer): Self = this.set("healthyAgents", value.asInstanceOf[js.Any])
    @scala.inline
    def setShutdownAgents(value: Integer): Self = this.set("shutdownAgents", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotalAgents(value: Integer): Self = this.set("totalAgents", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnhealthyAgents(value: Integer): Self = this.set("unhealthyAgents", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnknownAgents(value: Integer): Self = this.set("unknownAgents", value.asInstanceOf[js.Any])
  }
  
}

