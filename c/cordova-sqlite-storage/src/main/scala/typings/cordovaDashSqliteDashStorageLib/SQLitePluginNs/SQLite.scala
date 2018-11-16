package typings
package cordovaDashSqliteDashStorageLib.SQLitePluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SQLite extends js.Object {
  def deleteDatabase(args: DeleteArgs): scala.Unit = js.native
  def deleteDatabase(args: DeleteArgs, success: SuccessCallback): scala.Unit = js.native
  def deleteDatabase(args: DeleteArgs, success: SuccessCallback, error: ErrorCallback): scala.Unit = js.native
  def echoTest(): scala.Unit = js.native
  def echoTest(ok: js.Function1[/* value */ java.lang.String, scala.Unit]): scala.Unit = js.native
  def echoTest(
    ok: js.Function1[/* value */ java.lang.String, scala.Unit],
    error: js.Function1[/* msg */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def openDatabase(args: OpenArgs): Database = js.native
  def openDatabase(args: OpenArgs, success: DatabaseSuccessCallback): Database = js.native
  def openDatabase(args: OpenArgs, success: DatabaseSuccessCallback, error: ErrorCallback): Database = js.native
  def selfTest(): scala.Unit = js.native
  def selfTest(success: SuccessCallback): scala.Unit = js.native
  def selfTest(success: SuccessCallback, error: ErrorCallback): scala.Unit = js.native
}

