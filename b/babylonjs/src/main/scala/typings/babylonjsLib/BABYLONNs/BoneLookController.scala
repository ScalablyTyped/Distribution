package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Class used to make a bone look toward a point in space
  * @see http://doc.babylonjs.com/how_to/how_to_use_bones_and_skeletons#bonelookcontroller
  */
@JSGlobal("BABYLON.BoneLookController")
@js.native
class BoneLookController protected () extends js.Object {
  /**
    * Create a BoneLookController
    * @param mesh the mesh that the bone belongs to
    * @param bone the bone that will be looking to the target
    * @param target the target Vector3 to look at
    * @param settings optional settings:
    * * maxYaw: the maximum angle the bone will yaw to
    * * minYaw: the minimum angle the bone will yaw to
    * * maxPitch: the maximum angle the bone will pitch to
    * * minPitch: the minimum angle the bone will yaw to
    * * slerpAmount: set the between 0 and 1 to make the bone slerp to the target.
    * * upAxis: the up axis of the coordinate system
    * * upAxisSpace: the space that the up axis is in - BABYLON.Space.BONE, BABYLON.Space.LOCAL (default), or BABYLON.Space.WORLD.
    * * yawAxis: set yawAxis if the bone does not yaw on the y axis
    * * pitchAxis: set pitchAxis if the bone does not pitch on the x axis
    * * adjustYaw: used to make an adjustment to the yaw of the bone
    * * adjustPitch: used to make an adjustment to the pitch of the bone
    * * adjustRoll: used to make an adjustment to the roll of the bone
    **/
  def this(mesh: AbstractMesh, bone: Bone, target: Vector3) = this()
  def this(mesh: AbstractMesh, bone: Bone, target: Vector3, options: babylonjsLib.Anon_AdjustPitch) = this()
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
  var adjustPitch: scala.Double = js.native
  /**
    * Used to make an adjustment to the roll of the bone
    */
  var adjustRoll: scala.Double = js.native
  /**
    * Used to make an adjustment to the yaw of the bone
    */
  var adjustYaw: scala.Double = js.native
  /**
    * The bone that will be looking to the target
    */
  var bone: Bone = js.native
  /**
    * Gets or sets the maximum pitch angle that the bone can look to
    */
  var maxPitch: scala.Double = js.native
  /**
    * Gets or sets the maximum yaw angle that the bone can look to
    */
  var maxYaw: scala.Double = js.native
  /**
    * The mesh that the bone is attached to
    */
  var mesh: AbstractMesh = js.native
  /**
    * Gets or sets the minimum pitch angle that the bone can look to
    */
  var minPitch: scala.Double = js.native
  /**
    * Gets or sets the minimum yaw angle that the bone can look to
    */
  var minYaw: scala.Double = js.native
  /**
    * The amount to slerp (spherical linear interpolation) to the target.  Set this to a value between 0 and 1 (a value of 1 disables slerp)
    */
  var slerpAmount: scala.Double = js.native
  /**
    * The target Vector3 that the bone will look at
    */
  var target: Vector3 = js.native
  /**
    * The up axis of the coordinate system that is used when the bone is rotated
    */
  var upAxis: Vector3 = js.native
  /**
    * The space that the up axis is in - BABYLON.Space.BONE, BABYLON.Space.LOCAL (default), or BABYLON.Space.WORLD
    */
  var upAxisSpace: Space = js.native
  /**
    * Update the bone to look at the target.  This should be called before the scene is rendered (use scene.registerBeforeRender())
    */
  def update(): scala.Unit = js.native
}

/* static members */
@JSGlobal("BABYLON.BoneLookController")
@js.native
object BoneLookController extends js.Object {
  var _tmpMats: js.Any = js.native
  var _tmpQuat: js.Any = js.native
  var _tmpVecs: js.Any = js.native
}

