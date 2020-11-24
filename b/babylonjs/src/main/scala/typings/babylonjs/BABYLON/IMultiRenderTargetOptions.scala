package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMultiRenderTargetOptions extends js.Object {
  
  /**
    * Define the default type of the buffers we are creating
    */
  var defaultType: js.UndefOr[Double] = js.native
  
  /**
    * Define if aspect ratio should be adapted to the texture or stay the scene one
    */
  var doNotChangeAspectRatio: js.UndefOr[Boolean] = js.native
  
  /**
    * Define if a depth buffer is required
    */
  var generateDepthBuffer: js.UndefOr[Boolean] = js.native
  
  /**
    * Define if a depth texture is required instead of a depth buffer
    */
  var generateDepthTexture: js.UndefOr[Boolean] = js.native
  
  /**
    * Define if the texture needs to create mip maps after render.
    */
  var generateMipMaps: js.UndefOr[Boolean] = js.native
  
  /**
    * Define if a stencil buffer is required
    */
  var generateStencilBuffer: js.UndefOr[Boolean] = js.native
  
  /**
    * Define the sampling modes of all the draw buffers we want to create
    */
  var samplingModes: js.UndefOr[js.Array[Double]] = js.native
  
  /**
    * Define the number of desired draw buffers
    */
  var textureCount: js.UndefOr[Double] = js.native
  
  /**
    * Define the types of all the draw buffers we want to create
    */
  var types: js.UndefOr[js.Array[Double]] = js.native
}
object IMultiRenderTargetOptions {
  
  @scala.inline
  def apply(): IMultiRenderTargetOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMultiRenderTargetOptions]
  }
  
  @scala.inline
  implicit class IMultiRenderTargetOptionsOps[Self <: IMultiRenderTargetOptions] (val x: Self) extends AnyVal {
    
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
    def setDefaultType(value: Double): Self = this.set("defaultType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultType: Self = this.set("defaultType", js.undefined)
    
    @scala.inline
    def setDoNotChangeAspectRatio(value: Boolean): Self = this.set("doNotChangeAspectRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDoNotChangeAspectRatio: Self = this.set("doNotChangeAspectRatio", js.undefined)
    
    @scala.inline
    def setGenerateDepthBuffer(value: Boolean): Self = this.set("generateDepthBuffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGenerateDepthBuffer: Self = this.set("generateDepthBuffer", js.undefined)
    
    @scala.inline
    def setGenerateDepthTexture(value: Boolean): Self = this.set("generateDepthTexture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGenerateDepthTexture: Self = this.set("generateDepthTexture", js.undefined)
    
    @scala.inline
    def setGenerateMipMaps(value: Boolean): Self = this.set("generateMipMaps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGenerateMipMaps: Self = this.set("generateMipMaps", js.undefined)
    
    @scala.inline
    def setGenerateStencilBuffer(value: Boolean): Self = this.set("generateStencilBuffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGenerateStencilBuffer: Self = this.set("generateStencilBuffer", js.undefined)
    
    @scala.inline
    def setSamplingModesVarargs(value: Double*): Self = this.set("samplingModes", js.Array(value :_*))
    
    @scala.inline
    def setSamplingModes(value: js.Array[Double]): Self = this.set("samplingModes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSamplingModes: Self = this.set("samplingModes", js.undefined)
    
    @scala.inline
    def setTextureCount(value: Double): Self = this.set("textureCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextureCount: Self = this.set("textureCount", js.undefined)
    
    @scala.inline
    def setTypesVarargs(value: Double*): Self = this.set("types", js.Array(value :_*))
    
    @scala.inline
    def setTypes(value: js.Array[Double]): Self = this.set("types", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTypes: Self = this.set("types", js.undefined)
  }
}
