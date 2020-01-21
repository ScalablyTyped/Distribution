package typings.datatablesNet.DataTables

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
    val __obj = js.Dynamic.literal(regex = regex.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AjaxDataRequestSearch]
  }
}

