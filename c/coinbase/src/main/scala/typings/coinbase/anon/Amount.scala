package typings.coinbase.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Amount extends js.Object {
  /**
    * Amount as floating-point in a string
    */
  var amount: String
  /**
    * Currency e.g. "BTC" (see Client#getCurrencies() for available strings)
    */
  var base: String
  /**
    * Currency e.g. "EUR" (see Client#getCurrencies() for available strings)
    */
  var currency: String
}

object Amount {
  @scala.inline
  def apply(amount: String, base: String, currency: String): Amount = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], base = base.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any])
    __obj.asInstanceOf[Amount]
  }
}

