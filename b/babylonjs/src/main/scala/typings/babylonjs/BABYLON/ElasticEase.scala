package typings.babylonjs.BABYLON

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
  implicit class ElasticEaseOps[Self <: ElasticEase] (val x: Self) extends AnyVal {
    
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
    def setOscillations(value: Double): Self = this.set("oscillations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpringiness(value: Double): Self = this.set("springiness", value.asInstanceOf[js.Any])
  }
}
