package typings.bootstrap.mod

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
    delay: js.UndefOr[Double] = js.undefined
  ): ToastOption = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animation)) __obj.updateDynamic("animation")(animation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(autohide)) __obj.updateDynamic("autohide")(autohide.get.asInstanceOf[js.Any])
    if (!js.isUndefined(delay)) __obj.updateDynamic("delay")(delay.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToastOption]
  }
}

