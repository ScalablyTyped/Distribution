package typings.braintree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAmountOptions extends js.Object {
  var amount: String
  var options: AnonSubmitForSettlement
}

object AnonAmountOptions {
  @scala.inline
  def apply(amount: String, options: AnonSubmitForSettlement): AnonAmountOptions = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAmountOptions]
  }
}

