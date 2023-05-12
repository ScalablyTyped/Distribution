package typings.culori

import typings.culori.culoriStrings.xyz50
import typings.culori.srcCommonMod.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcXyz50TypesMod {
  
  trait Xyz50
    extends StObject
       with Color {
    
    var alpha: js.UndefOr[Double] = js.undefined
    
    var mode: xyz50
    
    var x: Double
    
    var y: Double
    
    var z: Double
  }
  object Xyz50 {
    
    inline def apply(x: Double, y: Double, z: Double): Xyz50 = {
      val __obj = js.Dynamic.literal(mode = "xyz50", x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
      __obj.asInstanceOf[Xyz50]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Xyz50] (val x: Self) extends AnyVal {
      
      inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
      
      inline def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
      
      inline def setMode(value: xyz50): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
    }
  }
}
