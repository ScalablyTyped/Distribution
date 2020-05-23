package typings.ckeditor.CKEDITOR.ui.dialog

import typings.ckeditor.CKEDITOR.dom.element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait textInput extends labeledElement {
  def accessKeyUp(): Unit
  def getDirectionMarker(): String
  def select(): Unit
  def setDirectionMarker(dir: String): Unit
  def setValue(value: String, noChangeEvent: Boolean): textInput
}

object textInput {
  @scala.inline
  def apply(
    accessKeyDown: (typings.ckeditor.CKEDITOR.dialog, String) => Unit,
    accessKeyUp: () => Unit,
    disable: () => Unit,
    enable: () => Unit,
    eventProcessors: js.Any,
    focus: () => js.UndefOr[uiElement],
    getDialog: () => typings.ckeditor.CKEDITOR.dialog,
    getDirectionMarker: () => String,
    getElement: () => element,
    getInputElement: () => element,
    getLabel: () => String,
    getValue: () => js.Any,
    isChanged: () => Boolean,
    isEnabled: () => Boolean,
    isFocusable: () => Boolean,
    isVisible: () => Boolean,
    registerEvents: typings.ckeditor.CKEDITOR.dialog.definition.uiElement => uiElement,
    select: () => Unit,
    selectParentTab: () => uiElement,
    setDirectionMarker: String => Unit,
    setValue: (String, Boolean) => textInput,
    setlabel: String => labeledElement
  ): textInput = {
    val __obj = js.Dynamic.literal(accessKeyDown = js.Any.fromFunction2(accessKeyDown), accessKeyUp = js.Any.fromFunction0(accessKeyUp), disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction0(enable), eventProcessors = eventProcessors.asInstanceOf[js.Any], focus = js.Any.fromFunction0(focus), getDialog = js.Any.fromFunction0(getDialog), getDirectionMarker = js.Any.fromFunction0(getDirectionMarker), getElement = js.Any.fromFunction0(getElement), getInputElement = js.Any.fromFunction0(getInputElement), getLabel = js.Any.fromFunction0(getLabel), getValue = js.Any.fromFunction0(getValue), isChanged = js.Any.fromFunction0(isChanged), isEnabled = js.Any.fromFunction0(isEnabled), isFocusable = js.Any.fromFunction0(isFocusable), isVisible = js.Any.fromFunction0(isVisible), registerEvents = js.Any.fromFunction1(registerEvents), select = js.Any.fromFunction0(select), selectParentTab = js.Any.fromFunction0(selectParentTab), setDirectionMarker = js.Any.fromFunction1(setDirectionMarker), setValue = js.Any.fromFunction2(setValue), setlabel = js.Any.fromFunction1(setlabel))
    __obj.asInstanceOf[textInput]
  }
}

