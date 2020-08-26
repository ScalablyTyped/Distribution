package typings.awsSdk.shieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListAttacksResponse extends js.Object {
  /**
    * The attack information for the specified time range.
    */
  var AttackSummaries: js.UndefOr[typings.awsSdk.shieldMod.AttackSummaries] = js.native
  /**
    * The token returned by a previous call to indicate that there is more data available. If not null, more results are available. Pass this value for the NextMarker parameter in a subsequent call to ListAttacks to retrieve the next set of items. AWS WAF might return the list of AttackSummary objects in batches smaller than the number specified by MaxResults. If there are more AttackSummary objects to return, AWS WAF will always also return a NextToken.
    */
  var NextToken: js.UndefOr[Token] = js.native
}

object ListAttacksResponse {
  @scala.inline
  def apply(): ListAttacksResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAttacksResponse]
  }
  @scala.inline
  implicit class ListAttacksResponseOps[Self <: ListAttacksResponse] (val x: Self) extends AnyVal {
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
    def setAttackSummariesVarargs(value: AttackSummary*): Self = this.set("AttackSummaries", js.Array(value :_*))
    @scala.inline
    def setAttackSummaries(value: AttackSummaries): Self = this.set("AttackSummaries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttackSummaries: Self = this.set("AttackSummaries", js.undefined)
    @scala.inline
    def setNextToken(value: Token): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

