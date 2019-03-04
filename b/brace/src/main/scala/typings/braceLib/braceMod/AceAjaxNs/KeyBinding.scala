package typings
package braceLib.braceMod.AceAjaxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyBinding extends js.Object {
  def addKeyboardHandler(kb: js.Any, pos: js.Any): scala.Unit
  def getKeyboardHandler(): js.Any
  def onCommandKey(e: js.Any, hashId: js.Any, keyCode: js.Any): scala.Unit
  def onTextInput(text: js.Any): scala.Unit
  def removeKeyboardHandler(kb: js.Any): scala.Boolean
  def setDefaultHandler(kb: js.Any): scala.Unit
  def setKeyboardHandler(kb: js.Any): scala.Unit
}

object KeyBinding {
  @scala.inline
  def apply(
    addKeyboardHandler: js.Function2[js.Any, js.Any, scala.Unit],
    getKeyboardHandler: js.Function0[js.Any],
    onCommandKey: js.Function3[js.Any, js.Any, js.Any, scala.Unit],
    onTextInput: js.Function1[js.Any, scala.Unit],
    removeKeyboardHandler: js.Function1[js.Any, scala.Boolean],
    setDefaultHandler: js.Function1[js.Any, scala.Unit],
    setKeyboardHandler: js.Function1[js.Any, scala.Unit]
  ): KeyBinding = {
    val __obj = js.Dynamic.literal(addKeyboardHandler = addKeyboardHandler, getKeyboardHandler = getKeyboardHandler, onCommandKey = onCommandKey, onTextInput = onTextInput, removeKeyboardHandler = removeKeyboardHandler, setDefaultHandler = setDefaultHandler, setKeyboardHandler = setKeyboardHandler)
  
    __obj.asInstanceOf[KeyBinding]
  }
}

