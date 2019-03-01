package typings
package dbDashMigrateDashBaseLib.dbDashMigrateDashBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ForeignKeySpec extends js.Object {
  var mapping: java.lang.String | js.Any
  var name: java.lang.String
  var rules: js.UndefOr[ForeignKeyRules] = js.undefined
  var table: java.lang.String
}

object ForeignKeySpec {
  @scala.inline
  def apply(
    mapping: java.lang.String | js.Any,
    name: java.lang.String,
    table: java.lang.String,
    rules: ForeignKeyRules = null
  ): ForeignKeySpec = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("mapping")(mapping.asInstanceOf[js.Any])
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("table")(table)
    if (rules != null) __obj.updateDynamic("rules")(rules)
    __obj.asInstanceOf[ForeignKeySpec]
  }
}

