package typings.bootstrap.dropdownMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dropdown_ extends js.Object {
  
  /**
    * Destroys an element's dropdown.
    */
  def dispose(): Unit = js.native
  
  /**
    * Hides the dropdown menu of a given navbar or tabbed navigation.
    */
  def hide(): Unit = js.native
  
  /**
    * Shows the dropdown menu of a given navbar or tabbed navigation.
    */
  def show(): Unit = js.native
  
  /**
    * Toggles the dropdown menu of a given navbar or tabbed navigation.
    */
  def toggle(): Unit = js.native
  
  /**
    * Updates the position of an element's dropdown.
    */
  def update(): Unit = js.native
}
object Dropdown_ {
  
  @scala.inline
  def apply(dispose: () => Unit, hide: () => Unit, show: () => Unit, toggle: () => Unit, update: () => Unit): Dropdown_ = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), hide = js.Any.fromFunction0(hide), show = js.Any.fromFunction0(show), toggle = js.Any.fromFunction0(toggle), update = js.Any.fromFunction0(update))
    __obj.asInstanceOf[Dropdown_]
  }
  
  @scala.inline
  implicit class Dropdown_Ops[Self <: Dropdown_] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def setUpdate(value: () => Unit): Self = this.set("update", js.Any.fromFunction0(value))
  }
}
