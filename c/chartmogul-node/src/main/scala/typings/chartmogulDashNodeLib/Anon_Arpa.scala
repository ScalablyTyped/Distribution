package typings
package chartmogulDashNodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Arpa extends js.Object {
  var arpa: scala.Double
  var arr: scala.Double
  var asp: scala.Double
  var customers: scala.Double
  var date: java.lang.String
  var ltv: scala.Double
  var mrr: scala.Double
}

object Anon_Arpa {
  @scala.inline
  def apply(
    arpa: scala.Double,
    arr: scala.Double,
    asp: scala.Double,
    customers: scala.Double,
    date: java.lang.String,
    ltv: scala.Double,
    mrr: scala.Double
  ): Anon_Arpa = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("arpa")(arpa)
    __obj.updateDynamic("arr")(arr)
    __obj.updateDynamic("asp")(asp)
    __obj.updateDynamic("customers")(customers)
    __obj.updateDynamic("date")(date)
    __obj.updateDynamic("ltv")(ltv)
    __obj.updateDynamic("mrr")(mrr)
    __obj.asInstanceOf[Anon_Arpa]
  }
}

