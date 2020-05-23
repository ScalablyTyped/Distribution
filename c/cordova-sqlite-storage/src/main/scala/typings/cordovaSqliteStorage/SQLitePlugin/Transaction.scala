package typings.cordovaSqliteStorage.SQLitePlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Transaction extends js.Object {
  def executeSql(statement: String): Unit = js.native
  def executeSql(statement: String, params: js.Array[_]): Unit = js.native
  def executeSql(statement: String, params: js.Array[_], success: TransactionStatementSuccessCallback): Unit = js.native
  def executeSql(
    statement: String,
    params: js.Array[_],
    success: TransactionStatementSuccessCallback,
    error: TransactionStatementErrorCallback
  ): Unit = js.native
}

