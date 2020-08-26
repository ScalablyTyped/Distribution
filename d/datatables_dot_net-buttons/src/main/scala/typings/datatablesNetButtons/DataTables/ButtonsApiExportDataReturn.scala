package typings.datatablesNetButtons.DataTables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ButtonsApiExportDataReturn extends js.Object {
  var body: js.Array[String] = js.native
  var footer: js.Array[String] = js.native
  var header: js.Array[String] = js.native
}

object ButtonsApiExportDataReturn {
  @scala.inline
  def apply(body: js.Array[String], footer: js.Array[String], header: js.Array[String]): ButtonsApiExportDataReturn = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], footer = footer.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonsApiExportDataReturn]
  }
  @scala.inline
  implicit class ButtonsApiExportDataReturnOps[Self <: ButtonsApiExportDataReturn] (val x: Self) extends AnyVal {
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
    def setBodyVarargs(value: String*): Self = this.set("body", js.Array(value :_*))
    @scala.inline
    def setBody(value: js.Array[String]): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def setFooterVarargs(value: String*): Self = this.set("footer", js.Array(value :_*))
    @scala.inline
    def setFooter(value: js.Array[String]): Self = this.set("footer", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeaderVarargs(value: String*): Self = this.set("header", js.Array(value :_*))
    @scala.inline
    def setHeader(value: js.Array[String]): Self = this.set("header", value.asInstanceOf[js.Any])
  }
  
}

