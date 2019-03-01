package typings
package bip21Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Address extends js.Object {
  var address: java.lang.String
  var amount: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Address {
  @scala.inline
  def apply(address: java.lang.String, amount: scala.Int | scala.Double = null): Anon_Address = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("address")(address)
    if (amount != null) __obj.updateDynamic("amount")(amount.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Address]
  }
}

