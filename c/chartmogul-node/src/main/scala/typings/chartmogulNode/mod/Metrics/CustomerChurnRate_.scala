package typings.chartmogulNode.mod.Metrics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomerChurnRate_ extends js.Object {
  var `customer-churn-rate`: Double
  var date: String
}

object CustomerChurnRate_ {
  @scala.inline
  def apply(`customer-churn-rate`: Double, date: String): CustomerChurnRate_ = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any])
    __obj.updateDynamic("customer-churn-rate")(`customer-churn-rate`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomerChurnRate_]
  }
}

