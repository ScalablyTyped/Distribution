package typings
package dbDashMigrateDashPgLib.dbDashMigrateDashPgMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnConstraintOptions extends js.Object {
  var emitPrimaryKey: js.UndefOr[scala.Boolean] = js.undefined
}

object ColumnConstraintOptions {
  @scala.inline
  def apply(emitPrimaryKey: js.UndefOr[scala.Boolean] = js.undefined): ColumnConstraintOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(emitPrimaryKey)) __obj.updateDynamic("emitPrimaryKey")(emitPrimaryKey)
    __obj.asInstanceOf[ColumnConstraintOptions]
  }
}

