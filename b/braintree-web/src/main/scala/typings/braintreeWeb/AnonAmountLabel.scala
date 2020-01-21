package typings.braintreeWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAmountLabel extends js.Object {
  var amount: String
  var label: String
}

object AnonAmountLabel {
  @scala.inline
  def apply(amount: String, label: String): AnonAmountLabel = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAmountLabel]
  }
}

