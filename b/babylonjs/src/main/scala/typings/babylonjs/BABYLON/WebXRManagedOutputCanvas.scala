package typings.babylonjs.BABYLON

import typings.babylonjs.XRSession
import typings.babylonjs.XRWebGLLayer
import typings.std.WebGLRenderingContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebXRManagedOutputCanvas
  extends StObject
     with WebXRRenderTarget {
  
  /* private */ var _addCanvas: Any
  
  /* private */ var _canvas: Any
  
  /* private */ var _engine: Any
  
  /* private */ var _options: Any
  
  /* private */ var _originalCanvasSize: Any
  
  /* private */ var _removeCanvas: Any
  
  /* private */ var _setCanvasSize: Any
  
  /* private */ var _setManagedOutputCanvas: Any
  
  /* private */ var _xrLayerWrapper: Any
  
  /**
    * Observers registered here will be triggered when the xr layer was initialized
    */
  var onXRLayerInitObservable: Observable[XRWebGLLayer]
}
object WebXRManagedOutputCanvas {
  
  inline def apply(
    _addCanvas: Any,
    _canvas: Any,
    _engine: Any,
    _options: Any,
    _originalCanvasSize: Any,
    _removeCanvas: Any,
    _setCanvasSize: Any,
    _setManagedOutputCanvas: Any,
    _xrLayerWrapper: Any,
    canvasContext: WebGLRenderingContext,
    dispose: () => Unit,
    initializeXRLayerAsync: XRSession => js.Promise[XRWebGLLayer],
    onXRLayerInitObservable: Observable[XRWebGLLayer]
  ): WebXRManagedOutputCanvas = {
    val __obj = js.Dynamic.literal(_addCanvas = _addCanvas.asInstanceOf[js.Any], _canvas = _canvas.asInstanceOf[js.Any], _engine = _engine.asInstanceOf[js.Any], _options = _options.asInstanceOf[js.Any], _originalCanvasSize = _originalCanvasSize.asInstanceOf[js.Any], _removeCanvas = _removeCanvas.asInstanceOf[js.Any], _setCanvasSize = _setCanvasSize.asInstanceOf[js.Any], _setManagedOutputCanvas = _setManagedOutputCanvas.asInstanceOf[js.Any], _xrLayerWrapper = _xrLayerWrapper.asInstanceOf[js.Any], canvasContext = canvasContext.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), initializeXRLayerAsync = js.Any.fromFunction1(initializeXRLayerAsync), onXRLayerInitObservable = onXRLayerInitObservable.asInstanceOf[js.Any], xrLayer = null)
    __obj.asInstanceOf[WebXRManagedOutputCanvas]
  }
  
  extension [Self <: WebXRManagedOutputCanvas](x: Self) {
    
    inline def setOnXRLayerInitObservable(value: Observable[XRWebGLLayer]): Self = StObject.set(x, "onXRLayerInitObservable", value.asInstanceOf[js.Any])
    
    inline def set_addCanvas(value: Any): Self = StObject.set(x, "_addCanvas", value.asInstanceOf[js.Any])
    
    inline def set_canvas(value: Any): Self = StObject.set(x, "_canvas", value.asInstanceOf[js.Any])
    
    inline def set_engine(value: Any): Self = StObject.set(x, "_engine", value.asInstanceOf[js.Any])
    
    inline def set_options(value: Any): Self = StObject.set(x, "_options", value.asInstanceOf[js.Any])
    
    inline def set_originalCanvasSize(value: Any): Self = StObject.set(x, "_originalCanvasSize", value.asInstanceOf[js.Any])
    
    inline def set_removeCanvas(value: Any): Self = StObject.set(x, "_removeCanvas", value.asInstanceOf[js.Any])
    
    inline def set_setCanvasSize(value: Any): Self = StObject.set(x, "_setCanvasSize", value.asInstanceOf[js.Any])
    
    inline def set_setManagedOutputCanvas(value: Any): Self = StObject.set(x, "_setManagedOutputCanvas", value.asInstanceOf[js.Any])
    
    inline def set_xrLayerWrapper(value: Any): Self = StObject.set(x, "_xrLayerWrapper", value.asInstanceOf[js.Any])
  }
}
