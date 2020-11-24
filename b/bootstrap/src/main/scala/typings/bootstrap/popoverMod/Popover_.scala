package typings.bootstrap.popoverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Popover_ extends js.Object {
  
  /**
    * Removes the ability for an element’s popover to be shown. The popover
    * will only be able to be shown if it is re-enabled.
    */
  def disable(): Unit = js.native
  
  /**
    * Hides and destroys an element’s popover. Popovers that use delegation
    * (which are created using the selector option) cannot be individually
    * destroyed on descendant trigger elements.
    */
  def dispose(): Unit = js.native
  
  /**
    * Gives an element’s popover the ability to be shown. Popovers are
    * enabled by default.
    */
  def enable(): Unit = js.native
  
  /**
    * Hides an element’s popover. Returns to the caller before the popover
    * has actually been hidden (i.e. before the hidden.bs.popover event
    * occurs). This is considered a “manual” triggering of the popover.
    */
  def hide(): Unit = js.native
  
  /**
    * Reveals an element’s popover. Returns to the caller before the
    * popover has actually been shown (i.e. before the shown.bs.popover
    * event occurs). This is considered a “manual” triggering of the
    * popover. Popovers whose title and content are both zero-length are
    * never displayed.
    */
  def show(): Unit = js.native
  
  /**
    * Toggles an element’s popover. Returns to the caller before the
    * popover has actually been shown or hidden (i.e. before the
    * shown.bs.popover or hidden.bs.popover event occurs). This is
    * considered a “manual” triggering of the popover.
    */
  def toggle(): Unit = js.native
  
  /**
    * Toggles the ability for an element’s popover to be shown or hidden.
    */
  def toggleEnable(): Unit = js.native
  
  /**
    * Updates the position of an element’s popover.
    */
  def update(): Unit = js.native
}
object Popover_ {
  
  @scala.inline
  def apply(
    disable: () => Unit,
    dispose: () => Unit,
    enable: () => Unit,
    hide: () => Unit,
    show: () => Unit,
    toggle: () => Unit,
    toggleEnable: () => Unit,
    update: () => Unit
  ): Popover_ = {
    val __obj = js.Dynamic.literal(disable = js.Any.fromFunction0(disable), dispose = js.Any.fromFunction0(dispose), enable = js.Any.fromFunction0(enable), hide = js.Any.fromFunction0(hide), show = js.Any.fromFunction0(show), toggle = js.Any.fromFunction0(toggle), toggleEnable = js.Any.fromFunction0(toggleEnable), update = js.Any.fromFunction0(update))
    __obj.asInstanceOf[Popover_]
  }
  
  @scala.inline
  implicit class Popover_Ops[Self <: Popover_] (val x: Self) extends AnyVal {
    
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
    def setDisable(value: () => Unit): Self = this.set("disable", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDispose(value: () => Unit): Self = this.set("dispose", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEnable(value: () => Unit): Self = this.set("enable", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHide(value: () => Unit): Self = this.set("hide", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShow(value: () => Unit): Self = this.set("show", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToggle(value: () => Unit): Self = this.set("toggle", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToggleEnable(value: () => Unit): Self = this.set("toggleEnable", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUpdate(value: () => Unit): Self = this.set("update", js.Any.fromFunction0(value))
  }
}
