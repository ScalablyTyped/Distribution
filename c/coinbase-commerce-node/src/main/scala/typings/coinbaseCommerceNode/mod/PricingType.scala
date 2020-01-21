package typings.coinbaseCommerceNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Pricing type.
  */
/* Rewritten from type alias, can be one of: 
  - typings.coinbaseCommerceNode.coinbaseCommerceNodeStrings.no_price
  - typings.coinbaseCommerceNode.coinbaseCommerceNodeStrings.fixed_price
*/
trait PricingType extends js.Object

object PricingType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def fixed_price: typings.coinbaseCommerceNode.coinbaseCommerceNodeStrings.fixed_price = this.cast("fixed_price")
  @scala.inline
  def no_price: typings.coinbaseCommerceNode.coinbaseCommerceNodeStrings.no_price = this.cast("no_price")
}

