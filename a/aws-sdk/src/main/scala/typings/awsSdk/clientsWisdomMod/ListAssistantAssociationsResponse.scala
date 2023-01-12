package typings.awsSdk.clientsWisdomMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAssistantAssociationsResponse extends StObject {
  
  /**
    * Summary information about assistant associations.
    */
  var assistantAssociationSummaries: AssistantAssociationSummaryList
  
  /**
    * If there are additional results, this is the token for the next set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListAssistantAssociationsResponse {
  
  inline def apply(assistantAssociationSummaries: AssistantAssociationSummaryList): ListAssistantAssociationsResponse = {
    val __obj = js.Dynamic.literal(assistantAssociationSummaries = assistantAssociationSummaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAssistantAssociationsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListAssistantAssociationsResponse] (val x: Self) extends AnyVal {
    
    inline def setAssistantAssociationSummaries(value: AssistantAssociationSummaryList): Self = StObject.set(x, "assistantAssociationSummaries", value.asInstanceOf[js.Any])
    
    inline def setAssistantAssociationSummariesVarargs(value: AssistantAssociationSummary*): Self = StObject.set(x, "assistantAssociationSummaries", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
