package typings
package cordovaDashSqliteDashStorageLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object SQLitePluginNs {
  type DatabaseSuccessCallback = js.Function1[/* db */ Database, scala.Unit]
  type ErrorCallback = js.Function1[/* err */ stdLib.Error, scala.Unit]
  type StatementSuccessCallback = js.Function1[/* results */ Results, scala.Unit]
  type SuccessCallback = js.Function0[scala.Unit]
  type TransactionFunction = js.Function1[/* tx */ Transaction, scala.Unit]
  type TransactionStatementErrorCallback = js.Function2[/* tx */ Transaction, /* err */ stdLib.Error, scala.Boolean | scala.Unit]
  type TransactionStatementSuccessCallback = js.Function2[/* tx */ Transaction, /* results */ Results, scala.Unit]
}
