package typings
package cordovaDashSqliteDashStorageLib.SQLitePluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Results extends js.Object {
  var insertId: js.UndefOr[scala.Double] = js.undefined
  var rows: cordovaDashSqliteDashStorageLib.Anon_I
  var rowsAffected: scala.Double
}

object Results {
  @scala.inline
  def apply(
    rows: cordovaDashSqliteDashStorageLib.Anon_I,
    rowsAffected: scala.Double,
    insertId: scala.Int | scala.Double = null
  ): Results = {
    val __obj = js.Dynamic.literal(rows = rows, rowsAffected = rowsAffected)
    if (insertId != null) __obj.updateDynamic("insertId")(insertId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Results]
  }
}

