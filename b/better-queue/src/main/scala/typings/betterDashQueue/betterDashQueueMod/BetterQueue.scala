package typings.betterDashQueue.betterDashQueueMod

import typings.betterDashQueue.betterDashQueueStrings.task_failed
import typings.betterDashQueue.betterDashQueueStrings.task_finish
import typings.betterDashQueue.betterDashQueueStrings.task_progress
import typings.node.NodeJS.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BetterQueue[T, K] extends EventEmitter {
  def cancel(taskId: js.Any): Unit = js.native
  def cancel(taskId: js.Any, cb: js.Function0[Unit]): Unit = js.native
  def destroy(cb: js.Function0[Unit]): Unit = js.native
  def getStats(): QueueStats = js.native
  def on(event: QueueEvent, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  @JSName("on")
  def on_taskfailed(event: task_failed, listener: js.Function2[/* taskId */ js.Any, /* errorMessage */ String, Unit]): this.type = js.native
  @JSName("on")
  def on_taskfinish(event: task_finish, listener: js.Function2[/* taskId */ js.Any, /* result */ K, Unit]): this.type = js.native
  @JSName("on")
  def on_taskprogress(
    event: task_progress,
    listener: js.Function3[/* taskId */ js.Any, /* completed */ Double, /* total */ Double, Unit]
  ): this.type = js.native
  def pause(): Unit = js.native
  def push(task: T): Ticket = js.native
  def push(task: T, cb: js.Function2[/* err */ js.Any, /* result */ K, Unit]): Ticket = js.native
  def resetStats(): Unit = js.native
  def resume(): Unit = js.native
  def use(store: Store[T]): Unit = js.native
}

