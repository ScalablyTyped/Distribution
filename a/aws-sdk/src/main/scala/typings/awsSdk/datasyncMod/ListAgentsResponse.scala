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
  def apply(): ListAgentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAgentsResponse]
  }
  @scala.inline
  implicit class ListAgentsResponseOps[Self <: ListAgentsResponse] (val x: Self) extends AnyVal {
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
    def setAgentsVarargs(value: AgentListEntry*): Self = this.set("Agents", js.Array(value :_*))
    @scala.inline
    def setAgents(value: AgentList): Self = this.set("Agents", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAgents: Self = this.set("Agents", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

