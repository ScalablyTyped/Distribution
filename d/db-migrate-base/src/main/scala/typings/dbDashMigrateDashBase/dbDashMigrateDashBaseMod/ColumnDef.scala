package typings.dbDashMigrateDashBase.dbDashMigrateDashBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnDef extends js.Object {
   // TODO Figure this out!
  var constraints: String
  var foreignKey: js.UndefOr[js.Any] = js.undefined
}

object ColumnDef {
  @scala.inline
  def apply(constraints: String, foreignKey: js.Any = null): ColumnDef = {
    val __obj = js.Dynamic.literal(constraints = constraints)
    if (foreignKey != null) __obj.updateDynamic("foreignKey")(foreignKey)
    __obj.asInstanceOf[ColumnDef]
  }
}

