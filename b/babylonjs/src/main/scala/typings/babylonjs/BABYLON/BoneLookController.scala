package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BoneLookController extends js.Object {
  var _boneQuat: js.Any = js.native
  var _firstFrameSkipped: js.Any = js.native
  var _fowardAxis: js.Any = js.native
  var _getAngleBetween: js.Any = js.native
  var _getAngleDiff: js.Any = js.native
  var _isAngleBetween: js.Any = js.native
  var _maxPitch: js.Any = js.native
  var _maxPitchTan: js.Any = js.native
  var _maxYaw: js.Any = js.native
  var _maxYawCos: js.Any = js.native
  var _maxYawSin: js.Any = js.native
  var _midYawConstraint: js.Any = js.native
  var _minPitch: js.Any = js.native
  var _minPitchTan: js.Any = js.native
  var _minYaw: js.Any = js.native
  var _minYawCos: js.Any = js.native
  var _minYawSin: js.Any = js.native
  var _slerping: js.Any = js.native
  var _transformYawPitch: js.Any = js.native
  var _transformYawPitchInv: js.Any = js.native
  var _yawRange: js.Any = js.native
  /**
    * Used to make an adjustment to the pitch of the bone
    */
  var adjustPitch: Double = js.native
  /**
    * Used to make an adjustment to the roll of the bone
    */
  var adjustRoll: Double = js.native
  /**
    * Used to make an adjustment to the yaw of the bone
    */
  var adjustYaw: Double = js.native
  /**
    * The bone that will be looking to the target
    */
  var bone: Bone = js.native
  /**
    * The mesh that the bone is attached to
    */
  var mesh: AbstractMesh = js.native
  /**
    * The amount to slerp (spherical linear interpolation) to the target.  Set this to a value between 0 and 1 (a value of 1 disables slerp)
    */
  var slerpAmount: Double = js.native
  /**
    * The target Vector3 that the bone will look at
    */
  var target: Vector3 = js.native
  /**
    * The up axis of the coordinate system that is used when the bone is rotated
    */
  var upAxis: Vector3 = js.native
  /**
    * The space that the up axis is in - Space.BONE, Space.LOCAL (default), or Space.WORLD
    */
  var upAxisSpace: Space = js.native
  /**
    * Gets or sets the maximum pitch angle that the bone can look to
    */
  def maxPitch: Double = js.native
  def maxPitch(value: Double): js.Any = js.native
  /**
    * Gets or sets the maximum yaw angle that the bone can look to
    */
  def maxYaw: Double = js.native
  def maxYaw(value: Double): js.Any = js.native
  /**
    * Gets or sets the minimum pitch angle that the bone can look to
    */
  def minPitch: Double = js.native
  def minPitch(value: Double): js.Any = js.native
  /**
    * Gets or sets the minimum yaw angle that the bone can look to
    */
  def minYaw: Double = js.native
  def minYaw(value: Double): js.Any = js.native
  /**
    * Update the bone to look at the target.  This should be called before the scene is rendered (use scene.registerBeforeRender())
    */
  def update(): Unit = js.native
}

