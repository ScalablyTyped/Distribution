package typings.braintree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSubmitForSettlement extends js.Object {
  var submitForSettlement: Boolean
}

object AnonSubmitForSettlement {
  @scala.inline
  def apply(submitForSettlement: Boolean): AnonSubmitForSettlement = {
    val __obj = js.Dynamic.literal(submitForSettlement = submitForSettlement.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSubmitForSettlement]
  }
}

