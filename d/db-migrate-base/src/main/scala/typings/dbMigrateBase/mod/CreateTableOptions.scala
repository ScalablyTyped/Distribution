package typings.dbMigrateBase.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateTableOptions extends js.Object {
  var columns: js.UndefOr[js.Array[ColumnSpec]] = js.undefined
  var ifNotExists: js.UndefOr[Boolean] = js.undefined
}

object CreateTableOptions {
  @scala.inline
  def apply(columns: js.Array[ColumnSpec] = null, ifNotExists: js.UndefOr[Boolean] = js.undefined): CreateTableOptions = {
    val __obj = js.Dynamic.literal()
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (!js.isUndefined(ifNotExists)) __obj.updateDynamic("ifNotExists")(ifNotExists.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTableOptions]
  }
}

