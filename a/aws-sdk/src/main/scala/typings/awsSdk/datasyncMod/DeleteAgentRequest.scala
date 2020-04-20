package typings.awsSdk.datasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteAgentRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the agent to delete. Use the ListAgents operation to return a list of agents for your account and AWS Region.
    */
  var AgentArn: typings.awsSdk.datasyncMod.AgentArn = js.native
}

object DeleteAgentRequest {
  @scala.inline
  def apply(AgentArn: AgentArn): DeleteAgentRequest = {
    val __obj = js.Dynamic.literal(AgentArn = AgentArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAgentRequest]
  }
}

