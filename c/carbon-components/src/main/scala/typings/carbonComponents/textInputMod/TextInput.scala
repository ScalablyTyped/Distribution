package typings.carbonComponents.textInputMod

import typings.carbonComponents.anon.Button
import typings.carbonComponents.anon.IconVisibilityOff
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ @js.native
trait TextInput extends js.Object {
  def _setIconVisibility(
    hasIconVisibilityOnIconVisibilityOffPasswordIsVisibleSelectorPasswordVisibilityTooltip: IconVisibilityOff
  ): Unit = js.native
  def _toggle(hasElementButton: Button): Unit = js.native
}

object TextInput {
  @scala.inline
  def apply(_setIconVisibility: IconVisibilityOff => Unit, _toggle: Button => Unit): TextInput = {
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
    def set_setIconVisibility(value: IconVisibilityOff => Unit): Self = this.set("_setIconVisibility", js.Any.fromFunction1(value))
    @scala.inline
    def set_toggle(value: Button => Unit): Self = this.set("_toggle", js.Any.fromFunction1(value))
  }
  
}

