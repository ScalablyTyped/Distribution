package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecurringCharge extends js.Object {
  /**
    * The amount charged per the period of time specified by the recurring charge frequency.
    */
  var RecurringChargeAmount: js.UndefOr[Double] = js.native
  /**
    * The frequency at which the recurring charge amount is applied.
    */
  var RecurringChargeFrequency: js.UndefOr[String] = js.native
}

object RecurringCharge {
  @scala.inline
  def apply(RecurringChargeAmount: Int | scala.Double = null, RecurringChargeFrequency: String = null): RecurringCharge = {
    val __obj = js.Dynamic.literal()
    if (RecurringChargeAmount != null) __obj.updateDynamic("RecurringChargeAmount")(RecurringChargeAmount.asInstanceOf[js.Any])
    if (RecurringChargeFrequency != null) __obj.updateDynamic("RecurringChargeFrequency")(RecurringChargeFrequency.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecurringCharge]
  }
}

