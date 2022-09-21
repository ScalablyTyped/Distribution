package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HardwareScalingOptimization
  extends StObject
     with SceneOptimization {
  
  /* private */ var _currentScale: Any
  
  /* private */ var _directionOffset: Any
  
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
  
  inline def apply(
    _currentScale: Any,
    _directionOffset: Any,
    apply: (Scene, SceneOptimizer) => Boolean,
    getDescription: () => String,
    maximumScale: Double,
    priority: Double,
    step: Double
  ): HardwareScalingOptimization = {
    val __obj = js.Dynamic.literal(_currentScale = _currentScale.asInstanceOf[js.Any], _directionOffset = _directionOffset.asInstanceOf[js.Any], apply = js.Any.fromFunction2(apply), getDescription = js.Any.fromFunction0(getDescription), maximumScale = maximumScale.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any])
    __obj.asInstanceOf[HardwareScalingOptimization]
  }
  
  extension [Self <: HardwareScalingOptimization](x: Self) {
    
    inline def setMaximumScale(value: Double): Self = StObject.set(x, "maximumScale", value.asInstanceOf[js.Any])
    
    inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    inline def set_currentScale(value: Any): Self = StObject.set(x, "_currentScale", value.asInstanceOf[js.Any])
    
    inline def set_directionOffset(value: Any): Self = StObject.set(x, "_directionOffset", value.asInstanceOf[js.Any])
  }
}
