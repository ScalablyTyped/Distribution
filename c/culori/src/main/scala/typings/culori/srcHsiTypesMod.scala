package typings.culori

import typings.culori.culoriStrings.hsi
import typings.culori.srcCommonMod.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcHsiTypesMod {
  
  trait Hsi
    extends StObject
       with Color {
    
    var alpha: js.UndefOr[Double] = js.undefined
    
    var h: js.UndefOr[Double] = js.undefined
    
    var i: Double
    
    var mode: hsi
    
    var s: Double
  }
  object Hsi {
    
    inline def apply(i: Double, s: Double): Hsi = {
      val __obj = js.Dynamic.literal(i = i.asInstanceOf[js.Any], mode = "hsi", s = s.asInstanceOf[js.Any])
      __obj.asInstanceOf[Hsi]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Hsi] (val x: Self) extends AnyVal {
      
      inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
      
      inline def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
      
      inline def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
      
      inline def setHUndefined: Self = StObject.set(x, "h", js.undefined)
      
      inline def setI(value: Double): Self = StObject.set(x, "i", value.asInstanceOf[js.Any])
      
      inline def setMode(value: hsi): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setS(value: Double): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
    }
  }
}
