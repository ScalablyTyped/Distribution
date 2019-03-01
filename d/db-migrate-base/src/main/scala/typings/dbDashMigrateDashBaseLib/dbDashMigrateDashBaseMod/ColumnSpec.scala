package typings
package dbDashMigrateDashBaseLib.dbDashMigrateDashBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnSpec extends js.Object {
  var autoIncrement: js.UndefOr[scala.Boolean] = js.undefined
  var defaultValue: js.UndefOr[js.Any] = js.undefined
  var foreignKey: js.UndefOr[ForeignKeySpec] = js.undefined
  var length: js.UndefOr[scala.Double] = js.undefined
  var notNull: js.UndefOr[scala.Boolean] = js.undefined
  var primaryKey: js.UndefOr[scala.Boolean] = js.undefined
  var `type`: java.lang.String
  var unique: js.UndefOr[scala.Boolean] = js.undefined
  var unsigned: js.UndefOr[scala.Boolean] = js.undefined
}

object ColumnSpec {
  @scala.inline
  def apply(
    `type`: java.lang.String,
    autoIncrement: js.UndefOr[scala.Boolean] = js.undefined,
    defaultValue: js.Any = null,
    foreignKey: ForeignKeySpec = null,
    length: scala.Int | scala.Double = null,
    notNull: js.UndefOr[scala.Boolean] = js.undefined,
    primaryKey: js.UndefOr[scala.Boolean] = js.undefined,
    unique: js.UndefOr[scala.Boolean] = js.undefined,
    unsigned: js.UndefOr[scala.Boolean] = js.undefined
  ): ColumnSpec = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    if (!js.isUndefined(autoIncrement)) __obj.updateDynamic("autoIncrement")(autoIncrement)
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue)
    if (foreignKey != null) __obj.updateDynamic("foreignKey")(foreignKey)
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (!js.isUndefined(notNull)) __obj.updateDynamic("notNull")(notNull)
    if (!js.isUndefined(primaryKey)) __obj.updateDynamic("primaryKey")(primaryKey)
    if (!js.isUndefined(unique)) __obj.updateDynamic("unique")(unique)
    if (!js.isUndefined(unsigned)) __obj.updateDynamic("unsigned")(unsigned)
    __obj.asInstanceOf[ColumnSpec]
  }
}

