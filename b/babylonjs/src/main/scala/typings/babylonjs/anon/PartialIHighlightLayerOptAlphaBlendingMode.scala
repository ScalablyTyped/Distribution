package typings.babylonjs.anon

import typings.babylonjs.BABYLON.Camera
import typings.babylonjs.BABYLON.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<babylonjs.BABYLON.IHighlightLayerOptions> */
@js.native
trait PartialIHighlightLayerOptAlphaBlendingMode extends js.Object {
  
  var alphaBlendingMode: js.UndefOr[Double] = js.native
  
  var blurHorizontalSize: js.UndefOr[Double] = js.native
  
  var blurTextureSizeRatio: js.UndefOr[Double] = js.native
  
  var blurVerticalSize: js.UndefOr[Double] = js.native
  
  var camera: js.UndefOr[Nullable[Camera]] = js.native
  
  var isStroke: js.UndefOr[Boolean] = js.native
  
  var mainTextureFixedSize: js.UndefOr[Double] = js.native
  
  var mainTextureRatio: js.UndefOr[Double] = js.native
  
  var renderingGroupId: js.UndefOr[Double] = js.native
}
object PartialIHighlightLayerOptAlphaBlendingMode {
  
  @scala.inline
  def apply(): PartialIHighlightLayerOptAlphaBlendingMode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialIHighlightLayerOptAlphaBlendingMode]
  }
  
  @scala.inline
  implicit class PartialIHighlightLayerOptAlphaBlendingModeOps[Self <: PartialIHighlightLayerOptAlphaBlendingMode] (val x: Self) extends AnyVal {
    
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
    def setBlurHorizontalSize(value: Double): Self = this.set("blurHorizontalSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlurHorizontalSize: Self = this.set("blurHorizontalSize", js.undefined)
    
    @scala.inline
    def setBlurTextureSizeRatio(value: Double): Self = this.set("blurTextureSizeRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlurTextureSizeRatio: Self = this.set("blurTextureSizeRatio", js.undefined)
    
    @scala.inline
    def setBlurVerticalSize(value: Double): Self = this.set("blurVerticalSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlurVerticalSize: Self = this.set("blurVerticalSize", js.undefined)
    
    @scala.inline
    def setCamera(value: Nullable[Camera]): Self = this.set("camera", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCamera: Self = this.set("camera", js.undefined)
    
    @scala.inline
    def setCameraNull: Self = this.set("camera", null)
    
    @scala.inline
    def setIsStroke(value: Boolean): Self = this.set("isStroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsStroke: Self = this.set("isStroke", js.undefined)
    
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
