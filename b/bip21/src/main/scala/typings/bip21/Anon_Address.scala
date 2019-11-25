package typings.bip21

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Address extends js.Object {
  var address: String
  var amount: js.UndefOr[Double] = js.undefined
}

object Anon_Address {
  @scala.inline
  def apply(address: String, amount: Int | Double = null): Anon_Address = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any])
    if (amount != null) __obj.updateDynamic("amount")(amount.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Address]
  }
}

