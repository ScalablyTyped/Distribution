package typings.coinbase.coinbaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MoneyHash extends js.Object {
  /**
    * Amount as floating-point in a string
    */
  var amount: String
  /**
    * Currency e.g. "BTC" (see Client#getCurrencies() for available strings)
    */
  var currency: String
}

object MoneyHash {
  @scala.inline
  def apply(amount: String, currency: String): MoneyHash = {
    val __obj = js.Dynamic.literal(amount = amount, currency = currency)
  
    __obj.asInstanceOf[MoneyHash]
  }
}

