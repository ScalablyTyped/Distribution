package typings
package betterDashSqlite3Lib.betterDashSqlite3Mod.BetterSqlite3Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnDefinition extends js.Object {
  var column: java.lang.String | scala.Null
  var database: java.lang.String | scala.Null
  var name: java.lang.String
  var table: java.lang.String | scala.Null
  var `type`: java.lang.String | scala.Null
}

object ColumnDefinition {
  @scala.inline
  def apply(
    name: java.lang.String,
    column: java.lang.String = null,
    database: java.lang.String = null,
    table: java.lang.String = null,
    `type`: java.lang.String = null
  ): ColumnDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    if (column != null) __obj.updateDynamic("column")(column)
    if (database != null) __obj.updateDynamic("database")(database)
    if (table != null) __obj.updateDynamic("table")(table)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ColumnDefinition]
  }
}

