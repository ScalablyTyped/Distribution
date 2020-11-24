package typings.babylonjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Gamepad extends js.Object {
  
  val displayId: Double = js.native
}
object Gamepad {
  
  @scala.inline
  def apply(displayId: Double): Gamepad = {
    val __obj = js.Dynamic.literal(displayId = displayId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Gamepad]
  }
  
  @scala.inline
  implicit class GamepadOps[Self <: Gamepad] (val x: Self) extends AnyVal {
    
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
    def setDisplayId(value: Double): Self = this.set("displayId", value.asInstanceOf[js.Any])
  }
}
