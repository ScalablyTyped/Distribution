package typings.datatablesNet.DataTables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StateReturnModelColumns extends js.Object {
  var search: SearchSettings
  var visible: Boolean
}

object StateReturnModelColumns {
  @scala.inline
  def apply(search: SearchSettings, visible: Boolean): StateReturnModelColumns = {
    val __obj = js.Dynamic.literal(search = search.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[StateReturnModelColumns]
  }
}

