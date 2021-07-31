package typings.betterScroll.mod

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SlideOption extends StObject {
  
  var el: Element
  
  var listenFlick: Boolean
  
  var loop: Boolean
  
  var speed: Double
  
  var stepX: Double
  
  var stepY: Double
  
  var threshold: Double
}
object SlideOption {
  
  @scala.inline
  def apply(
    el: Element,
    listenFlick: Boolean,
    loop: Boolean,
    speed: Double,
    stepX: Double,
    stepY: Double,
    threshold: Double
  ): SlideOption = {
    val __obj = js.Dynamic.literal(el = el.asInstanceOf[js.Any], listenFlick = listenFlick.asInstanceOf[js.Any], loop = loop.asInstanceOf[js.Any], speed = speed.asInstanceOf[js.Any], stepX = stepX.asInstanceOf[js.Any], stepY = stepY.asInstanceOf[js.Any], threshold = threshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlideOption]
  }
  
  @scala.inline
  implicit class SlideOptionMutableBuilder[Self <: SlideOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEl(value: Element): Self = StObject.set(x, "el", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListenFlick(value: Boolean): Self = StObject.set(x, "listenFlick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepX(value: Double): Self = StObject.set(x, "stepX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepY(value: Double): Self = StObject.set(x, "stepY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
  }
}
