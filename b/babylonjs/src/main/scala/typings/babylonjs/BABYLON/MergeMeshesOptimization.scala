package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.MergeMeshesOptimization")
@js.native
class MergeMeshesOptimization () extends SceneOptimization {
  var _canBeMerged: js.Any = js.native
  @JSName("apply")
  def apply(scene: Scene, optimizer: SceneOptimizer, updateSelectionTree: Boolean): Boolean = js.native
}

/* static members */
@JSGlobal("BABYLON.MergeMeshesOptimization")
@js.native
object MergeMeshesOptimization extends js.Object {
  var _UpdateSelectionTree: js.Any = js.native
  /**
    * Gets or sets a boolean which defines if optimization octree has to be updated
    */
  def UpdateSelectionTree(): Boolean = js.native
  /**
    * Gets or sets a boolean which defines if optimization octree has to be updated
    */
  def UpdateSelectionTree(value: Boolean): js.Any = js.native
}

