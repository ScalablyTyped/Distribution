package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTrainingJobsForHyperParameterTuningJobResponse extends js.Object {
  /**
    * If the result of this ListTrainingJobsForHyperParameterTuningJob request was truncated, the response includes a NextToken. To retrieve the next set of training jobs, use the token in the next request.
    */
  var NextToken: js.UndefOr[typings.awsSdk.sagemakerMod.NextToken] = js.native
  /**
    * A list of TrainingJobSummary objects that describe the training jobs that the ListTrainingJobsForHyperParameterTuningJob request returned.
    */
  var TrainingJobSummaries: HyperParameterTrainingJobSummaries = js.native
}

object ListTrainingJobsForHyperParameterTuningJobResponse {
  @scala.inline
  def apply(TrainingJobSummaries: HyperParameterTrainingJobSummaries): ListTrainingJobsForHyperParameterTuningJobResponse = {
    val __obj = js.Dynamic.literal(TrainingJobSummaries = TrainingJobSummaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTrainingJobsForHyperParameterTuningJobResponse]
  }
  @scala.inline
  implicit class ListTrainingJobsForHyperParameterTuningJobResponseOps[Self <: ListTrainingJobsForHyperParameterTuningJobResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setTrainingJobSummariesVarargs(value: HyperParameterTrainingJobSummary*): Self = this.set("TrainingJobSummaries", js.Array(value :_*))
    @scala.inline
    def setTrainingJobSummaries(value: HyperParameterTrainingJobSummaries): Self = this.set("TrainingJobSummaries", value.asInstanceOf[js.Any])
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

