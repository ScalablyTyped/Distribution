package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEffectFallbacks extends js.Object {
  /**
    * Checks to see if more fallbacks are still availible.
    */
  var hasMoreFallbacks: Boolean
  /**
    * Removes the defines that should be removed when falling back.
    * @param currentDefines defines the current define statements for the shader.
    * @param effect defines the current effect we try to compile
    * @returns The resulting defines with defines of the current rank removed.
    */
  def reduce(currentDefines: String, effect: Effect): String
  /**
    * Removes the fallback from the bound mesh.
    */
  def unBindMesh(): Unit
}

object IEffectFallbacks {
  @scala.inline
  def apply(hasMoreFallbacks: Boolean, reduce: (String, Effect) => String, unBindMesh: () => Unit): IEffectFallbacks = {
    val __obj = js.Dynamic.literal(hasMoreFallbacks = hasMoreFallbacks.asInstanceOf[js.Any], reduce = js.Any.fromFunction2(reduce), unBindMesh = js.Any.fromFunction0(unBindMesh))
  
    __obj.asInstanceOf[IEffectFallbacks]
  }
}

