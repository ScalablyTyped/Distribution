package typings.coinbase.coinbaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateAddressOpts extends js.Object {
  /**
    * Address label
    */
  var name: js.UndefOr[String] = js.undefined
}

object CreateAddressOpts {
  @scala.inline
  def apply(name: String = null): CreateAddressOpts = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[CreateAddressOpts]
  }
}

