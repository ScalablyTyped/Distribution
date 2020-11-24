package typings.carbonComponents.accordionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ @js.native
trait Accordion extends js.Object {
  
  def _checkIfButton(): Boolean = js.native
  
  def _handleKeypress(event: js.Any): Unit = js.native
  
  def _toggle(element: js.Any): Unit = js.native
}
object Accordion {
  
  @scala.inline
  def apply(_checkIfButton: () => Boolean, _handleKeypress: js.Any => Unit, _toggle: js.Any => Unit): Accordion = {
    val __obj = js.Dynamic.literal(_checkIfButton = js.Any.fromFunction0(_checkIfButton), _handleKeypress = js.Any.fromFunction1(_handleKeypress), _toggle = js.Any.fromFunction1(_toggle))
    __obj.asInstanceOf[Accordion]
  }
  
  @scala.inline
  implicit class AccordionOps[Self <: Accordion] (val x: Self) extends AnyVal {
    
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
    def set_checkIfButton(value: () => Boolean): Self = this.set("_checkIfButton", js.Any.fromFunction0(value))
    
    @scala.inline
    def set_handleKeypress(value: js.Any => Unit): Self = this.set("_handleKeypress", js.Any.fromFunction1(value))
    
    @scala.inline
    def set_toggle(value: js.Any => Unit): Self = this.set("_toggle", js.Any.fromFunction1(value))
  }
}
