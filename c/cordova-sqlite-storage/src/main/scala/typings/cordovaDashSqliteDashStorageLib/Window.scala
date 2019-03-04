package typings
package cordovaDashSqliteDashStorageLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Window extends js.Object {
  var sqlitePlugin: cordovaDashSqliteDashStorageLib.SQLitePluginNs.SQLite
}

object Window {
  @scala.inline
  def apply(sqlitePlugin: cordovaDashSqliteDashStorageLib.SQLitePluginNs.SQLite): Window = {
    val __obj = js.Dynamic.literal(sqlitePlugin = sqlitePlugin)
  
    __obj.asInstanceOf[Window]
  }
}

