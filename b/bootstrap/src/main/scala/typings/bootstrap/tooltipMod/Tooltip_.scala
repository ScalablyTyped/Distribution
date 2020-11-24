package typings.bootstrap.tooltipMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Tooltip_ extends js.Object {
  
  /**
    * Removes the ability for an element’s tooltip to be shown. The tooltip
    * will only be able to be shown if it is re-enabled.
    */
  def disable(): Unit = js.native
  
  /**
    * Hides and destroys an element’s tooltip. Tooltips that use delegation
    * (which are created using the selector option) cannot be individually
    * destroyed on descendant trigger elements.
    */
  def dispose(): Unit = js.native
  
  /**
    * Gives an element’s tooltip the ability to be shown. Tooltips are
    * enabled by default.
    */
  def enable(): Unit = js.native
  
  /**
    * Hides an element’s tooltip. Returns to the caller before the tooltip
    * has actually been hidden (i.e. before the hidden.bs.tooltip event
    * occurs). This is considered a “manual” triggering of the tooltip.
    */
  def hide(): Unit = js.native
  
  /**
    * Reveals an element’s tooltip. Returns to the caller before the
    * tooltip has actually been shown (i.e. before the shown.bs.tooltip
    * event occurs). This is considered a “manual” triggering of the
    * tooltip. Tooltips with zero-length titles are never displayed.
    */
  def show(): Unit = js.native
  
  /**
    * Toggles an element’s tooltip. Returns to the caller before the
    * tooltip has actually been shown or hidden (i.e. before the
    * shown.bs.tooltip or hidden.bs.tooltip event occurs). This is
    * considered a “manual” triggering of the tooltip.
    */
  def toggle(): Unit = js.native
  
  /**
    * Toggles the ability for an element’s tooltip to be shown or hidden.
    */
  def toggleEnabled(): Unit = js.native
  
  /**
    * Updates the position of an element’s tooltip.
    */
  def update(): Unit = js.native
}
object Tooltip_ {
  
  @scala.inline
  def apply(
    disable: () => Unit,
    dispose: () => Unit,
    enable: () => Unit,
    hide: () => Unit,
    show: () => Unit,
    toggle: () => Unit,
    toggleEnabled: () => Unit,
    update: () => Unit
  ): Tooltip_ = {
    val __obj = js.Dynamic.literal(disable = js.Any.fromFunction0(disable), dispose = js.Any.fromFunction0(dispose), enable = js.Any.fromFunction0(enable), hide = js.Any.fromFunction0(hide), show = js.Any.fromFunction0(show), toggle = js.Any.fromFunction0(toggle), toggleEnabled = js.Any.fromFunction0(toggleEnabled), update = js.Any.fromFunction0(update))
    __obj.asInstanceOf[Tooltip_]
  }
  
  @scala.inline
  implicit class Tooltip_Ops[Self <: Tooltip_] (val x: Self) extends AnyVal {
    
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
    def setToggleEnabled(value: () => Unit): Self = this.set("toggleEnabled", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUpdate(value: () => Unit): Self = this.set("update", js.Any.fromFunction0(value))
  }
}
