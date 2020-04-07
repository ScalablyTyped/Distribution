package typings.babylonjs.mod

import typings.babylonjs.AnonBendAxis
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs", "BoneIKController")
@js.native
class BoneIKController protected ()
  extends typings.babylonjs.legacyMod.BoneIKController {
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
    options: AnonBendAxis
  ) = this()
}

/* static members */
@JSImport("babylonjs", "BoneIKController")
@js.native
object BoneIKController extends js.Object {
  var _tmpMats: js.Any = js.native
  var _tmpQuat: js.Any = js.native
  var _tmpVecs: js.Any = js.native
}

