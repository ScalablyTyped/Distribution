package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListExperimentsResponse extends js.Object {
  /**
    * A list of the summaries of your experiments.
    */
  var ExperimentSummaries: js.UndefOr[typings.awsSdk.sagemakerMod.ExperimentSummaries] = js.native
  /**
    * A token for getting the next set of experiments, if there are any.
    */
  var NextToken: js.UndefOr[typings.awsSdk.sagemakerMod.NextToken] = js.native
}

object ListExperimentsResponse {
  @scala.inline
  def apply(): ListExperimentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListExperimentsResponse]
  }
  @scala.inline
  implicit class ListExperimentsResponseOps[Self <: ListExperimentsResponse] (val x: Self) extends AnyVal {
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
    def setExperimentSummariesVarargs(value: ExperimentSummary*): Self = this.set("ExperimentSummaries", js.Array(value :_*))
    @scala.inline
    def setExperimentSummaries(value: ExperimentSummaries): Self = this.set("ExperimentSummaries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExperimentSummaries: Self = this.set("ExperimentSummaries", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

