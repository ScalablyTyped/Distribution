package typings.ckeditor.CKEDITOR.ui.dialog

import typings.ckeditor.CKEDITOR.dom.element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait uiElement extends js.Object {
  var eventProcessors: js.Any
  def accessKeyDown(dialog: typings.ckeditor.CKEDITOR.dialog, key: String): Unit
  def accessKeyUp(dialog: typings.ckeditor.CKEDITOR.dialog, key: String): Unit
  def disable(): Unit
  def enable(): Unit
  def focus(): js.UndefOr[uiElement]
  def getDialog(): typings.ckeditor.CKEDITOR.dialog
  def getElement(): element
  def getInputElement(): element
  def getValue(): js.Any
  def isChanged(): Boolean
  def isEnabled(): Boolean
  def isFocusable(): Boolean
  def isVisible(): Boolean
  def registerEvents(definition: typings.ckeditor.CKEDITOR.dialog.definition.uiElement): uiElement
  def selectParentTab(): uiElement
  def setValue(value: js.Any, noChangeEvent: Boolean): js.UndefOr[uiElement]
}

object uiElement {
  @scala.inline
  def apply(
    accessKeyDown: (typings.ckeditor.CKEDITOR.dialog, String) => Unit,
    accessKeyUp: (typings.ckeditor.CKEDITOR.dialog, String) => Unit,
    disable: () => Unit,
    enable: () => Unit,
    eventProcessors: js.Any,
    focus: () => js.UndefOr[uiElement],
    getDialog: () => typings.ckeditor.CKEDITOR.dialog,
    getElement: () => element,
    getInputElement: () => element,
    getValue: () => js.Any,
    isChanged: () => Boolean,
    isEnabled: () => Boolean,
    isFocusable: () => Boolean,
    isVisible: () => Boolean,
    registerEvents: typings.ckeditor.CKEDITOR.dialog.definition.uiElement => uiElement,
    selectParentTab: () => uiElement,
    setValue: (js.Any, Boolean) => js.UndefOr[uiElement]
  ): uiElement = {
    val __obj = js.Dynamic.literal(accessKeyDown = js.Any.fromFunction2(accessKeyDown), accessKeyUp = js.Any.fromFunction2(accessKeyUp), disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction0(enable), eventProcessors = eventProcessors.asInstanceOf[js.Any], focus = js.Any.fromFunction0(focus), getDialog = js.Any.fromFunction0(getDialog), getElement = js.Any.fromFunction0(getElement), getInputElement = js.Any.fromFunction0(getInputElement), getValue = js.Any.fromFunction0(getValue), isChanged = js.Any.fromFunction0(isChanged), isEnabled = js.Any.fromFunction0(isEnabled), isFocusable = js.Any.fromFunction0(isFocusable), isVisible = js.Any.fromFunction0(isVisible), registerEvents = js.Any.fromFunction1(registerEvents), selectParentTab = js.Any.fromFunction0(selectParentTab), setValue = js.Any.fromFunction2(setValue))
    __obj.asInstanceOf[uiElement]
  }
}

