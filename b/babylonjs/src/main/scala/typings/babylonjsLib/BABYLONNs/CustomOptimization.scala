package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Defines an optimization based on user defined callback.
     * @description More details at http://doc.babylonjs.com/how_to/how_to_use_sceneoptimizer
     */
@JSGlobal("BABYLON.CustomOptimization")
@js.native
class CustomOptimization () extends SceneOptimization {
  /**
           * Callback called to apply the custom optimization.
           */
  def onApply(scene: Scene, optimizer: SceneOptimizer): scala.Boolean = js.native
  /**
           * Callback called to get custom description
           */
  def onGetDescription(): java.lang.String = js.native
}

