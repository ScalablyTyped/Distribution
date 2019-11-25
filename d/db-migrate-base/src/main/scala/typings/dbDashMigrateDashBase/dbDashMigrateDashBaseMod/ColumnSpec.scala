package typings.dbDashMigrateDashBase.dbDashMigrateDashBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnSpec extends js.Object {
  var autoIncrement: js.UndefOr[Boolean] = js.undefined
  var defaultValue: js.UndefOr[js.Any] = js.undefined
  var foreignKey: js.UndefOr[ForeignKeySpec] = js.undefined
  var length: js.UndefOr[Double] = js.undefined
  var notNull: js.UndefOr[Boolean] = js.undefined
  var primaryKey: js.UndefOr[Boolean] = js.undefined
  var `type`: String
  var unique: js.UndefOr[Boolean] = js.undefined
  var unsigned: js.UndefOr[Boolean] = js.undefined
}

object ColumnSpec {
  @scala.inline
  def apply(
    `type`: String,
    autoIncrement: js.UndefOr[Boolean] = js.undefined,
    defaultValue: js.Any = null,
    foreignKey: ForeignKeySpec = null,
    length: Int | Double = null,
    notNull: js.UndefOr[Boolean] = js.undefined,
    primaryKey: js.UndefOr[Boolean] = js.undefined,
    unique: js.UndefOr[Boolean] = js.undefined,
    unsigned: js.UndefOr[Boolean] = js.undefined
  ): ColumnSpec = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(autoIncrement)) __obj.updateDynamic("autoIncrement")(autoIncrement.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (foreignKey != null) __obj.updateDynamic("foreignKey")(foreignKey.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (!js.isUndefined(notNull)) __obj.updateDynamic("notNull")(notNull.asInstanceOf[js.Any])
    if (!js.isUndefined(primaryKey)) __obj.updateDynamic("primaryKey")(primaryKey.asInstanceOf[js.Any])
    if (!js.isUndefined(unique)) __obj.updateDynamic("unique")(unique.asInstanceOf[js.Any])
    if (!js.isUndefined(unsigned)) __obj.updateDynamic("unsigned")(unsigned.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnSpec]
  }
}

