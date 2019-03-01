package typings
package dbDashMigrateDashBaseLib.dbDashMigrateDashBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateTableOptions extends js.Object {
  var columns: js.UndefOr[js.Array[ColumnSpec]] = js.undefined
  var ifNotExists: js.UndefOr[scala.Boolean] = js.undefined
}

object CreateTableOptions {
  @scala.inline
  def apply(columns: js.Array[ColumnSpec] = null, ifNotExists: js.UndefOr[scala.Boolean] = js.undefined): CreateTableOptions = {
    val __obj = js.Dynamic.literal()
    if (columns != null) __obj.updateDynamic("columns")(columns)
    if (!js.isUndefined(ifNotExists)) __obj.updateDynamic("ifNotExists")(ifNotExists)
    __obj.asInstanceOf[CreateTableOptions]
  }
}

