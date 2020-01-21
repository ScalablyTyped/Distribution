package typings.brace.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyBinding extends js.Object {
  def addKeyboardHandler(kb: js.Any, pos: js.Any): Unit
  def getKeyboardHandler(): js.Any
  def onCommandKey(e: js.Any, hashId: js.Any, keyCode: js.Any): Unit
  def onTextInput(text: js.Any): Unit
  def removeKeyboardHandler(kb: js.Any): Boolean
  def setDefaultHandler(kb: js.Any): Unit
  def setKeyboardHandler(kb: js.Any): Unit
}

object KeyBinding {
  @scala.inline
  def apply(
    addKeyboardHandler: (js.Any, js.Any) => Unit,
    getKeyboardHandler: () => js.Any,
    onCommandKey: (js.Any, js.Any, js.Any) => Unit,
    onTextInput: js.Any => Unit,
    removeKeyboardHandler: js.Any => Boolean,
    setDefaultHandler: js.Any => Unit,
    setKeyboardHandler: js.Any => Unit
  ): KeyBinding = {
    val __obj = js.Dynamic.literal(addKeyboardHandler = js.Any.fromFunction2(addKeyboardHandler), getKeyboardHandler = js.Any.fromFunction0(getKeyboardHandler), onCommandKey = js.Any.fromFunction3(onCommandKey), onTextInput = js.Any.fromFunction1(onTextInput), removeKeyboardHandler = js.Any.fromFunction1(removeKeyboardHandler), setDefaultHandler = js.Any.fromFunction1(setDefaultHandler), setKeyboardHandler = js.Any.fromFunction1(setKeyboardHandler))
  
    __obj.asInstanceOf[KeyBinding]
  }
}

