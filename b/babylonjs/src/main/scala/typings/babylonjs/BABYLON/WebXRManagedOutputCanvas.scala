package typings.babylonjs.BABYLON

import typings.babylonjs.WebGLRenderingContext
import typings.babylonjs.XRSession
import typings.babylonjs.XRWebGLLayer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebXRManagedOutputCanvas extends WebXRRenderTarget {
  
  var _addCanvas: js.Any = js.native
  
  var _canvas: js.Any = js.native
  
  var _engine: js.Any = js.native
  
  var _options: js.Any = js.native
  
  var _originalCanvasSize: js.Any = js.native
  
  var _removeCanvas: js.Any = js.native
  
  var _setCanvasSize: js.Any = js.native
  
  var _setManagedOutputCanvas: js.Any = js.native
  
  /**
    * Obseervers registered here will be triggered when the xr layer was initialized
    */
  var onXRLayerInitObservable: Observable[XRWebGLLayer] = js.native
}
object WebXRManagedOutputCanvas {
  
  @scala.inline
  def apply(
    _addCanvas: js.Any,
    _canvas: js.Any,
    _engine: js.Any,
    _options: js.Any,
    _originalCanvasSize: js.Any,
    _removeCanvas: js.Any,
    _setCanvasSize: js.Any,
    _setManagedOutputCanvas: js.Any,
    canvasContext: WebGLRenderingContext,
    dispose: () => Unit,
    initializeXRLayerAsync: XRSession => js.Promise[XRWebGLLayer],
    onXRLayerInitObservable: Observable[XRWebGLLayer]
  ): WebXRManagedOutputCanvas = {
    val __obj = js.Dynamic.literal(_addCanvas = _addCanvas.asInstanceOf[js.Any], _canvas = _canvas.asInstanceOf[js.Any], _engine = _engine.asInstanceOf[js.Any], _options = _options.asInstanceOf[js.Any], _originalCanvasSize = _originalCanvasSize.asInstanceOf[js.Any], _removeCanvas = _removeCanvas.asInstanceOf[js.Any], _setCanvasSize = _setCanvasSize.asInstanceOf[js.Any], _setManagedOutputCanvas = _setManagedOutputCanvas.asInstanceOf[js.Any], canvasContext = canvasContext.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), initializeXRLayerAsync = js.Any.fromFunction1(initializeXRLayerAsync), onXRLayerInitObservable = onXRLayerInitObservable.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebXRManagedOutputCanvas]
  }
  
  @scala.inline
  implicit class WebXRManagedOutputCanvasMutableBuilder[Self <: WebXRManagedOutputCanvas] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnXRLayerInitObservable(value: Observable[XRWebGLLayer]): Self = StObject.set(x, "onXRLayerInitObservable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_addCanvas(value: js.Any): Self = StObject.set(x, "_addCanvas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_canvas(value: js.Any): Self = StObject.set(x, "_canvas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_engine(value: js.Any): Self = StObject.set(x, "_engine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_options(value: js.Any): Self = StObject.set(x, "_options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_originalCanvasSize(value: js.Any): Self = StObject.set(x, "_originalCanvasSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_removeCanvas(value: js.Any): Self = StObject.set(x, "_removeCanvas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_setCanvasSize(value: js.Any): Self = StObject.set(x, "_setCanvasSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_setManagedOutputCanvas(value: js.Any): Self = StObject.set(x, "_setManagedOutputCanvas", value.asInstanceOf[js.Any])
  }
}
