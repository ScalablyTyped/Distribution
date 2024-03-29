package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GamepadEventInit
  extends StObject
     with EventInit {
  
  var gamepad: Gamepad
}
object GamepadEventInit {
  
  inline def apply(gamepad: Gamepad): GamepadEventInit = {
    val __obj = js.Dynamic.literal(gamepad = gamepad.asInstanceOf[js.Any])
    __obj.asInstanceOf[GamepadEventInit]
  }
  
  extension [Self <: GamepadEventInit](x: Self) {
    
    inline def setGamepad(value: Gamepad): Self = StObject.set(x, "gamepad", value.asInstanceOf[js.Any])
  }
}
