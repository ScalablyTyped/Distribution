package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElasticEase
  extends StObject
     with EasingFunction {
  
  /** Defines the number of oscillations*/
  var oscillations: Double
  
  /** Defines the amplitude of the oscillations*/
  var springiness: Double
}
object ElasticEase {
  
  inline def apply(
    _easingMode: js.Any,
    ease: Double => Double,
    easeInCore: Double => Double,
    getEasingMode: () => Double,
    oscillations: Double,
    setEasingMode: Double => Unit,
    springiness: Double
  ): ElasticEase = {
    val __obj = js.Dynamic.literal(_easingMode = _easingMode.asInstanceOf[js.Any], ease = js.Any.fromFunction1(ease), easeInCore = js.Any.fromFunction1(easeInCore), getEasingMode = js.Any.fromFunction0(getEasingMode), oscillations = oscillations.asInstanceOf[js.Any], setEasingMode = js.Any.fromFunction1(setEasingMode), springiness = springiness.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElasticEase]
  }
  
  extension [Self <: ElasticEase](x: Self) {
    
    inline def setOscillations(value: Double): Self = StObject.set(x, "oscillations", value.asInstanceOf[js.Any])
    
    inline def setSpringiness(value: Double): Self = StObject.set(x, "springiness", value.asInstanceOf[js.Any])
  }
}
