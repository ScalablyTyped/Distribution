package typings.bingmaps.global.Microsoft.Maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Microsoft.Maps.Color")
@js.native
open class Color protected ()
  extends StObject
     with typings.bingmaps.Microsoft.Maps.Color {
  /**
    * @constructor
    * @param a The alpha value in argb format
    * @param r The r value in argb format
    * @param g The g value in argb format
    * @param b The b value in argb format
    */
  def this(a: Double, r: Double, g: Double, b: Double) = this()
  
  /** The opacity of the color. The range of valid values are an interger between 0 and 255, or a decimal between 0 and 1. */
  /* CompleteClass */
  var a: Double = js.native
  
  /** The blue value of the color. The range of valid values is 0 to 255 */
  /* CompleteClass */
  var b: Double = js.native
  
  /** The green value of the color. The range of valid values is 0 to 255 */
  /* CompleteClass */
  var g: Double = js.native
  
  /**
    * Gets the opacity of this color.
    * @returns The opacity between 0 and 1 of this color.
    */
  /* CompleteClass */
  override def getOpacity(): Double = js.native
  
  /** The red value of the color. The range of valid values is 0 to 255 */
  /* CompleteClass */
  var r: Double = js.native
  
  /**
    * Converts the color to hex notation.
    * @returns The hex notation as '#rrggbb' (ignores a).
    */
  /* CompleteClass */
  override def toHex(): String = js.native
  
  /**
    * Converts the color to rgba notation.
    * @returns The rgba notation as rgba(rr, gg, bb, aa)
    */
  /* CompleteClass */
  override def toRgba(): String = js.native
}
/* static members */
object Color {
  
  @JSGlobal("Microsoft.Maps.Color")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Clones the color.
    * @param color The color class that needs to be clones.
    * @returns The colne of the color.
    */
  inline def clone(color: typings.bingmaps.Microsoft.Maps.Color): typings.bingmaps.Microsoft.Maps.Color = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(color.asInstanceOf[js.Any]).asInstanceOf[typings.bingmaps.Microsoft.Maps.Color]
  
  /**
    * Creates the color from a hex string.
    * @param hex The color represented as '#rrggbb' format.
    * @returns The color object.
    */
  inline def fromHex(hex: String): typings.bingmaps.Microsoft.Maps.Color = ^.asInstanceOf[js.Dynamic].applyDynamic("fromHex")(hex.asInstanceOf[js.Any]).asInstanceOf[typings.bingmaps.Microsoft.Maps.Color]
}
