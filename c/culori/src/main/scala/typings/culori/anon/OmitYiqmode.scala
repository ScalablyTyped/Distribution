package typings.culori.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<culori.culori/src/yiq/types.Yiq, 'mode'> */
trait OmitYiqmode extends StObject {
  
  var alpha: js.UndefOr[Double] = js.undefined
  
  var i: Double
  
  var q: Double
  
  var y: Double
}
object OmitYiqmode {
  
  inline def apply(i: Double, q: Double, y: Double): OmitYiqmode = {
    val __obj = js.Dynamic.literal(i = i.asInstanceOf[js.Any], q = q.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitYiqmode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OmitYiqmode] (val x: Self) extends AnyVal {
    
    inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    inline def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
    
    inline def setI(value: Double): Self = StObject.set(x, "i", value.asInstanceOf[js.Any])
    
    inline def setQ(value: Double): Self = StObject.set(x, "q", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
