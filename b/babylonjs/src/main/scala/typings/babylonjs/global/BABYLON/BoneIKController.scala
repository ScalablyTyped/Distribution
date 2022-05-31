package typings.babylonjs.global.BABYLON

import typings.babylonjs.anon.MaxAngle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.BoneIKController")
@js.native
class BoneIKController protected ()
  extends StObject
     with typings.babylonjs.BABYLON.BoneIKController {
  /**
    * Creates a new BoneIKController
    * @param mesh defines the mesh to control
    * @param bone defines the bone to control
    * @param options defines options to set up the controller
    */
  def this(mesh: typings.babylonjs.BABYLON.AbstractMesh, bone: typings.babylonjs.BABYLON.Bone) = this()
  def this(
    mesh: typings.babylonjs.BABYLON.AbstractMesh,
    bone: typings.babylonjs.BABYLON.Bone,
    options: MaxAngle
  ) = this()
}
/* static members */
object BoneIKController {
  
  @JSGlobal("BABYLON.BoneIKController")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("BABYLON.BoneIKController._tmpMats")
  @js.native
  def _tmpMats: js.Any = js.native
  inline def _tmpMats_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_tmpMats")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.BoneIKController._tmpQuat")
  @js.native
  def _tmpQuat: js.Any = js.native
  inline def _tmpQuat_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_tmpQuat")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.BoneIKController._tmpVecs")
  @js.native
  def _tmpVecs: js.Any = js.native
  inline def _tmpVecs_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_tmpVecs")(x.asInstanceOf[js.Any])
}
