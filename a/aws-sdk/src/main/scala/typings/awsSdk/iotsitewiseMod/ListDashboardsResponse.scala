package typings.awsSdk.iotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDashboardsResponse extends StObject {
  
  /**
    * A list that summarizes each dashboard in the project.
    */
  var dashboardSummaries: DashboardSummaries
  
  /**
    * The token for the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListDashboardsResponse {
  
  @scala.inline
  def apply(dashboardSummaries: DashboardSummaries): ListDashboardsResponse = {
    val __obj = js.Dynamic.literal(dashboardSummaries = dashboardSummaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDashboardsResponse]
  }
  
  @scala.inline
  implicit class ListDashboardsResponseMutableBuilder[Self <: ListDashboardsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDashboardSummaries(value: DashboardSummaries): Self = StObject.set(x, "dashboardSummaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDashboardSummariesVarargs(value: DashboardSummary*): Self = StObject.set(x, "dashboardSummaries", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
