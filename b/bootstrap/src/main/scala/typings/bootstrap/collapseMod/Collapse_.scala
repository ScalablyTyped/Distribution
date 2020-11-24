package typings.bootstrap.collapseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Collapse_ extends js.Object {
  
  /**
    * Destroys an element's collapse.
    */
  def dispose(): Unit = js.native
  
  /**
    * Hides a collapsible element. Returns to the caller before the collapsible
    * element has actually been hidden (e.g., before the hidden.bs.collapse
    * event occurs).
    */
  def hide(): Unit = js.native
  
  /**
    * Shows a collapsible element. Returns to the caller before the collapsible
    * element has actually been shown (e.g., before the shown.bs.collapse event
    * occurs).
    */
  def show(): Unit = js.native
  
  /**
    * Toggles a collapsible element to shown or hidden. Returns to the caller
    * before the collapsible element has actually been shown or hidden (i.e.
    * before the shown.bs.collapse or hidden.bs.collapse event occurs).
    */
  def toggle(): Unit = js.native
}
object Collapse_ {
  
  @scala.inline
  def apply(dispose: () => Unit, hide: () => Unit, show: () => Unit, toggle: () => Unit): Collapse_ = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), hide = js.Any.fromFunction0(hide), show = js.Any.fromFunction0(show), toggle = js.Any.fromFunction0(toggle))
    __obj.asInstanceOf[Collapse_]
  }
  
  @scala.inline
  implicit class Collapse_Ops[Self <: Collapse_] (val x: Self) extends AnyVal {
    
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
    def setHide(value: () => Unit): Self = this.set("hide", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShow(value: () => Unit): Self = this.set("show", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToggle(value: () => Unit): Self = this.set("toggle", js.Any.fromFunction0(value))
  }
}
