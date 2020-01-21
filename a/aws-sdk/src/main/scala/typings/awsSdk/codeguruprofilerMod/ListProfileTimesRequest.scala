package typings.awsSdk.codeguruprofilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListProfileTimesRequest extends js.Object {
  /**
    * The end time of the time range to list profiles until.
    */
  var endTime: Timestamp = js.native
  var maxResults: js.UndefOr[MaxResults] = js.native
  var nextToken: js.UndefOr[PaginationToken] = js.native
  /**
    * The order (ascending or descending by start time of the profile) to list the profiles by. Defaults to TIMESTAMP_DESCENDING.
    */
  var orderBy: js.UndefOr[OrderBy] = js.native
  /**
    * The aggregation period to list the profiles for.
    */
  var period: AggregationPeriod = js.native
  var profilingGroupName: ProfilingGroupName = js.native
  /**
    * The start time of the time range to list the profiles from.
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

