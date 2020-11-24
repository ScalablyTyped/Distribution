package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HardwareScalingOptimization extends SceneOptimization {
  
  var _currentScale: js.Any = js.native
  
  var _directionOffset: js.Any = js.native
  
  /**
    * Defines the maximum scale to use (2 by default)
    */
  var maximumScale: Double = js.native
  
  /**
    * Defines the step to use between two passes (0.5 by default)
    */
  var step: Double = js.native
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
  
  @scala.inline
  implicit class HardwareScalingOptimizationOps[Self <: HardwareScalingOptimization] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def set_currentScale(value: js.Any): Self = this.set("_currentScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_directionOffset(value: js.Any): Self = this.set("_directionOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumScale(value: Double): Self = this.set("maximumScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStep(value: Double): Self = this.set("step", value.asInstanceOf[js.Any])
  }
}
