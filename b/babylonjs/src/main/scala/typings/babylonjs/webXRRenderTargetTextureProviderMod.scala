package typings.babylonjs

import typings.babylonjs.anon.FramebufferHeight
import typings.babylonjs.mathViewportMod.Viewport
import typings.babylonjs.renderTargetTextureMod.RenderTargetTexture
import typings.babylonjs.sceneMod.IDisposable
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import typings.babylonjs.webXRLayerWrapperMod.WebXRLayerWrapper
import typings.std.WebGLFramebuffer
import typings.std.WebGLTexture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webXRRenderTargetTextureProviderMod {
  
  @JSImport("babylonjs/XR/webXRRenderTargetTextureProvider", "WebXRLayerRenderTargetTextureProvider")
  @js.native
  abstract class WebXRLayerRenderTargetTextureProvider protected ()
    extends StObject
       with IWebXRRenderTargetTextureProvider {
    def this(_scene: Scene, layerWrapper: WebXRLayerWrapper) = this()
    
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
    
    /**
      * Releases all held resources
      */
    /* CompleteClass */
    override def dispose(): Unit = js.native
    
    def getFramebufferDimensions(): Nullable[FramebufferHeight] = js.native
    
    /**
      * Gets the correct render target texture to be rendered this frame for this eye
      * @param eye the eye for which to get the render target
      * @returns the render target for the specified eye or null if not available
      */
    /* CompleteClass */
    override def getRenderTargetTextureForEye(eye: XREye): Nullable[RenderTargetTexture] = js.native
    
    /**
      * Gets the correct render target texture to be rendered this frame for this view
      * @param view the view for which to get the render target
      * @returns the render target for the specified view or null if not available
      */
    /* CompleteClass */
    override def getRenderTargetTextureForView(view: XRView): Nullable[RenderTargetTexture] = js.native
    
    val layerWrapper: WebXRLayerWrapper = js.native
    
    /**
      * Attempts to set the framebuffer-size-normalized viewport to be rendered this frame for this view.
      * In the event of a failure, the supplied viewport is not updated.
      * @param viewport the viewport to which the view will be rendered
      * @param view the view for which to set the viewport
      * @returns whether the operation was successful
      */
    /* CompleteClass */
    override def trySetViewportForView(viewport: Viewport, view: XRView): Boolean = js.native
  }
  
  trait IWebXRRenderTargetTextureProvider
    extends StObject
       with IDisposable {
    
    /**
      * Gets the correct render target texture to be rendered this frame for this eye
      * @param eye the eye for which to get the render target
      * @returns the render target for the specified eye or null if not available
      */
    def getRenderTargetTextureForEye(eye: XREye): Nullable[RenderTargetTexture]
    
    /**
      * Gets the correct render target texture to be rendered this frame for this view
      * @param view the view for which to get the render target
      * @returns the render target for the specified view or null if not available
      */
    def getRenderTargetTextureForView(view: XRView): Nullable[RenderTargetTexture]
    
    /**
      * Attempts to set the framebuffer-size-normalized viewport to be rendered this frame for this view.
      * In the event of a failure, the supplied viewport is not updated.
      * @param viewport the viewport to which the view will be rendered
      * @param view the view for which to set the viewport
      * @returns whether the operation was successful
      */
    def trySetViewportForView(viewport: Viewport, view: XRView): Boolean
  }
  object IWebXRRenderTargetTextureProvider {
    
    inline def apply(
      dispose: () => Unit,
      getRenderTargetTextureForEye: XREye => Nullable[RenderTargetTexture],
      getRenderTargetTextureForView: XRView => Nullable[RenderTargetTexture],
      trySetViewportForView: (Viewport, XRView) => Boolean
    ): IWebXRRenderTargetTextureProvider = {
      val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), getRenderTargetTextureForEye = js.Any.fromFunction1(getRenderTargetTextureForEye), getRenderTargetTextureForView = js.Any.fromFunction1(getRenderTargetTextureForView), trySetViewportForView = js.Any.fromFunction2(trySetViewportForView))
      __obj.asInstanceOf[IWebXRRenderTargetTextureProvider]
    }
    
    extension [Self <: IWebXRRenderTargetTextureProvider](x: Self) {
      
      inline def setGetRenderTargetTextureForEye(value: XREye => Nullable[RenderTargetTexture]): Self = StObject.set(x, "getRenderTargetTextureForEye", js.Any.fromFunction1(value))
      
      inline def setGetRenderTargetTextureForView(value: XRView => Nullable[RenderTargetTexture]): Self = StObject.set(x, "getRenderTargetTextureForView", js.Any.fromFunction1(value))
      
      inline def setTrySetViewportForView(value: (Viewport, XRView) => Boolean): Self = StObject.set(x, "trySetViewportForView", js.Any.fromFunction2(value))
    }
  }
}
