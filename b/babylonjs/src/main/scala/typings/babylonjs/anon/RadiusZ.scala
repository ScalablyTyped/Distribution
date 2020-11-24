package typings.babylonjs.anon

import typings.babylonjs.BABYLON.Vector4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RadiusZ extends js.Object {
  
  var backUVs: js.UndefOr[Vector4] = js.native
  
  var flat: js.UndefOr[Boolean] = js.native
  
  var frontUVs: js.UndefOr[Vector4] = js.native
  
  var radius: js.UndefOr[Double] = js.native
  
  var radiusX: js.UndefOr[Double] = js.native
  
  var radiusY: js.UndefOr[Double] = js.native
  
  var radiusZ: js.UndefOr[Double] = js.native
  
  var sideOrientation: js.UndefOr[Double] = js.native
  
  var subdivisions: js.UndefOr[Double] = js.native
}
object RadiusZ {
  
  @scala.inline
  def apply(): RadiusZ = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RadiusZ]
  }
  
  @scala.inline
  implicit class RadiusZOps[Self <: RadiusZ] (val x: Self) extends AnyVal {
    
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
    def setBackUVs(value: Vector4): Self = this.set("backUVs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackUVs: Self = this.set("backUVs", js.undefined)
    
    @scala.inline
    def setFlat(value: Boolean): Self = this.set("flat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlat: Self = this.set("flat", js.undefined)
    
    @scala.inline
    def setFrontUVs(value: Vector4): Self = this.set("frontUVs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrontUVs: Self = this.set("frontUVs", js.undefined)
    
    @scala.inline
    def setRadius(value: Double): Self = this.set("radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRadius: Self = this.set("radius", js.undefined)
    
    @scala.inline
    def setRadiusX(value: Double): Self = this.set("radiusX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRadiusX: Self = this.set("radiusX", js.undefined)
    
    @scala.inline
    def setRadiusY(value: Double): Self = this.set("radiusY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRadiusY: Self = this.set("radiusY", js.undefined)
    
    @scala.inline
    def setRadiusZ(value: Double): Self = this.set("radiusZ", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRadiusZ: Self = this.set("radiusZ", js.undefined)
    
    @scala.inline
    def setSideOrientation(value: Double): Self = this.set("sideOrientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSideOrientation: Self = this.set("sideOrientation", js.undefined)
    
    @scala.inline
    def setSubdivisions(value: Double): Self = this.set("subdivisions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubdivisions: Self = this.set("subdivisions", js.undefined)
  }
}
