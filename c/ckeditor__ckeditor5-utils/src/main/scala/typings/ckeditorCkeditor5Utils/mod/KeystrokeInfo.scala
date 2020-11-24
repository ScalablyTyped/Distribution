package typings.ckeditorCkeditor5Utils.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeystrokeInfo extends js.Object {
  
  var altKey: js.UndefOr[Boolean] = js.native
  
  var ctrlKey: js.UndefOr[Boolean] = js.native
  
  var keyCode: Double = js.native
  
  var shiftKey: js.UndefOr[Boolean] = js.native
}
object KeystrokeInfo {
  
  @scala.inline
  def apply(keyCode: Double): KeystrokeInfo = {
    val __obj = js.Dynamic.literal(keyCode = keyCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeystrokeInfo]
  }
  
  @scala.inline
  implicit class KeystrokeInfoOps[Self <: KeystrokeInfo] (val x: Self) extends AnyVal {
    
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
    def setKeyCode(value: Double): Self = this.set("keyCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAltKey(value: Boolean): Self = this.set("altKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAltKey: Self = this.set("altKey", js.undefined)
    
    @scala.inline
    def setCtrlKey(value: Boolean): Self = this.set("ctrlKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCtrlKey: Self = this.set("ctrlKey", js.undefined)
    
    @scala.inline
    def setShiftKey(value: Boolean): Self = this.set("shiftKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShiftKey: Self = this.set("shiftKey", js.undefined)
  }
}
