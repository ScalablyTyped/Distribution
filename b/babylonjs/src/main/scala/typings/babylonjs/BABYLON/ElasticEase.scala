package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ElasticEase extends EasingFunction {
  
  /** Defines the number of oscillations*/
  var oscillations: Double = js.native
  
  /** Defines the amplitude of the oscillations*/
  var springiness: Double = js.native
}
object ElasticEase {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class ElasticEaseMutableBuilder[Self <: ElasticEase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOscillations(value: Double): Self = StObject.set(x, "oscillations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpringiness(value: Double): Self = StObject.set(x, "springiness", value.asInstanceOf[js.Any])
  }
}
