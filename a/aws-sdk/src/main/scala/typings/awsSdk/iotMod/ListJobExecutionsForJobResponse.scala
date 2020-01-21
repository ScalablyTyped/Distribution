package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListJobExecutionsForJobResponse extends js.Object {
  /**
    * A list of job execution summaries.
    */
  var executionSummaries: js.UndefOr[JobExecutionSummaryForJobList] = js.native
  /**
    * The token for the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object ListJobExecutionsForJobResponse {
  @scala.inline
  def apply(executionSummaries: JobExecutionSummaryForJobList = null, nextToken: NextToken = null): ListJobExecutionsForJobResponse = {
    val __obj = js.Dynamic.literal()
    if (executionSummaries != null) __obj.updateDynamic("executionSummaries")(executionSummaries.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListJobExecutionsForJobResponse]
  }
}

