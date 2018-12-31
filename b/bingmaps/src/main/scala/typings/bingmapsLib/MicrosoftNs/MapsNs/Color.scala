package typings
package bingmapsLib.MicrosoftNs.MapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Microsoft.Maps.Color")
@js.native
class Color protected () extends js.Object {
  /**
    * @constructor
    * @param a The alpha value in argb format
    * @param r The r value in argb format
    * @param g The g value in argb format
    * @param b The b value in argb format
    */
  def this(a: scala.Double, r: scala.Double, g: scala.Double, b: scala.Double) = this()
  /** The opacity of the color. The range of valid values are an interger between 0 and 255, or a decimal between 0 and 1. */
  var a: scala.Double = js.native
  /** The blue value of the color. The range of valid values is 0 to 255 */
  var b: scala.Double = js.native
  /** The green value of the color. The range of valid values is 0 to 255 */
  var g: scala.Double = js.native
  /** The red value of the color. The range of valid values is 0 to 255 */
  var r: scala.Double = js.native
  /**
    * Gets the opacity of this color.
    * @returns The opacity between 0 and 1 of this color.
    */
  def getOpacity(): scala.Double = js.native
  /**
    * Converts the color to hex notation.
    * @returns The hex notation as '#rrggbb' (ignores a).
    */
  def toHex(): java.lang.String = js.native
  /**
    * Converts the color to rgba notation.
    * @returns The rgba notation as rgba(rr, gg, bb, aa)
    */
  def toRgba(): java.lang.String = js.native
}

@JSGlobal("Microsoft.Maps.Color")
@js.native
object Color extends js.Object {
  /**
    * Clones the color.
    * @param color The color class that needs to be clones.
    * @returns The colne of the color.
    */
  def clone(color: bingmapsLib.MicrosoftNs.MapsNs.Color): bingmapsLib.MicrosoftNs.MapsNs.Color = js.native
  /**
    * Creates the color from a hex string.
    * @param hex The color represented as '#rrggbb' format.
    * @returns The color object.
    */
  def fromHex(hex: java.lang.String): bingmapsLib.MicrosoftNs.MapsNs.Color = js.native
}

