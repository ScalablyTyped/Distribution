package typings.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListReceiptRuleSetsResponse extends js.Object {
  /**
    * A token indicating that there are additional receipt rule sets available to be listed. Pass this token to successive calls of ListReceiptRuleSets to retrieve up to 100 receipt rule sets at a time.
    */
  var NextToken: js.UndefOr[typings.awsSdk.sesMod.NextToken] = js.native
  /**
    * The metadata for the currently active receipt rule set. The metadata consists of the rule set name and the timestamp of when the rule set was created.
    */
  var RuleSets: js.UndefOr[ReceiptRuleSetsLists] = js.native
}

object ListReceiptRuleSetsResponse {
  @scala.inline
  def apply(NextToken: NextToken = null, RuleSets: ReceiptRuleSetsLists = null): ListReceiptRuleSetsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (RuleSets != null) __obj.updateDynamic("RuleSets")(RuleSets.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListReceiptRuleSetsResponse]
  }
}

