package typings.babylonjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FacetNb extends StObject {
  
  var delta: js.UndefOr[Double] = js.undefined
  
  var facetNb: js.UndefOr[Double] = js.undefined
  
  var number: js.UndefOr[Double] = js.undefined
  
  var storage: js.UndefOr[js.Array[Any]] = js.undefined
}
object FacetNb {
  
  inline def apply(): FacetNb = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FacetNb]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FacetNb] (val x: Self) extends AnyVal {
    
    inline def setDelta(value: Double): Self = StObject.set(x, "delta", value.asInstanceOf[js.Any])
    
    inline def setDeltaUndefined: Self = StObject.set(x, "delta", js.undefined)
    
    inline def setFacetNb(value: Double): Self = StObject.set(x, "facetNb", value.asInstanceOf[js.Any])
    
    inline def setFacetNbUndefined: Self = StObject.set(x, "facetNb", js.undefined)
    
    inline def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
    
    inline def setStorage(value: js.Array[Any]): Self = StObject.set(x, "storage", value.asInstanceOf[js.Any])
    
    inline def setStorageUndefined: Self = StObject.set(x, "storage", js.undefined)
    
    inline def setStorageVarargs(value: Any*): Self = StObject.set(x, "storage", js.Array(value*))
  }
}
