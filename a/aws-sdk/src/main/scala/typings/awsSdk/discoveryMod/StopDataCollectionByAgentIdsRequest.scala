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
}

