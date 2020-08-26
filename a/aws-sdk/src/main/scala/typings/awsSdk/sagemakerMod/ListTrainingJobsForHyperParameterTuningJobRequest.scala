package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTrainingJobsForHyperParameterTuningJobRequest extends js.Object {
  /**
    * The name of the tuning job whose training jobs you want to list.
    */
  var HyperParameterTuningJobName: typings.awsSdk.sagemakerMod.HyperParameterTuningJobName = js.native
  /**
    * The maximum number of training jobs to return. The default value is 10.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.sagemakerMod.MaxResults] = js.native
  /**
    * If the result of the previous ListTrainingJobsForHyperParameterTuningJob request was truncated, the response includes a NextToken. To retrieve the next set of training jobs, use the token in the next request.
    */
  var NextToken: js.UndefOr[typings.awsSdk.sagemakerMod.NextToken] = js.native
  /**
    * The field to sort results by. The default is Name. If the value of this field is FinalObjectiveMetricValue, any training jobs that did not return an objective metric are not listed.
    */
  var SortBy: js.UndefOr[TrainingJobSortByOptions] = js.native
  /**
    * The sort order for results. The default is Ascending.
    */
  var SortOrder: js.UndefOr[typings.awsSdk.sagemakerMod.SortOrder] = js.native
  /**
    * A filter that returns only training jobs with the specified status.
    */
  var StatusEquals: js.UndefOr[TrainingJobStatus] = js.native
}

object ListTrainingJobsForHyperParameterTuningJobRequest {
  @scala.inline
  def apply(HyperParameterTuningJobName: HyperParameterTuningJobName): ListTrainingJobsForHyperParameterTuningJobRequest = {
    val __obj = js.Dynamic.literal(HyperParameterTuningJobName = HyperParameterTuningJobName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTrainingJobsForHyperParameterTuningJobRequest]
  }
  @scala.inline
  implicit class ListTrainingJobsForHyperParameterTuningJobRequestOps[Self <: ListTrainingJobsForHyperParameterTuningJobRequest] (val x: Self) extends AnyVal {
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
    def setHyperParameterTuningJobName(value: HyperParameterTuningJobName): Self = this.set("HyperParameterTuningJobName", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxResults(value: MaxResults): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setSortBy(value: TrainingJobSortByOptions): Self = this.set("SortBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortBy: Self = this.set("SortBy", js.undefined)
    @scala.inline
    def setSortOrder(value: SortOrder): Self = this.set("SortOrder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortOrder: Self = this.set("SortOrder", js.undefined)
    @scala.inline
    def setStatusEquals(value: TrainingJobStatus): Self = this.set("StatusEquals", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatusEquals: Self = this.set("StatusEquals", js.undefined)
  }
  
}

