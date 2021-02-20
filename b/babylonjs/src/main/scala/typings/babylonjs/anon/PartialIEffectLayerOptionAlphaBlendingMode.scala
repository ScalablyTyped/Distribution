package typings.babylonjs.anon

import typings.babylonjs.BABYLON.Camera
import typings.babylonjs.BABYLON.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<babylonjs.BABYLON.IEffectLayerOptions> */
@js.native
trait PartialIEffectLayerOptionAlphaBlendingMode extends StObject {
  
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
  implicit class PartialIEffectLayerOptionAlphaBlendingModeMutableBuilder[Self <: PartialIEffectLayerOptionAlphaBlendingMode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlphaBlendingMode(value: Double): Self = StObject.set(x, "alphaBlendingMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlphaBlendingModeUndefined: Self = StObject.set(x, "alphaBlendingMode", js.undefined)
    
    @scala.inline
    def setCamera(value: Nullable[Camera]): Self = StObject.set(x, "camera", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCameraNull: Self = StObject.set(x, "camera", null)
    
    @scala.inline
    def setCameraUndefined: Self = StObject.set(x, "camera", js.undefined)
    
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
