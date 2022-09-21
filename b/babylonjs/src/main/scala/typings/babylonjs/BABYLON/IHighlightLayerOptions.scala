package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IHighlightLayerOptions extends StObject {
  
  /**
    * Alpha blending mode used to apply the blur. Default is combine.
    */
  var alphaBlendingMode: Double
  
  /**
    * How big in texel of the blur texture is the horizontal blur.
    */
  var blurHorizontalSize: Double
  
  /**
    * Multiplication factor apply to the main texture size in the first step of the blur to reduce the size
    * of the picture to blur (the smaller the faster).
    */
  var blurTextureSizeRatio: Double
  
  /**
    * How big in texel of the blur texture is the vertical blur.
    */
  var blurVerticalSize: Double
  
  /**
    * The camera attached to the layer.
    */
  var camera: Nullable[Camera]
  
  /**
    * Should we display highlight as a solid stroke?
    */
  var isStroke: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Enforces a fixed size texture to ensure resize independent blur.
    */
  var mainTextureFixedSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Multiplication factor apply to the canvas size to compute the render target size
    * used to generated the glowing objects (the smaller the faster).
    */
  var mainTextureRatio: Double
  
  /**
    * The rendering group to draw the layer in.
    */
  var renderingGroupId: Double
}
object IHighlightLayerOptions {
  
  inline def apply(
    alphaBlendingMode: Double,
    blurHorizontalSize: Double,
    blurTextureSizeRatio: Double,
    blurVerticalSize: Double,
    mainTextureRatio: Double,
    renderingGroupId: Double
  ): IHighlightLayerOptions = {
    val __obj = js.Dynamic.literal(alphaBlendingMode = alphaBlendingMode.asInstanceOf[js.Any], blurHorizontalSize = blurHorizontalSize.asInstanceOf[js.Any], blurTextureSizeRatio = blurTextureSizeRatio.asInstanceOf[js.Any], blurVerticalSize = blurVerticalSize.asInstanceOf[js.Any], mainTextureRatio = mainTextureRatio.asInstanceOf[js.Any], renderingGroupId = renderingGroupId.asInstanceOf[js.Any], camera = null)
    __obj.asInstanceOf[IHighlightLayerOptions]
  }
  
  extension [Self <: IHighlightLayerOptions](x: Self) {
    
    inline def setAlphaBlendingMode(value: Double): Self = StObject.set(x, "alphaBlendingMode", value.asInstanceOf[js.Any])
    
    inline def setBlurHorizontalSize(value: Double): Self = StObject.set(x, "blurHorizontalSize", value.asInstanceOf[js.Any])
    
    inline def setBlurTextureSizeRatio(value: Double): Self = StObject.set(x, "blurTextureSizeRatio", value.asInstanceOf[js.Any])
    
    inline def setBlurVerticalSize(value: Double): Self = StObject.set(x, "blurVerticalSize", value.asInstanceOf[js.Any])
    
    inline def setCamera(value: Nullable[Camera]): Self = StObject.set(x, "camera", value.asInstanceOf[js.Any])
    
    inline def setCameraNull: Self = StObject.set(x, "camera", null)
    
    inline def setIsStroke(value: Boolean): Self = StObject.set(x, "isStroke", value.asInstanceOf[js.Any])
    
    inline def setIsStrokeUndefined: Self = StObject.set(x, "isStroke", js.undefined)
    
    inline def setMainTextureFixedSize(value: Double): Self = StObject.set(x, "mainTextureFixedSize", value.asInstanceOf[js.Any])
    
    inline def setMainTextureFixedSizeUndefined: Self = StObject.set(x, "mainTextureFixedSize", js.undefined)
    
    inline def setMainTextureRatio(value: Double): Self = StObject.set(x, "mainTextureRatio", value.asInstanceOf[js.Any])
    
    inline def setRenderingGroupId(value: Double): Self = StObject.set(x, "renderingGroupId", value.asInstanceOf[js.Any])
  }
}
