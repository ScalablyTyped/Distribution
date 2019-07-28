package typings.braintree.braintreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlanGateway extends js.Object {
  def all(): js.Promise[js.Array[Plan]]
}

object PlanGateway {
  @scala.inline
  def apply(all: () => js.Promise[js.Array[Plan]]): PlanGateway = {
    val __obj = js.Dynamic.literal(all = js.Any.fromFunction0(all))
  
    __obj.asInstanceOf[PlanGateway]
  }
}

