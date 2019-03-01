package typings
package datatablesDotNetDashButtonsLib.DataTablesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonsApiExportDataReturn extends js.Object {
  var body: js.Array[java.lang.String]
  var footer: js.Array[java.lang.String]
  var header: js.Array[java.lang.String]
}

object ButtonsApiExportDataReturn {
  @scala.inline
  def apply(
    body: js.Array[java.lang.String],
    footer: js.Array[java.lang.String],
    header: js.Array[java.lang.String]
  ): ButtonsApiExportDataReturn = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("body")(body)
    __obj.updateDynamic("footer")(footer)
    __obj.updateDynamic("header")(header)
    __obj.asInstanceOf[ButtonsApiExportDataReturn]
  }
}

