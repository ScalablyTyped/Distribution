package typings.betterDashSqlite3.betterDashSqlite3Mod.BetterSqlite3Ns

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
    val __obj = js.Dynamic.literal(name = name)
    if (column != null) __obj.updateDynamic("column")(column)
    if (database != null) __obj.updateDynamic("database")(database)
    if (table != null) __obj.updateDynamic("table")(table)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ColumnDefinition]
  }
}

