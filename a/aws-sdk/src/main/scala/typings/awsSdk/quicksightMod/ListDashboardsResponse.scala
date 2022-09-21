package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDashboardsResponse extends StObject {
  
  /**
    * A structure that contains all of the dashboards in your Amazon Web Services account. This structure provides basic information about the dashboards.
    */
  var DashboardSummaryList: js.UndefOr[typings.awsSdk.quicksightMod.DashboardSummaryList] = js.undefined
  
  /**
    * The token for the next set of results, or null if there are no more results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Web Services request ID for this operation.
    */
  var RequestId: js.UndefOr[String] = js.undefined
  
  /**
    * The HTTP status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.undefined
}
object ListDashboardsResponse {
  
  inline def apply(): ListDashboardsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDashboardsResponse]
  }
  
  extension [Self <: ListDashboardsResponse](x: Self) {
    
    inline def setDashboardSummaryList(value: DashboardSummaryList): Self = StObject.set(x, "DashboardSummaryList", value.asInstanceOf[js.Any])
    
    inline def setDashboardSummaryListUndefined: Self = StObject.set(x, "DashboardSummaryList", js.undefined)
    
    inline def setDashboardSummaryListVarargs(value: DashboardSummary*): Self = StObject.set(x, "DashboardSummaryList", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setRequestId(value: String): Self = StObject.set(x, "RequestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "RequestId", js.undefined)
    
    inline def setStatus(value: StatusCode): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
