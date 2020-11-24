package typings.ckeditor.CKEDITOR.ui.dialog

import typings.ckeditor.CKEDITOR.dom.element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait button extends uiElement {
  
  def accessKeyDown(): Unit = js.native
  
  def accessKeyUp(): Unit = js.native
  
  def click(): js.Any = js.native
}
object button {
  
  @scala.inline
  def apply(
    accessKeyDown: () => Unit,
    accessKeyUp: () => Unit,
    click: () => js.Any,
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
  ): button = {
    val __obj = js.Dynamic.literal(accessKeyDown = js.Any.fromFunction0(accessKeyDown), accessKeyUp = js.Any.fromFunction0(accessKeyUp), click = js.Any.fromFunction0(click), disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction0(enable), eventProcessors = eventProcessors.asInstanceOf[js.Any], focus = js.Any.fromFunction0(focus), getDialog = js.Any.fromFunction0(getDialog), getElement = js.Any.fromFunction0(getElement), getInputElement = js.Any.fromFunction0(getInputElement), getValue = js.Any.fromFunction0(getValue), isChanged = js.Any.fromFunction0(isChanged), isEnabled = js.Any.fromFunction0(isEnabled), isFocusable = js.Any.fromFunction0(isFocusable), isVisible = js.Any.fromFunction0(isVisible), registerEvents = js.Any.fromFunction1(registerEvents), selectParentTab = js.Any.fromFunction0(selectParentTab), setValue = js.Any.fromFunction2(setValue))
    __obj.asInstanceOf[button]
  }
  
  @scala.inline
  implicit class buttonOps[Self <: button] (val x: Self) extends AnyVal {
    
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
    def setAccessKeyDown(value: () => Unit): Self = this.set("accessKeyDown", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAccessKeyUp(value: () => Unit): Self = this.set("accessKeyUp", js.Any.fromFunction0(value))
    
    @scala.inline
    def setClick(value: () => js.Any): Self = this.set("click", js.Any.fromFunction0(value))
  }
}
