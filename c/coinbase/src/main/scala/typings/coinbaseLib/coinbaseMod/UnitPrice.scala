package typings
package coinbaseLib.coinbaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnitPrice extends js.Object {
  /**
    * Amount as floating-point in a string
    */
  var amount: java.lang.String
  /**
    * Currency e.g. "BTC" (see Client#getCurrencies() for available strings)
    */
  var currency: java.lang.String
  /**
    * Type of price
    */
  var scale: scala.Double
}

object UnitPrice {
  @scala.inline
  def apply(amount: java.lang.String, currency: java.lang.String, scale: scala.Double): UnitPrice = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("amount")(amount)
    __obj.updateDynamic("currency")(currency)
    __obj.updateDynamic("scale")(scale)
    __obj.asInstanceOf[UnitPrice]
  }
}

