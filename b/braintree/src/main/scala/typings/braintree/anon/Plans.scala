package typings.braintree.anon

import typings.braintree.mod.Plan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Plans extends js.Object {
  var plans: js.Array[Plan]
}

object Plans {
  @scala.inline
  def apply(plans: js.Array[Plan]): Plans = {
    val __obj = js.Dynamic.literal(plans = plans.asInstanceOf[js.Any])
    __obj.asInstanceOf[Plans]
  }
}

