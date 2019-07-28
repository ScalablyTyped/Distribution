package typings.cordovaDashPluginDashKeyboard

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowEventMap extends js.Object {
  /**
    * This event is fired when the keyboard is fully closed.
    */
  var keyboardDidHide: Event
  /**
    * This event is fired when keyboard fully shown.
    */
  var keyboardDidShow: Event
  /**
    * This event is fired when the keyboard is fully closed.
    */
  var keyboardHeightWillChange: CordovaKeyboardEvent
  /**
    * This event is fired when the keyboard is fully closed.
    */
  var keyboardWillHide: Event
  /**
    * This event fires before keyboard will be shown.
    */
  var keyboardWillShow: Event
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
    val __obj = js.Dynamic.literal(keyboardDidHide = keyboardDidHide, keyboardDidShow = keyboardDidShow, keyboardHeightWillChange = keyboardHeightWillChange, keyboardWillHide = keyboardWillHide, keyboardWillShow = keyboardWillShow)
  
    __obj.asInstanceOf[WindowEventMap]
  }
}

