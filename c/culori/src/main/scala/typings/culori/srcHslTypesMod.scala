package typings.culori

import typings.culori.culoriStrings.hsl
import typings.culori.srcCommonMod.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcHslTypesMod {
  
  trait Hsl
    extends StObject
       with Color {
    
    var alpha: js.UndefOr[Double] = js.undefined
    
    var h: js.UndefOr[Double] = js.undefined
    
    var l: Double
    
    var mode: hsl
    
    var s: Double
  }
  object Hsl {
    
    inline def apply(l: Double, s: Double): Hsl = {
      val __obj = js.Dynamic.literal(l = l.asInstanceOf[js.Any], mode = "hsl", s = s.asInstanceOf[js.Any])
      __obj.asInstanceOf[Hsl]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Hsl] (val x: Self) extends AnyVal {
      
      inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
      
      inline def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
      
      inline def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
      
      inline def setHUndefined: Self = StObject.set(x, "h", js.undefined)
      
      inline def setL(value: Double): Self = StObject.set(x, "l", value.asInstanceOf[js.Any])
      
      inline def setMode(value: hsl): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setS(value: Double): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
    }
  }
}
