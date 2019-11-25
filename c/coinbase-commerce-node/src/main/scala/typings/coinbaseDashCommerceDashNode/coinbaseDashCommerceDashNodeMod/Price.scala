package typings.coinbaseDashCommerceDashNode.coinbaseDashCommerceDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Price object.
  */
trait Price[Currency] extends js.Object {
  var amount: String
  var currency: Currency
}

object Price {
  @scala.inline
  def apply[Currency](amount: String, currency: Currency): Price[Currency] = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Price[Currency]]
  }
}

