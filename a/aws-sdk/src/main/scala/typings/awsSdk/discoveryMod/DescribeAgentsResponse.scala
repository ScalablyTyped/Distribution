package typings.awsSdk.discoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAgentsResponse extends js.Object {
  /**
    * Lists agents or the Connector by ID or lists all agents/Connectors associated with your user account if you did not specify an agent/Connector ID. The output includes agent/Connector IDs, IP addresses, media access control (MAC) addresses, agent/Connector health, host name where the agent/Connector resides, and the version number of each agent/Connector.
    */
  var agentsInfo: js.UndefOr[AgentsInfo] = js.native
  /**
    * Token to retrieve the next set of results. For example, if you specified 100 IDs for DescribeAgentsRequest$agentIds but set DescribeAgentsRequest$maxResults to 10, you received a set of 10 results along with this token. Use this token in the next query to retrieve the next set of 10.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object DescribeAgentsResponse {
  @scala.inline
  def apply(): DescribeAgentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAgentsResponse]
  }
  @scala.inline
  implicit class DescribeAgentsResponseOps[Self <: DescribeAgentsResponse] (val x: Self) extends AnyVal {
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
    def setAgentsInfoVarargs(value: AgentInfo*): Self = this.set("agentsInfo", js.Array(value :_*))
    @scala.inline
    def setAgentsInfo(value: AgentsInfo): Self = this.set("agentsInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAgentsInfo: Self = this.set("agentsInfo", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
  
}

