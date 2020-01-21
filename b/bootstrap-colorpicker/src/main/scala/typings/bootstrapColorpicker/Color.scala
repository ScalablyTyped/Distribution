package typings.bootstrapColorpicker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Color extends js.Object {
  var fallbackFormat: String
  var fallbackValue: String
  var hexNumberSignPrefix: Boolean
  var origFormat: String
  var value: AnonA
  /**
    * Set the transparency with a value between 0 and 1.
    */
  def setAlpha(value: Double): Unit
  /**
    * Set the brightness with a value between 0 and 1.
    */
  def setBrightness(value: Double): Unit
  /**
    * Set a new color. The value is parsed and tries to do a quess on the format.
    */
  def setColor(value: String): Unit
  /**
    * Set the HUE with a value between 0 and 1.
    */
  def setHue(value: Double): Unit
  /**
    * Set the saturation with a value between 0 and 1.
    */
  def setSaturation(value: Double): Unit
  /**
    * Returns a hash with HSLA values.
    */
  def toHSL(): String
  /**
    * Returns a string with HEX format for the current color.
    */
  def toHex(): String
  /**
    * Returns a hash with red, green, blue and alpha.
    */
  def toRGB(): String
  /**
    * Returns current color as string in specified format.
    */
  def toString(format: ColorFormat): String
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
    value: AnonA
  ): Color = {
    val __obj = js.Dynamic.literal(fallbackFormat = fallbackFormat.asInstanceOf[js.Any], fallbackValue = fallbackValue.asInstanceOf[js.Any], hexNumberSignPrefix = hexNumberSignPrefix.asInstanceOf[js.Any], origFormat = origFormat.asInstanceOf[js.Any], setAlpha = js.Any.fromFunction1(setAlpha), setBrightness = js.Any.fromFunction1(setBrightness), setColor = js.Any.fromFunction1(setColor), setHue = js.Any.fromFunction1(setHue), setSaturation = js.Any.fromFunction1(setSaturation), toHSL = js.Any.fromFunction0(toHSL), toHex = js.Any.fromFunction0(toHex), toRGB = js.Any.fromFunction0(toRGB), toString = js.Any.fromFunction1(toString), value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Color]
  }
}

