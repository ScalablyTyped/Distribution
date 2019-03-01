package typings
package datatablesDotNetDashButtonsLib.DataTablesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonsApiExportInfoReturn extends js.Object {
  var filename: java.lang.String
  var messageBottom: java.lang.String
  var messageTop: java.lang.String
  var title: java.lang.String
}

object ButtonsApiExportInfoReturn {
  @scala.inline
  def apply(
    filename: java.lang.String,
    messageBottom: java.lang.String,
    messageTop: java.lang.String,
    title: java.lang.String
  ): ButtonsApiExportInfoReturn = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("filename")(filename)
    __obj.updateDynamic("messageBottom")(messageBottom)
    __obj.updateDynamic("messageTop")(messageTop)
    __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[ButtonsApiExportInfoReturn]
  }
}

