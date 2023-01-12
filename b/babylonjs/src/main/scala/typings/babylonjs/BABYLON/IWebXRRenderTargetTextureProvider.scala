package typings.babylonjs.BABYLON

import typings.babylonjs.XREye
import typings.babylonjs.XRView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IWebXRRenderTargetTextureProvider] (val x: Self) extends AnyVal {
    
    inline def setGetRenderTargetTextureForEye(value: XREye => Nullable[RenderTargetTexture]): Self = StObject.set(x, "getRenderTargetTextureForEye", js.Any.fromFunction1(value))
    
    inline def setGetRenderTargetTextureForView(value: XRView => Nullable[RenderTargetTexture]): Self = StObject.set(x, "getRenderTargetTextureForView", js.Any.fromFunction1(value))
    
    inline def setTrySetViewportForView(value: (Viewport, XRView) => Boolean): Self = StObject.set(x, "trySetViewportForView", js.Any.fromFunction2(value))
  }
}
