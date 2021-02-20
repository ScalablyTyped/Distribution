package typings.colorCheck

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("color-check", "aa")
  @js.native
  def aa(foreground: Color, background: Color): Boolean = js.native
  
  @JSImport("color-check", "aa_18")
  @js.native
  def aa18(foreground: Color, background: Color): Boolean = js.native
  
  @JSImport("color-check", "aaa")
  @js.native
  def aaa(foreground: Color, background: Color): Boolean = js.native
  
  @JSImport("color-check", "aaa_18")
  @js.native
  def aaa18(foreground: Color, background: Color): Boolean = js.native
  
  @JSImport("color-check", "brightnessThreshold")
  @js.native
  val brightnessThreshold: Double = js.native
  
  @JSImport("color-check", "colorBrightnessDifference")
  @js.native
  def colorBrightnessDifference(foreground: Color, background: Color): Boolean = js.native
  
  @JSImport("color-check", "colorCompliance")
  @js.native
  def colorCompliance(foreground: Color, background: Color): Boolean = js.native
  
  @JSImport("color-check", "colorContrast")
  @js.native
  def colorContrast(foreground: Color, background: Color): Double = js.native
  
  @JSImport("color-check", "colorContrastThreshold")
  @js.native
  val colorContrastThreshold: Double = js.native
  
  @JSImport("color-check", "colorDifference")
  @js.native
  def colorDifference(foreground: Color, background: Color): Boolean = js.native
  
  @JSImport("color-check", "colorGetLuminance")
  @js.native
  def colorGetLuminance(rgb: js.Tuple3[Double, Double, Double]): Double = js.native
  
  @JSImport("color-check", "hexToRgb")
  @js.native
  def hexToRgb(colorValue: Color): RGB = js.native
  
  type Color = String | RGB
  
  @js.native
  trait RGB extends StObject {
    
    var b: String | Double = js.native
    
    var g: String | Double = js.native
    
    var r: String | Double = js.native
  }
  object RGB {
    
    @scala.inline
    def apply(b: String | Double, g: String | Double, r: String | Double): RGB = {
      val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
      __obj.asInstanceOf[RGB]
    }
    
    @scala.inline
    implicit class RGBMutableBuilder[Self <: RGB] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setB(value: String | Double): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setG(value: String | Double): Self = StObject.set(x, "g", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setR(value: String | Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    }
  }
}
