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
  def apply(BillingMode: BillingMode = null, LastUpdateToPayPerRequestDateTime: Date = null): BillingModeSummary = {
    val __obj = js.Dynamic.literal()
    if (BillingMode != null) __obj.updateDynamic("BillingMode")(BillingMode.asInstanceOf[js.Any])
    if (LastUpdateToPayPerRequestDateTime != null) __obj.updateDynamic("LastUpdateToPayPerRequestDateTime")(LastUpdateToPayPerRequestDateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[BillingModeSummary]
  }
}

