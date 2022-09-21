package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDashboardVersionsResponse extends StObject {
  
  /**
    * A structure that contains information about each version of the dashboard.
    */
  var DashboardVersionSummaryList: js.UndefOr[typings.awsSdk.quicksightMod.DashboardVersionSummaryList] = js.undefined
  
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
object ListDashboardVersionsResponse {
  
  inline def apply(): ListDashboardVersionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDashboardVersionsResponse]
  }
  
  extension [Self <: ListDashboardVersionsResponse](x: Self) {
    
    inline def setDashboardVersionSummaryList(value: DashboardVersionSummaryList): Self = StObject.set(x, "DashboardVersionSummaryList", value.asInstanceOf[js.Any])
    
    inline def setDashboardVersionSummaryListUndefined: Self = StObject.set(x, "DashboardVersionSummaryList", js.undefined)
    
    inline def setDashboardVersionSummaryListVarargs(value: DashboardVersionSummary*): Self = StObject.set(x, "DashboardVersionSummaryList", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setRequestId(value: String): Self = StObject.set(x, "RequestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "RequestId", js.undefined)
    
    inline def setStatus(value: StatusCode): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
