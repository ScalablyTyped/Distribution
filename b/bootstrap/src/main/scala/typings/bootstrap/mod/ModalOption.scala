package typings.bootstrap.mod

import typings.bootstrap.bootstrapStrings.static
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModalOption extends js.Object {
  /**
    * Includes a modal-backdrop element.
    * Alternatively, specify `static` for a backdrop which doesn't close the modal on click.
    *
    * @default true
    */
  var backdrop: js.UndefOr[Boolean | static] = js.native
  /**
    * Puts the focus on the modal when initialized.
    *
    * @default true
    */
  var focus: js.UndefOr[Boolean] = js.native
  /**
    * Closes the modal when escape key is pressed.
    *
    * @default true
    */
  var keyboard: js.UndefOr[Boolean] = js.native
  /**
    * Shows the modal when initialized.
    *
    * @default true
    */
  var show: js.UndefOr[Boolean] = js.native
}

object ModalOption {
  @scala.inline
  def apply(): ModalOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModalOption]
  }
  @scala.inline
  implicit class ModalOptionOps[Self <: ModalOption] (val x: Self) extends AnyVal {
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
    def setBackdrop(value: Boolean | static): Self = this.set("backdrop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackdrop: Self = this.set("backdrop", js.undefined)
    @scala.inline
    def setFocus(value: Boolean): Self = this.set("focus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFocus: Self = this.set("focus", js.undefined)
    @scala.inline
    def setKeyboard(value: Boolean): Self = this.set("keyboard", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyboard: Self = this.set("keyboard", js.undefined)
    @scala.inline
    def setShow(value: Boolean): Self = this.set("show", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShow: Self = this.set("show", js.undefined)
  }
  
}

