package typings.babylonjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Xrstandardthumbstick extends js.Object {
  
  var `xr-standard-thumbstick`: Xaxis = js.native
  
  var `xr-standard-touchpad`: Xaxis = js.native
}
object Xrstandardthumbstick {
  
  @scala.inline
  def apply(`xr-standard-thumbstick`: Xaxis, `xr-standard-touchpad`: Xaxis): Xrstandardthumbstick = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("xr-standard-thumbstick")(`xr-standard-thumbstick`.asInstanceOf[js.Any])
    __obj.updateDynamic("xr-standard-touchpad")(`xr-standard-touchpad`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Xrstandardthumbstick]
  }
  
  @scala.inline
  implicit class XrstandardthumbstickOps[Self <: Xrstandardthumbstick] (val x: Self) extends AnyVal {
    
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
    def `setXr-standard-thumbstick`(value: Xaxis): Self = this.set("xr-standard-thumbstick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setXr-standard-touchpad`(value: Xaxis): Self = this.set("xr-standard-touchpad", value.asInstanceOf[js.Any])
  }
}
