package typings.culori.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<culori.culori/src/lab/types.Lab, 'mode'> */
trait OmitLabmode extends StObject {
  
  var a: Double
  
  var alpha: js.UndefOr[Double] = js.undefined
  
  var b: Double
  
  var l: Double
}
object OmitLabmode {
  
  inline def apply(a: Double, b: Double, l: Double): OmitLabmode = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], l = l.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitLabmode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OmitLabmode] (val x: Self) extends AnyVal {
    
    inline def setA(value: Double): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    inline def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
    
    inline def setB(value: Double): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
    
    inline def setL(value: Double): Self = StObject.set(x, "l", value.asInstanceOf[js.Any])
  }
}
