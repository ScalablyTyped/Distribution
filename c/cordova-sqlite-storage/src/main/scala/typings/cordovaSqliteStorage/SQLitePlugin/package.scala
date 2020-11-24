package typings.cordovaSqliteStorage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object SQLitePlugin {
  
  type DatabaseSuccessCallback = js.Function1[/* db */ typings.cordovaSqliteStorage.SQLitePlugin.Database, scala.Unit]
  
  type ErrorCallback = js.Function1[/* err */ typings.std.Error, scala.Unit]
  
  type StatementSuccessCallback = js.Function1[/* results */ typings.cordovaSqliteStorage.SQLitePlugin.Results, scala.Unit]
  
  type SuccessCallback = js.Function0[scala.Unit]
  
  type TransactionFunction = js.Function1[/* tx */ typings.cordovaSqliteStorage.SQLitePlugin.Transaction, scala.Unit]
  
  type TransactionStatementErrorCallback = js.Function2[
    /* tx */ typings.cordovaSqliteStorage.SQLitePlugin.Transaction, 
    /* err */ typings.std.Error, 
    scala.Boolean | scala.Unit
  ]
  
  type TransactionStatementSuccessCallback = js.Function2[
    /* tx */ typings.cordovaSqliteStorage.SQLitePlugin.Transaction, 
    /* results */ typings.cordovaSqliteStorage.SQLitePlugin.Results, 
    scala.Unit
  ]
}
