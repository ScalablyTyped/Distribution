package typings.datatablesNet.DataTables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait objectTablesStatic extends js.Object {
  /**
    * Return a DataTables API instance for the selected tables (true) or an array (false).
    */
  var api: Boolean
  /**
    * Get only visible tables (true) or all tables regardless of visibility (false).
    */
  var visible: Boolean
}

object objectTablesStatic {
  @scala.inline
  def apply(api: Boolean, visible: Boolean): objectTablesStatic = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[objectTablesStatic]
  }
}

