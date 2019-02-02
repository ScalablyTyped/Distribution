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

