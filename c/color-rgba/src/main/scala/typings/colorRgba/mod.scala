package typings.colorRgba

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(string: ColorValue): js.UndefOr[js.Tuple4[Double, Double, Double, Double]] = ^.asInstanceOf[js.Dynamic].apply(string.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Tuple4[Double, Double, Double, Double]]]
  
  @JSImport("color-rgba", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typings.colorRgba.mod.RGBTuple
    - typings.colorRgba.mod.RGBColor
    - typings.colorRgba.mod.RGBKeyedColor
    - typings.colorRgba.mod.HSL
  */
  type ColorValue = _ColorValue | String | RGBTuple
  
  trait HSL
    extends StObject
       with _ColorValue {
    
    var h: Double
    
    var l: Double
    
    var s: Double
  }
  object HSL {
    
    inline def apply(h: Double, l: Double, s: Double): HSL = {
      val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], l = l.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any])
      __obj.asInstanceOf[HSL]
    }
    
    extension [Self <: HSL](x: Self) {
      
      inline def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
      
      inline def setL(value: Double): Self = StObject.set(x, "l", value.asInstanceOf[js.Any])
      
      inline def setS(value: Double): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
    }
  }
  
  trait RGBColor
    extends StObject
       with _ColorValue {
    
    var b: Double
    
    var g: Double
    
    var r: Double
  }
  object RGBColor {
    
    inline def apply(b: Double, g: Double, r: Double): RGBColor = {
      val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
      __obj.asInstanceOf[RGBColor]
    }
    
    extension [Self <: RGBColor](x: Self) {
      
      inline def setB(value: Double): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
      
      inline def setG(value: Double): Self = StObject.set(x, "g", value.asInstanceOf[js.Any])
      
      inline def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    }
  }
  
  trait RGBKeyedColor
    extends StObject
       with _ColorValue {
    
    var blue: Double
    
    var green: Double
    
    var red: Double
  }
  object RGBKeyedColor {
    
    inline def apply(blue: Double, green: Double, red: Double): RGBKeyedColor = {
      val __obj = js.Dynamic.literal(blue = blue.asInstanceOf[js.Any], green = green.asInstanceOf[js.Any], red = red.asInstanceOf[js.Any])
      __obj.asInstanceOf[RGBKeyedColor]
    }
    
    extension [Self <: RGBKeyedColor](x: Self) {
      
      inline def setBlue(value: Double): Self = StObject.set(x, "blue", value.asInstanceOf[js.Any])
      
      inline def setGreen(value: Double): Self = StObject.set(x, "green", value.asInstanceOf[js.Any])
      
      inline def setRed(value: Double): Self = StObject.set(x, "red", value.asInstanceOf[js.Any])
    }
  }
  
  type RGBTuple = js.Tuple3[Double, Double, Double]
  
  trait _ColorValue extends StObject
  object _ColorValue {
    
    inline def HSL(h: Double, l: Double, s: Double): typings.colorRgba.mod.HSL = {
      val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], l = l.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.colorRgba.mod.HSL]
    }
    
    inline def RGBColor(b: Double, g: Double, r: Double): typings.colorRgba.mod.RGBColor = {
      val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.colorRgba.mod.RGBColor]
    }
    
    inline def RGBKeyedColor(blue: Double, green: Double, red: Double): typings.colorRgba.mod.RGBKeyedColor = {
      val __obj = js.Dynamic.literal(blue = blue.asInstanceOf[js.Any], green = green.asInstanceOf[js.Any], red = red.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.colorRgba.mod.RGBKeyedColor]
    }
  }
}
