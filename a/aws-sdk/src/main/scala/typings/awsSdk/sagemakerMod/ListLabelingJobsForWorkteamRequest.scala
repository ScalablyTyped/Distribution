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
  def apply(
    WorkteamArn: WorkteamArn,
    CreationTimeAfter: Timestamp = null,
    CreationTimeBefore: Timestamp = null,
    JobReferenceCodeContains: JobReferenceCodeContains = null,
    MaxResults: Int | Double = null,
    NextToken: NextToken = null,
    SortBy: ListLabelingJobsForWorkteamSortByOptions = null,
    SortOrder: SortOrder = null
  ): ListLabelingJobsForWorkteamRequest = {
    val __obj = js.Dynamic.literal(WorkteamArn = WorkteamArn.asInstanceOf[js.Any])
    if (CreationTimeAfter != null) __obj.updateDynamic("CreationTimeAfter")(CreationTimeAfter.asInstanceOf[js.Any])
    if (CreationTimeBefore != null) __obj.updateDynamic("CreationTimeBefore")(CreationTimeBefore.asInstanceOf[js.Any])
    if (JobReferenceCodeContains != null) __obj.updateDynamic("JobReferenceCodeContains")(JobReferenceCodeContains.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (SortBy != null) __obj.updateDynamic("SortBy")(SortBy.asInstanceOf[js.Any])
    if (SortOrder != null) __obj.updateDynamic("SortOrder")(SortOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListLabelingJobsForWorkteamRequest]
  }
}

