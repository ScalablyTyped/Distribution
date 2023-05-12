package typings.culori

import typings.culori.culoriStrings.p3
import typings.culori.srcCommonMod.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcP3TypesMod {
  
  trait P3
    extends StObject
       with Color {
    
    var alpha: js.UndefOr[Double] = js.undefined
    
    var b: Double
    
    var g: Double
    
    var mode: p3
    
    var r: Double
  }
  object P3 {
    
    inline def apply(b: Double, g: Double, r: Double): P3 = {
      val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], mode = "p3", r = r.asInstanceOf[js.Any])
      __obj.asInstanceOf[P3]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: P3] (val x: Self) extends AnyVal {
      
      inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
      
      inline def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
      
      inline def setB(value: Double): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
      
      inline def setG(value: Double): Self = StObject.set(x, "g", value.asInstanceOf[js.Any])
      
      inline def setMode(value: p3): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    }
  }
}
