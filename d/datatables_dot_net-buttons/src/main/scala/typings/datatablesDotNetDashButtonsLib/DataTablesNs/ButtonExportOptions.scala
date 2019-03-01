package typings
package datatablesDotNetDashButtonsLib.DataTablesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonExportOptions extends js.Object {
  var columns: js.UndefOr[
    java.lang.String | scala.Double | js.Array[java.lang.String] | js.Array[scala.Double]
  ] = js.undefined
}

object ButtonExportOptions {
  @scala.inline
  def apply(
    columns: java.lang.String | scala.Double | js.Array[java.lang.String] | js.Array[scala.Double] = null
  ): ButtonExportOptions = {
    val __obj = js.Dynamic.literal()
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonExportOptions]
  }
}

