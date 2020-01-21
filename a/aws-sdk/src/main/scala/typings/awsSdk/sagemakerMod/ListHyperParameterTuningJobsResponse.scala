package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListHyperParameterTuningJobsResponse extends js.Object {
  /**
    * A list of HyperParameterTuningJobSummary objects that describe the tuning jobs that the ListHyperParameterTuningJobs request returned.
    */
  var HyperParameterTuningJobSummaries: typings.awsSdk.sagemakerMod.HyperParameterTuningJobSummaries = js.native
  /**
    * If the result of this ListHyperParameterTuningJobs request was truncated, the response includes a NextToken. To retrieve the next set of tuning jobs, use the token in the next request.
    */
  var NextToken: js.UndefOr[typings.awsSdk.sagemakerMod.NextToken] = js.native
}

object ListHyperParameterTuningJobsResponse {
  @scala.inline
  def apply(HyperParameterTuningJobSummaries: HyperParameterTuningJobSummaries, NextToken: NextToken = null): ListHyperParameterTuningJobsResponse = {
    val __obj = js.Dynamic.literal(HyperParameterTuningJobSummaries = HyperParameterTuningJobSummaries.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListHyperParameterTuningJobsResponse]
  }
}

