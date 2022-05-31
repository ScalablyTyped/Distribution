package typings.babylonjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Grip extends StObject {
  
  var grip: String
  
  var menu: String
  
  var thumbstick: String
  
  var trackpad: String
  
  var trigger: String
}
object Grip {
  
  inline def apply(grip: String, menu: String, thumbstick: String, trackpad: String, trigger: String): Grip = {
    val __obj = js.Dynamic.literal(grip = grip.asInstanceOf[js.Any], menu = menu.asInstanceOf[js.Any], thumbstick = thumbstick.asInstanceOf[js.Any], trackpad = trackpad.asInstanceOf[js.Any], trigger = trigger.asInstanceOf[js.Any])
    __obj.asInstanceOf[Grip]
  }
  
  extension [Self <: Grip](x: Self) {
    
    inline def setGrip(value: String): Self = StObject.set(x, "grip", value.asInstanceOf[js.Any])
    
    inline def setMenu(value: String): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
    
    inline def setThumbstick(value: String): Self = StObject.set(x, "thumbstick", value.asInstanceOf[js.Any])
    
    inline def setTrackpad(value: String): Self = StObject.set(x, "trackpad", value.asInstanceOf[js.Any])
    
    inline def setTrigger(value: String): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
  }
}
