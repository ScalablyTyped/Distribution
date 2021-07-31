package typings.colorCheck

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("color-check", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def aa(foreground: Color, background: Color): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("aa")(foreground.asInstanceOf[js.Any], background.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def aa18(foreground: Color, background: Color): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("aa_18")(foreground.asInstanceOf[js.Any], background.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def aaa(foreground: Color, background: Color): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("aaa")(foreground.asInstanceOf[js.Any], background.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def aaa18(foreground: Color, background: Color): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("aaa_18")(foreground.asInstanceOf[js.Any], background.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("color-check", "brightnessThreshold")
  @js.native
  val brightnessThreshold: Double = js.native
  
  @scala.inline
  def colorBrightnessDifference(foreground: Color, background: Color): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("colorBrightnessDifference")(foreground.asInstanceOf[js.Any], background.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def colorCompliance(foreground: Color, background: Color): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("colorCompliance")(foreground.asInstanceOf[js.Any], background.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def colorContrast(foreground: Color, background: Color): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("colorContrast")(foreground.asInstanceOf[js.Any], background.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @JSImport("color-check", "colorContrastThreshold")
  @js.native
  val colorContrastThreshold: Double = js.native
  
  @scala.inline
  def colorDifference(foreground: Color, background: Color): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("colorDifference")(foreground.asInstanceOf[js.Any], background.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def colorGetLuminance(rgb: js.Tuple3[Double, Double, Double]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("colorGetLuminance")(rgb.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def hexToRgb(colorValue: Color): RGB = ^.asInstanceOf[js.Dynamic].applyDynamic("hexToRgb")(colorValue.asInstanceOf[js.Any]).asInstanceOf[RGB]
  
  type Color = String | RGB
  
  trait RGB extends StObject {
    
    var b: String | Double
    
    var g: String | Double
    
    var r: String | Double
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
