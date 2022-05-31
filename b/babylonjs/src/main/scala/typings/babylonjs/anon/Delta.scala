package typings.babylonjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Delta extends StObject {
  
  var delta: js.UndefOr[Double] = js.undefined
  
  var facetNb: js.UndefOr[Double] = js.undefined
  
  var number: js.UndefOr[Double] = js.undefined
  
  var storage: js.UndefOr[js.Array[js.Any]] = js.undefined
}
object Delta {
  
  inline def apply(): Delta = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Delta]
  }
  
  extension [Self <: Delta](x: Self) {
    
    inline def setDelta(value: Double): Self = StObject.set(x, "delta", value.asInstanceOf[js.Any])
    
    inline def setDeltaUndefined: Self = StObject.set(x, "delta", js.undefined)
    
    inline def setFacetNb(value: Double): Self = StObject.set(x, "facetNb", value.asInstanceOf[js.Any])
    
    inline def setFacetNbUndefined: Self = StObject.set(x, "facetNb", js.undefined)
    
    inline def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
    
    inline def setStorage(value: js.Array[js.Any]): Self = StObject.set(x, "storage", value.asInstanceOf[js.Any])
    
    inline def setStorageUndefined: Self = StObject.set(x, "storage", js.undefined)
    
    inline def setStorageVarargs(value: js.Any*): Self = StObject.set(x, "storage", js.Array(value :_*))
  }
}
