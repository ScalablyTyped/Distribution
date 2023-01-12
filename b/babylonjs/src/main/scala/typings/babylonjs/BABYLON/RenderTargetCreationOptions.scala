package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RenderTargetCreationOptions
  extends StObject
     with InternalTextureCreationOptions {
  
  /** Specifies whether or not a depth should be allocated in the texture (true by default) */
  var generateDepthBuffer: js.UndefOr[Boolean] = js.undefined
  
  /** Specifies whether or not a stencil should be allocated in the texture (false by default)*/
  var generateStencilBuffer: js.UndefOr[Boolean] = js.undefined
  
  /** Specifies that no color target should be bound to the render target (useful if you only want to write to the depth buffer, for eg) */
  var noColorTarget: js.UndefOr[Boolean] = js.undefined
}
object RenderTargetCreationOptions {
  
  inline def apply(): RenderTargetCreationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RenderTargetCreationOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RenderTargetCreationOptions] (val x: Self) extends AnyVal {
    
    inline def setGenerateDepthBuffer(value: Boolean): Self = StObject.set(x, "generateDepthBuffer", value.asInstanceOf[js.Any])
    
    inline def setGenerateDepthBufferUndefined: Self = StObject.set(x, "generateDepthBuffer", js.undefined)
    
    inline def setGenerateStencilBuffer(value: Boolean): Self = StObject.set(x, "generateStencilBuffer", value.asInstanceOf[js.Any])
    
    inline def setGenerateStencilBufferUndefined: Self = StObject.set(x, "generateStencilBuffer", js.undefined)
    
    inline def setNoColorTarget(value: Boolean): Self = StObject.set(x, "noColorTarget", value.asInstanceOf[js.Any])
    
    inline def setNoColorTargetUndefined: Self = StObject.set(x, "noColorTarget", js.undefined)
  }
}
