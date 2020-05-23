package typings.awsSdk.comprehendmedicalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListRxNormInferenceJobsRequest extends js.Object {
  /**
    * Filters the jobs that are returned. You can filter jobs based on their names, status, or the date and time that they were submitted. You can only set one filter at a time.
    */
  var Filter: js.UndefOr[ComprehendMedicalAsyncJobFilter] = js.native
  /**
    * Identifies the next page of results to return.
    */
  var MaxResults: js.UndefOr[MaxResultsInteger] = js.native
  /**
    * Identifies the next page of results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object ListRxNormInferenceJobsRequest {
  @scala.inline
  def apply(
    Filter: ComprehendMedicalAsyncJobFilter = null,
    MaxResults: js.UndefOr[MaxResultsInteger] = js.undefined,
    NextToken: String = null
  ): ListRxNormInferenceJobsRequest = {
    val __obj = js.Dynamic.literal()
    if (Filter != null) __obj.updateDynamic("Filter")(Filter.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults.get.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListRxNormInferenceJobsRequest]
  }
}

