package typings.coinbaseDashCommerceDashNode.coinbaseDashCommerceDashNodeMod

import typings.coinbaseDashCommerceDashNode.coinbaseDashCommerceDashNodeStrings.no_price
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
  var pricing_type: no_price
}

object NoPrice {
  @scala.inline
  def apply(pricing_type: no_price): NoPrice = {
    val __obj = js.Dynamic.literal(pricing_type = pricing_type.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NoPrice]
  }
}

