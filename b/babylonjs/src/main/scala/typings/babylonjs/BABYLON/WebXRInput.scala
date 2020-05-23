package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebXRInput extends IDisposable {
  var _addAndRemoveControllers: js.Any
  var _frameObserver: js.Any
  var _onInputSourcesChange: js.Any
  var _sessionEndedObserver: js.Any
  var _sessionInitObserver: js.Any
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
  val options: js.Any
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
}

