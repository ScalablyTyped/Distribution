package typings.culori.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<culori.culori/src/luv/types.Luv, 'mode'> */
trait OmitLuvmode extends StObject {
  
  var alpha: js.UndefOr[Double] = js.undefined
  
  var l: Double
  
  var u: Double
  
  var v: Double
}
object OmitLuvmode {
  
  inline def apply(l: Double, u: Double, v: Double): OmitLuvmode = {
    val __obj = js.Dynamic.literal(l = l.asInstanceOf[js.Any], u = u.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitLuvmode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OmitLuvmode] (val x: Self) extends AnyVal {
    
    inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    inline def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
    
    inline def setL(value: Double): Self = StObject.set(x, "l", value.asInstanceOf[js.Any])
    
    inline def setU(value: Double): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
    
    inline def setV(value: Double): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
  }
}
