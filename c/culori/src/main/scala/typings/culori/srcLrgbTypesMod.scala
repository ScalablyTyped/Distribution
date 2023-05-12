package typings.culori

import typings.culori.culoriStrings.lrgb
import typings.culori.srcCommonMod.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcLrgbTypesMod {
  
  trait Lrgb
    extends StObject
       with Color {
    
    var alpha: js.UndefOr[Double] = js.undefined
    
    var b: Double
    
    var g: Double
    
    var mode: lrgb
    
    var r: Double
  }
  object Lrgb {
    
    inline def apply(b: Double, g: Double, r: Double): Lrgb = {
      val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], mode = "lrgb", r = r.asInstanceOf[js.Any])
      __obj.asInstanceOf[Lrgb]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Lrgb] (val x: Self) extends AnyVal {
      
      inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
      
      inline def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
      
      inline def setB(value: Double): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
      
      inline def setG(value: Double): Self = StObject.set(x, "g", value.asInstanceOf[js.Any])
      
      inline def setMode(value: lrgb): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    }
  }
}
