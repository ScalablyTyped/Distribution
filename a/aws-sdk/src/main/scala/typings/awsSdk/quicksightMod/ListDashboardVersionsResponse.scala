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
    * The AWS request ID for this operation.
    */
  var RequestId: js.UndefOr[String] = js.undefined
  
  /**
    * The HTTP status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.undefined
}
object ListDashboardVersionsResponse {
  
  @scala.inline
  def apply(): ListDashboardVersionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDashboardVersionsResponse]
  }
  
  @scala.inline
  implicit class ListDashboardVersionsResponseMutableBuilder[Self <: ListDashboardVersionsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDashboardVersionSummaryList(value: DashboardVersionSummaryList): Self = StObject.set(x, "DashboardVersionSummaryList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDashboardVersionSummaryListUndefined: Self = StObject.set(x, "DashboardVersionSummaryList", js.undefined)
    
    @scala.inline
    def setDashboardVersionSummaryListVarargs(value: DashboardVersionSummary*): Self = StObject.set(x, "DashboardVersionSummaryList", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setRequestId(value: String): Self = StObject.set(x, "RequestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestIdUndefined: Self = StObject.set(x, "RequestId", js.undefined)
    
    @scala.inline
    def setStatus(value: StatusCode): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
