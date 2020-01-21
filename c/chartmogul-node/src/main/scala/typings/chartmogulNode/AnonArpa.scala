package typings.chartmogulNode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonArpa extends js.Object {
  var arpa: Double
  var arr: Double
  var asp: Double
  var `customer-churn-rate`: Double
  var customers: Double
  var date: String
  var ltv: Double
  var mrr: Double
  var `mrr-churn-rate`: Double
}

object AnonArpa {
  @scala.inline
  def apply(
    arpa: Double,
    arr: Double,
    asp: Double,
    `customer-churn-rate`: Double,
    customers: Double,
    date: String,
    ltv: Double,
    mrr: Double,
    `mrr-churn-rate`: Double
  ): AnonArpa = {
    val __obj = js.Dynamic.literal(arpa = arpa.asInstanceOf[js.Any], arr = arr.asInstanceOf[js.Any], asp = asp.asInstanceOf[js.Any], customers = customers.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], ltv = ltv.asInstanceOf[js.Any], mrr = mrr.asInstanceOf[js.Any])
    __obj.updateDynamic("customer-churn-rate")(`customer-churn-rate`.asInstanceOf[js.Any])
    __obj.updateDynamic("mrr-churn-rate")(`mrr-churn-rate`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonArpa]
  }
}

