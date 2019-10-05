package typings.datatablesDotNet.DataTables

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
    val __obj = js.Dynamic.literal(search = search, visible = visible)
  
    __obj.asInstanceOf[StateReturnModelColumns]
  }
}

