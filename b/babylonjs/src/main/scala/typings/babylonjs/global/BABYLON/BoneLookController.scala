package typings.babylonjs.global.BABYLON

import typings.babylonjs.anon.AdjustRoll
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.BoneLookController")
@js.native
class BoneLookController protected ()
  extends StObject
     with typings.babylonjs.BABYLON.BoneLookController {
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
object BoneLookController {
  
  @JSGlobal("BABYLON.BoneLookController")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("BABYLON.BoneLookController._tmpMats")
  @js.native
  def _tmpMats: js.Any = js.native
  inline def _tmpMats_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_tmpMats")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.BoneLookController._tmpQuat")
  @js.native
  def _tmpQuat: js.Any = js.native
  inline def _tmpQuat_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_tmpQuat")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.BoneLookController._tmpVecs")
  @js.native
  def _tmpVecs: js.Any = js.native
  inline def _tmpVecs_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_tmpVecs")(x.asInstanceOf[js.Any])
}
