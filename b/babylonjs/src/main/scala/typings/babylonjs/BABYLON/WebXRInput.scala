package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebXRInput extends IDisposable {
  
  var _addAndRemoveControllers: js.Any = js.native
  
  var _frameObserver: js.Any = js.native
  
  var _onInputSourcesChange: js.Any = js.native
  
  var _sessionEndedObserver: js.Any = js.native
  
  var _sessionInitObserver: js.Any = js.native
  
  /**
    * XR controllers being tracked
    */
  var controllers: js.Array[WebXRInputSource] = js.native
  
  /**
    * Event when a controller has been connected/added
    */
  var onControllerAddedObservable: Observable[WebXRInputSource] = js.native
  
  /**
    * Event when a controller has been removed/disconnected
    */
  var onControllerRemovedObservable: Observable[WebXRInputSource] = js.native
  
  val options: js.Any = js.native
  
  /**
    * the WebXR camera for this session. Mainly used for teleportation
    */
  var xrCamera: WebXRCamera = js.native
  
  /**
    * the xr session manager for this session
    */
  var xrSessionManager: WebXRSessionManager = js.native
}
object WebXRInput {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class WebXRInputOps[Self <: WebXRInput] (val x: Self) extends AnyVal {
    
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
    def set_addAndRemoveControllers(value: js.Any): Self = this.set("_addAndRemoveControllers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_frameObserver(value: js.Any): Self = this.set("_frameObserver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_onInputSourcesChange(value: js.Any): Self = this.set("_onInputSourcesChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_sessionEndedObserver(value: js.Any): Self = this.set("_sessionEndedObserver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_sessionInitObserver(value: js.Any): Self = this.set("_sessionInitObserver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setControllersVarargs(value: WebXRInputSource*): Self = this.set("controllers", js.Array(value :_*))
    
    @scala.inline
    def setControllers(value: js.Array[WebXRInputSource]): Self = this.set("controllers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnControllerAddedObservable(value: Observable[WebXRInputSource]): Self = this.set("onControllerAddedObservable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnControllerRemovedObservable(value: Observable[WebXRInputSource]): Self = this.set("onControllerRemovedObservable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: js.Any): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXrCamera(value: WebXRCamera): Self = this.set("xrCamera", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXrSessionManager(value: WebXRSessionManager): Self = this.set("xrSessionManager", value.asInstanceOf[js.Any])
  }
}
