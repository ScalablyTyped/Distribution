package typings.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPhoneNumbersResponse extends js.Object {
  /**
    * If there are additional results, this is the token for the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.connectMod.NextToken] = js.native
  /**
    * Information about the phone numbers.
    */
  var PhoneNumberSummaryList: js.UndefOr[typings.awsSdk.connectMod.PhoneNumberSummaryList] = js.native
}

object ListPhoneNumbersResponse {
  @scala.inline
  def apply(): ListPhoneNumbersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPhoneNumbersResponse]
  }
  @scala.inline
  implicit class ListPhoneNumbersResponseOps[Self <: ListPhoneNumbersResponse] (val x: Self) extends AnyVal {
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
    def setPhoneNumberSummaryListVarargs(value: PhoneNumberSummary*): Self = this.set("PhoneNumberSummaryList", js.Array(value :_*))
    @scala.inline
    def setPhoneNumberSummaryList(value: PhoneNumberSummaryList): Self = this.set("PhoneNumberSummaryList", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhoneNumberSummaryList: Self = this.set("PhoneNumberSummaryList", js.undefined)
  }
  
}

