package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MergeMeshesOptimization extends SceneOptimization {
  var _canBeMerged: js.Any = js.native
  @JSName("apply")
  def apply(scene: Scene, optimizer: SceneOptimizer, updateSelectionTree: Boolean): Boolean = js.native
}

