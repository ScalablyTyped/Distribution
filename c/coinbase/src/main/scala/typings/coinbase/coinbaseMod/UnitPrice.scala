package typings.coinbase.coinbaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnitPrice extends js.Object {
  /**
    * Amount as floating-point in a string
    */
  var amount: String
  /**
    * Currency e.g. "BTC" (see Client#getCurrencies() for available strings)
    */
  var currency: String
  /**
    * Type of price
    */
  var scale: Double
}

object UnitPrice {
  @scala.inline
  def apply(amount: String, currency: String, scale: Double): UnitPrice = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UnitPrice]
  }
}

