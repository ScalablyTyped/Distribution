package typings.awsSdk.datasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListAgentsResponse extends js.Object {
  /**
    * A list of agents in your account.
    */
  var Agents: js.UndefOr[AgentList] = js.native
  /**
    * An opaque string that indicates the position at which to begin returning the next list of agents.
    */
  var NextToken: js.UndefOr[typings.awsSdk.datasyncMod.NextToken] = js.native
}

object ListAgentsResponse {
  @scala.inline
  def apply(Agents: AgentList = null, NextToken: NextToken = null): ListAgentsResponse = {
    val __obj = js.Dynamic.literal()
    if (Agents != null) __obj.updateDynamic("Agents")(Agents.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAgentsResponse]
  }
}

