package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecurringCharge extends js.Object {
  /**
    * The amount of the recurring charge.
    */
  var RecurringChargeAmount: js.UndefOr[Double] = js.native
  /**
    * The frequency of the recurring charge.
    */
  var RecurringChargeFrequency: js.UndefOr[String] = js.native
}

object RecurringCharge {
  @scala.inline
  def apply(): RecurringCharge = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecurringCharge]
  }
  @scala.inline
  implicit class RecurringChargeOps[Self <: RecurringCharge] (val x: Self) extends AnyVal {
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
    def setRecurringChargeAmount(value: Double): Self = this.set("RecurringChargeAmount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecurringChargeAmount: Self = this.set("RecurringChargeAmount", js.undefined)
    @scala.inline
    def setRecurringChargeFrequency(value: String): Self = this.set("RecurringChargeFrequency", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecurringChargeFrequency: Self = this.set("RecurringChargeFrequency", js.undefined)
  }
  
}

