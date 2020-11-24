package typings.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListRobotApplicationsResponse extends js.Object {
  
  /**
    * If the previous paginated request did not return all of the remaining results, the response object's nextToken parameter value is set to a token. To retrieve the next set of results, call ListRobotApplications again and assign that token to the request object's nextToken parameter. If there are no remaining results, the previous response object's NextToken parameter is set to null. 
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
  
  /**
    * A list of robot application summaries that meet the criteria of the request.
    */
  var robotApplicationSummaries: js.UndefOr[RobotApplicationSummaries] = js.native
}
object ListRobotApplicationsResponse {
  
  @scala.inline
  def apply(): ListRobotApplicationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRobotApplicationsResponse]
  }
  
  @scala.inline
  implicit class ListRobotApplicationsResponseOps[Self <: ListRobotApplicationsResponse] (val x: Self) extends AnyVal {
    
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
    def setNextToken(value: PaginationToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
    
    @scala.inline
    def setRobotApplicationSummariesVarargs(value: RobotApplicationSummary*): Self = this.set("robotApplicationSummaries", js.Array(value :_*))
    
    @scala.inline
    def setRobotApplicationSummaries(value: RobotApplicationSummaries): Self = this.set("robotApplicationSummaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRobotApplicationSummaries: Self = this.set("robotApplicationSummaries", js.undefined)
  }
}
