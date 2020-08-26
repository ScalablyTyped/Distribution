package typings.chui.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Callback extends js.Object {
  var callback: js.UndefOr[js.Function] = js.native
  var cancelButton: js.UndefOr[String] = js.native
  var continueButton: js.UndefOr[String] = js.native
  var empty: js.UndefOr[Boolean] = js.native
  var id: js.UndefOr[String] = js.native
  var message: js.UndefOr[String] = js.native
  var title: js.UndefOr[String] = js.native
}

object Callback {
  @scala.inline
  def apply(): Callback = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Callback]
  }
  @scala.inline
  implicit class CallbackOps[Self <: Callback] (val x: Self) extends AnyVal {
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
    def setCallback(value: js.Function): Self = this.set("callback", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCallback: Self = this.set("callback", js.undefined)
    @scala.inline
    def setCancelButton(value: String): Self = this.set("cancelButton", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCancelButton: Self = this.set("cancelButton", js.undefined)
    @scala.inline
    def setContinueButton(value: String): Self = this.set("continueButton", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContinueButton: Self = this.set("continueButton", js.undefined)
    @scala.inline
    def setEmpty(value: Boolean): Self = this.set("empty", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmpty: Self = this.set("empty", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

