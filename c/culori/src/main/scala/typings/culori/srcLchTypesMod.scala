package typings.culori

import typings.culori.culoriStrings.lch
import typings.culori.srcCommonMod.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcLchTypesMod {
  
  trait Lch
    extends StObject
       with Color {
    
    var alpha: js.UndefOr[Double] = js.undefined
    
    var c: Double
    
    var h: js.UndefOr[Double] = js.undefined
    
    var l: Double
    
    var mode: lch
  }
  object Lch {
    
    inline def apply(c: Double, l: Double): Lch = {
      val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], l = l.asInstanceOf[js.Any], mode = "lch")
      __obj.asInstanceOf[Lch]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Lch] (val x: Self) extends AnyVal {
      
      inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
      
      inline def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
      
      inline def setC(value: Double): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
      
      inline def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
      
      inline def setHUndefined: Self = StObject.set(x, "h", js.undefined)
      
      inline def setL(value: Double): Self = StObject.set(x, "l", value.asInstanceOf[js.Any])
      
      inline def setMode(value: lch): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    }
  }
}
