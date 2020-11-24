package typings.betterScroll.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MouseWheelOption extends js.Object {
  
  var easeTime: Double = js.native
  
  var invert: Boolean = js.native
  
  var speed: Double = js.native
}
object MouseWheelOption {
  
  @scala.inline
  def apply(easeTime: Double, invert: Boolean, speed: Double): MouseWheelOption = {
    val __obj = js.Dynamic.literal(easeTime = easeTime.asInstanceOf[js.Any], invert = invert.asInstanceOf[js.Any], speed = speed.asInstanceOf[js.Any])
    __obj.asInstanceOf[MouseWheelOption]
  }
  
  @scala.inline
  implicit class MouseWheelOptionOps[Self <: MouseWheelOption] (val x: Self) extends AnyVal {
    
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
    def setEaseTime(value: Double): Self = this.set("easeTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvert(value: Boolean): Self = this.set("invert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpeed(value: Double): Self = this.set("speed", value.asInstanceOf[js.Any])
  }
}
