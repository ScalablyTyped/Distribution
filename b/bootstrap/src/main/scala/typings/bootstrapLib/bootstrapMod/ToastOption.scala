package typings
package bootstrapLib.bootstrapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToastOption extends js.Object {
  /**
    * Apply a CSS fade transition to the toast.
    *
    * @default true
    */
  var animation: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Auto hide the toast.
    *
    * @default true
    */
  var autohide: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Delay hiding the toast in millisecond.
    *
    * @default 500
    */
  var delay: js.UndefOr[scala.Double] = js.undefined
}

object ToastOption {
  @scala.inline
  def apply(
    animation: js.UndefOr[scala.Boolean] = js.undefined,
    autohide: js.UndefOr[scala.Boolean] = js.undefined,
    delay: scala.Int | scala.Double = null
  ): ToastOption = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animation)) __obj.updateDynamic("animation")(animation)
    if (!js.isUndefined(autohide)) __obj.updateDynamic("autohide")(autohide)
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToastOption]
  }
}

