package typings.babylonjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Grip extends StObject {
  
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
  implicit class GripMutableBuilder[Self <: Grip] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGrip(value: String): Self = StObject.set(x, "grip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMenu(value: String): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbstick(value: String): Self = StObject.set(x, "thumbstick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackpad(value: String): Self = StObject.set(x, "trackpad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrigger(value: String): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
  }
}
