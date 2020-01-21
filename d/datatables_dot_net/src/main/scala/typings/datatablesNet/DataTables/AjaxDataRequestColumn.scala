package typings.datatablesNet.DataTables

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
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], orderable = orderable.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], searchable = searchable.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AjaxDataRequestColumn]
  }
}

