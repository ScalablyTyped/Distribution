package typings.dbMigrateBase.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ForeignKeySpec extends js.Object {
  var mapping: String | js.Any
  var name: String
  var rules: js.UndefOr[ForeignKeyRules] = js.undefined
  var table: String
}

object ForeignKeySpec {
  @scala.inline
  def apply(mapping: String | js.Any, name: String, table: String, rules: ForeignKeyRules = null): ForeignKeySpec = {
    val __obj = js.Dynamic.literal(mapping = mapping.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], table = table.asInstanceOf[js.Any])
    if (rules != null) __obj.updateDynamic("rules")(rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForeignKeySpec]
  }
}

