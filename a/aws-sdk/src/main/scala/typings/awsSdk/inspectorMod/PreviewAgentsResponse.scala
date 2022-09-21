package typings.awsSdk.inspectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PreviewAgentsResponse extends StObject {
  
  /**
    * The resulting list of agents.
    */
  var agentPreviews: AgentPreviewList
  
  /**
    *  When a response is generated, if there is more data to be listed, this parameter is present in the response and contains the value to use for the nextToken parameter in a subsequent pagination request. If there is no more data to be listed, this parameter is set to null.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}
object PreviewAgentsResponse {
  
  inline def apply(agentPreviews: AgentPreviewList): PreviewAgentsResponse = {
    val __obj = js.Dynamic.literal(agentPreviews = agentPreviews.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreviewAgentsResponse]
  }
  
  extension [Self <: PreviewAgentsResponse](x: Self) {
    
    inline def setAgentPreviews(value: AgentPreviewList): Self = StObject.set(x, "agentPreviews", value.asInstanceOf[js.Any])
    
    inline def setAgentPreviewsVarargs(value: AgentPreview*): Self = StObject.set(x, "agentPreviews", js.Array(value*))
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
