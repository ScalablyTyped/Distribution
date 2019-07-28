package typings.cordovaDashSqliteDashStorage

import typings.cordovaDashSqliteDashStorage.SQLitePluginNs.SQLite
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Window extends js.Object {
  var sqlitePlugin: SQLite
}

object Window {
  @scala.inline
  def apply(sqlitePlugin: SQLite): Window = {
    val __obj = js.Dynamic.literal(sqlitePlugin = sqlitePlugin)
  
    __obj.asInstanceOf[Window]
  }
}

