package typings.bingmaps.Microsoft.Maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Color extends StObject {
  
  /** The opacity of the color. The range of valid values are an interger between 0 and 255, or a decimal between 0 and 1. */
  var a: Double
  
  /** The blue value of the color. The range of valid values is 0 to 255 */
  var b: Double
  
  /** The green value of the color. The range of valid values is 0 to 255 */
  var g: Double
  
  /**
    * Gets the opacity of this color.
    * @returns The opacity between 0 and 1 of this color.
    */
  def getOpacity(): Double
  
  /** The red value of the color. The range of valid values is 0 to 255 */
  var r: Double
  
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
  
  @scala.inline
  implicit class ColorMutableBuilder[Self <: Color] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setA(value: Double): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setB(value: Double): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setG(value: Double): Self = StObject.set(x, "g", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetOpacity(value: () => Double): Self = StObject.set(x, "getOpacity", js.Any.fromFunction0(value))
    
    @scala.inline
    def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToHex(value: () => String): Self = StObject.set(x, "toHex", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToRgba(value: () => String): Self = StObject.set(x, "toRgba", js.Any.fromFunction0(value))
  }
}
