package typings.babylonjs.webVRCameraMod

import typings.babylonjs.freeCameraMod.FreeCamera
import typings.babylonjs.mathVectorMod.Quaternion
import typings.babylonjs.mathVectorMod.Vector3
import typings.babylonjs.nodeMod.Node
import typings.babylonjs.observableMod.Observable
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import typings.babylonjs.webVRControllerMod.WebVRController
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babylonjs.webVRCameraMod.PoseControlled because var conflicts: position, rotationQuaternion. Inlined devicePosition, deviceRotationQuaternion, rawPose, deviceScaleFactor, updateFromDevice */ @JSImport("babylonjs/Cameras/VR/webVRCamera", "WebVRFreeCamera")
@js.native
class WebVRFreeCamera protected () extends FreeCamera {
  /**
    * Instantiates a WebVRFreeCamera.
    * @param name The name of the WebVRFreeCamera
    * @param position The starting anchor position for the camera
    * @param scene The scene the camera belongs to
    * @param webVROptions a set of customizable options for the webVRCamera
    */
  def this(name: String, position: Vector3, scene: Scene) = this()
  def this(name: String, position: Vector3, scene: Scene, webVROptions: WebVROptions) = this()
  var _attached: js.Any = js.native
  var _correctPositionIfNotTrackPosition: js.Any = js.native
  var _defaultHeight: js.UndefOr[js.Any] = js.native
  var _descendants: js.Array[Node] = js.native
  var _detachIfAttached: js.Any = js.native
  var _deviceRoomPosition: js.Any = js.native
  /** @hidden */
  var _deviceRoomRotationQuaternion: Quaternion = js.native
  var _deviceToWorld: js.Any = js.native
  var _frameData: js.Any = js.native
  var _htmlElementAttached: js.Any = js.native
  var _leftController: js.Any = js.native
  var _lightOnControllers: js.Any = js.native
  var _onGamepadConnectedObserver: js.Any = js.native
  var _onGamepadDisconnectedObserver: js.Any = js.native
  var _onVREnabled: js.Any = js.native
  var _oneVector: js.Any = js.native
  var _poseSet: js.Any = js.native
  var _rightController: js.Any = js.native
  var _specsVersion: js.Any = js.native
  var _standingMatrix: js.Any = js.native
  var _tmpMatrix: js.Any = js.native
  var _updateCacheWhenTrackingDisabledObserver: js.Any = js.native
  /**
    * @hidden
    * The vrDisplay tied to the camera. See https://developer.mozilla.org/en-US/docs/Web/API/VRDisplay
    */
  var _vrDevice: js.Any = js.native
  var _workingMatrix: js.Any = js.native
  var _workingVector: js.Any = js.native
  var _worldToDevice: js.Any = js.native
  /**
    * References to the webVR controllers for the vrDevice.
    */
  var controllers: js.Array[WebVRController] = js.native
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
  var onPoseUpdatedFromDeviceObservable: Observable[_] = js.native
  /**
    * The rawPose of the vrDevice.
    */
  var rawPose: Nullable[DevicePose] = js.native
  /**
    * If the rig cameras be used as parent instead of this camera.
    */
  var rigParenting: Boolean = js.native
  var updateCacheCalled: js.Any = js.native
  var webVROptions: js.Any = js.native
  /**
    * @hidden
    * Get current device position in babylon world
    */
  def _computeDevicePosition(): Unit = js.native
  /**
    * Gets the device distance from the ground in meters.
    * @returns the distance in meters from the vrDevice to ground in device space. If standing matrix is not supported for the vrDevice 0 is returned.
    */
  def deviceDistanceToRoomGround(): Double = js.native
  /**
    * Gets a vrController by name.
    * @param name The name of the controller to retreive
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
    * Calls resetPose on the vrDisplay
    * See: https://developer.mozilla.org/en-US/docs/Web/API/VRDisplay/resetPose
    */
  def resetToCurrentRotation(): Unit = js.native
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

