package typings.culori.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<culori.culori/src/hsv/types.Hsv, 'mode'> */
trait OmitHsvmode extends StObject {
  
  var alpha: js.UndefOr[Double] = js.undefined
  
  var h: js.UndefOr[Double] = js.undefined
  
  var s: Double
  
  var v: Double
}
object OmitHsvmode {
  
  inline def apply(s: Double, v: Double): OmitHsvmode = {
    val __obj = js.Dynamic.literal(s = s.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitHsvmode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OmitHsvmode] (val x: Self) extends AnyVal {
    
    inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    inline def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
    
    inline def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
    
    inline def setHUndefined: Self = StObject.set(x, "h", js.undefined)
    
    inline def setS(value: Double): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
    
    inline def setV(value: Double): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
  }
}
