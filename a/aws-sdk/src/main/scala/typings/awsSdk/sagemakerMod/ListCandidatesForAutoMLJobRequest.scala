package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListCandidatesForAutoMLJobRequest extends js.Object {
  /**
    * List the Candidates created for the job by providing the job's name.
    */
  var AutoMLJobName: typings.awsSdk.sagemakerMod.AutoMLJobName = js.native
  /**
    * List the Candidates for the job and filter by candidate name.
    */
  var CandidateNameEquals: js.UndefOr[CandidateName] = js.native
  /**
    * List the job's Candidates up to a specified limit.
    */
  var MaxResults: js.UndefOr[AutoMLMaxResults] = js.native
  /**
    * If the previous response was truncated, you will receive this token. Use it in your next request to receive the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.sagemakerMod.NextToken] = js.native
  /**
    * The parameter by which to sort the results. The default is Descending.
    */
  var SortBy: js.UndefOr[CandidateSortBy] = js.native
  /**
    * The sort order for the results. The default is Ascending.
    */
  var SortOrder: js.UndefOr[AutoMLSortOrder] = js.native
  /**
    * List the Candidates for the job and filter by status.
    */
  var StatusEquals: js.UndefOr[CandidateStatus] = js.native
}

object ListCandidatesForAutoMLJobRequest {
  @scala.inline
  def apply(
    AutoMLJobName: AutoMLJobName,
    CandidateNameEquals: CandidateName = null,
    MaxResults: js.UndefOr[AutoMLMaxResults] = js.undefined,
    NextToken: NextToken = null,
    SortBy: CandidateSortBy = null,
    SortOrder: AutoMLSortOrder = null,
    StatusEquals: CandidateStatus = null
  ): ListCandidatesForAutoMLJobRequest = {
    val __obj = js.Dynamic.literal(AutoMLJobName = AutoMLJobName.asInstanceOf[js.Any])
    if (CandidateNameEquals != null) __obj.updateDynamic("CandidateNameEquals")(CandidateNameEquals.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults.get.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (SortBy != null) __obj.updateDynamic("SortBy")(SortBy.asInstanceOf[js.Any])
    if (SortOrder != null) __obj.updateDynamic("SortOrder")(SortOrder.asInstanceOf[js.Any])
    if (StatusEquals != null) __obj.updateDynamic("StatusEquals")(StatusEquals.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListCandidatesForAutoMLJobRequest]
  }
}

