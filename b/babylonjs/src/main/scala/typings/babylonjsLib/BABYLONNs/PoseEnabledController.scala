package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Defines the PoseEnabledController object that contains state of a vr capable controller
     */
@JSGlobal("BABYLON.PoseEnabledController")
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
  var _pointingPoseNode: Nullable[AbstractMesh] = js.native
  var _poseControlledCamera: js.Any = js.native
  var _trackPosition: js.Any = js.native
  var _workingMatrix: js.Any = js.native
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
           * The rotation quaternion of the device in babylon space.
           */
  /* CompleteClass */
  override var deviceRotationQuaternion: Quaternion = js.native
  /**
           * The scale of the device to be used when translating from device space to babylon space.
           */
  /* CompleteClass */
  override var deviceScaleFactor: scala.Double = js.native
  /**
           * The mesh that is attached to the controller
           */
  val mesh: Nullable[AbstractMesh] = js.native
  /**
           * The position of the object in babylon space.
           */
  /* CompleteClass */
  override var position: Vector3 = js.native
  /**
           * The raw pose coming from the device.
           */
  /* CompleteClass */
  override var rawPose: Nullable[DevicePose] = js.native
  /**
           * The raw pose from the device
           */
  @JSName("rawPose")
  var rawPose_PoseEnabledController: DevicePose = js.native
  /**
           * The rotation quaternion of the object in babylon space.
           */
  /* CompleteClass */
  override var rotationQuaternion: Quaternion = js.native
  /**
           * @hidden
           */
  def _disableTrackPosition(fixedPosition: Vector3): scala.Unit = js.native
  /**
           * Updates only the pose device and mesh without doing any button event checking
           */
  /* protected */ def _updatePoseAndMesh(): scala.Unit = js.native
  /**
           * Attaches a mesh to the controller
           * @param mesh the mesh to be attached
           */
  def attachToMesh(mesh: AbstractMesh): scala.Unit = js.native
  /**
           * Attaches the controllers mesh to a camera
           * @param camera the camera the mesh should be attached to
           */
  def attachToPoseControlledCamera(camera: TargetCamera): scala.Unit = js.native
  /**
           * Gets the ray of the controller in the direction the controller is pointing
           * @param length the length the resulting ray should be
           * @returns a ray in the direction the controller is pointing
           */
  def getForwardRay(): Ray = js.native
  /**
           * Gets the ray of the controller in the direction the controller is pointing
           * @param length the length the resulting ray should be
           * @returns a ray in the direction the controller is pointing
           */
  def getForwardRay(length: scala.Double): Ray = js.native
  /**
           * Updates the poseControlled values based on the input device pose.
           * @param poseData the pose data to update the object with
           */
  /* CompleteClass */
  override def updateFromDevice(poseData: DevicePose): scala.Unit = js.native
}

/**
     * Defines the PoseEnabledController object that contains state of a vr capable controller
     */
@JSGlobal("BABYLON.PoseEnabledController")
@js.native
object PoseEnabledController extends js.Object {
  /**
           * Name of the child mesh that can be used to cast a ray from the controller
           */
  val POINTING_POSE: java.lang.String = js.native
}

