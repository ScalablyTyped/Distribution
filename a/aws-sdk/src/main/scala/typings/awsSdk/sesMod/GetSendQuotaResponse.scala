package typings.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSendQuotaResponse extends js.Object {
  /**
    * The maximum number of emails the user is allowed to send in a 24-hour interval. A value of -1 signifies an unlimited quota.
    */
  var Max24HourSend: js.UndefOr[typings.awsSdk.sesMod.Max24HourSend] = js.native
  /**
    * The maximum number of emails that Amazon SES can accept from the user's account per second.  The rate at which Amazon SES accepts the user's messages might be less than the maximum send rate. 
    */
  var MaxSendRate: js.UndefOr[typings.awsSdk.sesMod.MaxSendRate] = js.native
  /**
    * The number of emails sent during the previous 24 hours.
    */
  var SentLast24Hours: js.UndefOr[typings.awsSdk.sesMod.SentLast24Hours] = js.native
}

object GetSendQuotaResponse {
  @scala.inline
  def apply(): GetSendQuotaResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSendQuotaResponse]
  }
  @scala.inline
  implicit class GetSendQuotaResponseOps[Self <: GetSendQuotaResponse] (val x: Self) extends AnyVal {
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
    def setMax24HourSend(value: Max24HourSend): Self = this.set("Max24HourSend", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax24HourSend: Self = this.set("Max24HourSend", js.undefined)
    @scala.inline
    def setMaxSendRate(value: MaxSendRate): Self = this.set("MaxSendRate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxSendRate: Self = this.set("MaxSendRate", js.undefined)
    @scala.inline
    def setSentLast24Hours(value: SentLast24Hours): Self = this.set("SentLast24Hours", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSentLast24Hours: Self = this.set("SentLast24Hours", js.undefined)
  }
  
}

