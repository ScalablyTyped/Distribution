package typings
package coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * No price resource.
  */
trait NoPrice extends js.Object {
  /**
    * Pricing type.
    */
  var pricing_type: coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeLibStrings.no_price
}

object NoPrice {
  @scala.inline
  def apply(pricing_type: coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeLibStrings.no_price): NoPrice = {
    val __obj = js.Dynamic.literal(pricing_type = pricing_type)
  
    __obj.asInstanceOf[NoPrice]
  }
}

