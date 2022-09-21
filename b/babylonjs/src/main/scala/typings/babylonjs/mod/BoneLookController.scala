package typings.babylonjs.mod

import typings.babylonjs.anon.AdjustPitch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "BoneLookController")
@js.native
open class BoneLookController protected ()
  extends typings.babylonjs.legacyMod.BoneLookController {
  /**
    * Create a BoneLookController
    * @param mesh the TransformNode that the bone belongs to
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
    * @param options.maxYaw
    * @param options.minYaw
    * @param options.maxPitch
    * @param options.minPitch
    * @param options.slerpAmount
    * @param options.upAxis
    * @param options.upAxisSpace
    * @param options.yawAxis
    * @param options.pitchAxis
    * @param options.adjustYaw
    * @param options.adjustPitch
    * @param options.adjustRoll
    **/
  def this(
    mesh: typings.babylonjs.transformNodeMod.TransformNode,
    bone: typings.babylonjs.boneMod.Bone,
    target: typings.babylonjs.mathVectorMod.Vector3
  ) = this()
  def this(
    mesh: typings.babylonjs.transformNodeMod.TransformNode,
    bone: typings.babylonjs.boneMod.Bone,
    target: typings.babylonjs.mathVectorMod.Vector3,
    options: AdjustPitch
  ) = this()
}
/* static members */
object BoneLookController {
  
  @JSImport("babylonjs", "BoneLookController")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("babylonjs", "BoneLookController._TmpMats")
  @js.native
  def _TmpMats: Any = js.native
  inline def _TmpMats_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_TmpMats")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs", "BoneLookController._TmpQuat")
  @js.native
  def _TmpQuat: Any = js.native
  inline def _TmpQuat_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_TmpQuat")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs", "BoneLookController._TmpVecs")
  @js.native
  def _TmpVecs: Any = js.native
  inline def _TmpVecs_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_TmpVecs")(x.asInstanceOf[js.Any])
}
