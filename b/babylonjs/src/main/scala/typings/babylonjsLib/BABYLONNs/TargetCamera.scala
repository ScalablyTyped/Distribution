package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * A target camera takes a mesh or position as a target and continues to look at it while it moves.
     * This is the base of the follow, arc rotate cameras and Free camera
     * @see http://doc.babylonjs.com/features/cameras
     */
@JSGlobal("BABYLON.TargetCamera")
@js.native
class TargetCamera protected () extends Camera {
  /**
           * Instantiates a target camera that takes a meshor position as a target and continues to look at it while it moves.
           * This is the base of the follow, arc rotate cameras and Free camera
           * @see http://doc.babylonjs.com/features/cameras
           * @param name Defines the name of the camera in the scene
           * @param position Defines the start position of the camera in the scene
           * @param scene Defines the scene the camera belongs to
           * @param setActiveOnSceneIfNoneActive Defines wheter the camera should be marked as active if not other active cameras have been defined
           */
  def this(name: java.lang.String, position: Vector3, scene: Scene) = this()
  /**
           * Instantiates a target camera that takes a meshor position as a target and continues to look at it while it moves.
           * This is the base of the follow, arc rotate cameras and Free camera
           * @see http://doc.babylonjs.com/features/cameras
           * @param name Defines the name of the camera in the scene
           * @param position Defines the start position of the camera in the scene
           * @param scene Defines the scene the camera belongs to
           * @param setActiveOnSceneIfNoneActive Defines wheter the camera should be marked as active if not other active cameras have been defined
           */
  def this(name: java.lang.String, position: Vector3, scene: Scene, setActiveOnSceneIfNoneActive: scala.Boolean) = this()
  var _cachedQuaternionRotationZ: js.Any = js.native
  var _cachedRotationZ: js.Any = js.native
  /** @hidden */
  var _camMatrix: Matrix = js.native
  /** @hidden */
  var _cameraRotationMatrix: Matrix = js.native
  /** @hidden */
  var _cameraTransformMatrix: Matrix = js.native
  /** @hidden */
  var _currentTarget: Vector3 = js.native
  var _defaultUp: js.Any = js.native
  var _getRigCamPosition: js.Any = js.native
  var _globalCurrentTarget: Vector3 = js.native
  var _globalCurrentUpVector: Vector3 = js.native
  /** @hidden */
  var _referencePoint: Vector3 = js.native
  var _rigCamTransformMatrix: js.Any = js.native
  /**
           * Update the up vector to apply the rotation of the camera (So if you changed the camera rotation.z this will let you update the up vector as well)
           * @returns the current camera
           */
  var _rotateUpVectorWithCameraRotationMatrix: js.Any = js.native
  var _storedPosition: js.Any = js.native
  var _storedRotation: js.Any = js.native
  var _storedRotationQuaternion: js.Any = js.native
  /** @hidden */
  var _transformedReferencePoint: Vector3 = js.native
  /** @hidden */
  var _viewMatrix: Matrix = js.native
  /**
           * Define the current direction the camera is moving to
           */
  var cameraDirection: Vector3 = js.native
  /**
           * Define the current rotation the camera is rotating to
           */
  var cameraRotation: Vector2 = js.native
  /**
           * Define the current target of the camera as an object or a position.
           */
  var lockedTarget: js.Any = js.native
  /**
           * Add cconstraint to the camera to prevent it to move freely in all directions and
           * around all axis.
           */
  var noRotationConstraint: scala.Boolean = js.native
  /**
           * Define the current rotation of the camera
           */
  var rotation: Vector3 = js.native
  /**
           * Define the current rotation of the camera as a quaternion to prevent Gimbal lock
           */
  var rotationQuaternion: Quaternion = js.native
  /**
           * Define the current speed of the camera
           */
  var speed: scala.Double = js.native
  /** @hidden */
  def _computeLocalCameraSpeed(): scala.Double = js.native
  /* protected */ def _computeViewMatrix(position: Vector3, target: Vector3, up: Vector3): scala.Unit = js.native
  /** @hidden */
  def _decideIfNeedsToMove(): scala.Boolean = js.native
  /** @hidden */
  def _getLockedTargetPosition(): Nullable[Vector3] = js.native
  /** @hidden */
  def _reset(): scala.Unit = js.native
  /** @hidden */
  def _updatePosition(): scala.Unit = js.native
  /**
           * Gets the position in front of the camera at a given distance.
           * @param distance The distance from the camera we want the position to be
           * @returns the position
           */
  def getFrontPosition(distance: scala.Double): Vector3 = js.native
  /**
           * Return the current target position of the camera. This value is expressed in local space.
           * @returns the target position
           */
  def getTarget(): Vector3 = js.native
  /** @hidden */
  def setTarget(target: Vector3): scala.Unit = js.native
}

