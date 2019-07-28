package typings.cordovaDashPluginDashWebsql

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SqlResultSet extends js.Object {
  var insertId: Double
  var rows: SqlResultSetRowList
  var rowsAffected: Double
}

object SqlResultSet {
  @scala.inline
  def apply(insertId: Double, rows: SqlResultSetRowList, rowsAffected: Double): SqlResultSet = {
    val __obj = js.Dynamic.literal(insertId = insertId, rows = rows, rowsAffected = rowsAffected)
  
    __obj.asInstanceOf[SqlResultSet]
  }
}

