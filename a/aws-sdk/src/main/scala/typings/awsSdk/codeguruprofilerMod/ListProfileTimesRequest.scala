package typings.awsSdk.codeguruprofilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListProfileTimesRequest extends js.Object {
  /**
    * The end time of the time range from which to list the profiles.
    */
  var endTime: Timestamp = js.native
  /**
    * The maximum number of profile time results returned by ListProfileTimes in paginated output. When this parameter is used, ListProfileTimes only returns maxResults results in a single page with a nextToken response element. The remaining results of the initial request can be seen by sending another ListProfileTimes request with the returned nextToken value. 
    */
  var maxResults: js.UndefOr[MaxResults] = js.native
  /**
    * The nextToken value returned from a previous paginated ListProfileTimes request where maxResults was used and the results exceeded the value of that parameter. Pagination continues from the end of the previous results that returned the nextToken value.   This token should be treated as an opaque identifier that is only used to retrieve the next items in a list and not for other programmatic purposes. 
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
  /**
    * The order (ascending or descending by start time of the profile) to use when listing profiles. Defaults to TIMESTAMP_DESCENDING. 
    */
  var orderBy: js.UndefOr[OrderBy] = js.native
  /**
    * The aggregation period.
    */
  var period: AggregationPeriod = js.native
  /**
    * The name of the profiling group.
    */
  var profilingGroupName: ProfilingGroupName = js.native
  /**
    * The start time of the time range from which to list the profiles.
    */
  var startTime: Timestamp = js.native
}

object ListProfileTimesRequest {
  @scala.inline
  def apply(
    endTime: Timestamp,
    period: AggregationPeriod,
    profilingGroupName: ProfilingGroupName,
    startTime: Timestamp,
    maxResults: Int | Double = null,
    nextToken: PaginationToken = null,
    orderBy: OrderBy = null
  ): ListProfileTimesRequest = {
    val __obj = js.Dynamic.literal(endTime = endTime.asInstanceOf[js.Any], period = period.asInstanceOf[js.Any], profilingGroupName = profilingGroupName.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any])
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (orderBy != null) __obj.updateDynamic("orderBy")(orderBy.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListProfileTimesRequest]
  }
}

