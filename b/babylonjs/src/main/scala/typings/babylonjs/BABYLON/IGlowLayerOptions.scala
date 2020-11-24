package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IGlowLayerOptions extends js.Object {
  
  /**
    * How big is the kernel of the blur texture.
    */
  var blurKernelSize: Double = js.native
  
  /**
    * The camera attached to the layer.
    */
  var camera: Nullable[Camera] = js.native
  
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
    * Enable MSAA by chosing the number of samples.
    */
  var mainTextureSamples: js.UndefOr[Double] = js.native
  
  /**
    * The rendering group to draw the layer in.
    */
  var renderingGroupId: Double = js.native
}
object IGlowLayerOptions {
  
  @scala.inline
  def apply(blurKernelSize: Double, mainTextureRatio: Double, renderingGroupId: Double): IGlowLayerOptions = {
    val __obj = js.Dynamic.literal(blurKernelSize = blurKernelSize.asInstanceOf[js.Any], mainTextureRatio = mainTextureRatio.asInstanceOf[js.Any], renderingGroupId = renderingGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGlowLayerOptions]
  }
  
  @scala.inline
  implicit class IGlowLayerOptionsOps[Self <: IGlowLayerOptions] (val x: Self) extends AnyVal {
    
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
    def setBlurKernelSize(value: Double): Self = this.set("blurKernelSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMainTextureRatio(value: Double): Self = this.set("mainTextureRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderingGroupId(value: Double): Self = this.set("renderingGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCamera(value: Nullable[Camera]): Self = this.set("camera", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCameraNull: Self = this.set("camera", null)
    
    @scala.inline
    def setMainTextureFixedSize(value: Double): Self = this.set("mainTextureFixedSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMainTextureFixedSize: Self = this.set("mainTextureFixedSize", js.undefined)
    
    @scala.inline
    def setMainTextureSamples(value: Double): Self = this.set("mainTextureSamples", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMainTextureSamples: Self = this.set("mainTextureSamples", js.undefined)
  }
}
