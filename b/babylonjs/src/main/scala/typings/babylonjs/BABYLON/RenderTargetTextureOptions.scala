package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RenderTargetTextureOptions extends StObject {
  
  /** Specifies the internal texture to use directly instead of creating one (ignores `noColorAttachment` flag when set) **/
  var colorAttachment: js.UndefOr[InternalTexture] = js.undefined
  
  /** specific flags to use when creating the texture (e.g., Constants.TEXTURE_CREATIONFLAG_STORAGE for storage textures) */
  var creationFlags: js.UndefOr[Double] = js.undefined
  
  /** True (default: false) if the texture allocation should be delayed */
  var delayAllocation: js.UndefOr[Boolean] = js.undefined
  
  /** True (default) to not change the aspect ratio of the scene in the RTT */
  var doNotChangeAspectRatio: js.UndefOr[Boolean] = js.undefined
  
  /** The internal format of the buffer in the RTT (RED, RG, RGB, RGBA (default), ALPHA...) */
  var format: js.UndefOr[Double] = js.undefined
  
  /** True (default) to generate a depth buffer */
  var generateDepthBuffer: js.UndefOr[Boolean] = js.undefined
  
  /** True (default: false) if mipmaps need to be generated after render */
  var generateMipMaps: js.UndefOr[Boolean] = js.undefined
  
  /** True (default: false) to generate a stencil buffer */
  var generateStencilBuffer: js.UndefOr[Boolean] = js.undefined
  
  /** True (default: false) if a cube texture needs to be created */
  var isCube: js.UndefOr[Boolean] = js.undefined
  
  /** True (default: false) if multiple textures need to be created (Draw Buffers) */
  var isMulti: js.UndefOr[Boolean] = js.undefined
  
  /** True (default: false) to indicate that no color target should be created. (e.g., if you only want to write to the depth buffer) */
  var noColorAttachment: js.UndefOr[Boolean] = js.undefined
  
  /** Sample count to use when creating the RTT */
  var samples: js.UndefOr[Double] = js.undefined
  
  /** The sampling mode to be used with the render target (Trilinear (default), Linear, Nearest...) */
  var samplingMode: js.UndefOr[Double] = js.undefined
  
  /** The type of the buffer in the RTT (byte (default), half float, float...) */
  var `type`: js.UndefOr[Double] = js.undefined
  
  /** True (default: false) to create a SRGB texture */
  var useSRGBBuffer: js.UndefOr[Boolean] = js.undefined
}
object RenderTargetTextureOptions {
  
  inline def apply(): RenderTargetTextureOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RenderTargetTextureOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RenderTargetTextureOptions] (val x: Self) extends AnyVal {
    
    inline def setColorAttachment(value: InternalTexture): Self = StObject.set(x, "colorAttachment", value.asInstanceOf[js.Any])
    
    inline def setColorAttachmentUndefined: Self = StObject.set(x, "colorAttachment", js.undefined)
    
    inline def setCreationFlags(value: Double): Self = StObject.set(x, "creationFlags", value.asInstanceOf[js.Any])
    
    inline def setCreationFlagsUndefined: Self = StObject.set(x, "creationFlags", js.undefined)
    
    inline def setDelayAllocation(value: Boolean): Self = StObject.set(x, "delayAllocation", value.asInstanceOf[js.Any])
    
    inline def setDelayAllocationUndefined: Self = StObject.set(x, "delayAllocation", js.undefined)
    
    inline def setDoNotChangeAspectRatio(value: Boolean): Self = StObject.set(x, "doNotChangeAspectRatio", value.asInstanceOf[js.Any])
    
    inline def setDoNotChangeAspectRatioUndefined: Self = StObject.set(x, "doNotChangeAspectRatio", js.undefined)
    
    inline def setFormat(value: Double): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setGenerateDepthBuffer(value: Boolean): Self = StObject.set(x, "generateDepthBuffer", value.asInstanceOf[js.Any])
    
    inline def setGenerateDepthBufferUndefined: Self = StObject.set(x, "generateDepthBuffer", js.undefined)
    
    inline def setGenerateMipMaps(value: Boolean): Self = StObject.set(x, "generateMipMaps", value.asInstanceOf[js.Any])
    
    inline def setGenerateMipMapsUndefined: Self = StObject.set(x, "generateMipMaps", js.undefined)
    
    inline def setGenerateStencilBuffer(value: Boolean): Self = StObject.set(x, "generateStencilBuffer", value.asInstanceOf[js.Any])
    
    inline def setGenerateStencilBufferUndefined: Self = StObject.set(x, "generateStencilBuffer", js.undefined)
    
    inline def setIsCube(value: Boolean): Self = StObject.set(x, "isCube", value.asInstanceOf[js.Any])
    
    inline def setIsCubeUndefined: Self = StObject.set(x, "isCube", js.undefined)
    
    inline def setIsMulti(value: Boolean): Self = StObject.set(x, "isMulti", value.asInstanceOf[js.Any])
    
    inline def setIsMultiUndefined: Self = StObject.set(x, "isMulti", js.undefined)
    
    inline def setNoColorAttachment(value: Boolean): Self = StObject.set(x, "noColorAttachment", value.asInstanceOf[js.Any])
    
    inline def setNoColorAttachmentUndefined: Self = StObject.set(x, "noColorAttachment", js.undefined)
    
    inline def setSamples(value: Double): Self = StObject.set(x, "samples", value.asInstanceOf[js.Any])
    
    inline def setSamplesUndefined: Self = StObject.set(x, "samples", js.undefined)
    
    inline def setSamplingMode(value: Double): Self = StObject.set(x, "samplingMode", value.asInstanceOf[js.Any])
    
    inline def setSamplingModeUndefined: Self = StObject.set(x, "samplingMode", js.undefined)
    
    inline def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUseSRGBBuffer(value: Boolean): Self = StObject.set(x, "useSRGBBuffer", value.asInstanceOf[js.Any])
    
    inline def setUseSRGBBufferUndefined: Self = StObject.set(x, "useSRGBBuffer", js.undefined)
  }
}
