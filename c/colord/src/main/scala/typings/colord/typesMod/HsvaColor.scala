package typings.colord.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined colord.colord/types.WithAlpha<colord.colord/types.HsvColor> */
trait HsvaColor
  extends StObject
     with ObjectColor {
  
  var a: Double
  
  var h: Double
  
  var s: Double
  
  var v: Double
}
object HsvaColor {
  
  inline def apply(a: Double, h: Double, s: Double, v: Double): HsvaColor = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], h = h.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
    __obj.asInstanceOf[HsvaColor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HsvaColor] (val x: Self) extends AnyVal {
    
    inline def setA(value: Double): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
    
    inline def setS(value: Double): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
    
    inline def setV(value: Double): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
  }
}
