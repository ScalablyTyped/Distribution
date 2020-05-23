package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecurringCharge extends js.Object {
  /**
    * The amount of the recurring charge.
    */
  var Amount: js.UndefOr[Double] = js.native
  /**
    * The frequency of the recurring charge.
    */
  var Frequency: js.UndefOr[RecurringChargeFrequency] = js.native
}

object RecurringCharge {
  @scala.inline
  def apply(Amount: js.UndefOr[Double] = js.undefined, Frequency: RecurringChargeFrequency = null): RecurringCharge = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Amount)) __obj.updateDynamic("Amount")(Amount.get.asInstanceOf[js.Any])
    if (Frequency != null) __obj.updateDynamic("Frequency")(Frequency.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecurringCharge]
  }
}

