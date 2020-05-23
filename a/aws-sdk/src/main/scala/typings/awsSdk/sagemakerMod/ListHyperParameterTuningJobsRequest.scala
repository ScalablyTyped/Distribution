package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListHyperParameterTuningJobsRequest extends js.Object {
  /**
    * A filter that returns only tuning jobs that were created after the specified time.
    */
  var CreationTimeAfter: js.UndefOr[Timestamp] = js.native
  /**
    * A filter that returns only tuning jobs that were created before the specified time.
    */
  var CreationTimeBefore: js.UndefOr[Timestamp] = js.native
  /**
    * A filter that returns only tuning jobs that were modified after the specified time.
    */
  var LastModifiedTimeAfter: js.UndefOr[Timestamp] = js.native
  /**
    * A filter that returns only tuning jobs that were modified before the specified time.
    */
  var LastModifiedTimeBefore: js.UndefOr[Timestamp] = js.native
  /**
    * The maximum number of tuning jobs to return. The default value is 10.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.sagemakerMod.MaxResults] = js.native
  /**
    * A string in the tuning job name. This filter returns only tuning jobs whose name contains the specified string.
    */
  var NameContains: js.UndefOr[typings.awsSdk.sagemakerMod.NameContains] = js.native
  /**
    * If the result of the previous ListHyperParameterTuningJobs request was truncated, the response includes a NextToken. To retrieve the next set of tuning jobs, use the token in the next request.
    */
  var NextToken: js.UndefOr[typings.awsSdk.sagemakerMod.NextToken] = js.native
  /**
    * The field to sort results by. The default is Name.
    */
  var SortBy: js.UndefOr[HyperParameterTuningJobSortByOptions] = js.native
  /**
    * The sort order for results. The default is Ascending.
    */
  var SortOrder: js.UndefOr[typings.awsSdk.sagemakerMod.SortOrder] = js.native
  /**
    * A filter that returns only tuning jobs with the specified status.
    */
  var StatusEquals: js.UndefOr[HyperParameterTuningJobStatus] = js.native
}

object ListHyperParameterTuningJobsRequest {
  @scala.inline
  def apply(
    CreationTimeAfter: Timestamp = null,
    CreationTimeBefore: Timestamp = null,
    LastModifiedTimeAfter: Timestamp = null,
    LastModifiedTimeBefore: Timestamp = null,
    MaxResults: js.UndefOr[MaxResults] = js.undefined,
    NameContains: NameContains = null,
    NextToken: NextToken = null,
    SortBy: HyperParameterTuningJobSortByOptions = null,
    SortOrder: SortOrder = null,
    StatusEquals: HyperParameterTuningJobStatus = null
  ): ListHyperParameterTuningJobsRequest = {
    val __obj = js.Dynamic.literal()
    if (CreationTimeAfter != null) __obj.updateDynamic("CreationTimeAfter")(CreationTimeAfter.asInstanceOf[js.Any])
    if (CreationTimeBefore != null) __obj.updateDynamic("CreationTimeBefore")(CreationTimeBefore.asInstanceOf[js.Any])
    if (LastModifiedTimeAfter != null) __obj.updateDynamic("LastModifiedTimeAfter")(LastModifiedTimeAfter.asInstanceOf[js.Any])
    if (LastModifiedTimeBefore != null) __obj.updateDynamic("LastModifiedTimeBefore")(LastModifiedTimeBefore.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults.get.asInstanceOf[js.Any])
    if (NameContains != null) __obj.updateDynamic("NameContains")(NameContains.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (SortBy != null) __obj.updateDynamic("SortBy")(SortBy.asInstanceOf[js.Any])
    if (SortOrder != null) __obj.updateDynamic("SortOrder")(SortOrder.asInstanceOf[js.Any])
    if (StatusEquals != null) __obj.updateDynamic("StatusEquals")(StatusEquals.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListHyperParameterTuningJobsRequest]
  }
}

