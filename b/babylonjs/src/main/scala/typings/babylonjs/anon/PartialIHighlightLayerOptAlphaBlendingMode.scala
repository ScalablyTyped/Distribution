package typings.babylonjs.anon

import typings.babylonjs.BABYLON.Camera
import typings.babylonjs.BABYLON.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<babylonjs.BABYLON.IHighlightLayerOptions> */
@js.native
trait PartialIHighlightLayerOptAlphaBlendingMode extends StObject {
  
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
  implicit class PartialIHighlightLayerOptAlphaBlendingModeMutableBuilder[Self <: PartialIHighlightLayerOptAlphaBlendingMode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlphaBlendingMode(value: Double): Self = StObject.set(x, "alphaBlendingMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlphaBlendingModeUndefined: Self = StObject.set(x, "alphaBlendingMode", js.undefined)
    
    @scala.inline
    def setBlurHorizontalSize(value: Double): Self = StObject.set(x, "blurHorizontalSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlurHorizontalSizeUndefined: Self = StObject.set(x, "blurHorizontalSize", js.undefined)
    
    @scala.inline
    def setBlurTextureSizeRatio(value: Double): Self = StObject.set(x, "blurTextureSizeRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlurTextureSizeRatioUndefined: Self = StObject.set(x, "blurTextureSizeRatio", js.undefined)
    
    @scala.inline
    def setBlurVerticalSize(value: Double): Self = StObject.set(x, "blurVerticalSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlurVerticalSizeUndefined: Self = StObject.set(x, "blurVerticalSize", js.undefined)
    
    @scala.inline
    def setCamera(value: Nullable[Camera]): Self = StObject.set(x, "camera", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCameraNull: Self = StObject.set(x, "camera", null)
    
    @scala.inline
    def setCameraUndefined: Self = StObject.set(x, "camera", js.undefined)
    
    @scala.inline
    def setIsStroke(value: Boolean): Self = StObject.set(x, "isStroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsStrokeUndefined: Self = StObject.set(x, "isStroke", js.undefined)
    
    @scala.inline
    def setMainTextureFixedSize(value: Double): Self = StObject.set(x, "mainTextureFixedSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMainTextureFixedSizeUndefined: Self = StObject.set(x, "mainTextureFixedSize", js.undefined)
    
    @scala.inline
    def setMainTextureRatio(value: Double): Self = StObject.set(x, "mainTextureRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMainTextureRatioUndefined: Self = StObject.set(x, "mainTextureRatio", js.undefined)
    
    @scala.inline
    def setRenderingGroupId(value: Double): Self = StObject.set(x, "renderingGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderingGroupIdUndefined: Self = StObject.set(x, "renderingGroupId", js.undefined)
  }
}
