package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.CustomOptimization")
@js.native
class CustomOptimization () extends SceneOptimization {
  /**
    * Callback called to apply the custom optimization.
    */
  def onApply(scene: Scene, optimizer: SceneOptimizer): Boolean = js.native
  /**
    * Callback called to get custom description
    */
  def onGetDescription(): String = js.native
}

