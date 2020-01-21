package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListHumanTaskUisResponse extends js.Object {
  /**
    * An array of objects describing the human task user interfaces.
    */
  var HumanTaskUiSummaries: typings.awsSdk.sagemakerMod.HumanTaskUiSummaries = js.native
  /**
    * A token to resume pagination.
    */
  var NextToken: js.UndefOr[typings.awsSdk.sagemakerMod.NextToken] = js.native
}

object ListHumanTaskUisResponse {
  @scala.inline
  def apply(HumanTaskUiSummaries: HumanTaskUiSummaries, NextToken: NextToken = null): ListHumanTaskUisResponse = {
    val __obj = js.Dynamic.literal(HumanTaskUiSummaries = HumanTaskUiSummaries.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListHumanTaskUisResponse]
  }
}

