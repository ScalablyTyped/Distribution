package typings.cordovaPluginNativeKeyboard

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NativeKeyboardHideOptions extends js.Object {
  /**
    * A boolean flag inidicating if the keyboard should be shown/hidden with an animation
    */
  var animated: js.UndefOr[Boolean] = js.undefined
}

object NativeKeyboardHideOptions {
  @scala.inline
  def apply(animated: js.UndefOr[Boolean] = js.undefined): NativeKeyboardHideOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated.asInstanceOf[js.Any])
    __obj.asInstanceOf[NativeKeyboardHideOptions]
  }
}

