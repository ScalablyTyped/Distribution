package typings.carbonComponents.modalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ @js.native
trait Modal extends js.Object {
  
  def _changeState(state: js.Any, detail: js.Any, callback: js.Any): Unit = js.native
  
  def _handleFocusin(evt: js.Any): Unit = js.native
  
  var _handleFocusinListener: js.Any = js.native
  
  var _handleKeydownListener: js.Any = js.native
  
  def _hookCloseActions(): Unit = js.native
  
  def createdByLauncher(evt: js.Any): Unit = js.native
  
  def shouldStateBeChanged(state: js.Any): js.Any = js.native
}
object Modal {
  
  @scala.inline
  def apply(
    _changeState: (js.Any, js.Any, js.Any) => Unit,
    _handleFocusin: js.Any => Unit,
    _handleFocusinListener: js.Any,
    _handleKeydownListener: js.Any,
    _hookCloseActions: () => Unit,
    createdByLauncher: js.Any => Unit,
    shouldStateBeChanged: js.Any => js.Any
  ): Modal = {
    val __obj = js.Dynamic.literal(_changeState = js.Any.fromFunction3(_changeState), _handleFocusin = js.Any.fromFunction1(_handleFocusin), _handleFocusinListener = _handleFocusinListener.asInstanceOf[js.Any], _handleKeydownListener = _handleKeydownListener.asInstanceOf[js.Any], _hookCloseActions = js.Any.fromFunction0(_hookCloseActions), createdByLauncher = js.Any.fromFunction1(createdByLauncher), shouldStateBeChanged = js.Any.fromFunction1(shouldStateBeChanged))
    __obj.asInstanceOf[Modal]
  }
  
  @scala.inline
  implicit class ModalOps[Self <: Modal] (val x: Self) extends AnyVal {
    
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
    def set_changeState(value: (js.Any, js.Any, js.Any) => Unit): Self = this.set("_changeState", js.Any.fromFunction3(value))
    
    @scala.inline
    def set_handleFocusin(value: js.Any => Unit): Self = this.set("_handleFocusin", js.Any.fromFunction1(value))
    
    @scala.inline
    def set_handleFocusinListener(value: js.Any): Self = this.set("_handleFocusinListener", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_handleKeydownListener(value: js.Any): Self = this.set("_handleKeydownListener", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_hookCloseActions(value: () => Unit): Self = this.set("_hookCloseActions", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCreatedByLauncher(value: js.Any => Unit): Self = this.set("createdByLauncher", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShouldStateBeChanged(value: js.Any => js.Any): Self = this.set("shouldStateBeChanged", js.Any.fromFunction1(value))
  }
}
