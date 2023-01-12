package typings.awsSdk.clientsXrayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetInsightEventsRequest extends StObject {
  
  /**
    * The insight's unique identifier. Use the GetInsightSummaries action to retrieve an InsightId.
    */
  var InsightId: typings.awsSdk.clientsXrayMod.InsightId
  
  /**
    * Used to retrieve at most the specified value of events.
    */
  var MaxResults: js.UndefOr[GetInsightEventsMaxResults] = js.undefined
  
  /**
    * Specify the pagination token returned by a previous request to retrieve the next page of events. 
    */
  var NextToken: js.UndefOr[Token] = js.undefined
}
object GetInsightEventsRequest {
  
  inline def apply(InsightId: InsightId): GetInsightEventsRequest = {
    val __obj = js.Dynamic.literal(InsightId = InsightId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetInsightEventsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetInsightEventsRequest] (val x: Self) extends AnyVal {
    
    inline def setInsightId(value: InsightId): Self = StObject.set(x, "InsightId", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: GetInsightEventsMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
