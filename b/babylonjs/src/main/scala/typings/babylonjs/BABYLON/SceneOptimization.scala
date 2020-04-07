package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.SceneOptimization")
@js.native
/**
  * Creates the SceneOptimization object
  * @param priority defines the priority of this optimization (0 by default which means first in the list)
  * @param desc defines the description associated with the optimization
  */
class SceneOptimization () extends js.Object {
  def this(/**
    * Defines the priority of this optimization (0 by default which means first in the list)
    */
  priority: Double) = this()
  /**
    * Defines the priority of this optimization (0 by default which means first in the list)
    */
  var priority: Double = js.native
  /**
    * This function will be called by the SceneOptimizer when its priority is reached in order to apply the change required by the current optimization
    * @param scene defines the current scene where to apply this optimization
    * @param optimizer defines the current optimizer
    * @returns true if everything that can be done was applied
    */
  @JSName("apply")
  def apply(scene: Scene, optimizer: SceneOptimizer): Boolean = js.native
  /**
    * Gets a string describing the action executed by the current optimization
    * @returns description string
    */
  def getDescription(): String = js.native
}

