package typings.bingmaps.Microsoft.Maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Color extends js.Object {
  /** The opacity of the color. The range of valid values are an interger between 0 and 255, or a decimal between 0 and 1. */
  var a: Double
  /** The blue value of the color. The range of valid values is 0 to 255 */
  var b: Double
  /** The green value of the color. The range of valid values is 0 to 255 */
  var g: Double
  /** The red value of the color. The range of valid values is 0 to 255 */
  var r: Double
  /**
    * Gets the opacity of this color.
    * @returns The opacity between 0 and 1 of this color.
    */
  def getOpacity(): Double
  /**
    * Converts the color to hex notation.
    * @returns The hex notation as '#rrggbb' (ignores a).
    */
  def toHex(): String
  /**
    * Converts the color to rgba notation.
    * @returns The rgba notation as rgba(rr, gg, bb, aa)
    */
  def toRgba(): String
}

object Color {
  @scala.inline
  def apply(
    a: Double,
    b: Double,
    g: Double,
    getOpacity: () => Double,
    r: Double,
    toHex: () => String,
    toRgba: () => String
  ): Color = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], getOpacity = js.Any.fromFunction0(getOpacity), r = r.asInstanceOf[js.Any], toHex = js.Any.fromFunction0(toHex), toRgba = js.Any.fromFunction0(toRgba))
    __obj.asInstanceOf[Color]
  }
}

