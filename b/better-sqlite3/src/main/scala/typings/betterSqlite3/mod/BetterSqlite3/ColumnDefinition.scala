package typings.betterSqlite3.mod.BetterSqlite3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnDefinition extends js.Object {
  var column: String | Null
  var database: String | Null
  var name: String
  var table: String | Null
  var `type`: String | Null
}

object ColumnDefinition {
  @scala.inline
  def apply(
    name: String,
    column: String = null,
    database: String = null,
    table: String = null,
    `type`: String = null
  ): ColumnDefinition = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    if (database != null) __obj.updateDynamic("database")(database.asInstanceOf[js.Any])
    if (table != null) __obj.updateDynamic("table")(table.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnDefinition]
  }
}

