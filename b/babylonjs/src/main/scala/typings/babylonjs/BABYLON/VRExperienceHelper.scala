package typings.babylonjs.BABYLON

import typings.std.HTMLButtonElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VRExperienceHelper extends js.Object {
  
  var _btnVR: js.Any = js.native
  
  var _btnVRDisplayed: js.Any = js.native
  
  var _cachedAngularSensibility: js.Any = js.native
  
  var _cameraGazer: js.Any = js.native
  
  var _castRayAndSelectObject: js.Any = js.native
  
  var _checkRotate: js.Any = js.native
  
  var _checkTeleportBackwards: js.Any = js.native
  
  var _checkTeleportWithRay: js.Any = js.native
  
  var _circleEase: js.Any = js.native
  
  var _convertNormalToDirectionOfRay: js.Any = js.native
  
  var _createTeleportationCircles: js.Any = js.native
  
  var _defaultHeight: js.Any = js.native
  
  var _deviceOrientationCamera: js.Any = js.native
  
  var _displayGaze: js.Any = js.native
  
  var _displayLaserPointer: js.Any = js.native
  
  var _displayTeleportationTarget: js.Any = js.native
  
  var _enableInteractionOnController: js.Any = js.native
  
  var _enableTeleportationOnController: js.Any = js.native
  
  var _existingCamera: js.Any = js.native
  
  var _floorMeshName: js.Any = js.native
  
  var _floorMeshesCollection: js.Any = js.native
  
  var _fullscreenVRpresenting: js.Any = js.native
  
  var _gazeColor: js.Any = js.native
  
  var _haloCenter: js.Any = js.native
  
  var _hasEnteredVR: js.Any = js.native
  
  var _hideTeleportationTarget: js.Any = js.native
  
  var _inputElement: js.Any = js.native
  
  var _interactionsEnabled: js.Any = js.native
  
  var _interactionsRequested: js.Any = js.native
  
  var _isDefaultTeleportationTarget: js.Any = js.native
  
  var _isTeleportationFloor: js.Any = js.native
  
  var _laserColor: js.Any = js.native
  
  var _leftController: js.Any = js.native
  
  var _moveTeleportationSelectorTo: js.Any = js.native
  
  /* private */ def _noControllerIsActive: js.Any = js.native
  
  var _notifySelectedMeshUnselected: js.Any = js.native
  
  var _onDefaultMeshLoaded: js.Any = js.native
  
  var _onFullscreenChange: js.Any = js.native
  
  var _onKeyDown: js.Any = js.native
  
  var _onNewGamepadConnected: js.Any = js.native
  
  var _onNewGamepadDisconnected: js.Any = js.native
  
  var _onResize: js.Any = js.native
  
  var _onVRDisplayChanged: js.Any = js.native
  
  var _onVRRequestPresentComplete: js.Any = js.native
  
  var _onVRRequestPresentStart: js.Any = js.native
  
  var _onVrDisplayPresentChange: js.Any = js.native
  
  var _padSensibilityDown: js.Any = js.native
  
  var _padSensibilityUp: js.Any = js.native
  
  var _pickedGazeColor: js.Any = js.native
  
  var _pickedLaserColor: js.Any = js.native
  
  var _position: js.Any = js.native
  
  var _postProcessMove: js.Any = js.native
  
  var _rayLength: js.Any = js.native
  
  var _raySelectionPredicate: js.Any = js.native
  
  var _rightController: js.Any = js.native
  
  var _rotateCamera: js.Any = js.native
  
  var _rotationAllowed: js.Any = js.native
  
  var _rotationAngle: js.Any = js.native
  
  var _scene: js.Any = js.native
  
  var _teleportActive: js.Any = js.native
  
  var _teleportBackwardsVector: js.Any = js.native
  
  var _teleportationBorderColor: js.Any = js.native
  
  var _teleportationEasing: js.Any = js.native
  
  var _teleportationFillColor: js.Any = js.native
  
  var _teleportationInitialized: js.Any = js.native
  
  var _teleportationMode: js.Any = js.native
  
  /* private */ def _teleportationRequestInitiated: js.Any = js.native
  
  var _teleportationRequested: js.Any = js.native
  
  var _teleportationSpeed: js.Any = js.native
  
  var _teleportationTarget: js.Any = js.native
  
  var _teleportationTime: js.Any = js.native
  
  var _tryEnableInteractionOnController: js.Any = js.native
  
  var _useCustomVRButton: js.Any = js.native
  
  var _vrDeviceOrientationCamera: js.Any = js.native
  
  var _webVRCamera: js.Any = js.native
  
  var _webVRpresenting: js.Any = js.native
  
  var _webVRready: js.Any = js.native
  
  var _webVRrequesting: js.Any = js.native
  
  var _webVRsupported: js.Any = js.native
  
  var _workingMatrix: js.Any = js.native
  
  var _workingQuaternion: js.Any = js.native
  
  var _workingVector: js.Any = js.native
  
  /**
    * Adds a floor mesh to be used for teleportation.
    * @param floorMesh the mesh to be used for teleportation.
    */
  def addFloorMesh(floorMesh: Mesh): Unit = js.native
  
  var beforeRender: js.Any = js.native
  
  /**
    * Sets the color of the ray from the vr headsets gaze.
    * @param color new color for the ray.
    */
  def changeGazeColor(color: Color3): Unit = js.native
  
  /**
    * Sets the color of the laser ray from the vr controllers.
    * @param color new color for the ray.
    */
  def changeLaserColor(color: Color3): Unit = js.native
  
  var completeVRInit: js.Any = js.native
  
  /**
    * Based on the current WebVR support, returns the current VR camera used.
    */
  def currentVRCamera: Nullable[Camera] = js.native
  
  /**
    * The deviceOrientationCamera used as the camera when not in VR.
    */
  def deviceOrientationCamera: Nullable[DeviceOrientationCamera] = js.native
  
  /**
    * If the ray of the gaze should be displayed.
    */
  def displayGaze: Boolean = js.native
  /**
    * Sets if the ray of the gaze should be displayed.
    */
  def displayGaze_=(value: Boolean): Unit = js.native
  
  /**
    * If the ray of the LaserPointer should be displayed.
    */
  def displayLaserPointer: Boolean = js.native
  /**
    * Sets if the ray of the LaserPointer should be displayed.
    */
  def displayLaserPointer_=(value: Boolean): Unit = js.native
  
  var displayVRButton: js.Any = js.native
  
  /**
    * Exits VR and disposes of the vr experience helper
    */
  def dispose(): Unit = js.native
  
  /**
    * Gets or sets a boolean indicating that gaze can be enabled even if pointer lock is not engage (useful on iOS where fullscreen mode and pointer lock are not supported)
    */
  var enableGazeEvenWhenNoPointerLock: Boolean = js.native
  
  /**
    * Enables controllers and user interactions such as selecting and object or clicking on an object.
    */
  def enableInteractions(): Unit = js.native
  
  /**
    * Enables interactions and teleportation using the VR controllers and gaze.
    * @param vrTeleportationOptions options to modify teleportation behavior.
    */
  def enableTeleportation(): Unit = js.native
  def enableTeleportation(vrTeleportationOptions: VRTeleportationOptions): Unit = js.native
  
  /**
    * Attempt to enter VR. If a headset is connected and ready, will request present on that.
    * Otherwise, will use the fullscreen API.
    */
  def enterVR(): Unit = js.native
  
  /**
    * Attempt to exit VR, or fullscreen.
    */
  def exitVR(): Unit = js.native
  
  /**
    * Gets or sets a boolean indicating that the VREXperienceHelper will exit VR if double tap is detected
    */
  var exitVROnDoubleTap: Boolean = js.native
  
  /**
    * The mesh used to display where the user is selecting, this mesh will be cloned and set as the gazeTracker for the left and right controller
    * when set bakeCurrentTransformIntoVertices will be called on the mesh.
    * See https://doc.babylonjs.com/resources/baking_transformations
    */
  def gazeTrackerMesh: Mesh = js.native
  def gazeTrackerMesh_=(value: Mesh): Unit = js.native
  
  /**
    * Gets the name of the VRExperienceHelper class
    * @returns "VRExperienceHelper"
    */
  def getClassName(): String = js.native
  
  /**
    * Gets a value indicating if we are currently in VR mode.
    */
  def isInVRMode: Boolean = js.native
  
  /**
    * The gaze tracking mesh corresponding to the left controller
    */
  def leftControllerGazeTrackerMesh: Nullable[Mesh] = js.native
  
  /**
    * To be optionaly changed by user to define custom selection logic (after ray selection)
    */
  def meshSelectionPredicate(mesh: AbstractMesh): Boolean = js.native
  
  var moveButtonToBottomRight: js.Any = js.native
  
  /**
    *  Observable raised after camera teleportation
    */
  var onAfterCameraTeleport: Observable[Vector3] = js.native
  
  /**
    * Observable raised when entering VR has completed.
    */
  var onAfterEnteringVRObservable: Observable[OnAfterEnteringVRObservableEvent] = js.native
  
  /**
    * Observable raised before camera teleportation
    */
  var onBeforeCameraTeleport: Observable[Vector3] = js.native
  
  /** Return this.onControllerMeshLoadedObservable
    * Note: This one is for backward compatibility. Please use onControllerMeshLoadedObservable directly
    */
  def onControllerMeshLoaded: Observable[WebVRController] = js.native
  
  /**
    * Observable raised when controller mesh is loaded.
    */
  var onControllerMeshLoadedObservable: Observable[WebVRController] = js.native
  
  /** Return this.onEnteringVRObservable
    * Note: This one is for backward compatibility. Please use onEnteringVRObservable directly
    */
  def onEnteringVR: Observable[VRExperienceHelper] = js.native
  
  /**
    * Observable raised right before entering VR.
    */
  var onEnteringVRObservable: Observable[VRExperienceHelper] = js.native
  
  /** Return this.onExitingVRObservable
    * Note: This one is for backward compatibility. Please use onExitingVRObservable directly
    */
  def onExitingVR: Observable[VRExperienceHelper] = js.native
  
  /**
    * Observable raised when exiting VR.
    */
  var onExitingVRObservable: Observable[VRExperienceHelper] = js.native
  
  /**
    * Observable raised when a new mesh is selected based on meshSelectionPredicate.
    * This observable will provide the mesh and the controller used to select the mesh
    */
  var onMeshSelectedWithController: Observable[typings.babylonjs.anon.Mesh] = js.native
  
  /**
    * Observable raised when a new mesh is picked based on meshSelectionPredicate
    */
  var onNewMeshPicked: Observable[PickingInfo] = js.native
  
  /**
    * Observable raised when a new mesh is selected based on meshSelectionPredicate
    */
  var onNewMeshSelected: Observable[AbstractMesh] = js.native
  
  /**
    * Observable raised when current selected mesh gets unselected
    */
  var onSelectedMeshUnselected: Observable[AbstractMesh] = js.native
  
  var onVRDisplayChanged: js.Any = js.native
  
  var onVrDisplayPresentChange: js.Any = js.native
  
  /**
    * The position of the vr experience helper.
    */
  def position: Vector3 = js.native
  /**
    * Sets the position of the vr experience helper.
    */
  def position_=(value: Vector3): Unit = js.native
  
  /**
    * To be optionaly changed by user to define custom ray selection
    */
  def raySelectionPredicate(mesh: AbstractMesh): Boolean = js.native
  
  /**
    * Removes a floor mesh from being used for teleportation.
    * @param floorMesh the mesh to be removed.
    */
  def removeFloorMesh(floorMesh: Mesh): Unit = js.native
  
  /**
    * Defines whether or not Pointer lock should be requested when switching to
    * full screen.
    */
  var requestPointerLockOnFullScreen: Boolean = js.native
  
  /**
    * The gaze tracking mesh corresponding to the right controller
    */
  def rightControllerGazeTrackerMesh: Nullable[Mesh] = js.native
  
  /**
    * Permanently set new colors for the gaze pointer
    * @param color the new gaze color
    * @param pickedColor the new gaze color when picked mesh detected
    */
  def setGazeColor(color: Color3): Unit = js.native
  def setGazeColor(color: Color3, pickedColor: Color3): Unit = js.native
  
  /**
    * Permanently set new colors for the laser pointer
    * @param color the new laser color
    * @param pickedColor the new laser color when picked mesh detected
    */
  def setLaserColor(color: Color3): Unit = js.native
  def setLaserColor(color: Color3, pickedColor: Color3): Unit = js.native
  
  /**
    * Set lighting enabled / disabled on the laser pointer of both controllers
    * @param enabled should the lighting be enabled on the laser pointer
    */
  def setLaserLightingState(): Unit = js.native
  def setLaserLightingState(enabled: Boolean): Unit = js.native
  
  /**
    * Teleports the users feet to the desired location
    * @param location The location where the user's feet should be placed
    */
  def teleportCamera(location: Vector3): Unit = js.native
  
  /**
    * Set teleportation enabled. If set to false camera teleportation will be disabled but camera rotation will be kept.
    */
  var teleportationEnabled: Boolean = js.native
  
  /**
    * The mesh used to display where the user is going to teleport.
    */
  def teleportationTarget: Mesh = js.native
  /**
    * Sets the mesh to be used to display where the user is going to teleport.
    */
  def teleportationTarget_=(value: Mesh): Unit = js.native
  
  var updateButtonVisibility: js.Any = js.native
  
  /**
    * If the controller laser color should be updated when selecting meshes
    */
  var updateControllerLaserColor: Boolean = js.native
  
  /**
    * If the gaze trackers color should be updated when selecting meshes
    */
  var updateGazeTrackerColor: Boolean = js.native
  
  /**
    * If the gaze trackers scale should be updated to be constant size when pointing at near/far meshes
    */
  var updateGazeTrackerScale: Boolean = js.native
  
  /**
    * The html button that is used to trigger entering into VR.
    */
  def vrButton: Nullable[HTMLButtonElement] = js.native
  
  /**
    * The deviceOrientationCamera that is used as a fallback when vr device is not connected.
    */
  def vrDeviceOrientationCamera: Nullable[VRDeviceOrientationFreeCamera] = js.native
  
  /**
    * The webVRCamera which is used when in VR.
    */
  def webVRCamera: WebVRFreeCamera = js.native
  
  /** Options to modify the vr experience helper's behavior. */
  var webVROptions: VRExperienceHelperOptions = js.native
  
  /**
    * If asking to force XR, this will be populated with the default xr experience
    */
  var xr: WebXRDefaultExperience = js.native
  
  /**
    * Was the XR test done already. If this is true AND this.xr exists, xr is initialized.
    * If this is true and no this.xr, xr exists but is not supported, using WebVR.
    */
  var xrTestDone: Boolean = js.native
}
