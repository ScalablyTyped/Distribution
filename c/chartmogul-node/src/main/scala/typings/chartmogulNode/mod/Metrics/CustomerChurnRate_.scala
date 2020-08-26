package typings.chartmogulNode.mod.Metrics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomerChurnRate_ extends js.Object {
  var `customer-churn-rate`: Double = js.native
  var date: String = js.native
}

object CustomerChurnRate_ {
  @scala.inline
  def apply(`customer-churn-rate`: Double, date: String): CustomerChurnRate_ = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any])
    __obj.updateDynamic("customer-churn-rate")(`customer-churn-rate`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomerChurnRate_]
  }
  @scala.inline
  implicit class CustomerChurnRate_Ops[Self <: CustomerChurnRate_] (val x: Self) extends AnyVal {
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
    def `setCustomer-churn-rate`(value: Double): Self = this.set("customer-churn-rate", value.asInstanceOf[js.Any])
    @scala.inline
    def setDate(value: String): Self = this.set("date", value.asInstanceOf[js.Any])
  }
  
}

