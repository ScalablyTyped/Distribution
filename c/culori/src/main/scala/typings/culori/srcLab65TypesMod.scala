package typings.culori

import typings.culori.culoriStrings.lab65
import typings.culori.srcCommonMod.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcLab65TypesMod {
  
  trait Lab65
    extends StObject
       with Color {
    
    var a: Double
    
    var alpha: js.UndefOr[Double] = js.undefined
    
    var b: Double
    
    var l: Double
    
    var mode: lab65
  }
  object Lab65 {
    
    inline def apply(a: Double, b: Double, l: Double): Lab65 = {
      val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], l = l.asInstanceOf[js.Any], mode = "lab65")
      __obj.asInstanceOf[Lab65]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Lab65] (val x: Self) extends AnyVal {
      
      inline def setA(value: Double): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
      
      inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
      
      inline def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
      
      inline def setB(value: Double): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
      
      inline def setL(value: Double): Self = StObject.set(x, "l", value.asInstanceOf[js.Any])
      
      inline def setMode(value: lab65): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    }
  }
}
