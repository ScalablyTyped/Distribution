package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTrainingJobsResponse extends js.Object {
  /**
    * If the response is truncated, Amazon SageMaker returns this token. To retrieve the next set of training jobs, use it in the subsequent request.
    */
  var NextToken: js.UndefOr[typings.awsSdk.sagemakerMod.NextToken] = js.native
  /**
    * An array of TrainingJobSummary objects, each listing a training job.
    */
  var TrainingJobSummaries: typings.awsSdk.sagemakerMod.TrainingJobSummaries = js.native
}

object ListTrainingJobsResponse {
  @scala.inline
  def apply(TrainingJobSummaries: TrainingJobSummaries, NextToken: NextToken = null): ListTrainingJobsResponse = {
    val __obj = js.Dynamic.literal(TrainingJobSummaries = TrainingJobSummaries.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTrainingJobsResponse]
  }
}

