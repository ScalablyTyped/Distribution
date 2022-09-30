package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EasingFunction
  extends StObject
     with IEasingFunction {
  
  /* private */ var _easingMode: Any
  
  /**
    * @internal
    */
  def easeInCore(gradient: Double): Double
  
  /**
    * Gets the current easing mode.
    * @returns the easing mode
    */
  def getEasingMode(): Double
  
  /**
    * Sets the easing mode of the current function.
    * @param easingMode Defines the willing mode (EASINGMODE_EASEIN, EASINGMODE_EASEOUT or EASINGMODE_EASEINOUT)
    */
  def setEasingMode(easingMode: Double): Unit
}
object EasingFunction {
  
  inline def apply(
    _easingMode: Any,
    ease: Double => Double,
    easeInCore: Double => Double,
    getEasingMode: () => Double,
    setEasingMode: Double => Unit
  ): EasingFunction = {
    val __obj = js.Dynamic.literal(_easingMode = _easingMode.asInstanceOf[js.Any], ease = js.Any.fromFunction1(ease), easeInCore = js.Any.fromFunction1(easeInCore), getEasingMode = js.Any.fromFunction0(getEasingMode), setEasingMode = js.Any.fromFunction1(setEasingMode))
    __obj.asInstanceOf[EasingFunction]
  }
  
  extension [Self <: EasingFunction](x: Self) {
    
    inline def setEaseInCore(value: Double => Double): Self = StObject.set(x, "easeInCore", js.Any.fromFunction1(value))
    
    inline def setGetEasingMode(value: () => Double): Self = StObject.set(x, "getEasingMode", js.Any.fromFunction0(value))
    
    inline def setSetEasingMode(value: Double => Unit): Self = StObject.set(x, "setEasingMode", js.Any.fromFunction1(value))
    
    inline def set_easingMode(value: Any): Self = StObject.set(x, "_easingMode", value.asInstanceOf[js.Any])
  }
}
