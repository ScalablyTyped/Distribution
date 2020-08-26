package typings.awsSdk.eventbridgeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPartnerEventSourceAccountsResponse extends js.Object {
  /**
    * A token you can use in a subsequent operation to retrieve the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.eventbridgeMod.NextToken] = js.native
  /**
    * The list of partner event sources returned by the operation.
    */
  var PartnerEventSourceAccounts: js.UndefOr[PartnerEventSourceAccountList] = js.native
}

object ListPartnerEventSourceAccountsResponse {
  @scala.inline
  def apply(): ListPartnerEventSourceAccountsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPartnerEventSourceAccountsResponse]
  }
  @scala.inline
  implicit class ListPartnerEventSourceAccountsResponseOps[Self <: ListPartnerEventSourceAccountsResponse] (val x: Self) extends AnyVal {
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
    def setPartnerEventSourceAccountsVarargs(value: PartnerEventSourceAccount*): Self = this.set("PartnerEventSourceAccounts", js.Array(value :_*))
    @scala.inline
    def setPartnerEventSourceAccounts(value: PartnerEventSourceAccountList): Self = this.set("PartnerEventSourceAccounts", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePartnerEventSourceAccounts: Self = this.set("PartnerEventSourceAccounts", js.undefined)
  }
  
}

