package typings.coinbase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Amount extends js.Object {
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

object Anon_Amount {
  @scala.inline
  def apply(amount: String, base: String, currency: String): Anon_Amount = {
    val __obj = js.Dynamic.literal(amount = amount, base = base, currency = currency)
  
    __obj.asInstanceOf[Anon_Amount]
  }
}

