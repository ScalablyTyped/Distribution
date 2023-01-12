package typings.colord.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined colord.colord/types.WithAlpha<colord.colord/types.CmykColor> */
trait CmykaColor
  extends StObject
     with ObjectColor {
  
  var a: Double
  
  var c: Double
  
  var k: Double
  
  var m: Double
  
  var y: Double
}
object CmykaColor {
  
  inline def apply(a: Double, c: Double, k: Double, m: Double, y: Double): CmykaColor = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], c = c.asInstanceOf[js.Any], k = k.asInstanceOf[js.Any], m = m.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[CmykaColor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CmykaColor] (val x: Self) extends AnyVal {
    
    inline def setA(value: Double): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setC(value: Double): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setK(value: Double): Self = StObject.set(x, "k", value.asInstanceOf[js.Any])
    
    inline def setM(value: Double): Self = StObject.set(x, "m", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
