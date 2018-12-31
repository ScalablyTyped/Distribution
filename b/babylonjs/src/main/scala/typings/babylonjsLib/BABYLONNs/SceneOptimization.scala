package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines the root class used to create scene optimization to use with SceneOptimizer
  * @description More details at http://doc.babylonjs.com/how_to/how_to_use_sceneoptimizer
  */
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
  priority: scala.Double) = this()
  /**
    * Defines the priority of this optimization (0 by default which means first in the list)
    */
  var priority: scala.Double = js.native
  /**
    * This function will be called by the SceneOptimizer when its priority is reached in order to apply the change required by the current optimization
    * @param scene defines the current scene where to apply this optimization
    * @param optimizer defines the current optimizer
    * @returns true if everything that can be done was applied
    */
  @JSName("apply")
  def apply(scene: Scene, optimizer: SceneOptimizer): scala.Boolean = js.native
  /**
    * Gets a string describing the action executed by the current optimization
    * @returns description string
    */
  def getDescription(): java.lang.String = js.native
}

