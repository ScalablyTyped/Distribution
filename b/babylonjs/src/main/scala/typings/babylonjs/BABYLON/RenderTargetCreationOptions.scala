package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RenderTargetCreationOptions extends StObject {
  
  /** Defines format (RGBA by default) */
  var format: js.UndefOr[Double] = js.native
  
  /** Specifies whether or not a depth should be allocated in the texture (true by default) */
  var generateDepthBuffer: js.UndefOr[Boolean] = js.native
  
  /**
    * Specifies is mipmaps must be generated
    */
  var generateMipMaps: js.UndefOr[Boolean] = js.native
  
  /** Specifies whether or not a stencil should be allocated in the texture (false by default)*/
  var generateStencilBuffer: js.UndefOr[Boolean] = js.native
  
  /** Defines sampling mode (trilinear by default) */
  var samplingMode: js.UndefOr[Double] = js.native
  
  /** Defines texture type (int by default) */
  var `type`: js.UndefOr[Double] = js.native
}
object RenderTargetCreationOptions {
  
  @scala.inline
  def apply(): RenderTargetCreationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RenderTargetCreationOptions]
  }
  
  @scala.inline
  implicit class RenderTargetCreationOptionsMutableBuilder[Self <: RenderTargetCreationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormat(value: Double): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setGenerateDepthBuffer(value: Boolean): Self = StObject.set(x, "generateDepthBuffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGenerateDepthBufferUndefined: Self = StObject.set(x, "generateDepthBuffer", js.undefined)
    
    @scala.inline
    def setGenerateMipMaps(value: Boolean): Self = StObject.set(x, "generateMipMaps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGenerateMipMapsUndefined: Self = StObject.set(x, "generateMipMaps", js.undefined)
    
    @scala.inline
    def setGenerateStencilBuffer(value: Boolean): Self = StObject.set(x, "generateStencilBuffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGenerateStencilBufferUndefined: Self = StObject.set(x, "generateStencilBuffer", js.undefined)
    
    @scala.inline
    def setSamplingMode(value: Double): Self = StObject.set(x, "samplingMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSamplingModeUndefined: Self = StObject.set(x, "samplingMode", js.undefined)
    
    @scala.inline
    def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
