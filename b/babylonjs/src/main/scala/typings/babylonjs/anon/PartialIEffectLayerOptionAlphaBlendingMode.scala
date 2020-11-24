package typings.babylonjs.anon

import typings.babylonjs.BABYLON.Camera
import typings.babylonjs.BABYLON.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<babylonjs.BABYLON.IEffectLayerOptions> */
@js.native
trait PartialIEffectLayerOptionAlphaBlendingMode extends js.Object {
  
  var alphaBlendingMode: js.UndefOr[Double] = js.native
  
  var camera: js.UndefOr[Nullable[Camera]] = js.native
  
  var mainTextureFixedSize: js.UndefOr[Double] = js.native
  
  var mainTextureRatio: js.UndefOr[Double] = js.native
  
  var renderingGroupId: js.UndefOr[Double] = js.native
}
object PartialIEffectLayerOptionAlphaBlendingMode {
  
  @scala.inline
  def apply(): PartialIEffectLayerOptionAlphaBlendingMode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialIEffectLayerOptionAlphaBlendingMode]
  }
  
  @scala.inline
  implicit class PartialIEffectLayerOptionAlphaBlendingModeOps[Self <: PartialIEffectLayerOptionAlphaBlendingMode] (val x: Self) extends AnyVal {
    
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
    def setAlphaBlendingMode(value: Double): Self = this.set("alphaBlendingMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlphaBlendingMode: Self = this.set("alphaBlendingMode", js.undefined)
    
    @scala.inline
    def setCamera(value: Nullable[Camera]): Self = this.set("camera", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCamera: Self = this.set("camera", js.undefined)
    
    @scala.inline
    def setCameraNull: Self = this.set("camera", null)
    
    @scala.inline
    def setMainTextureFixedSize(value: Double): Self = this.set("mainTextureFixedSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMainTextureFixedSize: Self = this.set("mainTextureFixedSize", js.undefined)
    
    @scala.inline
    def setMainTextureRatio(value: Double): Self = this.set("mainTextureRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMainTextureRatio: Self = this.set("mainTextureRatio", js.undefined)
    
    @scala.inline
    def setRenderingGroupId(value: Double): Self = this.set("renderingGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderingGroupId: Self = this.set("renderingGroupId", js.undefined)
  }
}
