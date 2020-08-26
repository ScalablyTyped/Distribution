package typings.cordovaPluginNativeKeyboard

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ButtonOptions extends js.Object {
  /**
    * The color of the button in HEX
    *
    * Default: #000
    */
  var color: String = js.native
  /**
    * If type is "text" you can set this to either "normal", "bold" or "italic".
    *
    * Default: "normal"
    */
  var textStyle: js.UndefOr[String] = js.native
  /**
    * The type of the button.
    * Either "text", "fontawesome" or "ionicon".
    *
    * Default: "text"
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * The value of the button. On "text" the string is used as label
    * On fonatawesome or ionicon the icon name is used (e.g. fa-rocket)
    *
    * Default: "Send"
    */
  var value: js.UndefOr[String] = js.native
  /**
    * A callback being executed as soon as the button is clicked
    */
  def onPress(): Unit = js.native
}

object ButtonOptions {
  @scala.inline
  def apply(color: String, onPress: () => Unit): ButtonOptions = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], onPress = js.Any.fromFunction0(onPress))
    __obj.asInstanceOf[ButtonOptions]
  }
  @scala.inline
  implicit class ButtonOptionsOps[Self <: ButtonOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnPress(value: () => Unit): Self = this.set("onPress", js.Any.fromFunction0(value))
    @scala.inline
    def setTextStyle(value: String): Self = this.set("textStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextStyle: Self = this.set("textStyle", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

