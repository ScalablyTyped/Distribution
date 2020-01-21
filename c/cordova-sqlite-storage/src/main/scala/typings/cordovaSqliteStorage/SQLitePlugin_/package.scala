package typings.cordovaSqliteStorage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object SQLitePlugin_ {
  type DatabaseSuccessCallback = js.Function1[/* db */ typings.cordovaSqliteStorage.SQLitePlugin_.Database, scala.Unit]
  type ErrorCallback = js.Function1[/* err */ typings.std.Error, scala.Unit]
  type StatementSuccessCallback = js.Function1[/* results */ typings.cordovaSqliteStorage.SQLitePlugin_.Results, scala.Unit]
  type SuccessCallback = js.Function0[scala.Unit]
  type TransactionFunction = js.Function1[/* tx */ typings.cordovaSqliteStorage.SQLitePlugin_.Transaction, scala.Unit]
  type TransactionStatementErrorCallback = js.Function2[
    /* tx */ typings.cordovaSqliteStorage.SQLitePlugin_.Transaction, 
    /* err */ typings.std.Error, 
    scala.Boolean | scala.Unit
  ]
  type TransactionStatementSuccessCallback = js.Function2[
    /* tx */ typings.cordovaSqliteStorage.SQLitePlugin_.Transaction, 
    /* results */ typings.cordovaSqliteStorage.SQLitePlugin_.Results, 
    scala.Unit
  ]
}
