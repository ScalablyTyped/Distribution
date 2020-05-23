package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextureOptimization extends SceneOptimization {
  /**
    * Defines the maximum sized allowed for textures (1024 is the default value). If a texture is bigger, it will be scaled down using a factor defined by the step parameter
    */
  var maximumSize: Double
  /**
    * Defines the factor (0.5 by default) used to scale down textures bigger than maximum sized allowed.
    */
  var step: Double
}

object TextureOptimization {
  @scala.inline
  def apply(
    apply: (Scene, SceneOptimizer) => Boolean,
    getDescription: () => String,
    maximumSize: Double,
    priority: Double,
    step: Double
  ): TextureOptimization = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction2(apply), getDescription = js.Any.fromFunction0(getDescription), maximumSize = maximumSize.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextureOptimization]
  }
}

