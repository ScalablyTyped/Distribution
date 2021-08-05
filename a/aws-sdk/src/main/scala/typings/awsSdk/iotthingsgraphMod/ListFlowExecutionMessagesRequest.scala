package typings.awsSdk.iotthingsgraphMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListFlowExecutionMessagesRequest extends StObject {
  
  /**
    * The ID of the flow execution.
    */
  var flowExecutionId: FlowExecutionId
  
  /**
    * The maximum number of results to return in the response.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * The string that specifies the next page of results. Use this when you're paginating results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListFlowExecutionMessagesRequest {
  
  inline def apply(flowExecutionId: FlowExecutionId): ListFlowExecutionMessagesRequest = {
    val __obj = js.Dynamic.literal(flowExecutionId = flowExecutionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListFlowExecutionMessagesRequest]
  }
  
  extension [Self <: ListFlowExecutionMessagesRequest](x: Self) {
    
    inline def setFlowExecutionId(value: FlowExecutionId): Self = StObject.set(x, "flowExecutionId", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
