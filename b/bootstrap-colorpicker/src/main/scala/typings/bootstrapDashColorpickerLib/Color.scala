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
    setAlpha: js.Function1[scala.Double, scala.Unit],
    setBrightness: js.Function1[scala.Double, scala.Unit],
    setColor: js.Function1[java.lang.String, scala.Unit],
    setHue: js.Function1[scala.Double, scala.Unit],
    setSaturation: js.Function1[scala.Double, scala.Unit],
    toHSL: js.Function0[java.lang.String],
    toHex: js.Function0[java.lang.String],
    toRGB: js.Function0[java.lang.String],
    toString: js.Function1[ColorFormat, java.lang.String],
    value: Anon_A
  ): Color = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fallbackFormat")(fallbackFormat)
    __obj.updateDynamic("fallbackValue")(fallbackValue)
    __obj.updateDynamic("hexNumberSignPrefix")(hexNumberSignPrefix)
    __obj.updateDynamic("origFormat")(origFormat)
    __obj.updateDynamic("setAlpha")(setAlpha)
    __obj.updateDynamic("setBrightness")(setBrightness)
    __obj.updateDynamic("setColor")(setColor)
    __obj.updateDynamic("setHue")(setHue)
    __obj.updateDynamic("setSaturation")(setSaturation)
    __obj.updateDynamic("toHSL")(toHSL)
    __obj.updateDynamic("toHex")(toHex)
    __obj.updateDynamic("toRGB")(toRGB)
    __obj.updateDynamic("toString")(toString)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Color]
  }
}

