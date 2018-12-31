package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines the root class used to create scene optimization to use with SceneOptimizer
  * @description More details at http://doc.babylonjs.com/how_to/how_to_use_sceneoptimizer
  */
@JSImport("babylonjs", "SceneOptimization")
@js.native
/**
  * Creates the SceneOptimization object
  * @param priority defines the priority of this optimization (0 by default which means first in the list)
  * @param desc defines the description associated with the optimization
  */
class SceneOptimization ()
  extends babylonjsLib.BABYLONNs.SceneOptimization {
  def this(/**
    * Defines the priority of this optimization (0 by default which means first in the list)
    */
  priority: scala.Double) = this()
}

