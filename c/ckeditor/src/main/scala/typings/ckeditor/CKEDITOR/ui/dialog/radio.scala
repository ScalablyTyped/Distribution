package typings.ckeditor.CKEDITOR.ui.dialog

import typings.ckeditor.CKEDITOR.dom.element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait radio extends labeledElement {
  def accessKeyUp(): Unit = js.native
  def setValue(value: String, noChangeEvent: Boolean): js.UndefOr[scala.Nothing] = js.native
}

object radio {
  @scala.inline
  def apply(
    accessKeyDown: (typings.ckeditor.CKEDITOR.dialog, String) => Unit,
    accessKeyUp: () => Unit,
    disable: () => Unit,
    enable: () => Unit,
    eventProcessors: js.Any,
    focus: () => js.UndefOr[uiElement],
    getDialog: () => typings.ckeditor.CKEDITOR.dialog,
    getElement: () => element,
    getInputElement: () => element,
    getLabel: () => String,
    getValue: () => js.Any,
    isChanged: () => Boolean,
    isEnabled: () => Boolean,
    isFocusable: () => Boolean,
    isVisible: () => Boolean,
    registerEvents: typings.ckeditor.CKEDITOR.dialog.definition.uiElement => uiElement,
    selectParentTab: () => uiElement,
    setValue: (String, Boolean) => js.UndefOr[scala.Nothing],
    setlabel: String => labeledElement
  ): radio = {
    val __obj = js.Dynamic.literal(accessKeyDown = js.Any.fromFunction2(accessKeyDown), accessKeyUp = js.Any.fromFunction0(accessKeyUp), disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction0(enable), eventProcessors = eventProcessors.asInstanceOf[js.Any], focus = js.Any.fromFunction0(focus), getDialog = js.Any.fromFunction0(getDialog), getElement = js.Any.fromFunction0(getElement), getInputElement = js.Any.fromFunction0(getInputElement), getLabel = js.Any.fromFunction0(getLabel), getValue = js.Any.fromFunction0(getValue), isChanged = js.Any.fromFunction0(isChanged), isEnabled = js.Any.fromFunction0(isEnabled), isFocusable = js.Any.fromFunction0(isFocusable), isVisible = js.Any.fromFunction0(isVisible), registerEvents = js.Any.fromFunction1(registerEvents), selectParentTab = js.Any.fromFunction0(selectParentTab), setValue = js.Any.fromFunction2(setValue), setlabel = js.Any.fromFunction1(setlabel))
    __obj.asInstanceOf[radio]
  }
  @scala.inline
  implicit class radioOps[Self <: radio] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAccessKeyUp(value: () => Unit): Self = this.set("accessKeyUp", js.Any.fromFunction0(value))
    @scala.inline
    def setSetValue(value: (String, Boolean) => js.UndefOr[scala.Nothing]): Self = this.set("setValue", js.Any.fromFunction2(value))
  }
  
}

