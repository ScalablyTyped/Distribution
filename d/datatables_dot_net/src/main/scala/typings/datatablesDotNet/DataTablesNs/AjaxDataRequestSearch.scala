package typings.datatablesDotNet.DataTablesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AjaxDataRequestSearch extends js.Object {
  var regex: Boolean
  var value: String
}

object AjaxDataRequestSearch {
  @scala.inline
  def apply(regex: Boolean, value: String): AjaxDataRequestSearch = {
    val __obj = js.Dynamic.literal(regex = regex, value = value)
  
    __obj.asInstanceOf[AjaxDataRequestSearch]
  }
}

