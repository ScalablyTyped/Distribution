package typings.cordovaSqliteStorage.SQLitePlugin_

import typings.cordovaSqliteStorage.AnonI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Results extends js.Object {
  var insertId: js.UndefOr[Double] = js.undefined
  var rows: AnonI
  var rowsAffected: Double
}

object Results {
  @scala.inline
  def apply(rows: AnonI, rowsAffected: Double, insertId: Int | Double = null): Results = {
    val __obj = js.Dynamic.literal(rows = rows.asInstanceOf[js.Any], rowsAffected = rowsAffected.asInstanceOf[js.Any])
    if (insertId != null) __obj.updateDynamic("insertId")(insertId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Results]
  }
}

