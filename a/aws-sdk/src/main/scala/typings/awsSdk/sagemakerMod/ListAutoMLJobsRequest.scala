package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListAutoMLJobsRequest extends js.Object {
  /**
    * Request a list of jobs, using a filter for time.
    */
  var CreationTimeAfter: js.UndefOr[Timestamp] = js.native
  /**
    * Request a list of jobs, using a filter for time.
    */
  var CreationTimeBefore: js.UndefOr[Timestamp] = js.native
  /**
    * Request a list of jobs, using a filter for time.
    */
  var LastModifiedTimeAfter: js.UndefOr[Timestamp] = js.native
  /**
    * Request a list of jobs, using a filter for time.
    */
  var LastModifiedTimeBefore: js.UndefOr[Timestamp] = js.native
  /**
    * Request a list of jobs up to a specified limit.
    */
  var MaxResults: js.UndefOr[AutoMLMaxResults] = js.native
  /**
    * Request a list of jobs, using a search filter for name.
    */
  var NameContains: js.UndefOr[AutoMLNameContains] = js.native
  /**
    * If the previous response was truncated, you will receive this token. Use it in your next request to receive the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.sagemakerMod.NextToken] = js.native
  /**
    * The parameter by which to sort the results. The default is AutoMLJobName.
    */
  var SortBy: js.UndefOr[AutoMLSortBy] = js.native
  /**
    * The sort order for the results. The default is Descending.
    */
  var SortOrder: js.UndefOr[AutoMLSortOrder] = js.native
  /**
    * Request a list of jobs, using a filter for status.
    */
  var StatusEquals: js.UndefOr[AutoMLJobStatus] = js.native
}

object ListAutoMLJobsRequest {
  @scala.inline
  def apply(
    CreationTimeAfter: Timestamp = null,
    CreationTimeBefore: Timestamp = null,
    LastModifiedTimeAfter: Timestamp = null,
    LastModifiedTimeBefore: Timestamp = null,
    MaxResults: Int | Double = null,
    NameContains: AutoMLNameContains = null,
    NextToken: NextToken = null,
    SortBy: AutoMLSortBy = null,
    SortOrder: AutoMLSortOrder = null,
    StatusEquals: AutoMLJobStatus = null
  ): ListAutoMLJobsRequest = {
    val __obj = js.Dynamic.literal()
    if (CreationTimeAfter != null) __obj.updateDynamic("CreationTimeAfter")(CreationTimeAfter.asInstanceOf[js.Any])
    if (CreationTimeBefore != null) __obj.updateDynamic("CreationTimeBefore")(CreationTimeBefore.asInstanceOf[js.Any])
    if (LastModifiedTimeAfter != null) __obj.updateDynamic("LastModifiedTimeAfter")(LastModifiedTimeAfter.asInstanceOf[js.Any])
    if (LastModifiedTimeBefore != null) __obj.updateDynamic("LastModifiedTimeBefore")(LastModifiedTimeBefore.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NameContains != null) __obj.updateDynamic("NameContains")(NameContains.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (SortBy != null) __obj.updateDynamic("SortBy")(SortBy.asInstanceOf[js.Any])
    if (SortOrder != null) __obj.updateDynamic("SortOrder")(SortOrder.asInstanceOf[js.Any])
    if (StatusEquals != null) __obj.updateDynamic("StatusEquals")(StatusEquals.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAutoMLJobsRequest]
  }
}

