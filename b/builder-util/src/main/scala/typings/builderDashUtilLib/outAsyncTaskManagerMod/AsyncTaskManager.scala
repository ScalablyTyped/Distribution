package typings
package builderDashUtilLib.outAsyncTaskManagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("builder-util/out/asyncTaskManager", "AsyncTaskManager")
@js.native
class AsyncTaskManager protected () extends js.Object {
  def this(cancellationToken: builderDashUtilDashRuntimeLib.builderDashUtilDashRuntimeMod.CancellationToken) = this()
  val cancellationToken: js.Any = js.native
  val errors: js.Any = js.native
  val tasks: js.Array[stdLib.Promise[_]] = js.native
  def add(task: js.Function0[stdLib.Promise[_]]): scala.Unit = js.native
  def addTask(promise: stdLib.Promise[_]): scala.Unit = js.native
  def awaitTasks(): stdLib.Promise[js.Array[_]] = js.native
  def cancelTasks(): scala.Unit = js.native
}

