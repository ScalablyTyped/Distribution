package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTrialComponentsResponse extends js.Object {
  /**
    * A token for getting the next set of components, if there are any.
    */
  var NextToken: js.UndefOr[typings.awsSdk.sagemakerMod.NextToken] = js.native
  /**
    * A list of the summaries of your trial components.
    */
  var TrialComponentSummaries: js.UndefOr[typings.awsSdk.sagemakerMod.TrialComponentSummaries] = js.native
}

object ListTrialComponentsResponse {
  @scala.inline
  def apply(NextToken: NextToken = null, TrialComponentSummaries: TrialComponentSummaries = null): ListTrialComponentsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (TrialComponentSummaries != null) __obj.updateDynamic("TrialComponentSummaries")(TrialComponentSummaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTrialComponentsResponse]
  }
}

