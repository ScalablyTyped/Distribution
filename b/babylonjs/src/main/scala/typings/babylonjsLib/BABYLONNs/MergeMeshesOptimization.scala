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
  /**
           * This function will be called by the SceneOptimizer when its priority is reached in order to apply the change required by the current optimization
           * @param scene defines the current scene where to apply this optimization
           * @param optimizer defines the current optimizer
           * @param updateSelectionTree defines that the selection octree has to be updated (false by default)
           * @returns true if everything that can be done was applied
           */
  @JSName("apply")
  def apply(scene: Scene, optimizer: SceneOptimizer, updateSelectionTree: scala.Boolean): scala.Boolean = js.native
}

/**
     * Defines an optimization used to merge meshes with compatible materials
     * @description More details at http://doc.babylonjs.com/how_to/how_to_use_sceneoptimizer
     */
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

