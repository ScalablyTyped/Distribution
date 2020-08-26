package typings.bootbox

import typings.jquery.JQuery
import typings.std.DocumentFragment
import typings.std.Element
import typings.std.HTMLElement
import typings.std.Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Bootbox options available for confirm modals */
@js.native
trait BootboxConfirmOptions extends BootboxDialogOptions[Boolean] {
  @JSName("buttons")
  var buttons_BootboxConfirmOptions: js.UndefOr[BootboxConfirmPromptButtonMap] = js.native
  @JSName("callback")
  def callback_MBootboxConfirmOptions(result: Boolean): js.Any = js.native
}

object BootboxConfirmOptions {
  @scala.inline
  def apply(
    callback: Boolean => js.Any,
    message: JQuery[HTMLElement] | js.Array[_] | Element | DocumentFragment | Text | String | (js.Function2[/* index */ Double, /* html */ String, String | Element | JQuery[HTMLElement]])
  ): BootboxConfirmOptions = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction1(callback), message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootboxConfirmOptions]
  }
  @scala.inline
  implicit class BootboxConfirmOptionsOps[Self <: BootboxConfirmOptions] (val x: Self) extends AnyVal {
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
    def setCallback(value: Boolean => js.Any): Self = this.set("callback", js.Any.fromFunction1(value))
    @scala.inline
    def setButtons(value: BootboxConfirmPromptButtonMap): Self = this.set("buttons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButtons: Self = this.set("buttons", js.undefined)
  }
  
}

