package typings.babylonjs.BABYLON

import typings.babylonjs.WebGLRenderingContext
import typings.babylonjs.XRSession
import typings.babylonjs.XRWebGLLayer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebXRRenderTarget extends IDisposable {
  
  /**
    * xrpresent context of the canvas which can be used to display/mirror xr content
    */
  var canvasContext: WebGLRenderingContext = js.native
  
  /**
    * Initializes the xr layer for the session
    * @param xrSession xr session
    * @returns a promise that will resolve once the XR Layer has been created
    */
  def initializeXRLayerAsync(xrSession: XRSession): js.Promise[XRWebGLLayer] = js.native
  
  /**
    * xr layer for the canvas
    */
  var xrLayer: Nullable[XRWebGLLayer] = js.native
}
object WebXRRenderTarget {
  
  @scala.inline
  def apply(
    canvasContext: WebGLRenderingContext,
    dispose: () => Unit,
    initializeXRLayerAsync: XRSession => js.Promise[XRWebGLLayer]
  ): WebXRRenderTarget = {
    val __obj = js.Dynamic.literal(canvasContext = canvasContext.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), initializeXRLayerAsync = js.Any.fromFunction1(initializeXRLayerAsync))
    __obj.asInstanceOf[WebXRRenderTarget]
  }
  
  @scala.inline
  implicit class WebXRRenderTargetOps[Self <: WebXRRenderTarget] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCanvasContext(value: WebGLRenderingContext): Self = this.set("canvasContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitializeXRLayerAsync(value: XRSession => js.Promise[XRWebGLLayer]): Self = this.set("initializeXRLayerAsync", js.Any.fromFunction1(value))
    
    @scala.inline
    def setXrLayer(value: Nullable[XRWebGLLayer]): Self = this.set("xrLayer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXrLayerNull: Self = this.set("xrLayer", null)
  }
}
