package typings.culori.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<culori.culori/src/jch/types.Jch, 'mode'> */
trait OmitJchmode extends StObject {
  
  var alpha: js.UndefOr[Double] = js.undefined
  
  var c: Double
  
  var h: js.UndefOr[Double] = js.undefined
  
  var j: Double
}
object OmitJchmode {
  
  inline def apply(c: Double, j: Double): OmitJchmode = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], j = j.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitJchmode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OmitJchmode] (val x: Self) extends AnyVal {
    
    inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    inline def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
    
    inline def setC(value: Double): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
    
    inline def setHUndefined: Self = StObject.set(x, "h", js.undefined)
    
    inline def setJ(value: Double): Self = StObject.set(x, "j", value.asInstanceOf[js.Any])
  }
}
