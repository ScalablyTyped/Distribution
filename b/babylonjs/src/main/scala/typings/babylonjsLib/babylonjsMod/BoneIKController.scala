package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Class used to apply inverse kinematics to bones
  * @see http://doc.babylonjs.com/how_to/how_to_use_bones_and_skeletons#boneikcontroller
  */
@JSImport("babylonjs", "BoneIKController")
@js.native
class BoneIKController protected ()
  extends babylonjsLib.BABYLONNs.BoneIKController {
  /**
    * Creates a new BoneIKController
    * @param mesh defines the mesh to control
    * @param bone defines the bone to control
    * @param options defines options to set up the controller
    */
  def this(mesh: babylonjsLib.BABYLONNs.AbstractMesh, bone: babylonjsLib.BABYLONNs.Bone) = this()
  def this(mesh: babylonjsLib.BABYLONNs.AbstractMesh, bone: babylonjsLib.BABYLONNs.Bone, options: babylonjsLib.Anon_BendAxis) = this()
}

/* static members */
@JSImport("babylonjs", "BoneIKController")
@js.native
object BoneIKController extends js.Object {
  var _tmpMats: js.Any = js.native
  var _tmpQuat: js.Any = js.native
  var _tmpVecs: js.Any = js.native
}

