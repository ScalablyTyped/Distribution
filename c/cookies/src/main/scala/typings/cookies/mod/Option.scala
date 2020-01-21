package typings.cookies.mod

import typings.keygrip.mod.Keygrip
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Option extends js.Object {
  var keys: js.UndefOr[js.Array[String] | Keygrip] = js.undefined
  var secure: js.UndefOr[Boolean] = js.undefined
}

object Option {
  @scala.inline
  def apply(keys: js.Array[String] | Keygrip = null, secure: js.UndefOr[Boolean] = js.undefined): Option = {
    val __obj = js.Dynamic.literal()
    if (keys != null) __obj.updateDynamic("keys")(keys.asInstanceOf[js.Any])
    if (!js.isUndefined(secure)) __obj.updateDynamic("secure")(secure.asInstanceOf[js.Any])
    __obj.asInstanceOf[Option]
  }
}

