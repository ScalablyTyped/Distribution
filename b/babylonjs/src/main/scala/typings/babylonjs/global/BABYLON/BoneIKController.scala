package typings.babylonjs.global.BABYLON

import typings.babylonjs.anon.MaxAngle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.BoneIKController")
@js.native
open class BoneIKController protected ()
  extends StObject
     with typings.babylonjs.BABYLON.BoneIKController {
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
  def this(mesh: typings.babylonjs.BABYLON.TransformNode, bone: typings.babylonjs.BABYLON.Bone) = this()
  def this(
    mesh: typings.babylonjs.BABYLON.TransformNode,
    bone: typings.babylonjs.BABYLON.Bone,
    options: MaxAngle
  ) = this()
}
/* static members */
object BoneIKController {
  
  @JSGlobal("BABYLON.BoneIKController")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("BABYLON.BoneIKController._TmpMats")
  @js.native
  def _TmpMats: Any = js.native
  inline def _TmpMats_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_TmpMats")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.BoneIKController._TmpQuat")
  @js.native
  def _TmpQuat: Any = js.native
  inline def _TmpQuat_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_TmpQuat")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.BoneIKController._TmpVecs")
  @js.native
  def _TmpVecs: Any = js.native
  inline def _TmpVecs_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_TmpVecs")(x.asInstanceOf[js.Any])
}
