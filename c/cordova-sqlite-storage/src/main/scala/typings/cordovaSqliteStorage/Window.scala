package typings.cordovaSqliteStorage

import typings.cordovaSqliteStorage.SQLitePlugin_.SQLite
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Window extends js.Object {
  var sqlitePlugin: SQLite
}

object Window {
  @scala.inline
  def apply(sqlitePlugin: SQLite): Window = {
    val __obj = js.Dynamic.literal(sqlitePlugin = sqlitePlugin.asInstanceOf[js.Any])
    __obj.asInstanceOf[Window]
  }
}

