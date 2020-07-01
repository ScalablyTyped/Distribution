package typings.braintree.mod

import typings.braintree.anon.Plans
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlanGateway extends js.Object {
  def all(): js.Promise[Plans]
}

object PlanGateway {
  @scala.inline
  def apply(all: () => js.Promise[Plans]): PlanGateway = {
    val __obj = js.Dynamic.literal(all = js.Any.fromFunction0(all))
    __obj.asInstanceOf[PlanGateway]
  }
}

