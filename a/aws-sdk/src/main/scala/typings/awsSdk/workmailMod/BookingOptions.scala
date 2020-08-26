package typings.awsSdk.workmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BookingOptions extends js.Object {
  /**
    * The resource's ability to automatically reply to requests. If disabled, delegates must be associated to the resource.
    */
  var AutoAcceptRequests: js.UndefOr[Boolean] = js.native
  /**
    * The resource's ability to automatically decline any conflicting requests.
    */
  var AutoDeclineConflictingRequests: js.UndefOr[Boolean] = js.native
  /**
    * The resource's ability to automatically decline any recurring requests.
    */
  var AutoDeclineRecurringRequests: js.UndefOr[Boolean] = js.native
}

object BookingOptions {
  @scala.inline
  def apply(): BookingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BookingOptions]
  }
  @scala.inline
  implicit class BookingOptionsOps[Self <: BookingOptions] (val x: Self) extends AnyVal {
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
    def setAutoAcceptRequests(value: Boolean): Self = this.set("AutoAcceptRequests", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoAcceptRequests: Self = this.set("AutoAcceptRequests", js.undefined)
    @scala.inline
    def setAutoDeclineConflictingRequests(value: Boolean): Self = this.set("AutoDeclineConflictingRequests", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoDeclineConflictingRequests: Self = this.set("AutoDeclineConflictingRequests", js.undefined)
    @scala.inline
    def setAutoDeclineRecurringRequests(value: Boolean): Self = this.set("AutoDeclineRecurringRequests", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoDeclineRecurringRequests: Self = this.set("AutoDeclineRecurringRequests", js.undefined)
  }
  
}

