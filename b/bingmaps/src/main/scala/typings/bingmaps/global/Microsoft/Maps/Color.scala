package typings.bingmaps.global.Microsoft.Maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Microsoft.Maps.Color")
@js.native
class Color protected ()
  extends typings.bingmaps.Microsoft.Maps.Color {
  /**
    * @constructor
    * @param a The alpha value in argb format
    * @param r The r value in argb format
    * @param g The g value in argb format
    * @param b The b value in argb format
    */
  def this(a: Double, r: Double, g: Double, b: Double) = this()
}

/* static members */
@JSGlobal("Microsoft.Maps.Color")
@js.native
object Color extends js.Object {
  /**
    * Clones the color.
    * @param color The color class that needs to be clones.
    * @returns The colne of the color.
    */
  def clone(color: typings.bingmaps.Microsoft.Maps.Color): typings.bingmaps.Microsoft.Maps.Color = js.native
  /**
    * Creates the color from a hex string.
    * @param hex The color represented as '#rrggbb' format.
    * @returns The color object.
    */
  def fromHex(hex: String): typings.bingmaps.Microsoft.Maps.Color = js.native
}

