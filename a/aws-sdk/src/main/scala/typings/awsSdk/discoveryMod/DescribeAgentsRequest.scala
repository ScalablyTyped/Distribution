package typings.awsSdk.discoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAgentsRequest extends StObject {
  
  /**
    * The agent or the Connector IDs for which you want information. If you specify no IDs, the system returns information about all agents/Connectors associated with your AWS user account.
    */
  var agentIds: js.UndefOr[AgentIds] = js.undefined
  
  /**
    * You can filter the request using various logical operators and a key-value format. For example:   {"key": "collectionStatus", "value": "STARTED"} 
    */
  var filters: js.UndefOr[Filters] = js.undefined
  
  /**
    * The total number of agents/Connectors to return in a single page of output. The maximum value is 100.
    */
  var maxResults: js.UndefOr[Integer] = js.undefined
  
  /**
    * Token to retrieve the next set of results. For example, if you previously specified 100 IDs for DescribeAgentsRequest$agentIds but set DescribeAgentsRequest$maxResults to 10, you received a set of 10 results along with a token. Use that token in this query to get the next set of 10.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object DescribeAgentsRequest {
  
  inline def apply(): DescribeAgentsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAgentsRequest]
  }
  
  extension [Self <: DescribeAgentsRequest](x: Self) {
    
    inline def setAgentIds(value: AgentIds): Self = StObject.set(x, "agentIds", value.asInstanceOf[js.Any])
    
    inline def setAgentIdsUndefined: Self = StObject.set(x, "agentIds", js.undefined)
    
    inline def setAgentIdsVarargs(value: AgentId*): Self = StObject.set(x, "agentIds", js.Array(value :_*))
    
    inline def setFilters(value: Filters): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    inline def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "filters", js.Array(value :_*))
    
    inline def setMaxResults(value: Integer): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
