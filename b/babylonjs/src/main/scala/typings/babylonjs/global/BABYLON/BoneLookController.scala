package typings.babylonjs.global.BABYLON

import typings.babylonjs.anon.AdjustRoll
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.BoneLookController")
@js.native
class BoneLookController protected ()
  extends typings.babylonjs.BABYLON.BoneLookController {
  /**
    * Create a BoneLookController
    * @param mesh the mesh that the bone belongs to
    * @param bone the bone that will be looking to the target
    * @param target the target Vector3 to look at
    * @param options optional settings:
    * * maxYaw: the maximum angle the bone will yaw to
    * * minYaw: the minimum angle the bone will yaw to
    * * maxPitch: the maximum angle the bone will pitch to
    * * minPitch: the minimum angle the bone will yaw to
    * * slerpAmount: set the between 0 and 1 to make the bone slerp to the target.
    * * upAxis: the up axis of the coordinate system
    * * upAxisSpace: the space that the up axis is in - Space.BONE, Space.LOCAL (default), or Space.WORLD.
    * * yawAxis: set yawAxis if the bone does not yaw on the y axis
    * * pitchAxis: set pitchAxis if the bone does not pitch on the x axis
    * * adjustYaw: used to make an adjustment to the yaw of the bone
    * * adjustPitch: used to make an adjustment to the pitch of the bone
    * * adjustRoll: used to make an adjustment to the roll of the bone
    **/
  def this(
    mesh: typings.babylonjs.BABYLON.AbstractMesh,
    bone: typings.babylonjs.BABYLON.Bone,
    target: typings.babylonjs.BABYLON.Vector3
  ) = this()
  def this(
    mesh: typings.babylonjs.BABYLON.AbstractMesh,
    bone: typings.babylonjs.BABYLON.Bone,
    target: typings.babylonjs.BABYLON.Vector3,
    options: AdjustRoll
  ) = this()
}

/* static members */
@JSGlobal("BABYLON.BoneLookController")
@js.native
object BoneLookController extends js.Object {
  var _tmpMats: js.Any = js.native
  var _tmpQuat: js.Any = js.native
  var _tmpVecs: js.Any = js.native
}

