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
  def apply(
    agentIds: AgentIds = null,
    filters: Filters = null,
    maxResults: js.UndefOr[Integer] = js.undefined,
    nextToken: NextToken = null
  ): DescribeAgentsRequest = {
    val __obj = js.Dynamic.literal()
    if (agentIds != null) __obj.updateDynamic("agentIds")(agentIds.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults.get.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAgentsRequest]
  }
}

