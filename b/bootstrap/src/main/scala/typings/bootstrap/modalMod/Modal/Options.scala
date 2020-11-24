package typings.bootstrap.modalMod.Modal

import typings.bootstrap.bootstrapStrings.static
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  /**
    * Includes a modal-backdrop element. Alternatively, specify static for
    * a backdrop which doesn't close the modal on click.
    *
    * @default true
    */
  var backdrop: static | Boolean = js.native
  
  /**
    * Puts the focus on the modal when initialized.
    *
    * @default true
    */
  var focus: Boolean = js.native
  
  /**
    * Closes the modal when escape key is pressed
    *
    * @default true
    */
  var keyboard: Boolean = js.native
  
  /**
    * Shows the modal when initialized.
    *
    * @default true
    */
  var show: Boolean = js.native
}
object Options {
  
  @scala.inline
  def apply(backdrop: static | Boolean, focus: Boolean, keyboard: Boolean, show: Boolean): Options = {
    val __obj = js.Dynamic.literal(backdrop = backdrop.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], keyboard = keyboard.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setBackdrop(value: static | Boolean): Self = this.set("backdrop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocus(value: Boolean): Self = this.set("focus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyboard(value: Boolean): Self = this.set("keyboard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShow(value: Boolean): Self = this.set("show", value.asInstanceOf[js.Any])
  }
}
