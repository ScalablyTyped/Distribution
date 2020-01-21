package typings.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListBatchInferenceJobsResponse extends js.Object {
  /**
    * A list containing information on each job that is returned.
    */
  var batchInferenceJobs: js.UndefOr[BatchInferenceJobs] = js.native
  /**
    * The token to use to retreive the next page of results. The value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object ListBatchInferenceJobsResponse {
  @scala.inline
  def apply(batchInferenceJobs: BatchInferenceJobs = null, nextToken: NextToken = null): ListBatchInferenceJobsResponse = {
    val __obj = js.Dynamic.literal()
    if (batchInferenceJobs != null) __obj.updateDynamic("batchInferenceJobs")(batchInferenceJobs.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListBatchInferenceJobsResponse]
  }
}

