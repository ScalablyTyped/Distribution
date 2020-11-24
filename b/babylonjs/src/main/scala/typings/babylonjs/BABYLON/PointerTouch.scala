package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PointerTouch extends js.Object {
  
  /**
    * Id of touch. Unique for each finger.
    */
  var pointerId: Double = js.native
  
  /**
    * Event type passed from DOM.
    */
  var `type`: js.Any = js.native
  
  /**
    * X coordinate of touch.
    */
  var x: Double = js.native
  
  /**
    * Y coordinate of touch.
    */
  var y: Double = js.native
}
object PointerTouch {
  
  @scala.inline
  def apply(pointerId: Double, `type`: js.Any, x: Double, y: Double): PointerTouch = {
    val __obj = js.Dynamic.literal(pointerId = pointerId.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointerTouch]
  }
  
  @scala.inline
  implicit class PointerTouchOps[Self <: PointerTouch] (val x: Self) extends AnyVal {
    
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
    def setPointerId(value: Double): Self = this.set("pointerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: js.Any): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
  }
}
