package typings
package cordovaDashPluginDashNativeDashKeyboardLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Window extends js.Object {
  var NativeKeyboard: NativeKeyboard
}

object Window {
  @scala.inline
  def apply(NativeKeyboard: NativeKeyboard): Window = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("NativeKeyboard")(NativeKeyboard)
    __obj.asInstanceOf[Window]
  }
}

