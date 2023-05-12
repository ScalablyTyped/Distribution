package typings.culori

import typings.culori.culoriStrings.rec2020
import typings.culori.srcCommonMod.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcRec2020TypesMod {
  
  trait Rec2020
    extends StObject
       with Color {
    
    var alpha: js.UndefOr[Double] = js.undefined
    
    var b: Double
    
    var g: Double
    
    var mode: rec2020
    
    var r: Double
  }
  object Rec2020 {
    
    inline def apply(b: Double, g: Double, r: Double): Rec2020 = {
      val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], mode = "rec2020", r = r.asInstanceOf[js.Any])
      __obj.asInstanceOf[Rec2020]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Rec2020] (val x: Self) extends AnyVal {
      
      inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
      
      inline def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
      
      inline def setB(value: Double): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
      
      inline def setG(value: Double): Self = StObject.set(x, "g", value.asInstanceOf[js.Any])
      
      inline def setMode(value: rec2020): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    }
  }
}
