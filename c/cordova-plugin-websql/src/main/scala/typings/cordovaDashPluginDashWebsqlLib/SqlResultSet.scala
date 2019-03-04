package typings
package cordovaDashPluginDashWebsqlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SqlResultSet extends js.Object {
  var insertId: scala.Double
  var rows: SqlResultSetRowList
  var rowsAffected: scala.Double
}

object SqlResultSet {
  @scala.inline
  def apply(insertId: scala.Double, rows: SqlResultSetRowList, rowsAffected: scala.Double): SqlResultSet = {
    val __obj = js.Dynamic.literal(insertId = insertId, rows = rows, rowsAffected = rowsAffected)
  
    __obj.asInstanceOf[SqlResultSet]
  }
}

