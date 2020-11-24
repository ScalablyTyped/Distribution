package typings.babylonjs.highlightLayerMod

import typings.babylonjs.cameraMod.Camera
import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IHighlightLayerOptions extends js.Object {
  
  /**
    * Alpha blending mode used to apply the blur. Default is combine.
    */
  var alphaBlendingMode: Double = js.native
  
  /**
    * How big in texel of the blur texture is the horizontal blur.
    */
  var blurHorizontalSize: Double = js.native
  
  /**
    * Multiplication factor apply to the main texture size in the first step of the blur to reduce the size
    * of the picture to blur (the smaller the faster).
    */
  var blurTextureSizeRatio: Double = js.native
  
  /**
    * How big in texel of the blur texture is the vertical blur.
    */
  var blurVerticalSize: Double = js.native
  
  /**
    * The camera attached to the layer.
    */
  var camera: Nullable[Camera] = js.native
  
  /**
    * Should we display highlight as a solid stroke?
    */
  var isStroke: js.UndefOr[Boolean] = js.native
  
  /**
    * Enforces a fixed size texture to ensure resize independant blur.
    */
  var mainTextureFixedSize: js.UndefOr[Double] = js.native
  
  /**
    * Multiplication factor apply to the canvas size to compute the render target size
    * used to generated the glowing objects (the smaller the faster).
    */
  var mainTextureRatio: Double = js.native
  
  /**
    * The rendering group to draw the layer in.
    */
  var renderingGroupId: Double = js.native
}
object IHighlightLayerOptions {
  
  @scala.inline
  def apply(
    alphaBlendingMode: Double,
    blurHorizontalSize: Double,
    blurTextureSizeRatio: Double,
    blurVerticalSize: Double,
    mainTextureRatio: Double,
    renderingGroupId: Double
  ): IHighlightLayerOptions = {
    val __obj = js.Dynamic.literal(alphaBlendingMode = alphaBlendingMode.asInstanceOf[js.Any], blurHorizontalSize = blurHorizontalSize.asInstanceOf[js.Any], blurTextureSizeRatio = blurTextureSizeRatio.asInstanceOf[js.Any], blurVerticalSize = blurVerticalSize.asInstanceOf[js.Any], mainTextureRatio = mainTextureRatio.asInstanceOf[js.Any], renderingGroupId = renderingGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHighlightLayerOptions]
  }
  
  @scala.inline
  implicit class IHighlightLayerOptionsOps[Self <: IHighlightLayerOptions] (val x: Self) extends AnyVal {
    
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
    def setBlurHorizontalSize(value: Double): Self = this.set("blurHorizontalSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlurTextureSizeRatio(value: Double): Self = this.set("blurTextureSizeRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlurVerticalSize(value: Double): Self = this.set("blurVerticalSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMainTextureRatio(value: Double): Self = this.set("mainTextureRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderingGroupId(value: Double): Self = this.set("renderingGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCamera(value: Nullable[Camera]): Self = this.set("camera", value.asInstanceOf[js.Any])
    
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
  }
}
