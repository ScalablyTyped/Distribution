package typings.dashjs.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICurrentRepresentationSwitch extends js.Object {
  
  var mt: Double = js.native
  
  var t: Date = js.native
}
object ICurrentRepresentationSwitch {
  
  @scala.inline
  def apply(mt: Double, t: Date): ICurrentRepresentationSwitch = {
    val __obj = js.Dynamic.literal(mt = mt.asInstanceOf[js.Any], t = t.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICurrentRepresentationSwitch]
  }
  
  @scala.inline
  implicit class ICurrentRepresentationSwitchOps[Self <: ICurrentRepresentationSwitch] (val x: Self) extends AnyVal {
    
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
    def setMt(value: Double): Self = this.set("mt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setT(value: Date): Self = this.set("t", value.asInstanceOf[js.Any])
  }
}
