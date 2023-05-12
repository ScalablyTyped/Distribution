package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RenderTargetCreationOptions
  extends StObject
     with InternalTextureCreationOptions {
  
  /** Specifies the internal texture to use directly instead of creating one (ignores `noColorAttachment` flag when set) **/
  var colorAttachment: js.UndefOr[InternalTexture] = js.undefined
  
  /** Specifies whether or not a depth should be allocated in the texture (true by default) */
  var generateDepthBuffer: js.UndefOr[Boolean] = js.undefined
  
  /** Specifies whether or not a stencil should be allocated in the texture (false by default)*/
  var generateStencilBuffer: js.UndefOr[Boolean] = js.undefined
  
  /** Specifies that no color target should be bound to the render target (useful if you only want to write to the depth buffer, for eg) */
  var noColorAttachment: js.UndefOr[Boolean] = js.undefined
}
object RenderTargetCreationOptions {
  
  inline def apply(): RenderTargetCreationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RenderTargetCreationOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RenderTargetCreationOptions] (val x: Self) extends AnyVal {
    
    inline def setColorAttachment(value: InternalTexture): Self = StObject.set(x, "colorAttachment", value.asInstanceOf[js.Any])
    
    inline def setColorAttachmentUndefined: Self = StObject.set(x, "colorAttachment", js.undefined)
    
    inline def setGenerateDepthBuffer(value: Boolean): Self = StObject.set(x, "generateDepthBuffer", value.asInstanceOf[js.Any])
    
    inline def setGenerateDepthBufferUndefined: Self = StObject.set(x, "generateDepthBuffer", js.undefined)
    
    inline def setGenerateStencilBuffer(value: Boolean): Self = StObject.set(x, "generateStencilBuffer", value.asInstanceOf[js.Any])
    
    inline def setGenerateStencilBufferUndefined: Self = StObject.set(x, "generateStencilBuffer", js.undefined)
    
    inline def setNoColorAttachment(value: Boolean): Self = StObject.set(x, "noColorAttachment", value.asInstanceOf[js.Any])
    
    inline def setNoColorAttachmentUndefined: Self = StObject.set(x, "noColorAttachment", js.undefined)
  }
}
