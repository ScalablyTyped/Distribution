package typings.bingmaps.global.Microsoft.Maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
object Color {
  
  /**
    * Clones the color.
    * @param color The color class that needs to be clones.
    * @returns The colne of the color.
    */
  @JSGlobal("Microsoft.Maps.Color.clone")
  @js.native
  def clone(color: typings.bingmaps.Microsoft.Maps.Color): typings.bingmaps.Microsoft.Maps.Color = js.native
  
  /**
    * Creates the color from a hex string.
    * @param hex The color represented as '#rrggbb' format.
    * @returns The color object.
    */
  @JSGlobal("Microsoft.Maps.Color.fromHex")
  @js.native
  def fromHex(hex: String): typings.bingmaps.Microsoft.Maps.Color = js.native
}
