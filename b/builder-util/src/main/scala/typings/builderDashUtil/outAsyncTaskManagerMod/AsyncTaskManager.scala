package typings.builderDashUtil.outAsyncTaskManagerMod

import typings.builderDashUtilDashRuntime.builderDashUtilDashRuntimeMod.CancellationToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("builder-util/out/asyncTaskManager", "AsyncTaskManager")
@js.native
class AsyncTaskManager protected () extends js.Object {
  def this(cancellationToken: CancellationToken) = this()
  val cancellationToken: js.Any = js.native
  val errors: js.Any = js.native
  val tasks: js.Array[js.Promise[_]] = js.native
  def add(task: js.Function0[js.Promise[_]]): Unit = js.native
  def addTask(promise: js.Promise[_]): Unit = js.native
  def awaitTasks(): js.Promise[js.Array[_]] = js.native
  def cancelTasks(): Unit = js.native
}

