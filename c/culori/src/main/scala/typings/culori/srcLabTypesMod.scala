package typings.culori

import typings.culori.culoriStrings.lab
import typings.culori.srcCommonMod.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcLabTypesMod {
  
  trait Lab
    extends StObject
       with Color {
    
    var a: Double
    
    var alpha: js.UndefOr[Double] = js.undefined
    
    var b: Double
    
    var l: Double
    
    var mode: lab
  }
  object Lab {
    
    inline def apply(a: Double, b: Double, l: Double): Lab = {
      val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], l = l.asInstanceOf[js.Any], mode = "lab")
      __obj.asInstanceOf[Lab]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Lab] (val x: Self) extends AnyVal {
      
      inline def setA(value: Double): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
      
      inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
      
      inline def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
      
      inline def setB(value: Double): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
      
      inline def setL(value: Double): Self = StObject.set(x, "l", value.asInstanceOf[js.Any])
      
      inline def setMode(value: lab): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    }
  }
}
