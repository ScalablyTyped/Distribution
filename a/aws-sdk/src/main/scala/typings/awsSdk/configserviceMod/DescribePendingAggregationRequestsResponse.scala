package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribePendingAggregationRequestsResponse extends StObject {
  
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[String] = js.native
  
  /**
    * Returns a PendingAggregationRequests object.
    */
  var PendingAggregationRequests: js.UndefOr[PendingAggregationRequestList] = js.native
}
object DescribePendingAggregationRequestsResponse {
  
  @scala.inline
  def apply(): DescribePendingAggregationRequestsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribePendingAggregationRequestsResponse]
  }
  
  @scala.inline
  implicit class DescribePendingAggregationRequestsResponseMutableBuilder[Self <: DescribePendingAggregationRequestsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setPendingAggregationRequests(value: PendingAggregationRequestList): Self = StObject.set(x, "PendingAggregationRequests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPendingAggregationRequestsUndefined: Self = StObject.set(x, "PendingAggregationRequests", js.undefined)
    
    @scala.inline
    def setPendingAggregationRequestsVarargs(value: PendingAggregationRequest*): Self = StObject.set(x, "PendingAggregationRequests", js.Array(value :_*))
  }
}
