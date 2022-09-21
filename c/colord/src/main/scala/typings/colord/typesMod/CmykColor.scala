package typings.colord.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CmykColor
  extends StObject
     with ObjectColor {
  
  var c: Double
  
  var k: Double
  
  var m: Double
  
  var y: Double
}
object CmykColor {
  
  inline def apply(c: Double, k: Double, m: Double, y: Double): CmykColor = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], k = k.asInstanceOf[js.Any], m = m.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[CmykColor]
  }
  
  extension [Self <: CmykColor](x: Self) {
    
    inline def setC(value: Double): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setK(value: Double): Self = StObject.set(x, "k", value.asInstanceOf[js.Any])
    
    inline def setM(value: Double): Self = StObject.set(x, "m", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
