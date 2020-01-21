package typings.cordovaSqliteStorage.SQLitePlugin_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Database extends js.Object {
  def close(): Unit = js.native
  def close(success: SuccessCallback): Unit = js.native
  def close(success: SuccessCallback, error: ErrorCallback): Unit = js.native
  def executeSql(statement: String): Unit = js.native
  def executeSql(statement: String, params: js.Array[_]): Unit = js.native
  def executeSql(statement: String, params: js.Array[_], success: StatementSuccessCallback): Unit = js.native
  def executeSql(statement: String, params: js.Array[_], success: StatementSuccessCallback, error: ErrorCallback): Unit = js.native
  def readTransaction(fn: TransactionFunction): Unit = js.native
  def readTransaction(fn: TransactionFunction, error: ErrorCallback): Unit = js.native
  def readTransaction(fn: TransactionFunction, error: ErrorCallback, success: SuccessCallback): Unit = js.native
  def sqlBatch(sqlStatements: js.Array[String | (js.Tuple2[String, js.Array[_]])]): Unit = js.native
  def sqlBatch(sqlStatements: js.Array[String | (js.Tuple2[String, js.Array[_]])], success: SuccessCallback): Unit = js.native
  def sqlBatch(
    sqlStatements: js.Array[String | (js.Tuple2[String, js.Array[_]])],
    success: SuccessCallback,
    error: ErrorCallback
  ): Unit = js.native
  def transaction(fn: TransactionFunction): Unit = js.native
  def transaction(fn: TransactionFunction, error: ErrorCallback): Unit = js.native
  def transaction(fn: TransactionFunction, error: ErrorCallback, success: SuccessCallback): Unit = js.native
}

