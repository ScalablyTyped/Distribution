package typings.cordovaPluginNativeKeyboard

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LeftButtonOptions extends ButtonOptions {
  /**
    * Set to true to disable the button once text has been entered.
    *
    * Default: false
    */
  var disabledWhenTextEntered: js.UndefOr[Boolean] = js.undefined
}

object LeftButtonOptions {
  @scala.inline
  def apply(
    color: String,
    onPress: () => Unit,
    disabledWhenTextEntered: js.UndefOr[Boolean] = js.undefined,
    textStyle: String = null,
    `type`: String = null,
    value: String = null
  ): LeftButtonOptions = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], onPress = js.Any.fromFunction0(onPress))
    if (!js.isUndefined(disabledWhenTextEntered)) __obj.updateDynamic("disabledWhenTextEntered")(disabledWhenTextEntered.get.asInstanceOf[js.Any])
    if (textStyle != null) __obj.updateDynamic("textStyle")(textStyle.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[LeftButtonOptions]
  }
}

