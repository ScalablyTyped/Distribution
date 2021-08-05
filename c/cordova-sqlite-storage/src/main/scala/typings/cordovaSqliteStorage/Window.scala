package typings.cordovaSqliteStorage

import typings.cordovaSqliteStorage.SQLitePlugin.SQLite
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Window extends StObject {
  
  var sqlitePlugin: SQLite
}
object Window {
  
  inline def apply(sqlitePlugin: SQLite): Window = {
    val __obj = js.Dynamic.literal(sqlitePlugin = sqlitePlugin.asInstanceOf[js.Any])
    __obj.asInstanceOf[Window]
  }
  
  extension [Self <: Window](x: Self) {
    
    inline def setSqlitePlugin(value: SQLite): Self = StObject.set(x, "sqlitePlugin", value.asInstanceOf[js.Any])
  }
}
