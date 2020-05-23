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
    Max24HourSend: js.UndefOr[Max24HourSend] = js.undefined,
    MaxSendRate: js.UndefOr[MaxSendRate] = js.undefined,
    SentLast24Hours: js.UndefOr[SentLast24Hours] = js.undefined
  ): GetSendQuotaResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Max24HourSend)) __obj.updateDynamic("Max24HourSend")(Max24HourSend.get.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxSendRate)) __obj.updateDynamic("MaxSendRate")(MaxSendRate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(SentLast24Hours)) __obj.updateDynamic("SentLast24Hours")(SentLast24Hours.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSendQuotaResponse]
  }
}

