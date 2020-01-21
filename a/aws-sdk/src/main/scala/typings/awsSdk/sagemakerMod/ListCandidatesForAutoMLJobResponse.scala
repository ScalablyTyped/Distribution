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
  def apply(Candidates: AutoMLCandidates, NextToken: NextToken = null): ListCandidatesForAutoMLJobResponse = {
    val __obj = js.Dynamic.literal(Candidates = Candidates.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListCandidatesForAutoMLJobResponse]
  }
}

