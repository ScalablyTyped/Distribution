package typings.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListRobotApplicationsResponse extends js.Object {
  /**
    * The nextToken value to include in a future ListRobotApplications request. When the results of a ListRobotApplications request exceed maxResults, this value can be used to retrieve the next page of results. This value is null when there are no more results to return. 
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
  /**
    * A list of robot application summaries that meet the criteria of the request.
    */
  var robotApplicationSummaries: js.UndefOr[RobotApplicationSummaries] = js.native
}

object ListRobotApplicationsResponse {
  @scala.inline
  def apply(nextToken: PaginationToken = null, robotApplicationSummaries: RobotApplicationSummaries = null): ListRobotApplicationsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (robotApplicationSummaries != null) __obj.updateDynamic("robotApplicationSummaries")(robotApplicationSummaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListRobotApplicationsResponse]
  }
}

