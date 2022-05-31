package typings.babylonjs.legacyMod

import typings.babylonjs.anon.BendAxis
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "BoneIKController")
@js.native
class BoneIKController protected ()
  extends typings.babylonjs.indexMod.BoneIKController {
  /**
    * Creates a new BoneIKController
    * @param mesh defines the mesh to control
    * @param bone defines the bone to control
    * @param options defines options to set up the controller
    */
  def this(mesh: typings.babylonjs.abstractMeshMod.AbstractMesh, bone: typings.babylonjs.boneMod.Bone) = this()
  def this(
    mesh: typings.babylonjs.abstractMeshMod.AbstractMesh,
    bone: typings.babylonjs.boneMod.Bone,
    options: BendAxis
  ) = this()
}
/* static members */
object BoneIKController {
  
  @JSImport("babylonjs/Legacy/legacy", "BoneIKController")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("babylonjs/Legacy/legacy", "BoneIKController._tmpMats")
  @js.native
  def _tmpMats: js.Any = js.native
  inline def _tmpMats_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_tmpMats")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/Legacy/legacy", "BoneIKController._tmpQuat")
  @js.native
  def _tmpQuat: js.Any = js.native
  inline def _tmpQuat_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_tmpQuat")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/Legacy/legacy", "BoneIKController._tmpVecs")
  @js.native
  def _tmpVecs: js.Any = js.native
  inline def _tmpVecs_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_tmpVecs")(x.asInstanceOf[js.Any])
}
