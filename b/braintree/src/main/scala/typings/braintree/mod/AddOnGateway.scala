package typings.braintree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Gateways
  */
trait AddOnGateway extends js.Object {
  def all(): js.Promise[js.Array[AddOn]]
}

object AddOnGateway {
  @scala.inline
  def apply(all: () => js.Promise[js.Array[AddOn]]): AddOnGateway = {
    val __obj = js.Dynamic.literal(all = js.Any.fromFunction0(all))
    __obj.asInstanceOf[AddOnGateway]
  }
}

