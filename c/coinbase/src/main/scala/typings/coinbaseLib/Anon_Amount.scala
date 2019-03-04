package typings
package coinbaseLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Amount extends js.Object {
  /**
    * Amount as floating-point in a string
    */
  var amount: java.lang.String
  /**
    * Currency e.g. "BTC" (see Client#getCurrencies() for available strings)
    */
  var base: java.lang.String
  /**
    * Currency e.g. "EUR" (see Client#getCurrencies() for available strings)
    */
  var currency: java.lang.String
}

object Anon_Amount {
  @scala.inline
  def apply(amount: java.lang.String, base: java.lang.String, currency: java.lang.String): Anon_Amount = {
    val __obj = js.Dynamic.literal(amount = amount, base = base, currency = currency)
  
    __obj.asInstanceOf[Anon_Amount]
  }
}

