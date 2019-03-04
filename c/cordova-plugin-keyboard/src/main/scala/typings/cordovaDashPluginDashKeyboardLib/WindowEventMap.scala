package typings
package cordovaDashPluginDashKeyboardLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowEventMap extends js.Object {
  /**
    * This event is fired when the keyboard is fully closed.
    */
  var keyboardDidHide: stdLib.Event
  /**
    * This event is fired when keyboard fully shown.
    */
  var keyboardDidShow: stdLib.Event
  /**
    * This event is fired when the keyboard is fully closed.
    */
  var keyboardHeightWillChange: CordovaKeyboardEvent
  /**
    * This event is fired when the keyboard is fully closed.
    */
  var keyboardWillHide: stdLib.Event
  /**
    * This event fires before keyboard will be shown.
    */
  var keyboardWillShow: stdLib.Event
}

object WindowEventMap {
  @scala.inline
  def apply(
    keyboardDidHide: stdLib.Event,
    keyboardDidShow: stdLib.Event,
    keyboardHeightWillChange: CordovaKeyboardEvent,
    keyboardWillHide: stdLib.Event,
    keyboardWillShow: stdLib.Event
  ): WindowEventMap = {
    val __obj = js.Dynamic.literal(keyboardDidHide = keyboardDidHide, keyboardDidShow = keyboardDidShow, keyboardHeightWillChange = keyboardHeightWillChange, keyboardWillHide = keyboardWillHide, keyboardWillShow = keyboardWillShow)
  
    __obj.asInstanceOf[WindowEventMap]
  }
}

