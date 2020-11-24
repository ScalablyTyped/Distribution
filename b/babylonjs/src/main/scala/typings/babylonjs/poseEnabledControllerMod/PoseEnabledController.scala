package typings.babylonjs.poseEnabledControllerMod

import typings.babylonjs.abstractMeshMod.AbstractMesh
import typings.babylonjs.gamepadMod.Gamepad
import typings.babylonjs.mathVectorMod.Matrix
import typings.babylonjs.mathVectorMod.Vector3
import typings.babylonjs.observableMod.Observable
import typings.babylonjs.rayMod.Ray
import typings.babylonjs.targetCameraMod.TargetCamera
import typings.babylonjs.transformNodeMod.TransformNode
import typings.babylonjs.typesMod.Nullable
import typings.babylonjs.webVRCameraMod.DevicePose
import typings.babylonjs.webVRCameraMod.PoseControlled
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Gamepads/Controllers/poseEnabledController", "PoseEnabledController")
@js.native
class PoseEnabledController protected ()
  extends Gamepad
     with PoseControlled {
  /**
    * Creates a new PoseEnabledController from a gamepad
    * @param browserGamepad the gamepad that the PoseEnabledController should be created from
    */
  def this(browserGamepad: js.Any) = this()
  
  var _calculatedPosition: Vector3 = js.native
  
  var _calculatedRotation: js.Any = js.native
  
  var _deviceRoomPosition: js.Any = js.native
  
  var _deviceRoomRotationQuaternion: js.Any = js.native
  
  /**
    * Internal, matrix used to convert room space to babylon space
    * @hidden
    */
  var _deviceToWorld: Matrix = js.native
  
  /**
    * @hidden
    */
  def _disableTrackPosition(fixedPosition: Vector3): Unit = js.native
  
  var _draggedRoomRotation: js.Any = js.native
  
  var _leftHandSystemQuaternion: js.Any = js.native
  
  var _maxRotationDistFromHeadset: js.Any = js.native
  
  /**
    * Internal, the mesh attached to the controller
    * @hidden
    */
  var _mesh: Nullable[AbstractMesh] = js.native
  
  /**
    * @hidden
    */
  var _meshAttachedObservable: Observable[AbstractMesh] = js.native
  
  /**
    * Node to be used when casting a ray from the controller
    * @hidden
    */
  var _pointingPoseNode: Nullable[TransformNode] = js.native
  
  var _poseControlledCamera: js.Any = js.native
  
  var _trackPosition: js.Any = js.native
  
  /**
    * Updates only the pose device and mesh without doing any button event checking
    */
  /* protected */ def _updatePoseAndMesh(): Unit = js.native
  
  var _workingMatrix: js.Any = js.native
  
  /**
    * Attaches a mesh to the controller
    * @param mesh the mesh to be attached
    */
  def attachToMesh(mesh: AbstractMesh): Unit = js.native
  
  /**
    * Attaches the controllers mesh to a camera
    * @param camera the camera the mesh should be attached to
    */
  def attachToPoseControlledCamera(camera: TargetCamera): Unit = js.native
  
  /**
    * The type of controller (Eg. Windows mixed reality)
    */
  var controllerType: PoseEnabledControllerType = js.native
  
  /**
    * The device position in babylon space
    */
  @JSName("devicePosition")
  var devicePosition_PoseEnabledController: Vector3 = js.native
  
  /**
    * Gets the ray of the controller in the direction the controller is pointing
    * @param length the length the resulting ray should be
    * @returns a ray in the direction the controller is pointing
    */
  def getForwardRay(): Ray = js.native
  def getForwardRay(length: Double): Ray = js.native
  
  /**
    * If the controller is used in a webXR session
    */
  var isXR: Boolean = js.native
  
  /**
    * The mesh that is attached to the controller
    */
  def mesh: Nullable[AbstractMesh] = js.native
  
  /**
    * The raw pose from the device
    */
  @JSName("rawPose")
  var rawPose_PoseEnabledController: DevicePose = js.native
}
/* static members */
@JSImport("babylonjs/Gamepads/Controllers/poseEnabledController", "PoseEnabledController")
@js.native
object PoseEnabledController extends js.Object {
  
  /**
    * Name of the child mesh that can be used to cast a ray from the controller
    */
  val POINTING_POSE: String = js.native
}
