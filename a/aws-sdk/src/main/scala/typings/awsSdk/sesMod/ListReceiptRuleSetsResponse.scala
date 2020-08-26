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
  def apply(): ListReceiptRuleSetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListReceiptRuleSetsResponse]
  }
  @scala.inline
  implicit class ListReceiptRuleSetsResponseOps[Self <: ListReceiptRuleSetsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setRuleSetsVarargs(value: ReceiptRuleSetMetadata*): Self = this.set("RuleSets", js.Array(value :_*))
    @scala.inline
    def setRuleSets(value: ReceiptRuleSetsLists): Self = this.set("RuleSets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRuleSets: Self = this.set("RuleSets", js.undefined)
  }
  
}

