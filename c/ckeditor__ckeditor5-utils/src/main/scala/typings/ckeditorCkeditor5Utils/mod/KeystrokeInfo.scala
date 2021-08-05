package typings.ckeditorCkeditor5Utils.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeystrokeInfo extends StObject {
  
  var altKey: js.UndefOr[Boolean] = js.undefined
  
  var ctrlKey: js.UndefOr[Boolean] = js.undefined
  
  var keyCode: Double
  
  var shiftKey: js.UndefOr[Boolean] = js.undefined
}
object KeystrokeInfo {
  
  inline def apply(keyCode: Double): KeystrokeInfo = {
    val __obj = js.Dynamic.literal(keyCode = keyCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeystrokeInfo]
  }
  
  extension [Self <: KeystrokeInfo](x: Self) {
    
    inline def setAltKey(value: Boolean): Self = StObject.set(x, "altKey", value.asInstanceOf[js.Any])
    
    inline def setAltKeyUndefined: Self = StObject.set(x, "altKey", js.undefined)
    
    inline def setCtrlKey(value: Boolean): Self = StObject.set(x, "ctrlKey", value.asInstanceOf[js.Any])
    
    inline def setCtrlKeyUndefined: Self = StObject.set(x, "ctrlKey", js.undefined)
    
    inline def setKeyCode(value: Double): Self = StObject.set(x, "keyCode", value.asInstanceOf[js.Any])
    
    inline def setShiftKey(value: Boolean): Self = StObject.set(x, "shiftKey", value.asInstanceOf[js.Any])
    
    inline def setShiftKeyUndefined: Self = StObject.set(x, "shiftKey", js.undefined)
  }
}
