package typings.betterScroll.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MouseWheelOption extends StObject {
  
  var easeTime: Double
  
  var invert: Boolean
  
  var speed: Double
}
object MouseWheelOption {
  
  @scala.inline
  def apply(easeTime: Double, invert: Boolean, speed: Double): MouseWheelOption = {
    val __obj = js.Dynamic.literal(easeTime = easeTime.asInstanceOf[js.Any], invert = invert.asInstanceOf[js.Any], speed = speed.asInstanceOf[js.Any])
    __obj.asInstanceOf[MouseWheelOption]
  }
  
  @scala.inline
  implicit class MouseWheelOptionMutableBuilder[Self <: MouseWheelOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEaseTime(value: Double): Self = StObject.set(x, "easeTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvert(value: Boolean): Self = StObject.set(x, "invert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
  }
}
