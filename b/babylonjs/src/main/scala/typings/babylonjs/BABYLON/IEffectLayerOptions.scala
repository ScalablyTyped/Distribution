package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IEffectLayerOptions extends StObject {
  
  /**
    * Alpha blending mode used to apply the blur. Default depends of the implementation.
    */
  var alphaBlendingMode: Double = js.native
  
  /**
    * The camera attached to the layer.
    */
  var camera: Nullable[Camera] = js.native
  
  /**
    * Enforces a fixed size texture to ensure effect stability across devices.
    */
  var mainTextureFixedSize: js.UndefOr[Double] = js.native
  
  /**
    * Multiplication factor apply to the canvas size to compute the render target size
    * used to generated the objects (the smaller the faster).
    */
  var mainTextureRatio: Double = js.native
  
  /**
    * The rendering group to draw the layer in.
    */
  var renderingGroupId: Double = js.native
}
object IEffectLayerOptions {
  
  @scala.inline
  def apply(alphaBlendingMode: Double, mainTextureRatio: Double, renderingGroupId: Double): IEffectLayerOptions = {
    val __obj = js.Dynamic.literal(alphaBlendingMode = alphaBlendingMode.asInstanceOf[js.Any], mainTextureRatio = mainTextureRatio.asInstanceOf[js.Any], renderingGroupId = renderingGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEffectLayerOptions]
  }
  
  @scala.inline
  implicit class IEffectLayerOptionsMutableBuilder[Self <: IEffectLayerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlphaBlendingMode(value: Double): Self = StObject.set(x, "alphaBlendingMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCamera(value: Nullable[Camera]): Self = StObject.set(x, "camera", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCameraNull: Self = StObject.set(x, "camera", null)
    
    @scala.inline
    def setMainTextureFixedSize(value: Double): Self = StObject.set(x, "mainTextureFixedSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMainTextureFixedSizeUndefined: Self = StObject.set(x, "mainTextureFixedSize", js.undefined)
    
    @scala.inline
    def setMainTextureRatio(value: Double): Self = StObject.set(x, "mainTextureRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderingGroupId(value: Double): Self = StObject.set(x, "renderingGroupId", value.asInstanceOf[js.Any])
  }
}
