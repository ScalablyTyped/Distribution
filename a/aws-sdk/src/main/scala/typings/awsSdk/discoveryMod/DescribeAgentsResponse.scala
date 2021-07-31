package typings.awsSdk.discoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAgentsResponse extends StObject {
  
  /**
    * Lists agents or the Connector by ID or lists all agents/Connectors associated with your user account if you did not specify an agent/Connector ID. The output includes agent/Connector IDs, IP addresses, media access control (MAC) addresses, agent/Connector health, host name where the agent/Connector resides, and the version number of each agent/Connector.
    */
  var agentsInfo: js.UndefOr[AgentsInfo] = js.undefined
  
  /**
    * Token to retrieve the next set of results. For example, if you specified 100 IDs for DescribeAgentsRequest$agentIds but set DescribeAgentsRequest$maxResults to 10, you received a set of 10 results along with this token. Use this token in the next query to retrieve the next set of 10.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object DescribeAgentsResponse {
  
  @scala.inline
  def apply(): DescribeAgentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAgentsResponse]
  }
  
  @scala.inline
  implicit class DescribeAgentsResponseMutableBuilder[Self <: DescribeAgentsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAgentsInfo(value: AgentsInfo): Self = StObject.set(x, "agentsInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAgentsInfoUndefined: Self = StObject.set(x, "agentsInfo", js.undefined)
    
    @scala.inline
    def setAgentsInfoVarargs(value: AgentInfo*): Self = StObject.set(x, "agentsInfo", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
