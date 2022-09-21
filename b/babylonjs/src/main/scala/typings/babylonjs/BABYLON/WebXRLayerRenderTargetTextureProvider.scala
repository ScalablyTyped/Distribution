package typings.babylonjs.BABYLON

import typings.babylonjs.anon.FramebufferHeight
import typings.std.WebGLFramebuffer
import typings.std.WebGLTexture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebXRLayerRenderTargetTextureProvider
  extends StObject
     with IWebXRRenderTargetTextureProvider {
  
  /* private */ var _createInternalTexture: Any = js.native
  
  /* protected */ def _createRenderTargetTexture(width: Double, height: Double, framebuffer: Nullable[WebGLFramebuffer]): RenderTargetTexture = js.native
  /* protected */ def _createRenderTargetTexture(
    width: Double,
    height: Double,
    framebuffer: Nullable[WebGLFramebuffer],
    colorTexture: Unit,
    depthStencilTexture: Unit,
    multiview: Boolean
  ): RenderTargetTexture = js.native
  /* protected */ def _createRenderTargetTexture(
    width: Double,
    height: Double,
    framebuffer: Nullable[WebGLFramebuffer],
    colorTexture: Unit,
    depthStencilTexture: WebGLTexture
  ): RenderTargetTexture = js.native
  /* protected */ def _createRenderTargetTexture(
    width: Double,
    height: Double,
    framebuffer: Nullable[WebGLFramebuffer],
    colorTexture: Unit,
    depthStencilTexture: WebGLTexture,
    multiview: Boolean
  ): RenderTargetTexture = js.native
  /* protected */ def _createRenderTargetTexture(width: Double, height: Double, framebuffer: Nullable[WebGLFramebuffer], colorTexture: WebGLTexture): RenderTargetTexture = js.native
  /* protected */ def _createRenderTargetTexture(
    width: Double,
    height: Double,
    framebuffer: Nullable[WebGLFramebuffer],
    colorTexture: WebGLTexture,
    depthStencilTexture: Unit,
    multiview: Boolean
  ): RenderTargetTexture = js.native
  /* protected */ def _createRenderTargetTexture(
    width: Double,
    height: Double,
    framebuffer: Nullable[WebGLFramebuffer],
    colorTexture: WebGLTexture,
    depthStencilTexture: WebGLTexture
  ): RenderTargetTexture = js.native
  /* protected */ def _createRenderTargetTexture(
    width: Double,
    height: Double,
    framebuffer: Nullable[WebGLFramebuffer],
    colorTexture: WebGLTexture,
    depthStencilTexture: WebGLTexture,
    multiview: Boolean
  ): RenderTargetTexture = js.native
  
  /* protected */ def _destroyRenderTargetTexture(renderTargetTexture: RenderTargetTexture): Unit = js.native
  
  /* private */ var _engine: Any = js.native
  
  /* protected */ var _framebufferDimensions: Nullable[FramebufferHeight] = js.native
  
  /* protected */ var _renderTargetTextures: js.Array[RenderTargetTexture] = js.native
  
  /* private */ val _scene: Any = js.native
  
  def getFramebufferDimensions(): Nullable[FramebufferHeight] = js.native
  
  val layerWrapper: WebXRLayerWrapper = js.native
}
