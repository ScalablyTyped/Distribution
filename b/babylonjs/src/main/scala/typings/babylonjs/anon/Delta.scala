package typings.babylonjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Delta extends js.Object {
  
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
  implicit class DeltaOps[Self <: Delta] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDelta(value: Double): Self = this.set("delta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelta: Self = this.set("delta", js.undefined)
    
    @scala.inline
    def setFacetNb(value: Double): Self = this.set("facetNb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFacetNb: Self = this.set("facetNb", js.undefined)
    
    @scala.inline
    def setNumber(value: Double): Self = this.set("number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumber: Self = this.set("number", js.undefined)
    
    @scala.inline
    def setStorageVarargs(value: js.Any*): Self = this.set("storage", js.Array(value :_*))
    
    @scala.inline
    def setStorage(value: js.Array[js.Any]): Self = this.set("storage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStorage: Self = this.set("storage", js.undefined)
  }
}
