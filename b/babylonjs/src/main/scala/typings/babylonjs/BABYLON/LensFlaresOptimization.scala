package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LensFlaresOptimization extends SceneOptimization

object LensFlaresOptimization {
  @scala.inline
  def apply(apply: (Scene, SceneOptimizer) => Boolean, getDescription: () => String, priority: Double): LensFlaresOptimization = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction2(apply), getDescription = js.Any.fromFunction0(getDescription), priority = priority.asInstanceOf[js.Any])
    __obj.asInstanceOf[LensFlaresOptimization]
  }
}

