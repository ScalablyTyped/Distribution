package typings.cordovaSqliteStorage.SQLitePlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Transaction extends js.Object {
  
  def executeSql(statement: String): Unit = js.native
  def executeSql(
    statement: String,
    params: js.UndefOr[scala.Nothing],
    success: js.UndefOr[scala.Nothing],
    error: TransactionStatementErrorCallback
  ): Unit = js.native
  def executeSql(statement: String, params: js.UndefOr[scala.Nothing], success: TransactionStatementSuccessCallback): Unit = js.native
  def executeSql(
    statement: String,
    params: js.UndefOr[scala.Nothing],
    success: TransactionStatementSuccessCallback,
    error: TransactionStatementErrorCallback
  ): Unit = js.native
  def executeSql(statement: String, params: js.Array[_]): Unit = js.native
  def executeSql(
    statement: String,
    params: js.Array[_],
    success: js.UndefOr[scala.Nothing],
    error: TransactionStatementErrorCallback
  ): Unit = js.native
  def executeSql(statement: String, params: js.Array[_], success: TransactionStatementSuccessCallback): Unit = js.native
  def executeSql(
    statement: String,
    params: js.Array[_],
    success: TransactionStatementSuccessCallback,
    error: TransactionStatementErrorCallback
  ): Unit = js.native
}
