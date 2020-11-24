package typings.carbonComponents.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BACKWARD extends js.Object {
  
  var BACKWARD: Double = js.native
  
  var FORWARD: Double = js.native
}
object BACKWARD {
  
  @scala.inline
  def apply(BACKWARD: Double, FORWARD: Double): BACKWARD = {
    val __obj = js.Dynamic.literal(BACKWARD = BACKWARD.asInstanceOf[js.Any], FORWARD = FORWARD.asInstanceOf[js.Any])
    __obj.asInstanceOf[BACKWARD]
  }
  
  @scala.inline
  implicit class BACKWARDOps[Self <: BACKWARD] (val x: Self) extends AnyVal {
    
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
    def setBACKWARD(value: Double): Self = this.set("BACKWARD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFORWARD(value: Double): Self = this.set("FORWARD", value.asInstanceOf[js.Any])
  }
}
