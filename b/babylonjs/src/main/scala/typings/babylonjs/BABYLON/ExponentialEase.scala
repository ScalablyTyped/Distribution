package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExponentialEase
  extends StObject
     with EasingFunction {
  
  /** Defines the exponent of the function */
  var exponent: Double
}
object ExponentialEase {
  
  inline def apply(
    _easingMode: Any,
    ease: Double => Double,
    easeInCore: Double => Double,
    exponent: Double,
    getEasingMode: () => Double,
    setEasingMode: Double => Unit
  ): ExponentialEase = {
    val __obj = js.Dynamic.literal(_easingMode = _easingMode.asInstanceOf[js.Any], ease = js.Any.fromFunction1(ease), easeInCore = js.Any.fromFunction1(easeInCore), exponent = exponent.asInstanceOf[js.Any], getEasingMode = js.Any.fromFunction0(getEasingMode), setEasingMode = js.Any.fromFunction1(setEasingMode))
    __obj.asInstanceOf[ExponentialEase]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExponentialEase] (val x: Self) extends AnyVal {
    
    inline def setExponent(value: Double): Self = StObject.set(x, "exponent", value.asInstanceOf[js.Any])
  }
}
