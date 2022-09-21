package typings.babylonjs.BABYLON

import typings.std.WebGLFramebuffer
import typings.std.WebGLRenderbuffer
import typings.std.WebGLTexture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebGLRenderTargetWrapper
  extends StObject
     with RenderTargetWrapper {
  
  var _MSAAFramebuffer: Nullable[WebGLFramebuffer] = js.native
  
  /**
    * Binds a texture to this render target on a specific attachment
    * @param texture The texture to bind to the framebuffer
    * @param attachmentIndex Index of the attachment
    * @param faceIndex The face of the texture to render to in case of cube texture
    * @param lodLevel defines the lod level to bind to the frame buffer
    */
  /* private */ var _bindTextureRenderTarget: Any = js.native
  
  var _colorTextureArray: Nullable[WebGLTexture] = js.native
  
  /* private */ var _context: Any = js.native
  
  var _depthStencilBuffer: Nullable[WebGLRenderbuffer] = js.native
  
  var _depthStencilTextureArray: Nullable[WebGLTexture] = js.native
  
  var _framebuffer: Nullable[WebGLFramebuffer] = js.native
  
  /**
    * Shares the depth buffer of this render target with another render target.
    * @hidden
    * @param renderTarget Destination renderTarget
    */
  def _shareDepth(renderTarget: WebGLRenderTargetWrapper): Unit = js.native
  
  /* protected */ def _swapRenderTargetWrapper(target: WebGLRenderTargetWrapper): Unit = js.native
}
