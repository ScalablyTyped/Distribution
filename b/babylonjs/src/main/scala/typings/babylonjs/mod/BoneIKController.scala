package typings.babylonjs.mod

import typings.babylonjs.anon.BendAxis
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "BoneIKController")
@js.native
open class BoneIKController protected ()
  extends typings.babylonjs.legacyLegacyMod.BoneIKController {
  /**
    * Creates a new BoneIKController
    * @param mesh defines the TransformNode to control
    * @param bone defines the bone to control
    * @param options defines options to set up the controller
    * @param options.targetMesh
    * @param options.poleTargetMesh
    * @param options.poleTargetBone
    * @param options.poleTargetLocalOffset
    * @param options.poleAngle
    * @param options.bendAxis
    * @param options.maxAngle
    * @param options.slerpAmount
    */
  def this(
    mesh: typings.babylonjs.meshesTransformNodeMod.TransformNode,
    bone: typings.babylonjs.bonesBoneMod.Bone
  ) = this()
  def this(
    mesh: typings.babylonjs.meshesTransformNodeMod.TransformNode,
    bone: typings.babylonjs.bonesBoneMod.Bone,
    options: BendAxis
  ) = this()
}
/* static members */
object BoneIKController {
  
  @JSImport("babylonjs", "BoneIKController")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("babylonjs", "BoneIKController._TmpMats")
  @js.native
  def _TmpMats: Any = js.native
  inline def _TmpMats_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_TmpMats")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs", "BoneIKController._TmpQuat")
  @js.native
  def _TmpQuat: Any = js.native
  inline def _TmpQuat_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_TmpQuat")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs", "BoneIKController._TmpVecs")
  @js.native
  def _TmpVecs: Any = js.native
  inline def _TmpVecs_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_TmpVecs")(x.asInstanceOf[js.Any])
}
