package typings.babylonjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Subdivisions extends js.Object {
  
  var height: js.UndefOr[Double] = js.native
  
  var subdivisions: js.UndefOr[Double] = js.native
  
  var subdivisionsX: js.UndefOr[Double] = js.native
  
  var subdivisionsY: js.UndefOr[Double] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object Subdivisions {
  
  @scala.inline
  def apply(): Subdivisions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Subdivisions]
  }
  
  @scala.inline
  implicit class SubdivisionsOps[Self <: Subdivisions] (val x: Self) extends AnyVal {
    
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
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setSubdivisions(value: Double): Self = this.set("subdivisions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubdivisions: Self = this.set("subdivisions", js.undefined)
    
    @scala.inline
    def setSubdivisionsX(value: Double): Self = this.set("subdivisionsX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubdivisionsX: Self = this.set("subdivisionsX", js.undefined)
    
    @scala.inline
    def setSubdivisionsY(value: Double): Self = this.set("subdivisionsY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubdivisionsY: Self = this.set("subdivisionsY", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
