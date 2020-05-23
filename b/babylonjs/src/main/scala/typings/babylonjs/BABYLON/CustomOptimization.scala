package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomOptimization extends SceneOptimization {
  /**
    * Callback called to apply the custom optimization.
    */
  def onApply(scene: Scene, optimizer: SceneOptimizer): Boolean
  /**
    * Callback called to get custom description
    */
  def onGetDescription(): String
}

object CustomOptimization {
  @scala.inline
  def apply(
    apply: (Scene, SceneOptimizer) => Boolean,
    getDescription: () => String,
    onApply: (Scene, SceneOptimizer) => Boolean,
    onGetDescription: () => String,
    priority: Double
  ): CustomOptimization = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction2(apply), getDescription = js.Any.fromFunction0(getDescription), onApply = js.Any.fromFunction2(onApply), onGetDescription = js.Any.fromFunction0(onGetDescription), priority = priority.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomOptimization]
  }
}

