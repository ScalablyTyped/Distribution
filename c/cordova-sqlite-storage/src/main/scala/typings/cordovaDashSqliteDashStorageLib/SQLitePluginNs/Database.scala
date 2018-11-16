package typings
package cordovaDashSqliteDashStorageLib.SQLitePluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Database extends js.Object {
  def close(): scala.Unit = js.native
  def close(success: SuccessCallback): scala.Unit = js.native
  def close(success: SuccessCallback, error: ErrorCallback): scala.Unit = js.native
  def executeSql(statement: java.lang.String): scala.Unit = js.native
  def executeSql(statement: java.lang.String, params: js.Array[_]): scala.Unit = js.native
  def executeSql(statement: java.lang.String, params: js.Array[_], success: StatementSuccessCallback): scala.Unit = js.native
  def executeSql(
    statement: java.lang.String,
    params: js.Array[_],
    success: StatementSuccessCallback,
    error: ErrorCallback
  ): scala.Unit = js.native
  def readTransaction(fn: TransactionFunction): scala.Unit = js.native
  def readTransaction(fn: TransactionFunction, error: ErrorCallback): scala.Unit = js.native
  def readTransaction(fn: TransactionFunction, error: ErrorCallback, success: SuccessCallback): scala.Unit = js.native
  def sqlBatch(sqlStatements: js.Array[java.lang.String | (js.Tuple2[java.lang.String, js.Array[_]])]): scala.Unit = js.native
  def sqlBatch(
    sqlStatements: js.Array[java.lang.String | (js.Tuple2[java.lang.String, js.Array[_]])],
    success: SuccessCallback
  ): scala.Unit = js.native
  def sqlBatch(
    sqlStatements: js.Array[java.lang.String | (js.Tuple2[java.lang.String, js.Array[_]])],
    success: SuccessCallback,
    error: ErrorCallback
  ): scala.Unit = js.native
  def transaction(fn: TransactionFunction): scala.Unit = js.native
  def transaction(fn: TransactionFunction, error: ErrorCallback): scala.Unit = js.native
  def transaction(fn: TransactionFunction, error: ErrorCallback, success: SuccessCallback): scala.Unit = js.native
}

