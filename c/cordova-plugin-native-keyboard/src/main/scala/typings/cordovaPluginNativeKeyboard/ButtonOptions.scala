package typings.cordovaPluginNativeKeyboard

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonOptions extends js.Object {
  /**
    * The color of the button in HEX
    *
    * Default: #000
    */
  var color: String
  /**
    * If type is "text" you can set this to either "normal", "bold" or "italic".
    *
    * Default: "normal"
    */
  var textStyle: js.UndefOr[String] = js.undefined
  /**
    * The type of the button.
    * Either "text", "fontawesome" or "ionicon".
    *
    * Default: "text"
    */
  var `type`: js.UndefOr[String] = js.undefined
  /**
    * The value of the button. On "text" the string is used as label
    * On fonatawesome or ionicon the icon name is used (e.g. fa-rocket)
    *
    * Default: "Send"
    */
  var value: js.UndefOr[String] = js.undefined
  /**
    * A callback being executed as soon as the button is clicked
    */
  def onPress(): Unit
}

object ButtonOptions {
  @scala.inline
  def apply(
    color: String,
    onPress: () => Unit,
    textStyle: String = null,
    `type`: String = null,
    value: String = null
  ): ButtonOptions = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], onPress = js.Any.fromFunction0(onPress))
    if (textStyle != null) __obj.updateDynamic("textStyle")(textStyle.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonOptions]
  }
}

