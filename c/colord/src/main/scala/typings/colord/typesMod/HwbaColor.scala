package typings.colord.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined colord.colord/types.WithAlpha<colord.colord/types.HwbColor> */
trait HwbaColor
  extends StObject
     with ObjectColor {
  
  var a: Double
  
  var b: Double
  
  var h: Double
  
  var w: Double
}
object HwbaColor {
  
  inline def apply(a: Double, b: Double, h: Double, w: Double): HwbaColor = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], h = h.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any])
    __obj.asInstanceOf[HwbaColor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HwbaColor] (val x: Self) extends AnyVal {
    
    inline def setA(value: Double): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setB(value: Double): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
    
    inline def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
    
    inline def setW(value: Double): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
  }
}
