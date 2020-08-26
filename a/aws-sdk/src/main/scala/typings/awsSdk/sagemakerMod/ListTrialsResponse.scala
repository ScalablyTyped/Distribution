package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTrialsResponse extends js.Object {
  /**
    * A token for getting the next set of trials, if there are any.
    */
  var NextToken: js.UndefOr[typings.awsSdk.sagemakerMod.NextToken] = js.native
  /**
    * A list of the summaries of your trials.
    */
  var TrialSummaries: js.UndefOr[typings.awsSdk.sagemakerMod.TrialSummaries] = js.native
}

object ListTrialsResponse {
  @scala.inline
  def apply(): ListTrialsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTrialsResponse]
  }
  @scala.inline
  implicit class ListTrialsResponseOps[Self <: ListTrialsResponse] (val x: Self) extends AnyVal {
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
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setTrialSummariesVarargs(value: TrialSummary*): Self = this.set("TrialSummaries", js.Array(value :_*))
    @scala.inline
    def setTrialSummaries(value: TrialSummaries): Self = this.set("TrialSummaries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrialSummaries: Self = this.set("TrialSummaries", js.undefined)
  }
  
}

