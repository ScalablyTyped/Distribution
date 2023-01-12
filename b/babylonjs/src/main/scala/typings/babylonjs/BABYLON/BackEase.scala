package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackEase
  extends StObject
     with EasingFunction {
  
  /** Defines the amplitude of the function */
  var amplitude: Double
}
object BackEase {
  
  inline def apply(
    _easingMode: Any,
    amplitude: Double,
    ease: Double => Double,
    easeInCore: Double => Double,
    getEasingMode: () => Double,
    setEasingMode: Double => Unit
  ): BackEase = {
    val __obj = js.Dynamic.literal(_easingMode = _easingMode.asInstanceOf[js.Any], amplitude = amplitude.asInstanceOf[js.Any], ease = js.Any.fromFunction1(ease), easeInCore = js.Any.fromFunction1(easeInCore), getEasingMode = js.Any.fromFunction0(getEasingMode), setEasingMode = js.Any.fromFunction1(setEasingMode))
    __obj.asInstanceOf[BackEase]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BackEase] (val x: Self) extends AnyVal {
    
    inline def setAmplitude(value: Double): Self = StObject.set(x, "amplitude", value.asInstanceOf[js.Any])
  }
}
