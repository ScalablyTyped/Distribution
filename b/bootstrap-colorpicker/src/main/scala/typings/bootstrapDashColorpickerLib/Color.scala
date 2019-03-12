package typings
package bootstrapDashColorpickerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Color extends js.Object {
  var fallbackFormat: java.lang.String
  var fallbackValue: java.lang.String
  var hexNumberSignPrefix: scala.Boolean
  var origFormat: java.lang.String
  var value: Anon_A
  /**
    * Set the transparency with a value between 0 and 1.
    */
  def setAlpha(value: scala.Double): scala.Unit
  /**
    * Set the brightness with a value between 0 and 1.
    */
  def setBrightness(value: scala.Double): scala.Unit
  /**
    * Set a new color. The value is parsed and tries to do a quess on the format.
    */
  def setColor(value: java.lang.String): scala.Unit
  /**
    * Set the HUE with a value between 0 and 1.
    */
  def setHue(value: scala.Double): scala.Unit
  /**
    * Set the saturation with a value between 0 and 1.
    */
  def setSaturation(value: scala.Double): scala.Unit
  /**
    * Returns a hash with HSLA values.
    */
  def toHSL(): java.lang.String
  /**
    * Returns a string with HEX format for the current color.
    */
  def toHex(): java.lang.String
  /**
    * Returns a hash with red, green, blue and alpha.
    */
  def toRGB(): java.lang.String
  /**
    * Returns current color as string in specified format.
    */
  def toString(format: ColorFormat): java.lang.String
}

object Color {
  @scala.inline
  def apply(
    fallbackFormat: java.lang.String,
    fallbackValue: java.lang.String,
    hexNumberSignPrefix: scala.Boolean,
    origFormat: java.lang.String,
    setAlpha: scala.Double => scala.Unit,
    setBrightness: scala.Double => scala.Unit,
    setColor: java.lang.String => scala.Unit,
    setHue: scala.Double => scala.Unit,
    setSaturation: scala.Double => scala.Unit,
    toHSL: () => java.lang.String,
    toHex: () => java.lang.String,
    toRGB: () => java.lang.String,
    toString: ColorFormat => java.lang.String,
    value: Anon_A
  ): Color = {
    val __obj = js.Dynamic.literal(fallbackFormat = fallbackFormat, fallbackValue = fallbackValue, hexNumberSignPrefix = hexNumberSignPrefix, origFormat = origFormat, setAlpha = js.Any.fromFunction1(setAlpha), setBrightness = js.Any.fromFunction1(setBrightness), setColor = js.Any.fromFunction1(setColor), setHue = js.Any.fromFunction1(setHue), setSaturation = js.Any.fromFunction1(setSaturation), toHSL = js.Any.fromFunction0(toHSL), toHex = js.Any.fromFunction0(toHex), toRGB = js.Any.fromFunction0(toRGB), toString = js.Any.fromFunction1(toString), value = value)
  
    __obj.asInstanceOf[Color]
  }
}

