package typings.culori

import typings.culori.culoriStrings.okhsl
import typings.culori.srcCommonMod.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcOkhslTypesMod {
  
  trait Okhsl
    extends StObject
       with Color {
    
    var alpha: js.UndefOr[Double] = js.undefined
    
    var h: js.UndefOr[Double] = js.undefined
    
    var l: Double
    
    var mode: okhsl
    
    var s: Double
  }
  object Okhsl {
    
    inline def apply(l: Double, s: Double): Okhsl = {
      val __obj = js.Dynamic.literal(l = l.asInstanceOf[js.Any], mode = "okhsl", s = s.asInstanceOf[js.Any])
      __obj.asInstanceOf[Okhsl]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Okhsl] (val x: Self) extends AnyVal {
      
      inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
      
      inline def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
      
      inline def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
      
      inline def setHUndefined: Self = StObject.set(x, "h", js.undefined)
      
      inline def setL(value: Double): Self = StObject.set(x, "l", value.asInstanceOf[js.Any])
      
      inline def setMode(value: okhsl): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setS(value: Double): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
    }
  }
}
