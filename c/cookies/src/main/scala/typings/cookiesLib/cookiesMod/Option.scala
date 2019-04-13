package typings
package cookiesLib.cookiesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Option extends js.Object {
  var keys: js.UndefOr[js.Array[java.lang.String] | keygripLib.keygripMod.Keygrip] = js.undefined
  var secure: js.UndefOr[scala.Boolean] = js.undefined
}

object Option {
  @scala.inline
  def apply(
    keys: js.Array[java.lang.String] | keygripLib.keygripMod.Keygrip = null,
    secure: js.UndefOr[scala.Boolean] = js.undefined
  ): Option = {
    val __obj = js.Dynamic.literal()
    if (keys != null) __obj.updateDynamic("keys")(keys.asInstanceOf[js.Any])
    if (!js.isUndefined(secure)) __obj.updateDynamic("secure")(secure)
    __obj.asInstanceOf[Option]
  }
}

