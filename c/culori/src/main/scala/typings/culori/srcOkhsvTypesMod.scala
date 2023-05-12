package typings.culori

import typings.culori.culoriStrings.okhsv
import typings.culori.srcCommonMod.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcOkhsvTypesMod {
  
  trait Okhsv
    extends StObject
       with Color {
    
    var alpha: js.UndefOr[Double] = js.undefined
    
    var h: js.UndefOr[Double] = js.undefined
    
    var mode: okhsv
    
    var s: Double
    
    var v: Double
  }
  object Okhsv {
    
    inline def apply(s: Double, v: Double): Okhsv = {
      val __obj = js.Dynamic.literal(mode = "okhsv", s = s.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
      __obj.asInstanceOf[Okhsv]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Okhsv] (val x: Self) extends AnyVal {
      
      inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
      
      inline def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
      
      inline def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
      
      inline def setHUndefined: Self = StObject.set(x, "h", js.undefined)
      
      inline def setMode(value: okhsv): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setS(value: Double): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
      
      inline def setV(value: Double): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
    }
  }
}
