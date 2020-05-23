package typings.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDataSourceSyncJobsRequest extends js.Object {
  /**
    * The identifier of the data source.
    */
  var Id: DataSourceId = js.native
  /**
    * The identifier of the index that contains the data source.
    */
  var IndexId: typings.awsSdk.kendraMod.IndexId = js.native
  /**
    * The maximum number of synchronization jobs to return in the response. If there are fewer results in the list, this response contains only the actual results.
    */
  var MaxResults: js.UndefOr[MaxResultsIntegerForListDataSourceSyncJobsRequest] = js.native
  /**
    * If the result of the previous request to GetDataSourceSyncJobHistory was truncated, include the NextToken to fetch the next set of jobs.
    */
  var NextToken: js.UndefOr[typings.awsSdk.kendraMod.NextToken] = js.native
  /**
    * When specified, the synchronization jobs returned in the list are limited to jobs between the specified dates. 
    */
  var StartTimeFilter: js.UndefOr[TimeRange] = js.native
  /**
    * When specified, only returns synchronization jobs with the Status field equal to the specified status.
    */
  var StatusFilter: js.UndefOr[DataSourceSyncJobStatus] = js.native
}

object ListDataSourceSyncJobsRequest {
  @scala.inline
  def apply(
    Id: DataSourceId,
    IndexId: IndexId,
    MaxResults: js.UndefOr[MaxResultsIntegerForListDataSourceSyncJobsRequest] = js.undefined,
    NextToken: NextToken = null,
    StartTimeFilter: TimeRange = null,
    StatusFilter: DataSourceSyncJobStatus = null
  ): ListDataSourceSyncJobsRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], IndexId = IndexId.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults.get.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (StartTimeFilter != null) __obj.updateDynamic("StartTimeFilter")(StartTimeFilter.asInstanceOf[js.Any])
    if (StatusFilter != null) __obj.updateDynamic("StatusFilter")(StatusFilter.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDataSourceSyncJobsRequest]
  }
}

