package typings
package datatablesDotNetLib.DataTablesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AjaxDataRequestSearch extends js.Object {
  var regex: scala.Boolean
  var value: java.lang.String
}

object AjaxDataRequestSearch {
  @scala.inline
  def apply(regex: scala.Boolean, value: java.lang.String): AjaxDataRequestSearch = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("regex")(regex)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[AjaxDataRequestSearch]
  }
}

