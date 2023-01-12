package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BounceEase
  extends StObject
     with EasingFunction {
  
  /** Defines the number of bounces */
  var bounces: Double
  
  /** Defines the amplitude of the bounce */
  var bounciness: Double
}
object BounceEase {
  
  inline def apply(
    _easingMode: Any,
    bounces: Double,
    bounciness: Double,
    ease: Double => Double,
    easeInCore: Double => Double,
    getEasingMode: () => Double,
    setEasingMode: Double => Unit
  ): BounceEase = {
    val __obj = js.Dynamic.literal(_easingMode = _easingMode.asInstanceOf[js.Any], bounces = bounces.asInstanceOf[js.Any], bounciness = bounciness.asInstanceOf[js.Any], ease = js.Any.fromFunction1(ease), easeInCore = js.Any.fromFunction1(easeInCore), getEasingMode = js.Any.fromFunction0(getEasingMode), setEasingMode = js.Any.fromFunction1(setEasingMode))
    __obj.asInstanceOf[BounceEase]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BounceEase] (val x: Self) extends AnyVal {
    
    inline def setBounces(value: Double): Self = StObject.set(x, "bounces", value.asInstanceOf[js.Any])
    
    inline def setBounciness(value: Double): Self = StObject.set(x, "bounciness", value.asInstanceOf[js.Any])
  }
}
