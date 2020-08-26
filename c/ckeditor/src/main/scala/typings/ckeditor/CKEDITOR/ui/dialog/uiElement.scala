package typings.ckeditor.CKEDITOR.ui.dialog

import typings.ckeditor.CKEDITOR.dom.element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait uiElement extends js.Object {
  var eventProcessors: js.Any = js.native
  def accessKeyDown(dialog: typings.ckeditor.CKEDITOR.dialog, key: String): Unit = js.native
  def accessKeyUp(dialog: typings.ckeditor.CKEDITOR.dialog, key: String): Unit = js.native
  def disable(): Unit = js.native
  def enable(): Unit = js.native
  def focus(): js.UndefOr[uiElement] = js.native
  def getDialog(): typings.ckeditor.CKEDITOR.dialog = js.native
  def getElement(): element = js.native
  def getInputElement(): element = js.native
  def getValue(): js.Any = js.native
  def isChanged(): Boolean = js.native
  def isEnabled(): Boolean = js.native
  def isFocusable(): Boolean = js.native
  def isVisible(): Boolean = js.native
  def registerEvents(definition: typings.ckeditor.CKEDITOR.dialog.definition.uiElement): uiElement = js.native
  def selectParentTab(): uiElement = js.native
  def setValue(value: js.Any, noChangeEvent: Boolean): js.UndefOr[uiElement] = js.native
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
  @scala.inline
  implicit class uiElementOps[Self <: uiElement] (val x: Self) extends AnyVal {
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
    def setAccessKeyDown(value: (typings.ckeditor.CKEDITOR.dialog, String) => Unit): Self = this.set("accessKeyDown", js.Any.fromFunction2(value))
    @scala.inline
    def setAccessKeyUp(value: (typings.ckeditor.CKEDITOR.dialog, String) => Unit): Self = this.set("accessKeyUp", js.Any.fromFunction2(value))
    @scala.inline
    def setDisable(value: () => Unit): Self = this.set("disable", js.Any.fromFunction0(value))
    @scala.inline
    def setEnable(value: () => Unit): Self = this.set("enable", js.Any.fromFunction0(value))
    @scala.inline
    def setEventProcessors(value: js.Any): Self = this.set("eventProcessors", value.asInstanceOf[js.Any])
    @scala.inline
    def setFocus(value: () => js.UndefOr[uiElement]): Self = this.set("focus", js.Any.fromFunction0(value))
    @scala.inline
    def setGetDialog(value: () => typings.ckeditor.CKEDITOR.dialog): Self = this.set("getDialog", js.Any.fromFunction0(value))
    @scala.inline
    def setGetElement(value: () => element): Self = this.set("getElement", js.Any.fromFunction0(value))
    @scala.inline
    def setGetInputElement(value: () => element): Self = this.set("getInputElement", js.Any.fromFunction0(value))
    @scala.inline
    def setGetValue(value: () => js.Any): Self = this.set("getValue", js.Any.fromFunction0(value))
    @scala.inline
    def setIsChanged(value: () => Boolean): Self = this.set("isChanged", js.Any.fromFunction0(value))
    @scala.inline
    def setIsEnabled(value: () => Boolean): Self = this.set("isEnabled", js.Any.fromFunction0(value))
    @scala.inline
    def setIsFocusable(value: () => Boolean): Self = this.set("isFocusable", js.Any.fromFunction0(value))
    @scala.inline
    def setIsVisible(value: () => Boolean): Self = this.set("isVisible", js.Any.fromFunction0(value))
    @scala.inline
    def setRegisterEvents(value: typings.ckeditor.CKEDITOR.dialog.definition.uiElement => uiElement): Self = this.set("registerEvents", js.Any.fromFunction1(value))
    @scala.inline
    def setSelectParentTab(value: () => uiElement): Self = this.set("selectParentTab", js.Any.fromFunction0(value))
    @scala.inline
    def setSetValue(value: (js.Any, Boolean) => js.UndefOr[uiElement]): Self = this.set("setValue", js.Any.fromFunction2(value))
  }
  
}

