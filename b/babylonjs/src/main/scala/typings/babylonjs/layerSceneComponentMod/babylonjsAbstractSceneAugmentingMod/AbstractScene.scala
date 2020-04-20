package typings.babylonjs.layerSceneComponentMod.babylonjsAbstractSceneAugmentingMod

import typings.babylonjs.layerMod.Layer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AbstractScene extends js.Object {
  /**
    * The list of layers (background and foreground) of the scene
    */
  var layers: js.Array[Layer]
}

object AbstractScene {
  @scala.inline
  def apply(layers: js.Array[Layer]): AbstractScene = {
    val __obj = js.Dynamic.literal(layers = layers.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbstractScene]
  }
}

