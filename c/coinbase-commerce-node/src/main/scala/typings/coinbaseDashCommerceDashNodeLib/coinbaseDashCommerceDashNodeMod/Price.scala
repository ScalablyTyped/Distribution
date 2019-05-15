package typings
package coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Price object.
  */
trait Price[Currency] extends js.Object {
  var amount: java.lang.String
  var currency: Currency
}

object Price {
  @scala.inline
  def apply[Currency](amount: java.lang.String, currency: Currency): Price[Currency] = {
    val __obj = js.Dynamic.literal(amount = amount, currency = currency.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Price[Currency]]
  }
}

