package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListDashboardsResponse extends js.Object {
  
  /**
    * A list that summarizes each dashboard in the project.
    */
  var dashboardSummaries: DashboardSummaries = js.native
  
  /**
    * The token for the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}
object ListDashboardsResponse {
  
  @scala.inline
  def apply(dashboardSummaries: DashboardSummaries): ListDashboardsResponse = {
    val __obj = js.Dynamic.literal(dashboardSummaries = dashboardSummaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDashboardsResponse]
  }
  
  @scala.inline
  implicit class ListDashboardsResponseOps[Self <: ListDashboardsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDashboardSummariesVarargs(value: DashboardSummary*): Self = this.set("dashboardSummaries", js.Array(value :_*))
    
    @scala.inline
    def setDashboardSummaries(value: DashboardSummaries): Self = this.set("dashboardSummaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
}
