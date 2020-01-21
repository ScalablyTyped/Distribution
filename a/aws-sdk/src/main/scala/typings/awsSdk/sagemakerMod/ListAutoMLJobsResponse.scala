package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListAutoMLJobsResponse extends js.Object {
  /**
    * Returns a summary list of jobs.
    */
  var AutoMLJobSummaries: typings.awsSdk.sagemakerMod.AutoMLJobSummaries = js.native
  /**
    * If the previous response was truncated, you will receive this token. Use it in your next request to receive the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.sagemakerMod.NextToken] = js.native
}

object ListAutoMLJobsResponse {
  @scala.inline
  def apply(AutoMLJobSummaries: AutoMLJobSummaries, NextToken: NextToken = null): ListAutoMLJobsResponse = {
    val __obj = js.Dynamic.literal(AutoMLJobSummaries = AutoMLJobSummaries.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAutoMLJobsResponse]
  }
}

