package typings.culori.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<culori.culori/src/dlch/types.Dlch, 'mode'> */
trait OmitDlchmode extends StObject {
  
  var alpha: js.UndefOr[Double] = js.undefined
  
  var c: Double
  
  var h: js.UndefOr[Double] = js.undefined
  
  var l: Double
}
object OmitDlchmode {
  
  inline def apply(c: Double, l: Double): OmitDlchmode = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], l = l.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitDlchmode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OmitDlchmode] (val x: Self) extends AnyVal {
    
    inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    inline def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
    
    inline def setC(value: Double): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
    
    inline def setHUndefined: Self = StObject.set(x, "h", js.undefined)
    
    inline def setL(value: Double): Self = StObject.set(x, "l", value.asInstanceOf[js.Any])
  }
}
