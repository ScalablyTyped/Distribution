package typings
package dbDashMigrateDashBaseLib.dbDashMigrateDashBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnDef extends js.Object {
   // TODO Figure this out!
  var constraints: java.lang.String
  var foreignKey: js.UndefOr[js.Any] = js.undefined
}

object ColumnDef {
  @scala.inline
  def apply(constraints: java.lang.String, foreignKey: js.Any = null): ColumnDef = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("constraints")(constraints)
    if (foreignKey != null) __obj.updateDynamic("foreignKey")(foreignKey)
    __obj.asInstanceOf[ColumnDef]
  }
}

