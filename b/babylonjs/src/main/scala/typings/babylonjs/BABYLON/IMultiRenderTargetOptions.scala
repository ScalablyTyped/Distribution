package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMultiRenderTargetOptions extends StObject {
  
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
  implicit class IMultiRenderTargetOptionsMutableBuilder[Self <: IMultiRenderTargetOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultType(value: Double): Self = StObject.set(x, "defaultType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultTypeUndefined: Self = StObject.set(x, "defaultType", js.undefined)
    
    @scala.inline
    def setDoNotChangeAspectRatio(value: Boolean): Self = StObject.set(x, "doNotChangeAspectRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoNotChangeAspectRatioUndefined: Self = StObject.set(x, "doNotChangeAspectRatio", js.undefined)
    
    @scala.inline
    def setGenerateDepthBuffer(value: Boolean): Self = StObject.set(x, "generateDepthBuffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGenerateDepthBufferUndefined: Self = StObject.set(x, "generateDepthBuffer", js.undefined)
    
    @scala.inline
    def setGenerateDepthTexture(value: Boolean): Self = StObject.set(x, "generateDepthTexture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGenerateDepthTextureUndefined: Self = StObject.set(x, "generateDepthTexture", js.undefined)
    
    @scala.inline
    def setGenerateMipMaps(value: Boolean): Self = StObject.set(x, "generateMipMaps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGenerateMipMapsUndefined: Self = StObject.set(x, "generateMipMaps", js.undefined)
    
    @scala.inline
    def setGenerateStencilBuffer(value: Boolean): Self = StObject.set(x, "generateStencilBuffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGenerateStencilBufferUndefined: Self = StObject.set(x, "generateStencilBuffer", js.undefined)
    
    @scala.inline
    def setSamplingModes(value: js.Array[Double]): Self = StObject.set(x, "samplingModes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSamplingModesUndefined: Self = StObject.set(x, "samplingModes", js.undefined)
    
    @scala.inline
    def setSamplingModesVarargs(value: Double*): Self = StObject.set(x, "samplingModes", js.Array(value :_*))
    
    @scala.inline
    def setTextureCount(value: Double): Self = StObject.set(x, "textureCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextureCountUndefined: Self = StObject.set(x, "textureCount", js.undefined)
    
    @scala.inline
    def setTypes(value: js.Array[Double]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
    
    @scala.inline
    def setTypesVarargs(value: Double*): Self = StObject.set(x, "types", js.Array(value :_*))
  }
}
