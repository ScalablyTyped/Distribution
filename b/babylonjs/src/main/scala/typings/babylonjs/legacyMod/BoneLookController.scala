package typings.babylonjs.legacyMod

import typings.babylonjs.anon.AdjustPitch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "BoneLookController")
@js.native
class BoneLookController protected ()
  extends typings.babylonjs.indexMod.BoneLookController {
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
    mesh: typings.babylonjs.abstractMeshMod.AbstractMesh,
    bone: typings.babylonjs.boneMod.Bone,
    target: typings.babylonjs.mathVectorMod.Vector3
  ) = this()
  def this(
    mesh: typings.babylonjs.abstractMeshMod.AbstractMesh,
    bone: typings.babylonjs.boneMod.Bone,
    target: typings.babylonjs.mathVectorMod.Vector3,
    options: AdjustPitch
  ) = this()
}
/* static members */
@JSImport("babylonjs/Legacy/legacy", "BoneLookController")
@js.native
object BoneLookController extends js.Object {
  
  var _tmpMats: js.Any = js.native
  
  var _tmpQuat: js.Any = js.native
  
  var _tmpVecs: js.Any = js.native
}
