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
  def apply(
    Max24HourSend: Int | Double = null,
    MaxSendRate: Int | Double = null,
    SentLast24Hours: Int | Double = null
  ): GetSendQuotaResponse = {
    val __obj = js.Dynamic.literal()
    if (Max24HourSend != null) __obj.updateDynamic("Max24HourSend")(Max24HourSend.asInstanceOf[js.Any])
    if (MaxSendRate != null) __obj.updateDynamic("MaxSendRate")(MaxSendRate.asInstanceOf[js.Any])
    if (SentLast24Hours != null) __obj.updateDynamic("SentLast24Hours")(SentLast24Hours.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSendQuotaResponse]
  }
}

