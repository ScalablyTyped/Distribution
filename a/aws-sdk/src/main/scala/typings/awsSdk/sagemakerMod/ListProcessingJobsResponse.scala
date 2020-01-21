package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListProcessingJobsResponse extends js.Object {
  /**
    * If the response is truncated, Amazon SageMaker returns this token. To retrieve the next set of processing jobs, use it in the subsequent request.
    */
  var NextToken: js.UndefOr[typings.awsSdk.sagemakerMod.NextToken] = js.native
  /**
    * An array of ProcessingJobSummary objects, each listing a processing job.
    */
  var ProcessingJobSummaries: typings.awsSdk.sagemakerMod.ProcessingJobSummaries = js.native
}

object ListProcessingJobsResponse {
  @scala.inline
  def apply(ProcessingJobSummaries: ProcessingJobSummaries, NextToken: NextToken = null): ListProcessingJobsResponse = {
    val __obj = js.Dynamic.literal(ProcessingJobSummaries = ProcessingJobSummaries.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListProcessingJobsResponse]
  }
}

