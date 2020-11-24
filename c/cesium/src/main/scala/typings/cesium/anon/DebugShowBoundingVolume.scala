package typings.cesium.anon

import typings.cesium.mod.Cartesian3
import typings.cesium.mod.Matrix4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DebugShowBoundingVolume extends js.Object {
  
  var center: js.UndefOr[Cartesian3] = js.native
  
  var debugShowBoundingVolume: js.UndefOr[Boolean] = js.native
  
  var id: js.UndefOr[js.Any] = js.native
  
  var material: js.UndefOr[typings.cesium.mod.Material] = js.native
  
  var modelMatrix: js.UndefOr[Matrix4] = js.native
  
  var radii: js.UndefOr[Cartesian3] = js.native
  
  var show: js.UndefOr[Boolean] = js.native
}
object DebugShowBoundingVolume {
  
  @scala.inline
  def apply(): DebugShowBoundingVolume = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DebugShowBoundingVolume]
  }
  
  @scala.inline
  implicit class DebugShowBoundingVolumeOps[Self <: DebugShowBoundingVolume] (val x: Self) extends AnyVal {
    
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
    def setCenter(value: Cartesian3): Self = this.set("center", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCenter: Self = this.set("center", js.undefined)
    
    @scala.inline
    def setDebugShowBoundingVolume(value: Boolean): Self = this.set("debugShowBoundingVolume", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebugShowBoundingVolume: Self = this.set("debugShowBoundingVolume", js.undefined)
    
    @scala.inline
    def setId(value: js.Any): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setMaterial(value: typings.cesium.mod.Material): Self = this.set("material", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaterial: Self = this.set("material", js.undefined)
    
    @scala.inline
    def setModelMatrix(value: Matrix4): Self = this.set("modelMatrix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModelMatrix: Self = this.set("modelMatrix", js.undefined)
    
    @scala.inline
    def setRadii(value: Cartesian3): Self = this.set("radii", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRadii: Self = this.set("radii", js.undefined)
    
    @scala.inline
    def setShow(value: Boolean): Self = this.set("show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShow: Self = this.set("show", js.undefined)
  }
}
