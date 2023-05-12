package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IEffectLayerOptions extends StObject {
  
  /**
    * Alpha blending mode used to apply the blur. Default depends of the implementation. Default: ALPHA_COMBINE
    */
  var alphaBlendingMode: Double
  
  /**
    * The camera attached to the layer. Default: null
    */
  var camera: Nullable[Camera]
  
  /**
    * Enforces a fixed size texture to ensure effect stability across devices. Default: undefined
    */
  var mainTextureFixedSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Multiplication factor apply to the canvas size to compute the render target size
    * used to generated the objects (the smaller the faster). Default: 0.5
    */
  var mainTextureRatio: Double
  
  /**
    * The type of the main texture. Default: TEXTURETYPE_UNSIGNED_INT
    */
  var mainTextureType: Double
  
  /**
    * The rendering group to draw the layer in. Default: -1
    */
  var renderingGroupId: Double
}
object IEffectLayerOptions {
  
  inline def apply(
    alphaBlendingMode: Double,
    mainTextureRatio: Double,
    mainTextureType: Double,
    renderingGroupId: Double
  ): IEffectLayerOptions = {
    val __obj = js.Dynamic.literal(alphaBlendingMode = alphaBlendingMode.asInstanceOf[js.Any], mainTextureRatio = mainTextureRatio.asInstanceOf[js.Any], mainTextureType = mainTextureType.asInstanceOf[js.Any], renderingGroupId = renderingGroupId.asInstanceOf[js.Any], camera = null)
    __obj.asInstanceOf[IEffectLayerOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IEffectLayerOptions] (val x: Self) extends AnyVal {
    
    inline def setAlphaBlendingMode(value: Double): Self = StObject.set(x, "alphaBlendingMode", value.asInstanceOf[js.Any])
    
    inline def setCamera(value: Nullable[Camera]): Self = StObject.set(x, "camera", value.asInstanceOf[js.Any])
    
    inline def setCameraNull: Self = StObject.set(x, "camera", null)
    
    inline def setMainTextureFixedSize(value: Double): Self = StObject.set(x, "mainTextureFixedSize", value.asInstanceOf[js.Any])
    
    inline def setMainTextureFixedSizeUndefined: Self = StObject.set(x, "mainTextureFixedSize", js.undefined)
    
    inline def setMainTextureRatio(value: Double): Self = StObject.set(x, "mainTextureRatio", value.asInstanceOf[js.Any])
    
    inline def setMainTextureType(value: Double): Self = StObject.set(x, "mainTextureType", value.asInstanceOf[js.Any])
    
    inline def setRenderingGroupId(value: Double): Self = StObject.set(x, "renderingGroupId", value.asInstanceOf[js.Any])
  }
}
