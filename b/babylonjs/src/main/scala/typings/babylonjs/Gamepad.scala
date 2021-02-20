package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Gamepad extends StObject {
  
  val displayId: Double = js.native
}
object Gamepad {
  
  @scala.inline
  def apply(displayId: Double): Gamepad = {
    val __obj = js.Dynamic.literal(displayId = displayId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Gamepad]
  }
  
  @scala.inline
  implicit class GamepadMutableBuilder[Self <: Gamepad] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayId(value: Double): Self = StObject.set(x, "displayId", value.asInstanceOf[js.Any])
  }
}
