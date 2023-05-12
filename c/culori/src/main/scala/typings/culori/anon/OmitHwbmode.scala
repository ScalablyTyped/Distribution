package typings.culori.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<culori.culori/src/hwb/types.Hwb, 'mode'> */
trait OmitHwbmode extends StObject {
  
  var alpha: js.UndefOr[Double] = js.undefined
  
  var b: Double
  
  var h: js.UndefOr[Double] = js.undefined
  
  var w: Double
}
object OmitHwbmode {
  
  inline def apply(b: Double, w: Double): OmitHwbmode = {
    val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitHwbmode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OmitHwbmode] (val x: Self) extends AnyVal {
    
    inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    inline def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
    
    inline def setB(value: Double): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
    
    inline def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
    
    inline def setHUndefined: Self = StObject.set(x, "h", js.undefined)
    
    inline def setW(value: Double): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
  }
}
