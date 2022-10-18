package typings.awsSdk.clientsWisdomMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAssistantsResponse extends StObject {
  
  /**
    * Information about the assistants.
    */
  var assistantSummaries: AssistantList
  
  /**
    * If there are additional results, this is the token for the next set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListAssistantsResponse {
  
  inline def apply(assistantSummaries: AssistantList): ListAssistantsResponse = {
    val __obj = js.Dynamic.literal(assistantSummaries = assistantSummaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAssistantsResponse]
  }
  
  extension [Self <: ListAssistantsResponse](x: Self) {
    
    inline def setAssistantSummaries(value: AssistantList): Self = StObject.set(x, "assistantSummaries", value.asInstanceOf[js.Any])
    
    inline def setAssistantSummariesVarargs(value: AssistantSummary*): Self = StObject.set(x, "assistantSummaries", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
