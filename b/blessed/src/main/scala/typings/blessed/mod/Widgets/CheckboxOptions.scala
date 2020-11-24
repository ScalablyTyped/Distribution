package typings.blessed.mod.Widgets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CheckboxOptions extends BoxOptions {
  
  /**
    * whether the element is checked or not.
    */
  var checked: js.UndefOr[Boolean] = js.native
  
  /**
    * enable mouse support.
    */
  @JSName("mouse")
  var mouse_CheckboxOptions: js.UndefOr[Boolean] = js.native
}
object CheckboxOptions {
  
  @scala.inline
  def apply(): CheckboxOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CheckboxOptions]
  }
  
  @scala.inline
  implicit class CheckboxOptionsOps[Self <: CheckboxOptions] (val x: Self) extends AnyVal {
    
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
    def setChecked(value: Boolean): Self = this.set("checked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChecked: Self = this.set("checked", js.undefined)
    
    @scala.inline
    def setMouse(value: Boolean): Self = this.set("mouse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMouse: Self = this.set("mouse", js.undefined)
  }
}
