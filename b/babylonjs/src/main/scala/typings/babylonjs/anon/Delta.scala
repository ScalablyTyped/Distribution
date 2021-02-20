package typings.babylonjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Delta extends StObject {
  
  var delta: js.UndefOr[Double] = js.native
  
  var facetNb: js.UndefOr[Double] = js.native
  
  var number: js.UndefOr[Double] = js.native
  
  var storage: js.UndefOr[js.Array[js.Any]] = js.native
}
object Delta {
  
  @scala.inline
  def apply(): Delta = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Delta]
  }
  
  @scala.inline
  implicit class DeltaMutableBuilder[Self <: Delta] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDelta(value: Double): Self = StObject.set(x, "delta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeltaUndefined: Self = StObject.set(x, "delta", js.undefined)
    
    @scala.inline
    def setFacetNb(value: Double): Self = StObject.set(x, "facetNb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFacetNbUndefined: Self = StObject.set(x, "facetNb", js.undefined)
    
    @scala.inline
    def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
    
    @scala.inline
    def setStorage(value: js.Array[js.Any]): Self = StObject.set(x, "storage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageUndefined: Self = StObject.set(x, "storage", js.undefined)
    
    @scala.inline
    def setStorageVarargs(value: js.Any*): Self = StObject.set(x, "storage", js.Array(value :_*))
  }
}
