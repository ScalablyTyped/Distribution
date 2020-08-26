package typings.cordovaSqliteStorage.SQLitePlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SQLite extends js.Object {
  def deleteDatabase(args: DeleteArgs): Unit = js.native
  def deleteDatabase(args: DeleteArgs, success: js.UndefOr[scala.Nothing], error: ErrorCallback): Unit = js.native
  def deleteDatabase(args: DeleteArgs, success: SuccessCallback): Unit = js.native
  def deleteDatabase(args: DeleteArgs, success: SuccessCallback, error: ErrorCallback): Unit = js.native
  def echoTest(): Unit = js.native
  def echoTest(ok: js.UndefOr[scala.Nothing], error: js.Function1[/* msg */ String, Unit]): Unit = js.native
  def echoTest(ok: js.Function1[/* value */ String, Unit]): Unit = js.native
  def echoTest(ok: js.Function1[/* value */ String, Unit], error: js.Function1[/* msg */ String, Unit]): Unit = js.native
  def openDatabase(args: OpenArgs): Database = js.native
  def openDatabase(args: OpenArgs, success: js.UndefOr[scala.Nothing], error: ErrorCallback): Database = js.native
  def openDatabase(args: OpenArgs, success: DatabaseSuccessCallback): Database = js.native
  def openDatabase(args: OpenArgs, success: DatabaseSuccessCallback, error: ErrorCallback): Database = js.native
  def selfTest(): Unit = js.native
  def selfTest(success: js.UndefOr[scala.Nothing], error: ErrorCallback): Unit = js.native
  def selfTest(success: SuccessCallback): Unit = js.native
  def selfTest(success: SuccessCallback, error: ErrorCallback): Unit = js.native
}

