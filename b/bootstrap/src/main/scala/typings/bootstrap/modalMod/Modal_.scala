package typings.bootstrap.modalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Modal_ extends js.Object {
  
  /**
    * Destroys an element's dropdown.
    */
  def dispose(): Unit = js.native
  
  /**
    * Manually readjust the modal’s position if the height of a modal
    * changes while it is open (i.e. in case a scrollbar appears).
    */
  def handleUpdate(): Unit = js.native
  
  /**
    * Manually hides a modal. Returns to the caller before the modal has
    * actually been hidden (i.e. before the hidden.bs.modal event occurs).
    */
  def hide(): Unit = js.native
  
  /**
    * Manually opens a modal. Returns to the caller before the modal has
    * actually been shown (i.e. before the shown.bs.modal event occurs).
    */
  def show(): Unit = js.native
  
  /**
    * Manually toggles a modal. Returns to the caller before the modal has
    * actually been shown or hidden (i.e. before the shown.bs.modal or
    * hidden.bs.modal event occurs).
    */
  def toggle(): Unit = js.native
}
object Modal_ {
  
  @scala.inline
  def apply(
    dispose: () => Unit,
    handleUpdate: () => Unit,
    hide: () => Unit,
    show: () => Unit,
    toggle: () => Unit
  ): Modal_ = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), handleUpdate = js.Any.fromFunction0(handleUpdate), hide = js.Any.fromFunction0(hide), show = js.Any.fromFunction0(show), toggle = js.Any.fromFunction0(toggle))
    __obj.asInstanceOf[Modal_]
  }
  
  @scala.inline
  implicit class Modal_Ops[Self <: Modal_] (val x: Self) extends AnyVal {
    
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
    def setDispose(value: () => Unit): Self = this.set("dispose", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHandleUpdate(value: () => Unit): Self = this.set("handleUpdate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHide(value: () => Unit): Self = this.set("hide", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShow(value: () => Unit): Self = this.set("show", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToggle(value: () => Unit): Self = this.set("toggle", js.Any.fromFunction0(value))
  }
}
