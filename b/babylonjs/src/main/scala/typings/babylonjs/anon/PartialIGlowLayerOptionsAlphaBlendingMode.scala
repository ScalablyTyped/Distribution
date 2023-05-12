package typings.babylonjs.anon

import typings.babylonjs.BABYLON.Camera
import typings.babylonjs.BABYLON.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<babylonjs.BABYLON.IGlowLayerOptions> */
trait PartialIGlowLayerOptionsAlphaBlendingMode extends StObject {
  
  var alphaBlendingMode: js.UndefOr[Double] = js.undefined
  
  var blurKernelSize: js.UndefOr[Double] = js.undefined
  
  var camera: js.UndefOr[Nullable[Camera]] = js.undefined
  
  var ldrMerge: js.UndefOr[Boolean] = js.undefined
  
  var mainTextureFixedSize: js.UndefOr[Double] = js.undefined
  
  var mainTextureRatio: js.UndefOr[Double] = js.undefined
  
  var mainTextureSamples: js.UndefOr[Double] = js.undefined
  
  var mainTextureType: js.UndefOr[Double] = js.undefined
  
  var renderingGroupId: js.UndefOr[Double] = js.undefined
}
object PartialIGlowLayerOptionsAlphaBlendingMode {
  
  inline def apply(): PartialIGlowLayerOptionsAlphaBlendingMode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialIGlowLayerOptionsAlphaBlendingMode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialIGlowLayerOptionsAlphaBlendingMode] (val x: Self) extends AnyVal {
    
    inline def setAlphaBlendingMode(value: Double): Self = StObject.set(x, "alphaBlendingMode", value.asInstanceOf[js.Any])
    
    inline def setAlphaBlendingModeUndefined: Self = StObject.set(x, "alphaBlendingMode", js.undefined)
    
    inline def setBlurKernelSize(value: Double): Self = StObject.set(x, "blurKernelSize", value.asInstanceOf[js.Any])
    
    inline def setBlurKernelSizeUndefined: Self = StObject.set(x, "blurKernelSize", js.undefined)
    
    inline def setCamera(value: Nullable[Camera]): Self = StObject.set(x, "camera", value.asInstanceOf[js.Any])
    
    inline def setCameraNull: Self = StObject.set(x, "camera", null)
    
    inline def setCameraUndefined: Self = StObject.set(x, "camera", js.undefined)
    
    inline def setLdrMerge(value: Boolean): Self = StObject.set(x, "ldrMerge", value.asInstanceOf[js.Any])
    
    inline def setLdrMergeUndefined: Self = StObject.set(x, "ldrMerge", js.undefined)
    
    inline def setMainTextureFixedSize(value: Double): Self = StObject.set(x, "mainTextureFixedSize", value.asInstanceOf[js.Any])
    
    inline def setMainTextureFixedSizeUndefined: Self = StObject.set(x, "mainTextureFixedSize", js.undefined)
    
    inline def setMainTextureRatio(value: Double): Self = StObject.set(x, "mainTextureRatio", value.asInstanceOf[js.Any])
    
    inline def setMainTextureRatioUndefined: Self = StObject.set(x, "mainTextureRatio", js.undefined)
    
    inline def setMainTextureSamples(value: Double): Self = StObject.set(x, "mainTextureSamples", value.asInstanceOf[js.Any])
    
    inline def setMainTextureSamplesUndefined: Self = StObject.set(x, "mainTextureSamples", js.undefined)
    
    inline def setMainTextureType(value: Double): Self = StObject.set(x, "mainTextureType", value.asInstanceOf[js.Any])
    
    inline def setMainTextureTypeUndefined: Self = StObject.set(x, "mainTextureType", js.undefined)
    
    inline def setRenderingGroupId(value: Double): Self = StObject.set(x, "renderingGroupId", value.asInstanceOf[js.Any])
    
    inline def setRenderingGroupIdUndefined: Self = StObject.set(x, "renderingGroupId", js.undefined)
  }
}
