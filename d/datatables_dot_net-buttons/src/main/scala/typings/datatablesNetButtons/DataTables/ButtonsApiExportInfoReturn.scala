package typings.datatablesNetButtons.DataTables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ButtonsApiExportInfoReturn extends js.Object {
  var filename: String = js.native
  var messageBottom: String = js.native
  var messageTop: String = js.native
  var title: String = js.native
}

object ButtonsApiExportInfoReturn {
  @scala.inline
  def apply(filename: String, messageBottom: String, messageTop: String, title: String): ButtonsApiExportInfoReturn = {
    val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any], messageBottom = messageBottom.asInstanceOf[js.Any], messageTop = messageTop.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonsApiExportInfoReturn]
  }
  @scala.inline
  implicit class ButtonsApiExportInfoReturnOps[Self <: ButtonsApiExportInfoReturn] (val x: Self) extends AnyVal {
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
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessageBottom(value: String): Self = this.set("messageBottom", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessageTop(value: String): Self = this.set("messageTop", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
  }
  
}

