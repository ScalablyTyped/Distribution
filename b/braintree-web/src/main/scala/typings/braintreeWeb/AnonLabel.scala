package typings.braintreeWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLabel extends js.Object {
  var amount: String
  var label: String
}

object AnonLabel {
  @scala.inline
  def apply(amount: String, label: String): AnonLabel = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLabel]
  }
}

