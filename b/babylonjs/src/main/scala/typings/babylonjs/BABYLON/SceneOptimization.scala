package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SceneOptimization extends js.Object {
  /**
    * Defines the priority of this optimization (0 by default which means first in the list)
    */
  var priority: Double
  /**
    * This function will be called by the SceneOptimizer when its priority is reached in order to apply the change required by the current optimization
    * @param scene defines the current scene where to apply this optimization
    * @param optimizer defines the current optimizer
    * @returns true if everything that can be done was applied
    */
  @JSName("apply")
  def apply(scene: Scene, optimizer: SceneOptimizer): Boolean
  /**
    * Gets a string describing the action executed by the current optimization
    * @returns description string
    */
  def getDescription(): String
}

object SceneOptimization {
  @scala.inline
  def apply(apply: (Scene, SceneOptimizer) => Boolean, getDescription: () => String, priority: Double): SceneOptimization = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction2(apply), getDescription = js.Any.fromFunction0(getDescription), priority = priority.asInstanceOf[js.Any])
    __obj.asInstanceOf[SceneOptimization]
  }
}

