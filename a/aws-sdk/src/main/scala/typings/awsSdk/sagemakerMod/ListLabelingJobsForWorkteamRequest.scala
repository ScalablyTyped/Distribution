package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListLabelingJobsForWorkteamRequest extends js.Object {
  /**
    * A filter that returns only labeling jobs created after the specified time (timestamp).
    */
  var CreationTimeAfter: js.UndefOr[Timestamp] = js.native
  /**
    * A filter that returns only labeling jobs created before the specified time (timestamp).
    */
  var CreationTimeBefore: js.UndefOr[Timestamp] = js.native
  /**
    * A filter the limits jobs to only the ones whose job reference code contains the specified string.
    */
  var JobReferenceCodeContains: js.UndefOr[typings.awsSdk.sagemakerMod.JobReferenceCodeContains] = js.native
  /**
    * The maximum number of labeling jobs to return in each page of the response.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.sagemakerMod.MaxResults] = js.native
  /**
    * If the result of the previous ListLabelingJobsForWorkteam request was truncated, the response includes a NextToken. To retrieve the next set of labeling jobs, use the token in the next request.
    */
  var NextToken: js.UndefOr[typings.awsSdk.sagemakerMod.NextToken] = js.native
  /**
    * The field to sort results by. The default is CreationTime.
    */
  var SortBy: js.UndefOr[ListLabelingJobsForWorkteamSortByOptions] = js.native
  /**
    * The sort order for results. The default is Ascending.
    */
  var SortOrder: js.UndefOr[typings.awsSdk.sagemakerMod.SortOrder] = js.native
  /**
    * The Amazon Resource Name (ARN) of the work team for which you want to see labeling jobs for.
    */
  var WorkteamArn: typings.awsSdk.sagemakerMod.WorkteamArn = js.native
}

object ListLabelingJobsForWorkteamRequest {
  @scala.inline
  def apply(WorkteamArn: WorkteamArn): ListLabelingJobsForWorkteamRequest = {
    val __obj = js.Dynamic.literal(WorkteamArn = WorkteamArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListLabelingJobsForWorkteamRequest]
  }
  @scala.inline
  implicit class ListLabelingJobsForWorkteamRequestOps[Self <: ListLabelingJobsForWorkteamRequest] (val x: Self) extends AnyVal {
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
    def setWorkteamArn(value: WorkteamArn): Self = this.set("WorkteamArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreationTimeAfter(value: Timestamp): Self = this.set("CreationTimeAfter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationTimeAfter: Self = this.set("CreationTimeAfter", js.undefined)
    @scala.inline
    def setCreationTimeBefore(value: Timestamp): Self = this.set("CreationTimeBefore", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationTimeBefore: Self = this.set("CreationTimeBefore", js.undefined)
    @scala.inline
    def setJobReferenceCodeContains(value: JobReferenceCodeContains): Self = this.set("JobReferenceCodeContains", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJobReferenceCodeContains: Self = this.set("JobReferenceCodeContains", js.undefined)
    @scala.inline
    def setMaxResults(value: MaxResults): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setSortBy(value: ListLabelingJobsForWorkteamSortByOptions): Self = this.set("SortBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortBy: Self = this.set("SortBy", js.undefined)
    @scala.inline
    def setSortOrder(value: SortOrder): Self = this.set("SortOrder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortOrder: Self = this.set("SortOrder", js.undefined)
  }
  
}

