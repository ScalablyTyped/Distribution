package typings.bip21.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Address extends js.Object {
  var address: String
  var amount: js.UndefOr[Double] = js.undefined
}

object Address {
  @scala.inline
  def apply(address: String, amount: js.UndefOr[Double] = js.undefined): Address = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any])
    if (!js.isUndefined(amount)) __obj.updateDynamic("amount")(amount.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Address]
  }
}

