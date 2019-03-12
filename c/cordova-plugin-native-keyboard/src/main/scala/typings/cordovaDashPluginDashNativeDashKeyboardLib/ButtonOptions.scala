package typings
package cordovaDashPluginDashNativeDashKeyboardLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonOptions extends js.Object {
  /**
    * The color of the button in HEX
    *
    * Default: #000
    */
  var color: java.lang.String
  /**
    * If type is "text" you can set this to either "normal", "bold" or "italic".
    *
    * Default: "normal"
    */
  var textStyle: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The type of the button.
    * Either "text", "fontawesome" or "ionicon".
    *
    * Default: "text"
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The value of the button. On "text" the string is used as label
    * On fonatawesome or ionicon the icon name is used (e.g. fa-rocket)
    *
    * Default: "Send"
    */
  var value: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A callback being executed as soon as the button is clicked
    */
  def onPress(): scala.Unit
}

object ButtonOptions {
  @scala.inline
  def apply(
    color: java.lang.String,
    onPress: () => scala.Unit,
    textStyle: java.lang.String = null,
    `type`: java.lang.String = null,
    value: java.lang.String = null
  ): ButtonOptions = {
    val __obj = js.Dynamic.literal(color = color, onPress = js.Any.fromFunction0(onPress))
    if (textStyle != null) __obj.updateDynamic("textStyle")(textStyle)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[ButtonOptions]
  }
}

