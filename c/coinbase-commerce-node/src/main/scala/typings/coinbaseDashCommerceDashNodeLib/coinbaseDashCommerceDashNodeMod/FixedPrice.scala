package typings
package coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fixed price resource.
  */
trait FixedPrice extends js.Object {
  /**
    * Local price in fiat currency.
    */
  var local_price: Price[FiatCurrency]
  /**
    * Pricing type
    */
  var pricing_type: coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeLibStrings.fixed_price
}

object FixedPrice {
  @scala.inline
  def apply(
    local_price: Price[FiatCurrency],
    pricing_type: coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeLibStrings.fixed_price
  ): FixedPrice = {
    val __obj = js.Dynamic.literal(local_price = local_price, pricing_type = pricing_type)
  
    __obj.asInstanceOf[FixedPrice]
  }
}

