package typings.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListKeyPhrasesDetectionJobsRequest extends js.Object {
  /**
    * Filters the jobs that are returned. You can filter jobs on their name, status, or the date and time that they were submitted. You can only set one filter at a time.
    */
  var Filter: js.UndefOr[KeyPhrasesDetectionJobFilter] = js.native
  /**
    * The maximum number of results to return in each page. The default is 100.
    */
  var MaxResults: js.UndefOr[MaxResultsInteger] = js.native
  /**
    * Identifies the next page of results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object ListKeyPhrasesDetectionJobsRequest {
  @scala.inline
  def apply(
    Filter: KeyPhrasesDetectionJobFilter = null,
    MaxResults: js.UndefOr[MaxResultsInteger] = js.undefined,
    NextToken: String = null
  ): ListKeyPhrasesDetectionJobsRequest = {
    val __obj = js.Dynamic.literal()
    if (Filter != null) __obj.updateDynamic("Filter")(Filter.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults.get.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListKeyPhrasesDetectionJobsRequest]
  }
}

