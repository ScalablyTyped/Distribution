package typings.carbonComponents.checkboxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ @js.native
trait Checkbox extends js.Object {
  
  def _handleBlur(): Unit = js.native
  
  def _handleClick(): Unit = js.native
  
  def _handleFocus(): Unit = js.native
  
  def _indeterminateCheckbox(): Unit = js.native
  
  def _initCheckbox(): Unit = js.native
  
  def setDisabled(value: js.Any): Unit = js.native
  
  def setState(state: js.Any): Unit = js.native
}
object Checkbox {
  
  @scala.inline
  def apply(
    _handleBlur: () => Unit,
    _handleClick: () => Unit,
    _handleFocus: () => Unit,
    _indeterminateCheckbox: () => Unit,
    _initCheckbox: () => Unit,
    setDisabled: js.Any => Unit,
    setState: js.Any => Unit
  ): Checkbox = {
    val __obj = js.Dynamic.literal(_handleBlur = js.Any.fromFunction0(_handleBlur), _handleClick = js.Any.fromFunction0(_handleClick), _handleFocus = js.Any.fromFunction0(_handleFocus), _indeterminateCheckbox = js.Any.fromFunction0(_indeterminateCheckbox), _initCheckbox = js.Any.fromFunction0(_initCheckbox), setDisabled = js.Any.fromFunction1(setDisabled), setState = js.Any.fromFunction1(setState))
    __obj.asInstanceOf[Checkbox]
  }
  
  @scala.inline
  implicit class CheckboxOps[Self <: Checkbox] (val x: Self) extends AnyVal {
    
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
    def set_handleBlur(value: () => Unit): Self = this.set("_handleBlur", js.Any.fromFunction0(value))
    
    @scala.inline
    def set_handleClick(value: () => Unit): Self = this.set("_handleClick", js.Any.fromFunction0(value))
    
    @scala.inline
    def set_handleFocus(value: () => Unit): Self = this.set("_handleFocus", js.Any.fromFunction0(value))
    
    @scala.inline
    def set_indeterminateCheckbox(value: () => Unit): Self = this.set("_indeterminateCheckbox", js.Any.fromFunction0(value))
    
    @scala.inline
    def set_initCheckbox(value: () => Unit): Self = this.set("_initCheckbox", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetDisabled(value: js.Any => Unit): Self = this.set("setDisabled", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetState(value: js.Any => Unit): Self = this.set("setState", js.Any.fromFunction1(value))
  }
}
