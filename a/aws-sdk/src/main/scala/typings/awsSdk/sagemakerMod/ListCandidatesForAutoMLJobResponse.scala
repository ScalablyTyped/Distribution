package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListCandidatesForAutoMLJobResponse extends js.Object {
  /**
    * Summaries about the Candidates.
    */
  var Candidates: AutoMLCandidates = js.native
  /**
    * If the previous response was truncated, you will receive this token. Use it in your next request to receive the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.sagemakerMod.NextToken] = js.native
}

object ListCandidatesForAutoMLJobResponse {
  @scala.inline
  def apply(Candidates: AutoMLCandidates): ListCandidatesForAutoMLJobResponse = {
    val __obj = js.Dynamic.literal(Candidates = Candidates.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListCandidatesForAutoMLJobResponse]
  }
  @scala.inline
  implicit class ListCandidatesForAutoMLJobResponseOps[Self <: ListCandidatesForAutoMLJobResponse] (val x: Self) extends AnyVal {
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
    def setCandidatesVarargs(value: AutoMLCandidate*): Self = this.set("Candidates", js.Array(value :_*))
    @scala.inline
    def setCandidates(value: AutoMLCandidates): Self = this.set("Candidates", value.asInstanceOf[js.Any])
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

