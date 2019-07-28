package typings.bootstrap.bootstrapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToastOption extends js.Object {
  /**
    * Apply a CSS fade transition to the toast.
    *
    * @default true
    */
  var animation: js.UndefOr[Boolean] = js.undefined
  /**
    * Auto hide the toast.
    *
    * @default true
    */
  var autohide: js.UndefOr[Boolean] = js.undefined
  /**
    * Delay hiding the toast in millisecond.
    *
    * @default 500
    */
  var delay: js.UndefOr[Double] = js.undefined
}

object ToastOption {
  @scala.inline
  def apply(
    animation: js.UndefOr[Boolean] = js.undefined,
    autohide: js.UndefOr[Boolean] = js.undefined,
    delay: Int | Double = null
  ): ToastOption = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animation)) __obj.updateDynamic("animation")(animation)
    if (!js.isUndefined(autohide)) __obj.updateDynamic("autohide")(autohide)
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToastOption]
  }
}

