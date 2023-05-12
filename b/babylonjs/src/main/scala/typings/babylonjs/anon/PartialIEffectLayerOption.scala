package typings.babylonjs.anon

import typings.babylonjs.camerasCameraMod.Camera
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<babylonjs.babylonjs/Layers/effectLayer.IEffectLayerOptions> */
trait PartialIEffectLayerOption extends StObject {
  
  var alphaBlendingMode: js.UndefOr[Double] = js.undefined
  
  var camera: js.UndefOr[Nullable[Camera]] = js.undefined
  
  var mainTextureFixedSize: js.UndefOr[Double] = js.undefined
  
  var mainTextureRatio: js.UndefOr[Double] = js.undefined
  
  var mainTextureType: js.UndefOr[Double] = js.undefined
  
  var renderingGroupId: js.UndefOr[Double] = js.undefined
}
object PartialIEffectLayerOption {
  
  inline def apply(): PartialIEffectLayerOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialIEffectLayerOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialIEffectLayerOption] (val x: Self) extends AnyVal {
    
    inline def setAlphaBlendingMode(value: Double): Self = StObject.set(x, "alphaBlendingMode", value.asInstanceOf[js.Any])
    
    inline def setAlphaBlendingModeUndefined: Self = StObject.set(x, "alphaBlendingMode", js.undefined)
    
    inline def setCamera(value: Nullable[Camera]): Self = StObject.set(x, "camera", value.asInstanceOf[js.Any])
    
    inline def setCameraNull: Self = StObject.set(x, "camera", null)
    
    inline def setCameraUndefined: Self = StObject.set(x, "camera", js.undefined)
    
    inline def setMainTextureFixedSize(value: Double): Self = StObject.set(x, "mainTextureFixedSize", value.asInstanceOf[js.Any])
    
    inline def setMainTextureFixedSizeUndefined: Self = StObject.set(x, "mainTextureFixedSize", js.undefined)
    
    inline def setMainTextureRatio(value: Double): Self = StObject.set(x, "mainTextureRatio", value.asInstanceOf[js.Any])
    
    inline def setMainTextureRatioUndefined: Self = StObject.set(x, "mainTextureRatio", js.undefined)
    
    inline def setMainTextureType(value: Double): Self = StObject.set(x, "mainTextureType", value.asInstanceOf[js.Any])
    
    inline def setMainTextureTypeUndefined: Self = StObject.set(x, "mainTextureType", js.undefined)
    
    inline def setRenderingGroupId(value: Double): Self = StObject.set(x, "renderingGroupId", value.asInstanceOf[js.Any])
    
    inline def setRenderingGroupIdUndefined: Self = StObject.set(x, "renderingGroupId", js.undefined)
  }
}
