package typings.datatablesNetButtons.DataTables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonsApiExportDataReturn extends js.Object {
  var body: js.Array[String]
  var footer: js.Array[String]
  var header: js.Array[String]
}

object ButtonsApiExportDataReturn {
  @scala.inline
  def apply(body: js.Array[String], footer: js.Array[String], header: js.Array[String]): ButtonsApiExportDataReturn = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], footer = footer.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonsApiExportDataReturn]
  }
}

