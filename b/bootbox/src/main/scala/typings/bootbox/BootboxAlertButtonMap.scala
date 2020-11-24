package typings.bootbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** ButtonMap options for alerts modals */
@js.native
trait BootboxAlertButtonMap extends BootboxButtonMap {
  
  var ok: BootboxButton | js.Function = js.native
}
object BootboxAlertButtonMap {
  
  @scala.inline
  def apply(ok: BootboxButton | js.Function): BootboxAlertButtonMap = {
    val __obj = js.Dynamic.literal(ok = ok.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootboxAlertButtonMap]
  }
  
  @scala.inline
  implicit class BootboxAlertButtonMapOps[Self <: BootboxAlertButtonMap] (val x: Self) extends AnyVal {
    
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
    def setOk(value: BootboxButton | js.Function): Self = this.set("ok", value.asInstanceOf[js.Any])
  }
}
