package typings.ckeditorCkeditor5Utils.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeystrokeInfo extends StObject {
  
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
  implicit class KeystrokeInfoMutableBuilder[Self <: KeystrokeInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAltKey(value: Boolean): Self = StObject.set(x, "altKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAltKeyUndefined: Self = StObject.set(x, "altKey", js.undefined)
    
    @scala.inline
    def setCtrlKey(value: Boolean): Self = StObject.set(x, "ctrlKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCtrlKeyUndefined: Self = StObject.set(x, "ctrlKey", js.undefined)
    
    @scala.inline
    def setKeyCode(value: Double): Self = StObject.set(x, "keyCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShiftKey(value: Boolean): Self = StObject.set(x, "shiftKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShiftKeyUndefined: Self = StObject.set(x, "shiftKey", js.undefined)
  }
}
