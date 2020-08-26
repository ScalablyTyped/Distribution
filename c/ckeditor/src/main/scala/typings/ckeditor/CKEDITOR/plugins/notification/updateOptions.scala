package typings.ckeditor.CKEDITOR.plugins.notification

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait updateOptions extends optionsBase {
  var important: js.UndefOr[Boolean] = js.native
  var message: js.UndefOr[String] = js.native
}

object updateOptions {
  @scala.inline
  def apply(): updateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[updateOptions]
  }
  @scala.inline
  implicit class updateOptionsOps[Self <: updateOptions] (val x: Self) extends AnyVal {
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
    def setImportant(value: Boolean): Self = this.set("important", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImportant: Self = this.set("important", js.undefined)
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
  }
  
}

