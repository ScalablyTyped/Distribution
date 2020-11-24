package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribePendingAggregationRequestsResponse extends js.Object {
  
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
  implicit class DescribePendingAggregationRequestsResponseOps[Self <: DescribePendingAggregationRequestsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setPendingAggregationRequestsVarargs(value: PendingAggregationRequest*): Self = this.set("PendingAggregationRequests", js.Array(value :_*))
    
    @scala.inline
    def setPendingAggregationRequests(value: PendingAggregationRequestList): Self = this.set("PendingAggregationRequests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePendingAggregationRequests: Self = this.set("PendingAggregationRequests", js.undefined)
  }
}
