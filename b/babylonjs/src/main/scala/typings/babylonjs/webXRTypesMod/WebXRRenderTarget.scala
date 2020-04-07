package typings.babylonjs.webXRTypesMod

import typings.babylonjs.WebGLRenderingContext
import typings.babylonjs.XRSession
import typings.babylonjs.XRWebGLLayer
import typings.babylonjs.sceneMod.IDisposable
import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebXRRenderTarget extends IDisposable {
  /**
    * xrpresent context of the canvas which can be used to display/mirror xr content
    */
  var canvasContext: WebGLRenderingContext
  /**
    * xr layer for the canvas
    */
  var xrLayer: Nullable[XRWebGLLayer]
  /**
    * Initializes the xr layer for the session
    * @param xrSession xr session
    * @returns a promise that will resolve once the XR Layer has been created
    */
  def initializeXRLayerAsync(xrSession: XRSession): js.Promise[XRWebGLLayer]
}

object WebXRRenderTarget {
  @scala.inline
  def apply(
    canvasContext: WebGLRenderingContext,
    dispose: () => Unit,
    initializeXRLayerAsync: XRSession => js.Promise[XRWebGLLayer],
    xrLayer: Nullable[XRWebGLLayer] = null
  ): WebXRRenderTarget = {
    val __obj = js.Dynamic.literal(canvasContext = canvasContext.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), initializeXRLayerAsync = js.Any.fromFunction1(initializeXRLayerAsync))
    if (xrLayer != null) __obj.updateDynamic("xrLayer")(xrLayer.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebXRRenderTarget]
  }
}

