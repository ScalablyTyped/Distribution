package typings.babylonjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Grip extends js.Object {
  
  var grip: String = js.native
  
  var menu: String = js.native
  
  var thumbstick: String = js.native
  
  var trackpad: String = js.native
  
  var trigger: String = js.native
}
object Grip {
  
  @scala.inline
  def apply(grip: String, menu: String, thumbstick: String, trackpad: String, trigger: String): Grip = {
    val __obj = js.Dynamic.literal(grip = grip.asInstanceOf[js.Any], menu = menu.asInstanceOf[js.Any], thumbstick = thumbstick.asInstanceOf[js.Any], trackpad = trackpad.asInstanceOf[js.Any], trigger = trigger.asInstanceOf[js.Any])
    __obj.asInstanceOf[Grip]
  }
  
  @scala.inline
  implicit class GripOps[Self <: Grip] (val x: Self) extends AnyVal {
    
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
    def setGrip(value: String): Self = this.set("grip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMenu(value: String): Self = this.set("menu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbstick(value: String): Self = this.set("thumbstick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackpad(value: String): Self = this.set("trackpad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrigger(value: String): Self = this.set("trigger", value.asInstanceOf[js.Any])
  }
}
