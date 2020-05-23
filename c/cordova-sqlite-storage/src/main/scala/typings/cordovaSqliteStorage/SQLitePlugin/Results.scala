package typings.cordovaSqliteStorage.SQLitePlugin

import typings.cordovaSqliteStorage.anon.Item
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Results extends js.Object {
  var insertId: js.UndefOr[Double] = js.undefined
  var rows: Item
  var rowsAffected: Double
}

object Results {
  @scala.inline
  def apply(rows: Item, rowsAffected: Double, insertId: js.UndefOr[Double] = js.undefined): Results = {
    val __obj = js.Dynamic.literal(rows = rows.asInstanceOf[js.Any], rowsAffected = rowsAffected.asInstanceOf[js.Any])
    if (!js.isUndefined(insertId)) __obj.updateDynamic("insertId")(insertId.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Results]
  }
}

