package typings.bootstrapColorpicker

import typings.bootstrapColorpicker.anon.A
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Color extends js.Object {
  var fallbackFormat: String = js.native
  var fallbackValue: String = js.native
  var hexNumberSignPrefix: Boolean = js.native
  var origFormat: String = js.native
  var value: A = js.native
  /**
    * Set the transparency with a value between 0 and 1.
    */
  def setAlpha(value: Double): Unit = js.native
  /**
    * Set the brightness with a value between 0 and 1.
    */
  def setBrightness(value: Double): Unit = js.native
  /**
    * Set a new color. The value is parsed and tries to do a quess on the format.
    */
  def setColor(value: String): Unit = js.native
  /**
    * Set the HUE with a value between 0 and 1.
    */
  def setHue(value: Double): Unit = js.native
  /**
    * Set the saturation with a value between 0 and 1.
    */
  def setSaturation(value: Double): Unit = js.native
  /**
    * Returns a hash with HSLA values.
    */
  def toHSL(): String = js.native
  /**
    * Returns a string with HEX format for the current color.
    */
  def toHex(): String = js.native
  /**
    * Returns a hash with red, green, blue and alpha.
    */
  def toRGB(): String = js.native
  /**
    * Returns current color as string in specified format.
    */
  def toString(format: ColorFormat): String = js.native
}

object Color {
  @scala.inline
  def apply(
    fallbackFormat: String,
    fallbackValue: String,
    hexNumberSignPrefix: Boolean,
    origFormat: String,
    setAlpha: Double => Unit,
    setBrightness: Double => Unit,
    setColor: String => Unit,
    setHue: Double => Unit,
    setSaturation: Double => Unit,
    toHSL: () => String,
    toHex: () => String,
    toRGB: () => String,
    toString: ColorFormat => String,
    value: A
  ): Color = {
    val __obj = js.Dynamic.literal(fallbackFormat = fallbackFormat.asInstanceOf[js.Any], fallbackValue = fallbackValue.asInstanceOf[js.Any], hexNumberSignPrefix = hexNumberSignPrefix.asInstanceOf[js.Any], origFormat = origFormat.asInstanceOf[js.Any], setAlpha = js.Any.fromFunction1(setAlpha), setBrightness = js.Any.fromFunction1(setBrightness), setColor = js.Any.fromFunction1(setColor), setHue = js.Any.fromFunction1(setHue), setSaturation = js.Any.fromFunction1(setSaturation), toHSL = js.Any.fromFunction0(toHSL), toHex = js.Any.fromFunction0(toHex), toRGB = js.Any.fromFunction0(toRGB), toString = js.Any.fromFunction1(toString), value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Color]
  }
  @scala.inline
  implicit class ColorOps[Self <: Color] (val x: Self) extends AnyVal {
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
    def setFallbackFormat(value: String): Self = this.set("fallbackFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def setFallbackValue(value: String): Self = this.set("fallbackValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setHexNumberSignPrefix(value: Boolean): Self = this.set("hexNumberSignPrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrigFormat(value: String): Self = this.set("origFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def setSetAlpha(value: Double => Unit): Self = this.set("setAlpha", js.Any.fromFunction1(value))
    @scala.inline
    def setSetBrightness(value: Double => Unit): Self = this.set("setBrightness", js.Any.fromFunction1(value))
    @scala.inline
    def setSetColor(value: String => Unit): Self = this.set("setColor", js.Any.fromFunction1(value))
    @scala.inline
    def setSetHue(value: Double => Unit): Self = this.set("setHue", js.Any.fromFunction1(value))
    @scala.inline
    def setSetSaturation(value: Double => Unit): Self = this.set("setSaturation", js.Any.fromFunction1(value))
    @scala.inline
    def setToHSL(value: () => String): Self = this.set("toHSL", js.Any.fromFunction0(value))
    @scala.inline
    def setToHex(value: () => String): Self = this.set("toHex", js.Any.fromFunction0(value))
    @scala.inline
    def setToRGB(value: () => String): Self = this.set("toRGB", js.Any.fromFunction0(value))
    @scala.inline
    def setToString(value: ColorFormat => String): Self = this.set("toString", js.Any.fromFunction1(value))
    @scala.inline
    def setValue(value: A): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

