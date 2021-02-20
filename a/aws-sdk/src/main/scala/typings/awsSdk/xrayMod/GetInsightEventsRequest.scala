package typings.awsSdk.xrayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetInsightEventsRequest extends StObject {
  
  /**
    * The insight's unique identifier. Use the GetInsightSummaries action to retrieve an InsightId.
    */
  var InsightId: typings.awsSdk.xrayMod.InsightId = js.native
  
  /**
    * Used to retrieve at most the specified value of events.
    */
  var MaxResults: js.UndefOr[GetInsightEventsMaxResults] = js.native
  
  /**
    * Specify the pagination token returned by a previous request to retrieve the next page of events. 
    */
  var NextToken: js.UndefOr[Token] = js.native
}
object GetInsightEventsRequest {
  
  @scala.inline
  def apply(InsightId: InsightId): GetInsightEventsRequest = {
    val __obj = js.Dynamic.literal(InsightId = InsightId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetInsightEventsRequest]
  }
  
  @scala.inline
  implicit class GetInsightEventsRequestMutableBuilder[Self <: GetInsightEventsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInsightId(value: InsightId): Self = StObject.set(x, "InsightId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResults(value: GetInsightEventsMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
