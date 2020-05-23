package typings.braintree.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubmitForSettlement extends js.Object {
  var submitForSettlement: Boolean
}

object SubmitForSettlement {
  @scala.inline
  def apply(submitForSettlement: Boolean): SubmitForSettlement = {
    val __obj = js.Dynamic.literal(submitForSettlement = submitForSettlement.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubmitForSettlement]
  }
}

