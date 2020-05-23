package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HardwareScalingOptimization extends SceneOptimization {
  var _currentScale: js.Any
  var _directionOffset: js.Any
  /**
    * Defines the maximum scale to use (2 by default)
    */
  var maximumScale: Double
  /**
    * Defines the step to use between two passes (0.5 by default)
    */
  var step: Double
}

object HardwareScalingOptimization {
  @scala.inline
  def apply(
    _currentScale: js.Any,
    _directionOffset: js.Any,
    apply: (Scene, SceneOptimizer) => Boolean,
    getDescription: () => String,
    maximumScale: Double,
    priority: Double,
    step: Double
  ): HardwareScalingOptimization = {
    val __obj = js.Dynamic.literal(_currentScale = _currentScale.asInstanceOf[js.Any], _directionOffset = _directionOffset.asInstanceOf[js.Any], apply = js.Any.fromFunction2(apply), getDescription = js.Any.fromFunction0(getDescription), maximumScale = maximumScale.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any])
    __obj.asInstanceOf[HardwareScalingOptimization]
  }
}

