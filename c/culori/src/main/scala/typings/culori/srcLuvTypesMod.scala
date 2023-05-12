package typings.culori

import typings.culori.culoriStrings.luv
import typings.culori.srcCommonMod.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcLuvTypesMod {
  
  trait Luv
    extends StObject
       with Color {
    
    var alpha: js.UndefOr[Double] = js.undefined
    
    var l: Double
    
    var mode: luv
    
    var u: Double
    
    var v: Double
  }
  object Luv {
    
    inline def apply(l: Double, u: Double, v: Double): Luv = {
      val __obj = js.Dynamic.literal(l = l.asInstanceOf[js.Any], mode = "luv", u = u.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
      __obj.asInstanceOf[Luv]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Luv] (val x: Self) extends AnyVal {
      
      inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
      
      inline def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
      
      inline def setL(value: Double): Self = StObject.set(x, "l", value.asInstanceOf[js.Any])
      
      inline def setMode(value: luv): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setU(value: Double): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
      
      inline def setV(value: Double): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
    }
  }
}
