package typings.cesium.anon

import typings.cesium.mod.MaterialAppearance.MaterialSupport
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FaceForward extends js.Object {
  
  var closed: js.UndefOr[Boolean] = js.native
  
  var faceForward: js.UndefOr[Boolean] = js.native
  
  var flat: js.UndefOr[Boolean] = js.native
  
  var fragmentShaderSource: js.UndefOr[String] = js.native
  
  var material: js.UndefOr[typings.cesium.mod.Material] = js.native
  
  var materialSupport: js.UndefOr[MaterialSupport] = js.native
  
  var renderState: js.UndefOr[typings.cesium.mod.RenderState] = js.native
  
  var translucent: js.UndefOr[Boolean] = js.native
  
  var vertexShaderSource: js.UndefOr[String] = js.native
}
object FaceForward {
  
  @scala.inline
  def apply(): FaceForward = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FaceForward]
  }
  
  @scala.inline
  implicit class FaceForwardOps[Self <: FaceForward] (val x: Self) extends AnyVal {
    
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
    def setClosed(value: Boolean): Self = this.set("closed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClosed: Self = this.set("closed", js.undefined)
    
    @scala.inline
    def setFaceForward(value: Boolean): Self = this.set("faceForward", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFaceForward: Self = this.set("faceForward", js.undefined)
    
    @scala.inline
    def setFlat(value: Boolean): Self = this.set("flat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlat: Self = this.set("flat", js.undefined)
    
    @scala.inline
    def setFragmentShaderSource(value: String): Self = this.set("fragmentShaderSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFragmentShaderSource: Self = this.set("fragmentShaderSource", js.undefined)
    
    @scala.inline
    def setMaterial(value: typings.cesium.mod.Material): Self = this.set("material", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaterial: Self = this.set("material", js.undefined)
    
    @scala.inline
    def setMaterialSupport(value: MaterialSupport): Self = this.set("materialSupport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaterialSupport: Self = this.set("materialSupport", js.undefined)
    
    @scala.inline
    def setRenderState(value: typings.cesium.mod.RenderState): Self = this.set("renderState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderState: Self = this.set("renderState", js.undefined)
    
    @scala.inline
    def setTranslucent(value: Boolean): Self = this.set("translucent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTranslucent: Self = this.set("translucent", js.undefined)
    
    @scala.inline
    def setVertexShaderSource(value: String): Self = this.set("vertexShaderSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVertexShaderSource: Self = this.set("vertexShaderSource", js.undefined)
  }
}
