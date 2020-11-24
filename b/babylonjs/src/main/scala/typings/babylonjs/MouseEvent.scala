package typings.babylonjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MouseEvent extends js.Object {
  
  var mozMovementX: Double = js.native
  
  var mozMovementY: Double = js.native
  
  var msMovementX: Double = js.native
  
  var msMovementY: Double = js.native
  
  var webkitMovementX: Double = js.native
  
  var webkitMovementY: Double = js.native
}
object MouseEvent {
  
  @scala.inline
  def apply(
    mozMovementX: Double,
    mozMovementY: Double,
    msMovementX: Double,
    msMovementY: Double,
    webkitMovementX: Double,
    webkitMovementY: Double
  ): MouseEvent = {
    val __obj = js.Dynamic.literal(mozMovementX = mozMovementX.asInstanceOf[js.Any], mozMovementY = mozMovementY.asInstanceOf[js.Any], msMovementX = msMovementX.asInstanceOf[js.Any], msMovementY = msMovementY.asInstanceOf[js.Any], webkitMovementX = webkitMovementX.asInstanceOf[js.Any], webkitMovementY = webkitMovementY.asInstanceOf[js.Any])
    __obj.asInstanceOf[MouseEvent]
  }
  
  @scala.inline
  implicit class MouseEventOps[Self <: MouseEvent] (val x: Self) extends AnyVal {
    
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
    def setMozMovementX(value: Double): Self = this.set("mozMovementX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMozMovementY(value: Double): Self = this.set("mozMovementY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsMovementX(value: Double): Self = this.set("msMovementX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsMovementY(value: Double): Self = this.set("msMovementY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebkitMovementX(value: Double): Self = this.set("webkitMovementX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebkitMovementY(value: Double): Self = this.set("webkitMovementY", value.asInstanceOf[js.Any])
  }
}
