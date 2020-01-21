package typings.bip21

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAddress extends js.Object {
  var address: String
  var amount: js.UndefOr[Double] = js.undefined
}

object AnonAddress {
  @scala.inline
  def apply(address: String, amount: Int | Double = null): AnonAddress = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any])
    if (amount != null) __obj.updateDynamic("amount")(amount.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAddress]
  }
}

