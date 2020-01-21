package typings.cordovaPluginKeyboard

import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowEventMap extends js.Object {
  /**
    * This event is fired when the keyboard is fully closed.
    */
  var keyboardDidHide: Event_
  /**
    * This event is fired when keyboard fully shown.
    */
  var keyboardDidShow: Event_
  /**
    * This event is fired when the keyboard is fully closed.
    */
  var keyboardHeightWillChange: CordovaKeyboardEvent
  /**
    * This event is fired when the keyboard is fully closed.
    */
  var keyboardWillHide: Event_
  /**
    * This event fires before keyboard will be shown.
    */
  var keyboardWillShow: Event_
}

object WindowEventMap {
  @scala.inline
  def apply(
    keyboardDidHide: Event_,
    keyboardDidShow: Event_,
    keyboardHeightWillChange: CordovaKeyboardEvent,
    keyboardWillHide: Event_,
    keyboardWillShow: Event_
  ): WindowEventMap = {
    val __obj = js.Dynamic.literal(keyboardDidHide = keyboardDidHide.asInstanceOf[js.Any], keyboardDidShow = keyboardDidShow.asInstanceOf[js.Any], keyboardHeightWillChange = keyboardHeightWillChange.asInstanceOf[js.Any], keyboardWillHide = keyboardWillHide.asInstanceOf[js.Any], keyboardWillShow = keyboardWillShow.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WindowEventMap]
  }
}

