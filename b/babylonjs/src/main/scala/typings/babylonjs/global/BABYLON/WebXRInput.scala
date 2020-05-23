package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.IWebXRInputOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.WebXRInput")
@js.native
class WebXRInput protected ()
  extends typings.babylonjs.BABYLON.WebXRInput {
  /**
    * Initializes the WebXRInput
    * @param xrSessionManager the xr session manager for this session
    * @param xrCamera the WebXR camera for this session. Mainly used for teleportation
    * @param options = initialization options for this xr input
    */
  def this(
    /**
    * the xr session manager for this session
    */
  xrSessionManager: typings.babylonjs.BABYLON.WebXRSessionManager,
    /**
    * the WebXR camera for this session. Mainly used for teleportation
    */
  xrCamera: typings.babylonjs.BABYLON.WebXRCamera
  ) = this()
  def this(
    /**
    * the xr session manager for this session
    */
  xrSessionManager: typings.babylonjs.BABYLON.WebXRSessionManager,
    /**
    * the WebXR camera for this session. Mainly used for teleportation
    */
  xrCamera: typings.babylonjs.BABYLON.WebXRCamera,
    options: IWebXRInputOptions
  ) = this()
  /* CompleteClass */
  override var _addAndRemoveControllers: js.Any = js.native
  /* CompleteClass */
  override var _frameObserver: js.Any = js.native
  /* CompleteClass */
  override var _onInputSourcesChange: js.Any = js.native
  /* CompleteClass */
  override var _sessionEndedObserver: js.Any = js.native
  /* CompleteClass */
  override var _sessionInitObserver: js.Any = js.native
  /**
    * XR controllers being tracked
    */
  /* CompleteClass */
  override var controllers: js.Array[typings.babylonjs.BABYLON.WebXRInputSource] = js.native
  /**
    * Event when a controller has been connected/added
    */
  /* CompleteClass */
  override var onControllerAddedObservable: typings.babylonjs.BABYLON.Observable[typings.babylonjs.BABYLON.WebXRInputSource] = js.native
  /**
    * Event when a controller has been removed/disconnected
    */
  /* CompleteClass */
  override var onControllerRemovedObservable: typings.babylonjs.BABYLON.Observable[typings.babylonjs.BABYLON.WebXRInputSource] = js.native
  /* CompleteClass */
  override val options: js.Any = js.native
  /**
    * the WebXR camera for this session. Mainly used for teleportation
    */
  /* CompleteClass */
  override var xrCamera: typings.babylonjs.BABYLON.WebXRCamera = js.native
  /**
    * the xr session manager for this session
    */
  /* CompleteClass */
  override var xrSessionManager: typings.babylonjs.BABYLON.WebXRSessionManager = js.native
  /**
    * Releases all held resources
    */
  /* CompleteClass */
  override def dispose(): Unit = js.native
}

