package typings.culori

import typings.culori.culoriStrings.jch
import typings.culori.srcCommonMod.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcJchTypesMod {
  
  trait Jch
    extends StObject
       with Color {
    
    var alpha: js.UndefOr[Double] = js.undefined
    
    var c: Double
    
    var h: js.UndefOr[Double] = js.undefined
    
    var j: Double
    
    var mode: jch
  }
  object Jch {
    
    inline def apply(c: Double, j: Double): Jch = {
      val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], j = j.asInstanceOf[js.Any], mode = "jch")
      __obj.asInstanceOf[Jch]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Jch] (val x: Self) extends AnyVal {
      
      inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
      
      inline def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
      
      inline def setC(value: Double): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
      
      inline def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
      
      inline def setHUndefined: Self = StObject.set(x, "h", js.undefined)
      
      inline def setJ(value: Double): Self = StObject.set(x, "j", value.asInstanceOf[js.Any])
      
      inline def setMode(value: jch): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    }
  }
}
