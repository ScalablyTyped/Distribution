package typings.culori

import typings.culori.culoriStrings.yiq
import typings.culori.srcCommonMod.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcYiqTypesMod {
  
  trait Yiq
    extends StObject
       with Color {
    
    var alpha: js.UndefOr[Double] = js.undefined
    
    var i: Double
    
    var mode: yiq
    
    var q: Double
    
    var y: Double
  }
  object Yiq {
    
    inline def apply(i: Double, q: Double, y: Double): Yiq = {
      val __obj = js.Dynamic.literal(i = i.asInstanceOf[js.Any], mode = "yiq", q = q.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Yiq]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Yiq] (val x: Self) extends AnyVal {
      
      inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
      
      inline def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
      
      inline def setI(value: Double): Self = StObject.set(x, "i", value.asInstanceOf[js.Any])
      
      inline def setMode(value: yiq): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setQ(value: Double): Self = StObject.set(x, "q", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
