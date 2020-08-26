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
  def apply(Id: DataSourceId, IndexId: IndexId): ListDataSourceSyncJobsRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], IndexId = IndexId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDataSourceSyncJobsRequest]
  }
  @scala.inline
  implicit class ListDataSourceSyncJobsRequestOps[Self <: ListDataSourceSyncJobsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setId(value: DataSourceId): Self = this.set("Id", value.asInstanceOf[js.Any])
    @scala.inline
    def setIndexId(value: IndexId): Self = this.set("IndexId", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxResults(value: MaxResultsIntegerForListDataSourceSyncJobsRequest): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setStartTimeFilter(value: TimeRange): Self = this.set("StartTimeFilter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartTimeFilter: Self = this.set("StartTimeFilter", js.undefined)
    @scala.inline
    def setStatusFilter(value: DataSourceSyncJobStatus): Self = this.set("StatusFilter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatusFilter: Self = this.set("StatusFilter", js.undefined)
  }
  
}

