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
  
  @scala.inline
  def apply(code: String, key: String, `type`: String): KeyboardEvent = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyboardEvent]
  }
  
  @scala.inline
  implicit class KeyboardEventMutableBuilder[Self <: KeyboardEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAltKey(value: Boolean): Self = StObject.set(x, "altKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAltKeyUndefined: Self = StObject.set(x, "altKey", js.undefined)
    
    @scala.inline
    def setAltgrKey(value: Boolean): Self = StObject.set(x, "altgrKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAltgrKeyUndefined: Self = StObject.set(x, "altgrKey", js.undefined)
    
    @scala.inline
    def setCapsLock(value: Boolean): Self = StObject.set(x, "capsLock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapsLockUndefined: Self = StObject.set(x, "capsLock", js.undefined)
    
    @scala.inline
    def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCtrlKey(value: Boolean): Self = StObject.set(x, "ctrlKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCtrlKeyUndefined: Self = StObject.set(x, "ctrlKey", js.undefined)
    
    @scala.inline
    def setExtensionId(value: String): Self = StObject.set(x, "extensionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtensionIdUndefined: Self = StObject.set(x, "extensionId", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyCode(value: Double): Self = StObject.set(x, "keyCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyCodeUndefined: Self = StObject.set(x, "keyCode", js.undefined)
    
    @scala.inline
    def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
    
    @scala.inline
    def setShiftKey(value: Boolean): Self = StObject.set(x, "shiftKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShiftKeyUndefined: Self = StObject.set(x, "shiftKey", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
