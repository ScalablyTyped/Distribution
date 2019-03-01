package typings
package cucumberLib.cucumberMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HookOptions extends js.Object {
  var tags: js.UndefOr[js.Any] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
}

object HookOptions {
  @scala.inline
  def apply(tags: js.Any = null, timeout: scala.Int | scala.Double = null): HookOptions = {
    val __obj = js.Dynamic.literal()
    if (tags != null) __obj.updateDynamic("tags")(tags)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[HookOptions]
  }
}

