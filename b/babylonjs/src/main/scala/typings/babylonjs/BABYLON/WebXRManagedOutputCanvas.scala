package typings.babylonjs.BABYLON

import typings.babylonjs.WebGLRenderingContext
import typings.babylonjs.XRSession
import typings.babylonjs.XRWebGLLayer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebXRManagedOutputCanvas extends WebXRRenderTarget {
  var _addCanvas: js.Any
  var _canvas: js.Any
  var _engine: js.Any
  var _options: js.Any
  var _removeCanvas: js.Any
  var _setManagedOutputCanvas: js.Any
}

object WebXRManagedOutputCanvas {
  @scala.inline
  def apply(
    _addCanvas: js.Any,
    _canvas: js.Any,
    _engine: js.Any,
    _options: js.Any,
    _removeCanvas: js.Any,
    _setManagedOutputCanvas: js.Any,
    canvasContext: WebGLRenderingContext,
    dispose: () => Unit,
    initializeXRLayerAsync: XRSession => js.Promise[XRWebGLLayer],
    xrLayer: Nullable[XRWebGLLayer] = null
  ): WebXRManagedOutputCanvas = {
    val __obj = js.Dynamic.literal(_addCanvas = _addCanvas.asInstanceOf[js.Any], _canvas = _canvas.asInstanceOf[js.Any], _engine = _engine.asInstanceOf[js.Any], _options = _options.asInstanceOf[js.Any], _removeCanvas = _removeCanvas.asInstanceOf[js.Any], _setManagedOutputCanvas = _setManagedOutputCanvas.asInstanceOf[js.Any], canvasContext = canvasContext.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), initializeXRLayerAsync = js.Any.fromFunction1(initializeXRLayerAsync), xrLayer = xrLayer.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebXRManagedOutputCanvas]
  }
}

