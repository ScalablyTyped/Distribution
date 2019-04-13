package typings
package chartmogulDashNodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Arpa extends js.Object {
  var arpa: scala.Double
  var arr: scala.Double
  var asp: scala.Double
  var `customer-churn-rate`: scala.Double
  var customers: scala.Double
  var date: java.lang.String
  var ltv: scala.Double
  var mrr: scala.Double
  var `mrr-churn-rate`: scala.Double
}

object Anon_Arpa {
  @scala.inline
  def apply(
    arpa: scala.Double,
    arr: scala.Double,
    asp: scala.Double,
    `customer-churn-rate`: scala.Double,
    customers: scala.Double,
    date: java.lang.String,
    ltv: scala.Double,
    mrr: scala.Double,
    `mrr-churn-rate`: scala.Double
  ): Anon_Arpa = {
    val __obj = js.Dynamic.literal(arpa = arpa, arr = arr, asp = asp, customers = customers, date = date, ltv = ltv, mrr = mrr)
    __obj.updateDynamic("customer-churn-rate")(`customer-churn-rate`)
    __obj.updateDynamic("mrr-churn-rate")(`mrr-churn-rate`)
    __obj.asInstanceOf[Anon_Arpa]
  }
}

