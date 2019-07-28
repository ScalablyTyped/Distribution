package typings.braintree.braintreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiscountGateway extends js.Object {
  def all(): js.Promise[js.Array[Discount]]
}

object DiscountGateway {
  @scala.inline
  def apply(all: () => js.Promise[js.Array[Discount]]): DiscountGateway = {
    val __obj = js.Dynamic.literal(all = js.Any.fromFunction0(all))
  
    __obj.asInstanceOf[DiscountGateway]
  }
}

