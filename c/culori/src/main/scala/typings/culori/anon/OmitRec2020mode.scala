package typings.culori.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<culori.culori/src/rec2020/types.Rec2020, 'mode'> */
trait OmitRec2020mode extends StObject {
  
  var alpha: js.UndefOr[Double] = js.undefined
  
  var b: Double
  
  var g: Double
  
  var r: Double
}
object OmitRec2020mode {
  
  inline def apply(b: Double, g: Double, r: Double): OmitRec2020mode = {
    val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitRec2020mode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OmitRec2020mode] (val x: Self) extends AnyVal {
    
    inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    inline def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
    
    inline def setB(value: Double): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
    
    inline def setG(value: Double): Self = StObject.set(x, "g", value.asInstanceOf[js.Any])
    
    inline def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
