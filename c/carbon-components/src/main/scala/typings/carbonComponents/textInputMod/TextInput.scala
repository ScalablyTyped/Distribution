package typings.carbonComponents.textInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ @js.native
trait TextInput extends js.Object {
  
  def _setIconVisibility(hasIconVisibilityOnIconVisibilityOffPasswordIsVisibleSelectorPasswordVisibilityTooltip: js.Any): Unit = js.native
  
  def _toggle(hasElementButton: js.Any): Unit = js.native
}
object TextInput {
  
  @scala.inline
  def apply(_setIconVisibility: js.Any => Unit, _toggle: js.Any => Unit): TextInput = {
    val __obj = js.Dynamic.literal(_setIconVisibility = js.Any.fromFunction1(_setIconVisibility), _toggle = js.Any.fromFunction1(_toggle))
    __obj.asInstanceOf[TextInput]
  }
  
  @scala.inline
  implicit class TextInputOps[Self <: TextInput] (val x: Self) extends AnyVal {
    
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
    def set_setIconVisibility(value: js.Any => Unit): Self = this.set("_setIconVisibility", js.Any.fromFunction1(value))
    
    @scala.inline
    def set_toggle(value: js.Any => Unit): Self = this.set("_toggle", js.Any.fromFunction1(value))
  }
}
