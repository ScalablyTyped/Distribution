package typings.chrome.chrome.input.ime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyboardEvent extends StObject {
  
  /**
    * Optional.
    * Whether or not the ALT key is pressed.
    */
  var altKey: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Optional.
    * Whether or not the ALTGR key is pressed.
    * @since Chrome 79.
    */
  var altgrKey: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Optional.
    * Whether or not the CAPS_LOCK is enabled.
    * @since Chrome 29.
    */
  var capsLock: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Optional.
    * Value of the physical key being pressed. The value is not affected by current keyboard layout or modifier state.
    * @since Chrome 26.
    */
  var code: String
  
  /**
    * Optional.
    * Whether or not the CTRL key is pressed.
    */
  var ctrlKey: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Optional.
    * The extension ID of the sender of this keyevent.
    * @since Chrome 34.
    */
  var extensionId: js.UndefOr[String] = js.undefined
  
  /** Value of the key being pressed */
  var key: String
  
  /**
    * Optional.
    * The deprecated HTML keyCode, which is system- and implementation-dependent numerical code signifying the unmodified identifier associated with the key pressed.
    * @since Chrome 37.
    */
  var keyCode: js.UndefOr[Double] = js.undefined
  
  /**
    * Optional.
    * The ID of the request.
    * @deprecated since Chrome 79.
    */
  var requestId: js.UndefOr[String] = js.undefined
  
  /**
    * Optional.
    * Whether or not the SHIFT key is pressed.
    */
  var shiftKey: js.UndefOr[Boolean] = js.undefined
  
  /** One of keyup or keydown. */
  var `type`: String
}
object KeyboardEvent {
  
  inline def apply(code: String, key: String, `type`: String): KeyboardEvent = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyboardEvent]
  }
  
  extension [Self <: KeyboardEvent](x: Self) {
    
    inline def setAltKey(value: Boolean): Self = StObject.set(x, "altKey", value.asInstanceOf[js.Any])
    
    inline def setAltKeyUndefined: Self = StObject.set(x, "altKey", js.undefined)
    
    inline def setAltgrKey(value: Boolean): Self = StObject.set(x, "altgrKey", value.asInstanceOf[js.Any])
    
    inline def setAltgrKeyUndefined: Self = StObject.set(x, "altgrKey", js.undefined)
    
    inline def setCapsLock(value: Boolean): Self = StObject.set(x, "capsLock", value.asInstanceOf[js.Any])
    
    inline def setCapsLockUndefined: Self = StObject.set(x, "capsLock", js.undefined)
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCtrlKey(value: Boolean): Self = StObject.set(x, "ctrlKey", value.asInstanceOf[js.Any])
    
    inline def setCtrlKeyUndefined: Self = StObject.set(x, "ctrlKey", js.undefined)
    
    inline def setExtensionId(value: String): Self = StObject.set(x, "extensionId", value.asInstanceOf[js.Any])
    
    inline def setExtensionIdUndefined: Self = StObject.set(x, "extensionId", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyCode(value: Double): Self = StObject.set(x, "keyCode", value.asInstanceOf[js.Any])
    
    inline def setKeyCodeUndefined: Self = StObject.set(x, "keyCode", js.undefined)
    
    inline def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
    
    inline def setShiftKey(value: Boolean): Self = StObject.set(x, "shiftKey", value.asInstanceOf[js.Any])
    
    inline def setShiftKeyUndefined: Self = StObject.set(x, "shiftKey", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
