package typings.awsSdk.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AgentFilter extends js.Object {
  /**
    * The detailed health state of the agent. Values can be set to IDLE, RUNNING, SHUTDOWN, UNHEALTHY, THROTTLED, and UNKNOWN. 
    */
  var agentHealthCodes: AgentHealthCodeList = js.native
  /**
    * The current health state of the agent. Values can be set to HEALTHY or UNHEALTHY.
    */
  var agentHealths: AgentHealthList = js.native
}

object AgentFilter {
  @scala.inline
  def apply(agentHealthCodes: AgentHealthCodeList, agentHealths: AgentHealthList): AgentFilter = {
    val __obj = js.Dynamic.literal(agentHealthCodes = agentHealthCodes.asInstanceOf[js.Any], agentHealths = agentHealths.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentFilter]
  }
  @scala.inline
  implicit class AgentFilterOps[Self <: AgentFilter] (val x: Self) extends AnyVal {
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
    def setAgentHealthCodesVarargs(value: AgentHealthCode*): Self = this.set("agentHealthCodes", js.Array(value :_*))
    @scala.inline
    def setAgentHealthCodes(value: AgentHealthCodeList): Self = this.set("agentHealthCodes", value.asInstanceOf[js.Any])
    @scala.inline
    def setAgentHealthsVarargs(value: AgentHealth*): Self = this.set("agentHealths", js.Array(value :_*))
    @scala.inline
    def setAgentHealths(value: AgentHealthList): Self = this.set("agentHealths", value.asInstanceOf[js.Any])
  }
  
}

