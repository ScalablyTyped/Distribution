package typings
package cordovaDashPluginDashNativeDashKeyboardLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LeftButtonOptions extends ButtonOptions {
  /**
    * Set to true to disable the button once text has been entered.
    *
    * Default: false
    */
  var disabledWhenTextEntered: js.UndefOr[scala.Boolean] = js.undefined
}

object LeftButtonOptions {
  @scala.inline
  def apply(
    color: java.lang.String,
    onPress: js.Function0[scala.Unit],
    disabledWhenTextEntered: js.UndefOr[scala.Boolean] = js.undefined,
    textStyle: java.lang.String = null,
    `type`: java.lang.String = null,
    value: java.lang.String = null
  ): LeftButtonOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("color")(color)
    __obj.updateDynamic("onPress")(onPress)
    if (!js.isUndefined(disabledWhenTextEntered)) __obj.updateDynamic("disabledWhenTextEntered")(disabledWhenTextEntered)
    if (textStyle != null) __obj.updateDynamic("textStyle")(textStyle)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[LeftButtonOptions]
  }
}

