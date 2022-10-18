package typings.awsSdk.clientsWisdomMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListKnowledgeBasesResponse extends StObject {
  
  /**
    * Information about the knowledge bases.
    */
  var knowledgeBaseSummaries: KnowledgeBaseList
  
  /**
    * If there are additional results, this is the token for the next set of results.
    */
  var nextToken: js.UndefOr[NonEmptyString] = js.undefined
}
object ListKnowledgeBasesResponse {
  
  inline def apply(knowledgeBaseSummaries: KnowledgeBaseList): ListKnowledgeBasesResponse = {
    val __obj = js.Dynamic.literal(knowledgeBaseSummaries = knowledgeBaseSummaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListKnowledgeBasesResponse]
  }
  
  extension [Self <: ListKnowledgeBasesResponse](x: Self) {
    
    inline def setKnowledgeBaseSummaries(value: KnowledgeBaseList): Self = StObject.set(x, "knowledgeBaseSummaries", value.asInstanceOf[js.Any])
    
    inline def setKnowledgeBaseSummariesVarargs(value: KnowledgeBaseSummary*): Self = StObject.set(x, "knowledgeBaseSummaries", js.Array(value*))
    
    inline def setNextToken(value: NonEmptyString): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
