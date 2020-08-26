package typings.awsSdk.discoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopDataCollectionByAgentIdsRequest extends js.Object {
  /**
    * The IDs of the agents or connectors from which to stop collecting data.
    */
  var agentIds: AgentIds = js.native
}

object StopDataCollectionByAgentIdsRequest {
  @scala.inline
  def apply(agentIds: AgentIds): StopDataCollectionByAgentIdsRequest = {
    val __obj = js.Dynamic.literal(agentIds = agentIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopDataCollectionByAgentIdsRequest]
  }
  @scala.inline
  implicit class StopDataCollectionByAgentIdsRequestOps[Self <: StopDataCollectionByAgentIdsRequest] (val x: Self) extends AnyVal {
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
    def setAgentIdsVarargs(value: AgentId*): Self = this.set("agentIds", js.Array(value :_*))
    @scala.inline
    def setAgentIds(value: AgentIds): Self = this.set("agentIds", value.asInstanceOf[js.Any])
  }
  
}

