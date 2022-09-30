package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TargetCamera
  extends StObject
     with Camera {
  
  /* private */ var _cachedQuaternionRotationZ: Any = js.native
  
  /* private */ var _cachedRotationZ: Any = js.native
  
  /** @internal */
  var _camMatrix: Matrix = js.native
  
  /** @internal */
  var _cameraRotationMatrix: Matrix = js.native
  
  /** @internal */
  var _cameraTransformMatrix: Matrix = js.native
  
  /** @internal */
  def _computeLocalCameraSpeed(): Double = js.native
  
  /* protected */ def _computeViewMatrix(position: Vector3, target: Vector3, up: Vector3): Unit = js.native
  
  /** @internal */
  var _currentTarget: Vector3 = js.native
  
  /** @internal */
  def _decideIfNeedsToMove(): Boolean = js.native
  
  /* private */ var _defaultUp: Any = js.native
  
  /** @internal */
  def _getLockedTargetPosition(): Nullable[Vector3] = js.native
  
  /* private */ var _getRigCamPositionAndTarget: Any = js.native
  
  /** @internal */
  var _initialFocalDistance: Double = js.native
  
  /** @internal */
  var _referencePoint: Vector3 = js.native
  
  /** @internal */
  def _reset(): Unit = js.native
  
  /**
    * Update the up vector to apply the rotation of the camera (So if you changed the camera rotation.z this will let you update the up vector as well)
    * @returns the current camera
    */
  /* private */ var _rotateUpVectorWithCameraRotationMatrix: Any = js.native
  
  /* private */ var _storedPosition: Any = js.native
  
  /* private */ var _storedRotation: Any = js.native
  
  /* private */ var _storedRotationQuaternion: Any = js.native
  
  /* private */ var _tmpQuaternion: Any = js.native
  
  /* private */ var _tmpTargetVector: Any = js.native
  
  /* private */ var _tmpUpVector: Any = js.native
  
  /** @internal */
  var _transformedReferencePoint: Vector3 = js.native
  
  /** @internal */
  def _updatePosition(): Unit = js.native
  
  /** @internal */
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
    * Gets the position in front of the camera at a given distance.
    * @param distance The distance from the camera we want the position to be
    * @returns the position
    */
  def getFrontPosition(distance: Double): Vector3 = js.native
  
  /**
    * Return the current target position of the camera. This value is expressed in local space.
    * @returns the target position
    */
  def getTarget(): Vector3 = js.native
  
  /** Gets or sets a boolean indicating that the scaling of the parent hierarchy will not be taken in account by the camera */
  var ignoreParentScaling: Boolean = js.native
  
  /**
    * Speed multiplier for inverse camera panning
    */
  var inverseRotationSpeed: Double = js.native
  
  /**
    * Reverses mouselook direction to 'natural' panning as opposed to traditional direct
    * panning
    */
  var invertRotation: Boolean = js.native
  
  /**
    * Define the current target of the camera as an object or a position.
    * Please note that locking a target will disable panning.
    */
  var lockedTarget: Any = js.native
  
  /**
    * Add constraint to the camera to prevent it to move freely in all directions and
    * around all axis.
    */
  var noRotationConstraint: Boolean = js.native
  
  /**
    * Define the current rotation of the camera
    */
  var rotation: Vector3 = js.native
  
  /**
    * Define the current rotation of the camera as a quaternion to prevent Gimbal lock
    */
  var rotationQuaternion: Quaternion = js.native
  
  /**
    * Defines the target the camera should look at.
    * @param target Defines the new target as a Vector
    */
  def setTarget(target: Vector3): Unit = js.native
  
  /**
    * Define the current speed of the camera
    */
  var speed: Double = js.native
  
  /**
    * Defines the target point of the camera.
    * The camera looks towards it form the radius distance.
    */
  def target: Vector3 = js.native
  def target_=(value: Vector3): Unit = js.native
  
  /**
    * When set, the up vector of the camera will be updated by the rotation of the camera
    */
  var updateUpVectorFromRotation: Boolean = js.native
}
