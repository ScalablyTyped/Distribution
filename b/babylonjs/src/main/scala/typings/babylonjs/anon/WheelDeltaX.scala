package typings.babylonjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WheelDeltaX extends js.Object {
  
  var wheelDeltaX: Double = js.native
  
  var wheelDeltaY: Double = js.native
  
  var wheelDeltaZ: Double = js.native
}
object WheelDeltaX {
  
  @scala.inline
  def apply(wheelDeltaX: Double, wheelDeltaY: Double, wheelDeltaZ: Double): WheelDeltaX = {
    val __obj = js.Dynamic.literal(wheelDeltaX = wheelDeltaX.asInstanceOf[js.Any], wheelDeltaY = wheelDeltaY.asInstanceOf[js.Any], wheelDeltaZ = wheelDeltaZ.asInstanceOf[js.Any])
    __obj.asInstanceOf[WheelDeltaX]
  }
  
  @scala.inline
  implicit class WheelDeltaXOps[Self <: WheelDeltaX] (val x: Self) extends AnyVal {
    
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
    def setWheelDeltaX(value: Double): Self = this.set("wheelDeltaX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWheelDeltaY(value: Double): Self = this.set("wheelDeltaY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWheelDeltaZ(value: Double): Self = this.set("wheelDeltaZ", value.asInstanceOf[js.Any])
  }
}
