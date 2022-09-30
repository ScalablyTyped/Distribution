package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babylonjs.BABYLON.PoseControlled because var conflicts: position, rotationQuaternion. Inlined devicePosition, deviceRotationQuaternion, rawPose, deviceScaleFactor, updateFromDevice */ @js.native
trait WebVRFreeCamera
  extends StObject
     with FreeCamera {
  
  /* private */ var _attached: Any = js.native
  
  /**
    * @internal
    * Get current device position in babylon world
    */
  def _computeDevicePosition(): Unit = js.native
  
  /* private */ var _correctPositionIfNotTrackPosition: Any = js.native
  
  /* private */ var _defaultHeight: Any = js.native
  
  /* protected */ var _descendants: js.Array[Node] = js.native
  
  /* private */ var _detachIfAttached: Any = js.native
  
  /* private */ var _deviceRoomPosition: Any = js.native
  
  /** @internal */
  var _deviceRoomRotationQuaternion: Quaternion = js.native
  
  /* private */ var _deviceToWorld: Any = js.native
  
  /* private */ var _frameData: Any = js.native
  
  /* private */ var _leftController: Any = js.native
  
  /* private */ var _lightOnControllers: Any = js.native
  
  /* private */ var _onGamepadConnectedObserver: Any = js.native
  
  /* private */ var _onGamepadDisconnectedObserver: Any = js.native
  
  /* private */ var _onVREnabled: Any = js.native
  
  /* private */ var _oneVector: Any = js.native
  
  /* private */ var _poseSet: Any = js.native
  
  /* private */ var _rightController: Any = js.native
  
  /* protected */ var _setRigMode: Any = js.native
  
  /* private */ var _specsVersion: Any = js.native
  
  /* private */ var _standingMatrix: Any = js.native
  
  /* private */ var _tmpMatrix: Any = js.native
  
  /* private */ var _updateCacheCalled: Any = js.native
  
  /* private */ var _updateCacheWhenTrackingDisabledObserver: Any = js.native
  
  /**
    * @internal
    * The vrDisplay tied to the camera. See https://developer.mozilla.org/en-US/docs/Web/API/VRDisplay
    */
  var _vrDevice: Any = js.native
  
  /* private */ var _webVROptions: Any = js.native
  
  /* private */ var _workingMatrix: Any = js.native
  
  /* private */ var _workingVector: Any = js.native
  
  /* private */ var _worldToDevice: Any = js.native
  
  /**
    * References to the webVR controllers for the vrDevice.
    */
  var controllers: js.Array[WebVRController] = js.native
  
  /**
    * Gets the device distance from the ground in meters.
    * @returns the distance in meters from the vrDevice to ground in device space. If standing matrix is not supported for the vrDevice 0 is returned.
    */
  def deviceDistanceToRoomGround(): Double = js.native
  
  /**
    * Represents device position in babylon space.
    */
  var devicePosition: js.UndefOr[Vector3] = js.native
  
  /**
    * Represents device rotation in babylon space.
    */
  var deviceRotationQuaternion: Quaternion = js.native
  
  /**
    * The scale of the device to be used when translating from device space to babylon space.
    */
  var deviceScaleFactor: Double = js.native
  
  /**
    * Gets a vrController by name.
    * @param name The name of the controller to retrieve
    * @returns the controller matching the name specified or null if not found
    */
  def getControllerByName(name: String): Nullable[WebVRController] = js.native
  
  /**
    * Initializes the controllers and their meshes
    */
  def initControllers(): Unit = js.native
  
  /**
    * The controller corresponding to the users left hand.
    */
  def leftController: Nullable[WebVRController] = js.native
  
  /**
    * Emits an event when a controller's mesh has been loaded;
    */
  var onControllerMeshLoadedObservable: Observable[WebVRController] = js.native
  
  /**
    * Emits an event when a controller is attached.
    */
  var onControllersAttachedObservable: Observable[js.Array[WebVRController]] = js.native
  
  /**
    * Emits an event when the HMD's pose has been updated.
    */
  var onPoseUpdatedFromDeviceObservable: Observable[Any] = js.native
  
  /**
    * The rawPose of the vrDevice.
    */
  var rawPose: Nullable[DevicePose] = js.native
  
  /**
    * Calls resetPose on the vrDisplay
    * See: https://developer.mozilla.org/en-US/docs/Web/API/VRDisplay/resetPose
    */
  def resetToCurrentRotation(): Unit = js.native
  
  /**
    * If the rig cameras be used as parent instead of this camera.
    */
  var rigParenting: Boolean = js.native
  
  /**
    * The controller corresponding to the users right hand.
    */
  def rightController: Nullable[WebVRController] = js.native
  
  /**
    * Updates the poseControlled values based on the input device pose.
    * @param poseData Pose coming from the device
    */
  /**
    * Updates the poseControlled values based on the input device pose.
    * @param poseData the pose data to update the object with
    */
  def updateFromDevice(poseData: DevicePose): Unit = js.native
  
  /**
    * Enables the standing matrix when supported. This can be used to position the user's view the correct height from the ground.
    * @param callback will be called when the standing matrix is set. Callback parameter is if the standing matrix is supported.
    */
  def useStandingMatrix(): Unit = js.native
  def useStandingMatrix(callback: js.Function1[/* bool */ Boolean, Unit]): Unit = js.native
  
  /**
    * Enables the standing matrix when supported. This can be used to position the user's view the correct height from the ground.
    * @returns A promise with a boolean set to if the standing matrix is supported.
    */
  def useStandingMatrixAsync(): js.Promise[Boolean] = js.native
}
