package typings.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListRobotApplicationsRequest extends js.Object {
  /**
    * Optional filters to limit results. The filter name name is supported. When filtering, you must use the complete value of the filtered item. You can use up to three filters.
    */
  var filters: js.UndefOr[Filters] = js.native
  /**
    * When this parameter is used, ListRobotApplications only returns maxResults results in a single page along with a nextToken response element. The remaining results of the initial request can be seen by sending another ListRobotApplications request with the returned nextToken value. This value can be between 1 and 100. If this parameter is not used, then ListRobotApplications returns up to 100 results and a nextToken value if applicable. 
    */
  var maxResults: js.UndefOr[MaxResults] = js.native
  /**
    * The nextToken value returned from a previous paginated ListRobotApplications request where maxResults was used and the results exceeded the value of that parameter. Pagination continues from the end of the previous results that returned the nextToken value. 
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
  /**
    * The version qualifier of the robot application.
    */
  var versionQualifier: js.UndefOr[VersionQualifier] = js.native
}

object ListRobotApplicationsRequest {
  @scala.inline
  def apply(
    filters: Filters = null,
    maxResults: Int | Double = null,
    nextToken: PaginationToken = null,
    versionQualifier: VersionQualifier = null
  ): ListRobotApplicationsRequest = {
    val __obj = js.Dynamic.literal()
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (versionQualifier != null) __obj.updateDynamic("versionQualifier")(versionQualifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListRobotApplicationsRequest]
  }
}

