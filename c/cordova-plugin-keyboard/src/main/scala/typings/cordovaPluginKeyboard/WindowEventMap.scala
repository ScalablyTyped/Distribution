package typings.cordovaPluginKeyboard

import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WindowEventMap extends StObject {
  
  /**
    * This event is fired when the keyboard is fully closed.
    */
  var keyboardDidHide: Event = js.native
  
  /**
    * This event is fired when keyboard fully shown.
    */
  var keyboardDidShow: Event = js.native
  
  /**
    * This event is fired when the keyboard is fully closed.
    */
  var keyboardHeightWillChange: CordovaKeyboardEvent = js.native
  
  /**
    * This event is fired when the keyboard is fully closed.
    */
  var keyboardWillHide: Event = js.native
  
  /**
    * This event fires before keyboard will be shown.
    */
  var keyboardWillShow: Event = js.native
}
object WindowEventMap {
  
  @scala.inline
  def apply(
    keyboardDidHide: Event,
    keyboardDidShow: Event,
    keyboardHeightWillChange: CordovaKeyboardEvent,
    keyboardWillHide: Event,
    keyboardWillShow: Event
  ): WindowEventMap = {
    val __obj = js.Dynamic.literal(keyboardDidHide = keyboardDidHide.asInstanceOf[js.Any], keyboardDidShow = keyboardDidShow.asInstanceOf[js.Any], keyboardHeightWillChange = keyboardHeightWillChange.asInstanceOf[js.Any], keyboardWillHide = keyboardWillHide.asInstanceOf[js.Any], keyboardWillShow = keyboardWillShow.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowEventMap]
  }
  
  @scala.inline
  implicit class WindowEventMapMutableBuilder[Self <: WindowEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKeyboardDidHide(value: Event): Self = StObject.set(x, "keyboardDidHide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyboardDidShow(value: Event): Self = StObject.set(x, "keyboardDidShow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyboardHeightWillChange(value: CordovaKeyboardEvent): Self = StObject.set(x, "keyboardHeightWillChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyboardWillHide(value: Event): Self = StObject.set(x, "keyboardWillHide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyboardWillShow(value: Event): Self = StObject.set(x, "keyboardWillShow", value.asInstanceOf[js.Any])
  }
}
