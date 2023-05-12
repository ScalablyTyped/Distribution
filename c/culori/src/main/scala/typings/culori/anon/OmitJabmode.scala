package typings.culori.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<culori.culori/src/jab/types.Jab, 'mode'> */
trait OmitJabmode extends StObject {
  
  var a: Double
  
  var alpha: js.UndefOr[Double] = js.undefined
  
  var b: Double
  
  var j: Double
}
object OmitJabmode {
  
  inline def apply(a: Double, b: Double, j: Double): OmitJabmode = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], j = j.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitJabmode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OmitJabmode] (val x: Self) extends AnyVal {
    
    inline def setA(value: Double): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    inline def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
    
    inline def setB(value: Double): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
    
    inline def setJ(value: Double): Self = StObject.set(x, "j", value.asInstanceOf[js.Any])
  }
}
