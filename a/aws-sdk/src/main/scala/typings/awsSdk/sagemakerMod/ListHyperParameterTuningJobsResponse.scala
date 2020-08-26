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
  def apply(HyperParameterTuningJobSummaries: HyperParameterTuningJobSummaries): ListHyperParameterTuningJobsResponse = {
    val __obj = js.Dynamic.literal(HyperParameterTuningJobSummaries = HyperParameterTuningJobSummaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListHyperParameterTuningJobsResponse]
  }
  @scala.inline
  implicit class ListHyperParameterTuningJobsResponseOps[Self <: ListHyperParameterTuningJobsResponse] (val x: Self) extends AnyVal {
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
    def setHyperParameterTuningJobSummariesVarargs(value: HyperParameterTuningJobSummary*): Self = this.set("HyperParameterTuningJobSummaries", js.Array(value :_*))
    @scala.inline
    def setHyperParameterTuningJobSummaries(value: HyperParameterTuningJobSummaries): Self = this.set("HyperParameterTuningJobSummaries", value.asInstanceOf[js.Any])
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

