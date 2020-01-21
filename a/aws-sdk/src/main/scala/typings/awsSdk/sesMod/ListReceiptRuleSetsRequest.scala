package typings.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListReceiptRuleSetsRequest extends js.Object {
  /**
    * A token returned from a previous call to ListReceiptRuleSets to indicate the position in the receipt rule set list.
    */
  var NextToken: js.UndefOr[typings.awsSdk.sesMod.NextToken] = js.native
}

object ListReceiptRuleSetsRequest {
  @scala.inline
  def apply(NextToken: NextToken = null): ListReceiptRuleSetsRequest = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListReceiptRuleSetsRequest]
  }
}

