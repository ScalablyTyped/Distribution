package typings.babylonjs.BABYLON

import typings.babylonjs.XRSession
import typings.babylonjs.XRWebGLLayer
import typings.std.WebGLRenderingContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebXRRenderTarget
  extends StObject
     with IDisposable {
  
  /**
    * xrpresent context of the canvas which can be used to display/mirror xr content
    */
  var canvasContext: WebGLRenderingContext
  
  /**
    * Initializes a XRWebGLLayer to be used as the session's baseLayer.
    * @param xrSession xr session
    * @returns a promise that will resolve once the XR Layer has been created
    */
  def initializeXRLayerAsync(xrSession: XRSession): js.Promise[XRWebGLLayer]
  
  /**
    * xr layer for the canvas
    */
  var xrLayer: Nullable[XRWebGLLayer]
}
object WebXRRenderTarget {
  
  inline def apply(
    canvasContext: WebGLRenderingContext,
    dispose: () => Unit,
    initializeXRLayerAsync: XRSession => js.Promise[XRWebGLLayer]
  ): WebXRRenderTarget = {
    val __obj = js.Dynamic.literal(canvasContext = canvasContext.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), initializeXRLayerAsync = js.Any.fromFunction1(initializeXRLayerAsync), xrLayer = null)
    __obj.asInstanceOf[WebXRRenderTarget]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WebXRRenderTarget] (val x: Self) extends AnyVal {
    
    inline def setCanvasContext(value: WebGLRenderingContext): Self = StObject.set(x, "canvasContext", value.asInstanceOf[js.Any])
    
    inline def setInitializeXRLayerAsync(value: XRSession => js.Promise[XRWebGLLayer]): Self = StObject.set(x, "initializeXRLayerAsync", js.Any.fromFunction1(value))
    
    inline def setXrLayer(value: Nullable[XRWebGLLayer]): Self = StObject.set(x, "xrLayer", value.asInstanceOf[js.Any])
    
    inline def setXrLayerNull: Self = StObject.set(x, "xrLayer", null)
  }
}
