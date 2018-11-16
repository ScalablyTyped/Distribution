package typings
package cordovaDashSqliteDashStorageLib.SQLitePluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Transaction extends js.Object {
  def executeSql(statement: java.lang.String): scala.Unit = js.native
  def executeSql(statement: java.lang.String, params: js.Array[_]): scala.Unit = js.native
  def executeSql(statement: java.lang.String, params: js.Array[_], success: TransactionStatementSuccessCallback): scala.Unit = js.native
  def executeSql(
    statement: java.lang.String,
    params: js.Array[_],
    success: TransactionStatementSuccessCallback,
    error: TransactionStatementErrorCallback
  ): scala.Unit = js.native
}

