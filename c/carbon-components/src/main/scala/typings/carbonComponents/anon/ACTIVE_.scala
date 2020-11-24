package typings.carbonComponents.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ACTIVE_ extends js.Object {
  
  var ACTIVE: String = js.native
  
  var ERROR: String = js.native
  
  var FINISHED: String = js.native
  
  var INACTIVE: String = js.native
}
object ACTIVE_ {
  
  @scala.inline
  def apply(ACTIVE: String, ERROR: String, FINISHED: String, INACTIVE: String): ACTIVE_ = {
    val __obj = js.Dynamic.literal(ACTIVE = ACTIVE.asInstanceOf[js.Any], ERROR = ERROR.asInstanceOf[js.Any], FINISHED = FINISHED.asInstanceOf[js.Any], INACTIVE = INACTIVE.asInstanceOf[js.Any])
    __obj.asInstanceOf[ACTIVE_]
  }
  
  @scala.inline
  implicit class ACTIVE_Ops[Self <: ACTIVE_] (val x: Self) extends AnyVal {
    
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
    def setACTIVE(value: String): Self = this.set("ACTIVE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setERROR(value: String): Self = this.set("ERROR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFINISHED(value: String): Self = this.set("FINISHED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setINACTIVE(value: String): Self = this.set("INACTIVE", value.asInstanceOf[js.Any])
  }
}
