package typings.cordovaDashSqliteDashStorage.SQLitePlugin

import typings.cordovaDashSqliteDashStorage.Anon_I
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Results extends js.Object {
  var insertId: js.UndefOr[Double] = js.undefined
  var rows: Anon_I
  var rowsAffected: Double
}

object Results {
  @scala.inline
  def apply(rows: Anon_I, rowsAffected: Double, insertId: Int | Double = null): Results = {
    val __obj = js.Dynamic.literal(rows = rows, rowsAffected = rowsAffected)
    if (insertId != null) __obj.updateDynamic("insertId")(insertId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Results]
  }
}

