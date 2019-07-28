package typings.datatablesDotNet.DataTablesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AjaxDataRequestColumn extends js.Object {
  var data: String | Double
  var name: String
  var orderable: Boolean
  var search: AjaxDataRequestSearch
  var searchable: Boolean
}

object AjaxDataRequestColumn {
  @scala.inline
  def apply(
    data: String | Double,
    name: String,
    orderable: Boolean,
    search: AjaxDataRequestSearch,
    searchable: Boolean
  ): AjaxDataRequestColumn = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], name = name, orderable = orderable, search = search, searchable = searchable)
  
    __obj.asInstanceOf[AjaxDataRequestColumn]
  }
}

