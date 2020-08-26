package typings.awsSdk.documentClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BillingModeSummary extends js.Object {
  /**
    * Controls how you are charged for read and write throughput and how you manage capacity. This setting can be changed later.    PROVISIONED - Sets the read/write capacity mode to PROVISIONED. We recommend using PROVISIONED for predictable workloads.    PAY_PER_REQUEST - Sets the read/write capacity mode to PAY_PER_REQUEST. We recommend using PAY_PER_REQUEST for unpredictable workloads.   
    */
  var BillingMode: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.BillingMode] = js.native
  /**
    * Represents the time when PAY_PER_REQUEST was last set as the read/write capacity mode.
    */
  var LastUpdateToPayPerRequestDateTime: js.UndefOr[Date] = js.native
}

object BillingModeSummary {
  @scala.inline
  def apply(): BillingModeSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BillingModeSummary]
  }
  @scala.inline
  implicit class BillingModeSummaryOps[Self <: BillingModeSummary] (val x: Self) extends AnyVal {
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
    def setBillingMode(value: BillingMode): Self = this.set("BillingMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBillingMode: Self = this.set("BillingMode", js.undefined)
    @scala.inline
    def setLastUpdateToPayPerRequestDateTime(value: Date): Self = this.set("LastUpdateToPayPerRequestDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastUpdateToPayPerRequestDateTime: Self = this.set("LastUpdateToPayPerRequestDateTime", js.undefined)
  }
  
}

