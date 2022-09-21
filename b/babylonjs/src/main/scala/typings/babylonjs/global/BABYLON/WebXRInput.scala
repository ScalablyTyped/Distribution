package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.IWebXRInputOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.WebXRInput")
@js.native
open class WebXRInput protected ()
  extends StObject
     with typings.babylonjs.BABYLON.WebXRInput {
  /**
    * Initializes the WebXRInput
    * @param xrSessionManager the xr session manager for this session
    * @param xrCamera the WebXR camera for this session. Mainly used for teleportation
    * @param _options = initialization options for this xr input
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
    _options: IWebXRInputOptions
  ) = this()
  
  /* private */ /* CompleteClass */
  var _addAndRemoveControllers: Any = js.native
  
  /* private */ /* CompleteClass */
  var _frameObserver: Any = js.native
  
  /* private */ /* CompleteClass */
  var _onInputSourcesChange: Any = js.native
  
  /* private */ /* CompleteClass */
  override val _options: Any = js.native
  
  /* private */ /* CompleteClass */
  var _sessionEndedObserver: Any = js.native
  
  /* private */ /* CompleteClass */
  var _sessionInitObserver: Any = js.native
  
  /**
    * XR controllers being tracked
    */
  /* CompleteClass */
  var controllers: js.Array[typings.babylonjs.BABYLON.WebXRInputSource] = js.native
  
  /**
    * Releases all held resources
    */
  /* CompleteClass */
  override def dispose(): Unit = js.native
  
  /**
    * Event when a controller has been connected/added
    */
  /* CompleteClass */
  var onControllerAddedObservable: typings.babylonjs.BABYLON.Observable[typings.babylonjs.BABYLON.WebXRInputSource] = js.native
  
  /**
    * Event when a controller has been removed/disconnected
    */
  /* CompleteClass */
  var onControllerRemovedObservable: typings.babylonjs.BABYLON.Observable[typings.babylonjs.BABYLON.WebXRInputSource] = js.native
  
  /**
    * the WebXR camera for this session. Mainly used for teleportation
    */
  /* CompleteClass */
  var xrCamera: typings.babylonjs.BABYLON.WebXRCamera = js.native
  
  /**
    * the xr session manager for this session
    */
  /* CompleteClass */
  var xrSessionManager: typings.babylonjs.BABYLON.WebXRSessionManager = js.native
}
