package typings.culori

import typings.culori.culoriStrings.jab
import typings.culori.srcCommonMod.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcJabTypesMod {
  
  trait Jab
    extends StObject
       with Color {
    
    var a: Double
    
    var alpha: js.UndefOr[Double] = js.undefined
    
    var b: Double
    
    var j: Double
    
    var mode: jab
  }
  object Jab {
    
    inline def apply(a: Double, b: Double, j: Double): Jab = {
      val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], j = j.asInstanceOf[js.Any], mode = "jab")
      __obj.asInstanceOf[Jab]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Jab] (val x: Self) extends AnyVal {
      
      inline def setA(value: Double): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
      
      inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
      
      inline def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
      
      inline def setB(value: Double): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
      
      inline def setJ(value: Double): Self = StObject.set(x, "j", value.asInstanceOf[js.Any])
      
      inline def setMode(value: jab): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    }
  }
}
