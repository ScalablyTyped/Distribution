package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebXRInput
  extends StObject
     with IDisposable {
  
  /* private */ var _addAndRemoveControllers: js.Any
  
  /* private */ var _frameObserver: js.Any
  
  /* private */ var _onInputSourcesChange: js.Any
  
  /* private */ var _sessionEndedObserver: js.Any
  
  /* private */ var _sessionInitObserver: js.Any
  
  /**
    * XR controllers being tracked
    */
  var controllers: js.Array[WebXRInputSource]
  
  /**
    * Event when a controller has been connected/added
    */
  var onControllerAddedObservable: Observable[WebXRInputSource]
  
  /**
    * Event when a controller has been removed/disconnected
    */
  var onControllerRemovedObservable: Observable[WebXRInputSource]
  
  /* private */ val options: js.Any
  
  /**
    * the WebXR camera for this session. Mainly used for teleportation
    */
  var xrCamera: WebXRCamera
  
  /**
    * the xr session manager for this session
    */
  var xrSessionManager: WebXRSessionManager
}
object WebXRInput {
  
  inline def apply(
    _addAndRemoveControllers: js.Any,
    _frameObserver: js.Any,
    _onInputSourcesChange: js.Any,
    _sessionEndedObserver: js.Any,
    _sessionInitObserver: js.Any,
    controllers: js.Array[WebXRInputSource],
    dispose: () => Unit,
    onControllerAddedObservable: Observable[WebXRInputSource],
    onControllerRemovedObservable: Observable[WebXRInputSource],
    options: js.Any,
    xrCamera: WebXRCamera,
    xrSessionManager: WebXRSessionManager
  ): WebXRInput = {
    val __obj = js.Dynamic.literal(_addAndRemoveControllers = _addAndRemoveControllers.asInstanceOf[js.Any], _frameObserver = _frameObserver.asInstanceOf[js.Any], _onInputSourcesChange = _onInputSourcesChange.asInstanceOf[js.Any], _sessionEndedObserver = _sessionEndedObserver.asInstanceOf[js.Any], _sessionInitObserver = _sessionInitObserver.asInstanceOf[js.Any], controllers = controllers.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), onControllerAddedObservable = onControllerAddedObservable.asInstanceOf[js.Any], onControllerRemovedObservable = onControllerRemovedObservable.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], xrCamera = xrCamera.asInstanceOf[js.Any], xrSessionManager = xrSessionManager.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebXRInput]
  }
  
  extension [Self <: WebXRInput](x: Self) {
    
    inline def setControllers(value: js.Array[WebXRInputSource]): Self = StObject.set(x, "controllers", value.asInstanceOf[js.Any])
    
    inline def setControllersVarargs(value: WebXRInputSource*): Self = StObject.set(x, "controllers", js.Array(value :_*))
    
    inline def setOnControllerAddedObservable(value: Observable[WebXRInputSource]): Self = StObject.set(x, "onControllerAddedObservable", value.asInstanceOf[js.Any])
    
    inline def setOnControllerRemovedObservable(value: Observable[WebXRInputSource]): Self = StObject.set(x, "onControllerRemovedObservable", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: js.Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setXrCamera(value: WebXRCamera): Self = StObject.set(x, "xrCamera", value.asInstanceOf[js.Any])
    
    inline def setXrSessionManager(value: WebXRSessionManager): Self = StObject.set(x, "xrSessionManager", value.asInstanceOf[js.Any])
    
    inline def set_addAndRemoveControllers(value: js.Any): Self = StObject.set(x, "_addAndRemoveControllers", value.asInstanceOf[js.Any])
    
    inline def set_frameObserver(value: js.Any): Self = StObject.set(x, "_frameObserver", value.asInstanceOf[js.Any])
    
    inline def set_onInputSourcesChange(value: js.Any): Self = StObject.set(x, "_onInputSourcesChange", value.asInstanceOf[js.Any])
    
    inline def set_sessionEndedObserver(value: js.Any): Self = StObject.set(x, "_sessionEndedObserver", value.asInstanceOf[js.Any])
    
    inline def set_sessionInitObserver(value: js.Any): Self = StObject.set(x, "_sessionInitObserver", value.asInstanceOf[js.Any])
  }
}
