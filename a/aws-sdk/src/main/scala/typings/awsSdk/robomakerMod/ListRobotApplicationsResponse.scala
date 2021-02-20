package typings.awsSdk.robomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListRobotApplicationsResponse extends StObject {
  
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
  implicit class ListRobotApplicationsResponseMutableBuilder[Self <: ListRobotApplicationsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setRobotApplicationSummaries(value: RobotApplicationSummaries): Self = StObject.set(x, "robotApplicationSummaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRobotApplicationSummariesUndefined: Self = StObject.set(x, "robotApplicationSummaries", js.undefined)
    
    @scala.inline
    def setRobotApplicationSummariesVarargs(value: RobotApplicationSummary*): Self = StObject.set(x, "robotApplicationSummaries", js.Array(value :_*))
  }
}
