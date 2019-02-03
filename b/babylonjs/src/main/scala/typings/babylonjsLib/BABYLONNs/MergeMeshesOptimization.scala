package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines an optimization used to merge meshes with compatible materials
  * @description More details at http://doc.babylonjs.com/how_to/how_to_use_sceneoptimizer
  */
@JSGlobal("BABYLON.MergeMeshesOptimization")
@js.native
class MergeMeshesOptimization () extends SceneOptimization {
  var _canBeMerged: js.Any = js.native
  @JSName("apply")
  def apply(scene: Scene, optimizer: SceneOptimizer, updateSelectionTree: scala.Boolean): scala.Boolean = js.native
}

/* static members */
@JSGlobal("BABYLON.MergeMeshesOptimization")
@js.native
object MergeMeshesOptimization extends js.Object {
  /**
    * Gets or sets a boolean which defines if optimization octree has to be updated
    */
  /**
    * Gets or sets a boolean which defines if optimization octree has to be updated
    */
  var UpdateSelectionTree: scala.Boolean = js.native
  var _UpdateSelectionTree: js.Any = js.native
}

