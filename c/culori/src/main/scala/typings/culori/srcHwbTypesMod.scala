package typings.culori

import typings.culori.culoriStrings.hwb
import typings.culori.srcCommonMod.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcHwbTypesMod {
  
  trait Hwb
    extends StObject
       with Color {
    
    var alpha: js.UndefOr[Double] = js.undefined
    
    var b: Double
    
    var h: js.UndefOr[Double] = js.undefined
    
    var mode: hwb
    
    var w: Double
  }
  object Hwb {
    
    inline def apply(b: Double, w: Double): Hwb = {
      val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], mode = "hwb", w = w.asInstanceOf[js.Any])
      __obj.asInstanceOf[Hwb]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Hwb] (val x: Self) extends AnyVal {
      
      inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
      
      inline def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
      
      inline def setB(value: Double): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
      
      inline def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
      
      inline def setHUndefined: Self = StObject.set(x, "h", js.undefined)
      
      inline def setMode(value: hwb): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setW(value: Double): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
    }
  }
}
