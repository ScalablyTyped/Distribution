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
  def apply(NextToken: NextToken = null, TrialSummaries: TrialSummaries = null): ListTrialsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (TrialSummaries != null) __obj.updateDynamic("TrialSummaries")(TrialSummaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTrialsResponse]
  }
}

