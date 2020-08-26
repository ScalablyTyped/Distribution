package typings.awsSdk.discoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAgentsRequest extends js.Object {
  /**
    * The agent or the Connector IDs for which you want information. If you specify no IDs, the system returns information about all agents/Connectors associated with your AWS user account.
    */
  var agentIds: js.UndefOr[AgentIds] = js.native
  /**
    * You can filter the request using various logical operators and a key-value format. For example:   {"key": "collectionStatus", "value": "STARTED"} 
    */
  var filters: js.UndefOr[Filters] = js.native
  /**
    * The total number of agents/Connectors to return in a single page of output. The maximum value is 100.
    */
  var maxResults: js.UndefOr[Integer] = js.native
  /**
    * Token to retrieve the next set of results. For example, if you previously specified 100 IDs for DescribeAgentsRequest$agentIds but set DescribeAgentsRequest$maxResults to 10, you received a set of 10 results along with a token. Use that token in this query to get the next set of 10.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object DescribeAgentsRequest {
  @scala.inline
  def apply(): DescribeAgentsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAgentsRequest]
  }
  @scala.inline
  implicit class DescribeAgentsRequestOps[Self <: DescribeAgentsRequest] (val x: Self) extends AnyVal {
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
    @scala.inline
    def deleteAgentIds: Self = this.set("agentIds", js.undefined)
    @scala.inline
    def setFiltersVarargs(value: Filter*): Self = this.set("filters", js.Array(value :_*))
    @scala.inline
    def setFilters(value: Filters): Self = this.set("filters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
    @scala.inline
    def setMaxResults(value: Integer): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
  
}

