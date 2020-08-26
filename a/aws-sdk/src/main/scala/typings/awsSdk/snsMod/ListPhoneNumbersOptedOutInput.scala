package typings.awsSdk.snsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPhoneNumbersOptedOutInput extends js.Object {
  /**
    * A NextToken string is used when you call the ListPhoneNumbersOptedOut action to retrieve additional records that are available after the first page of results.
    */
  var nextToken: js.UndefOr[java.lang.String] = js.native
}

object ListPhoneNumbersOptedOutInput {
  @scala.inline
  def apply(): ListPhoneNumbersOptedOutInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPhoneNumbersOptedOutInput]
  }
  @scala.inline
  implicit class ListPhoneNumbersOptedOutInputOps[Self <: ListPhoneNumbersOptedOutInput] (val x: Self) extends AnyVal {
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
    def setNextToken(value: java.lang.String): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
  
}

